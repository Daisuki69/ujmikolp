package Ij;

import Bj.A;
import Bj.AbstractC0140f0;
import Gj.u;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC0140f0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2362a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f2363b;

    static {
        l lVar = l.f2372a;
        int i = u.f2033a;
        if (64 >= i) {
            i = 64;
        }
        f2363b = A.limitedParallelism$default(lVar, Gj.a.i(i, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // Bj.A
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        f2363b.dispatch(coroutineContext, runnable);
    }

    @Override // Bj.A
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        f2363b.dispatchYield(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(kotlin.coroutines.g.f18170a, runnable);
    }

    @Override // Bj.A
    public final A limitedParallelism(int i, String str) {
        return l.f2372a.limitedParallelism(i, str);
    }

    @Override // Bj.AbstractC0140f0
    public final Executor t() {
        return this;
    }

    @Override // Bj.A
    public final String toString() {
        return "Dispatchers.IO";
    }
}
