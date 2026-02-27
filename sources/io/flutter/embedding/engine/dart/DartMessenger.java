package io.flutter.embedding.engine.dart;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.tracing.Trace;
import d4.AbstractC1331a;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import og.C1978b;
import pg.InterfaceC2043f;
import pg.g;
import pg.h;
import pg.i;
import pg.j;

/* JADX INFO: loaded from: classes4.dex */
class DartMessenger implements j, PlatformMessageHandler {
    private static final String TAG = "DartMessenger";

    @NonNull
    private Map<String, List<BufferedMessageInfo>> bufferedMessages;

    @NonNull
    private WeakHashMap<h, DartMessengerTaskQueue> createdTaskQueues;

    @NonNull
    private final AtomicBoolean enableBufferingIncomingMessages;

    @NonNull
    private final FlutterJNI flutterJNI;

    @NonNull
    private final Object handlersLock;

    @NonNull
    private final Map<String, HandlerInfo> messageHandlers;
    private int nextReplyId;

    @NonNull
    private final Map<Integer, g> pendingReplies;

    @NonNull
    private final DartMessengerTaskQueue platformTaskQueue;

    @NonNull
    private TaskQueueFactory taskQueueFactory;

    public static class BufferedMessageInfo {

        @NonNull
        public final ByteBuffer message;
        long messageData;
        int replyId;

        public BufferedMessageInfo(@NonNull ByteBuffer byteBuffer, int i, long j) {
            this.message = byteBuffer;
            this.replyId = i;
            this.messageData = j;
        }
    }

    public static class ConcurrentTaskQueue implements DartMessengerTaskQueue {

        @NonNull
        private final ExecutorService executor;

        public ConcurrentTaskQueue(ExecutorService executorService) {
            this.executor = executorService;
        }

        @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
        public void dispatch(@NonNull Runnable runnable) {
            this.executor.execute(runnable);
        }
    }

    public interface DartMessengerTaskQueue {
        void dispatch(@NonNull Runnable runnable);
    }

    public static class DefaultTaskQueueFactory implements TaskQueueFactory {
        ExecutorService executorService = C1978b.a().f18849d;

        @Override // io.flutter.embedding.engine.dart.DartMessenger.TaskQueueFactory
        public DartMessengerTaskQueue makeBackgroundTaskQueue(i iVar) {
            iVar.getClass();
            return new SerialTaskQueue(this.executorService);
        }
    }

    public static class HandlerInfo {

        @NonNull
        public final InterfaceC2043f handler;

        @Nullable
        public final DartMessengerTaskQueue taskQueue;

        public HandlerInfo(@NonNull InterfaceC2043f interfaceC2043f, @Nullable DartMessengerTaskQueue dartMessengerTaskQueue) {
            this.handler = interfaceC2043f;
            this.taskQueue = dartMessengerTaskQueue;
        }
    }

    public static class Reply implements g {
        private final AtomicBoolean done = new AtomicBoolean(false);

        @NonNull
        private final FlutterJNI flutterJNI;
        private final int replyId;

        public Reply(@NonNull FlutterJNI flutterJNI, int i) {
            this.flutterJNI = flutterJNI;
            this.replyId = i;
        }

        @Override // pg.g
        public void reply(@Nullable ByteBuffer byteBuffer) {
            if (this.done.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.flutterJNI.invokePlatformMessageEmptyResponseCallback(this.replyId);
            } else {
                this.flutterJNI.invokePlatformMessageResponseCallback(this.replyId, byteBuffer, byteBuffer.position());
            }
        }
    }

    public static class SerialTaskQueue implements DartMessengerTaskQueue {

        @NonNull
        private final ExecutorService executor;

        @NonNull
        private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<>();

        @NonNull
        private final AtomicBoolean isRunning = new AtomicBoolean(false);

