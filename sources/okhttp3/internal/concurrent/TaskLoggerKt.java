package okhttp3.internal.concurrent;

import We.s;
import androidx.media3.common.PlaybackException;
import java.util.Arrays;
import java.util.logging.Level;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes5.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? s.h((j - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS), " s ", new StringBuilder()) : j <= -999500 ? s.h((j - ((long) 500000)) / ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE), " ms", new StringBuilder()) : j <= 0 ? s.h((j - ((long) 500)) / ((long) 1000), " µs", new StringBuilder()) : j < 999500 ? s.h((j + ((long) 500)) / ((long) 1000), " µs", new StringBuilder()) : j < 999500000 ? s.h((j + ((long) 500000)) / ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE), " ms", new StringBuilder()) : s.h((j + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS), " s ", new StringBuilder())}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.Companion.getLogger().fine(taskQueue.getName$okhttp() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(Task task, TaskQueue queue, Function0<? extends T> block) {
        long jNanoTime;
        j.g(task, "task");
        j.g(queue, "queue");
        j.g(block, "block");
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t5 = (T) block.invoke();
            if (zIsLoggable) {
                log(task, queue, "finished run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            return t5;
        } catch (Throwable th2) {
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            throw th2;
        }
    }

    public static final void taskLog(Task task, TaskQueue queue, Function0<String> messageBlock) {
        j.g(task, "task");
        j.g(queue, "queue");
        j.g(messageBlock, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, (String) messageBlock.invoke());
        }
    }
}
