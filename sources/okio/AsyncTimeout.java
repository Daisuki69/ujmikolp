package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public class AsyncTimeout extends Timeout {
    private static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static AsyncTimeout head;
    private static final ReentrantLock lock;
    private AsyncTimeout next;
    private int state;
    private long timeoutAt;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void insertIntoQueue(AsyncTimeout asyncTimeout, long j, boolean z4) {
            if (AsyncTimeout.head == null) {
                AsyncTimeout.head = new AsyncTimeout();
                new Watchdog().start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z4) {
                asyncTimeout.timeoutAt = Math.min(j, asyncTimeout.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                asyncTimeout.timeoutAt = j + jNanoTime;
            } else {
                if (!z4) {
                    throw new AssertionError();
                }
                asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
            }
            long jRemainingNanos = asyncTimeout.remainingNanos(jNanoTime);
            AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
            j.d(asyncTimeout2);
            while (asyncTimeout2.next != null) {
                AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                j.d(asyncTimeout3);
                if (jRemainingNanos < asyncTimeout3.remainingNanos(jNanoTime)) {
                    break;
                }
                asyncTimeout2 = asyncTimeout2.next;
                j.d(asyncTimeout2);
            }
            asyncTimeout.next = asyncTimeout2.next;
            asyncTimeout2.next = asyncTimeout;
            if (asyncTimeout2 == AsyncTimeout.head) {
                getCondition().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeFromQueue(AsyncTimeout asyncTimeout) {
            for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                if (asyncTimeout2.next == asyncTimeout) {
                    asyncTimeout2.next = asyncTimeout.next;
                    asyncTimeout.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final AsyncTimeout awaitTimeout() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            j.d(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                getCondition().await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                j.d(asyncTimeout3);
                if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long jRemainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                getCondition().await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            j.d(asyncTimeout4);
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            asyncTimeout2.state = 2;
            return asyncTimeout2;
        }

        public final Condition getCondition() {
            return AsyncTimeout.condition;
        }

        public final ReentrantLock getLock() {
            return AsyncTimeout.lock;
        }

        private Companion() {
        }
    }

    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock lock;
            AsyncTimeout asyncTimeoutAwaitTimeout;
            while (true) {
                try {
                    lock = AsyncTimeout.Companion.getLock();
                    lock.lock();
                    try {
                        asyncTimeoutAwaitTimeout = AsyncTimeout.Companion.awaitTimeout();
                    } finally {
                        lock.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (asyncTimeoutAwaitTimeout == AsyncTimeout.head) {
                    Companion unused2 = AsyncTimeout.Companion;
                    AsyncTimeout.head = null;
                    return;
                } else {
                    Unit unit = Unit.f18162a;
                    lock.unlock();
                    if (asyncTimeoutAwaitTimeout != null) {
                        asyncTimeoutAwaitTimeout.timedOut();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: okio.AsyncTimeout$sink$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Sink, AutoCloseable {
        final /* synthetic */ Sink $sink;

        public AnonymousClass1(Sink sink) {
            this.$sink = sink;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Sink sink = this.$sink;
            asyncTimeout.enter();
            try {
                sink.close();
                Unit unit = Unit.f18162a;
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Sink sink = this.$sink;
            asyncTimeout.enter();
            try {
                sink.flush();
                Unit unit = Unit.f18162a;
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.$sink + ')';
        }

        @Override // okio.Sink
        public void write(Buffer source, long j) throws IOException {
            j.g(source, "source");
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j);
            while (true) {
                long j6 = 0;
                if (j <= 0) {
                    return;
                }
                Segment segment = source.head;
                j.d(segment);
                while (true) {
                    if (j6 >= 65536) {
                        break;
                    }
                    j6 += (long) (segment.limit - segment.pos);
                    if (j6 >= j) {
                        j6 = j;
                        break;
                    } else {
                        segment = segment.next;
                        j.d(segment);
                    }
                }
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink = this.$sink;
                asyncTimeout.enter();
                try {
                    try {
                        sink.write(source, j6);
                        Unit unit = Unit.f18162a;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        j -= j6;
                    } catch (IOException e) {
                        if (!asyncTimeout.exit()) {
                            throw e;
                        }
                        throw asyncTimeout.access$newTimeoutException(e);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }
        }

        @Override // okio.Sink
        public AsyncTimeout timeout() {
            return AsyncTimeout.this;
        }
    }

    /* JADX INFO: renamed from: okio.AsyncTimeout$source$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19911 implements Source, AutoCloseable {
        final /* synthetic */ Source $source;

        public C19911(Source source) {
            this.$source = source;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Source source = this.$source;
            asyncTimeout.enter();
            try {
                source.close();
                Unit unit = Unit.f18162a;
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) throws IOException {
            j.g(sink, "sink");
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Source source = this.$source;
            asyncTimeout.enter();
            try {
                long j6 = source.read(sink, j);
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
                return j6;
            } catch (IOException e) {
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                asyncTimeout.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.$source + ')';
        }

        @Override // okio.Source
        public AsyncTimeout timeout() {
            return AsyncTimeout.this;
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        j.f(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // okio.Timeout
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                Companion.removeFromQueue(this);
                this.state = 3;
            }
            Unit unit = Unit.f18162a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                Companion.insertIntoQueue(this, jTimeoutNanos, zHasDeadline);
                Unit unit = Unit.f18162a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            Companion.removeFromQueue(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Sink sink(Sink sink) {
        j.g(sink, "sink");
        return new AnonymousClass1(sink);
    }

    public final Source source(Source source) {
        j.g(source, "source");
        return new C19911(source);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(Function0<? extends T> block) throws IOException {
        j.g(block, "block");
        enter();
        try {
            T t5 = (T) block.invoke();
            if (exit()) {
                throw access$newTimeoutException(null);
            }
            return t5;
        } catch (IOException e) {
            if (exit()) {
                throw access$newTimeoutException(e);
            }
            throw e;
        } finally {
            exit();
        }
    }
}
