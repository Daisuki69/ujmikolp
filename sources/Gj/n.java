package Gj;

import Bj.A;
import Bj.C0151l;
import Bj.G0;
import Bj.J;
import Bj.M;
import Bj.W;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends A implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f2025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f2026b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public n(A a8, String str) {
        M m = a8 instanceof M ? (M) a8 : null;
        this.f2025a = m == null ? J.f595a : m;
        this.f2026b = a8;
        this.c = str;
    }

    @Override // Bj.A
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.f2026b.dispatch(coroutineContext, runnable);
    }

    @Override // Bj.A
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        this.f2026b.dispatchYield(coroutineContext, runnable);
    }

    @Override // Bj.A
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return this.f2026b.isDispatchNeeded(coroutineContext);
    }

    @Override // Bj.M
    public final void m(long j, C0151l c0151l) {
        this.f2025a.m(j, c0151l);
    }

    @Override // Bj.M
    public final W r(long j, G0 g02, CoroutineContext coroutineContext) {
        return this.f2025a.r(j, g02, coroutineContext);
    }

    @Override // Bj.A
    public final String toString() {
        return this.c;
    }
}
