package W4;

import Ah.h;
import Ah.o;
import Ah.p;
import D.H;
import D.S;
import D.b0;
import Kh.C0299d;
import Kh.C0310o;
import Kh.z;
import N5.C0447e;
import R4.i;
import T3.l;
import We.s;
import Xb.B;
import a7.C0646g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.PreferenceUtils;
import b3.k0;
import b9.InterfaceC0927c;
import bc.m;
import c0.k;
import c8.InterfaceC1083a;
import cc.InterfaceC1097j;
import cj.L;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.agent.lifecycle.VisibilityManagerImpl;
import com.google.firebase.messaging.n;
import com.google.firebase.messaging.r;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.i0;
import com.paymaya.data.api.ForgotPasswordApi;
import com.paymaya.domain.model.ForgotPasswordValidateIdentityRequest;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.model.ShopPurchaseOfficialReceipt;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.J;
import com.paymaya.domain.store.K;
import com.paymaya.mayaui.appdomemonitoring.view.activity.AppdomeThreatEventsActivity;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaAddFavoriteFragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteReminderScheduleBottomSheetFragment;
import com.paymaya.mayaui.forgotpassword.view.dialog.impl.MayaForgotPasswordSecurityTipsDialogFragment;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordEnterMinFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaWelcomeActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaWelcomeFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMfaFaceAuthFragment;
import com.paymaya.mayaui.profile.view.activity.impl.MayaProfileActivity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaWelcomeV2Fragment;
import com.paymaya.mayaui.rewardscatalog.view.fragment.MayaRewardsCatalogFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentConfirmationFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryReceiptFragment;
import com.shield.android.Shield;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.FieldOrOneOfBinding;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import ha.u;
import i8.C1594b;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;
import m8.InterfaceC1854a;
import n3.C1916a;
import rb.InterfaceC2193b;
import u5.AbstractC2302a;
import w.C2360b;
import w.C2361c;
import y5.q;
import zj.C2576A;
import zj.y;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6291b;

    public /* synthetic */ b(Object obj, int i) {
        this.f6290a = i;
        this.f6291b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strA;
        String str;
        y9.b bVar;
        int i = 5;
        int i4 = 2;
        int i6 = 12;
        int i10 = 1;
        switch (this.f6290a) {
            case 0:
                PayMayaApplication payMayaApplication = (PayMayaApplication) this.f6291b;
                int i11 = PayMayaApplication.f10200l;
                yk.a.a();
                if (payMayaApplication.j.a(A5.b.f60F1)) {
                    yk.a.a();
                    i0.c = true;
                }
                if (payMayaApplication.j.a(A5.b.f58E1)) {
                    S5.c cVar = payMayaApplication.j;
                    A5.d featureFlag = A5.e.f156b;
                    cVar.getClass();
                    j.g(featureFlag, "featureFlag");
                    String strD = cVar.f5672a.d(featureFlag, null);
                    Integer numF = strD != null ? y.f(strD) : null;
                    int iIntValue = numF != null ? numF.intValue() : 10;
                    L.c(new Pair("final_value", String.valueOf(iIntValue)));
                    yk.a.a();
                    AbstractC2302a.f20268g.scheduleWithFixedDelay(AbstractC2302a.h, 0L, iIntValue, TimeUnit.SECONDS);
                }
                if (payMayaApplication.f10202b.F()) {
                    synchronized (i0.class) {
                        if (i0.c) {
                            yk.a.a();
                        } else {
                            yk.a.a();
                            if (!i0.f11214a) {
                                ((PayMayaApplication) payMayaApplication.getApplicationContext()).getClass();
                                try {
                                    strA = PayMayaApplication.a(PayMayaApplication.getEncryptedShield());
                                } catch (Exception unused) {
                                    yk.a.e();
                                    strA = "";
                                }
                                Shield.setSingletonInstance(new Shield.Builder(payMayaApplication, "940c5ecf154a2dd669454fc022ed18283a8196d9", strA).setLogLevel(Shield.LogLevel.NONE).setEnvironment(i0.c()).build());
                                Shield.getInstance().setDeviceResultStateListener(new n(i6));
                                i0.f11214a = true;
                            }
                        }
                        break;
                    }
                }
                B5.c cVar2 = payMayaApplication.h;
                cVar2.getClass();
                if (cVar2.e == null) {
                    A5.f fVar = A5.f.f158d;
                    S5.c cVar3 = cVar2.f355d;
                    z zVar = new z(S5.c.f(cVar3, fVar), B5.a.f347b, i);
                    B5.a aVar = B5.a.c;
                    C1916a c1916a = Eh.d.c;
                    mg.c cVar4 = Eh.d.f1365b;
                    C0310o c0310o = new C0310o(new z(new C0310o(zVar, c1916a, aVar, cVar4), B5.a.f348d, i10).e(zh.b.a()), new C2361c(cVar2, 4), c1916a, cVar4);
                    C0310o c0310o2 = new C0310o(new z(new z(S5.c.f(cVar3, A5.f.f), B5.a.e, i), B5.a.f, i10).e(zh.b.a()), new J5.a(cVar2, i), c1916a, cVar4);
                    C2360b c2360b = new C2360b(new J5.c(cVar2, i), 20);
                    int i12 = Ah.d.f312a;
                    Eh.d.a(i12, "bufferSize");
                    cVar2.e = (Gh.f) new C0299d(new h[]{c0310o, c0310o2}, c2360b, i12 << 1).f();
                }
                payMayaApplication.registerActivityLifecycleCallbacks(new B5.b(cVar2, i));
                return Unit.f18162a;
            case 1:
                Context context = ((W5.c) this.f6291b).f6311a;
                return context.getSharedPreferences(context.getPackageName() + "_split_config", 0);
            case 2:
                A7.j jVar = (A7.j) this.f6291b;
                if (S5.c.b((S5.c) jVar.e, A5.b.f53B1)) {
                    MayaWelcomeActivity mayaWelcomeActivity = (MayaWelcomeActivity) ((InterfaceC0927c) jVar.c.get());
                    String stringExtra = mayaWelcomeActivity.getIntent().getStringExtra("source_screen");
                    str = stringExtra != null ? stringExtra : "";
                    try {
                        Object objNewInstance = MayaWelcomeV2Fragment.class.getDeclaredConstructor(null).newInstance(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("SOURCE_SCREEN", str);
                        ((Fragment) objNewInstance).setArguments(bundle);
                        j.d(objNewInstance);
                        AbstractC1236z.g(mayaWelcomeActivity, R.id.fragment_container_layout, (MayaWelcomeV2Fragment) ((Fragment) objNewInstance));
                    } catch (Exception e) {
                        throw new RuntimeException(androidx.camera.core.impl.a.g(MayaWelcomeV2Fragment.class, "Could not create instance of "), e);
                    }
                } else {
                    MayaWelcomeActivity mayaWelcomeActivity2 = (MayaWelcomeActivity) ((InterfaceC0927c) jVar.c.get());
                    String stringExtra2 = mayaWelcomeActivity2.getIntent().getStringExtra("source_screen");
                    str = stringExtra2 != null ? stringExtra2 : "";
                    try {
                        Object objNewInstance2 = MayaWelcomeFragment.class.getDeclaredConstructor(null).newInstance(null);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("SOURCE_SCREEN", str);
                        ((Fragment) objNewInstance2).setArguments(bundle2);
                        j.d(objNewInstance2);
                        AbstractC1236z.g(mayaWelcomeActivity2, R.id.fragment_container_layout, (MayaWelcomeFragment) ((Fragment) objNewInstance2));
                    } catch (Exception e7) {
                        throw new RuntimeException(androidx.camera.core.impl.a.g(MayaWelcomeFragment.class, "Could not create instance of "), e7);
                    }
                }
                return Unit.f18162a;
            case 3:
                int i13 = MayaCarousel.f11992x0;
                return new C0646g((MayaCarousel) this.f6291b);
            case 4:
                return ((WorkContinuationImpl) this.f6291b).lambda$enqueue$0();
            case 5:
                return Long.valueOf(((PreferenceUtils) this.f6291b).getLastCancelAllTimeMillis());
            case 6:
                return ((WorkManagerImpl) this.f6291b).lambda$rescheduleEligibleWork$0();
            case 7:
                ((k0) this.f6291b).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                j.f(uuidRandomUUID, "randomUUID(...)");
                String string = uuidRandomUUID.toString();
                j.f(string, "toString(...)");
                return string;
            case 8:
                InterfaceC1097j interfaceC1097j = ((MayaShopPaymentConfirmationFragment) this.f6291b).f14027a0;
                if (interfaceC1097j != null) {
                    ((MayaShopV2Activity) interfaceC1097j).finish();
                }
                return Unit.f18162a;
            case 9:
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment = (MayaShopPurchaseHistoryReceiptFragment) this.f6291b;
                B bM2 = mayaShopPurchaseHistoryReceiptFragment.m2();
                ShopPurchaseHistory shopPurchaseHistory = mayaShopPurchaseHistoryReceiptFragment.N0;
                String strMOrderReferenceNumber = shopPurchaseHistory != null ? shopPurchaseHistory.mOrderReferenceNumber() : null;
                ((MayaBaseFragment) ((m) bM2.c.get())).E1();
                p<ShopPurchaseOfficialReceipt> purchaseOfficialReceipt = bM2.f6551d.f11480b.getPurchaseOfficialReceipt(strMOrderReferenceNumber);
                new Lh.d(new Lh.d(AbstractC1331a.l(purchaseOfficialReceipt, purchaseOfficialReceipt, zh.b.a()), new i(bM2, i6), i4), new l(bM2, 13), i).e();
                return Unit.f18162a;
            case 10:
                return D.f((Object[]) this.f6291b);
            case 11:
                return ((Iterable) this.f6291b).iterator();
            case 12:
                yk.a.f();
                K k8 = (K) this.f6291b;
                if (S5.c.b(k8.c, A5.b.f58E1)) {
                    C1219h c1219hE = C1219h.e("DEVICE_EXTRACTION_START");
                    c1219hE.g("event_trigger", "threat-event");
                    c1219hE.l();
                    k8.f11363b.b(c1219hE);
                    try {
                        E4.d.b(k8.f11364d.C(), new J(k8, new C5.a()));
                    } catch (Exception e10) {
                        K.f(e10);
                    }
                    break;
                }
                return Unit.f18162a;
            case 13:
                return ReverseProtoWriter.forwardWriter_delegate$lambda$1((ReverseProtoWriter) this.f6291b);
            case 14:
                return FieldOrOneOfBinding.adapter_delegate$lambda$0((FieldOrOneOfBinding) this.f6291b);
            case 15:
                r this$0 = (r) this.f6291b;
                j.g(this$0, "this$0");
                k kVar = (k) this$0.f9803b;
                CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this$0.c;
                H h = (H) this$0.f9804d;
                S sC = cleverTapInstanceConfig.c();
                j.f(sC, "getLogger(...)");
                String str2 = cleverTapInstanceConfig.f9439a;
                j.f(str2, "getAccountId(...)");
                B1.a aVar2 = new B1.a(cleverTapInstanceConfig.f9452u, sC, str2);
                CleverTapInstanceConfig cleverTapInstanceConfig2 = kVar.f9211b;
                Context context2 = kVar.f9210a;
                String strH = b0.h(context2, cleverTapInstanceConfig2, "comms_dmn", null);
                String strH2 = b0.h(context2, cleverTapInstanceConfig2, "comms_dmn_spiky", null);
                String str3 = cleverTapInstanceConfig.f9441d;
                String str4 = cleverTapInstanceConfig.e;
                String str5 = cleverTapInstanceConfig.f;
                String str6 = cleverTapInstanceConfig.c;
                j.f(str6, "getAccountToken(...)");
                String strValueOf = String.valueOf(h.e().f833l);
                S sC2 = cleverTapInstanceConfig.c();
                j.f(sC2, "getLogger(...)");
                return new d0.b(aVar2, strH, strH2, cleverTapInstanceConfig.f9440b, str3, str4, str5, str2, str6, strValueOf, sC2, str2);
            case 16:
                Y7.b bVar2 = (Y7.b) ((MayaAddFavoriteFragment) this.f6291b).G1();
                InterfaceC1083a interfaceC1083a = (InterfaceC1083a) bVar2.c.get();
                MayaInputLayout mayaInputLayout = ((MayaAddFavoriteFragment) ((InterfaceC1083a) bVar2.c.get())).f12322V;
                if (mayaInputLayout == null) {
                    j.n("mMayaInputLayoutFavoriteName");
                    throw null;
                }
                String string2 = C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString();
                boolean z4 = ((string2 == null || C2576A.H(string2)) ? 1 : 0) ^ 1;
                Button button = ((MayaAddFavoriteFragment) interfaceC1083a).f12325Y;
                if (button != null) {
                    button.setEnabled(z4);
                    return Unit.f18162a;
                }
                j.n("mButtonSave");
                throw null;
            case 17:
                Bundle arguments = ((MayaFavoriteReminderScheduleBottomSheetFragment) this.f6291b).getArguments();
                if (arguments != null) {
                    return Integer.valueOf(arguments.getInt("last_selected_day"));
                }
                return null;
            case 18:
                kotlin.jvm.internal.y connection = (kotlin.jvm.internal.y) this.f6291b;
                j.g(connection, "$connection");
                ((HttpsURLConnection) connection.f18195a).disconnect();
                return Unit.f18162a;
            case 19:
                int i14 = AppdomeThreatEventsActivity.f;
                List listA = AbstractC2302a.a();
                C0447e c0447e = ((AppdomeThreatEventsActivity) this.f6291b).c;
                j.d(c0447e);
                com.google.gson.k kVar2 = new com.google.gson.k();
                com.google.gson.i iVar = com.google.gson.i.e;
                Objects.requireNonNull(iVar);
                kVar2.f10027k = iVar;
                ((TextView) c0447e.f).setText(kVar2.a().k(listA));
                return Unit.f18162a;
            case 20:
                Ci.b bVar3 = (Ci.b) this.f6291b;
                Context context3 = (Activity) bVar3.c;
                if (context3 == null) {
                    context3 = (Context) bVar3.f785b;
                }
                return s.i(context3.getPackageName(), ".flutter.share_provider");
            case 21:
                ((MayaForgotPasswordSecurityTipsDialogFragment) this.f6291b).dismiss();
                return Unit.f18162a;
            case 22:
                MayaForgotPasswordEnterMinFragment mayaForgotPasswordEnterMinFragment = (MayaForgotPasswordEnterMinFragment) this.f6291b;
                C1229s c1229s = mayaForgotPasswordEnterMinFragment.f12373c0;
                if (c1229s == null) {
                    j.n("mAuthAnalyticsUtils");
                    throw null;
                }
                FragmentActivity fragmentActivityRequireActivity = mayaForgotPasswordEnterMinFragment.requireActivity();
                j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                Button button2 = mayaForgotPasswordEnterMinFragment.f12369Y;
                if (button2 == null) {
                    j.n("mNextButton");
                    throw null;
                }
                C1229s.c(c1229s, fragmentActivityRequireActivity, "FORGOT_PASSWORD_SCREEN_TAPPED", "Enter your number", "Please verify your identity (Bottom sheet)", button2.getText().toString(), null, null, null, 224);
                C1594b c1594bJ1 = mayaForgotPasswordEnterMinFragment.J1();
                ((MayaBaseFragment) ((InterfaceC1854a) c1594bJ1.c.get())).E1();
                MayaProfileInputLayout mayaProfileInputLayout = ((MayaForgotPasswordEnterMinFragment) ((InterfaceC1854a) c1594bJ1.c.get())).f12367W;
                if (mayaProfileInputLayout == null) {
                    j.n("mMayaInputLayoutCurrentMobileNumber");
                    throw null;
                }
                String strH3 = AbstractC1414e.h("+63", C2576A.b0(String.valueOf(mayaProfileInputLayout.getInputEditText().getText())).toString());
                ForgotPasswordValidateIdentityRequest forgotPasswordValidateIdentityRequest = new ForgotPasswordValidateIdentityRequest("msisdn", strH3);
                com.paymaya.domain.store.L l6 = c1594bJ1.f17124d;
                l6.getClass();
                Ah.a aVarValidateIdentity = ((ForgotPasswordApi) l6.f11367b).validateIdentity(forgotPasswordValidateIdentityRequest);
                o oVarA = zh.b.a();
                aVarValidateIdentity.getClass();
                c1594bJ1.e(new Hh.f(aVarValidateIdentity, oVarA, 0).a(new u(3, c1594bJ1, strH3)).b(new C1258f0(c1594bJ1, i6)).c());
                return Unit.f18162a;
            case 23:
                int i15 = MayaProfileActivity.f13490r;
                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) this.f6291b;
                mayaProfileActivity.n1();
                Intent intent = new Intent(mayaProfileActivity.getApplicationContext(), (Class<?>) MayaDashboardActivity.class);
                intent.setData(Uri.parse("paymaya://mycards"));
                mayaProfileActivity.startActivity(intent);
                return Unit.f18162a;
            case 24:
                o6.f fVar2 = (o6.f) this.f6291b;
                if (fVar2 != null) {
                    MayaRewardsCatalogFragment mayaRewardsCatalogFragment = (MayaRewardsCatalogFragment) fVar2.f18793b;
                    if (mayaRewardsCatalogFragment.f13731j0) {
                        mayaRewardsCatalogFragment.H1(mayaRewardsCatalogFragment.f13732k0, null, "See all", "rewards_catalog_home");
                        InterfaceC2193b interfaceC2193b = mayaRewardsCatalogFragment.f13717V;
                        if (interfaceC2193b != null) {
                            ((MayaDashboardActivity) interfaceC2193b).Y1().l("paymaya://mycards/carddashboard/mbcc-benefits");
                        }
                    } else {
                        mayaRewardsCatalogFragment.H1(mayaRewardsCatalogFragment.f13732k0, null, "Get Maya Black", "cc_application");
                        InterfaceC2193b interfaceC2193b2 = mayaRewardsCatalogFragment.f13717V;
                        if (interfaceC2193b2 != null) {
                            ((MayaDashboardActivity) interfaceC2193b2).f2();
                        }
                    }
                }
                return Unit.f18162a;
            case 25:
                return ((VisibilityManagerImpl) this.f6291b).getVisibilityStatus();
            case 26:
                return new C5.a(((q) this.f6291b).getClass().getSimpleName());
            case 27:
                Bundle arguments2 = ((MayaBaseBottomSheetDialogFragment) this.f6291b).getArguments();
                return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("loadMayaTheme") : false);
            case 28:
                return new C5.a(((MayaBaseFragment) this.f6291b).getClass().getSimpleName());
            default:
                MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment = (MayaMfaFaceAuthFragment) this.f6291b;
                if (mayaMfaFaceAuthFragment.f12937Y && (bVar = mayaMfaFaceAuthFragment.f12936X) != null) {
                    ((MayaMfaActivity) bVar).a2();
                }
                return Unit.f18162a;
        }
    }
}
