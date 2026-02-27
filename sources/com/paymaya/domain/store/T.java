package com.paymaya.domain.store;

import D8.C0214w;
import N5.D1;
import We.InterfaceC0604h;
import a.AbstractC0617a;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import androidx.recyclerview.widget.DiffUtil;
import bg.AbstractC0983W;
import cj.C1110A;
import cj.C1112C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.FinancialDocument;
import com.paymaya.domain.model.KycCaptureGuide;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycDocumentTypeGuide;
import com.paymaya.domain.model.KycIntro;
import com.paymaya.domain.model.KycLatestSubmissionContentData;
import com.paymaya.domain.model.KycSelfieTips;
import com.paymaya.domain.model.KycValidationField;
import com.paymaya.domain.model.KycValidationRule;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSetNewPasswordFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantOTPFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycSubmittedActivity;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycSubmittedFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelHomeFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelRouteSelectionFragment;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataPrivacyPolicyFragment;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardFragment;
import dOYHB6.yFtIp6.svM7M6;
import e1.InterfaceC1418b;
import g2.InterfaceC1496a;
import gc.C1516a;
import hb.InterfaceC1559b;
import i8.C1594b;
import ic.C1597a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import l3.C1798a;
import l9.C1804b;
import l9.C1809g;
import l9.C1819q;
import m8.InterfaceC1855b;
import ma.C1859a;
import mc.C1861a;
import n8.C1937e;
import n9.C1940c;
import n9.CountDownTimerC1939b;
import o9.InterfaceC1970a;
import o9.InterfaceC1972c;
import org.joda.time.LocalDateTime;
import org.json.JSONException;
import org.json.JSONObject;
import p9.InterfaceC2017b;
import p9.InterfaceC2019d;
import p9.InterfaceC2025j;
import retrofit2.Response;
import v.AbstractC2329d;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements Ch.c, Ch.f, InterfaceC0604h, f2.b, InterfaceC1496a, InterfaceC1418b, hh.o, W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11391b;

    public /* synthetic */ T(int i) {
        this.f11390a = i;
    }

    public static ArrayList c(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }

    public static String e(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // g2.InterfaceC1496a
    public void a(h2.p pVar) {
        this.f11391b = pVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        String formattedValue;
        final int i = 1;
        int i4 = 0;
        switch (this.f11390a) {
            case 0:
                Response response = (Response) obj;
                kotlin.jvm.internal.j.g(response, "response");
                String str = response.headers().get("Last-Modified");
                LocalDateTime localDateTimeC = AbstractC1234x.c(str);
                U u3 = (U) this.f11391b;
                String string = svM7M6.getString(u3.f11395d.f11330b, "key_financial_documents_date", null);
                LocalDateTime localDateTimeC2 = string != null ? AbstractC1234x.c(string) : null;
                if (localDateTimeC2 == null || localDateTimeC == null || localDateTimeC.isAfter(localDateTimeC2)) {
                    Ah.p<List<FinancialDocument>> financialDocuments = u3.c.getFinancialDocuments();
                    T3.l lVar = new T3.l(u3, 29);
                    Kh.I i6 = Eh.d.f1366d;
                    financialDocuments.getClass();
                    financialDocuments.f(new Gh.d(i, lVar, i6));
                }
                androidx.media3.datasource.cache.c.u(u3.f11395d.f11330b, "key_financial_documents_date", str);
                return;
            case 8:
                Pair p02 = (Pair) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                D8.E e = (D8.E) this.f11391b;
                kb.c cVar = (kb.c) e.c.get();
                KycCmsContent kycCmsContent = (KycCmsContent) p02.f18161b;
                ReKycSubmittedFragment reKycSubmittedFragment = (ReKycSubmittedFragment) cVar;
                reKycSubmittedFragment.getClass();
                kotlin.jvm.internal.j.g(kycCmsContent, "kycCmsContent");
                KeyEventDispatcher.Component componentRequireActivity = reKycSubmittedFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.rekyc.view.activity.IReKycSubmittedActivityView");
                ((ReKycSubmittedActivity) ((InterfaceC1559b) componentRequireActivity)).V1().e = kycCmsContent;
                e.p((KycLatestSubmissionContentData) p02.f18160a);
                return;
            case 9:
                List onlinePayments = (List) obj;
                kotlin.jvm.internal.j.g(onlinePayments, "onlinePayments");
                C1516a c1516a = (C1516a) this.f11391b;
                c1516a.getClass();
                c1516a.f = onlinePayments;
                if (onlinePayments.isEmpty()) {
                    return;
                }
                int iMin = Math.min(onlinePayments.size(), 10);
                N5.G0 g02 = ((MayaTravelHomeFragment) ((jc.b) c1516a.c.get())).f14196Z;
                if (g02 == null) {
                    kotlin.jvm.internal.j.n("mViewFeaturedPartnersLoading");
                    throw null;
                }
                g02.f3627b.setVisibility(8);
                Group group = ((MayaTravelHomeFragment) ((jc.b) c1516a.c.get())).f14195Y;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mGroupFeaturedPartners");
                    throw null;
                }
                group.setVisibility(0);
                jc.b bVar = (jc.b) c1516a.c.get();
                List transportOnlinePayment = onlinePayments.subList(0, iMin);
                MayaTravelHomeFragment mayaTravelHomeFragment = (MayaTravelHomeFragment) bVar;
                mayaTravelHomeFragment.getClass();
                kotlin.jvm.internal.j.g(transportOnlinePayment, "transportOnlinePayment");
                C1597a c1597a = mayaTravelHomeFragment.f14201e0;
                if (c1597a != null) {
                    ArrayList oldList = c1597a.f17130b;
                    kotlin.jvm.internal.j.g(oldList, "oldList");
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new C1861a(oldList, transportOnlinePayment));
                    kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                    oldList.clear();
                    oldList.addAll(transportOnlinePayment);
                    diffResultCalculateDiff.dispatchUpdatesTo(c1597a);
                    return;
                }
                return;
            case 10:
                List p03 = (List) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                Bb.f fVar = (Bb.f) this.f11391b;
                fVar.getClass();
                MayaTravelViewDataSelection mayaTravelViewDataSelectionQ1 = ((MayaTravelRouteSelectionFragment) ((jc.e) fVar.c.get())).Q1();
                if (mayaTravelViewDataSelectionQ1 != null) {
                    mayaTravelViewDataSelectionQ1.f14231d = C1110A.W(p03);
                }
                ((MayaTravelRouteSelectionFragment) ((jc.e) fVar.c.get())).L1();
                fVar.E(p03);
                return;
            case 13:
                ((MayaBaseFragment) ((InterfaceC1855b) ((C1594b) this.f11391b).c.get())).w1();
                PayMayaError payMayaErrorF = ((C1594b) this.f11391b).f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                C1594b c1594b = (C1594b) this.f11391b;
                ((MayaForgotPasswordSetNewPasswordFragment) ((InterfaceC1855b) c1594b.c.get())).J1(false);
                int iMErrorCode = payMayaErrorF.mErrorCode();
                if (iMErrorCode == -329) {
                    MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment = (MayaForgotPasswordSetNewPasswordFragment) ((InterfaceC1855b) c1594b.c.get());
                    n8.f fVar2 = mayaForgotPasswordSetNewPasswordFragment.f12385g0;
                    if (fVar2 != null) {
                        ((MayaForgotPasswordActivity) fVar2).X1(mayaForgotPasswordSetNewPasswordFragment.getString(R.string.maya_label_that_didnt_load_right), mayaForgotPasswordSetNewPasswordFragment.getString(R.string.maya_label_mfa_expires), mayaForgotPasswordSetNewPasswordFragment.getString(R.string.maya_label_button_back_to_login), mayaForgotPasswordSetNewPasswordFragment.getString(R.string.maya_label_button_retry), new C1937e(mayaForgotPasswordSetNewPasswordFragment, i), new C1937e(mayaForgotPasswordSetNewPasswordFragment, 2));
                        return;
                    }
                    return;
                }
                if (iMErrorCode == -19) {
                    MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment2 = (MayaForgotPasswordSetNewPasswordFragment) ((InterfaceC1855b) c1594b.c.get());
                    MayaProfileInputLayout mayaProfileInputLayout = mayaForgotPasswordSetNewPasswordFragment2.f12376X;
                    if (mayaProfileInputLayout == null) {
                        kotlin.jvm.internal.j.n("mMayaProfileInputLayoutConfirmNewPassword");
                        throw null;
                    }
                    mayaProfileInputLayout.setHelperErrorText(mayaForgotPasswordSetNewPasswordFragment2.getString(R.string.maya_change_password_error_new_password_the_same_as_current));
                    mayaProfileInputLayout.p();
                    return;
                }
                if (iMErrorCode != -255) {
                    n8.f fVar3 = ((MayaForgotPasswordSetNewPasswordFragment) ((InterfaceC1855b) c1594b.c.get())).f12385g0;
                    if (fVar3 != null) {
                        ((MayaForgotPasswordActivity) fVar3).V1(payMayaErrorF);
                        return;
                    }
                    return;
                }
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment3 = (MayaForgotPasswordSetNewPasswordFragment) ((InterfaceC1855b) c1594b.c.get());
                mayaForgotPasswordSetNewPasswordFragment3.getClass();
                n8.f fVar4 = mayaForgotPasswordSetNewPasswordFragment3.f12385g0;
                if (fVar4 != null) {
                    M2.b.Z(2131231347, mayaForgotPasswordSetNewPasswordFragment3.getString(R.string.maya_change_password_error_title), null, null, null, false, payMayaErrorF, null, false, 444).show(((MayaForgotPasswordActivity) fVar4).getSupportFragmentManager(), "error_dialog");
                    return;
                }
                return;
            case 16:
                M7.c cVar2 = (M7.c) this.f11391b;
                Object obj2 = (od.b) cVar2.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.UPDATE_CONSENTS);
                ((BaseFragment) obj2).o1(c1219hH);
                cVar2.f.U(false);
                pd.e eVar = ((DataPrivacyPolicyFragment) ((od.b) cVar2.c.get())).f14493X;
                if (eVar != null) {
                    DataPrivacyActivity dataPrivacyActivity = (DataPrivacyActivity) eVar;
                    dataPrivacyActivity.e.q(dataPrivacyActivity);
                    return;
                }
                return;
            case 20:
                final MerchantPayment merchantPayment = (MerchantPayment) obj;
                kotlin.jvm.internal.j.g(merchantPayment, "merchantPayment");
                C1804b c1804b = (C1804b) this.f11391b;
                y5.s sVar = (InterfaceC1970a) c1804b.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(14);
                c1219hH2.t(EnumC1217f.PAY);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH2.j.put("attribution", ((MayaBaseFragment) ((InterfaceC1970a) c1804b.c.get())).n1().f10371a);
                ((MayaBaseFragment) sVar).A1(c1219hH2);
                String strNormalizeRedirectUrl = merchantPayment.normalizeRedirectUrl();
                EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
                EnumC1215d enumC1215d = EnumC1215d.P2M;
                if (strNormalizeRedirectUrl == null) {
                    InterfaceC1970a interfaceC1970a = (InterfaceC1970a) c1804b.c.get();
                    String strMMerchantName = merchantPayment.mMerchantName();
                    Amount amountMAmount = merchantPayment.mAmount();
                    formattedValue = amountMAmount != null ? amountMAmount.getFormattedValue() : null;
                    MayaDynamicMerchantConfirmationFragment mayaDynamicMerchantConfirmationFragment = (MayaDynamicMerchantConfirmationFragment) interfaceC1970a;
                    mayaDynamicMerchantConfirmationFragment.getClass();
                    InterfaceC2017b interfaceC2017b = mayaDynamicMerchantConfirmationFragment.f12863Z;
                    if (interfaceC2017b != null) {
                        final MayaDynamicMerchantActivity mayaDynamicMerchantActivity = (MayaDynamicMerchantActivity) interfaceC2017b;
                        String string2 = mayaDynamicMerchantActivity.getString(R.string.maya_dialog_title_payment_sent, formattedValue);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        Object[] objArr = {strMMerchantName};
                        final int i10 = 0;
                        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(R.drawable.maya_ic_success, string2, mayaDynamicMerchantActivity.getString(R.string.maya_dialog_description_payment_sent, objArr), new Pair(mayaDynamicMerchantActivity.getString(R.string.maya_dialog_secondary_button_label), new com.squareup.wire.internal.a(mayaDynamicMerchantActivity, 15)), new Pair(mayaDynamicMerchantActivity.getString(R.string.maya_dialog_primary_button_label), new Function1() { // from class: n9.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                MerchantPayment merchantPayment2 = merchantPayment;
                                MayaDynamicMerchantActivity mayaDynamicMerchantActivity2 = mayaDynamicMerchantActivity;
                                EnumC1216e enumC1216e2 = EnumC1216e.SUCCESS;
                                EnumC1215d enumC1215d2 = EnumC1215d.P2M;
                                View it = (View) obj3;
                                switch (i10) {
                                    case 0:
                                        int i11 = MayaDynamicMerchantActivity.f12840r;
                                        j.g(it, "it");
                                        C1220i c1220iK1 = mayaDynamicMerchantActivity2.k1();
                                        C1219h c1219hD = C1219h.d(enumC1215d2);
                                        c1219hD.r(enumC1216e2);
                                        c1219hD.n(17);
                                        c1219hD.t(EnumC1217f.VIEW_RECEIPT);
                                        c1219hD.i();
                                        c1220iK1.c(mayaDynamicMerchantActivity2, c1219hD);
                                        mayaDynamicMerchantActivity2.W1(merchantPayment2);
                                        break;
                                    default:
                                        int i12 = MayaDynamicMerchantActivity.f12840r;
                                        j.g(it, "it");
                                        CountDownTimer countDownTimer = mayaDynamicMerchantActivity2.f12841n;
                                        if (countDownTimer != null) {
                                            countDownTimer.cancel();
                                        }
                                        C1220i c1220iK12 = mayaDynamicMerchantActivity2.k1();
                                        C1219h c1219hD2 = C1219h.d(enumC1215d2);
                                        c1219hD2.r(enumC1216e2);
                                        c1219hD2.n(17);
                                        c1219hD2.t(EnumC1217f.VIEW_RECEIPT);
                                        c1219hD2.i();
                                        c1220iK12.c(mayaDynamicMerchantActivity2, c1219hD2);
                                        mayaDynamicMerchantActivity2.W1(merchantPayment2);
                                        break;
                                }
                                return Unit.f18162a;
                            }
                        }), null, 96);
                        mayaAlertBottomSheetDialogFragmentN.setCancelable(false);
                        mayaAlertBottomSheetDialogFragmentN.s1(enumC1215d);
                        mayaAlertBottomSheetDialogFragmentN.f11820c0 = enumC1216e;
                        mayaAlertBottomSheetDialogFragmentN.show(mayaDynamicMerchantActivity.getSupportFragmentManager(), "success_dialog");
                        return;
                    }
                    return;
                }
                InterfaceC1970a interfaceC1970a2 = (InterfaceC1970a) c1804b.c.get();
                String strMMerchantName2 = merchantPayment.mMerchantName();
                Amount amountMAmount2 = merchantPayment.mAmount();
                formattedValue = amountMAmount2 != null ? amountMAmount2.getFormattedValue() : null;
                MayaDynamicMerchantConfirmationFragment mayaDynamicMerchantConfirmationFragment2 = (MayaDynamicMerchantConfirmationFragment) interfaceC1970a2;
                mayaDynamicMerchantConfirmationFragment2.getClass();
                InterfaceC2017b interfaceC2017b2 = mayaDynamicMerchantConfirmationFragment2.f12863Z;
                if (interfaceC2017b2 != null) {
                    final MayaDynamicMerchantActivity mayaDynamicMerchantActivity2 = (MayaDynamicMerchantActivity) interfaceC2017b2;
                    String string3 = mayaDynamicMerchantActivity2.getString(R.string.maya_dialog_title_payment_paid, formattedValue);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN2 = z2.d.n(R.drawable.maya_ic_success, string3, mayaDynamicMerchantActivity2.getString(R.string.maya_dialog_description_payment_sent, strMMerchantName2), new Pair(mayaDynamicMerchantActivity2.getString(R.string.maya_label_back_to_merchant), new C7.f(27, mayaDynamicMerchantActivity2, strNormalizeRedirectUrl)), null, new Pair(mayaDynamicMerchantActivity2.getString(R.string.maya_dialog_primary_button_label), new Function1() { // from class: n9.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            MerchantPayment merchantPayment2 = merchantPayment;
                            MayaDynamicMerchantActivity mayaDynamicMerchantActivity22 = mayaDynamicMerchantActivity2;
                            EnumC1216e enumC1216e2 = EnumC1216e.SUCCESS;
                            EnumC1215d enumC1215d2 = EnumC1215d.P2M;
                            View it = (View) obj3;
                            switch (i) {
                                case 0:
                                    int i11 = MayaDynamicMerchantActivity.f12840r;
                                    j.g(it, "it");
                                    C1220i c1220iK1 = mayaDynamicMerchantActivity22.k1();
                                    C1219h c1219hD = C1219h.d(enumC1215d2);
                                    c1219hD.r(enumC1216e2);
                                    c1219hD.n(17);
                                    c1219hD.t(EnumC1217f.VIEW_RECEIPT);
                                    c1219hD.i();
                                    c1220iK1.c(mayaDynamicMerchantActivity22, c1219hD);
                                    mayaDynamicMerchantActivity22.W1(merchantPayment2);
                                    break;
                                default:
                                    int i12 = MayaDynamicMerchantActivity.f12840r;
                                    j.g(it, "it");
                                    CountDownTimer countDownTimer = mayaDynamicMerchantActivity22.f12841n;
                                    if (countDownTimer != null) {
                                        countDownTimer.cancel();
                                    }
                                    C1220i c1220iK12 = mayaDynamicMerchantActivity22.k1();
                                    C1219h c1219hD2 = C1219h.d(enumC1215d2);
                                    c1219hD2.r(enumC1216e2);
                                    c1219hD2.n(17);
                                    c1219hD2.t(EnumC1217f.VIEW_RECEIPT);
                                    c1219hD2.i();
                                    c1220iK12.c(mayaDynamicMerchantActivity22, c1219hD2);
                                    mayaDynamicMerchantActivity22.W1(merchantPayment2);
                                    break;
                            }
                            return Unit.f18162a;
                        }
                    }), 80);
                    mayaAlertBottomSheetDialogFragmentN2.setCancelable(false);
                    mayaAlertBottomSheetDialogFragmentN2.s1(enumC1215d);
                    mayaAlertBottomSheetDialogFragmentN2.f11820c0 = enumC1216e;
                    mayaAlertBottomSheetDialogFragmentN2.show(mayaDynamicMerchantActivity2.getSupportFragmentManager(), "success_dialog");
                    mayaDynamicMerchantActivity2.f12842o = mayaAlertBottomSheetDialogFragmentN2;
                    mayaDynamicMerchantActivity2.f12841n = new CountDownTimerC1939b(mayaDynamicMerchantActivity2, strNormalizeRedirectUrl).start();
                    return;
                }
                return;
            case 21:
                MerchantPayment merchantPayment2 = (MerchantPayment) obj;
                kotlin.jvm.internal.j.g(merchantPayment2, "merchantPayment");
                C1804b c1804b2 = (C1804b) this.f11391b;
                y5.s sVar2 = (InterfaceC1972c) c1804b2.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(14);
                c1219hH3.t(EnumC1217f.PAY);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put("attribution", ((MayaBaseFragment) ((InterfaceC1972c) c1804b2.c.get())).n1().f10371a);
                ((MayaBaseFragment) sVar2).A1(c1219hH3);
                InterfaceC1972c interfaceC1972c = (InterfaceC1972c) c1804b2.c.get();
                String strMMerchantName3 = merchantPayment2.mMerchantName();
                Amount amountMAmount3 = merchantPayment2.mAmount();
                formattedValue = amountMAmount3 != null ? amountMAmount3.getFormattedValue() : null;
                MayaMerchantConfirmationFragment mayaMerchantConfirmationFragment = (MayaMerchantConfirmationFragment) interfaceC1972c;
                mayaMerchantConfirmationFragment.getClass();
                String string4 = mayaMerchantConfirmationFragment.getString(R.string.maya_dialog_title_payment_sent, formattedValue);
                kotlin.jvm.internal.j.f(string4, "getString(...)");
                String string5 = mayaMerchantConfirmationFragment.getString(R.string.maya_dialog_description_payment_sent, strMMerchantName3);
                kotlin.jvm.internal.j.f(string5, "getString(...)");
                InterfaceC2019d interfaceC2019d = mayaMerchantConfirmationFragment.f12875Z;
                if (interfaceC2019d != null) {
                    MayaMerchantActivity mayaMerchantActivity = (MayaMerchantActivity) interfaceC2019d;
                    EnumC1215d enumC1215d2 = EnumC1215d.P2M;
                    EnumC1216e enumC1216e2 = EnumC1216e.SUCCESS;
                    MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN3 = z2.d.n(R.drawable.maya_ic_success, string4, string5, new Pair(mayaMerchantActivity.getString(R.string.maya_dialog_secondary_button_label), new C1940c(mayaMerchantActivity, i4)), new Pair(mayaMerchantActivity.getString(R.string.maya_dialog_primary_button_label), new C7.f(28, mayaMerchantActivity, merchantPayment2)), null, 96);
                    mayaAlertBottomSheetDialogFragmentN3.setCancelable(false);
                    mayaAlertBottomSheetDialogFragmentN3.s1(enumC1215d2);
                    mayaAlertBottomSheetDialogFragmentN3.f11820c0 = enumC1216e2;
                    mayaAlertBottomSheetDialogFragmentN3.show(mayaMerchantActivity.getSupportFragmentManager(), "success_dialog");
                    return;
                }
                return;
            case 22:
                AccountBalance it = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(it, "it");
                MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) ((o9.d) ((C1809g) this.f11391b).c.get());
                mayaMerchantPaymentFragment.L1();
                new Handler(Looper.getMainLooper()).postDelayed(new androidx.window.layout.adapter.extensions.a(mayaMerchantPaymentFragment, 23), 200L);
                return;
            case 23:
                QRPHMerchantPaymentTransaction qrphMerchantPaymentTransaction = (QRPHMerchantPaymentTransaction) obj;
                kotlin.jvm.internal.j.g(qrphMerchantPaymentTransaction, "qrphMerchantPaymentTransaction");
                Bb.f fVar5 = (Bb.f) this.f11391b;
                fVar5.getClass();
                y5.s sVar3 = (o9.g) fVar5.c.get();
                C1219h c1219hH4 = AbstractC2329d.h(14);
                c1219hH4.t(EnumC1217f.CREATE);
                ((MayaBaseFragment) sVar3).A1(c1219hH4);
                MayaQRPHDynamicMerchantPaymentFragment mayaQRPHDynamicMerchantPaymentFragment = (MayaQRPHDynamicMerchantPaymentFragment) ((o9.g) fVar5.c.get());
                mayaQRPHDynamicMerchantPaymentFragment.getClass();
                InterfaceC2025j interfaceC2025j = mayaQRPHDynamicMerchantPaymentFragment.f12897Y;
                if (interfaceC2025j != null) {
                    MayaQRPHDynamicMerchantConfirmationFragment mayaQRPHDynamicMerchantConfirmationFragment = new MayaQRPHDynamicMerchantConfirmationFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("qr_ph_merchant_payment_transaction", qrphMerchantPaymentTransaction);
                    mayaQRPHDynamicMerchantConfirmationFragment.setArguments(bundle);
                    AbstractC1236z.h((MayaQRPHMerchantActivity) interfaceC2025j, R.id.maya_activity_qr_ph_merchant_fragment_container, mayaQRPHDynamicMerchantConfirmationFragment);
                    return;
                }
                return;
            case 24:
                ((MayaBaseFragment) ((o9.i) ((C0214w) this.f11391b).c.get())).w1();
                C0214w c0214w = (C0214w) this.f11391b;
                PayMayaError payMayaErrorF2 = c0214w.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                y5.s sVar4 = (o9.i) c0214w.c.get();
                C1219h c1219hH5 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH5.j.put(Constants.REASON, payMayaErrorF2.mSpiel());
                ((MayaBaseFragment) sVar4).A1(c1219hH5);
                if (payMayaErrorF2.mErrorCode() == -335) {
                    ((MayaQRPHMerchantOTPFragment) ((o9.i) c0214w.c.get())).X1(payMayaErrorF2.mSpiel());
                    return;
                } else {
                    ((MayaQRPHMerchantOTPFragment) ((o9.i) c0214w.c.get())).Y1(payMayaErrorF2);
                    return;
                }
            case 25:
                AccountBalance it2 = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) ((o9.j) ((C1819q) this.f11391b).c.get());
                mayaQRPHMerchantPaymentFragment.L1();
                new Handler(Looper.getMainLooper()).postDelayed(new androidx.window.layout.adapter.extensions.a(mayaQRPHMerchantPaymentFragment, 24), 200L);
                return;
            case 27:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                Group group2 = ((BaseMayaProfileFragment) ((pa.a) ((C1859a) this.f11391b).c.get())).f13529r0;
                if (group2 != null) {
                    group2.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mConstraintGroupSubmitInviteCode");
                    throw null;
                }
            default:
                ((Lb.a) this.f11391b).getClass();
                yk.a.b();
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) throws IOException {
        Object next;
        switch (this.f11390a) {
            case 1:
                KycCmsContent liveContent = (KycCmsContent) obj;
                kotlin.jvm.internal.j.g(liveContent, "liveContent");
                InputStream inputStreamOpen = ((Context) ((com.google.firebase.messaging.r) this.f11391b).e).getAssets().open("simple-capture-v8.json");
                kotlin.jvm.internal.j.f(inputStreamOpen, "open(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, C2581c.f21468b), 8192);
                try {
                    String strX = AbstractC0983W.x(bufferedReader);
                    bufferedReader.close();
                    Object objE = new com.google.gson.j().e(strX, KycCmsContent.class);
                    kotlin.jvm.internal.j.f(objE, "fromJson(...)");
                    KycCmsContentData data = liveContent.getData();
                    KycCmsContentData data2 = ((KycCmsContent) objE).getData();
                    KycIntro intro = data2.getIntro();
                    if (intro == null) {
                        intro = data.getIntro();
                    }
                    KycIntro kycIntro = intro;
                    KycSelfieTips selfieTips = data2.getSelfieTips();
                    if (selfieTips == null) {
                        selfieTips = data.getSelfieTips();
                    }
                    KycSelfieTips kycSelfieTips = selfieTips;
                    List<KycCaptureGuide> captureGuides = data.getCaptureGuides();
                    if (captureGuides == null) {
                        captureGuides = C1112C.f9377a;
                    }
                    List<KycCaptureGuide> captureGuides2 = data2.getCaptureGuides();
                    if (captureGuides2 == null) {
                        captureGuides2 = C1112C.f9377a;
                    }
                    List<KycCaptureGuide> list = captureGuides;
                    ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
                    Iterator<T> it = list.iterator();
                    while (true) {
                        Object obj2 = null;
                        if (!it.hasNext()) {
                            List<KycValidationRule> validationRules = data.getValidationRules();
                            if (validationRules == null) {
                                validationRules = C1112C.f9377a;
                            }
                            List<KycValidationRule> validationRules2 = data2.getValidationRules();
                            if (validationRules2 == null) {
                                validationRules2 = C1112C.f9377a;
                            }
                            Iterator<T> it2 = validationRules2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    List<KycValidationField> fields = ((KycValidationRule) next).getFields();
                                    if (fields != null) {
                                        List<KycValidationField> list2 = fields;
                                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                            for (KycValidationField kycValidationField : list2) {
                                                if (kotlin.jvm.internal.j.b(kycValidationField.getName(), "additionalAddress") || kotlin.jvm.internal.j.b(kycValidationField.getName(), "fullAddress")) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            KycValidationRule kycValidationRule = (KycValidationRule) next;
                            List<KycValidationRule> list3 = validationRules;
                            ArrayList arrayList2 = new ArrayList(cj.t.l(list3, 10));
                            for (KycValidationRule kycValidationRule2 : list3) {
                                List<KycValidationField> fields2 = kycValidationRule2.getFields();
                                if (fields2 != null) {
                                    List<KycValidationField> list4 = fields2;
                                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                        for (KycValidationField kycValidationField2 : list4) {
                                            if (kotlin.jvm.internal.j.b(kycValidationField2.getName(), "additionalAddress") || kotlin.jvm.internal.j.b(kycValidationField2.getName(), "fullAddress")) {
                                                if (kycValidationRule != null) {
                                                    kycValidationRule2 = kycValidationRule;
                                                }
                                            }
                                        }
                                    }
                                }
                                arrayList2.add(kycValidationRule2);
                            }
                            return KycCmsContent.copy$default(liveContent, KycCmsContentData.copy$default(data, null, null, kycIntro, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, kycSelfieTips, null, null, null, null, null, null, null, null, arrayList2, 133953531, null), null, 2, null);
                        }
                        KycCaptureGuide kycCaptureGuide = (KycCaptureGuide) it.next();
                        KycDocumentTypeGuide document = kycCaptureGuide.getDocument();
                        String key = document != null ? document.getKey() : null;
                        if (kotlin.jvm.internal.j.b(key, "DRIVERS_LICENSE") || kotlin.jvm.internal.j.b(key, "PASSPORT")) {
                            Iterator<T> it3 = captureGuides2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    KycDocumentTypeGuide document2 = ((KycCaptureGuide) next2).getDocument();
                                    if (kotlin.jvm.internal.j.b(document2 != null ? document2.getKey() : null, key)) {
                                        obj2 = next2;
                                    }
                                }
                            }
                            KycCaptureGuide kycCaptureGuide2 = (KycCaptureGuide) obj2;
                            if (kycCaptureGuide2 != null) {
                                kycCaptureGuide = kycCaptureGuide2;
                            }
                        }
                        arrayList.add(kycCaptureGuide);
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC0617a.p(bufferedReader, th2);
                        throw th3;
                    }
                }
                break;
            case 2:
                Response response = (Response) obj;
                kotlin.jvm.internal.j.g(response, "response");
                String str = response.headers().get("Last-Modified");
                LocalDateTime localDateTimeC = AbstractC1234x.c(str);
                L0 l02 = (L0) this.f11391b;
                String string = svM7M6.getString(l02.f11369d.f11330b, "key_shop_provider_category_date", null);
                LocalDateTime localDateTimeC2 = string != null ? AbstractC1234x.c(string) : null;
                if (localDateTimeC2 == null || localDateTimeC == null || localDateTimeC.isAfter(localDateTimeC2) || l02.b().size() <= 1) {
                    return new Lh.d(l02.c.getShopCategoriesV3(androidx.media3.datasource.cache.c.p("mobile_platform", "android")).d(Z.f11415n), new Y.e(22, l02, str), 2);
                }
                return Ah.p.c(C1112C.f9377a);
            default:
                Response response2 = (Response) obj;
                kotlin.jvm.internal.j.g(response2, "response");
                LocalDateTime localDateTimeC3 = AbstractC1234x.c(response2.headers().get("Last-Modified"));
                String string2 = svM7M6.getString(((Q0) this.f11391b).f11384d.f11330b, "key_shop_purchase_history_date", null);
                LocalDateTime localDateTimeC4 = string2 != null ? AbstractC1234x.c(string2) : null;
                return Boolean.valueOf(localDateTimeC4 == null || localDateTimeC3 == null || localDateTimeC3.isAfter(localDateTimeC4));
        }
    }

    @Override // f2.b
    public void b(Bundle bundle, String str) {
        h2.p pVar = (h2.p) this.f11391b;
        if (pVar != null) {
            try {
                String str2 = "$A$:" + e(bundle, str);
                h2.q qVar = pVar.f16896a;
                qVar.getClass();
                qVar.f16905p.f17092a.a(new h2.n(qVar, System.currentTimeMillis() - qVar.f16899d, str2, 1));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public synchronized void d(String str, Pattern pattern) {
        ((C1798a) this.f11391b).put(str, pattern);
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        String packageName = ((Context) ((d3.c) this.f11391b).f16259b).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // W6.e
    public void onDismiss() {
        ((MayaQRPHMerchantActivity) this.f11391b).X1().j();
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception e) {
        switch (this.f11390a) {
            case 4:
                dc.l lVar = (dc.l) this.f11391b;
                lVar.f16337g.setVisibility(0);
                lVar.f.setVisibility(8);
                break;
            default:
                kotlin.jvm.internal.j.g(e, "e");
                SendMoneyCardFragment sendMoneyCardFragment = (SendMoneyCardFragment) this.f11391b;
                D1 d12 = sendMoneyCardFragment.f14764S;
                if (d12 != null) {
                    kotlin.jvm.internal.j.d(d12);
                    ((ImageView) ((N5.I) d12.h).f).setImageResource(2131231797);
                    D1 d13 = sendMoneyCardFragment.f14764S;
                    kotlin.jvm.internal.j.d(d13);
                    ((FrameLayout) ((N5.I) d13.h).f3648g).setVisibility(0);
                }
                break;
        }
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        switch (this.f11390a) {
            case 4:
                dc.l lVar = (dc.l) this.f11391b;
                lVar.f16337g.setVisibility(8);
                lVar.f.setVisibility(0);
                break;
            default:
                D1 d12 = ((SendMoneyCardFragment) this.f11391b).f14764S;
                if (d12 != null) {
                    kotlin.jvm.internal.j.d(d12);
                    ((FrameLayout) ((N5.I) d12.h).f3648g).setVisibility(0);
                }
                break;
        }
    }

    @Override // hh.o
    public boolean test(Object obj) {
        return jh.e.a(obj, this.f11391b);
    }

    public /* synthetic */ T(Object obj, int i) {
        this.f11390a = i;
        this.f11391b = obj;
    }

    public T() {
        this.f11390a = 5;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f11391b = new gf.f();
    }

    public T(C1258f0 c1258f0) {
        this.f11390a = 14;
        this.f11391b = (LinkedHashMap) c1258f0.f11441b;
    }
}
