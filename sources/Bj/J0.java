package Bj;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class J0 extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J0 f596a = new J0();

    @Override // Bj.A
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        N0 n02 = (N0) coroutineContext.get(N0.f600b);
        if (n02 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        n02.f601a = true;
    }

    @Override // Bj.A
    public final A limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // Bj.A
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
