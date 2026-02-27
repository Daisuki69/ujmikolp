package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.Map;
import yf.C2531a;
import yf.m;

/* JADX INFO: loaded from: classes4.dex */
public class g extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16050b = "StructElem";

    public g(String str, h hVar) {
        super(f16050b);
        f0(str);
        d0(hVar);
    }

    private Map<String, Object> H() {
        i iVarJ = J();
        if (iVarJ != null) {
            return iVarJ.w();
        }
        return null;
    }

    private i J() {
        h hVarF = F();
        while (hVarF instanceof g) {
            hVarF = ((g) hVarF).F();
        }
        if (hVarF instanceof i) {
            return (i) hVarF;
        }
        return null;
    }

    public l<String> A() {
        yf.j jVar = yf.j.f21255v;
        l<String> lVar = new l<>();
        yf.b bVarQ = c().q(jVar);
        if (bVarQ instanceof yf.j) {
            lVar.a(((yf.j) bVarQ).f21267a, 0);
        }
        if (bVarQ instanceof C2531a) {
            String str = null;
            for (yf.b bVar : ((C2531a) bVarQ).f21151a) {
                if (bVar instanceof m) {
                    bVar = ((m) bVar).f21270a;
                }
                if (bVar instanceof yf.j) {
                    str = ((yf.j) bVar).f21267a;
                    lVar.a(str, 0);
                } else if (bVar instanceof yf.i) {
                    lVar.f(str, (int) ((yf.i) bVar).f21165a);
                }
            }
        }
        return lVar;
    }

    public String B() {
        return c().B(yf.j.u0);
    }

    public String C() {
        return c().B(yf.j.f21222g0);
    }

    public String D() {
        return c().B(yf.j.f21175E0);
    }

    public Cf.b E() {
        yf.b bVarQ = c().q(yf.j.f21209a1);
        if (bVarQ instanceof yf.d) {
            return new Cf.b((yf.d) bVarQ);
        }
        return null;
    }

    public h F() {
        yf.b bVarQ = c().q(yf.j.f21195T0);
        if (bVarQ instanceof yf.d) {
            return h.e((yf.d) bVarQ);
        }
        return null;
    }

    public int G() {
        return c().t(yf.j.f21220f1, null, 0);
    }

    public String I() {
        String strK = K();
        if (H().containsKey(strK)) {
            Object obj = H().get(strK);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return strK;
    }

    public String K() {
        return c().z(yf.j.f21235m1);
    }

    public String L() {
        return c().B(yf.j.f21254u1);
    }

    public void M() {
        e0(G() + 1);
    }

    public void N(d dVar, Object obj) {
        m(dVar, obj);
    }

    public void O(e eVar, Object obj) {
        m(eVar, obj);
    }

    public void P(yf.i iVar, Object obj) {
        l(iVar, obj);
    }

    public void Q(a aVar) {
        yf.j jVar = yf.j.e;
        yf.b bVarQ = c().q(jVar);
        if (bVarQ instanceof C2531a) {
            C2531a c2531a = (C2531a) bVarQ;
            c2531a.q(aVar.c());
            if (c2531a.f21151a.size() == 2 && c2531a.i(1, -1) == 0) {
                c().F(jVar, c2531a.k(0));
            }
        } else {
            if (bVarQ instanceof m) {
                bVarQ = ((m) bVarQ).f21270a;
            }
            if (aVar.c().equals(bVarQ)) {
                c().C(jVar);
            }
        }
        aVar.m(null);
    }

    public void R(String str) {
        if (str == null) {
            return;
        }
        yf.j jVar = yf.j.f21255v;
        yf.b bVarQ = c().q(jVar);
        yf.j jVarF = yf.j.f(str);
        if (!(bVarQ instanceof C2531a)) {
            if (bVarQ instanceof m) {
                bVarQ = ((m) bVarQ).f21270a;
            }
            if (jVarF.equals(bVarQ)) {
                c().C(jVar);
                return;
            }
            return;
        }
        C2531a c2531a = (C2531a) bVarQ;
        c2531a.q(jVarF);
        if (c2531a.f21151a.size() == 2 && c2531a.i(1, -1) == 0) {
            c().F(jVar, c2531a.k(0));
        }
    }

    public void S(d dVar) {
        p(dVar);
    }

    public void T(e eVar) {
        p(eVar);
    }

    public void U(yf.i iVar) {
        o(iVar);
    }

    public void V(String str) {
        c().H(yf.j.f, str);
    }

    public void W(String str) {
        c().H(yf.j.i, str);
    }

    public void X(l<a> lVar) {
        yf.j jVar = yf.j.e;
        if (lVar.g() == 1 && lVar.d(0) == 0) {
            a aVarB = lVar.b(0);
            aVarB.m(this);
            c().E(jVar, aVarB);
            return;
        }
        C2531a c2531a = new C2531a();
        for (int i = 0; i < lVar.g(); i++) {
            a aVarB2 = lVar.b(i);
            aVarB2.m(this);
            int iD = lVar.d(i);
            if (iD < 0) {
                throw new IllegalArgumentException("The revision number shall be > -1");
            }
            c2531a.f21151a.add(aVarB2.c());
            c2531a.f(yf.i.m(iD));
        }
        c().F(jVar, c2531a);
    }

    public void Y(l<String> lVar) {
        if (lVar == null) {
            return;
        }
        yf.j jVar = yf.j.f21255v;
        if (lVar.g() == 1 && lVar.d(0) == 0) {
            c().G(jVar, lVar.b(0));
            return;
        }
        C2531a c2531a = new C2531a();
        for (int i = 0; i < lVar.g(); i++) {
            String strB = lVar.b(i);
            int iD = lVar.d(i);
            if (iD < 0) {
                throw new IllegalArgumentException("The revision number shall be > -1");
            }
            c2531a.f(yf.j.f(strB));
            c2531a.f(yf.i.m(iD));
        }
        c().F(jVar, c2531a);
    }

    public void Z(String str) {
        c().H(yf.j.u0, str);
    }

    public void a0(String str) {
        c().H(yf.j.f21222g0, str);
    }

    public void b0(String str) {
        c().H(yf.j.f21175E0, str);
    }

    public void c0(Cf.b bVar) {
        c().E(yf.j.f21209a1, bVar);
    }

    public final void d0(h hVar) {
        c().E(yf.j.f21195T0, hVar);
    }

    public void e0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The revision number shall be > -1");
        }
        c().D(yf.j.f21220f1, i);
    }

    public final void f0(String str) {
        c().G(yf.j.f21235m1, str);
    }

    public void g0(String str) {
        c().H(yf.j.f21254u1, str);
    }

    public void r(a aVar) {
        C2531a c2531a;
        yf.j jVar = yf.j.e;
        aVar.m(this);
        yf.b bVarQ = c().q(jVar);
        if (bVarQ instanceof C2531a) {
            c2531a = (C2531a) bVarQ;
        } else {
            C2531a c2531a2 = new C2531a();
            if (bVarQ != null) {
                c2531a2.f(bVarQ);
                c2531a2.f(yf.i.m(0L));
            }
            c2531a = c2531a2;
        }
        c().F(jVar, c2531a);
        c2531a.f21151a.add(aVar.c());
        c2531a.f(yf.i.m(G()));
    }

    public void s(String str) {
        C2531a c2531a;
        if (str == null) {
            return;
        }
        yf.j jVar = yf.j.f21255v;
        yf.b bVarQ = c().q(jVar);
        if (bVarQ instanceof C2531a) {
            c2531a = (C2531a) bVarQ;
        } else {
            C2531a c2531a2 = new C2531a();
            if (bVarQ != null) {
                c2531a2.f(bVarQ);
                c2531a2.f(yf.i.m(0L));
            }
            c2531a = c2531a2;
        }
        c().F(jVar, c2531a);
        c2531a.f(yf.j.f(str));
        c2531a.f(yf.i.m(G()));
    }

    public void t(d dVar) {
        d(dVar);
    }

    public void u(e eVar) {
        d(eVar);
    }

    public void v(com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.a aVar) {
        if (aVar == null) {
            return;
        }
        b(yf.i.m(aVar.j()));
    }

    public void w(a aVar) {
        yf.j jVar = yf.j.e;
        yf.b bVarQ = c().q(jVar);
        if (!(bVarQ instanceof C2531a)) {
            C2531a c2531a = new C2531a();
            c2531a.f(bVarQ);
            c2531a.f(yf.i.m(G()));
            c().F(jVar, c2531a);
            return;
        }
        C2531a c2531a2 = (C2531a) bVarQ;
        for (int i = 0; i < c2531a2.f21151a.size(); i++) {
            if (c2531a2.k(i).equals(aVar.c())) {
                int i4 = i + 1;
                if (c2531a2.g(i4) instanceof yf.i) {
                    c2531a2.f21151a.set(i4, yf.i.m(G()));
                }
            }
        }
    }

    public String x() {
        return c().B(yf.j.f);
    }

    public String y() {
        return c().B(yf.j.i);
    }

    public l<a> z() {
        l<a> lVar = new l<>();
        yf.b bVarQ = c().q(yf.j.e);
        if (bVarQ instanceof C2531a) {
            a aVarE = null;
            for (yf.b bVar : ((C2531a) bVarQ).f21151a) {
                if (bVar instanceof m) {
                    bVar = ((m) bVar).f21270a;
                }
                if (bVar instanceof yf.d) {
                    aVarE = a.e((yf.d) bVar);
                    aVarE.m(this);
                    lVar.a(aVarE, 0);
                } else if (bVar instanceof yf.i) {
                    lVar.f(aVarE, ((yf.l) bVar).i());
                }
            }
        }
        if (bVarQ instanceof yf.d) {
            a aVarE2 = a.e((yf.d) bVarQ);
            aVarE2.m(this);
            lVar.a(aVarE2, 0);
        }
        return lVar;
    }

    public g(yf.d dVar) {
        super(dVar);
    }
}
