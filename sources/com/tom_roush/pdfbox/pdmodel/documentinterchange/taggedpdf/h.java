package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* JADX INFO: loaded from: classes4.dex */
public class h extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16149d = "Table";
    protected static final String e = "RowSpan";
    protected static final String f = "ColSpan";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final String f16150g = "Headers";
    protected static final String h = "Scope";
    protected static final String i = "Summary";
    public static final String j = "Both";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f16151k = "Column";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f16152l = "Row";

    public h() {
        l("Table");
    }

    public int K() {
        return q(f, 1);
    }

    public String[] L() {
        return n(f16150g);
    }

    public int M() {
        return q(e, 1);
    }

    public String N() {
        return r(h);
    }

    public String O() {
        return y(i);
    }

    public void P(int i4) {
        F(f, i4);
    }

    public void Q(String[] strArr) {
        C(f16150g, strArr);
    }

    public void R(int i4) {
        F(e, i4);
    }

    public void S(String str) {
        G(h, str);
    }

    public void T(String str) {
        J(i, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (z(e)) {
            sb2.append(", RowSpan=");
            sb2.append(M());
        }
        if (z(f)) {
            sb2.append(", ColSpan=");
            sb2.append(K());
        }
        if (z(f16150g)) {
            sb2.append(", Headers=");
            sb2.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.d(L()));
        }
        if (z(h)) {
            sb2.append(", Scope=");
            sb2.append(N());
        }
        if (z(i)) {
            sb2.append(", Summary=");
            sb2.append(O());
        }
        return sb2.toString();
    }

    public h(yf.d dVar) {
        super(dVar);
    }
}
