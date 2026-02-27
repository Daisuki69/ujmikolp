package Ef;

import Df.c;
import yf.C2531a;
import yf.b;
import yf.d;
import yf.f;
import yf.i;
import yf.j;
import yf.l;

/* JADX INFO: loaded from: classes4.dex */
public class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f1351b = "S";
    public static final String c = "D";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f1352a;

    public a() {
        this.f1352a = new d();
    }

    @Override // Df.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d c() {
        return this.f1352a;
    }

    public Hf.a b() {
        d dVar = this.f1352a;
        j jVar = j.f21255v;
        C2531a c2531a = (C2531a) dVar.q(jVar);
        if (c2531a == null) {
            c2531a = new C2531a();
            i iVar = i.f21163d;
            c2531a.f(iVar);
            c2531a.f(iVar);
            c2531a.f(iVar);
            this.f1352a.F(jVar, c2531a);
        }
        return new Hf.a(c2531a.r(), Hf.c.f2169b);
    }

    public String d() {
        String strZ = this.f1352a.z(j.f21235m1);
        return strZ == null ? "S" : strZ;
    }

    public float e() {
        b bVarQ = this.f1352a.q(j.f21171B1);
        if (bVarQ instanceof l) {
            return ((l) bVarQ).f();
        }
        return 1.0f;
    }

    public Gf.a f() {
        d dVar = this.f1352a;
        j jVar = j.f21202X;
        C2531a c2531a = (C2531a) dVar.q(jVar);
        if (c2531a == null) {
            c2531a = new C2531a();
            c2531a.f(i.e);
            this.f1352a.F(jVar, c2531a);
        }
        C2531a c2531a2 = new C2531a();
        c2531a2.f(c2531a);
        return new Gf.a(c2531a2);
    }

    public void g(Hf.a aVar) {
        C2531a c2531a;
        if (aVar != null) {
            c2531a = new C2531a();
            c2531a.f21151a.clear();
            for (float f : aVar.f2167a) {
                c2531a.f(new f(f));
            }
        } else {
            c2531a = null;
        }
        this.f1352a.F(j.f21255v, c2531a);
    }

    public void h(String str) {
        this.f1352a.G(j.f21235m1, str);
    }

    public void i(float f) {
        d dVar = this.f1352a;
        j jVar = j.f21171B1;
        dVar.getClass();
        dVar.F(jVar, new f(f));
    }

    public void j(C2531a c2531a) {
        if (c2531a == null) {
            c2531a = null;
        }
        this.f1352a.F(j.f21202X, c2531a);
    }

    public a(d dVar) {
        this.f1352a = dVar;
    }
}
