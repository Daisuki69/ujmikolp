package Ij;

import Bj.A;
import Gj.n;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f2372a = new l();

    @Override // Bj.A
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        e.f2364b.f2366a.c(runnable, true, false);
    }

    @Override // Bj.A
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        e.f2364b.f2366a.c(runnable, true, true);
    }

    @Override // Bj.A
    public final A limitedParallelism(int i, String str) {
        Gj.a.a(i);
        return i >= k.f2371d ? str != null ? new n(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // Bj.A
    public final String toString() {
        return "Dispatchers.IO";
    }
}
