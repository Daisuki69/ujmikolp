package G7;

import Kh.T;
import L9.C0325c;
import M8.E1;
import M8.T2;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import bg.AbstractC0983W;
import cj.L;
import cj.M;
import com.google.android.gms.tasks.OnSuccessListener;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseDialogFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.model.PersonalInfoConfirmAction;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.F0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCardPullV2Activity;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInPartnerFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInReceiptFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionConfirmationFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaSuccessDialogFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUpdateNameFlutterScreen;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import com.paymaya.mayaui.dataprivacy.view.dialog.impl.MayaDataPrivacyDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMinorTakeAPhotoFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycPersonalInfoConfirmSubmissionFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV2Fragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaDisplayNamePasswordBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersReceiptFragment;
import com.paymaya.mayaui.xp.view.fragment.MayaXpEntryFragment;
import d4.AbstractC1331a;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k2.v0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.reflect.KProperty;
import w.C2361c;
import z7.InterfaceC2555b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements pg.s, G5.t, FragmentResultListener, OnSuccessListener, g0, OnApplyWindowInsetsListener, Ch.a, ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1921b;

    public /* synthetic */ t(Object obj, int i) {
        this.f1920a = i;
        this.f1921b = obj;
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        switch (this.f1920a) {
            case 5:
                MayaVouchersReceiptFragment mayaVouchersReceiptFragment = (MayaVouchersReceiptFragment) this.f1921b;
                Gc.j jVar = mayaVouchersReceiptFragment.f14328x0;
                if (jVar != null) {
                    Uri uriC = h0.c(mayaVouchersReceiptFragment.getActivity(), file);
                    MayaVouchersActivity mayaVouchersActivity = (MayaVouchersActivity) jVar;
                    mayaVouchersActivity.n1();
                    B5.i.D(mayaVouchersActivity, "Share Receipt", null, uriC);
                }
                break;
            default:
                MayaCashInReceiptFragment mayaCashInReceiptFragment = (MayaCashInReceiptFragment) this.f1921b;
                L6.s sVar = mayaCashInReceiptFragment.f11712E0;
                if (sVar != null) {
                    Uri uriC2 = h0.c(mayaCashInReceiptFragment.getActivity(), file);
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) sVar;
                    mayaCashInActivity.n1();
                    B5.i.W(mayaCashInActivity, "Share Receipt", uriC2);
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // G5.t
    public void m(String str, View view) {
        L6.G g8;
        switch (this.f1920a) {
            case 1:
                F7.s sVar = (F7.s) ((A7.A) ((MayaWalletFragment) this.f1921b).P1()).c.get();
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1530925663:
                            if (str.equals("Hotline")) {
                                v0.F(sVar, "hotline", null, 24);
                                G g10 = ((MayaWalletFragment) sVar).f12245k1;
                                if (g10 != null) {
                                    MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g10;
                                    mayaDashboardActivity.n1();
                                    Intent intent = new Intent("android.intent.action.DIAL");
                                    intent.setData(Uri.parse("tel:(632)88457788"));
                                    mayaDashboardActivity.startActivity(intent);
                                    return;
                                }
                                return;
                            }
                            return;
                        case -477628818:
                            if (str.equals("ServiceAdvisory")) {
                                v0.F(sVar, "service_advisories", null, 24);
                                MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) sVar;
                                G g11 = mayaWalletFragment.f12245k1;
                                if (g11 != null) {
                                    MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) g11;
                                    mayaDashboardActivity2.n1().i0(mayaDashboardActivity2, "https://support.maya.ph/s/status", mayaWalletFragment.getString(R.string.maya_label_help_center));
                                    return;
                                }
                                return;
                            }
                            return;
                        case 66079:
                            if (str.equals("BSP")) {
                                v0.F(sVar, "bsp", null, 24);
                                G g12 = ((MayaWalletFragment) sVar).f12245k1;
                                if (g12 != null) {
                                    ((MayaDashboardActivity) g12).v2("https://www.bsp.gov.ph");
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2245473:
                            if (str.equals("Help")) {
                                v0.F(sVar, "help_center", null, 24);
                                G g13 = ((MayaWalletFragment) sVar).f12245k1;
                                if (g13 != null) {
                                    ((MayaDashboardActivity) g13).Y1().p();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 10:
                com.squareup.wire.internal.a aVar = (com.squareup.wire.internal.a) this.f1921b;
                if (str == null) {
                    str = "";
                }
                aVar.invoke(str);
                return;
            case 11:
                Ae.a aVar2 = ((MayaCashInPartnerFragment) this.f1921b).f11706Y;
                if (aVar2 == null) {
                    kotlin.jvm.internal.j.n("mMayaCashInPartnerFragmentPresenter");
                    throw null;
                }
                if (str != null) {
                    if (!com.paymaya.common.utility.C.Y(str)) {
                        MayaCashInPartnerFragment mayaCashInPartnerFragment = (MayaCashInPartnerFragment) ((K6.i) aVar2.c.get());
                        mayaCashInPartnerFragment.getClass();
                        L6.r rVar = mayaCashInPartnerFragment.f11707Z;
                        if (rVar != null) {
                            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) rVar;
                            mayaCashInActivity.n1().t(mayaCashInActivity, str);
                            return;
                        }
                        return;
                    }
                    MayaCashInPartnerFragment mayaCashInPartnerFragment2 = (MayaCashInPartnerFragment) ((K6.i) aVar2.c.get());
                    mayaCashInPartnerFragment2.getClass();
                    L6.r rVar2 = mayaCashInPartnerFragment2.f11707Z;
                    if (rVar2 != null) {
                        MayaCashInActivity mayaCashInActivity2 = (MayaCashInActivity) rVar2;
                        mayaCashInActivity2.n1();
                        B5.i.k(mayaCashInActivity2, str);
                        return;
                    }
                    return;
                }
                return;
            default:
                Bb.f fVarG1 = ((MayaWesternUnionConfirmationFragment) this.f1921b).G1();
                kotlin.jvm.internal.j.d(str);
                String string = ((MayaWesternUnionConfirmationFragment) ((K6.o) fVarG1.c.get())).getString(R.string.pma_link_id_paymaya_terms_and_policy);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                if (str.equals(string)) {
                    L6.G g14 = ((MayaWesternUnionConfirmationFragment) ((K6.o) fVarG1.c.get())).f11774b0;
                    if (g14 != null) {
                        MayaCashInActivity mayaCashInActivity3 = (MayaCashInActivity) g14;
                        mayaCashInActivity3.n1().k0(mayaCashInActivity3, "https://www.paymaya.com/terms-and-condition/?in_app=true");
                        return;
                    }
                    return;
                }
                String string2 = ((MayaWesternUnionConfirmationFragment) ((K6.o) fVarG1.c.get())).getString(R.string.pma_link_id_western_union_terms_and_policy);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                if (str.equals(string2)) {
                    L6.G g15 = ((MayaWesternUnionConfirmationFragment) ((K6.o) fVarG1.c.get())).f11774b0;
                    if (g15 != null) {
                        MayaCashInActivity mayaCashInActivity4 = (MayaCashInActivity) g15;
                        mayaCashInActivity4.n1();
                        B5.i.f(mayaCashInActivity4, "https://www.westernunion.com/PH/en/terms-conditions.html");
                        return;
                    }
                    return;
                }
                String string3 = ((MayaWesternUnionConfirmationFragment) ((K6.o) fVarG1.c.get())).getString(R.string.pma_link_id_privacy_policy);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                if (!str.equals(string3) || (g8 = ((MayaWesternUnionConfirmationFragment) ((K6.o) fVarG1.c.get())).f11774b0) == null) {
                    return;
                }
                MayaCashInActivity mayaCashInActivity5 = (MayaCashInActivity) g8;
                mayaCashInActivity5.n1().k0(mayaCashInActivity5, "https://www.paymaya.com/privacy/?in_app=true");
                return;
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        switch (this.f1920a) {
            case 24:
                MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment = (MayaKycLivenessCaptureFragment) this.f1921b;
                Map permissions = (Map) obj;
                KProperty[] kPropertyArr = MayaKycLivenessCaptureFragment.f12558d0;
                kotlin.jvm.internal.j.g(permissions, "permissions");
                Iterator it = permissions.entrySet().iterator();
                while (it.hasNext()) {
                    boolean zBooleanValue = ((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue();
                    D8.G gL1 = mayaKycLivenessCaptureFragment.L1();
                    if (zBooleanValue) {
                        ((MayaKycLivenessCaptureFragment) ((K8.w) gL1.c.get())).R();
                        ((MayaKycLivenessCaptureFragment) ((K8.w) gL1.c.get())).N1();
                    } else {
                        ((MayaKycLivenessCaptureFragment) ((K8.w) gL1.c.get())).P1();
                    }
                }
                break;
            case 25:
                ((MayaKycMinorTakeAPhotoFragment) this.f1921b).L1().l(((Boolean) obj).booleanValue());
                break;
            case 26:
            default:
                ((MayaKycSimpleCaptureV2Fragment) this.f1921b).N1().k(((Boolean) obj).booleanValue());
                break;
            case 27:
                ((MayaKycSimpleCaptureFragment) this.f1921b).L1().m(((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsets) {
        MayaDashboardActivity mayaDashboardActivity = MayaKycActivity.f12445B;
        kotlin.jvm.internal.j.g(view, "view");
        kotlin.jvm.internal.j.g(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
        kotlin.jvm.internal.j.f(insets, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        TypedValue typedValue = new TypedValue();
        MayaKycActivity mayaKycActivity = (MayaKycActivity) this.f1921b;
        mayaKycActivity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
        int iB = sj.b.b(mayaKycActivity.getResources().getDimension(typedValue.resourceId));
        int i = insets.top;
        layoutParams.height = iB + i;
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) this.f1921b;
        kotlin.jvm.internal.j.g(str, "<unused var>");
        kotlin.jvm.internal.j.g(bundle, "bundle");
        Ab.b bVarP1 = mayaSendMoneyFragment.P1();
        ContactModel contactModel = (ContactModel) bundle.getParcelable("key_selected_contact_model");
        Bb.n nVar = (Bb.n) bVarP1;
        if (contactModel != null) {
            MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
            mayaSendMoneyFragment2.getClass();
            mayaSendMoneyFragment2.f13800b1 = "";
            MayaSendMoneyFragment mayaSendMoneyFragment3 = (MayaSendMoneyFragment) ((Fb.c) nVar.c.get());
            mayaSendMoneyFragment3.getClass();
            mayaSendMoneyFragment3.f13801c1 = "";
            ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).a2(contactModel.getName(), contactModel.getNumber());
            Fb.c cVar = (Fb.c) nVar.c.get();
            String name = contactModel.getName();
            MayaSendMoneyFragment mayaSendMoneyFragment4 = (MayaSendMoneyFragment) cVar;
            mayaSendMoneyFragment4.getClass();
            kotlin.jvm.internal.j.g(name, "<set-?>");
            mayaSendMoneyFragment4.f13800b1 = name;
            Fb.c cVar2 = (Fb.c) nVar.c.get();
            String number = contactModel.getNumber();
            MayaSendMoneyFragment mayaSendMoneyFragment5 = (MayaSendMoneyFragment) cVar2;
            mayaSendMoneyFragment5.getClass();
            kotlin.jvm.internal.j.g(number, "<set-?>");
            mayaSendMoneyFragment5.f13801c1 = number;
        }
        nVar.A();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    public void onMethodCall(pg.r call, pg.t result) {
        String strB;
        String strB2;
        String str = "access_token";
        int i = 3;
        int i4 = 0;
        int i6 = 1;
        switch (this.f1920a) {
            case 0:
                C0260c c0260c = MayaUpdateNameFlutterScreen.i;
                kotlin.jvm.internal.j.g(call, "call");
                kotlin.jvm.internal.j.g(result, "result");
                String str2 = call.f19112a;
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    MayaUpdateNameFlutterScreen mayaUpdateNameFlutterScreen = (MayaUpdateNameFlutterScreen) this.f1921b;
                    switch (iHashCode) {
                        case -1682957889:
                            if (!str2.equals("getAccessToken")) {
                                return;
                            } else {
                                strB = mayaUpdateNameFlutterScreen.g1().b();
                            }
                            break;
                        case -1594702419:
                            if (str2.equals("onSuccessfulUpdateName")) {
                                F0 f02 = mayaUpdateNameFlutterScreen.f;
                                if (f02 == null) {
                                    kotlin.jvm.internal.j.n("restrictionStore");
                                    throw null;
                                }
                                T tA = f02.a();
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                Lh.h hVarH = tA.a(300L).h(Th.e.c);
                                Ah.o oVarA = zh.b.a();
                                Bb.c cVar = new Bb.c(3, call, mayaUpdateNameFlutterScreen, result);
                                Gh.d dVar = new Gh.d(1, new G6.v(mayaUpdateNameFlutterScreen, i6), new C2361c(mayaUpdateNameFlutterScreen, 28));
                                try {
                                    try {
                                        hVarH.f(new Lh.g(new Hh.d(dVar, cVar, 1), oVarA));
                                        mayaUpdateNameFlutterScreen.h.a(dVar);
                                        return;
                                    } catch (NullPointerException e) {
                                        throw e;
                                    } catch (Throwable th2) {
                                        AbstractC0983W.G(th2);
                                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                                        nullPointerException.initCause(th2);
                                        throw nullPointerException;
                                    }
                                } catch (NullPointerException e7) {
                                    throw e7;
                                } catch (Throwable th3) {
                                    throw AbstractC1213b.L(th3, "subscribeActual failed", th3);
                                }
                            }
                            return;
                        case -462765410:
                            if (str2.equals("getProfileName")) {
                                result.success(L.c(new Pair("profile_name", M.h(new Pair("first_name", mayaUpdateNameFlutterScreen.h1().a().mFirstName()), new Pair("middle_name", mayaUpdateNameFlutterScreen.h1().a().mMiddleName()), new Pair("last_name", mayaUpdateNameFlutterScreen.h1().a().mLastName())))));
                                return;
                            }
                            return;
                        case -67833007:
                            if (!str2.equals("getPinningFingerprint")) {
                                return;
                            }
                            strB = mayaUpdateNameFlutterScreen.g1().t();
                            str = "pinning_fingerprint";
                            break;
                        case 200708888:
                            if (str2.equals("logAnalyticsEvent")) {
                                try {
                                    com.google.gson.q qVarG = T2.x(call.f19113b.toString()).g();
                                    String strJ = qVarG.m("event_name").j();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    com.google.gson.o oVarM = qVarG.m("attributes");
                                    if (oVarM != null && !(oVarM instanceof com.google.gson.p)) {
                                        Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                                        while (((com.google.gson.internal.h) it).hasNext()) {
                                            com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                            linkedHashMap.put(jVarB.getKey(), ((com.google.gson.o) jVarB.getValue()).j());
                                        }
                                    }
                                    linkedHashMap.toString();
                                    yk.a.a();
                                    C1220i c1220i = mayaUpdateNameFlutterScreen.e;
                                    if (c1220i == null) {
                                        kotlin.jvm.internal.j.n("analyticsUtils");
                                        throw null;
                                    }
                                    C1219h c1219hE = C1219h.e(strJ);
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        c1219hE.h((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    Unit unit = Unit.f18162a;
                                    c1220i.c(mayaUpdateNameFlutterScreen, c1219hE);
                                    result.success(Boolean.TRUE);
                                    return;
                                } catch (Exception e10) {
                                    yk.a.d();
                                    e10.printStackTrace();
                                    result.error(String.valueOf(e10.getMessage()), e10.getMessage(), e10);
                                    return;
                                }
                            }
                            return;
                        case 929957753:
                            if (str2.equals("getSessionToken")) {
                                AbstractC1331a.t("session_token", mayaUpdateNameFlutterScreen.g1().s(), result);
                                return;
                            }
                            return;
                        case 1243551146:
                            if (str2.equals("onSessionTimeout")) {
                                B5.i iVar = mayaUpdateNameFlutterScreen.c;
                                if (iVar != null) {
                                    iVar.a();
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n("flowController");
                                    throw null;
                                }
                            }
                            return;
                        case 1671672458:
                            if (str2.equals("dismiss")) {
                                FlutterEngineCache.getInstance().remove("updateName");
                                mayaUpdateNameFlutterScreen.finishActivity(70);
                                mayaUpdateNameFlutterScreen.finish();
                                result.success(Boolean.TRUE);
                                return;
                            }
                            return;
                        case 1831962778:
                            if (str2.equals("getAnalyticsData")) {
                                String str3 = MayaUpdateNameFlutterScreen.j;
                                if (str3 == null) {
                                    kotlin.jvm.internal.j.n("sourcePage");
                                    throw null;
                                }
                                Pair pair = new Pair("source_page", str3);
                                String str4 = MayaUpdateNameFlutterScreen.f12208k;
                                if (str4 != null) {
                                    result.success(M.h(pair, new Pair(Constants.REASON, str4)));
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n(Constants.REASON);
                                    throw null;
                                }
                            }
                            return;
                        case 2056684978:
                            if (str2.equals("resetUserRestriction")) {
                                result.success(Boolean.TRUE);
                                if (mayaUpdateNameFlutterScreen.c != null) {
                                    B5.i.j(mayaUpdateNameFlutterScreen);
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n("flowController");
                                    throw null;
                                }
                            }
                            return;
                        default:
                            return;
                    }
                    AbstractC1331a.t(str, strB, result);
                    return;
                }
                return;
            case 2:
                H h = (H) this.f1921b;
                h.getClass();
                String str5 = call.f19112a;
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case -1797550234:
                            if (str5.equals("updateBlacklistStatus")) {
                                InterfaceC2555b interfaceC2555b = h.f1829d;
                                Object obj = call.f19113b;
                                kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                                A7.A a8 = (A7.A) interfaceC2555b;
                                a8.h.f11330b.edit().putBoolean("key_is_xp_blacklisted", ((Boolean) obj).booleanValue()).apply();
                                a8.r();
                                result.success(Boolean.TRUE);
                                return;
                            }
                            break;
                        case -1682957889:
                            if (str5.equals("getAccessToken")) {
                                A7.A a10 = (A7.A) h.f1829d;
                                kotlin.jvm.internal.j.g(result, "result");
                                strB2 = a10.h.b();
                                AbstractC1331a.t(str, strB2, result);
                                return;
                            }
                            break;
                        case -1371499115:
                            if (str5.equals("getMayaXpToggles")) {
                                A7.A a11 = (A7.A) h.f1829d;
                                kotlin.jvm.internal.j.g(result, "channelResult");
                                A5.b bVar = A5.b.f89Y0;
                                S5.c cVar2 = a11.f188o;
                                result.success(M.h(new Pair("maya_xp", Boolean.valueOf(S5.c.b(cVar2, bVar))), new Pair("maya_xp_benefits", Boolean.valueOf(S5.c.b(cVar2, A5.b.f91Z0))), new Pair("maya_xp_focus", Boolean.valueOf(S5.c.b(cVar2, A5.b.f95b1))), new Pair("maya_xp_earn", Boolean.valueOf(S5.c.b(cVar2, A5.b.f93a1)))));
                                return;
                            }
                            break;
                        case 200708888:
                            if (str5.equals("logAnalyticsEvent")) {
                                InterfaceC2555b interfaceC2555b2 = h.f1829d;
                                String eventArgumentsString = call.f19113b.toString();
                                A7.A a12 = (A7.A) interfaceC2555b2;
                                kotlin.jvm.internal.j.g(eventArgumentsString, "eventArgumentsString");
                                try {
                                    com.google.gson.q qVarG2 = T2.x(eventArgumentsString).g();
                                    String strJ2 = qVarG2.m("event_name").j();
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    com.google.gson.o oVarM2 = qVarG2.m("attributes");
                                    if (oVarM2 != null && !(oVarM2 instanceof com.google.gson.p)) {
                                        Iterator it2 = ((com.google.gson.internal.i) oVarM2.g().f10034a.entrySet()).iterator();
                                        while (((com.google.gson.internal.h) it2).hasNext()) {
                                            com.google.gson.internal.j jVarB2 = ((com.google.gson.internal.h) it2).b();
                                            linkedHashMap2.put(jVarB2.getKey(), ((com.google.gson.o) jVarB2.getValue()).j());
                                        }
                                    }
                                    linkedHashMap2.toString();
                                    yk.a.a();
                                    F7.s sVar = (F7.s) a12.c.get();
                                    kotlin.jvm.internal.j.d(strJ2);
                                    ((MayaWalletFragment) sVar).X1(strJ2, linkedHashMap2);
                                    break;
                                } catch (Exception unused) {
                                    ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
                                    yk.a.d();
                                }
                                result.success("");
                                return;
                            }
                            break;
                        case 447853137:
                            if (str5.equals("getKycStatus")) {
                                strB2 = ((A7.A) h.f1829d).h.l();
                                str = "kyc_status";
                                AbstractC1331a.t(str, strB2, result);
                                return;
                            }
                            break;
                        case 486422889:
                            if (str5.equals("updatePointsDifference")) {
                                InterfaceC2555b interfaceC2555b3 = h.f1829d;
                                Object obj2 = call.f19113b;
                                kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                                ((A7.A) interfaceC2555b3).h.f11330b.edit().putInt("key_xp_points_difference", ((Integer) obj2).intValue()).apply();
                                result.success(Boolean.TRUE);
                                return;
                            }
                            break;
                        case 929957753:
                            if (str5.equals("getSessionToken")) {
                                A7.A a13 = (A7.A) h.f1829d;
                                kotlin.jvm.internal.j.g(result, "result");
                                AbstractC1331a.t("session_token", a13.h.s(), result);
                                return;
                            }
                            break;
                        case 1203902891:
                            if (str5.equals("showUpgradeScreen")) {
                                G g8 = h.e;
                                if (g8 != null) {
                                    ((MayaDashboardActivity) g8).t2(EnumC1215d.MAYA_XP, EnumC1216e.MAYA_XP);
                                    return;
                                }
                                return;
                            }
                            break;
                        case 1374266282:
                            if (str5.equals("requestFullscreen")) {
                                String strValueOf = String.valueOf(call.a("route"));
                                String strValueOf2 = String.valueOf(call.a("source"));
                                G g10 = h.e;
                                if (g10 != null) {
                                    ((MayaDashboardActivity) g10).p2(strValueOf2, strValueOf);
                                }
                                result.success(Boolean.TRUE);
                                return;
                            }
                            break;
                        case 1925869179:
                            if (str5.equals("resizePartialFlutterScreen")) {
                                InterfaceC2555b interfaceC2555b4 = h.f1829d;
                                Object obj3 = call.f19113b;
                                kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                                int iIntValue = ((Integer) obj3).intValue();
                                A7.A a14 = (A7.A) interfaceC2555b4;
                                if (iIntValue == 0 || a14.h.L()) {
                                    FrameLayout frameLayout = ((MayaWalletFragment) ((F7.s) a14.c.get())).f12227Q0;
                                    if (frameLayout == null) {
                                        kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                                        throw null;
                                    }
                                    frameLayout.setVisibility(8);
                                } else {
                                    MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) a14.c.get());
                                    FrameLayout frameLayout2 = mayaWalletFragment.f12227Q0;
                                    if (frameLayout2 == null) {
                                        kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                                        throw null;
                                    }
                                    frameLayout2.getLayoutParams().height = v0.o(iIntValue);
                                    FrameLayout frameLayout3 = mayaWalletFragment.f12227Q0;
                                    if (frameLayout3 == null) {
                                        kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                                        throw null;
                                    }
                                    frameLayout3.requestLayout();
                                    FrameLayout frameLayout4 = ((MayaWalletFragment) ((F7.s) a14.c.get())).f12227Q0;
                                    if (frameLayout4 == null) {
                                        kotlin.jvm.internal.j.n("mXPWalletFlutterWidgetContainer");
                                        throw null;
                                    }
                                    frameLayout4.setVisibility(0);
                                }
                                result.success(Boolean.TRUE);
                                return;
                            }
                            break;
                    }
                }
                result.notImplemented();
                return;
            case 6:
                int i10 = MayaCardPullV2Activity.f11606p;
                kotlin.jvm.internal.j.g(call, "methodCall");
                kotlin.jvm.internal.j.g(result, "result");
                MayaCardPullV2Activity mayaCardPullV2Activity = (MayaCardPullV2Activity) this.f1921b;
                mayaCardPullV2Activity.getClass();
                new Handler(Looper.getMainLooper()).post(new I6.a(i4, call, mayaCardPullV2Activity, result));
                return;
            case 7:
                int i11 = MayaCashInActivity.f11609r;
                new Handler(Looper.getMainLooper()).post(new I6.a(i6, call, (MayaCashInActivity) this.f1921b, result));
                return;
            default:
                int i12 = MayaQRActivity.f13569r;
                MayaQRActivity mayaQRActivity = (MayaQRActivity) this.f1921b;
                mayaQRActivity.getClass();
                new Handler(Looper.getMainLooper()).post(new I6.a(i, call, mayaQRActivity, result));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f1920a) {
            case 4:
                ((Ag.d) this.f1921b).invoke(obj);
                break;
            default:
                ((N9.f) this.f1921b).invoke(obj);
                break;
        }
    }

    @Override // Ch.a
    public void run() {
        MayaLoadingDialogFragment mayaLoadingDialogFragment;
        switch (this.f1920a) {
            case 9:
                ConstraintLayout constraintLayout = ((MayaXpEntryFragment) ((Lc.a) ((Bb.f) this.f1921b).c.get())).f14337b0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLoadingView");
                    throw null;
                }
            case 10:
            case 11:
            case 12:
            case 13:
            case 20:
            default:
                MayaKycPersonalInfoConfirmSubmissionFragment mayaKycPersonalInfoConfirmSubmissionFragment = (MayaKycPersonalInfoConfirmSubmissionFragment) this.f1921b;
                if (((E1) mayaKycPersonalInfoConfirmSubmissionFragment.f12575Z.getValue()).a()) {
                    Xh.i.H(mayaKycPersonalInfoConfirmSubmissionFragment, Boolean.TRUE, "confirmation_result_boolean");
                } else {
                    Xh.i.H(mayaKycPersonalInfoConfirmSubmissionFragment, PersonalInfoConfirmAction.Submit.INSTANCE, "confirmation_result_parcelable");
                }
                mayaKycPersonalInfoConfirmSubmissionFragment.K1(true);
                return;
            case 14:
                ((MayaBaseFragment) ((P9.b) ((C0325c) this.f1921b).c.get())).w1();
                return;
            case 15:
                ((MayaBaseFragment) ((P9.d) ((L9.l) this.f1921b).c.get())).w1();
                return;
            case 16:
                ((MayaBaseFragment) ((P9.h) ((L9.q) this.f1921b).c.get())).w1();
                return;
            case 17:
                ((NewMayaCreditEnhancedActivationFragment) ((P9.j) ((L9.s) this.f1921b).c.get())).s1().g();
                return;
            case 18:
                L9.B b8 = (L9.B) this.f1921b;
                ((NewMayaCreditFragment) ((P9.k) b8.c.get())).W1();
                ((NewMayaCreditFragment) ((P9.k) b8.c.get())).s1().g();
                b8.j = false;
                return;
            case 19:
                ((NewMayaCreditSummaryFragment) ((P9.n) ((G6.k) this.f1921b).c.get())).s1().g();
                return;
            case 21:
                A7.j jVar = (A7.j) this.f1921b;
                ((MayaBaseFragment) ((Rb.b) jVar.c.get())).w1();
                BackUpIdentity backUpIdentityA = ((C1265j) jVar.f).a();
                Rb.b bVar = (Rb.b) jVar.c.get();
                String strMValue = backUpIdentityA.mValue();
                Sb.g gVar = ((MayaAccountRecoveryFragment) bVar).f13923c0;
                if (gVar != null) {
                    ((MayaSettingsActivity) gVar).f2(strMValue, false);
                    return;
                }
                return;
            case 22:
                A7.j jVar2 = (A7.j) this.f1921b;
                Qb.e eVar = ((MayaDisplayNamePasswordBottomSheetDialogFragment) ((Pb.a) jVar2.c.get())).f13859Y;
                if (eVar != null && (mayaLoadingDialogFragment = ((MayaSettingsActivity) eVar).f13842p) != null) {
                    mayaLoadingDialogFragment.dismissAllowingStateLoss();
                }
                MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment = (MayaDisplayNamePasswordBottomSheetDialogFragment) ((Pb.a) jVar2.c.get());
                C1220i c1220iN1 = mayaDisplayNamePasswordBottomSheetDialogFragment.n1();
                FragmentActivity activity = mayaDisplayNamePasswordBottomSheetDialogFragment.getActivity();
                C1219h c1219hD = C1219h.d(mayaDisplayNamePasswordBottomSheetDialogFragment.f13862b0);
                c1219hD.n(14);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                Bundle arguments = mayaDisplayNamePasswordBottomSheetDialogFragment.getArguments();
                c1219hD.j.put("setting", arguments != null ? arguments.getBoolean("is_enabled") : false ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f16147l : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.m);
                c1220iN1.c(activity, c1219hD);
                Qb.e eVar2 = mayaDisplayNamePasswordBottomSheetDialogFragment.f13859Y;
                if (eVar2 != null) {
                    Bundle bundleE = androidx.media3.datasource.cache.c.e("title", mayaDisplayNamePasswordBottomSheetDialogFragment.getString(R.string.maya_label_show_my_name_password_success_title), "content", mayaDisplayNamePasswordBottomSheetDialogFragment.getString(R.string.maya_label_show_my_name_password_success_message));
                    MayaSuccessDialogFragment mayaSuccessDialogFragment = new MayaSuccessDialogFragment();
                    mayaSuccessDialogFragment.setArguments(bundleE);
                    mayaSuccessDialogFragment.show(((MayaSettingsActivity) eVar2).getSupportFragmentManager(), "success_dialog");
                }
                mayaDisplayNamePasswordBottomSheetDialogFragment.dismiss();
                return;
            case 23:
                M7.c cVar = (M7.c) this.f1921b;
                MayaLoadingDialogFragment mayaLoadingDialogFragment2 = ((MayaBaseDialogFragment) ((P7.a) cVar.c.get())).f10331K;
                if (mayaLoadingDialogFragment2 != null) {
                    mayaLoadingDialogFragment2.dismiss();
                }
                ((MayaDataPrivacyDialogFragment) ((P7.a) cVar.c.get())).dismiss();
                return;
        }
    }
}
