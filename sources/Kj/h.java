package Kj;

import Bj.C0149k;
import Bj.InterfaceC0147j;
import Bj.M0;
import Gj.r;
import Gj.t;
import We.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class h {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2783d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2784g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0149k f2786b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i, int i4) {
        this.f2785a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(s.f(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i4 < 0 || i4 > i) {
            throw new IllegalArgumentException(s.f(i, "The number of acquired permits should be in 0..").toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = i - i4;
        this.f2786b = new C0149k(this, 2);
    }

    public final boolean a(M0 m0) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        f fVar = f.f2781a;
        long j = andIncrement / ((long) i.f);
        loop0: while (true) {
            objB = Gj.a.b(jVar, j, fVar);
            if (!Gj.a.e(objB)) {
                r rVarC = Gj.a.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.c >= rVarC.c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        j jVar2 = (j) Gj.a.c(objB);
        int i = (int) (andIncrement % ((long) i.f));
        AtomicReferenceArray atomicReferenceArray = jVar2.e;
        while (!atomicReferenceArray.compareAndSet(i, null, m0)) {
            if (atomicReferenceArray.get(i) != null) {
                t tVar = i.f2788b;
                t tVar2 = i.c;
                while (!atomicReferenceArray.compareAndSet(i, tVar, tVar2)) {
                    if (atomicReferenceArray.get(i) != tVar) {
                        return false;
                    }
                }
                if (m0 instanceof InterfaceC0147j) {
                    ((InterfaceC0147j) m0).e(Unit.f18162a, this.f2786b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + m0).toString());
            }
        }
        m0.b(jVar2, i);
        return true;
    }

    public final void b() {
        int i;
        Object objB;
        boolean z4;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2784g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i4 = this.f2785a;
            if (andIncrement >= i4) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i4) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i4));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i4).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f2783d.getAndIncrement(this);
            long j = andIncrement2 / ((long) i.f);
            g gVar = g.f2782a;
            while (true) {
                objB = Gj.a.b(jVar, j, gVar);
                if (Gj.a.e(objB)) {
                    break;
                }
                r rVarC = Gj.a.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.c >= rVarC.c) {
                        break;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            }
            j jVar2 = (j) Gj.a.c(objB);
            jVar2.b();
            z4 = false;
            if (jVar2.c <= j) {
                int i6 = (int) (andIncrement2 % ((long) i.f));
                t tVar = i.f2788b;
                AtomicReferenceArray atomicReferenceArray = jVar2.e;
                Object andSet = atomicReferenceArray.getAndSet(i6, tVar);
                if (andSet == null) {
                    int i10 = i.f2787a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (atomicReferenceArray.get(i6) == i.c) {
                            z4 = true;
                            break;
                        }
                    }
                    t tVar2 = i.f2788b;
                    t tVar3 = i.f2789d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i6, tVar2, tVar3)) {
                            if (atomicReferenceArray.get(i6) != tVar2) {
                                break;
                            }
                        } else {
                            z4 = true;
                            break;
                        }
                    }
                    z4 = !z4;
                } else if (andSet != i.e) {
                    if (!(andSet instanceof InterfaceC0147j)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0147j interfaceC0147j = (InterfaceC0147j) andSet;
                    t tVarL = interfaceC0147j.l(Unit.f18162a, this.f2786b);
                    if (tVarL != null) {
                        interfaceC0147j.u(tVarL);
                        z4 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z4);
    }
}
