package Dj;

import Bj.AbstractC0129a;
import Bj.H;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends AbstractC0129a implements r, i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1200d;

    public q(CoroutineContext coroutineContext, e eVar, boolean z4, boolean z5) {
        super(coroutineContext, z4, z5);
        this.f1200d = eVar;
    }

    @Override // Bj.u0
    public final void C(CancellationException cancellationException) {
        this.f1200d.g(cancellationException, true);
        B(cancellationException);
    }

    @Override // Bj.u0, Bj.InterfaceC0156n0
    public final void b(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(E(), null, this);
        }
        C(cancellationException);
    }

    @Override // Dj.t
    public final Object d(Fj.r rVar) {
        e eVar = this.f1200d;
        eVar.getClass();
        Object objC = e.C(eVar, rVar);
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objC;
    }

    @Override // Bj.AbstractC0129a
    public final void h0(Throwable th2, boolean z4) {
        if (this.f1200d.g(th2, false) || z4) {
            return;
        }
        H.r(this.c, th2);
    }

    @Override // Bj.AbstractC0129a
    public final void i0(Object obj) {
        this.f1200d.o(null);
    }

    @Override // Dj.t
    public final b iterator() {
        e eVar = this.f1200d;
        eVar.getClass();
        return new b(eVar);
    }

    @Override // Dj.u
    public Object j(Object obj) {
        return this.f1200d.j(obj);
    }

    public final void k0(Ag.q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar = this.f1200d;
        eVar.getClass();
        do {
            atomicReferenceFieldUpdater = e.j;
            if (atomicReferenceFieldUpdater.compareAndSet(eVar, null, qVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(eVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            Gj.t tVar = g.f1186q;
            if (obj != tVar) {
                if (obj == g.f1187r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            Gj.t tVar2 = g.f1187r;
            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, tVar, tVar2)) {
                if (atomicReferenceFieldUpdater.get(eVar) != tVar) {
                    break;
                }
            }
            qVar.invoke(eVar.p());
            return;
        }
    }

    @Override // Dj.u
    public Object m(InterfaceC1526a interfaceC1526a, Object obj) {
        return this.f1200d.m(interfaceC1526a, obj);
    }

    @Override // Dj.t
    public final Object n() {
        return this.f1200d.n();
    }

    @Override // Dj.u
    public boolean o(Throwable th2) {
        return this.f1200d.g(th2, false);
    }

    @Override // Dj.t
    public final Object s(AbstractC1609c abstractC1609c) {
        return this.f1200d.s(abstractC1609c);
    }
}
