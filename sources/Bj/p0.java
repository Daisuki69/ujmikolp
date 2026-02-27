package Bj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p0 extends Gj.i implements W, InterfaceC0148j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f631d;

    @Override // Bj.InterfaceC0148j0
    public final x0 b() {
        return null;
    }

    @Override // Bj.W
    public final void dispose() {
        u0 u0VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u0.f643a;
            Object obj = atomicReferenceFieldUpdater.get(u0VarH);
            if (obj instanceof p0) {
                if (obj != this) {
                    return;
                }
                Y y7 = H.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(u0VarH, obj, y7)) {
                    if (atomicReferenceFieldUpdater.get(u0VarH) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC0148j0) || ((InterfaceC0148j0) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Gj.i.f2016a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof Gj.o) {
                    Gj.i iVar = ((Gj.o) obj2).f2027a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                Gj.i iVar2 = (Gj.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = Gj.i.c;
                Gj.o oVar = (Gj.o) atomicReferenceFieldUpdater3.get(iVar2);
                if (oVar == null) {
                    oVar = new Gj.o(iVar2);
                    atomicReferenceFieldUpdater3.set(iVar2, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                iVar2.d();
                return;
            }
        }
    }

    public InterfaceC0156n0 getParent() {
        return h();
    }

    public final u0 h() {
        u0 u0Var = this.f631d;
        if (u0Var != null) {
            return u0Var;
        }
        kotlin.jvm.internal.j.n("job");
        throw null;
    }

    public abstract boolean i();

    @Override // Bj.InterfaceC0148j0
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th2);

    @Override // Gj.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + H.o(this) + "[job@" + H.o(h()) + ']';
    }
}
