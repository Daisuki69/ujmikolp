package Bj;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f602a;

    public T(A a8) {
        this.f602a = a8;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f18170a;
        A a8 = this.f602a;
        if (a8.isDispatchNeeded(gVar)) {
            a8.dispatch(gVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f602a.toString();
    }
}
