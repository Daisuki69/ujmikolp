package Kj;

import Bj.C0151l;
import Bj.InterfaceC0147j;
import Bj.M0;
import Gj.r;
import Gj.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import qj.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements InterfaceC0147j, M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0151l f2778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2779b;

    public c(d dVar, C0151l c0151l) {
        this.f2779b = dVar;
        this.f2778a = c0151l;
    }

    @Override // Bj.InterfaceC0147j
    public final boolean a(Throwable th2) {
        return this.f2778a.a(th2);
    }

    @Override // Bj.M0
    public final void b(r rVar, int i) {
        this.f2778a.b(rVar, i);
    }

    @Override // Bj.InterfaceC0147j
    public final void e(Object obj, n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.h;
        d dVar = this.f2779b;
        atomicReferenceFieldUpdater.set(dVar, null);
        C7.f fVar = new C7.f(5, dVar, this);
        this.f2778a.A(fVar, (Unit) obj);
    }

    @Override // gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        return this.f2778a.e;
    }

    @Override // Bj.InterfaceC0147j
    public final t l(Object obj, n nVar) {
        final d dVar = this.f2779b;
        n nVar2 = new n() { // from class: Kj.b
            @Override // qj.n
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.h;
                this.getClass();
                d dVar2 = dVar;
                atomicReferenceFieldUpdater.set(dVar2, null);
                dVar2.f(null);
                return Unit.f18162a;
            }
        };
        t tVarE = this.f2778a.E((Unit) obj, nVar2);
        if (tVarE != null) {
            d.h.set(dVar, null);
        }
        return tVarE;
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        this.f2778a.resumeWith(obj);
    }

    @Override // Bj.InterfaceC0147j
    public final void u(Object obj) {
        this.f2778a.u(obj);
    }
}
