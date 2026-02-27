package Ag;

import Bj.C0144h0;
import D.S;
import L9.B;
import M8.T;
import M8.T2;
import N5.C0457h0;
import N5.Y;
import Ng.E;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.hardware.Camera;
import android.text.Editable;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.C1110A;
import cj.C1132s;
import cj.M;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.agent.userinteraction.handler.TouchUserInteractionHandler;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.A;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.model.RewardsCatalog;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSetNewPasswordFragment;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSuccessFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycAccountUnderReviewActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAccountUnderReviewFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompleteYourMayaExperienceFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompleteYourMayaExperienceFragmentV2;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWeWillTakeItFromHereFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationUserFragment;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;
import com.paymaya.mayaui.regv2.view.bottomsheet.impl.MayaProminentDisclosureBottomSheetDialogFragment;
import com.paymaya.mayaui.rewardscatalog.view.fragment.MayaRewardsCatalogFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaPersonalDetailsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserUpdateWorkDetailsFragment;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import com.squareup.wire.internal.ReflectionKt;
import d2.C1328c;
import io.ktor.utils.io.z;
import j8.InterfaceC1671a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.internal.JsonException;
import rb.InterfaceC2193b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f297b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f296a = i;
        this.f297b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        String[] strArrNames;
        switch (this.f296a) {
            case 0:
                return (io.ktor.utils.io.k) z.e(C0144h0.f623a, (CoroutineContext) this.f297b, new m((Og.f) this.c, null), 2).f16555b;
            case 1:
                CleverTapInstanceConfig config = (CleverTapInstanceConfig) this.c;
                kotlin.jvm.internal.j.g(config, "$config");
                return T.b.f.h((Context) this.f297b, config.c());
            case 2:
                SurfaceHolder surfaceHolder = (SurfaceHolder) this.c;
                Camera camera = ((E8.r) this.f297b).c;
                if (camera != null) {
                    try {
                        camera.setPreviewDisplay(surfaceHolder);
                    } catch (IOException e) {
                        e.getMessage();
                        yk.a.a();
                    }
                    camera.setDisplayOrientation(90);
                    camera.startPreview();
                    break;
                }
                return Unit.f18162a;
            case 3:
                KycMayaDropDown kycMayaDropDown = (KycMayaDropDown) this.c;
                ((Function1) this.f297b).invoke(kycMayaDropDown.getSelectedData());
                kycMayaDropDown.requestFocus();
                return Unit.f18162a;
            case 4:
                int i = MayaKycAccountUnderReviewActivity.f12440r;
                MayaKycAccountUnderReviewActivity mayaKycAccountUnderReviewActivity = (MayaKycAccountUnderReviewActivity) this.f297b;
                mayaKycAccountUnderReviewActivity.n1().k0(mayaKycAccountUnderReviewActivity, (String) this.c);
                return Unit.f18162a;
            case 5:
                ((B) this.f297b).k((CreditResponse) this.c);
                return Unit.f18162a;
            case 6:
                Ld.a aVar = (Ld.a) this.f297b;
                String str = (String) this.c;
                com.paymaya.data.preference.a aVar2 = aVar.e;
                if (aVar2.J()) {
                    String strD = aVar.f.d(A5.f.f158d);
                    Object maintenanceDynamicConfig = new MaintenanceDynamicConfig();
                    try {
                        C1037h.a aVar3 = C1037h.f9166b;
                        objA = A.f10366a.e(strD, MaintenanceDynamicConfig.class);
                    } catch (Throwable th2) {
                        C1037h.a aVar4 = C1037h.f9166b;
                        objA = AbstractC1039j.a(th2);
                    }
                    Object obj = objA instanceof C1038i ? null : objA;
                    if (obj != null) {
                        maintenanceDynamicConfig = obj;
                    }
                    MaintenanceDynamicConfig maintenanceDynamicConfig2 = (MaintenanceDynamicConfig) maintenanceDynamicConfig;
                    aVar2.Q(maintenanceDynamicConfig2.isAppMaintenance());
                    zIsAppMaintenance = maintenanceDynamicConfig2.isAppMaintenance();
                    break;
                }
                if (zIsAppMaintenance) {
                    ((DeepLinkActivity) ((Md.a) aVar.c.get())).e.f.a();
                } else if (aVar.e.F()) {
                    aVar.o(str);
                } else {
                    DeepLinkActivity deepLinkActivity = (DeepLinkActivity) ((Md.a) aVar.c.get());
                    deepLinkActivity.getClass();
                    MayaProminentDisclosureBottomSheetDialogFragment mayaProminentDisclosureBottomSheetDialogFragment = new MayaProminentDisclosureBottomSheetDialogFragment();
                    mayaProminentDisclosureBottomSheetDialogFragment.show(deepLinkActivity.getSupportFragmentManager(), mayaProminentDisclosureBottomSheetDialogFragment.getTag());
                }
                return Unit.f18162a;
            case 7:
                KeyEventDispatcher.Component componentRequireActivity = ((MayaKycAccountUnderReviewFragment) this.f297b).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity);
                mayaKycActivity.n1().k0(mayaKycActivity, (String) this.c);
                return Unit.f18162a;
            case 8:
                KycFieldType kycFieldType = KycFieldType.MIDDLE_NAME;
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) this.f297b;
                mayaKycCompletePersonalInformationFragment.D3((MayaInputLayout) this.c, kycFieldType, new T(2, mayaKycCompletePersonalInformationFragment.I2(), B8.c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 13));
                return Unit.f18162a;
            case 9:
                MayaKycCompleteYourMayaExperienceFragment mayaKycCompleteYourMayaExperienceFragment = (MayaKycCompleteYourMayaExperienceFragment) this.f297b;
                T2.Q(mayaKycCompleteYourMayaExperienceFragment, ((Y) mayaKycCompleteYourMayaExperienceFragment.G1()).h.getText().toString(), null, null, 14);
                ((MayaKycActivity) ((H8.b) this.c)).finish();
                return Unit.f18162a;
            case 10:
                MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV2 = (MayaKycCompleteYourMayaExperienceFragmentV2) this.f297b;
                T2.Q(mayaKycCompleteYourMayaExperienceFragmentV2, ((C0457h0) mayaKycCompleteYourMayaExperienceFragmentV2.G1()).f4109n.getText().toString(), null, null, 14);
                ((MayaKycActivity) ((H8.b) this.c)).finish();
                return Unit.f18162a;
            case 11:
                MayaKycWeWillTakeItFromHereFragment mayaKycWeWillTakeItFromHereFragment = (MayaKycWeWillTakeItFromHereFragment) this.f297b;
                mayaKycWeWillTakeItFromHereFragment.K1();
                String string = mayaKycWeWillTakeItFromHereFragment.getString(R.string.maya_button_back_to_home);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                String string2 = mayaKycWeWillTakeItFromHereFragment.getString(R.string.maya_dashboard_screen_label);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                T2.Q(mayaKycWeWillTakeItFromHereFragment, string, string2, null, 12);
                ((MayaKycActivity) ((H8.b) this.c)).finish();
                return Unit.f18162a;
            case 12:
                ((N8.d) this.f297b).f4334b.invoke((KycSelectionItem) this.c);
                return Unit.f18162a;
            case 13:
                DeepLinkActivity deepLinkActivity2 = (DeepLinkActivity) this.f297b;
                deepLinkActivity2.f14619l.p((String) this.c);
                Ld.a aVar5 = deepLinkActivity2.f14619l;
                aVar5.getClass();
                k kVar = new k(aVar5, 28);
                aVar5.f2958g.getClass();
                A5.m.c(kVar);
                deepLinkActivity2.f14620n = false;
                return Unit.f18162a;
            case 14:
                if (((ArrayList) this.f297b).isEmpty()) {
                    return "";
                }
                E e7 = (E) this.c;
                int iE = C2576A.E(e7.f, '/', e7.h.f4409a.length() + 3, 4);
                if (iE == -1) {
                    return "";
                }
                String str2 = e7.f;
                int iG = C2576A.G(str2, new char[]{'?', '#'}, iE, false);
                if (iG == -1) {
                    String strSubstring = str2.substring(iE);
                    kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                    return strSubstring;
                }
                String strSubstring2 = str2.substring(iE, iG);
                kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                return strSubstring2;
            case 15:
                Class clsE = androidx.core.content.pm.a.e();
                PayMayaApplication payMayaApplication = (PayMayaApplication) this.f297b;
                ShortcutManager shortcutManagerC = androidx.core.content.pm.a.c(payMayaApplication.getSystemService(clsE));
                if (shortcutManagerC != null) {
                    String string3 = payMayaApplication.getString(R.string.maya_shortcut_short_label_qr_scanner);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    ShortcutInfo shortcutInfoS = qk.i.s(0, payMayaApplication, "scan", "paymaya://scanqr?source=shortcut", string3, R.mipmap.maya_ic_shortcut_scan);
                    int i4 = ((com.paymaya.data.preference.a) this.c).e().isRequestMoneyTileUpdateEnabled() ? R.mipmap.maya_ic_shortcut_qr : R.mipmap.maya_ic_shortcut_qrph;
                    String string4 = payMayaApplication.getString(R.string.maya_shortcut_short_label_qr_personal);
                    kotlin.jvm.internal.j.f(string4, "getString(...)");
                    try {
                        shortcutManagerC.addDynamicShortcuts(C1132s.g(shortcutInfoS, qk.i.s(1, payMayaApplication, "qr", "paymaya://requestmoney?source=shortcut", string4, i4)));
                    } catch (Exception e10) {
                        yk.a.a();
                        C1328c.a().b(e10);
                    }
                    break;
                }
                return Unit.f18162a;
            case 16:
                Tj.g gVar = (Tj.g) this.f297b;
                gVar.getClass();
                Enum[] enumArr = (Enum[]) gVar.f5864b;
                Tj.f fVar = new Tj.f((String) this.c, enumArr.length);
                for (Enum r02 : enumArr) {
                    fVar.j(r02.name(), false);
                }
                return fVar;
            case 17:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Uj.b bVar = (Uj.b) this.c;
                Uj.d dVar = bVar.f6006a;
                Rj.d dVar2 = (Rj.d) this.f297b;
                Vj.f.f(dVar2, bVar);
                int iD = dVar2.d();
                for (int i6 = 0; i6 < iD; i6++) {
                    List listF = dVar2.f(i6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listF) {
                        if (obj2 instanceof Uj.e) {
                            arrayList.add(obj2);
                        }
                    }
                    Uj.e eVar = (Uj.e) C1110A.P(arrayList);
                    if (eVar != null && (strArrNames = eVar.names()) != null) {
                        for (String str3 : strArrNames) {
                            String str4 = kotlin.jvm.internal.j.b(dVar2.getKind(), Rj.h.f5571d) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str3)) {
                                String message = "The suggested name '" + str3 + "' for " + str4 + ' ' + dVar2.e(i6) + " is already one of the names for " + str4 + ' ' + dVar2.e(((Number) M.f(linkedHashMap, str3)).intValue()) + " in " + dVar2;
                                kotlin.jvm.internal.j.g(message, "message");
                                throw new JsonException(message);
                            }
                            linkedHashMap.put(str3, Integer.valueOf(i6));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? M.e() : linkedHashMap;
            case 18:
                Context context = (Context) this.f297b;
                kotlin.jvm.internal.j.g(context, "$context");
                S logger = (S) this.c;
                kotlin.jvm.internal.j.g(logger, "$logger");
                return T.b.f.h(context, logger);
            case 19:
                return ReflectionKt.createRuntimeMessageAdapter$lambda$0((Class) this.f297b, (Class) this.c);
            case 20:
                MayaRegistrationUserFragment mayaRegistrationUserFragment = (MayaRegistrationUserFragment) this.f297b;
                mayaRegistrationUserFragment.m0 = false;
                String string5 = mayaRegistrationUserFragment.getString(R.string.maya_format_error_invalid_email);
                kotlin.jvm.internal.j.f(string5, "getString(...)");
                mayaRegistrationUserFragment.f12825q0 = string5;
                M2.b.Q((MayaInputLayout) this.c, string5);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 21:
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment = (MayaForgotPasswordSetNewPasswordFragment) this.f297b;
                mayaForgotPasswordSetNewPasswordFragment.f12382d0 = true;
                mayaForgotPasswordSetNewPasswordFragment.f12384f0 = "";
                ((MayaProfileInputLayout) this.c).f();
                mayaForgotPasswordSetNewPasswordFragment.J1(mayaForgotPasswordSetNewPasswordFragment.f12382d0);
                return Unit.f18162a;
            case 22:
                MayaForgotPasswordSuccessFragment mayaForgotPasswordSuccessFragment = (MayaForgotPasswordSuccessFragment) this.f297b;
                C1229s c1229s = mayaForgotPasswordSuccessFragment.f12392a0;
                if (c1229s == null) {
                    kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
                    throw null;
                }
                FragmentActivity fragmentActivityRequireActivity = mayaForgotPasswordSuccessFragment.requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                Button button = mayaForgotPasswordSuccessFragment.f12389X;
                if (button == null) {
                    kotlin.jvm.internal.j.n("mLoginButton");
                    throw null;
                }
                C1229s.c(c1229s, fragmentActivityRequireActivity, "FORGOT_PASSWORD_SCREEN_TAPPED", "Password changed", "Login Page", button.getText().toString(), null, null, null, 224);
                ((MayaForgotPasswordActivity) ((InterfaceC1671a) this.c)).finish();
                return Unit.f18162a;
            case 23:
                o6.f fVar2 = (o6.f) this.f297b;
                if (fVar2 != null) {
                    RewardsCatalog rewardsCatalog = (RewardsCatalog) this.c;
                    MayaRewardsCatalogFragment mayaRewardsCatalogFragment = (MayaRewardsCatalogFragment) fVar2.f18793b;
                    if (mayaRewardsCatalogFragment.f13731j0) {
                        mayaRewardsCatalogFragment.H1(mayaRewardsCatalogFragment.f13732k0, rewardsCatalog.getProductId(), rewardsCatalog.getTitle(), "product_details_page");
                        InterfaceC2193b interfaceC2193b = mayaRewardsCatalogFragment.f13717V;
                        if (interfaceC2193b != null) {
                            String productId = rewardsCatalog.getProductId();
                            kotlin.jvm.internal.j.g(productId, "productId");
                            ((MayaDashboardActivity) interfaceC2193b).Y1().l("paymaya://mycards/carddashboard/catalog?" + "product_id=".concat(productId));
                        }
                    } else {
                        mayaRewardsCatalogFragment.H1(mayaRewardsCatalogFragment.f13732k0, rewardsCatalog.getProductId(), rewardsCatalog.getTitle(), "cc_application");
                        InterfaceC2193b interfaceC2193b2 = mayaRewardsCatalogFragment.f13717V;
                        if (interfaceC2193b2 != null) {
                            ((MayaDashboardActivity) interfaceC2193b2).f2();
                        }
                    }
                }
                return Unit.f18162a;
            case 24:
                return TouchUserInteractionHandler.onMotionEvent$lambda$0((TouchUserInteractionHandler) this.f297b, (View) this.c);
            case 25:
                C1220i c1220i = ((BaseFragment) this.f297b).f10245B;
                C1219h c1219h = new C1219h();
                c1219h.p(EnumC1215d.IN_APP_REVIEW);
                c1219h.r(EnumC1216e.PROMPT);
                c1219h.n(2);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("module", (String) this.c);
                c1220i.b(c1219h);
                return Unit.f18162a;
            case 26:
                C1220i c1220iO1 = ((MayaBaseFragment) this.f297b).o1();
                C1219h c1219h2 = new C1219h();
                c1219h2.p(EnumC1215d.IN_APP_REVIEW);
                c1219h2.r(EnumC1216e.PROMPT);
                c1219h2.n(2);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219h2.j.put("module", (String) this.c);
                c1220iO1.b(c1219h2);
                return Unit.f18162a;
            case 27:
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) this.f297b;
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) this.c;
                Editable text = mayaProfileInputLayout.getInputEditText().getText();
                int length = text != null ? text.length() : 0;
                x9.c cVar = (x9.c) mayaMultiTypeOtpFragment.I1().c.get();
                Integer num = AbstractC1233w.f11246u;
                zIsAppMaintenance = num != null && length == num.intValue();
                Button button2 = ((MayaMultiTypeOtpFragment) cVar).f12947a0;
                if (button2 != null) {
                    button2.setEnabled(zIsAppMaintenance);
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n("mVerifyButton");
                throw null;
            case 28:
                MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) this.c;
                kotlin.jvm.internal.j.d(mayaProfileInputLayout2);
                ((MayaPersonalDetailsFragment) this.f297b).R1(mayaProfileInputLayout2);
                return Unit.f18162a;
            default:
                ((MayaUserUpdateWorkDetailsFragment) this.f297b).R1((MayaProfileInputLayout) this.c);
                return Unit.f18162a;
        }
    }
}
