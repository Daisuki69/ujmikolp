package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import java.util.ArrayList;
import yf.C2531a;
import yf.j;
import yf.l;
import yf.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a {
    protected static final float c = -1.0f;

    public g() {
    }

    public void A(String str, String[] strArr) {
        yf.b bVarM = c().m(str);
        C2531a c2531a = new C2531a();
        for (String str2 : strArr) {
            c2531a.f(j.f(str2));
        }
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.F(j.f(str), c2531a);
        k(bVarM, c().m(str));
    }

    public void B(String str, float[] fArr) {
        C2531a c2531a = new C2531a();
        for (float f : fArr) {
            c2531a.f(new yf.f(f));
        }
        yf.b bVarM = c().m(str);
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.F(j.f(str), c2531a);
        k(bVarM, c().m(str));
    }

    public void C(String str, String[] strArr) {
        yf.b bVarM = c().m(str);
        C2531a c2531a = new C2531a();
        for (String str2 : strArr) {
            c2531a.f(new q(str2));
        }
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.F(j.f(str), c2531a);
        k(bVarM, c().m(str));
    }

    public void D(String str, Hf.d dVar) {
        yf.b bVarM = c().m(str);
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.E(j.f(str), dVar);
        k(bVarM, dVar == null ? null : dVar.f2171a);
    }

    public void E(String str, c cVar) {
        yf.b bVarM = c().m(str);
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.E(j.f(str), cVar);
        k(bVarM, cVar == null ? null : cVar.c());
    }

    public void F(String str, int i) {
        yf.b bVarM = c().m(str);
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.D(j.f(str), i);
        k(bVarM, c().m(str));
    }

    public void G(String str, String str2) {
        yf.b bVarM = c().m(str);
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.G(j.f(str), str2);
        k(bVarM, c().m(str));
    }

    public void H(String str, float f) {
        yf.b bVarM = c().m(str);
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.F(j.f(str), new yf.f(f));
        k(bVarM, c().m(str));
    }

    public void I(String str, int i) {
        yf.b bVarM = c().m(str);
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.D(j.f(str), i);
        k(bVarM, c().m(str));
    }

    public void J(String str, String str2) {
        yf.b bVarM = c().m(str);
        yf.d dVarC = c();
        dVarC.getClass();
        dVarC.H(j.f(str), str2);
        k(bVarM, c().m(str));
    }

    public String[] n(String str) {
        yf.b bVarM = c().m(str);
        if (!(bVarM instanceof C2531a)) {
            return null;
        }
        C2531a c2531a = (C2531a) bVarM;
        String[] strArr = new String[c2531a.f21151a.size()];
        for (int i = 0; i < c2531a.f21151a.size(); i++) {
            strArr[i] = ((j) c2531a.k(i)).f21267a;
        }
        return strArr;
    }

    public Hf.d o(String str) {
        C2531a c2531a = (C2531a) c().m(str);
        if (c2531a != null) {
            return new Hf.d(c2531a);
        }
        return null;
    }

    public Object p(String str) {
        C2531a c2531a = (C2531a) c().m(str);
        if (c2531a == null) {
            return null;
        }
        ArrayList arrayList = c2531a.f21151a;
        if (arrayList.size() == 3) {
            return new Hf.d(c2531a);
        }
        if (arrayList.size() == 4) {
            return new c(c2531a);
        }
        return null;
    }

    public int q(String str, int i) {
        yf.d dVarC = c();
        dVarC.getClass();
        return dVarC.t(j.f(str), null, i);
    }

    public String r(String str) {
        yf.d dVarC = c();
        dVarC.getClass();
        return dVarC.z(j.f(str));
    }

    public String s(String str, String str2) {
        yf.d dVarC = c();
        dVarC.getClass();
        String strZ = dVarC.z(j.f(str));
        return strZ == null ? str2 : strZ;
    }

    public Object t(String str, String str2) {
        yf.b bVarM = c().m(str);
        if (!(bVarM instanceof C2531a)) {
            return bVarM instanceof j ? ((j) bVarM).f21267a : str2;
        }
        C2531a c2531a = (C2531a) bVarM;
        String[] strArr = new String[c2531a.f21151a.size()];
        for (int i = 0; i < c2531a.f21151a.size(); i++) {
            yf.b bVarK = c2531a.k(i);
            if (bVarK instanceof j) {
                strArr[i] = ((j) bVarK).f21267a;
            }
        }
        return strArr;
    }

    public float u(String str) {
        yf.d dVarC = c();
        dVarC.getClass();
        yf.b bVarQ = dVarC.q(j.f(str));
        if (bVarQ instanceof l) {
            return ((l) bVarQ).f();
        }
        return -1.0f;
    }

    public float v(String str, float f) {
        yf.d dVarC = c();
        dVarC.getClass();
        yf.b bVarQ = dVarC.q(j.f(str));
        return bVarQ instanceof l ? ((l) bVarQ).f() : f;
    }

    public Object w(String str, float f) {
        yf.b bVarM = c().m(str);
        if (!(bVarM instanceof C2531a)) {
            if (bVarM instanceof l) {
                return Float.valueOf(((l) bVarM).f());
            }
            if (f == -1.0f) {
                return null;
            }
            return Float.valueOf(f);
        }
        C2531a c2531a = (C2531a) bVarM;
        float[] fArr = new float[c2531a.f21151a.size()];
        for (int i = 0; i < c2531a.f21151a.size(); i++) {
            yf.b bVarK = c2531a.k(i);
            if (bVarK instanceof l) {
                fArr[i] = ((l) bVarK).f();
            }
        }
        return fArr;
    }

    public Object x(String str, String str2) {
        yf.b bVarM = c().m(str);
        return bVarM instanceof l ? Float.valueOf(((l) bVarM).f()) : bVarM instanceof j ? ((j) bVarM).f21267a : str2;
    }

    public String y(String str) {
        yf.d dVarC = c();
        dVarC.getClass();
        return dVarC.B(j.f(str));
    }

    public boolean z(String str) {
        return c().m(str) != null;
    }

    public g(yf.d dVar) {
        super(dVar);
    }
}
