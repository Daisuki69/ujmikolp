package androidx.work;

import Bj.A;
import Bj.H;
import androidx.tracing.Trace;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationKt {
    public static final int DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor asExecutor(CoroutineContext coroutineContext) {
        d dVar = coroutineContext != null ? (d) coroutineContext.get(d.f18169N) : null;
        A a8 = dVar instanceof A ? (A) dVar : null;
        if (a8 != null) {
            return H.f(a8);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor createDefaultExecutor(final boolean z4) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            private final AtomicInteger threadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                j.g(runnable, "runnable");
                StringBuilder sbW = androidx.camera.core.impl.a.w(z4 ? "WM.task-" : "androidx.work-");
                sbW.append(this.threadCount.incrementAndGet());
                return new Thread(runnable, sbW.toString());
            }
        });
        j.f(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tracer createDefaultTracer() {
        return new Tracer() { // from class: androidx.work.ConfigurationKt$createDefaultTracer$tracer$1
            @Override // androidx.work.Tracer
            public void beginAsyncSection(String methodName, int i) {
                j.g(methodName, "methodName");
                Trace.beginAsyncSection(methodName, i);
            }

            @Override // androidx.work.Tracer
            public void beginSection(String label) {
                j.g(label, "label");
                Trace.beginSection(label);
            }

            @Override // androidx.work.Tracer
            public void endAsyncSection(String methodName, int i) {
                j.g(methodName, "methodName");
                Trace.endAsyncSection(methodName, i);
            }

            @Override // androidx.work.Tracer
            public void endSection() {
                Trace.endSection();
            }

            @Override // androidx.work.Tracer
            public boolean isEnabled() {
                return Trace.isEnabled();
            }
        };
    }
}
