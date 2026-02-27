package Ij;

import Bj.AbstractC0140f0;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends AbstractC0140f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f2366a;

    @Override // Bj.A
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        c.f(this.f2366a, runnable, 6);
    }

    @Override // Bj.A
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        c.f(this.f2366a, runnable, 2);
    }

    @Override // Bj.AbstractC0140f0
    public final Executor t() {
        return this.f2366a;
    }
}
