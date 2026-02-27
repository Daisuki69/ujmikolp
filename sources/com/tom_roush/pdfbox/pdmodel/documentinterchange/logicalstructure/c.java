package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Df.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yf.d f16044a;

    public c() {
        this.f16044a = new yf.d();
    }

    @Override // Df.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf.d c() {
        return this.f16044a;
    }

    public boolean b() {
        yf.d dVar = this.f16044a;
        dVar.getClass();
        return dVar.g(yf.j.f("Marked"));
    }

    public boolean d() {
        yf.d dVar = this.f16044a;
        dVar.getClass();
        return dVar.g(yf.j.f("Suspects"));
    }

    public void e(boolean z4) {
        yf.d dVar = this.f16044a;
        dVar.getClass();
        dVar.F(yf.j.f("Marked"), z4 ? yf.c.f21152b : yf.c.c);
    }

    public void f(boolean z4) {
        yf.d dVar = this.f16044a;
        dVar.getClass();
        dVar.F(yf.j.f("Suspects"), yf.c.c);
    }

    public void g(boolean z4) {
        yf.d dVar = this.f16044a;
        dVar.getClass();
        dVar.F(yf.j.f(j.c), z4 ? yf.c.f21152b : yf.c.c);
    }

    public boolean h() {
        yf.d dVar = this.f16044a;
        dVar.getClass();
        return dVar.g(yf.j.f(j.c));
    }

    public c(yf.d dVar) {
        this.f16044a = dVar;
    }
}
