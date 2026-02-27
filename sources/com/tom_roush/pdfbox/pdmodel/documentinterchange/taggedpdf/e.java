package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* JADX INFO: loaded from: classes4.dex */
public class e extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16139d = "List";
    protected static final String e = "ListNumbering";
    public static final String f = "Circle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16140g = "Decimal";
    public static final String h = "Disc";
    public static final String i = "LowerAlpha";
    public static final String j = "LowerRoman";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f16141k = "None";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f16142l = "Square";
    public static final String m = "UpperAlpha";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f16143n = "UpperRoman";

    public e() {
        l(f16139d);
    }

    public String K() {
        return s(e, "None");
    }

    public void L(String str) {
        G(e, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (z(e)) {
            sb2.append(", ListNumbering=");
            sb2.append(K());
        }
        return sb2.toString();
    }

    public e(yf.d dVar) {
        super(dVar);
    }
}
