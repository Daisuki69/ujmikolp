package com.paymaya.common.utility;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import c4.C1074a;
import com.google.zxing.WriterException;
import com.mastercard.mpqr.pushpayment.exception.FormatException;
import com.mastercard.mpqr.pushpayment.exception.InvalidTagValueException;
import com.mastercard.mpqr.pushpayment.exception.UnknownTagException;
import com.paymaya.common.exception.MayaQRErrorException;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.QRBankTransferRecipient;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.domain.model.QRPHMerchantAdditionalInfo;
import com.paymaya.domain.model.QRPHMerchantDetails;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.domain.model.QRRecipient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import x4.EnumC2464a;
import y4.C2506b;
import y4.C2507c;
import y4.C2508d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f10458a = C.f10409z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10459b = C.f10374A;
    public static final T c = C.f10377D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T f10460d = C.f10379F;
    public static final T e = C.f10381H;
    public static final T f = C.f10387O;

    public static void a(FragmentActivity fragmentActivity, float f3) {
        if (fragmentActivity == null || fragmentActivity.getWindow() == null) {
            return;
        }
        Window window = fragmentActivity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f3;
        window.setAttributes(attributes);
    }

    public static Bitmap b(FragmentActivity fragmentActivity, String str, int i) {
        if (str.isEmpty()) {
            return null;
        }
        mg.c cVar = new mg.c(1);
        try {
            HashMap map = new HashMap();
            map.put(C3.c.f706a, d4.c.H);
            map.put(C3.c.f707b, "UTF-8");
            K3.b bVarE = cVar.e(str, C3.a.f694l, h(fragmentActivity), h(fragmentActivity), map);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(fragmentActivity.getResources(), i);
            int i4 = bVarE.f2589a;
            int i6 = bVarE.f2590b;
            int[] iArr = new int[i4 * i6];
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = i10 * i4;
                for (int i12 = 0; i12 < i4; i12++) {
                    iArr[i11 + i12] = bVarE.b(i12, i10) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i6, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, i4, 0, 0, i4, i6);
            return l(bitmapDecodeResource, bitmapCreateBitmap);
        } catch (WriterException unused) {
            yk.a.b();
            return null;
        }
    }

    public static QRBankTransferRecipient c(Double d10, String str, String str2) {
        return QRBankTransferRecipient.sBuilder().mBankBic(str).mAccountNumber(str2).mAmount(d10).build();
    }

    public static QRMerchant d(String str, String str2, String str3, String str4) {
        return QRMerchant.sBuilder().mMerchantId(str).mName(str2).mAmount(Amount.sBuilder().mValue(str3).mCurrency("PHP").build()).mPaymentId(str4).build();
    }

    public static QRRecipient e(String str, String str2, String str3) {
        return QRRecipient.sBuilder().mValue(str).mType("PAYMAYA").mAmount(str2).mMessage(str3).build();
    }

    public static String f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, double d10, String str11) {
        y4.f fVar = new y4.f();
        try {
            String strReplaceAll = str2.replaceAll("ñ", "n").replaceAll("Ñ", "N");
            fVar.h(x4.f.f20917d, str4);
            fVar.h(x4.f.f20918g, str5);
            fVar.h(x4.f.f20920l, "PH");
            fVar.h(x4.f.m, strReplaceAll);
            fVar.h(x4.f.f20921n, str3);
            fVar.h(x4.f.f, str6);
            if (BigDecimal.valueOf(d10).compareTo(BigDecimal.ZERO) > 0) {
                fVar.h(x4.f.h, J.f10421b.format(d10));
                fVar.k();
            }
            String strK = C.K(str);
            C2508d c2508d = new C2508d(str7);
            c2508d.g("00", str8);
            c2508d.g("01", str9);
            c2508d.g("02", str10);
            c2508d.g("04", strK);
            c2508d.g("05", C.t(str));
            if (str11 != null && !str11.isEmpty()) {
                C2506b c2506b = new C2506b();
                c2506b.h(EnumC2464a.TAG_08_PURPOSE, str11);
                fVar.h(x4.f.f20923p, c2506b);
            }
            fVar.i(c2508d);
            fVar.j();
            return fVar.l();
        } catch (UnknownTagException unused) {
            yk.a.e();
            return "";
        } catch (FormatException unused2) {
            yk.a.e();
            return "";
        }
    }

    public static String g(String str, y4.f fVar) {
        try {
            return fVar.o("28").b(str);
        } catch (Exception unused) {
            yk.a.e();
            return null;
        }
    }

    public static int h(Context context) {
        return (int) ((((double) context.getResources().getDisplayMetrics().density) * 250.0d) + 0.5d);
    }

    public static QRRecipient i(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("r");
            return QRRecipient.sBuilder().mValue(jSONObject.getString("v")).mType(jSONObject.getString("t")).build();
        } catch (JSONException unused) {
            yk.a.e();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.matches("^((\\+?63)|0)?[0-9]{10}$") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.paymaya.common.utility.Y j(java.lang.String r3) {
        /*
            java.lang.String r0 = "r"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r1.<init>(r3)     // Catch: org.json.JSONException -> L28
            boolean r2 = r1.has(r0)     // Catch: org.json.JSONException -> L28
            if (r2 == 0) goto L2b
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch: org.json.JSONException -> L28
            java.lang.String r1 = "v"
            java.lang.String r0 = r0.getString(r1)     // Catch: org.json.JSONException -> L28
            boolean r1 = com.paymaya.common.utility.C.a0(r0)     // Catch: org.json.JSONException -> L28
            if (r1 != 0) goto L25
            java.lang.String r1 = "^((\\+?63)|0)?[0-9]{10}$"
            boolean r0 = r0.matches(r1)     // Catch: org.json.JSONException -> L28
            if (r0 == 0) goto L2b
        L25:
            com.paymaya.common.utility.Y r3 = com.paymaya.common.utility.Y.f10455a
            return r3
        L28:
            yk.a.b()
        L2b:
            y4.f r0 = k2.v0.z(r3)     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = "27"
            y4.d r0 = r0.o(r1)     // Catch: java.lang.Exception -> L3c
            boolean r0 = com.paymaya.common.utility.C.e(r0)     // Catch: java.lang.Exception -> L3c
            r0 = r0 ^ 1
            goto L40
        L3c:
            yk.a.b()
            r0 = 0
        L40:
            if (r0 == 0) goto L45
            com.paymaya.common.utility.Y r3 = com.paymaya.common.utility.Y.f10456b
            return r3
        L45:
            java.lang.String r0 = "28"
            y4.f r3 = k2.v0.z(r3)     // Catch: java.lang.Exception -> L6a
            y4.d r1 = r3.o(r0)     // Catch: java.lang.Exception -> L6a
            boolean r1 = com.paymaya.common.utility.C.e(r1)     // Catch: java.lang.Exception -> L6a
            if (r1 != 0) goto L6d
            y4.d r3 = r3.o(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = "01"
            java.lang.String r3 = r3.b(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = "PAPHPHM1XXX"
            boolean r3 = r3.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L6d
            com.paymaya.common.utility.Y r3 = com.paymaya.common.utility.Y.c
            return r3
        L6a:
            yk.a.b()
        L6d:
            com.paymaya.common.utility.Y r3 = com.paymaya.common.utility.Y.e
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.common.utility.Z.j(java.lang.String):com.paymaya.common.utility.Y");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.paymaya.common.utility.Y k(java.lang.String r4) {
        /*
            java.lang.String r0 = "r"
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L29
            r2.<init>(r4)     // Catch: org.json.JSONException -> L29
            boolean r3 = r2.has(r0)     // Catch: org.json.JSONException -> L29
            if (r3 == 0) goto L2c
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch: org.json.JSONException -> L29
            java.lang.String r2 = "v"
            java.lang.String r0 = r0.getString(r2)     // Catch: org.json.JSONException -> L29
            boolean r2 = com.paymaya.common.utility.C.a0(r0)     // Catch: org.json.JSONException -> L29
            if (r2 != 0) goto L26
            java.lang.String r2 = "^((\\+?63)|0)?[0-9]{10}$"
            boolean r0 = r0.matches(r2)     // Catch: org.json.JSONException -> L29
            if (r0 == 0) goto L2c
        L26:
            com.paymaya.common.utility.Y r0 = com.paymaya.common.utility.Y.f10455a     // Catch: org.json.JSONException -> L29
            goto L2d
        L29:
            yk.a.b()
        L2c:
            r0 = r1
        L2d:
            if (r0 == 0) goto L30
            return r0
        L30:
            y4.f r0 = k2.v0.z(r4)     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "27"
            y4.d r0 = r0.o(r2)     // Catch: java.lang.Exception -> L41
            boolean r0 = com.paymaya.common.utility.C.e(r0)     // Catch: java.lang.Exception -> L41
            r0 = r0 ^ 1
            goto L45
        L41:
            yk.a.b()
            r0 = 0
        L45:
            if (r0 == 0) goto L4a
            com.paymaya.common.utility.Y r4 = com.paymaya.common.utility.Y.f10456b
            return r4
        L4a:
            y4.f r4 = k2.v0.z(r4)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = "28"
            y4.d r4 = r4.o(r0)     // Catch: java.lang.Exception -> L6a
            if (r4 == 0) goto L6d
            java.lang.String r0 = "01"
            java.lang.String r4 = r4.b(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = "PAPHPHM1XXX"
            boolean r4 = r0.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L6a
            if (r4 == 0) goto L67
            com.paymaya.common.utility.Y r1 = com.paymaya.common.utility.Y.c     // Catch: java.lang.Exception -> L6a
            goto L6d
        L67:
            com.paymaya.common.utility.Y r1 = com.paymaya.common.utility.Y.f10457d     // Catch: java.lang.Exception -> L6a
            goto L6d
        L6a:
            yk.a.b()
        L6d:
            if (r1 == 0) goto L70
            return r1
        L70:
            com.paymaya.common.utility.Y r4 = com.paymaya.common.utility.Y.e
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.common.utility.Z.k(java.lang.String):com.paymaya.common.utility.Y");
    }

    public static Bitmap l(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), bitmap2.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.drawBitmap(bitmap2, new Matrix(), null);
        canvas.drawBitmap(bitmap, (width - bitmap.getWidth()) / 2, (height - bitmap.getHeight()) / 2, (Paint) null);
        return bitmapCreateBitmap;
    }

    public static C3.j m(Bitmap bitmap) {
        int[] iArr = new int[bitmap.getHeight() * bitmap.getWidth()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return new C1074a().a(new A7.f(new K3.e(new C3.h(bitmap.getWidth(), bitmap.getHeight(), iArr)), 6), null);
    }

    public static QRPHMerchantPaymentRequest n(y4.f fVar, String str, Boolean bool) {
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C2507c c2507c;
        C2507c c2507c2;
        Amount amountBuild;
        try {
            String strG = g("01", fVar);
            C.A0(strG, C.m, true, 11, strG);
            C.y0(fVar.c(x4.f.f20917d), C.f10392b, Arrays.asList("01"), strG);
            String strC = fVar.c(x4.f.e);
            C.y0(strC, C.c, Arrays.asList("11", "12"), strG);
            String strG2 = g("00", fVar);
            C.y0(strG2, C.h, Arrays.asList("ph.ppmi.p2m", "ph.ppmi.p2micro", "ph.ppmi.p2b"), strG);
            String strG3 = g("03", fVar);
            C.z0(strG3, C.f10395k, true, 1, 25, strG);
            String strG4 = g("04", fVar);
            C.z0(strG4, C.f10399p, false, 1, 25, strG);
            String strG5 = g("05", fVar);
            T t5 = C.f10401r;
            C.A0(strG5, t5, true, 3, strG);
            C.B0(t5, strG5, "[0-5Z][0-1][0-2]", strG);
            String strC2 = bool.booleanValue() ? fVar.c(x4.f.f) : null;
            if (bool.booleanValue()) {
                str2 = strG5;
                String str10 = strC2;
                i = 3;
                C.z0(str10, C.f10402s, true, 1, 70, strG);
                str3 = str10;
            } else {
                str2 = strG5;
                str3 = strC2;
                i = 3;
            }
            C.A0(fVar.c(x4.f.f20918g), C.f10403t, true, i, strG);
            String strP = fVar.p();
            Double dValueOf = !C.e(strP) ? Double.valueOf(strP) : null;
            C.z0(String.valueOf(dValueOf), C.f10404u, "12".equals(strC), 1, 13, strG);
            String strC3 = bool.booleanValue() ? fVar.c(x4.f.f20920l) : null;
            if (bool.booleanValue()) {
                C.A0(strC3, C.f10408y, true, 2, strG);
            }
            String strC4 = fVar.c(x4.f.m);
            String str11 = strC3;
            T t10 = f10458a;
            C.z0(strC4, t10, true, 1, 25, strG);
            C.B0(t10, strC4, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", strG);
            String strC5 = fVar.c(x4.f.f20921n);
            T t11 = f10459b;
            C.z0(strC5, t11, true, 1, 15, strG);
            C.B0(t11, strC5, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", strG);
            String strC6 = fVar.c(x4.f.f20922o);
            if (fVar.n() != null) {
                str4 = strC5;
                C.z0(fVar.n().b("00"), C.f10394g, true, 1, 14, strG);
                C2506b c2506bN = fVar.n();
                c2506bN.getClass();
                String strC7 = c2506bN.c(EnumC2464a.TAG_02_MOBILE_NUMBER);
                T t12 = C.f10376C;
                if (strC7 != null && !strC7.isEmpty() && !strC7.equals("***")) {
                    try {
                        C.B0(t12, strC7, "\\+\\d{1,3}-[0-9()+-]{1,30}", strG);
                    } catch (MayaQRErrorException unused) {
                        yk.a.b();
                        a0[] a0VarArr = a0.f10692a;
                        throw new MayaQRErrorException(t12, "invalidValue", strC7, strG);
                    }
                }
                C2506b c2506bN2 = fVar.n();
                c2506bN2.getClass();
                String strC8 = c2506bN2.c(EnumC2464a.TAG_03_STORE_ID);
                T t13 = c;
                C.z0(strC8, t13, false, 0, 15, strG);
                C.w0(t13, strC8, strG);
                C2506b c2506bN3 = fVar.n();
                c2506bN3.getClass();
                String strC9 = c2506bN3.c(EnumC2464a.TAG_04_LOYALTY_NUMBER);
                C.z0(strC9, C.f10378E, false, 3, 25, strG);
                C2506b c2506bN4 = fVar.n();
                c2506bN4.getClass();
                String strC10 = c2506bN4.c(EnumC2464a.TAG_05_REFERENCE_ID);
                T t14 = f10460d;
                C.z0(strC10, t14, false, 1, 25, strG);
                C.w0(t14, strC10, strG);
                C2506b c2506bN5 = fVar.n();
                c2506bN5.getClass();
                String strC11 = c2506bN5.c(EnumC2464a.TAG_07_TERMINAL_ID);
                T t15 = e;
                C.A0(strC11, t15, false, 8, strG);
                C.w0(t15, strC11, strG);
                str5 = strC4;
                str6 = strC9;
                str7 = strC8;
                str8 = strC10;
                str9 = strC11;
            } else {
                str4 = strC5;
                str5 = strC4;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            String strC12 = fVar.c(x4.f.f20925r);
            C.A0(strC12, C.f10383K, true, 4, strG);
            if (!E1.c.t((!bool.booleanValue() || str == null) ? fVar.toString() : str)) {
                throw new InvalidTagValueException("cyclic redundancy check", strC12, "Invalid value for tag CRC should be proper checksum");
            }
            x4.f fVar2 = x4.f.f20924q;
            Serializable serializableE = fVar.e(fVar2);
            if ((serializableE == null ? null : (C2507c) serializableE) != null) {
                try {
                    Serializable serializableE2 = fVar.e(fVar2);
                    c2507c2 = serializableE2 == null ? null : (C2507c) serializableE2;
                } catch (Exception unused2) {
                    yk.a.e();
                }
                String strB = c2507c2 == null ? null : c2507c2.b("00");
                C.A0(strB, C.f10384L, true, 2, strG);
                try {
                    Serializable serializableE3 = fVar.e(x4.f.f20924q);
                    c2507c = serializableE3 == null ? null : (C2507c) serializableE3;
                } catch (Exception unused3) {
                    yk.a.e();
                }
                String strB2 = c2507c == null ? null : c2507c.b("01");
                C.z0(strB2, C.f10385M, true, 1, 25, strG);
            }
            try {
            } catch (Exception unused4) {
                yk.a.e();
            }
            String strB3 = fVar.q("88") == null ? null : fVar.q("88").b("01");
            T t16 = f;
            C.z0(strB3, t16, false, 0, 99, strG);
            String str12 = strB3;
            C.w0(t16, str12, strG);
            String str13 = str4;
            String str14 = str2;
            String str15 = str5;
            if (!Arrays.asList(strG3, strG, str15, str13, strG2, str14).contains(null)) {
                if (!"12".equals(strC)) {
                    amountBuild = null;
                } else {
                    if (dValueOf == null || dValueOf.doubleValue() <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                        throw new InvalidTagValueException("amount value", String.valueOf(dValueOf), "Invalid value of tag when point of initiation is dynamic");
                    }
                    amountBuild = Amount.sBuilder().mCurrency("PHP").mValue(String.valueOf(dValueOf)).build();
                }
                return new QRPHMerchantPaymentRequest(amountBuild, new QRPHMerchantDetails(strG3, str15, str13, str8, str9, strG, str7, str3, new QRPHMerchantAdditionalInfo(strG2, str6, str14, str12, strG4, str11, strC6)), strC, bool.booleanValue() ? str : null, bool.booleanValue() ? "PAPHPHM1XXX".equalsIgnoreCase(strG) ? strC.equals("11") ? "QR_ON_US_STATIC_QRPH" : "QR_ON_US_DYNAMIC_QRPH" : strC.equals("11") ? "QR_OFF_US_STATIC_QRPH" : "QR_OFF_US_DYNAMIC_QRPH" : null);
            }
            yk.a.a();
        } catch (Exception e7) {
            yk.a.b();
            if (e7 instanceof MayaQRErrorException) {
                throw ((MayaQRErrorException) e7);
            }
        }
        return null;
    }
}
