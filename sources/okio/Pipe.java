package okio;

import androidx.camera.core.impl.a;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private final Condition condition;
    private Sink foldedSink;
    private final ReentrantLock lock;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    /* JADX INFO: renamed from: okio.Pipe$sink$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Sink, AutoCloseable {
        private final Timeout timeout = new Timeout();

        public AnonymousClass1() {
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                if (pipe.getSinkClosed$okio()) {
                    lock.unlock();
                    return;
                }
                Sink foldedSink$okio = pipe.getFoldedSink$okio();
                if (foldedSink$okio == null) {
                    if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    pipe.setSinkClosed$okio(true);
                    pipe.getCondition().signalAll();
                    foldedSink$okio = null;
                }
                Unit unit = Unit.f18162a;
                lock.unlock();
                if (foldedSink$okio != null) {
                    Pipe pipe2 = Pipe.this;
                    Timeout timeout = foldedSink$okio.timeout();
                    Timeout timeout2 = pipe2.sink().timeout();
                    long jTimeoutNanos = timeout.timeoutNanos();
                    long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(jMinTimeout, timeUnit);
                    if (!timeout.hasDeadline()) {
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink$okio.close();
                            timeout.timeout(jTimeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                            }
                            throw th2;
                        }
                    }
                    long jDeadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink$okio.close();
                        timeout.timeout(jTimeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                    } catch (Throwable th3) {
                        timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                lock.unlock();
                throw th4;
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                if (pipe.getSinkClosed$okio()) {
                    throw new IllegalStateException("closed");
                }
                if (pipe.getCanceled$okio()) {
                    throw new IOException("canceled");
                }
                Sink foldedSink$okio = pipe.getFoldedSink$okio();
                if (foldedSink$okio == null) {
                    if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    foldedSink$okio = null;
                }
                Unit unit = Unit.f18162a;
                lock.unlock();
                if (foldedSink$okio != null) {
                    Pipe pipe2 = Pipe.this;
                    Timeout timeout = foldedSink$okio.timeout();
                    Timeout timeout2 = pipe2.sink().timeout();
                    long jTimeoutNanos = timeout.timeoutNanos();
                    long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(jMinTimeout, timeUnit);
                    if (!timeout.hasDeadline()) {
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink$okio.flush();
                            timeout.timeout(jTimeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                            }
                            throw th2;
                        }
                    }
                    long jDeadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink$okio.flush();
                        timeout.timeout(jTimeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                    } catch (Throwable th3) {
                        timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                lock.unlock();
                throw th4;
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        
            r1 = kotlin.Unit.f18162a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
        
            r0.unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        
            if (r2 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        
            r0 = r12.this$0;
            r1 = r2.timeout();
            r0 = r0.sink().timeout();
            r3 = r1.timeoutNanos();
            r5 = okio.Timeout.Companion.minTimeout(r0.timeoutNanos(), r1.timeoutNanos());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r1.timeout(r5, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
        
            if (r1.hasDeadline() == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
        
            r5 = r1.deadlineNanoTime();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
        
            if (r0.hasDeadline() == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        
            r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
        
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
        
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        
            if (r0.hasDeadline() == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
        
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
        
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
        
            if (r0.hasDeadline() != false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
        
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
        
            if (r0.hasDeadline() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
        
            r1.deadlineNanoTime(r0.deadlineNanoTime());
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
        
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
        
            if (r0.hasDeadline() == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
        
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
        
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
        
            if (r0.hasDeadline() != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
        
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        
            return;
         */
        @Override // okio.Sink
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void write(okio.Buffer r13, long r14) {
            /*
                Method dump skipped, instruction units count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Pipe.AnonymousClass1.write(okio.Buffer, long):void");
        }
    }

    /* JADX INFO: renamed from: okio.Pipe$source$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19931 implements Source, AutoCloseable {
        private final Timeout timeout = new Timeout();

        public C19931() {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                pipe.setSourceClosed$okio(true);
                pipe.getCondition().signalAll();
                Unit unit = Unit.f18162a;
            } finally {
                lock.unlock();
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            j.g(sink, "sink");
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                if (pipe.getSourceClosed$okio()) {
                    throw new IllegalStateException("closed");
                }
                if (pipe.getCanceled$okio()) {
                    throw new IOException("canceled");
                }
                while (pipe.getBuffer$okio().size() == 0) {
                    if (pipe.getSinkClosed$okio()) {
                        lock.unlock();
                        return -1L;
                    }
                    this.timeout.awaitSignal(pipe.getCondition());
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                }
                long j6 = pipe.getBuffer$okio().read(sink, j);
                pipe.getCondition().signalAll();
                lock.unlock();
                return j6;
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    public Pipe(long j) {
        this.maxBufferSize = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        j.f(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
        if (j < 1) {
            throw new IllegalArgumentException(a.f(j, "maxBufferSize < 1: ").toString());
        }
        this.sink = new AnonymousClass1();
        this.source = new C19931();
    }

    private final void forward(Sink sink, Function1<? super Sink, Unit> function1) {
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long jTimeoutNanos = timeout.timeoutNanos();
        long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(jMinTimeout, timeUnit);
        if (!timeout.hasDeadline()) {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                function1.invoke(sink);
                Unit unit = Unit.f18162a;
                timeout.timeout(jTimeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                    return;
                }
                return;
            } catch (Throwable th2) {
                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                throw th2;
            }
        }
        long jDeadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            function1.invoke(sink);
            Unit unit2 = Unit.f18162a;
            timeout.timeout(jTimeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
        } catch (Throwable th3) {
            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name */
    public final Sink m419deprecated_sink() {
        return this.sink;
    }

    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name */
    public final Source m420deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            Unit unit = Unit.f18162a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        kotlin.jvm.internal.j.n("sinkBuffer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fold(okio.Sink r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.j.g(r9, r0)
        L5:
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            r0.lock()
            okio.Sink r1 = r8.foldedSink     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L7e
            boolean r1 = r8.canceled     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L74
            boolean r1 = r8.sinkClosed     // Catch: java.lang.Throwable -> L25
            okio.Buffer r2 = r8.buffer     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.exhausted()     // Catch: java.lang.Throwable -> L25
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L27
            r8.sourceClosed = r4     // Catch: java.lang.Throwable -> L25
            r8.foldedSink = r9     // Catch: java.lang.Throwable -> L25
            r2 = r3
            r5 = r4
            goto L3b
        L25:
            r9 = move-exception
            goto L86
        L27:
            okio.Buffer r2 = new okio.Buffer     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            okio.Buffer r5 = r8.buffer     // Catch: java.lang.Throwable -> L25
            long r6 = r5.size()     // Catch: java.lang.Throwable -> L25
            r2.write(r5, r6)     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.locks.Condition r5 = r8.condition     // Catch: java.lang.Throwable -> L25
            r5.signalAll()     // Catch: java.lang.Throwable -> L25
            r5 = 0
        L3b:
            kotlin.Unit r6 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L25
            r0.unlock()
            if (r5 == 0) goto L48
            if (r1 == 0) goto L47
            r9.close()
        L47:
            return
        L48:
            if (r2 == 0) goto L57
            long r0 = r2.size()     // Catch: java.lang.Throwable -> L55
            r9.write(r2, r0)     // Catch: java.lang.Throwable -> L55
            r9.flush()     // Catch: java.lang.Throwable -> L55
            goto L5
        L55:
            r9 = move-exception
            goto L5d
        L57:
            java.lang.String r9 = "sinkBuffer"
            kotlin.jvm.internal.j.n(r9)     // Catch: java.lang.Throwable -> L55
            throw r3     // Catch: java.lang.Throwable -> L55
        L5d:
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            r0.lock()
            r8.sourceClosed = r4     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.locks.Condition r1 = r8.condition     // Catch: java.lang.Throwable -> L6f
            r1.signalAll()     // Catch: java.lang.Throwable -> L6f
            kotlin.Unit r1 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L6f
            r0.unlock()
            throw r9
        L6f:
            r9 = move-exception
            r0.unlock()
            throw r9
        L74:
            r8.foldedSink = r9     // Catch: java.lang.Throwable -> L25
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "canceled"
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L7e:
            java.lang.String r9 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L25
        L86:
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Pipe.fold(okio.Sink):void");
    }

    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z4) {
        this.canceled = z4;
    }

    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z4) {
        this.sinkClosed = z4;
    }

    public final void setSourceClosed$okio(boolean z4) {
        this.sourceClosed = z4;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }
}