        public SerialTaskQueue(ExecutorService executorService) {
            this.executor = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: flush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void lambda$flush$1() {
            if (this.isRunning.compareAndSet(false, true)) {
                try {
                    Runnable runnablePoll = this.queue.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    }
                } finally {
                    this.isRunning.set(false);
                    if (!this.queue.isEmpty()) {
                        this.executor.execute(new b(this, 1));
                    }
                }
            }
        }

        @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
        public void dispatch(@NonNull Runnable runnable) {
            this.queue.add(runnable);
            this.executor.execute(new b(this, 0));
        }
    }

    public interface TaskQueueFactory {
        DartMessengerTaskQueue makeBackgroundTaskQueue(i iVar);
    }

    public static class TaskQueueToken implements h {
        private TaskQueueToken() {
        }
    }

    public DartMessenger(@NonNull FlutterJNI flutterJNI, @NonNull TaskQueueFactory taskQueueFactory) {
        this.messageHandlers = new HashMap();
        this.bufferedMessages = new HashMap();
        this.handlersLock = new Object();
        this.enableBufferingIncomingMessages = new AtomicBoolean(false);
        this.pendingReplies = new HashMap();
        this.nextReplyId = 1;
        this.platformTaskQueue = new PlatformTaskQueue();
        this.createdTaskQueues = new WeakHashMap<>();
        this.flutterJNI = flutterJNI;
        this.taskQueueFactory = taskQueueFactory;
    }

