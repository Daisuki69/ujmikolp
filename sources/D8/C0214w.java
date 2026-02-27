package D8;

import D8.C0214w;
import K8.InterfaceC0283h;
import M8.D0;
import M8.InterfaceC0345d0;
import M8.T2;
import N5.C0447e;
import N5.C0450f;
import N5.k1;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import cj.C1112C;
import com.appsflyer.AppsFlyerProperties;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.e0;
import com.paymaya.common.utility.i0;
import com.paymaya.data.api.PayMayaCardApi;
import com.paymaya.domain.model.AddMoneyViaCardSettings;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.KycBenefit;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.model.Route;
import com.paymaya.domain.model.Stop;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1256e0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1268k0;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.C1279q;
import com.paymaya.domain.store.C1281r0;
import com.paymaya.domain.store.C1284t;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.domain.store.E0;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.c1;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompleteYourMayaExperienceFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.ExpandableBenefitsRecyclerView;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantOTPFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditOTPFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelStopSelectionFragment;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;
import com.paymaya.ui.common.view.fragment.impl.UpgradePayMayaPlusFragment;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import e2.C1421c;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import l9.C1815m;
import o9.InterfaceC1971b;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import p9.InterfaceC2018c;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: renamed from: D8.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0214w extends AbstractC2509a implements y5.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1105d;
    public final Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0214w(y5.f fVar, Uh.d dVar, int i) {
        super(dVar);
        this.f1105d = i;
        this.e = fVar;
    }

    public static int l(Stop stop, List list) {
        List list2;
        if (stop == null || (list2 = list) == null || list2.isEmpty()) {
            return -1;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.j.b(((Stop) it.next()).mId(), stop.mId())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void A() {
        final int i = 1;
        int i4 = 5;
        int i6 = 18;
        int i10 = 2;
        int i11 = 19;
        final int i12 = 0;
        ArrayList<Consent> arrayList = ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).f12290f0;
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.SAVE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("source", ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).f12289e0);
        c1219hH.j.put("screen_name", "secondary_consents");
        String str = ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).u1().f10786a;
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.j.f(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        c1219hH.j.put("module", lowerCase);
        c1219hH.i();
        for (Consent consent : arrayList) {
            c1219hH.g(consent.mID(), String.valueOf(consent.isEnabled()));
        }
        ((MayaBaseFragment) ((R7.b) this.c.get())).z1(c1219hH);
        ((MayaBaseFragment) ((R7.b) this.c.get())).E1();
        if (!"registration".equalsIgnoreCase(((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).f12289e0)) {
            HashMap map = new HashMap();
            for (Consent consent2 : arrayList) {
                map.put(consent2.mID(), Boolean.valueOf(consent2.isEnabled()));
            }
            Ah.p pVarA = ((C1284t) this.f1106g).a(map);
            new Kh.T(i4, new Lh.d(new Lh.d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new Gc.h(this, i6), i10), new G6.w(this, i11), i12), new Ch.a(this) { // from class: M7.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0214w f3129b;

                {
                    this.f3129b = this;
                }

                @Override // Ch.a
                public final void run() {
                    switch (i) {
                        case 0:
                            ((MayaBaseFragment) ((R7.b) this.f3129b.c.get())).w1();
                            break;
                        default:
                            ((MayaBaseFragment) ((R7.b) this.f3129b.c.get())).w1();
                            break;
                    }
                }
            }).e();
            return;
        }
        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get());
        mayaDataPrivacyDataPersonalizationFragment.getClass();
        S7.f fVar = mayaDataPrivacyDataPersonalizationFragment.f12287c0;
        if (fVar != null) {
            fVar.u0(arrayList);
        }
        S7.f fVar2 = ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).f12287c0;
        OngoingRegistration ongoingRegistrationJ0 = fVar2 != null ? fVar2.j0() : null;
        if (ongoingRegistrationJ0 == null) {
            return;
        }
        new Lh.d(new Kh.T(i4, new Lh.d(new Lh.d(new Lh.h(((E0) this.f).a(ongoingRegistrationJ0.getRegisteringUser(), ongoingRegistrationJ0.getRegisteringLoginIdentity(), ongoingRegistrationJ0.getRegisteringEmailIdentity(), ongoingRegistrationJ0.getConsentsList()), zh.b.a(), 0), new G6.u((Object) this, i11), i10), new Gb.d(this, i6), i12), new Ch.a(this) { // from class: M7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0214w f3129b;

            {
                this.f3129b = this;
            }

            @Override // Ch.a
            public final void run() {
                switch (i12) {
                    case 0:
                        ((MayaBaseFragment) ((R7.b) this.f3129b.c.get())).w1();
                        break;
                    default:
                        ((MayaBaseFragment) ((R7.b) this.f3129b.c.get())).w1();
                        break;
                }
            }
        }), new G6.v(this, 20), i).e();
    }

    @Override // y5.e
    public void b() {
        Ah.a aVarResendCreditVerification;
        int i = 1;
        int i4 = 0;
        switch (this.f1105d) {
            case 6:
                ((MayaBaseFragment) ((P9.m) this.c.get())).E1();
                C1264i0 c1264i0 = (C1264i0) this.f;
                String str = (String) this.f1106g;
                kotlin.jvm.internal.j.d(str);
                c1264i0.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("otp_id", str);
                    break;
                } catch (JSONException unused) {
                    yk.a.e();
                }
                byte[] bytes = jSONObject.toString().getBytes(Charset.forName("UTF-8"));
                if (c1264i0.i()) {
                    HashMap mapA = C1264i0.a(c1264i0);
                    kotlin.jvm.internal.j.d(bytes);
                    aVarResendCreditVerification = c1264i0.c.resendCreditVerification(mapA, C1264i0.g(bytes));
                    kotlin.jvm.internal.j.d(aVarResendCreditVerification);
                } else {
                    kotlin.jvm.internal.j.d(bytes);
                    aVarResendCreditVerification = c1264i0.f11449b.resendCreditVerification(C1264i0.g(bytes));
                    kotlin.jvm.internal.j.d(aVarResendCreditVerification);
                }
                e(new Hh.f(aVarResendCreditVerification, zh.b.a(), 0).a(new L9.C(this, i)).b(new Gc.h(this, 10)).c());
                return;
            default:
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = ((MayaQRPHMerchantOTPFragment) ((o9.i) this.c.get())).f12908l0;
                if (qRPHMerchantPaymentTransaction == null) {
                    kotlin.jvm.internal.j.n("mQRPHMerchantPaymentTransaction");
                    throw null;
                }
                String authChallengeId = qRPHMerchantPaymentTransaction.getAuthChallengeId();
                if (authChallengeId == null) {
                    return;
                }
                ((MayaBaseFragment) ((o9.i) this.c.get())).E1();
                Ah.p<MFAChallengeInformation> pVarResendMFAChallenge = ((C1278p0) this.f1106g).f11471b.resendMFAChallenge(authChallengeId);
                e(new Kh.T(5, new Lh.d(AbstractC1331a.l(pVarResendMFAChallenge, pVarResendMFAChallenge, zh.b.a()), new A0(this, 21), i4), new C1815m(this, 0)).e());
                return;
        }
    }

    @Override // y5.e
    public void c() {
        Ah.a aVarVerifyCreditApplicationWithCreditScore;
        int i = 0;
        switch (this.f1105d) {
            case 6:
                String strL1 = ((MayaAbstractBaseOTPFragmentImpl) ((P9.m) this.c.get())).L1();
                if (strL1.length() == 0 || strL1.length() < 6) {
                    MayaAbstractBaseOTPFragmentImpl mayaAbstractBaseOTPFragmentImpl = (MayaAbstractBaseOTPFragmentImpl) ((P9.m) this.c.get());
                    for (TextView textView : mayaAbstractBaseOTPFragmentImpl.H1()) {
                        CharSequence text = textView.getText();
                        if (text == null || text.length() == 0) {
                            textView.setBackground(ContextCompat.getDrawable(mayaAbstractBaseOTPFragmentImpl.requireContext(), R.drawable.maya_bg_selector_otp_digit_field_error));
                        } else {
                            textView.setBackground(ContextCompat.getDrawable(mayaAbstractBaseOTPFragmentImpl.requireContext(), R.drawable.maya_bg_selector_otp_digit_field_default));
                        }
                    }
                    return;
                }
                ((MayaBaseFragment) ((P9.m) this.c.get())).E1();
                C1264i0 c1264i0 = (C1264i0) this.f;
                String strB = i0.b();
                kotlin.jvm.internal.j.f(strB, "getSessionId(...)");
                String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                String str = (String) this.f1106g;
                kotlin.jvm.internal.j.d(str);
                String strL12 = ((MayaAbstractBaseOTPFragmentImpl) ((P9.m) this.c.get())).L1();
                ((NewMayaCreditOTPFragment) ((P9.m) this.c.get())).getClass();
                int i4 = Build.VERSION.SDK_INT;
                c1264i0.getClass();
                String string = UUID.randomUUID().toString();
                String strValueOf = String.valueOf(i4);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(TtmlNode.ATTR_ID, strB);
                    break;
                } catch (JSONException unused) {
                    yk.a.e();
                }
                try {
                    jSONObject.put(AppsFlyerProperties.CHANNEL, lowerCase);
                    break;
                } catch (JSONException unused2) {
                    yk.a.e();
                }
                try {
                    jSONObject.put("version", strValueOf);
                    break;
                } catch (JSONException unused3) {
                    yk.a.e();
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("otpId", str);
                    break;
                } catch (JSONException unused4) {
                    yk.a.e();
                }
                try {
                    jSONObject2.put("otpCode", strL12);
                    break;
                } catch (JSONException unused5) {
                    yk.a.e();
                }
                try {
                    jSONObject2.put("requestReferenceNo", string);
                    break;
                } catch (JSONException unused6) {
                    yk.a.e();
                }
                try {
                    jSONObject2.put("productKey", "MAYA_CREDIT_CONSUMER_LOAN");
                    break;
                } catch (JSONException unused7) {
                    yk.a.e();
                }
                try {
                    jSONObject2.put("device", jSONObject);
                    break;
                } catch (JSONException unused8) {
                    yk.a.e();
                }
                byte[] bytes = jSONObject2.toString().getBytes(Charset.forName("UTF-8"));
                if (c1264i0.i()) {
                    HashMap mapA = C1264i0.a(c1264i0);
                    kotlin.jvm.internal.j.d(bytes);
                    aVarVerifyCreditApplicationWithCreditScore = c1264i0.c.verifyCreditApplicationWithCreditScore(mapA, C1264i0.g(bytes));
                    kotlin.jvm.internal.j.d(aVarVerifyCreditApplicationWithCreditScore);
                } else {
                    kotlin.jvm.internal.j.d(bytes);
                    aVarVerifyCreditApplicationWithCreditScore = c1264i0.f11449b.verifyCreditApplicationWithCreditScore(C1264i0.g(bytes));
                    kotlin.jvm.internal.j.d(aVarVerifyCreditApplicationWithCreditScore);
                }
                e(new Hh.f(aVarVerifyCreditApplicationWithCreditScore, zh.b.a(), 0).a(new L9.C(this, i)).b(new G6.w(this, 12)).c());
                return;
            default:
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = ((MayaQRPHMerchantOTPFragment) ((o9.i) this.c.get())).f12908l0;
                if (qRPHMerchantPaymentTransaction == null) {
                    kotlin.jvm.internal.j.n("mQRPHMerchantPaymentTransaction");
                    throw null;
                }
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction2 = ((MayaQRPHMerchantOTPFragment) ((o9.i) this.c.get())).f12908l0;
                if (qRPHMerchantPaymentTransaction2 == null) {
                    kotlin.jvm.internal.j.n("mQRPHMerchantPaymentTransaction");
                    throw null;
                }
                String authChallengeId = qRPHMerchantPaymentTransaction2.getAuthChallengeId();
                String strL13 = ((MayaAbstractBaseOTPFragmentImpl) ((o9.i) this.c.get())).L1();
                if (strL13.length() == 0) {
                    MayaQRPHMerchantOTPFragment mayaQRPHMerchantOTPFragment = (MayaQRPHMerchantOTPFragment) ((o9.i) this.c.get());
                    mayaQRPHMerchantOTPFragment.X1(mayaQRPHMerchantOTPFragment.getString(R.string.pma_label_otp_missing));
                    return;
                } else if (strL13.length() < 6) {
                    MayaQRPHMerchantOTPFragment mayaQRPHMerchantOTPFragment2 = (MayaQRPHMerchantOTPFragment) ((o9.i) this.c.get());
                    mayaQRPHMerchantOTPFragment2.X1(mayaQRPHMerchantOTPFragment2.getString(R.string.pma_label_otp_invalid));
                    return;
                } else {
                    if (authChallengeId != null) {
                        ((MayaBaseFragment) ((o9.i) this.c.get())).E1();
                        Ah.p pVarB = ((C1278p0) this.f1106g).b("qrph", authChallengeId, ((MayaAbstractBaseOTPFragmentImpl) ((o9.i) this.c.get())).L1());
                        e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarB, pVarB, zh.b.a()), new C1421c(18, this, qRPHMerchantPaymentTransaction), 2), new com.paymaya.domain.store.L(this, 25), i).e());
                        return;
                    }
                    return;
                }
        }
    }

    @Override // y5.e
    public long d() {
        switch (this.f1105d) {
        }
        return ((com.paymaya.data.preference.a) this.e).e().mResendCodeCountdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y5.AbstractC2509a
    public void j() {
        KycCmsContentData data;
        List<KycBenefit> benefits;
        Intent intent;
        Intent intent2;
        int i = 2;
        int i4 = 1;
        List listQ = null;
        listQ = null;
        listQ = null;
        switch (this.f1105d) {
            case 0:
                super.j();
                com.paymaya.data.preference.a aVar = (com.paymaya.data.preference.a) this.e;
                if (kotlin.jvm.internal.j.b(aVar.l(), "submitted") || kotlin.jvm.internal.j.b(aVar.x(), "submitted")) {
                    InterfaceC0345d0 interfaceC0345d0 = ((MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get())).f12496X;
                    if (interfaceC0345d0 != null) {
                        MayaKycActivity mayaKycActivity = (MayaKycActivity) interfaceC0345d0;
                        mayaKycActivity.n1();
                        B5.i.N(mayaKycActivity);
                        mayaKycActivity.finish();
                    }
                } else {
                    FragmentActivity fragmentActivityRequireActivity = ((MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity)).Z1().f;
                    if (kycCmsContent != null && (data = kycCmsContent.getData()) != null && (benefits = data.getBenefits()) != null) {
                        listQ = C1110A.Q(new C0213v(), benefits);
                    }
                    if (listQ == null) {
                        listQ = C1112C.f9377a;
                    }
                    if (listQ.isEmpty()) {
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment = (MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get());
                        ((N5.Y) mayaKycCompleteYourMayaExperienceFragment.G1()).f4035g.setVisibility(8);
                        ((N5.Y) mayaKycCompleteYourMayaExperienceFragment.G1()).f.setVisibility(8);
                    } else {
                        MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment2 = (MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get());
                        mayaKycCompleteYourMayaExperienceFragment2.getClass();
                        ExpandableBenefitsRecyclerView expandableBenefitsRecyclerView = ((N5.Y) mayaKycCompleteYourMayaExperienceFragment2.G1()).f;
                        C0447e c0447e = expandableBenefitsRecyclerView.e;
                        ((LinearLayout) c0447e.f4079b).setVisibility(listQ.size() > 3 ? 0 : 8);
                        RecyclerView recyclerView = (RecyclerView) c0447e.f4080d;
                        recyclerView.setNestedScrollingEnabled(false);
                        recyclerView.setLayoutManager(new GridLayoutManager(expandableBenefitsRecyclerView.getContext(), 3));
                        We.A aD = We.A.d();
                        kotlin.jvm.internal.j.f(aD, "get(...)");
                        recyclerView.setAdapter(new J8.f(listQ, aD));
                    }
                    MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment3 = (MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get());
                    mayaKycCompleteYourMayaExperienceFragment3.getClass();
                    T2.I(mayaKycCompleteYourMayaExperienceFragment3, "INITIAL_LOADING");
                }
                boolean zB = S5.c.b((S5.c) this.f, A5.b.f124o0);
                boolean zB2 = S5.c.b((S5.c) this.f, A5.b.f129q0);
                String strE = S5.c.e((S5.c) this.f, A5.g.f);
                if (zB) {
                    FragmentActivity fragmentActivityRequireActivity2 = ((MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity2)).o2(R.drawable.maya_ic_close);
                } else {
                    FragmentActivity fragmentActivityRequireActivity3 = ((MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(fragmentActivityRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) fragmentActivityRequireActivity3)).k2();
                }
                ((N5.Y) ((MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get())).G1()).h.setVisibility(zB2 ? 0 : 8);
                String strL = ((com.paymaya.data.preference.a) this.e).l();
                if (kotlin.jvm.internal.j.b(strL, "kyc0")) {
                    ((N5.Y) ((MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get())).G1()).e.setText(kotlin.jvm.internal.j.b(strE, "upgrade_for_free") ? ((e0) this.f1106g).a(R.string.maya_kyc_complete_your_maya_experience_upgrade_for_free) : kotlin.jvm.internal.j.b(strE, "verify_now") ? ((e0) this.f1106g).a(R.string.maya_kyc_complete_your_maya_experience_verify_now) : ((e0) this.f1106g).a(R.string.maya_kyc_complete_your_maya_experience_lets_go_button_text));
                    ((N5.Y) ((MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get())).G1()).h.setText(((e0) this.f1106g).a(R.string.maya_label_do_later));
                    return;
                } else {
                    if (kotlin.jvm.internal.j.b(strL, "kyc1")) {
                        ((N5.Y) ((MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get())).G1()).e.setText(((e0) this.f1106g).a(R.string.maya_kyc_complete_your_maya_experience_lets_go_button_text));
                        ((N5.Y) ((MayaKycCompleteYourMayaExperienceFragment) ((InterfaceC0283h) this.c.get())).G1()).h.setText(((e0) this.f1106g).a(R.string.maya_label_do_later));
                        return;
                    }
                    return;
                }
            case 1:
            case 3:
            case 4:
            case 6:
            case 9:
            case 10:
            default:
                super.j();
                return;
            case 2:
                super.j();
                ((InvestPreviewFragment) ((Gd.a) this.c.get())).w1();
                String strMFirstName = ((C1293x0) this.f).j().mFirstName();
                if (strMFirstName == null) {
                    strMFirstName = "";
                }
                String strL2 = ((com.paymaya.data.preference.a) this.e).l();
                if (kotlin.jvm.internal.j.b(strL2, "kyc1")) {
                    InvestPreviewFragment investPreviewFragment = (InvestPreviewFragment) ((Gd.a) this.c.get());
                    investPreviewFragment.getClass();
                    k1 k1Var = investPreviewFragment.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var);
                    ((N5.A) k1Var.f4138b).c.setText(HtmlCompat.fromHtml(investPreviewFragment.getString(R.string.pma_format_invest_for_upgraded, strMFirstName), 63));
                    k1 k1Var2 = investPreviewFragment.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var2);
                    ((N5.A) k1Var2.f4138b).f3538b.setVisibility(0);
                    k1 k1Var3 = investPreviewFragment.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var3);
                    ((ConstraintLayout) ((k1) k1Var3.c).e).setVisibility(8);
                } else if (kotlin.jvm.internal.j.b(strL2, "kyc0")) {
                    InvestPreviewFragment investPreviewFragment2 = (InvestPreviewFragment) ((Gd.a) this.c.get());
                    investPreviewFragment2.getClass();
                    k1 k1Var4 = investPreviewFragment2.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var4);
                    TextView textView = (TextView) ((k1) k1Var4.c).f;
                    textView.setVisibility(0);
                    textView.setOnClickListener(new Hd.a(investPreviewFragment2, i4));
                    k1 k1Var5 = investPreviewFragment2.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var5);
                    ((TextView) ((k1) k1Var5.c).f4139d).setVisibility(8);
                    k1 k1Var6 = investPreviewFragment2.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var6);
                    k1 k1Var7 = (k1) k1Var6.c;
                    ((TextView) k1Var7.c).setText(HtmlCompat.fromHtml(investPreviewFragment2.getString(R.string.pma_format_invest_need_upgrade, strMFirstName), 63));
                    ((ConstraintLayout) k1Var7.e).setVisibility(0);
                    k1 k1Var8 = investPreviewFragment2.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var8);
                    ((N5.A) k1Var8.f4138b).f3538b.setVisibility(8);
                } else {
                    InvestPreviewFragment investPreviewFragment3 = (InvestPreviewFragment) ((Gd.a) this.c.get());
                    investPreviewFragment3.getClass();
                    k1 k1Var9 = investPreviewFragment3.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var9);
                    TextView textView2 = (TextView) ((k1) k1Var9.c).f4139d;
                    textView2.setVisibility(0);
                    textView2.setOnClickListener(new Hd.a(investPreviewFragment3, i));
                    k1 k1Var10 = investPreviewFragment3.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var10);
                    ((TextView) ((k1) k1Var10.c).f).setVisibility(8);
                    k1 k1Var11 = investPreviewFragment3.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var11);
                    k1 k1Var12 = (k1) k1Var11.c;
                    ((TextView) k1Var12.c).setText(HtmlCompat.fromHtml(investPreviewFragment3.getString(R.string.pma_format_invest_need_upgrade, strMFirstName), 63));
                    ((ConstraintLayout) k1Var12.e).setVisibility(0);
                    k1 k1Var13 = investPreviewFragment3.f14613a0;
                    kotlin.jvm.internal.j.d(k1Var13);
                    ((N5.A) k1Var13.f4138b).f3538b.setVisibility(8);
                }
                n();
                m();
                if (64 == com.paymaya.common.utility.C.w(((InvestPreviewFragment) ((Gd.a) this.c.get())).requireActivity().getIntent().getDataString())) {
                    InvestPreviewFragment investPreviewFragment4 = (InvestPreviewFragment) ((Gd.a) this.c.get());
                    C1219h c1219h = investPreviewFragment4.f10248Q;
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219h.j.put("from_deep_link", "true");
                    investPreviewFragment4.requireActivity().getIntent().setData(null);
                    return;
                }
                return;
            case 5:
                super.j();
                FragmentActivity activity = ((MayaVaultedCardsFragment) ((K6.n) this.c.get())).getActivity();
                if (11 == com.paymaya.common.utility.C.w((activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString())) {
                    MayaVaultedCardsFragment mayaVaultedCardsFragment = (MayaVaultedCardsFragment) ((K6.n) this.c.get());
                    C1219h c1219hM1 = mayaVaultedCardsFragment.m1();
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hM1.j.put("from_deep_link", "true");
                    FragmentActivity activity2 = mayaVaultedCardsFragment.getActivity();
                    if (activity2 == null || (intent = activity2.getIntent()) == null) {
                        return;
                    }
                    intent.setData(null);
                    return;
                }
                return;
            case 7:
                super.j();
                Rb.d dVar = (Rb.d) this.c.get();
                String strR = ((com.paymaya.data.preference.a) this.e).r();
                TextView textView3 = ((MayaChangeMinFragment) dVar).f13938V;
                if (textView3 != null) {
                    textView3.setText(strR);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewRegisteredMobileNumber");
                    throw null;
                }
            case 8:
                super.j();
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get());
                mayaDataPrivacyDataPersonalizationFragment.f12288d0.clear();
                LinearLayout linearLayout = mayaDataPrivacyDataPersonalizationFragment.f12280V;
                if (linearLayout == null) {
                    kotlin.jvm.internal.j.n("mConsentsContainerLinearLayout");
                    throw null;
                }
                linearLayout.removeAllViews();
                for (Consent consent : ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).f12290f0) {
                    MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get());
                    mayaDataPrivacyDataPersonalizationFragment2.getClass();
                    kotlin.jvm.internal.j.g(consent, "consent");
                    Context contextRequireContext = mayaDataPrivacyDataPersonalizationFragment2.requireContext();
                    kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                    T7.a aVar2 = new T7.a(contextRequireContext);
                    aVar2.setCheckBoxConsentChecked(consent.isEnabled());
                    String strMName = consent.mName();
                    kotlin.jvm.internal.j.f(strMName, "mName(...)");
                    String strMDescription = consent.mDescription();
                    kotlin.jvm.internal.j.f(strMDescription, "mDescription(...)");
                    D0 d02 = new D0(i, mayaDataPrivacyDataPersonalizationFragment2, consent);
                    TextView textView4 = aVar2.f;
                    if (textView4 == null) {
                        kotlin.jvm.internal.j.n("mConsentNameTextView");
                        throw null;
                    }
                    textView4.setText(strMName);
                    TextView textView5 = aVar2.f5813g;
                    if (textView5 == null) {
                        kotlin.jvm.internal.j.n("mConsentDescriptionTextView");
                        throw null;
                    }
                    textView5.setText(strMDescription);
                    AppCompatCheckBox appCompatCheckBox = aVar2.e;
                    if (appCompatCheckBox == null) {
                        kotlin.jvm.internal.j.n("mConsentEnabledCheckBox");
                        throw null;
                    }
                    appCompatCheckBox.setOnCheckedChangeListener(d02);
                    aVar2.setConsentItemExpandListener(new C7.f(i, mayaDataPrivacyDataPersonalizationFragment2, consent));
                    mayaDataPrivacyDataPersonalizationFragment2.f12288d0.add(aVar2);
                    LinearLayout linearLayout2 = mayaDataPrivacyDataPersonalizationFragment2.f12280V;
                    if (linearLayout2 == null) {
                        kotlin.jvm.internal.j.n("mConsentsContainerLinearLayout");
                        throw null;
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, mayaDataPrivacyDataPersonalizationFragment2.getResources().getDimensionPixelSize(R.dimen.pma_margin_medium), 0, 0);
                    Unit unit = Unit.f18162a;
                    linearLayout2.addView(aVar2, layoutParams);
                }
                String str = ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).f12289e0;
                if (((com.paymaya.data.preference.a) this.e).e().isConsentCheckAllEnabled() && kotlin.jvm.internal.j.b(str, "registration")) {
                    MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment3 = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get());
                    for (T7.a aVar3 : mayaDataPrivacyDataPersonalizationFragment3.f12288d0) {
                        mayaDataPrivacyDataPersonalizationFragment3.f12291g0 = false;
                        aVar3.setCheckBoxConsentChecked(true);
                        mayaDataPrivacyDataPersonalizationFragment3.f12291g0 = true;
                    }
                }
                s();
                return;
            case 11:
                super.j();
                MayaTravelViewDataSelection mayaTravelViewDataSelectionH1 = ((MayaTravelStopSelectionFragment) ((jc.f) this.c.get())).H1();
                Route route = mayaTravelViewDataSelectionH1 != null ? mayaTravelViewDataSelectionH1.c : null;
                this.f = route;
                this.f1106g = route != null ? route.mStops() : null;
                jc.f fVar = (jc.f) this.c.get();
                Route route2 = (Route) this.f;
                ((MayaTravelStopSelectionFragment) fVar).L1(route2 != null ? route2.mDestination() : null);
                jc.f fVar2 = (jc.f) this.c.get();
                Route route3 = (Route) this.f;
                ((MayaTravelStopSelectionFragment) fVar2).M1(route3 != null ? route3.mOrigin() : null);
                return;
            case 12:
                super.j();
                Bundle arguments = ((MayaDynamicMerchantPaymentFragment) ((InterfaceC1971b) this.c.get())).getArguments();
                String string = arguments != null ? arguments.getString("payment_id") : null;
                if (string == null || C2576A.H(string)) {
                    Bundle arguments2 = ((MayaDynamicMerchantPaymentFragment) ((InterfaceC1971b) this.c.get())).getArguments();
                    if ((arguments2 != null ? (QRMerchant) arguments2.getParcelable("merchant") : null) != null) {
                        Bundle arguments3 = ((MayaDynamicMerchantPaymentFragment) ((InterfaceC1971b) this.c.get())).getArguments();
                        QRMerchant qRMerchant = arguments3 != null ? (QRMerchant) arguments3.getParcelable("merchant") : null;
                        this.f = qRMerchant;
                        InterfaceC1971b interfaceC1971b = (InterfaceC1971b) this.c.get();
                        String name = qRMerchant.mName();
                        MayaDynamicMerchantPaymentFragment mayaDynamicMerchantPaymentFragment = (MayaDynamicMerchantPaymentFragment) interfaceC1971b;
                        mayaDynamicMerchantPaymentFragment.getClass();
                        kotlin.jvm.internal.j.g(name, "name");
                        TextView textView6 = mayaDynamicMerchantPaymentFragment.f12865V;
                        if (textView6 == null) {
                            kotlin.jvm.internal.j.n("mMerchantInfoTextView");
                            throw null;
                        }
                        textView6.setText(name);
                        InterfaceC1971b interfaceC1971b2 = (InterfaceC1971b) this.c.get();
                        Amount amountMAmount = qRMerchant.mAmount();
                        kotlin.jvm.internal.j.d(amountMAmount);
                        String amount = amountMAmount.getCurrencyFormattedValue();
                        MayaDynamicMerchantPaymentFragment mayaDynamicMerchantPaymentFragment2 = (MayaDynamicMerchantPaymentFragment) interfaceC1971b2;
                        mayaDynamicMerchantPaymentFragment2.getClass();
                        kotlin.jvm.internal.j.g(amount, "amount");
                        MayaInputLayout mayaInputLayout = mayaDynamicMerchantPaymentFragment2.f12867X;
                        if (mayaInputLayout == null) {
                            kotlin.jvm.internal.j.n("mAmountMayaInput");
                            throw null;
                        }
                        mayaInputLayout.getInputEditText().setText(amount);
                    }
                } else {
                    Bundle arguments4 = ((MayaDynamicMerchantPaymentFragment) ((InterfaceC1971b) this.c.get())).getArguments();
                    this.f1106g = arguments4 != null ? arguments4.getString("payment_id") : null;
                }
                k();
                return;
            case 13:
                super.j();
                MayaQRPHMerchantOTPFragment mayaQRPHMerchantOTPFragment = (MayaQRPHMerchantOTPFragment) ((o9.i) this.c.get());
                mayaQRPHMerchantOTPFragment.J1().setText(Html.fromHtml(mayaQRPHMerchantOTPFragment.getString(R.string.maya_format_enter_otp_sent_to_mobile_number, com.paymaya.common.utility.C.p(((com.paymaya.data.preference.a) this.e).r()))));
                return;
        }
    }

    public void k() {
        String str;
        int i = 5;
        int i4 = 2;
        int i6 = 18;
        final int i10 = 1;
        final int i11 = 0;
        ((MayaBaseFragment) ((InterfaceC1971b) this.c.get())).D1();
        if (((QRMerchant) this.f) == null && (str = (String) this.f1106g) != null && !C2576A.H(str)) {
            C1268k0 c1268k0 = (C1268k0) this.e;
            String str2 = (String) this.f1106g;
            c1268k0.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(TtmlNode.ATTR_ID, str2);
            } catch (JSONException unused) {
                yk.a.e();
            }
            try {
                jSONObject.put("payment_token", jSONObject2);
            } catch (JSONException unused2) {
                yk.a.e();
            }
            byte[] bytes = jSONObject.toString().getBytes(Charset.forName("UTF-8"));
            boolean zIsMerchantV3EndpointEnabled = c1268k0.f11456d.e().isMerchantV3EndpointEnabled();
            MediaType mediaType = C1268k0.e;
            PayMayaCardApi payMayaCardApi = c1268k0.f11455b;
            Ah.p<MerchantPayment> pVarCreateMerchantPaymentV3 = zIsMerchantV3EndpointEnabled ? payMayaCardApi.createMerchantPaymentV3(RequestBody.create(mediaType, bytes)) : payMayaCardApi.createMerchantPayment(RequestBody.create(mediaType, bytes));
            e(new Kh.T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreateMerchantPaymentV3, pVarCreateMerchantPaymentV3, zh.b.a()), new com.paymaya.domain.store.M(this, i6), i4), new com.google.firebase.messaging.p(this, 21), i11), new Ch.a(this) { // from class: l9.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0214w f18257b;

                {
                    this.f18257b = this;
                }

                @Override // Ch.a
                public final void run() {
                    switch (i11) {
                        case 0:
                            ((MayaBaseFragment) ((InterfaceC1971b) this.f18257b.c.get())).w1();
                            break;
                        default:
                            ((MayaBaseFragment) ((InterfaceC1971b) this.f18257b.c.get())).w1();
                            break;
                    }
                }
            }).e());
            return;
        }
        if (((QRMerchant) this.f) != null) {
            String str3 = (String) this.f1106g;
            if (str3 == null || C2576A.H(str3)) {
                C1268k0 c1268k02 = (C1268k0) this.e;
                QRMerchant qRMerchant = (QRMerchant) this.f;
                c1268k02.getClass();
                String strMPaymentId = qRMerchant.mPaymentId();
                String strMCurrency = qRMerchant.mAmount().mCurrency();
                String strMValue = qRMerchant.mAmount().mValue();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put(TtmlNode.ATTR_ID, strMPaymentId);
                } catch (JSONException unused3) {
                    yk.a.e();
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("currency", strMCurrency);
                } catch (JSONException unused4) {
                    yk.a.e();
                }
                try {
                    jSONObject5.put("value", strMValue);
                } catch (JSONException unused5) {
                    yk.a.e();
                }
                try {
                    jSONObject3.put("payment_token", jSONObject4);
                } catch (JSONException unused6) {
                    yk.a.e();
                }
                try {
                    jSONObject3.put("amount", jSONObject5);
                } catch (JSONException unused7) {
                    yk.a.e();
                }
                byte[] bytes2 = jSONObject3.toString().getBytes(Charset.forName("UTF-8"));
                boolean zIsMerchantV3EndpointEnabled2 = c1268k02.f11456d.e().isMerchantV3EndpointEnabled();
                MediaType mediaType2 = C1268k0.e;
                PayMayaCardApi payMayaCardApi2 = c1268k02.f11455b;
                Ah.p<MerchantPayment> pVarCreateMerchantPaymentV32 = zIsMerchantV3EndpointEnabled2 ? payMayaCardApi2.createMerchantPaymentV3(RequestBody.create(mediaType2, bytes2)) : payMayaCardApi2.createMerchantPayment(RequestBody.create(mediaType2, bytes2));
                e(new Kh.T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreateMerchantPaymentV32, pVarCreateMerchantPaymentV32, zh.b.a()), new A0(this, i6), i4), new C1258f0(this, 19), i11), new Ch.a(this) { // from class: l9.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C0214w f18257b;

                    {
                        this.f18257b = this;
                    }

                    @Override // Ch.a
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ((MayaBaseFragment) ((InterfaceC1971b) this.f18257b.c.get())).w1();
                                break;
                            default:
                                ((MayaBaseFragment) ((InterfaceC1971b) this.f18257b.c.get())).w1();
                                break;
                        }
                    }
                }).e());
            }
        }
    }

    public void m() {
        k1 k1Var = ((InvestPreviewFragment) ((Gd.a) this.c.get())).f14613a0;
        kotlin.jvm.internal.j.d(k1Var);
        ((N5.Q) k1Var.f).f3874d.setVisibility(0);
        k1 k1Var2 = ((InvestPreviewFragment) ((Gd.a) this.c.get())).f14613a0;
        kotlin.jvm.internal.j.d(k1Var2);
        ((N5.Q) k1Var2.f).f3873b.setVisibility(0);
        C1256e0 c1256e0 = (C1256e0) this.f1106g;
        c1256e0.getClass();
        Ah.p<List<OnlinePayment>> featuredMerchants = c1256e0.f11437b.getFeaturedMerchants(T2.u(1, "invest"));
        kotlin.jvm.internal.j.f(featuredMerchants, "getFeaturedMerchants(...)");
        e(new Lh.d(new Lh.d(new Lh.h(featuredMerchants, zh.b.a(), 0), new J5.a(this, 21), 2), new J5.c(this, 19), 0).e());
    }

    public void n() {
        k1 k1Var = ((InvestPreviewFragment) ((Gd.a) this.c.get())).f14613a0;
        kotlin.jvm.internal.j.d(k1Var);
        ((LinearLayout) ((C0450f) k1Var.f4139d).f4088d).setVisibility(0);
        k1 k1Var2 = ((InvestPreviewFragment) ((Gd.a) this.c.get())).f14613a0;
        kotlin.jvm.internal.j.d(k1Var2);
        ((ConstraintLayout) ((C0450f) k1Var2.f4139d).c).setVisibility(0);
        C1256e0 c1256e0 = (C1256e0) this.f1106g;
        c1256e0.getClass();
        Ah.p<List<OnlinePayment>> featuredMerchants = c1256e0.f11437b.getFeaturedMerchants(T2.u(1, "invest-101"));
        kotlin.jvm.internal.j.f(featuredMerchants, "getFeaturedMerchants(...)");
        e(new Lh.d(new Lh.d(new Lh.h(featuredMerchants, zh.b.a(), 0), new V2.c(this, 18), 2), new A5.l(this, 16), 0).e());
    }

    public void o() {
        AddMoneyViaCardSettings addMoneyViaCardSettings;
        int i = 1;
        int i4 = 0;
        if (((MayaBaseLoadingFragment) ((K6.n) this.c.get())).f10359n0 && (addMoneyViaCardSettings = (AddMoneyViaCardSettings) this.f) != null) {
            w((ArrayList) this.f1106g, addMoneyViaCardSettings);
        } else {
            ((MayaVaultedCardsFragment) ((K6.n) this.c.get())).O1();
            e(new Lh.d(new Lh.h(new Lh.d(new Lh.h(Ah.p.l(((C1295y0) this.e).f11503b.getAddMoneyViaCardSettings(), ((C1295y0) this.e).f11503b.getVaultedCards(), G6.l.f1798d), zh.b.a(), 0), new J5.a(this, 29), 2), zh.b.a(), 0), new G6.r(this, i), i4).e());
        }
    }

    public void p(String str) {
        int i = 0;
        j();
        AppCompatCheckBox appCompatCheckBox = ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).w0;
        if (appCompatCheckBox == null) {
            kotlin.jvm.internal.j.n("mCheckBoxReminder");
            throw null;
        }
        appCompatCheckBox.setVisibility(8);
        MayaVoucherDetailsFragment mayaVoucherDetailsFragment = (MayaVoucherDetailsFragment) ((Fc.b) this.c.get());
        TextView textView = mayaVoucherDetailsFragment.y0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewVoucherReferenceId");
            throw null;
        }
        textView.setText(mayaVoucherDetailsFragment.getString(R.string.maya_label_voucher_reference_id_with_value, str));
        ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).O1();
        c1 c1Var = (c1) this.f;
        c1Var.getClass();
        new Lh.d(new Lh.d(new Lh.h(c1Var.f11431b.getVoucherDetails(str, androidx.media3.datasource.cache.c.q("device_type", "android", "device_resolution", com.paymaya.common.utility.C.f10391a)).d(new androidx.work.impl.e(c1Var, 26)), zh.b.a(), 0), new J5.a(this, 19), 2), new J5.c(this, 17), i).e();
    }

    public void q() {
        String strL = ((com.paymaya.data.preference.a) this.e).l();
        if (kotlin.jvm.internal.j.b(strL, "submitted") || kotlin.jvm.internal.j.b(strL, "for_edd")) {
            UpgradePayMayaPlusFragment upgradePayMayaPlusFragment = (UpgradePayMayaPlusFragment) ((Vc.b) this.c.get());
            upgradePayMayaPlusFragment.f14419Z = "REVIEW";
            upgradePayMayaPlusFragment.f10248Q.s("REVIEW");
            Button button = upgradePayMayaPlusFragment.f14414U;
            if (button != null) {
                button.setText(upgradePayMayaPlusFragment.getString(R.string.pma_label_check_application_status));
                return;
            } else {
                kotlin.jvm.internal.j.n("mButtonUpgradeToPaymaya");
                throw null;
            }
        }
        UpgradePayMayaPlusFragment upgradePayMayaPlusFragment2 = (UpgradePayMayaPlusFragment) ((Vc.b) this.c.get());
        upgradePayMayaPlusFragment2.f14419Z = "UPGRADE";
        upgradePayMayaPlusFragment2.f10248Q.s("UPGRADE");
        Button button2 = upgradePayMayaPlusFragment2.f14414U;
        if (button2 != null) {
            button2.setText(upgradePayMayaPlusFragment2.getString(R.string.pma_label_upgrade_my_account));
        } else {
            kotlin.jvm.internal.j.n("mButtonUpgradeToPaymaya");
            throw null;
        }
    }

    public void r(String str) {
        if (!"REDEEMED".equalsIgnoreCase(str)) {
            TextView textView = ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).f14303s0;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mTextViewAmount");
                throw null;
            }
        }
        MayaVoucherDetailsFragment mayaVoucherDetailsFragment = (MayaVoucherDetailsFragment) ((Fc.b) this.c.get());
        TextView textView2 = mayaVoucherDetailsFragment.f14303s0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewAmount");
            throw null;
        }
        textView2.setVisibility(8);
        Group group = mayaVoucherDetailsFragment.f14292F0;
        if (group != null) {
            group.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mConstraintGroupPromoDetails");
            throw null;
        }
    }

    public void s() {
        ArrayList arrayList = ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).f12290f0;
        if (!AbstractC1414e.u(arrayList) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Consent) it.next()).isEnabled()) {
                    AppCompatCheckBox appCompatCheckBox = ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).f12283Y;
                    if (appCompatCheckBox != null) {
                        appCompatCheckBox.setChecked(false);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mEnableAllCheckbox");
                        throw null;
                    }
                }
            }
        }
        AppCompatCheckBox appCompatCheckBox2 = ((MayaDataPrivacyDataPersonalizationFragment) ((R7.b) this.c.get())).f12283Y;
        if (appCompatCheckBox2 != null) {
            appCompatCheckBox2.setChecked(true);
        } else {
            kotlin.jvm.internal.j.n("mEnableAllCheckbox");
            throw null;
        }
    }

    public void t(String str, String str2) {
        if (!"REDEEMED".equalsIgnoreCase(str2) || str == null || C2576A.H(str)) {
            Group group = ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).f14294H0;
            if (group != null) {
                group.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mConstraintGroupVoucherCode");
                throw null;
            }
        }
        Group group2 = ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).f14294H0;
        if (group2 == null) {
            kotlin.jvm.internal.j.n("mConstraintGroupVoucherCode");
            throw null;
        }
        group2.setVisibility(0);
        TextView textView = ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).I0;
        if (textView != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.j.n("mTextViewVoucherCode");
            throw null;
        }
    }

    public void u(String str, String str2) {
        if ("REDEEMED".equalsIgnoreCase(str2)) {
            MayaVoucherDetailsFragment mayaVoucherDetailsFragment = (MayaVoucherDetailsFragment) ((Fc.b) this.c.get());
            Button button = mayaVoucherDetailsFragment.f14291E0;
            if (button == null) {
                kotlin.jvm.internal.j.n("mButtonClaim");
                throw null;
            }
            button.setText(mayaVoucherDetailsFragment.getString(R.string.maya_label_voucher_claimed));
            Button button2 = ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).f14291E0;
            if (button2 == null) {
                kotlin.jvm.internal.j.n("mButtonClaim");
                throw null;
            }
            button2.setEnabled(false);
            AppCompatCheckBox appCompatCheckBox = ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).w0;
            if (appCompatCheckBox == null) {
                kotlin.jvm.internal.j.n("mCheckBoxReminder");
                throw null;
            }
            appCompatCheckBox.setVisibility(8);
            if (str != null) {
                ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).Z1();
                Fc.b bVar = (Fc.b) this.c.get();
                String strJ = AbstractC1234x.j(AbstractC1234x.b(str));
                TextView textView = ((MayaVoucherDetailsFragment) bVar).t0;
                if (textView != null) {
                    textView.setText(strJ);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewValidity");
                    throw null;
                }
            }
            return;
        }
        if (!"EXPIRED".equalsIgnoreCase(str2)) {
            ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).Z1();
            Fc.b bVar2 = (Fc.b) this.c.get();
            String strJ2 = AbstractC1234x.j(AbstractC1234x.b(str));
            TextView textView2 = ((MayaVoucherDetailsFragment) bVar2).t0;
            if (textView2 != null) {
                textView2.setText(strJ2);
                return;
            } else {
                kotlin.jvm.internal.j.n("mTextViewValidity");
                throw null;
            }
        }
        ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).Z1();
        Fc.b bVar3 = (Fc.b) this.c.get();
        String strJ3 = AbstractC1234x.j(AbstractC1234x.b(str));
        MayaVoucherDetailsFragment mayaVoucherDetailsFragment2 = (MayaVoucherDetailsFragment) bVar3;
        TextView textView3 = mayaVoucherDetailsFragment2.u0;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewValidityLabel");
            throw null;
        }
        textView3.setText(R.string.maya_label_format_voucher_details_expired);
        TextView textView4 = mayaVoucherDetailsFragment2.t0;
        if (textView4 == null) {
            kotlin.jvm.internal.j.n("mTextViewValidity");
            throw null;
        }
        textView4.setText(strJ3);
        MayaVoucherDetailsFragment mayaVoucherDetailsFragment3 = (MayaVoucherDetailsFragment) ((Fc.b) this.c.get());
        Button button3 = mayaVoucherDetailsFragment3.f14291E0;
        if (button3 == null) {
            kotlin.jvm.internal.j.n("mButtonClaim");
            throw null;
        }
        button3.setText(mayaVoucherDetailsFragment3.getString(R.string.maya_label_voucher_expired));
        Button button4 = ((MayaVoucherDetailsFragment) ((Fc.b) this.c.get())).f14291E0;
        if (button4 != null) {
            button4.setEnabled(false);
        } else {
            kotlin.jvm.internal.j.n("mButtonClaim");
            throw null;
        }
    }

    public void v(PayMayaError payMayaError) {
        if (payMayaError.isNetworkError()) {
            InvestPreviewFragment investPreviewFragment = (InvestPreviewFragment) ((Gd.a) this.c.get());
            investPreviewFragment.getClass();
            investPreviewFragment.x1(100, new Hd.a(investPreviewFragment, 3));
        } else {
            Gd.a aVar = (Gd.a) this.c.get();
            String strMSpiel = payMayaError.mSpiel();
            InvestPreviewFragment investPreviewFragment2 = (InvestPreviewFragment) aVar;
            investPreviewFragment2.getClass();
            investPreviewFragment2.y1(200, strMSpiel, new Hd.a(investPreviewFragment2, 0));
        }
    }

    public void w(List vaultedCards, AddMoneyViaCardSettings settings) {
        kotlin.jvm.internal.j.g(settings, "settings");
        ((MayaVaultedCardsFragment) ((K6.n) this.c.get())).L1();
        List list = vaultedCards;
        if (list == null || list.isEmpty()) {
            Group group = ((MayaVaultedCardsFragment) ((K6.n) this.c.get())).f11764q0;
            if (group != null) {
                group.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mVaultedCardsGroup");
                throw null;
            }
        }
        Group group2 = ((MayaVaultedCardsFragment) ((K6.n) this.c.get())).f11764q0;
        if (group2 == null) {
            kotlin.jvm.internal.j.n("mVaultedCardsGroup");
            throw null;
        }
        group2.setVisibility(0);
        MayaVaultedCardsFragment mayaVaultedCardsFragment = (MayaVaultedCardsFragment) ((K6.n) this.c.get());
        mayaVaultedCardsFragment.getClass();
        kotlin.jvm.internal.j.g(vaultedCards, "vaultedCards");
        J6.g gVar = mayaVaultedCardsFragment.u0;
        if (gVar != null) {
            gVar.c = settings;
            ArrayList oldList = gVar.f2432b;
            kotlin.jvm.internal.j.g(oldList, "oldList");
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new N6.c(oldList, vaultedCards));
            kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
            oldList.clear();
            oldList.addAll(vaultedCards);
            diffResultCalculateDiff.dispatchUpdatesTo(gVar);
        }
    }

    public void x(PayMayaError payMayaError) {
        MayaDynamicMerchantPaymentFragment mayaDynamicMerchantPaymentFragment;
        InterfaceC2018c interfaceC2018c;
        y5.s sVar = (InterfaceC1971b) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(12);
        c1219hH.t(EnumC1217f.CREATE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(Constants.REASON, payMayaError.mSpiel());
        ((MayaBaseFragment) sVar).A1(c1219hH);
        if (payMayaError.isSessionTimeout() || (interfaceC2018c = (mayaDynamicMerchantPaymentFragment = (MayaDynamicMerchantPaymentFragment) ((InterfaceC1971b) this.c.get())).f12869Z) == null) {
            return;
        }
        M2.b.Z(0, mayaDynamicMerchantPaymentFragment.getString(R.string.pma_toast_error_title_merchant_payment_error), null, null, null, false, payMayaError, null, false, 445).show(((MayaDynamicMerchantActivity) interfaceC2018c).getSupportFragmentManager(), "error_dialog");
    }

    public void y(MerchantPayment merchantPayment) {
        y5.s sVar = (InterfaceC1971b) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(14);
        c1219hH.t(EnumC1217f.CREATE);
        ((MayaBaseFragment) sVar).A1(c1219hH);
        InterfaceC2018c interfaceC2018c = ((MayaDynamicMerchantPaymentFragment) ((InterfaceC1971b) this.c.get())).f12869Z;
        if (interfaceC2018c != null) {
            MayaDynamicMerchantConfirmationFragment mayaDynamicMerchantConfirmationFragment = new MayaDynamicMerchantConfirmationFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("merchant", merchantPayment);
            mayaDynamicMerchantConfirmationFragment.setArguments(bundle);
            AbstractC1236z.h((MayaDynamicMerchantActivity) interfaceC2018c, R.id.maya_activity_merchant_fragment_container, mayaDynamicMerchantConfirmationFragment);
        }
    }

    public void z(PayMayaError payMayaError) {
        ((MayaBaseFragment) ((P9.m) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        int iMErrorCode = payMayaError.mErrorCode();
        EnumC1216e enumC1216e = EnumC1216e.ACTIVATION;
        EnumC1215d enumC1215d = EnumC1215d.CREDIT;
        if (iMErrorCode != -135 && payMayaError.mErrorCode() != -137) {
            NewMayaCreditOTPFragment newMayaCreditOTPFragment = (NewMayaCreditOTPFragment) ((P9.m) this.c.get());
            newMayaCreditOTPFragment.getClass();
            C1220i c1220iO1 = newMayaCreditOTPFragment.o1();
            FragmentActivity activity = newMayaCreditOTPFragment.getActivity();
            C1219h c1219hD = C1219h.d(enumC1215d);
            c1219hD.r(enumC1216e);
            c1219hD.n(12);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hD.j.put(Constants.REASON, payMayaError.mSpiel());
            c1219hD.i();
            c1220iO1.c(activity, c1219hD);
            Q9.I i = newMayaCreditOTPFragment.f13299k0;
            if (i != null) {
                ((NewMayaCreditActivity) i).a(payMayaError, newMayaCreditOTPFragment.getString(R.string.maya_label_credit_activation_error_title));
                return;
            }
            return;
        }
        NewMayaCreditOTPFragment newMayaCreditOTPFragment2 = (NewMayaCreditOTPFragment) ((P9.m) this.c.get());
        newMayaCreditOTPFragment2.getClass();
        C1220i c1220iO12 = newMayaCreditOTPFragment2.o1();
        FragmentActivity activity2 = newMayaCreditOTPFragment2.getActivity();
        C1219h c1219hD2 = C1219h.d(enumC1215d);
        c1219hD2.r(enumC1216e);
        c1219hD2.n(12);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD2.j.put(Constants.REASON, payMayaError.mSpiel());
        c1219hD2.i();
        c1220iO12.c(activity2, c1219hD2);
        Q9.I i4 = newMayaCreditOTPFragment2.f13299k0;
        if (i4 != null) {
            String string = newMayaCreditOTPFragment2.getString(R.string.maya_label_credit_activation_error_title);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) i4;
            LinkedHashSet linkedHashSet = com.paymaya.common.utility.E.f10412a;
            com.paymaya.common.utility.E.a("NewMayaCreditActivity", "showErrorDialogCloseOTP: ".concat(string));
            MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447);
            mayaErrorDialogFragmentZ.f11850c0 = new G6.u(newMayaCreditActivity, 21);
            mayaErrorDialogFragmentZ.show(newMayaCreditActivity.getSupportFragmentManager(), "error_dialog");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(C1268k0 c1268k0, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        this.f1105d = 12;
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.e = c1268k0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(com.paymaya.data.preference.a aVar, C1279q c1279q, S0 s02, Uh.d dVar) {
        super(dVar);
        this.f1105d = 7;
        this.e = aVar;
        this.f = c1279q;
        this.f1106g = s02;
    }

    public C0214w(com.paymaya.data.preference.a mPreference, C1293x0 c1293x0, C1256e0 c1256e0) {
        this.f1105d = 2;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = mPreference;
        this.f = c1293x0;
        this.f1106g = c1256e0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(C1264i0 c1264i0, com.paymaya.data.preference.a aVar, Uh.d dVar) {
        super(dVar);
        this.f1105d = 6;
        this.f = c1264i0;
        this.e = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(C1281r0 c1281r0, com.paymaya.data.preference.a mPreference, Uh.d dVar) {
        super(dVar);
        this.f1105d = 10;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f = c1281r0;
        this.e = mPreference;
    }

    public C0214w(com.paymaya.data.preference.a aVar, S5.c cVar, e0 e0Var) {
        this.f1105d = 0;
        this.e = aVar;
        this.f = cVar;
        this.f1106g = e0Var;
    }

    public C0214w(com.paymaya.data.preference.a aVar, com.paymaya.domain.store.K k8, S5.c cVar) {
        this.f1105d = 14;
        this.e = aVar;
        this.f1106g = k8;
        this.f = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(com.paymaya.data.preference.a mPreference, C1293x0 c1293x0, Uh.d sessionSubject) {
        super(sessionSubject);
        this.f1105d = 9;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.e = mPreference;
        this.f = c1293x0;
        this.f1106g = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(com.paymaya.data.preference.a aVar, C1295y0 c1295y0, Uh.d dVar) {
        super(dVar);
        this.f1105d = 4;
        this.e = aVar;
        this.f = c1295y0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(C1268k0 c1268k0, C1278p0 c1278p0, com.paymaya.data.preference.a mPreference, Uh.d dVar) {
        super(dVar);
        this.f1105d = 13;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f = c1268k0;
        this.f1106g = c1278p0;
        this.e = mPreference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(E0 e02, C1284t c1284t, com.paymaya.data.preference.a aVar, Uh.d dVar) {
        super(dVar);
        this.f1105d = 8;
        this.f = e02;
        this.f1106g = c1284t;
        this.e = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(com.paymaya.data.preference.a mPreference, c1 c1Var, C1265j c1265j, Uh.d dVar) {
        super(dVar);
        this.f1105d = 1;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = mPreference;
        this.f = c1Var;
        this.f1106g = c1265j;
    }
}
