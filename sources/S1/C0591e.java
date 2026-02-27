package S1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: S1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0591e extends of.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5611d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5612g;
    public final AtomicReferenceFieldUpdater h;

    public C0591e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5611d = atomicReferenceFieldUpdater;
        this.e = atomicReferenceFieldUpdater2;
        this.f = atomicReferenceFieldUpdater3;
        this.f5612g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // of.p
    public final void A(o oVar, Thread thread) {
        this.f5611d.lazySet(oVar, thread);
    }

    @Override // of.p
    public final boolean i(p pVar, C0590d c0590d, C0590d c0590d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5612g;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, c0590d, c0590d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == c0590d);
        return false;
    }

    @Override // of.p
    public final boolean j(p pVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == obj);
        return false;
    }

    @Override // of.p
    public final boolean k(p pVar, o oVar, o oVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, oVar, oVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == oVar);
        return false;
    }

    @Override // of.p
    public final C0590d q(p pVar) {
        return (C0590d) this.f5612g.getAndSet(pVar, C0590d.f5608d);
    }

    @Override // of.p
    public final o r(p pVar) {
        return (o) this.f.getAndSet(pVar, o.c);
    }

    @Override // of.p
    public final void z(o oVar, o oVar2) {
        this.e.lazySet(oVar, oVar2);
    }
}
