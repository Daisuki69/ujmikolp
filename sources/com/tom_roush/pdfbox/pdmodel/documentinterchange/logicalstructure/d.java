package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* JADX INFO: loaded from: classes4.dex */
public class d implements Df.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16045b = "MCR";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yf.d f16046a;

    public d() {
        yf.d dVar = new yf.d();
        this.f16046a = dVar;
        dVar.G(yf.j.f21262x1, f16045b);
    }

    @Override // Df.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf.d c() {
        return this.f16046a;
    }

    public int b() {
        return c().t(yf.j.I0, null, -1);
    }

    public Cf.b d() {
        yf.d dVar = (yf.d) c().q(yf.j.f21209a1);
        if (dVar != null) {
            return new Cf.b(dVar);
        }
        return null;
    }

    public void e(int i) {
        c().D(yf.j.I0, i);
    }

    public void f(Cf.b bVar) {
        c().E(yf.j.f21209a1, bVar);
    }

    public String toString() {
        return "mcid=" + b();
    }

    public d(yf.d dVar) {
        this.f16046a = dVar;
    }
}
