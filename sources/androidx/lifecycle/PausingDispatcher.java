package androidx.lifecycle;

import Bj.A;
import Bj.U;
import Gj.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcher extends A {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // Bj.A
    public void dispatch(CoroutineContext context, Runnable block) {
        j.g(context, "context");
        j.g(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // Bj.A
    public boolean isDispatchNeeded(CoroutineContext context) {
        j.g(context, "context");
        Ij.e eVar = U.f603a;
        if (m.f2024a.c.isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
