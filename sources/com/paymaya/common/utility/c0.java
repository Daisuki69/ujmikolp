package com.paymaya.common.utility;

import cj.C1132s;
import com.mastercard.mpqr.pushpayment.exception.FormatException;
import com.mastercard.mpqr.pushpayment.exception.InvalidTagValueException;
import java.io.Serializable;
import java.util.List;
import java.util.regex.Pattern;
import y4.C2506b;
import y4.C2507c;
import y4.C2508d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f10695b;
    public static final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f10696d;
    public static final List e;
    public static final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f10697g;

    static {
        Pattern patternCompile = Pattern.compile("\\+\\d{1,3}-[0-9()+-]{1,30}");
        kotlin.jvm.internal.j.f(patternCompile, "compile(...)");
        f10694a = patternCompile;
        f10695b = C1132s.g("11", "12");
        c = cj.r.c("com.p2pqrpay");
        f10696d = cj.r.c("99964403");
        e = cj.r.c("6016");
        f = cj.r.c("608");
        f10697g = cj.r.c("PH");
    }

    public static void a(String str, y4.f fVar) {
        C.j0(fVar, "00", 2, 2);
        C.i0(fVar, "01", f10695b);
        try {
            C2508d c2508dO = fVar.o("27");
            if (c2508dO == null) {
                throw new InvalidTagValueException("27", (String) null, "Missing tag=".concat("27"));
            }
            C.i0(c2508dO, "00", c);
            C.j0(c2508dO, "01", 1, 11);
            C.i0(c2508dO, "02", f10696d);
            C.n0(c2508dO, "03", 34);
            C.j0(c2508dO, "04", 1, 34);
            C.n0(c2508dO, "05", 33);
            String strP = C.P("05", c2508dO);
            Pattern pattern = f10694a;
            if (strP != null && !pattern.matcher(strP).matches()) {
                String string = pattern.toString();
                kotlin.jvm.internal.j.f(string, "toString(...)");
                throw C.F0(strP, string);
            }
            C.i0(fVar, "52", e);
            C.i0(fVar, "53", f);
            String strP2 = C.P("01", fVar);
            if ("12".equals(strP2)) {
                C.j0(fVar, "54", 1, 13);
            } else if ("11".equals(strP2) && fVar.f(x4.f.h)) {
                throw new InvalidTagValueException("54", (String) null, "Not allowed tag=".concat("54"));
            }
            C.i0(fVar, "58", f10697g);
            C.j0(fVar, "59", 1, 99);
            C.C0(fVar.b("59"), "59", true);
            C.j0(fVar, "60", 1, 35);
            C.C0(fVar.b("60"), "60", true);
            C.n0(fVar, "61", 16);
            C2506b c2506bN = fVar.n();
            if (c2506bN != null) {
                C.j0(c2506bN, "00", 1, 14);
                C.n0(c2506bN, "01", 25);
                C.n0(c2506bN, "02", 99);
                C.n0(c2506bN, "03", 15);
                C.C0(c2506bN.b("03"), "03", false);
                C.n0(c2506bN, "04", 99);
                C.n0(c2506bN, "05", 25);
                C.C0(c2506bN.b("05"), "05", false);
                C.n0(c2506bN, "06", 99);
                C.j0(c2506bN, "07", 1, 99);
                C.C0(c2506bN.b("07"), "07", false);
                C.n0(c2506bN, "08", 99);
                C.n0(c2506bN, "09", 99);
                String strP3 = C.P("02", c2506bN);
                if (strP3 != null && strP3.length() != 0 && !pattern.matcher(strP3).matches() && !strP3.equals("***")) {
                    String string2 = pattern.toString();
                    kotlin.jvm.internal.j.f(string2, "toString(...)");
                    throw C.F0(strP3, string2);
                }
            }
            Serializable serializableE = fVar.e(x4.f.f20924q);
            C2507c c2507c = serializableE == null ? null : (C2507c) serializableE;
            if (c2507c != null) {
                C.j0(c2507c, "00", 2, 2);
                C.j0(c2507c, "01", 1, 25);
                C.n0(c2507c, "02", 25);
            }
            C.j0(fVar, "63", 4, 4);
            String strC = fVar.c(x4.f.f20925r);
            kotlin.jvm.internal.j.f(strC, "getCRC(...)");
            String strSubstring = str.substring(0, str.length() - 4);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            String strG = E1.c.g(strSubstring);
            kotlin.jvm.internal.j.f(strG, "generateChecksumCRC16(...)");
            if (!strG.equals(strC)) {
                throw new InvalidTagValueException("63", strC, We.s.k("expected_crc=", strG, " vs provided_crc=", strC));
            }
        } catch (FormatException unused) {
            yk.a.b();
            throw new InvalidTagValueException("27", (String) null, "Invalid length=null for tag=27");
        }
    }
}
