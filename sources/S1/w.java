package S1;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f5630a;

    public w(F f) {
        this.f5630a = f;
    }

    public static void a(w wVar, Thread thread) {
        wVar.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f5630a.toString();
    }
}
