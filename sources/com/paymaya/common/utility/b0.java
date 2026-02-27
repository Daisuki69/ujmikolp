package com.paymaya.common.utility;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.androidadvance.topsnackbar.TSnackbar$SnackbarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.paymaya.R;
import com.paymaya.common.exception.MayaQRErrorException;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.QRAdditionalData;
import com.paymaya.domain.model.QRPHDetails;
import java.io.Serializable;
import java.util.List;
import k2.v0;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import x4.EnumC2464a;
import y4.C2506b;
import y4.C2507c;
import y4.C2508d;
import zj.C2578C;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f10693a = new b0();

    public static void a(String str) throws MayaQRErrorException {
        int length = str.length();
        T t5 = C.f10383K;
        if (length < 8) {
            a0[] a0VarArr = a0.f10692a;
            throw new MayaQRErrorException(t5, "parsingError", "", "");
        }
        if (zj.z.w(C2578C.f0(8, str), 2, "6304", false)) {
            return;
        }
        a0[] a0VarArr2 = a0.f10692a;
        throw new MayaQRErrorException(t5, "missingRequiredField", "", "");
    }

    public static String b(String str, y4.f fVar) {
        try {
            Serializable serializableD = fVar.d(str);
            if (serializableD instanceof String) {
                return (String) serializableD;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(C2508d c2508d, String str) {
        try {
            Serializable serializableD = c2508d.d(str);
            if (serializableD instanceof String) {
                return (String) serializableD;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static V d(QRPHDetails qRPHDetails) throws MayaQRErrorException {
        C2508d p2pMerchantAccountInformation = qRPHDetails.getP2pMerchantAccountInformation();
        C2508d p2mMerchantAccountInformation = qRPHDetails.getP2mMerchantAccountInformation();
        String acquirerId = qRPHDetails.getAcquirerId();
        String globalUniqueIdentifier = qRPHDetails.getGlobalUniqueIdentifier();
        T t5 = C.f10388P;
        if (p2pMerchantAccountInformation == null && p2mMerchantAccountInformation == null) {
            if (acquirerId == null) {
                acquirerId = "";
            }
            i(t5, acquirerId);
            throw null;
        }
        if (p2pMerchantAccountInformation != null && p2mMerchantAccountInformation != null) {
            if (acquirerId == null) {
                acquirerId = "";
            }
            h(t5, acquirerId, "");
            throw null;
        }
        if (p2pMerchantAccountInformation != null && p2mMerchantAccountInformation == null) {
            if (acquirerId == null) {
                i(C.f10396l, "");
                throw null;
            }
            T t10 = C.i;
            if (globalUniqueIdentifier == null) {
                i(t10, acquirerId);
                throw null;
            }
            Pair pair = new Pair(globalUniqueIdentifier, acquirerId);
            if (pair.equals(new Pair("com.p2pqrpay", "PAPHPHM1XXX"))) {
                return V.f10446b;
            }
            if (pair.equals(new Pair("com.p2pqrpay", acquirerId))) {
                return V.c;
            }
            h(t10, acquirerId, globalUniqueIdentifier);
            throw null;
        }
        if (p2pMerchantAccountInformation != null || p2mMerchantAccountInformation == null) {
            a0[] a0VarArr = a0.f10692a;
            if (acquirerId == null) {
                acquirerId = "";
            }
            throw new MayaQRErrorException(C.f10390R, "parsingError", "", acquirerId);
        }
        if (acquirerId == null) {
            i(C.m, "");
            throw null;
        }
        T t11 = C.h;
        if (globalUniqueIdentifier == null) {
            i(t11, acquirerId);
            throw null;
        }
        Pair pair2 = new Pair(globalUniqueIdentifier, acquirerId);
        if (pair2.equals(new Pair("ph.ppmi.p2m", "PAPHPHM1XXX")) || pair2.equals(new Pair("ph.ppmi.p2micro", "PAPHPHM1XXX"))) {
            return V.e;
        }
        if (pair2.equals(new Pair("ph.ppmi.p2m", acquirerId)) || pair2.equals(new Pair("ph.ppmi.p2micro", acquirerId))) {
            return V.f10447d;
        }
        if (pair2.equals(new Pair("ph.ppmi.p2b", acquirerId))) {
            return V.f;
        }
        h(t11, acquirerId, globalUniqueIdentifier);
        throw null;
    }

    public static void e(Activity activity, View view, String str, int i, int i4, int i6, int i10, int i11, int i12) {
        boolean zE;
        if ((i12 & 4) != 0) {
            str = null;
        }
        if ((i12 & 8) != 0) {
            i = 0;
        }
        if ((i12 & 256) != 0) {
            i10 = 1;
        }
        if ((i12 & 512) != 0) {
            i11 = 0;
        }
        kotlin.jvm.internal.j.g(view, "view");
        if (activity != null) {
            if (str == null) {
                if (i != 0) {
                    str = activity.getString(i);
                    kotlin.jvm.internal.j.f(str, "getString(...)");
                } else {
                    str = "";
                }
            }
            if (i10 != 1) {
                Snackbar snackbarMake = Snackbar.make(view, str, 0);
                kotlin.jvm.internal.j.f(snackbarMake, "make(...)");
                View view2 = snackbarMake.getView();
                kotlin.jvm.internal.j.f(view2, "getView(...)");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i11;
                view2.setLayoutParams(layoutParams);
                TextView textView = (TextView) view2.findViewById(R.id.snackbar_text);
                g(activity, i4, view2);
                kotlin.jvm.internal.j.d(textView);
                textView.setTextAlignment(4);
                if (i6 != 0) {
                    TextViewCompat.setTextAppearance(textView, i6);
                }
                if (snackbarMake.isShown()) {
                    snackbarMake.dismiss();
                }
                snackbarMake.show();
                return;
            }
            C.m mVarC = C.m.c(view, str);
            TSnackbar$SnackbarLayout tSnackbar$SnackbarLayout = mVarC.f663b;
            tSnackbar$SnackbarLayout.c = 3000;
            ViewGroup.LayoutParams layoutParams2 = tSnackbar$SnackbarLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i11;
            tSnackbar$SnackbarLayout.setLayoutParams(layoutParams2);
            TextView textView2 = (TextView) tSnackbar$SnackbarLayout.findViewById(R.id.snackbar_text);
            g(activity, i4, tSnackbar$SnackbarLayout);
            kotlin.jvm.internal.j.d(textView2);
            textView2.setTextAlignment(4);
            if (i6 != 0) {
                TextViewCompat.setTextAppearance(textView2, i6);
            }
            com.google.firebase.messaging.r rVarS = com.google.firebase.messaging.r.s();
            C.f fVar = mVarC.c;
            synchronized (rVarS.f9803b) {
                zE = rVarS.E(fVar);
            }
            if (zE) {
                mVarC.b(3);
            }
            mVarC.e();
        }
    }

    public static QRPHDetails f(String str) throws MayaQRErrorException {
        C2508d c2508dO;
        C2508d c2508dO2;
        Serializable serializableD;
        try {
            y4.f fVarA = v0.A(str);
            QRPHDetails qRPHDetails = new QRPHDetails(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
            qRPHDetails.setPayloadFormatIndicator(b(C.f10392b.f10434a, fVarA));
            qRPHDetails.setPointOfInitiation(b(C.c.f10434a, fVarA));
            String str2 = null;
            try {
                c2508dO = fVarA.o(C.f10393d.f10434a);
            } catch (Exception unused) {
                c2508dO = null;
            }
            if (c2508dO != null) {
                qRPHDetails.setP2pMerchantAccountInformation(c2508dO);
                qRPHDetails.setGlobalUniqueIdentifier(c(c2508dO, C.i.f10435b));
                qRPHDetails.setAcquirerId(c(c2508dO, C.f10396l.f10435b));
                qRPHDetails.setPaymentType(c(c2508dO, C.f10397n.f10435b));
                qRPHDetails.setMerchantId(c(c2508dO, C.j.f10435b));
                qRPHDetails.setCreditAccountNumber(c(c2508dO, C.f10398o.f10435b));
                qRPHDetails.setMobileNumber(c(c2508dO, C.f10400q.f10435b));
            }
            try {
                c2508dO2 = fVarA.o(C.e.f10434a);
            } catch (Exception unused2) {
                c2508dO2 = null;
            }
            if (c2508dO2 != null) {
                qRPHDetails.setP2mMerchantAccountInformation(c2508dO2);
                qRPHDetails.setGlobalUniqueIdentifier(c(c2508dO2, C.h.f10435b));
                qRPHDetails.setAcquirerId(c(c2508dO2, C.m.f10435b));
                qRPHDetails.setMerchantId(c(c2508dO2, C.f10395k.f10435b));
                qRPHDetails.setMerchantCreditAccountNumber(c(c2508dO2, C.f10399p.f10435b));
                qRPHDetails.setProxyNotifFlag(c(c2508dO2, C.f10401r.f10435b));
            }
            qRPHDetails.setMerchantCategoryCode(fVarA.c(x4.f.f));
            qRPHDetails.setTransactionCurrencyCode(fVarA.c(x4.f.f20918g));
            qRPHDetails.setTransactionAmount(fVarA.p());
            qRPHDetails.setConvenienceIndicator(fVarA.c(x4.f.i));
            String strC = fVarA.c(x4.f.j);
            if (strC == null) {
                strC = null;
            }
            qRPHDetails.setConvenienceFeeFixed(strC);
            String strC2 = fVarA.c(x4.f.f20919k);
            Double dValueOf = strC2 == null ? null : Double.valueOf(strC2);
            qRPHDetails.setConvenienceFeePercentage(dValueOf != null ? dValueOf.toString() : null);
            qRPHDetails.setMerchantCountryCode(fVarA.c(x4.f.f20920l));
            qRPHDetails.setMerchantName(fVarA.c(x4.f.m));
            qRPHDetails.setMerchantCity(fVarA.c(x4.f.f20921n));
            String strB = b(C.f10375B.f10434a, fVarA);
            qRPHDetails.setMerchantPostalCode(strB);
            C2506b c2506bN = fVarA.n();
            qRPHDetails.setAdditionalDataPayload(c2506bN);
            String str3 = C.f10394g.f10435b;
            if (c2506bN != null) {
                try {
                    serializableD = c2506bN.d(str3);
                } catch (Exception unused3) {
                }
            } else {
                serializableD = null;
            }
            String str4 = serializableD instanceof String ? (String) serializableD : null;
            qRPHDetails.setAdditionalData(new QRAdditionalData(str4, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_01_BILL_NUMBER) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_02_MOBILE_NUMBER) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_03_STORE_ID) : null, strB, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_04_LOYALTY_NUMBER) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_05_REFERENCE_ID) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_06_CONSUMER_ID) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_07_TERMINAL_ID) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_08_PURPOSE) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_09_ADDITIONAL_CONSUMER_DATA_REQUEST) : null));
            qRPHDetails.setMerchantCrc(fVarA.c(x4.f.f20925r));
            Serializable serializableE = fVarA.e(x4.f.f20924q);
            qRPHDetails.setLanguageData(serializableE == null ? null : (C2507c) serializableE);
            try {
                T t5 = C.f10387O;
                Serializable serializableD2 = fVarA.q(t5.f10434a).d(t5.f10435b);
                if (serializableD2 instanceof String) {
                    str2 = (String) serializableD2;
                }
            } catch (Exception unused4) {
            }
            qRPHDetails.setAcquirerRequiredInfo(str2);
            return qRPHDetails;
        } catch (Exception unused5) {
            a0[] a0VarArr = a0.f10692a;
            throw new MayaQRErrorException(C.f10390R, "parsingError", "", "");
        }
    }

    public static void g(Activity activity, int i, View view) {
        if (i != 0) {
            view.setBackground(ContextCompat.getDrawable(activity, i));
        }
    }

    public static void h(T t5, String str, String str2) throws MayaQRErrorException {
        a0[] a0VarArr = a0.f10692a;
        throw new MayaQRErrorException(t5, "invalidValue", str2, str);
    }

    public static void i(T t5, String str) throws MayaQRErrorException {
        a0[] a0VarArr = a0.f10692a;
        throw new MayaQRErrorException(t5, "missingRequiredField", "", str);
    }

    public static void k(QRPHDetails qRPHDetails, String str) throws MayaQRErrorException {
        String merchantCrc = qRPHDetails.getMerchantCrc();
        T t5 = C.f10383K;
        if (merchantCrc == null || merchantCrc.length() == 0) {
            i(t5, str);
            throw null;
        }
        for (int i = 0; i < merchantCrc.length(); i++) {
            if (Character.isLowerCase(merchantCrc.charAt(i))) {
                h(t5, str, merchantCrc);
                throw null;
            }
        }
        C2507c languageData = qRPHDetails.getLanguageData();
        if (languageData != null) {
            b0 b0Var = f10693a;
            m(b0Var, languageData.c(x4.d.f20911d), C.f10384L, true, null, null, 2, null, str, MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK);
            String strC = languageData.c(x4.d.e);
            IntRange intRange = U.f10444p;
            m(b0Var, strC, C.f10385M, true, null, intRange, null, null, str, 232);
            m(b0Var, languageData.c(x4.d.f), C.f10386N, false, null, intRange, null, null, str, 232);
        }
    }

    public static void l(String str, T t5, boolean z4, String str2, IntRange intRange, Integer num, List list, String str3, String str4) throws MayaQRErrorException {
        if (str == null || str.length() == 0) {
            if (z4) {
                i(t5, str4);
                throw null;
            }
            return;
        }
        if (list != null && !list.contains(str)) {
            h(t5, str4, str);
            throw null;
        }
        if (intRange != null && !intRange.a(str.length())) {
            a0[] a0VarArr = a0.f10692a;
            throw new MayaQRErrorException(t5, "invalidLength", str, str4);
        }
        if (num != null && str.length() != num.intValue()) {
            a0[] a0VarArr2 = a0.f10692a;
            throw new MayaQRErrorException(t5, "invalidLength", str, str4);
        }
        if ((str3 != null && str.equals(str3)) || str2 == null || new zj.o(str2, zj.q.f21494b).e(str)) {
            return;
        }
        h(t5, str4, str);
        throw null;
    }

    public static /* synthetic */ void m(b0 b0Var, String str, T t5, boolean z4, String str2, IntRange intRange, Integer num, List list, String str3, int i) throws MayaQRErrorException {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            intRange = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        String str4 = (i & 128) == 0 ? "***" : null;
        b0Var.getClass();
        l(str, t5, z4, str2, intRange, num, list, str4, str3);
    }

    public static void n(b0 b0Var, String str, T t5, List list, String str2, int i) throws MayaQRErrorException {
        Integer num = (i & 16) != 0 ? null : 11;
        List list2 = (i & 32) != 0 ? null : list;
        b0Var.getClass();
        l(str, t5, true, null, null, num, list2, null, str2);
        kotlin.jvm.internal.j.d(str);
    }

    public void j(QRPHDetails qRPHDetails, String str, String str2) throws MayaQRErrorException {
        m(this, qRPHDetails.getTransactionCurrencyCode(), C.f10403t, true, null, null, null, W.f10452d, str2, 184);
        String transactionAmount = qRPHDetails.getTransactionAmount();
        if (str.equals("12") && transactionAmount == null) {
            i(C.f10404u, str2);
            throw null;
        }
        String convenienceIndicator = qRPHDetails.getConvenienceIndicator();
        if (convenienceIndicator != null) {
            b0 b0Var = f10693a;
            m(b0Var, convenienceIndicator, C.f10405v, false, null, null, 2, W.f, str2, 152);
            if (convenienceIndicator.equals("02")) {
                m(b0Var, qRPHDetails.getConvenienceFeeFixed(), C.f10406w, true, null, U.f10442n, null, null, str2, 232);
            } else if (convenienceIndicator.equals("03")) {
                m(b0Var, qRPHDetails.getConvenienceFeePercentage(), C.f10407x, true, null, U.f10443o, null, null, str2, 232);
            }
        }
        m(this, qRPHDetails.getMerchantCountryCode(), C.f10408y, true, null, null, 2, W.e, str2, 152);
        m(this, qRPHDetails.getMerchantName(), C.f10409z, true, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", U.m, null, null, str2, 224);
        m(this, qRPHDetails.getMerchantCity(), C.f10374A, true, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", U.f10437b, null, null, str2, 224);
        m(this, qRPHDetails.getMerchantPostalCode(), C.f10375B, false, null, U.c, null, null, str2, 232);
    }

    public void o(QRPHDetails qRPHDetails) throws MayaQRErrorException {
        QRAdditionalData additionalData;
        String acquirerId = qRPHDetails.getAcquirerId();
        n(this, acquirerId, C.m, null, "", 108);
        m(this, qRPHDetails.getPayloadFormatIndicator(), C.f10392b, true, null, null, null, cj.r.c("01"), acquirerId, 184);
        String pointOfInitiation = qRPHDetails.getPointOfInitiation();
        n(this, pointOfInitiation, C.c, W.f10450a, acquirerId, 92);
        m(this, qRPHDetails.getGlobalUniqueIdentifier(), C.h, true, null, U.f, null, null, acquirerId, 232);
        m(this, qRPHDetails.getMerchantId(), C.f10395k, true, null, U.f10441l, null, null, acquirerId, 232);
        m(this, qRPHDetails.getMerchantCreditAccountNumber(), C.f10399p, false, null, U.i, null, null, acquirerId, 232);
        m(this, qRPHDetails.getProxyNotifFlag(), C.f10401r, true, null, null, 3, null, acquirerId, MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK);
        m(this, qRPHDetails.getMerchantCategoryCode(), C.f10402s, true, null, null, 4, null, acquirerId, MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK);
        j(qRPHDetails, pointOfInitiation, acquirerId);
        if (qRPHDetails.getAdditionalDataPayload() != null && (additionalData = qRPHDetails.getAdditionalData()) != null) {
            b0 b0Var = f10693a;
            m(b0Var, additionalData.getGlobalUniqueIdentifier(), C.f10394g, true, null, U.f10439g, null, null, acquirerId, 232);
            m(b0Var, additionalData.getAdditionalMobileNumber(), C.f10376C, false, "\\+\\d{1,3}-[0-9()+-]{1,30}", null, null, null, acquirerId, 112);
            m(b0Var, additionalData.getStoreName(), C.f10377D, false, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", U.e, null, null, acquirerId, 224);
            String loyaltyNumber = additionalData.getLoyaltyNumber();
            IntRange intRange = U.f10436a;
            m(b0Var, loyaltyNumber, C.f10378E, false, null, intRange, null, null, acquirerId, 232);
            m(b0Var, additionalData.getReferenceId(), C.f10379F, false, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", U.f10438d, null, null, acquirerId, 224);
            m(b0Var, additionalData.getCustomerLabel(), C.f10380G, false, null, intRange, null, null, acquirerId, 232);
            m(b0Var, additionalData.getTerminalId(), C.f10381H, false, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", null, 8, null, acquirerId, 208);
            m(b0Var, additionalData.getPurpose(), C.f10382I, false, null, null, 3, null, acquirerId, MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK);
            m(b0Var, additionalData.getAdditionalRequestData(), C.J, false, null, U.f10445q, null, null, acquirerId, 232);
        }
        k(qRPHDetails, acquirerId);
    }

    public void p(QRPHDetails qRPHDetails) throws MayaQRErrorException {
        QRAdditionalData additionalData;
        String acquirerId = qRPHDetails.getAcquirerId();
        n(this, acquirerId, C.f10396l, null, "", 108);
        m(this, qRPHDetails.getPayloadFormatIndicator(), C.f10392b, true, null, null, null, cj.r.c("01"), acquirerId, 184);
        String pointOfInitiation = qRPHDetails.getPointOfInitiation();
        n(this, pointOfInitiation, C.c, W.f10450a, acquirerId, 92);
        m(this, qRPHDetails.getGlobalUniqueIdentifier(), C.i, true, null, U.f, null, null, acquirerId, 232);
        m(this, qRPHDetails.getPaymentType(), C.f10397n, true, null, null, null, W.f10451b, acquirerId, 184);
        m(this, qRPHDetails.getMerchantId(), C.j, false, null, U.j, null, null, acquirerId, 232);
        m(this, qRPHDetails.getCreditAccountNumber(), C.f10398o, true, null, U.h, null, null, acquirerId, 232);
        m(this, qRPHDetails.getMobileNumber(), C.f10400q, false, "\\+\\d{1,3}-[0-9()+-]{1,30}", U.f10440k, null, null, acquirerId, 224);
        m(this, qRPHDetails.getMerchantCategoryCode(), C.f10402s, true, null, null, 4, W.c, acquirerId, 152);
        j(qRPHDetails, pointOfInitiation, acquirerId);
        if (qRPHDetails.getAdditionalDataPayload() != null && (additionalData = qRPHDetails.getAdditionalData()) != null) {
            b0 b0Var = f10693a;
            m(b0Var, additionalData.getGlobalUniqueIdentifier(), C.f, true, null, U.f10439g, null, null, acquirerId, 232);
            m(b0Var, additionalData.getAdditionalMobileNumber(), C.f10376C, false, "\\+\\d{1,3}-[0-9()+-]{1,30}", null, null, null, acquirerId, 112);
            m(b0Var, additionalData.getStoreName(), C.f10377D, false, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", U.e, null, null, acquirerId, 224);
            String loyaltyNumber = additionalData.getLoyaltyNumber();
            IntRange intRange = U.f10436a;
            m(b0Var, loyaltyNumber, C.f10378E, false, null, intRange, null, null, acquirerId, 232);
            m(b0Var, additionalData.getReferenceId(), C.f10379F, false, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", U.f10438d, null, null, acquirerId, 224);
            m(b0Var, additionalData.getCustomerLabel(), C.f10380G, false, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", intRange, null, null, acquirerId, 96);
            m(b0Var, additionalData.getTerminalId(), C.f10381H, true, "^[A-Za-z0-9_~`!@#$%^&*()\\-\\+={}\\[\\]\\\\|:;\"'<>,.?/Ññ ]+$", null, 8, null, acquirerId, 208);
        }
        k(qRPHDetails, acquirerId);
    }
}
