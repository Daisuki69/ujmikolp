package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* JADX INFO: loaded from: classes4.dex */
public class k extends Df.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f16053b;

    public k(j jVar) {
        this.f16053b = jVar;
    }

    private boolean f(Object obj, Object obj2) {
        return obj == null ? obj2 != null : !obj.equals(obj2);
    }

    private void h(Object obj, Object obj2) {
        if (f(obj, obj2)) {
            this.f16053b.r(this);
        }
    }

    public String b() {
        return c().B(yf.j.f21233l0);
    }

    public String d() {
        return c().z(yf.j.f21184L0);
    }

    public yf.b e() {
        return c().q(yf.j.f21168A1);
    }

    @Override // Df.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        j jVar = this.f16053b;
        if (jVar == null) {
            if (kVar.f16053b != null) {
                return false;
            }
        } else if (!jVar.equals(kVar.f16053b)) {
            return false;
        }
        return true;
    }

    public boolean g() {
        return c().g(yf.j.f21249s0);
    }

    @Override // Df.d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        j jVar = this.f16053b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public void i(String str) {
        h(b(), str);
        c().H(yf.j.f21233l0, str);
    }

    public void j(boolean z4) {
        h(Boolean.valueOf(g()), Boolean.valueOf(z4));
        c().F(yf.j.f21249s0, z4 ? yf.c.f21152b : yf.c.c);
    }

    public void k(String str) {
        h(d(), str);
        c().G(yf.j.f21184L0, str);
    }

    public void l(yf.b bVar) {
        h(e(), bVar);
        c().F(yf.j.f21168A1, bVar);
    }

    public String toString() {
        return "Name=" + d() + ", Value=" + e() + ", FormattedValue=" + b() + ", Hidden=" + g();
    }

    public k(yf.d dVar, j jVar) {
        super(dVar);
        this.f16053b = jVar;
    }
}