    private void dispatchMessageToQueue(@NonNull final String str, @Nullable final HandlerInfo handlerInfo, @Nullable final ByteBuffer byteBuffer, final int i, final long j) {
        DartMessengerTaskQueue dartMessengerTaskQueue = handlerInfo != null ? handlerInfo.taskQueue : null;
        Trace.beginAsyncSection(ug.a.b("PlatformChannel ScheduleHandler on " + str), i);
        Runnable runnable = new Runnable() { // from class: io.flutter.embedding.engine.dart.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f17160a.lambda$dispatchMessageToQueue$0(str, i, handlerInfo, byteBuffer, j);
            }
        };
        if (dartMessengerTaskQueue == null) {
            dartMessengerTaskQueue = this.platformTaskQueue;
        }
        dartMessengerTaskQueue.dispatch(runnable);
    }

    private static void handleError(Error error) {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
    }

    private void invokeHandler(@Nullable HandlerInfo handlerInfo, @Nullable ByteBuffer byteBuffer, int i) {
        if (handlerInfo == null) {
            this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
            return;
        }
        try {
            handlerInfo.handler.onMessage(byteBuffer, new Reply(this.flutterJNI, i));
        } catch (Error e) {
            handleError(e);
        } catch (Exception e7) {
            Log.e(TAG, "Uncaught exception in binary message listener", e7);
            this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dispatchMessageToQueue$0(String str, int i, HandlerInfo handlerInfo, ByteBuffer byteBuffer, long j) {
        Trace.endAsyncSection(ug.a.b("PlatformChannel ScheduleHandler on " + str), i);
        try {
            ug.a.c("DartMessenger#handleMessageFromDart on " + str);
            try {
                invokeHandler(handlerInfo, byteBuffer, i);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                Trace.endSection();
            } finally {
            }
        } finally {
            this.flutterJNI.cleanupMessageData(j);
        }
    }

    public void disableBufferingIncomingMessages() {
        Map<String, List<BufferedMessageInfo>> map;
        synchronized (this.handlersLock) {
            this.enableBufferingIncomingMessages.set(false);
            map = this.bufferedMessages;
            this.bufferedMessages = new HashMap();
        }
        for (Map.Entry<String, List<BufferedMessageInfo>> entry : map.entrySet()) {
            for (BufferedMessageInfo bufferedMessageInfo : entry.getValue()) {
                dispatchMessageToQueue(entry.getKey(), null, bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
            }
        }
    }

    public void enableBufferingIncomingMessages() {
        this.enableBufferingIncomingMessages.set(true);
    }

    @UiThread
    public int getPendingChannelResponseCount() {
        return this.pendingReplies.size();
    }

    @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
    public void handleMessageFromDart(@NonNull String str, @Nullable ByteBuffer byteBuffer, int i, long j) {
        HandlerInfo handlerInfo;
        boolean z4;
        synchronized (this.handlersLock) {
            try {
                handlerInfo = this.messageHandlers.get(str);
                z4 = this.enableBufferingIncomingMessages.get() && handlerInfo == null;
                if (z4) {
                    if (!this.bufferedMessages.containsKey(str)) {
                        this.bufferedMessages.put(str, new LinkedList());
                    }
                    this.bufferedMessages.get(str).add(new BufferedMessageInfo(byteBuffer, i, j));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z4) {
            return;
        }
        dispatchMessageToQueue(str, handlerInfo, byteBuffer, i, j);
    }

    @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
    public void handlePlatformMessageResponse(int i, @Nullable ByteBuffer byteBuffer) {
        g gVarRemove = this.pendingReplies.remove(Integer.valueOf(i));
        if (gVarRemove != null) {
            try {
                gVarRemove.reply(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e) {
                handleError(e);
            } catch (Exception e7) {
                Log.e(TAG, "Uncaught exception in binary message reply handler", e7);
            }
        }
    }

    @Override // pg.j
    @UiThread
    public /* bridge */ /* synthetic */ h makeBackgroundTaskQueue() {
        return AbstractC1331a.b(this);
    }

    @Override // pg.j
    @UiThread
    public void send(@NonNull String str, @NonNull ByteBuffer byteBuffer) {
        send(str, byteBuffer, null);
    }

    @Override // pg.j
    public void setMessageHandler(@NonNull String str, @Nullable InterfaceC2043f interfaceC2043f) {
        setMessageHandler(str, interfaceC2043f, null);
    }

    @Override // pg.j
    public h makeBackgroundTaskQueue(i iVar) {
        DartMessengerTaskQueue dartMessengerTaskQueueMakeBackgroundTaskQueue = this.taskQueueFactory.makeBackgroundTaskQueue(iVar);
        TaskQueueToken taskQueueToken = new TaskQueueToken();
        this.createdTaskQueues.put(taskQueueToken, dartMessengerTaskQueueMakeBackgroundTaskQueue);
        return taskQueueToken;
    }

    @Override // pg.j
    public void send(@NonNull String str, @Nullable ByteBuffer byteBuffer, @Nullable g gVar) {
        ug.a.c("DartMessenger#send on " + str);
        try {
            int i = this.nextReplyId;
            this.nextReplyId = i + 1;
            if (gVar != null) {
                this.pendingReplies.put(Integer.valueOf(i), gVar);
            }
            if (byteBuffer == null) {
                this.flutterJNI.dispatchEmptyPlatformMessage(str, i);
            } else {
                this.flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
            }
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // pg.j
    public void setMessageHandler(@NonNull String str, @Nullable InterfaceC2043f interfaceC2043f, @Nullable h hVar) {
        DartMessengerTaskQueue dartMessengerTaskQueue;
        if (interfaceC2043f == null) {
            synchronized (this.handlersLock) {
                this.messageHandlers.remove(str);
            }
            return;
        }
        if (hVar != null) {
            dartMessengerTaskQueue = this.createdTaskQueues.get(hVar);
            if (dartMessengerTaskQueue == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dartMessengerTaskQueue = null;
        }
        synchronized (this.handlersLock) {
            try {
                this.messageHandlers.put(str, new HandlerInfo(interfaceC2043f, dartMessengerTaskQueue));
                List<BufferedMessageInfo> listRemove = this.bufferedMessages.remove(str);
                if (listRemove == null) {
                    return;
                }
                for (BufferedMessageInfo bufferedMessageInfo : listRemove) {
                    dispatchMessageToQueue(str, this.messageHandlers.get(str), bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public DartMessenger(@NonNull FlutterJNI flutterJNI) {
        this(flutterJNI, new DefaultTaskQueueFactory());
    }
}
