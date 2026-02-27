package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends Df.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f16043b;

    public a() {
    }

    public static String b(float[] fArr) {
        StringBuilder sb2 = new StringBuilder("[");
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(fArr[i]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static String d(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder("[");
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(objArr[i]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static a e(yf.d dVar) {
        String strZ = dVar.z(yf.j.N0);
        return j.c.equals(strZ) ? new j(dVar) : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f16139d.equals(strZ) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e(dVar) : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f16144d.equals(strZ) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f(dVar) : "Table".equals(strZ) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.h(dVar) : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f16105d.equals(strZ) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d(dVar) : (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f16059a1.equals(strZ) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f16060b1.equals(strZ) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f16061c1.equals(strZ) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f16062d1.equals(strZ) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f16063e1.equals(strZ) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f16064f1.equals(strZ) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.g1.equals(strZ)) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b(dVar) : new b(dVar);
    }

    private g g() {
        return this.f16043b;
    }

    private boolean i(yf.b bVar, yf.b bVar2) {
        return bVar == null ? bVar2 != null : !bVar.equals(bVar2);
    }

    public String f() {
        return c().z(yf.j.N0);
    }

    public boolean h() {
        return c().f21154a.size() == 1 && f() != null;
    }

    public void j() {
        if (g() != null) {
            g().w(this);
        }
    }

    public void k(yf.b bVar, yf.b bVar2) {
        if (i(bVar, bVar2)) {
            j();
        }
    }

    public void l(String str) {
        c().G(yf.j.N0, str);
    }

    public void m(g gVar) {
        this.f16043b = gVar;
    }

    public String toString() {
        return "O=" + f();
    }

    public a(yf.d dVar) {
        super(dVar);
    }
}
