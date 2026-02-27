package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* JADX INFO: loaded from: classes4.dex */
public class b extends d {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final String f16059a1 = "XML-1.00";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final String f16060b1 = "HTML-3.2";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final String f16061c1 = "HTML-4.01";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String f16062d1 = "OEB-1.00";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final String f16063e1 = "RTF-1.05";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f16064f1 = "CSS-1.00";
    public static final String g1 = "CSS-2.00";

    public b(String str) {
        l(str);
    }

    public int A1() {
        return q("RowSpan", 1);
    }

    public String B1() {
        return r("Scope");
    }

    public String C1() {
        return y("Summary");
    }

    public void D1(int i) {
        F("ColSpan", i);
    }

    public void E1(String[] strArr) {
        C("Headers", strArr);
    }

    public void F1(String str) {
        G("ListNumbering", str);
    }

    public void G1(int i) {
        F("RowSpan", i);
    }

    public void H1(String str) {
        G("Scope", str);
    }

    public void I1(String str) {
        J("Summary", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d, com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (z("ListNumbering")) {
            sb2.append(", ListNumbering=");
            sb2.append(z1());
        }
        if (z("RowSpan")) {
            sb2.append(", RowSpan=");
            sb2.append(A1());
        }
        if (z("ColSpan")) {
            sb2.append(", ColSpan=");
            sb2.append(x1());
        }
        if (z("Headers")) {
            sb2.append(", Headers=");
            sb2.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.d(y1()));
        }
        if (z("Scope")) {
            sb2.append(", Scope=");
            sb2.append(B1());
        }
        if (z("Summary")) {
            sb2.append(", Summary=");
            sb2.append(C1());
        }
        return sb2.toString();
    }

    public int x1() {
        return q("ColSpan", 1);
    }

    public String[] y1() {
        return n("Headers");
    }

    public String z1() {
        return s("ListNumbering", "None");
    }

    public b(yf.d dVar) {
        super(dVar);
    }
}
