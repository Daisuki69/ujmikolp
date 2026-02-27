package Gj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2018a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new l(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2018a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            int iA = lVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                l lVarC = lVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2018a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar.b()) {
                return;
            }
            l lVarC = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }

    public final int c() {
        l lVar = (l) f2018a.get(this);
        lVar.getClass();
        long j = l.f.get(lVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2018a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            Object objD = lVar.d();
            if (objD != l.f2020g) {
                return objD;
            }
            l lVarC = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }
}
