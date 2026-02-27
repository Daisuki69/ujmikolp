package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* JADX INFO: loaded from: classes4.dex */
public class f extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16144d = "PrintField";
    private static final String e = "Role";
    private static final String f = "checked";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f16145g = "Desc";
    public static final String h = "rb";
    public static final String i = "cb";
    public static final String j = "pb";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f16146k = "tv";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f16147l = "on";
    public static final String m = "off";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f16148n = "neutral";

    public f() {
        l(f16144d);
    }

    public String K() {
        return y(f16145g);
    }

    public String L() {
        return s(f, m);
    }

    public String M() {
        return r(e);
    }

    public void N(String str) {
        J(f16145g, str);
    }

    public void O(String str) {
        G(f, str);
    }

    public void P(String str) {
        G(e, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (z(e)) {
            sb2.append(", Role=");
            sb2.append(M());
        }
        if (z(f)) {
            sb2.append(", Checked=");
            sb2.append(L());
        }
        if (z(f16145g)) {
            sb2.append(", Desc=");
            sb2.append(K());
        }
        return sb2.toString();
    }

    public f(yf.d dVar) {
        super(dVar);
    }
}
