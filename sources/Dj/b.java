package Dj;

import Bj.C0151l;
import Bj.H;
import Bj.M0;
import bj.AbstractC1039j;
import bj.C1037h;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1166a = g.f1185p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0151l f1167b;
    public final /* synthetic */ e c;

    public b(e eVar) {
        this.c = eVar;
    }

    public final Object a(AbstractC1609c abstractC1609c) throws Throwable {
        m mVarL;
        Boolean bool;
        Object obj = this.f1166a;
        boolean z4 = true;
        if (obj == g.f1185p || obj == g.f1182l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f1174g;
            e eVar = this.c;
            m mVar = (m) atomicReferenceFieldUpdater.get(eVar);
            while (true) {
                if (eVar.w()) {
                    this.f1166a = g.f1182l;
                    Throwable thP = eVar.p();
                    if (thP != null) {
                        int i = Gj.s.f2030a;
                        throw thP;
                    }
                    z4 = false;
                } else {
                    long andIncrement = e.c.getAndIncrement(eVar);
                    long j = g.f1178b;
                    long j6 = andIncrement / j;
                    int i4 = (int) (andIncrement % j);
                    if (mVar.c != j6) {
                        mVarL = eVar.l(j6, mVar);
                        if (mVarL == null) {
                            continue;
                        }
                    } else {
                        mVarL = mVar;
                    }
                    Object objH = eVar.H(mVarL, i4, andIncrement, null);
                    Gj.t tVar = g.m;
                    if (objH == tVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    Gj.t tVar2 = g.f1184o;
                    if (objH == tVar2) {
                        if (andIncrement < eVar.t()) {
                            mVarL.b();
                        }
                        mVar = mVarL;
                    } else {
                        if (objH == g.f1183n) {
                            e eVar2 = this.c;
                            C0151l c0151lQ = H.q(hj.h.b(abstractC1609c));
                            try {
                                this.f1167b = c0151lQ;
                                Object objH2 = eVar2.H(mVarL, i4, andIncrement, this);
                                if (objH2 == tVar) {
                                    b(mVarL, i4);
                                } else {
                                    if (objH2 == tVar2) {
                                        if (andIncrement < eVar2.t()) {
                                            mVarL.b();
                                        }
                                        m mVar2 = (m) e.f1174g.get(eVar2);
                                        while (true) {
                                            if (eVar2.w()) {
                                                C0151l c0151l = this.f1167b;
                                                kotlin.jvm.internal.j.d(c0151l);
                                                this.f1167b = null;
                                                this.f1166a = g.f1182l;
                                                Throwable thP2 = eVar.p();
                                                if (thP2 == null) {
                                                    C1037h.a aVar = C1037h.f9166b;
                                                    c0151l.resumeWith(Boolean.FALSE);
                                                } else {
                                                    C1037h.a aVar2 = C1037h.f9166b;
                                                    c0151l.resumeWith(AbstractC1039j.a(thP2));
                                                }
                                            } else {
                                                long andIncrement2 = e.c.getAndIncrement(eVar2);
                                                long j7 = g.f1178b;
                                                long j9 = andIncrement2 / j7;
                                                int i6 = (int) (andIncrement2 % j7);
                                                if (mVar2.c != j9) {
                                                    m mVarL2 = eVar2.l(j9, mVar2);
                                                    if (mVarL2 != null) {
                                                        mVar2 = mVarL2;
                                                    }
                                                }
                                                Object objH3 = eVar2.H(mVar2, i6, andIncrement2, this);
                                                if (objH3 == g.m) {
                                                    b(mVar2, i6);
                                                    break;
                                                }
                                                if (objH3 == g.f1184o) {
                                                    if (andIncrement2 < eVar2.t()) {
                                                        mVar2.b();
                                                    }
                                                } else {
                                                    if (objH3 == g.f1183n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    mVar2.b();
                                                    this.f1166a = objH3;
                                                    this.f1167b = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        mVarL.b();
                                        this.f1166a = objH2;
                                        this.f1167b = null;
                                        bool = Boolean.TRUE;
                                    }
                                    c0151lQ.e(bool, null);
                                }
                                Object objQ = c0151lQ.q();
                                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                                return objQ;
                            } catch (Throwable th2) {
                                c0151lQ.z();
                                throw th2;
                            }
                        }
                        mVarL.b();
                        this.f1166a = objH;
                    }
                }
            }
        }
        return Boolean.valueOf(z4);
    }

    @Override // Bj.M0
    public final void b(Gj.r rVar, int i) {
        C0151l c0151l = this.f1167b;
        if (c0151l != null) {
            c0151l.b(rVar, i);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.f1166a;
        Gj.t tVar = g.f1185p;
        if (obj == tVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f1166a = tVar;
        if (obj != g.f1182l) {
            return obj;
        }
        Throwable thQ = this.c.q();
        int i = Gj.s.f2030a;
        throw thQ;
    }
}
