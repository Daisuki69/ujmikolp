package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f16153A = "TH";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f16154B = "TD";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f16155C = "THead";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f16156D = "TBody";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f16157E = "TFoot";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f16158F = "Span";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f16159G = "Quote";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f16160H = "Note";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f16161I = "Reference";
    public static final String J = "BibEntry";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f16162K = "Code";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f16163L = "Link";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f16164M = "Annot";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f16165N = "Ruby";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f16166O = "RB";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f16167P = "RT";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f16168Q = "RP";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f16169R = "Warichu";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f16170S = "WT";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f16171T = "WP";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f16172U = "Figure";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f16173V = "Formula";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f16174W = "Form";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static List<String> f16175X = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16176a = "Document";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16177b = "Part";
    public static final String c = "Art";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16178d = "Sect";
    public static final String e = "Div";
    public static final String f = "BlockQuote";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16179g = "Caption";
    public static final String h = "TOC";
    public static final String i = "TOCI";
    public static final String j = "Index";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f16180k = "NonStruct";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f16181l = "Private";
    public static final String m = "P";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f16182n = "H";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f16183o = "H1";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f16184p = "H2";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f16185q = "H3";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f16186r = "H4";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f16187s = "H5";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f16188t = "H6";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f16189u = "L";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f16190v = "LI";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f16191w = "Lbl";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f16192x = "LBody";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f16193y = "Table";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f16194z = "TR";

    static {
        for (Field field : i.class.getFields()) {
            if (Modifier.isFinal(field.getModifiers())) {
                try {
                    f16175X.add(field.get(null).toString());
                } catch (IllegalAccessException e7) {
                    Log.e("PdfBox-Android", e7.getMessage(), e7);
                } catch (IllegalArgumentException e10) {
                    Log.e("PdfBox-Android", e10.getMessage(), e10);
                }
            }
        }
        Collections.sort(f16175X);
    }

    private i() {
    }
}
