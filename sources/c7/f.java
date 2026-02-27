package C7;

import Ag.l;
import D8.C0212u;
import D8.C0214w;
import D8.C0217z;
import G6.w;
import K8.InterfaceC0290o;
import L9.B;
import L9.n;
import M8.L0;
import N5.C0442c0;
import N5.C0452f1;
import N5.C0466m;
import N5.k1;
import P9.k;
import Q6.o;
import S1.r;
import S1.v;
import We.s;
import a.AbstractC0617a;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.navigation.Navigation;
import androidx.viewbinding.ViewBindings;
import b5.C0909a;
import b5.C0910b;
import b5.C0916h;
import bg.AbstractC0983W;
import bj.AbstractC1039j;
import bj.C1037h;
import c5.C1075a;
import cj.C1112C;
import cj.t;
import com.airbnb.lottie.LottieAnimationView;
import com.appsflyer.AppsFlyerLib;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.adkit.presentation.inlinebannerad.view.InlineBannerAd;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.DosriRelationship;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.KycSelectionModel;
import com.paymaya.domain.model.MFAChallengeVerificationResult;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.model.WesternUnionTransaction;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordEnterMinFragment;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSetNewPasswordFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import com.paymaya.mayaui.loanscreditcard.view.activity.impl.MayaLoansCreditCardActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentReceiptFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import defpackage.AbstractC1414e;
import g9.InterfaceC1507b;
import ha.C1557j;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.plugins.webviewflutter.ResultCompat;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k4.C1763a;
import k5.C1765a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import l5.C1801c;
import l5.C1802d;
import m5.C1849c;
import m5.C1852f;
import n5.AbstractC1926c;
import n5.C1924a;
import n5.C1925b;
import of.p;
import s5.C2239c;
import s5.i;
import x5.C2467a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f753b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f752a = i;
        this.f753b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [cj.C] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String key;
        String getCaptureMethod;
        ?? arrayList;
        i iVar;
        i iVar2;
        String challengeId;
        MfaMeta mfaMeta;
        String challengeId2;
        MfaMeta mfaMeta2;
        Drawable drawable;
        Fragment mayaMerchantPaymentReceiptFragment;
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        int i = 5;
        int i4 = 17;
        switch (this.f752a) {
            case 0:
                View it = (View) obj;
                int i6 = MayaDashboardActivity.f12133U;
                j.g(it, "it");
                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) this.f753b;
                C1220i c1220iK1 = mayaDashboardActivity.k1();
                String str2 = (String) this.c;
                C1219h c1219h = new C1219h();
                c1219h.q(str2);
                c1219h.n(17);
                c1219h.t(EnumC1217f.UPGRADE_NOW);
                c1219h.i();
                c1220iK1.c(mayaDashboardActivity, c1219h);
                mayaDashboardActivity.n1().s(mayaDashboardActivity, false);
                return Unit.f18162a;
            case 1:
                ((Cj.d) this.f753b).f789a.removeCallbacks((v) this.c);
                return Unit.f18162a;
            case 2:
                IndexedValue indexedValue = (IndexedValue) obj;
                j.g(indexedValue, "<destruct>");
                MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) indexedValue.f18164b;
                if (indexedValue.f18163a == 0) {
                    C0212u c0212u = (C0212u) this.f753b;
                    if (c0212u.j.e().isShortenedFlowPhilsysEnabled()) {
                        boolean zIsKycForcePhNationalIdEnabled = c0212u.j.e().isKycForcePhNationalIdEnabled();
                        String str3 = (String) this.c;
                        return (zIsKycForcePhNationalIdEnabled && j.b(str3, "PHILSYS_DIGITAL")) ? AbstractC1414e.h("PH_NATIONAL_ID;", mayaEKYCSelectedDocument.getGetCaptureMethod()) : androidx.camera.core.impl.a.j(str3, Global.SEMICOLON, mayaEKYCSelectedDocument.getGetCaptureMethod());
                    }
                    key = mayaEKYCSelectedDocument.getKey();
                    getCaptureMethod = mayaEKYCSelectedDocument.getGetCaptureMethod();
                } else {
                    key = mayaEKYCSelectedDocument.getKey();
                    getCaptureMethod = mayaEKYCSelectedDocument.getGetCaptureMethod();
                }
                return androidx.camera.core.impl.a.j(key, Global.SEMICOLON, getCaptureMethod);
            case 3:
                View it2 = (View) obj;
                int i10 = MayaCashInActivity.f11609r;
                j.g(it2, "it");
                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) this.f753b;
                mayaCashInActivity.getClass();
                AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, z2.d.m(null, null, (WesternUnionTransaction) this.c, 0, 3), R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                return Unit.f18162a;
            case 4:
                View it3 = (View) obj;
                int i11 = MayaCashInActivity.f11609r;
                j.g(it3, "it");
                ((kotlin.jvm.internal.i) this.f753b).invoke((ExecutePullFunds) this.c);
                return Unit.f18162a;
            case 5:
                ((Kj.c) this.c).getClass();
                ((Kj.d) this.f753b).f(null);
                return Unit.f18162a;
            case 6:
                B b8 = (B) this.f753b;
                CreditResponse creditResponse = (CreditResponse) this.c;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                j.g(creditResponse, "creditResponse");
                if (zBooleanValue) {
                    b8.k(creditResponse);
                } else {
                    ((NewMayaCreditFragment) ((k) b8.c.get())).i2(new l(i, b8, creditResponse));
                }
                return Unit.f18162a;
            case 7:
                MayaKycDosriFragment mayaKycDosriFragment = (MayaKycDosriFragment) this.f753b;
                C0466m c0466m = (C0466m) this.c;
                String clickedView = (String) obj;
                j.g(clickedView, "clickedView");
                mayaKycDosriFragment.f12523a0 = (ConstraintLayout) c0466m.f4150b;
                MayaKycDosriFragment mayaKycDosriFragment2 = (MayaKycDosriFragment) ((InterfaceC0290o) ((C0217z) mayaKycDosriFragment.M1()).c.get());
                ConstraintLayout constraintLayout = mayaKycDosriFragment2.f12523a0;
                String strH = androidx.media3.datasource.cache.c.h(constraintLayout != null ? mayaKycDosriFragment2.O1(constraintLayout) : 1, mayaKycDosriFragment2.getString(R.string.maya_kyc_dosri_relationship_label), Global.BLANK);
                String string = mayaKycDosriFragment2.getString(R.string.maya_kyc_dosri_relationship_hint);
                j.f(string, "getString(...)");
                mayaKycDosriFragment2.Q1(strH, string.concat(" bottomsheet"));
                List list = mayaKycDosriFragment2.f12522Z;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(t.l(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(KycSelectionItem.Companion.toSelectionItem((DosriRelationship) it4.next()));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = C1112C.f9377a;
                }
                KycFieldType kycFieldType = KycFieldType.RELATION;
                KycSelectionModel kycSelectionModel = new KycSelectionModel(R.string.maya_kyc_dosri_relationship_hint, -1, arrayList, kycFieldType, false, 16, null);
                mayaKycDosriFragment2.f12520X = kycFieldType;
                try {
                    C1037h.a aVar = C1037h.f9166b;
                    FrameLayout frameLayout = ((C0442c0) mayaKycDosriFragment2.G1()).f4067a;
                    j.f(frameLayout, "getRoot(...)");
                    Navigation.findNavController(frameLayout).navigate(new L0(kycSelectionModel));
                    Unit unit = Unit.f18162a;
                    break;
                } catch (Throwable th2) {
                    C1037h.a aVar2 = C1037h.f9166b;
                    AbstractC1039j.a(th2);
                }
                return Unit.f18162a;
            case 8:
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) this.f753b;
                Consent consent = (Consent) this.c;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C0214w c0214wH1 = mayaDataPrivacyDataPersonalizationFragment.H1();
                String strMName = consent.mName();
                j.f(strMName, "mName(...)");
                if (!zBooleanValue2) {
                    str = "0";
                }
                String str4 = zBooleanValue2 ? "expand" : "not expand";
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214wH1.c.get());
                mayaDataPrivacyDataPersonalizationFragment2.getClass();
                if (j.b(mayaDataPrivacyDataPersonalizationFragment2.f12289e0, "registration")) {
                    C1220i c1220iO1 = mayaDataPrivacyDataPersonalizationFragment2.o1();
                    FragmentActivity activity = mayaDataPrivacyDataPersonalizationFragment2.getActivity();
                    C1219h c1219hE = C1219h.e(AbstractC1213b.o(6));
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    HashMap map = c1219hE.j;
                    map.put("source_page", "Data personalization");
                    map.put("button", str);
                    map.put("action_function", str4);
                    map.put("option_label", strMName);
                    c1219hE.i();
                    c1220iO1.c(activity, c1219hE);
                }
                return Unit.f18162a;
            case 9:
                Le.e result = (Le.e) obj;
                int i12 = MayaLoansCreditCardActivity.f12712u;
                j.g(result, "result");
                ((MayaLoansCreditCardActivity) this.f753b).getClass();
                boolean z4 = result instanceof Le.d;
                pg.t tVar = (pg.t) this.c;
                if (z4) {
                    result.toString();
                    yk.a.a();
                    tVar.success(r.A(result));
                } else {
                    if (!(result instanceof Le.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    result.toString();
                    yk.a.a();
                    Le.c cVar = (Le.c) result;
                    tVar.error(cVar.f2965a, cVar.f2966b, r.A(result));
                }
                return Unit.f18162a;
            case 10:
                Map result2 = (Map) obj;
                int i13 = MayaLoansCreditCardActivity.f12712u;
                j.g(result2, "result");
                String str5 = (String) ((Map) this.c).get("product_key");
                MayaLoansCreditCardActivity mayaLoansCreditCardActivity = (MayaLoansCreditCardActivity) this.f753b;
                FlutterEngineCache.getInstance().remove("loansCreditCard");
                mayaLoansCreditCardActivity.X1();
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry entry : result2.entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                String string2 = builder.build().toString();
                j.f(string2, "toString(...)");
                String strK = s.k("securityDepositReprocessScreen", string2, "&productKey=", str5);
                LinkedHashSet linkedHashSet = E.f10412a;
                E.a("MayaLoansCreditCardActivity", "onSecurityDepositSuccessfullyCreated " + result2);
                mayaLoansCreditCardActivity.n1();
                B5.i.y(mayaLoansCreditCardActivity, strK);
                return Unit.f18162a;
            case 11:
                NativeCustomFormatAd ad2 = (NativeCustomFormatAd) obj;
                j.g(ad2, "ad");
                CharSequence text = ad2.getText("cta_button_text");
                String string3 = text != null ? text.toString() : null;
                NativeAd.Image image = ad2.getImage("ad_image");
                Drawable drawable2 = image != null ? image.getDrawable() : null;
                NativeAd.Image image2 = ad2.getImage("ad_image");
                String strValueOf = String.valueOf(image2 != null ? image2.getUri() : null);
                String strValueOf2 = String.valueOf(ad2.getText("redirection_url"));
                C2239c c2239c = i.f20017b;
                String strValueOf3 = String.valueOf(ad2.getText("redirection_url_type"));
                c2239c.getClass();
                i[] iVarArrValues = i.values();
                int length = iVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 < length) {
                        i iVar3 = iVarArrValues[i14];
                        if (iVar3.f20019a.equalsIgnoreCase(strValueOf3)) {
                            iVar = iVar3;
                        } else {
                            i14++;
                        }
                    } else {
                        iVar = null;
                    }
                }
                return new C0916h((String) this.c, string3, (s5.f) this.f753b, drawable2, strValueOf, strValueOf2, iVar, String.valueOf(ad2.getText("hide_ad_badge")).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
            case 12:
                NativeCustomFormatAd ad3 = (NativeCustomFormatAd) obj;
                j.g(ad3, "ad");
                NativeAd.Image image3 = ad3.getImage("ad_image");
                Drawable drawable3 = image3 != null ? image3.getDrawable() : null;
                NativeAd.Image image4 = ad3.getImage("ad_image");
                String strValueOf4 = String.valueOf(image4 != null ? image4.getUri() : null);
                String strValueOf5 = String.valueOf(ad3.getText("redirection_url"));
                C2239c c2239c2 = i.f20017b;
                String strValueOf6 = String.valueOf(ad3.getText("redirection_url_type"));
                c2239c2.getClass();
                i[] iVarArrValues2 = i.values();
                int length2 = iVarArrValues2.length;
                int i15 = 0;
                while (true) {
                    if (i15 < length2) {
                        i iVar4 = iVarArrValues2[i15];
                        if (iVar4.f20019a.equalsIgnoreCase(strValueOf6)) {
                            iVar2 = iVar4;
                        } else {
                            i15++;
                        }
                    } else {
                        iVar2 = null;
                    }
                }
                return new C0910b((String) this.c, (s5.d) this.f753b, drawable3, strValueOf4, strValueOf5, iVar2, String.valueOf(ad3.getText("hide_ad_badge")).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
            case 13:
                MfaMeta mfaMeta3 = (MfaMeta) this.f753b;
                MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) this.c;
                ActivityResult result3 = (ActivityResult) obj;
                j.g(result3, "result");
                Intent data = result3.getData();
                int resultCode = result3.getResultCode();
                if (resultCode == 1011) {
                    MFAChallengeVerificationResult mFAChallengeVerificationResult = data != null ? (MFAChallengeVerificationResult) AbstractC0983W.l(data, "mfa_success_verification_result", MFAChallengeVerificationResult.class) : null;
                    if (mFAChallengeVerificationResult == null || (challengeId = mFAChallengeVerificationResult.getChallengeId()) == null) {
                        challengeId = mfaMeta3.getChallengeId();
                    }
                    String challengeId3 = challengeId;
                    o oVarI1 = mayaSessionExpiredFragment.I1();
                    j.g(challengeId3, "challengeId");
                    ((MayaBaseFragment) ((X6.f) oVarI1.c.get())).E1();
                    C1293x0 c1293x0 = oVarI1.e;
                    String str6 = ((MayaSessionExpiredFragment) ((X6.f) oVarI1.c.get())).f11936g0;
                    MayaSessionExpiredFragment mayaSessionExpiredFragment2 = (MayaSessionExpiredFragment) ((X6.f) oVarI1.c.get());
                    mayaSessionExpiredFragment2.getClass();
                    oVarI1.e(new Lh.d(new Lh.d(new Lh.h(c1293x0.k(true, str6, challengeId3, AppsFlyerLib.getInstance().getAppsFlyerUID(mayaSessionExpiredFragment2.requireContext()), "SESSION_TIMEOUT"), zh.b.a(), 0), new Gc.h(oVarI1, 27), 2), new w(oVarI1, 26), 0).e());
                } else if (resultCode == 1015) {
                    if (data != null && (mfaMeta = (MfaMeta) AbstractC0983W.l(data, "mfa_fallback", MfaMeta.class)) != null) {
                        mfaMeta3 = mfaMeta;
                    }
                    o oVarI12 = mayaSessionExpiredFragment.I1();
                    String str7 = ((MayaSessionExpiredFragment) ((X6.f) oVarI12.c.get())).f11936g0;
                    oVarI12.k(mfaMeta3, str7 != null ? str7 : "", new n(3, oVarI12, o.class, "subscribeStartMFAChallengeResponse", "subscribeStartMFAChallengeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 1), new N9.f(oVarI12, 7));
                }
                return Unit.f18162a;
            case 14:
                View it5 = (View) obj;
                int i16 = MayaShopV2Activity.f13985B;
                j.g(it5, "it");
                Order order = (Order) this.f753b;
                if (order != null) {
                    ((N9.f) this.c).invoke(order);
                }
                return Unit.f18162a;
            case 15:
                View it6 = (View) obj;
                int i17 = MayaRegistrationActivity.f12730r;
                j.g(it6, "it");
                MayaRegistrationActivity mayaRegistrationActivity = (MayaRegistrationActivity) this.f753b;
                C1220i c1220iK12 = mayaRegistrationActivity.k1();
                C1219h c1219hE2 = C1219h.e(AbstractC1213b.o(5));
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map2 = c1219hE2.j;
                map2.put("source_page", (String) this.c);
                map2.put("button", "Done");
                c1219hE2.i();
                c1220iK12.c(mayaRegistrationActivity, c1219hE2);
                return Unit.f18162a;
            case 16:
                String it7 = (String) obj;
                j.g(it7, "it");
                String strC = AbstractC1213b.c(13);
                j.f(strC, "errorTapped(...)");
                MayaAccountCreationFragment mayaAccountCreationFragment = (MayaAccountCreationFragment) this.f753b;
                String strS = mayaAccountCreationFragment.s();
                String strMSpiel = ((PayMayaError) this.c).mSpiel();
                if (mayaAccountCreationFragment.isAdded()) {
                    C1229s c1229sH1 = mayaAccountCreationFragment.H1();
                    FragmentActivity fragmentActivityRequireActivity = mayaAccountCreationFragment.requireActivity();
                    j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                    C1229s.c(c1229sH1, fragmentActivityRequireActivity, strC, "Registration Error (Dialog)", strS, it7, null, strMSpiel, null, 160);
                }
                return Unit.f18162a;
            case 17:
                return BannerAdCarousel.b((BannerAdCarousel) this.f753b, (f5.g) this.c, (i5.f) obj);
            case 18:
                MfaMeta mfaMeta4 = (MfaMeta) this.f753b;
                MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) this.c;
                ActivityResult result4 = (ActivityResult) obj;
                j.g(result4, "result");
                Intent data2 = result4.getData();
                int resultCode2 = result4.getResultCode();
                if (resultCode2 == 1011) {
                    MFAChallengeVerificationResult mFAChallengeVerificationResult2 = data2 != null ? (MFAChallengeVerificationResult) AbstractC0983W.l(data2, "mfa_success_verification_result", MFAChallengeVerificationResult.class) : null;
                    if (mFAChallengeVerificationResult2 == null || (challengeId2 = mFAChallengeVerificationResult2.getChallengeId()) == null) {
                        challengeId2 = mfaMeta4.getChallengeId();
                    }
                    String challengeId4 = challengeId2;
                    Z8.c cVarJ1 = mayaLoginFragment.J1();
                    j.g(challengeId4, "challengeId");
                    ((MayaBaseFragment) ((InterfaceC1507b) cVarJ1.c.get())).E1();
                    String strR = C.r(((MayaLoginFragment) ((InterfaceC1507b) cVarJ1.c.get())).L1());
                    C1293x0 c1293x02 = cVarJ1.f;
                    MayaLoginFragment mayaLoginFragment2 = (MayaLoginFragment) ((InterfaceC1507b) cVarJ1.c.get());
                    mayaLoginFragment2.getClass();
                    cVarJ1.e(new Lh.d(new Lh.d(new Lh.h(c1293x02.k(true, strR, challengeId4, AppsFlyerLib.getInstance().getAppsFlyerUID(mayaLoginFragment2.requireContext()), "FACE_CHALLENGE"), zh.b.a(), 0), new Q6.n(cVarJ1, i4), 2), new Z8.b(cVarJ1, strR, i), 0).e());
                } else if (resultCode2 == 1015) {
                    if (data2 != null && (mfaMeta2 = (MfaMeta) AbstractC0983W.l(data2, "mfa_fallback", MfaMeta.class)) != null) {
                        mfaMeta4 = mfaMeta2;
                    }
                    Z8.c cVarJ12 = mayaLoginFragment.J1();
                    String strL1 = ((MayaLoginFragment) ((InterfaceC1507b) cVarJ12.c.get())).L1();
                    cVarJ12.k(mfaMeta4, Je.c.a(strL1 != null ? strL1 : ""), new n(3, cVarJ12, Z8.c.class, "subscribeStartMFAChallengeResponse", "subscribeStartMFAChallengeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 2), new N9.f(cVarJ12, i4));
                }
                return Unit.f18162a;
            case 19:
                String action = (String) obj;
                j.g(action, "action");
                MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment = (MayaRegistrationIdentityFragment) this.f753b;
                C1229s c1229sI1 = mayaRegistrationIdentityFragment.I1();
                FragmentActivity fragmentActivityRequireActivity2 = mayaRegistrationIdentityFragment.requireActivity();
                j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
                String strB = AbstractC1213b.b(3);
                j.f(strB, "errorTapped(...)");
                C1229s.c(c1229sI1, fragmentActivityRequireActivity2, strB, "Reg Password Error (Dialog)", "Set your login details", action, null, (String) this.c, null, 160);
                return Unit.f18162a;
            case 20:
                C1763a it8 = (C1763a) obj;
                j.g(it8, "it");
                String string4 = it8.f18108a.getText().toString();
                if (C2576A.H(string4)) {
                    ((C1557j) this.c).invoke();
                } else {
                    ((Ag.b) this.f753b).invoke(string4);
                }
                return Unit.f18162a;
            case 21:
                C1763a it9 = (C1763a) obj;
                j.g(it9, "it");
                String string5 = it9.f18108a.getText().toString();
                if (C2576A.H(string5)) {
                    ((Function0) this.c).invoke();
                } else {
                    ((Function1) this.f753b).invoke(string5);
                }
                return Unit.f18162a;
            case 22:
                return ((WebChromeClientProxyApi.WebChromeClientImpl) this.f753b).lambda$onJsPrompt$10((JsPromptResult) this.c, (ResultCompat) obj);
            case 23:
                l5.h hVar = (l5.h) obj;
                int i18 = InlineBannerAd.e;
                boolean z5 = hVar instanceof l5.g;
                InlineBannerAd inlineBannerAd = (InlineBannerAd) this.f753b;
                if (z5) {
                    Log.d("InlineBannerAd", "InlineBannerAdState.Loading emitted.");
                    ((FrameLayout) inlineBannerAd.f10222a.f4199d).setVisibility(0);
                    ((LottieAnimationView) inlineBannerAd.f10222a.f4198b).setVisibility(0);
                } else {
                    boolean z8 = hVar instanceof C1802d;
                    C1765a c1765a = (C1765a) this.c;
                    if (z8) {
                        Log.d("InlineBannerAd", "InlineBannerAdState.BannerLoaded emitted.");
                        ((LottieAnimationView) inlineBannerAd.f10222a.f4198b).setVisibility(8);
                        C1802d c1802d = (C1802d) hVar;
                        NativeAd nativeAd = c1802d.f18235b;
                        k1 k1Var = (k1) inlineBannerAd.f10222a.e;
                        NativeAdView nativeAdView = (NativeAdView) k1Var.e;
                        TextView textView = (TextView) k1Var.f;
                        textView.setText(nativeAd.getHeadline());
                        nativeAdView.setHeadlineView(textView);
                        TextView textView2 = (TextView) k1Var.f4139d;
                        textView2.setText(nativeAd.getBody());
                        String body = nativeAd.getBody();
                        textView2.setVisibility((body == null || body.length() <= 0) ? 4 : 0);
                        nativeAdView.setBodyView(textView2);
                        ImageView imageView = (ImageView) k1Var.f4138b;
                        NativeAd.Image icon = nativeAd.getIcon();
                        if (icon == null || (drawable = icon.getDrawable()) == null) {
                            imageView.setVisibility(8);
                        } else {
                            imageView.setImageDrawable(drawable);
                            nativeAdView.setIconView(imageView);
                            imageView.setVisibility(0);
                        }
                        ((C0452f1) k1Var.c).c.setText("AD");
                        nativeAdView.setNativeAd(nativeAd);
                        Function1 function1 = c1765a.f;
                        if (function1 != null) {
                            function1.invoke(c1802d.f18234a);
                        }
                    } else if (hVar instanceof l5.e) {
                        Function1 function12 = c1765a.e;
                        if (function12 != null) {
                            function12.invoke(((l5.e) hVar).f18236a);
                        }
                    } else if (hVar instanceof C1801c) {
                        Function2 function2 = c1765a.f18115g;
                        if (function2 != null) {
                            C1801c c1801c = (C1801c) hVar;
                            function2.invoke(c1801c.f18232a, c1801c.f18233b);
                        }
                    } else if (hVar instanceof l5.f) {
                        ((FrameLayout) inlineBannerAd.f10222a.f4199d).setVisibility(8);
                    }
                }
                return Unit.f18162a;
            case 24:
                AbstractC1926c abstractC1926c = (AbstractC1926c) obj;
                boolean z9 = abstractC1926c instanceof C1924a;
                final C1852f c1852f = (C1852f) this.f753b;
                m5.g gVar = (m5.g) this.c;
                if (z9) {
                    C1924a c1924a = (C1924a) abstractC1926c;
                    if (c1852f.f18384a) {
                        if (gVar.c.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                            final C0916h c0916h = c1924a.f18616b;
                            Function1 function13 = gVar.f;
                            if (function13 != null) {
                                function13.invoke(c0916h);
                            }
                            C1075a c1075a = new C1075a(c0916h.f8526a, gVar.f18387b, c0916h.e, c0916h.f, c0916h.f8529g, null, null, null, String.valueOf(TimeUnit.MILLISECONDS.convert(System.nanoTime() - p.c, TimeUnit.NANOSECONDS)), null, null, 1760);
                            C2467a c2467a = AbstractC0617a.f6973b;
                            if (c2467a != null) {
                                c2467a.a("INTERSTITIAL_APPEAR", c1075a.a());
                            }
                            WeakReference weakReference = c1852f.f18385b;
                            Activity activity2 = weakReference != null ? (Activity) weakReference.get() : null;
                            if (activity2 != null) {
                                View viewInflate = LayoutInflater.from(activity2).inflate(R.layout.interstitial_ad_container, (ViewGroup) null, false);
                                int i19 = R.id.ad_badge_container;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.ad_badge_container);
                                if (viewFindChildViewById != null) {
                                    TextView textView3 = (TextView) viewFindChildViewById;
                                    i19 = R.id.ad_image_view;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.ad_image_view);
                                    if (imageView2 != null) {
                                        i19 = R.id.button_container;
                                        if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.button_container)) != null) {
                                            i19 = R.id.cta_button;
                                            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.cta_button);
                                            if (button != null) {
                                                i19 = R.id.dialog_close_button;
                                                Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.dialog_close_button);
                                                if (button2 != null) {
                                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(activity2, R.style.FullscreenSemiTransparentDialog);
                                                    builder2.setView(linearLayout).setCancelable(true);
                                                    AlertDialog alertDialogCreate = builder2.create();
                                                    final s5.f fVar = gVar.f18387b;
                                                    alertDialogCreate.setOnCancelListener(new DialogInterface.OnCancelListener(c1852f, fVar, c0916h) { // from class: m5.b

                                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                        public final /* synthetic */ s5.f f18373a;

                                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                        public final /* synthetic */ C0916h f18374b;

                                                        {
                                                            this.f18373a = fVar;
                                                            this.f18374b = c0916h;
                                                        }

                                                        @Override // android.content.DialogInterface.OnCancelListener
                                                        public final void onCancel(DialogInterface dialogInterface) {
                                                            C1852f.a(this.f18373a, this.f18374b, "close");
                                                        }
                                                    });
                                                    c1852f.c = alertDialogCreate;
                                                    textView3.setVisibility(c0916h.h ? 8 : 0);
                                                    Drawable drawable4 = c0916h.f8528d;
                                                    if (drawable4 != null) {
                                                        imageView2.setImageDrawable(drawable4);
                                                    } else {
                                                        Log.w("MayaAdKit/InterstitialAdView", "Ad image is null. Dialog will appear without an image.");
                                                    }
                                                    String str8 = c0916h.f8527b;
                                                    if (str8 != null) {
                                                        button.setText(str8);
                                                    }
                                                    NativeCustomFormatAd nativeCustomFormatAd = c1924a.f18615a;
                                                    final C1849c c1849c = new C1849c(nativeCustomFormatAd, gVar.e, c0916h, c1852f, fVar, activity2);
                                                    final int i20 = 0;
                                                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: m5.d
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i20) {
                                                                case 0:
                                                                    C1849c c1849c2 = c1849c;
                                                                    Callback.onClick_enter(view);
                                                                    try {
                                                                        c1849c2.invoke("asset");
                                                                        return;
                                                                    } finally {
                                                                    }
                                                                default:
                                                                    C1849c c1849c3 = c1849c;
                                                                    Callback.onClick_enter(view);
                                                                    try {
                                                                        c1849c3.invoke("CTA");
                                                                        return;
                                                                    } finally {
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() { // from class: m5.d
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i) {
                                                                case 0:
                                                                    C1849c c1849c2 = c1849c;
                                                                    Callback.onClick_enter(view);
                                                                    try {
                                                                        c1849c2.invoke("asset");
                                                                        return;
                                                                    } finally {
                                                                    }
                                                                default:
                                                                    C1849c c1849c3 = c1849c;
                                                                    Callback.onClick_enter(view);
                                                                    try {
                                                                        c1849c3.invoke("CTA");
                                                                        return;
                                                                    } finally {
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    button2.setOnClickListener(new View.OnClickListener() { // from class: m5.e
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i20) {
                                                                case 0:
                                                                    C1852f c1852f2 = c1852f;
                                                                    s5.f fVar2 = fVar;
                                                                    C0916h c0916h2 = c0916h;
                                                                    Callback.onClick_enter(view);
                                                                    try {
                                                                        C1852f.a(fVar2, c0916h2, "close");
                                                                        AlertDialog alertDialog = c1852f2.c;
                                                                        if (alertDialog != null) {
                                                                            alertDialog.dismiss();
                                                                        }
                                                                        return;
                                                                    } finally {
                                                                    }
                                                                default:
                                                                    C1852f c1852f3 = c1852f;
                                                                    s5.f fVar3 = fVar;
                                                                    C0916h c0916h3 = c0916h;
                                                                    Callback.onClick_enter(view);
                                                                    try {
                                                                        C1852f.a(fVar3, c0916h3, "close");
                                                                        AlertDialog alertDialog2 = c1852f3.c;
                                                                        if (alertDialog2 != null) {
                                                                            alertDialog2.dismiss();
                                                                        }
                                                                        return;
                                                                    } finally {
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: m5.e
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i) {
                                                                case 0:
                                                                    C1852f c1852f2 = c1852f;
                                                                    s5.f fVar2 = fVar;
                                                                    C0916h c0916h2 = c0916h;
                                                                    Callback.onClick_enter(view);
                                                                    try {
                                                                        C1852f.a(fVar2, c0916h2, "close");
                                                                        AlertDialog alertDialog = c1852f2.c;
                                                                        if (alertDialog != null) {
                                                                            alertDialog.dismiss();
                                                                        }
                                                                        return;
                                                                    } finally {
                                                                    }
                                                                default:
                                                                    C1852f c1852f3 = c1852f;
                                                                    s5.f fVar3 = fVar;
                                                                    C0916h c0916h3 = c0916h;
                                                                    Callback.onClick_enter(view);
                                                                    try {
                                                                        C1852f.a(fVar3, c0916h3, "close");
                                                                        AlertDialog alertDialog2 = c1852f3.c;
                                                                        if (alertDialog2 != null) {
                                                                            alertDialog2.dismiss();
                                                                        }
                                                                        return;
                                                                    } finally {
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    AlertDialog alertDialog = c1852f.c;
                                                    if (alertDialog != null) {
                                                        alertDialog.show();
                                                    }
                                                    nativeCustomFormatAd.recordImpression();
                                                    p.c = System.nanoTime();
                                                    C1852f.f18383d = System.currentTimeMillis();
                                                }
                                            }
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i19)));
                            }
                            Log.w("MayaAdKit/InterstitialAdView", "Cannot show ad. Activity reference is null (already destroyed).");
                            c1852f.f18384a = false;
                        } else {
                            c1852f.f18384a = false;
                        }
                    }
                } else {
                    if (!(abstractC1926c instanceof C1925b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C1925b c1925b = (C1925b) abstractC1926c;
                    if (c1852f.f18384a) {
                        C0916h c0916h2 = c1925b.c;
                        C0909a c0909a = c1925b.f18618b;
                        Function2 function22 = gVar.f18389g;
                        if (function22 != null) {
                            function22.invoke(c0916h2.f8526a, c0909a);
                        }
                        C1075a c1075a2 = new C1075a(c0916h2.f8526a, gVar.f18387b, null, null, null, Integer.valueOf(c0909a.f8514a), c0909a.f8515b, String.valueOf(c0909a.c), null, null, null, 1820);
                        C2467a c2467a2 = AbstractC0617a.f6973b;
                        if (c2467a2 != null) {
                            c2467a2.a("INTERSTITIAL_FAILED", c1075a2.a());
                        }
                        c1852f.f18384a = false;
                    }
                }
                return Unit.f18162a;
            case 25:
                ((Boolean) obj).booleanValue();
                Editable text2 = ((MayaProfileInputLayout) this.f753b).getInputEditText().getText();
                String string6 = text2 != null ? text2.toString() : null;
                if (string6 == null || C2576A.H(string6)) {
                    MayaForgotPasswordEnterMinFragment mayaForgotPasswordEnterMinFragment = (MayaForgotPasswordEnterMinFragment) this.c;
                    String string7 = mayaForgotPasswordEnterMinFragment.getString(R.string.maya_format_missing_field_is_required, mayaForgotPasswordEnterMinFragment.getString(R.string.maya_label_mobile_number));
                    j.f(string7, "getString(...)");
                    mayaForgotPasswordEnterMinFragment.I1(string7);
                }
                return Unit.f18162a;
            case 26:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment = (MayaForgotPasswordSetNewPasswordFragment) this.f753b;
                mayaForgotPasswordSetNewPasswordFragment.f12381c0 = zBooleanValue3;
                mayaForgotPasswordSetNewPasswordFragment.f12383e0 = "";
                ((MayaProfileInputLayout) this.c).f();
                mayaForgotPasswordSetNewPasswordFragment.J1(mayaForgotPasswordSetNewPasswordFragment.f12381c0);
                return Unit.f18162a;
            case 27:
                EnumC1215d enumC1215d = EnumC1215d.P2M;
                EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
                View it10 = (View) obj;
                int i21 = MayaDynamicMerchantActivity.f12840r;
                j.g(it10, "it");
                MayaDynamicMerchantActivity mayaDynamicMerchantActivity = (MayaDynamicMerchantActivity) this.f753b;
                CountDownTimer countDownTimer = mayaDynamicMerchantActivity.f12841n;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                C1220i c1220iK13 = mayaDynamicMerchantActivity.k1();
                C1219h c1219hD = C1219h.d(enumC1215d);
                c1219hD.r(enumC1216e);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.BACK_TO_MERCHANT);
                c1219hD.i();
                c1220iK13.c(mayaDynamicMerchantActivity, c1219hD);
                mayaDynamicMerchantActivity.n1();
                B5.i.f(mayaDynamicMerchantActivity, (String) this.c);
                mayaDynamicMerchantActivity.finish();
                return Unit.f18162a;
            case 28:
                EnumC1215d enumC1215d2 = EnumC1215d.P2M;
                EnumC1216e enumC1216e2 = EnumC1216e.SUCCESS;
                View it11 = (View) obj;
                int i22 = MayaMerchantActivity.f12845s;
                j.g(it11, "it");
                MayaMerchantActivity mayaMerchantActivity = (MayaMerchantActivity) this.f753b;
                C1220i c1220iK14 = mayaMerchantActivity.k1();
                C1219h c1219hD2 = C1219h.d(enumC1215d2);
                c1219hD2.r(enumC1216e2);
                c1219hD2.n(17);
                c1219hD2.t(EnumC1217f.VIEW_RECEIPT);
                c1219hD2.i();
                c1220iK14.c(mayaMerchantActivity, c1219hD2);
                boolean zIsMayaV2TransactionReceiptPayQrEnabled = mayaMerchantActivity.p1().e().isMayaV2TransactionReceiptPayQrEnabled();
                MerchantPayment merchantPayment = (MerchantPayment) this.c;
                if (zIsMayaV2TransactionReceiptPayQrEnabled) {
                    mayaMerchantPaymentReceiptFragment = new MayaV2MerchantPaymentReceiptFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("merchant_payment", merchantPayment);
                    mayaMerchantPaymentReceiptFragment.setArguments(bundle);
                } else {
                    mayaMerchantPaymentReceiptFragment = new MayaMerchantPaymentReceiptFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("merchant_payment", merchantPayment);
                    mayaMerchantPaymentReceiptFragment.setArguments(bundle2);
                }
                AbstractC1236z.g(mayaMerchantActivity, R.id.maya_activity_merchant_fragment_container, mayaMerchantPaymentReceiptFragment);
                return Unit.f18162a;
            default:
                EnumC1215d enumC1215d3 = EnumC1215d.P2M;
                EnumC1216e enumC1216e3 = EnumC1216e.SUCCESS;
                View it12 = (View) obj;
                int i23 = MayaQRPHMerchantActivity.f12851t;
                j.g(it12, "it");
                MayaQRPHMerchantActivity mayaQRPHMerchantActivity = (MayaQRPHMerchantActivity) this.f753b;
                C1220i c1220iK15 = mayaQRPHMerchantActivity.k1();
                C1219h c1219hD3 = C1219h.d(enumC1215d3);
                c1219hD3.r(enumC1216e3);
                c1219hD3.n(17);
                c1219hD3.t(EnumC1217f.VIEW_RECEIPT);
                c1219hD3.i();
                c1220iK15.c(mayaQRPHMerchantActivity, c1219hD3);
                mayaQRPHMerchantActivity.d2((QRPHMerchantPaymentTransaction) this.c);
                return Unit.f18162a;
        }
    }

    public /* synthetic */ f(String str, Enum r22, int i) {
        this.f752a = i;
        this.c = str;
        this.f753b = r22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(Function1 function1, ExecutePullFunds executePullFunds) {
        this.f752a = 4;
        this.f753b = (kotlin.jvm.internal.i) function1;
        this.c = executePullFunds;
    }
}
