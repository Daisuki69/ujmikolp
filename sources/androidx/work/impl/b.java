package androidx.work.impl;

import D8.C0214w;
import Kh.T;
import L9.C0323a;
import M8.A0;
import M8.T2;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import cj.L;
import cj.M;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.V;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.Identity;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1249b;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.K;
import com.paymaya.mayaui.autodebitarrangement.view.activity.impl.MayaAutoDebitArrangementActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.cryptocurrency.view.activity.impl.CryptocurrencyV2Activity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.purchasefinancing.view.activity.impl.MayaPurchaseFinancingActivity;
import com.paymaya.mayaui.score.view.activity.impl.MayaScoreActivity;
import d4.AbstractC1331a;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k6.InterfaceC1767a;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import l9.C1806d;
import l9.C1807e;
import l9.C1808f;
import l9.C1809g;
import l9.C1816n;
import l9.C1817o;
import l9.C1818p;
import l9.C1819q;
import m9.InterfaceC1857b;
import m9.InterfaceC1858c;
import n9.C1940c;
import n9.C1941d;
import o1.AbstractC1955a;
import pg.C2038a;
import pg.r;
import pg.t;
import pg.u;
import ta.InterfaceC2279a;
import w7.C2386a;
import w7.C2387b;
import wb.InterfaceC2389a;
import x7.InterfaceC2468a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8231b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8232d;

    public /* synthetic */ b(int i, Object obj, Object obj2, Object obj3) {
        this.f8230a = i;
        this.f8231b = obj;
        this.c = obj2;
        this.f8232d = obj3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void a() {
        r rVar = (r) this.f8231b;
        MayaAutoDebitArrangementActivity mayaAutoDebitArrangementActivity = (MayaAutoDebitArrangementActivity) this.c;
        t tVar = (t) this.f8232d;
        int i = MayaAutoDebitArrangementActivity.f11527p;
        String str = rVar.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1793560251:
                    if (str.equals("getKycLevel")) {
                        AbstractC1331a.t("kyc_level", mayaAutoDebitArrangementActivity.V1().e.k(), tVar);
                        return;
                    }
                    break;
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        AbstractC1331a.t("access_token", mayaAutoDebitArrangementActivity.V1().e.b(), tVar);
                        return;
                    }
                    break;
                case -1249356004:
                    if (str.equals("getMin")) {
                        AbstractC1331a.t("min", mayaAutoDebitArrangementActivity.V1().e.r(), tVar);
                        return;
                    }
                    break;
                case -1179101518:
                    if (str.equals("getShieldSessionId")) {
                        mayaAutoDebitArrangementActivity.V1();
                        AbstractC1331a.t("shield_session_id", i0.b(), tVar);
                        return;
                    }
                    break;
                case -670914607:
                    if (str.equals("getAvailability")) {
                        Map<String, Boolean> flutterAvailability = mayaAutoDebitArrangementActivity.V1().e.e().getFlutterAvailability();
                        j.f(flutterAvailability, "getFlutterAvailability(...)");
                        tVar.success(flutterAvailability);
                        return;
                    }
                    break;
                case -599445191:
                    if (str.equals("complete")) {
                        mayaAutoDebitArrangementActivity.getClass();
                        FlutterEngineCache.getInstance().remove("autoDebitArrangementFullscreen");
                        mayaAutoDebitArrangementActivity.n1();
                        B5.i.i(mayaAutoDebitArrangementActivity);
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        Bb.a aVarV1 = mayaAutoDebitArrangementActivity.V1();
                        String eventArgumentsString = rVar.f19113b.toString();
                        j.g(eventArgumentsString, "eventArgumentsString");
                        try {
                            q qVarG = T2.x(eventArgumentsString).g();
                            String strJ = qVarG.m("event_name").j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o oVarM = qVarG.m("attributes");
                            if (oVarM != null && !(oVarM instanceof p)) {
                                Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                                while (((com.google.gson.internal.h) it).hasNext()) {
                                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                }
                            }
                            linkedHashMap.toString();
                            yk.a.a();
                            InterfaceC1767a interfaceC1767a = (InterfaceC1767a) aVarV1.c.get();
                            j.d(strJ);
                            ((MayaAutoDebitArrangementActivity) interfaceC1767a).X1(strJ, linkedHashMap);
                            break;
                        } catch (Exception unused) {
                            ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
                            yk.a.d();
                        }
                        tVar.success("");
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        AbstractC1331a.t("session_token", mayaAutoDebitArrangementActivity.V1().e.s(), tVar);
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        mayaAutoDebitArrangementActivity.n1().a();
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        yk.a.a();
                        mayaAutoDebitArrangementActivity.getClass();
                        FlutterEngineCache.getInstance().remove("autoDebitArrangementFullscreen");
                        mayaAutoDebitArrangementActivity.W1();
                        return;
                    }
                    break;
            }
        }
        tVar.notImplemented();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void b() {
        int i = 0;
        int i4 = 2;
        int i6 = 1;
        r rVar = (r) this.f8231b;
        MayaMerchantActivity mayaMerchantActivity = (MayaMerchantActivity) this.c;
        t channelResult = (t) this.f8232d;
        int i10 = MayaMerchantActivity.f12845s;
        String str = rVar.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        Bb.a aVarV1 = mayaMerchantActivity.V1();
                        j.g(channelResult, "channelResult");
                        AbstractC1331a.t("access_token", aVarV1.e.b(), channelResult);
                        return;
                    }
                    break;
                case -1249356004:
                    if (str.equals("getMin")) {
                        Bb.a aVarV12 = mayaMerchantActivity.V1();
                        if (channelResult != null) {
                            AbstractC1331a.t("min", aVarV12.e.r(), channelResult);
                            return;
                        }
                        return;
                    }
                    break;
                case -1179101518:
                    if (str.equals("getShieldSessionId")) {
                        mayaMerchantActivity.V1();
                        j.g(channelResult, "channelResult");
                        AbstractC1331a.t("shield_session_id", i0.b(), channelResult);
                        return;
                    }
                    break;
                case -599445191:
                    if (str.equals("complete")) {
                        mayaMerchantActivity.getClass();
                        FlutterEngineCache.getInstance().remove("checkoutFullscreen");
                        mayaMerchantActivity.W1();
                        Fragment fragmentFindFragmentByTag = mayaMerchantActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaMerchantActivity, MayaMerchantPaymentFragment.class));
                        MayaMerchantPaymentFragment mayaMerchantPaymentFragment = fragmentFindFragmentByTag instanceof MayaMerchantPaymentFragment ? (MayaMerchantPaymentFragment) fragmentFindFragmentByTag : null;
                        if (mayaMerchantPaymentFragment != null) {
                            String str2 = mayaMerchantActivity.f12850r;
                            if (str2 == null) {
                                j.n("currentMerchantPaymentId");
                                throw null;
                            }
                            C1809g c1809g = (C1809g) mayaMerchantPaymentFragment.Q1();
                            ((MayaBaseFragment) ((o9.d) c1809g.c.get())).E1();
                            Ah.p<MerchantPaymentV2> merchantPayment = c1809g.e.c.getMerchantPayment(str2);
                            c1809g.e(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(merchantPayment, merchantPayment, zh.b.a()), new C1807e(c1809g, i6), i4), new C1808f(c1809g, i6), i), new C1806d(c1809g, i4)).e());
                            return;
                        }
                        return;
                    }
                    break;
                case -67833007:
                    if (str.equals("getPinningFingerprint")) {
                        mayaMerchantActivity.V1();
                        j.g(channelResult, "channelResult");
                        channelResult.success("");
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        Bb.a aVarV13 = mayaMerchantActivity.V1();
                        try {
                            q qVarG = T2.x(rVar.f19113b.toString()).g();
                            String strJ = qVarG.m("event_name").j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o oVarM = qVarG.m("attributes");
                            if (oVarM != null && !(oVarM instanceof p)) {
                                Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                                while (((com.google.gson.internal.h) it).hasNext()) {
                                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                }
                            }
                            linkedHashMap.toString();
                            yk.a.a();
                            InterfaceC1857b interfaceC1857b = (InterfaceC1857b) aVarV13.c.get();
                            j.d(strJ);
                            ((MayaMerchantActivity) interfaceC1857b).X1(strJ, linkedHashMap);
                            break;
                        } catch (Exception e) {
                            yk.a.d();
                            e.printStackTrace();
                        }
                        channelResult.success("");
                        return;
                    }
                    break;
                case 447853137:
                    if (str.equals("getKycStatus")) {
                        Bb.a aVarV14 = mayaMerchantActivity.V1();
                        if (channelResult != null) {
                            AbstractC1331a.t("kyc_status", aVarV14.e.l(), channelResult);
                            return;
                        }
                        return;
                    }
                    break;
                case 827711050:
                    if (str.equals("getToggle")) {
                        Map<String, Boolean> flutterToggles = mayaMerchantActivity.V1().e.e().getFlutterToggles();
                        j.f(flutterToggles, "getFlutterToggles(...)");
                        channelResult.success(flutterToggles);
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        Bb.a aVarV15 = mayaMerchantActivity.V1();
                        j.g(channelResult, "channelResult");
                        AbstractC1331a.t("session_token", aVarV15.e.s(), channelResult);
                        return;
                    }
                    break;
                case 1203902891:
                    if (str.equals("showUpgradeScreen")) {
                        EnumC1215d enumC1215d = EnumC1215d.P2M;
                        EnumC1216e enumC1216e = EnumC1216e.DASHBOARD;
                        mayaMerchantActivity.getClass();
                        String string = mayaMerchantActivity.getString(R.string.maya_label_upgrade_dialog_title);
                        j.f(string, "getString(...)");
                        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string, mayaMerchantActivity.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaMerchantActivity.getString(R.string.maya_label_upgrade_now), new C1940c(mayaMerchantActivity, i6)), new Pair(mayaMerchantActivity.getString(R.string.maya_label_maybe_later), null), null, 96);
                        mayaAlertBottomSheetDialogFragmentN.s1(enumC1215d);
                        mayaAlertBottomSheetDialogFragmentN.f11820c0 = enumC1216e;
                        FragmentTransaction fragmentTransactionBeginTransaction = mayaMerchantActivity.getSupportFragmentManager().beginTransaction();
                        j.f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                        fragmentTransactionBeginTransaction.add(mayaAlertBottomSheetDialogFragmentN, "alert_dialog");
                        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        mayaMerchantActivity.n1().a();
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        mayaMerchantActivity.getClass();
                        FlutterEngineCache.getInstance().remove("checkoutFullscreen");
                        mayaMerchantActivity.W1();
                        return;
                    }
                    break;
            }
        }
        channelResult.notImplemented();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void c() {
        int i = 0;
        int i4 = 1;
        int i6 = 2;
        r rVar = (r) this.f8231b;
        MayaQRPHMerchantActivity mayaQRPHMerchantActivity = (MayaQRPHMerchantActivity) this.c;
        t channelResult = (t) this.f8232d;
        int i10 = MayaQRPHMerchantActivity.f12851t;
        String str = rVar.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        Bb.a aVarX1 = mayaQRPHMerchantActivity.X1();
                        j.g(channelResult, "channelResult");
                        AbstractC1331a.t("access_token", aVarX1.e.b(), channelResult);
                        return;
                    }
                    break;
                case -1249356004:
                    if (str.equals("getMin")) {
                        Bb.a aVarX12 = mayaQRPHMerchantActivity.X1();
                        if (channelResult != null) {
                            AbstractC1331a.t("min", aVarX12.e.r(), channelResult);
                            return;
                        }
                        return;
                    }
                    break;
                case -1179101518:
                    if (str.equals("getShieldSessionId")) {
                        mayaQRPHMerchantActivity.X1();
                        j.g(channelResult, "channelResult");
                        AbstractC1331a.t("shield_session_id", i0.b(), channelResult);
                        return;
                    }
                    break;
                case -655714860:
                    if (str.equals("startPurchaseFinancing")) {
                        Object obj = rVar.f19113b;
                        Map map = obj instanceof Map ? (Map) obj : null;
                        Object obj2 = map != null ? map.get("subroute") : null;
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        FlutterEngineCache.getInstance().remove("purchaseFinancingActivity");
                        mayaQRPHMerchantActivity.n1();
                        B5.i.O(mayaQRPHMerchantActivity, str2);
                        return;
                    }
                    break;
                case -599445191:
                    if (str.equals("complete")) {
                        mayaQRPHMerchantActivity.getClass();
                        FlutterEngineCache.getInstance().remove("checkoutFullscreen");
                        mayaQRPHMerchantActivity.Y1();
                        Boolean bool = (Boolean) rVar.a("showReceipt");
                        Bb.a aVarX13 = mayaQRPHMerchantActivity.X1();
                        if (bool == null || !bool.booleanValue()) {
                            MayaQRPHMerchantActivity mayaQRPHMerchantActivity2 = (MayaQRPHMerchantActivity) ((InterfaceC1858c) aVarX13.c.get());
                            mayaQRPHMerchantActivity2.n1();
                            B5.i.i(mayaQRPHMerchantActivity2);
                            return;
                        }
                        MayaQRPHMerchantActivity mayaQRPHMerchantActivity3 = (MayaQRPHMerchantActivity) ((InterfaceC1858c) aVarX13.c.get());
                        Fragment fragmentFindFragmentByTag = mayaQRPHMerchantActivity3.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaQRPHMerchantActivity3, MayaQRPHMerchantPaymentFragment.class));
                        MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = fragmentFindFragmentByTag instanceof MayaQRPHMerchantPaymentFragment ? (MayaQRPHMerchantPaymentFragment) fragmentFindFragmentByTag : null;
                        if (mayaQRPHMerchantPaymentFragment != null) {
                            String str3 = mayaQRPHMerchantActivity3.f12857s;
                            if (str3 == null) {
                                j.n("currentMerchantPaymentId");
                                throw null;
                            }
                            C1819q c1819q = (C1819q) mayaQRPHMerchantPaymentFragment.Q1();
                            ((MayaBaseFragment) ((o9.j) c1819q.c.get())).E1();
                            Ah.p<MerchantPaymentV2> merchantPayment = c1819q.e.c.getMerchantPayment(str3);
                            c1819q.e(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(merchantPayment, merchantPayment, zh.b.a()), new C1817o(c1819q, i4), i6), new C1818p(c1819q, i4), i), new C1816n(c1819q, i6)).e());
                            return;
                        }
                        return;
                    }
                    break;
                case -67833007:
                    if (str.equals("getPinningFingerprint")) {
                        mayaQRPHMerchantActivity.X1();
                        j.g(channelResult, "channelResult");
                        channelResult.success("");
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        Bb.a aVarX14 = mayaQRPHMerchantActivity.X1();
                        try {
                            q qVarG = T2.x(rVar.f19113b.toString()).g();
                            String strJ = qVarG.m("event_name").j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o oVarM = qVarG.m("attributes");
                            if (oVarM != null && !(oVarM instanceof p)) {
                                Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                                while (((com.google.gson.internal.h) it).hasNext()) {
                                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                }
                            }
                            linkedHashMap.toString();
                            yk.a.a();
                            InterfaceC1858c interfaceC1858c = (InterfaceC1858c) aVarX14.c.get();
                            j.d(strJ);
                            ((MayaQRPHMerchantActivity) interfaceC1858c).Z1(strJ, linkedHashMap);
                            break;
                        } catch (Exception e) {
                            yk.a.d();
                            e.printStackTrace();
                        }
                        channelResult.success("");
                        return;
                    }
                    break;
                case 447853137:
                    if (str.equals("getKycStatus")) {
                        Bb.a aVarX15 = mayaQRPHMerchantActivity.X1();
                        if (channelResult != null) {
                            AbstractC1331a.t("kyc_status", aVarX15.e.l(), channelResult);
                            return;
                        }
                        return;
                    }
                    break;
                case 827711050:
                    if (str.equals("getToggle")) {
                        Map<String, Boolean> flutterToggles = mayaQRPHMerchantActivity.X1().e.e().getFlutterToggles();
                        j.f(flutterToggles, "getFlutterToggles(...)");
                        channelResult.success(flutterToggles);
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        Bb.a aVarX16 = mayaQRPHMerchantActivity.X1();
                        j.g(channelResult, "channelResult");
                        AbstractC1331a.t("session_token", aVarX16.e.s(), channelResult);
                        return;
                    }
                    break;
                case 1203902891:
                    if (str.equals("showUpgradeScreen")) {
                        EnumC1215d enumC1215d = EnumC1215d.QRPH;
                        EnumC1216e enumC1216e = EnumC1216e.DASHBOARD;
                        mayaQRPHMerchantActivity.getClass();
                        String string = mayaQRPHMerchantActivity.getString(R.string.maya_label_upgrade_dialog_title);
                        j.f(string, "getString(...)");
                        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string, mayaQRPHMerchantActivity.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaQRPHMerchantActivity.getString(R.string.maya_label_upgrade_now), new C1941d(mayaQRPHMerchantActivity, i6)), new Pair(mayaQRPHMerchantActivity.getString(R.string.maya_label_maybe_later), null), null, 96);
                        mayaAlertBottomSheetDialogFragmentN.s1(enumC1215d);
                        mayaAlertBottomSheetDialogFragmentN.f11820c0 = enumC1216e;
                        FragmentTransaction fragmentTransactionBeginTransaction = mayaQRPHMerchantActivity.getSupportFragmentManager().beginTransaction();
                        j.f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                        fragmentTransactionBeginTransaction.add(mayaAlertBottomSheetDialogFragmentN, "alert_dialog");
                        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        mayaQRPHMerchantActivity.n1().a();
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        mayaQRPHMerchantActivity.getClass();
                        FlutterEngineCache.getInstance().remove("checkoutFullscreen");
                        mayaQRPHMerchantActivity.Y1();
                        return;
                    }
                    break;
            }
        }
        channelResult.notImplemented();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void d() {
        boolean z4 = false;
        r rVar = (r) this.f8231b;
        MayaPurchaseFinancingActivity mayaPurchaseFinancingActivity = (MayaPurchaseFinancingActivity) this.c;
        t tVar = (t) this.f8232d;
        int i = MayaPurchaseFinancingActivity.f13534v;
        String str = rVar.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1986243916:
                    if (str.equals("showContactReferenceScreen")) {
                        mayaPurchaseFinancingActivity.getClass();
                        String strV1 = MayaPurchaseFinancingActivity.V1(rVar.f19113b);
                        mayaPurchaseFinancingActivity.Y1(EnumC1216e.CONTACT_REFERENCE);
                        mayaPurchaseFinancingActivity.n1();
                        B5.i.f0(mayaPurchaseFinancingActivity, "FRAGMENT_CONTACT_REFERENCE", strV1 != null ? strV1 : "");
                        mayaPurchaseFinancingActivity.f13538q = tVar;
                        return;
                    }
                    break;
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        AbstractC1331a.t("access_token", ((com.paymaya.data.preference.a) mayaPurchaseFinancingActivity.W1().e).b(), tVar);
                        return;
                    }
                    break;
                case -1305289599:
                    if (str.equals("extract")) {
                        C0214w c0214wW1 = mayaPurchaseFinancingActivity.W1();
                        if (S5.c.b((S5.c) c0214wW1.f, A5.b.y0)) {
                            ((K) c0214wW1.f1106g).c(((com.paymaya.data.preference.a) c0214wW1.e).C(), "lending", "purchase-financing", new C2038a(10, c0214wW1, M.h(new Pair("triggeredBy", "lending"), new Pair("eventTrigger", "purchase-financing")), z4));
                        }
                        tVar.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1249356004:
                    if (str.equals("getMin")) {
                        AbstractC1331a.t("min", ((com.paymaya.data.preference.a) mayaPurchaseFinancingActivity.W1().e).r(), tVar);
                        return;
                    }
                    break;
                case -1233072280:
                    if (str.equals("requestScanToPurchase")) {
                        Object obj = rVar.f19113b;
                        mayaPurchaseFinancingActivity.getClass();
                        mayaPurchaseFinancingActivity.n1().C(mayaPurchaseFinancingActivity, mayaPurchaseFinancingActivity.f13542u, MayaPurchaseFinancingActivity.V1(obj), Boolean.TRUE, new V[]{V.e, V.f10447d}, Boolean.FALSE, null);
                        return;
                    }
                    break;
                case -1179101518:
                    if (str.equals("getShieldSessionId")) {
                        mayaPurchaseFinancingActivity.W1();
                        AbstractC1331a.t("shield_session_id", i0.b(), tVar);
                        return;
                    }
                    break;
                case -815423637:
                    if (str.equals("requestBillsPay")) {
                        String str2 = (String) rVar.a("route");
                        if (str2 != null) {
                            mayaPurchaseFinancingActivity.getIntent().setData(Uri.parse(str2));
                            mayaPurchaseFinancingActivity.n1();
                            B5.i.e(mayaPurchaseFinancingActivity);
                            return;
                        }
                        return;
                    }
                    break;
                case -773855063:
                    if (str.equals("requestReceipt")) {
                        String str3 = (String) rVar.a("paymentId");
                        if (str3 != null) {
                            mayaPurchaseFinancingActivity.n1();
                            FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
                            j.f(flutterEngineCache, "getInstance(...)");
                            FlutterEngine flutterEngine = flutterEngineCache.get("checkoutFullscreen");
                            if (flutterEngine != null) {
                                AbstractC1955a.f18758b = new u(flutterEngine.getDartExecutor().getBinaryMessenger(), "packages/paymaya_checkout");
                                HashMap mapQ = androidx.media3.datasource.cache.c.q("route", "receiptScreen", "paymentId", str3);
                                u uVar = AbstractC1955a.f18758b;
                                if (uVar != null) {
                                    uVar.a("requestFullscreen", mapQ, null);
                                }
                            }
                            B5.i.g(mayaPurchaseFinancingActivity);
                            return;
                        }
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        C0214w c0214wW12 = mayaPurchaseFinancingActivity.W1();
                        String eventArgumentsString = rVar.f19113b.toString();
                        j.g(eventArgumentsString, "eventArgumentsString");
                        try {
                            q qVarG = T2.x(eventArgumentsString).g();
                            String strJ = qVarG.m("event_name").j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o oVarM = qVarG.m("attributes");
                            if (oVarM != null && !(oVarM instanceof p)) {
                                Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                                while (((com.google.gson.internal.h) it).hasNext()) {
                                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                }
                            }
                            linkedHashMap.toString();
                            yk.a.a();
                            InterfaceC2279a interfaceC2279a = (InterfaceC2279a) c0214wW12.c.get();
                            j.d(strJ);
                            ((MayaPurchaseFinancingActivity) interfaceC2279a).Z1(strJ, linkedHashMap);
                            break;
                        } catch (Exception unused) {
                            ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
                            yk.a.d();
                        }
                        tVar.success("");
                        return;
                    }
                    break;
                case 447853137:
                    if (str.equals("getKycStatus")) {
                        AbstractC1331a.t("kyc_status", ((com.paymaya.data.preference.a) mayaPurchaseFinancingActivity.W1().e).l(), tVar);
                        return;
                    }
                    break;
                case 616915695:
                    if (str.equals("showUpdateProfileScreen")) {
                        mayaPurchaseFinancingActivity.getClass();
                        String strV12 = MayaPurchaseFinancingActivity.V1(rVar.f19113b);
                        mayaPurchaseFinancingActivity.Y1(EnumC1216e.UPDATE_PERSONAL_DETAILS);
                        mayaPurchaseFinancingActivity.n1();
                        B5.i.f0(mayaPurchaseFinancingActivity, "FRAGMENT_PERSONAL_INFO", strV12 != null ? strV12 : "");
                        mayaPurchaseFinancingActivity.f13538q = tVar;
                        return;
                    }
                    break;
                case 827711050:
                    if (str.equals("getToggle")) {
                        tVar.success(L.c(new Pair("purchase_financing", Boolean.valueOf(S5.c.b((S5.c) mayaPurchaseFinancingActivity.W1().f, A5.b.f115k1)))));
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        AbstractC1331a.t("session_token", ((com.paymaya.data.preference.a) mayaPurchaseFinancingActivity.W1().e).s(), tVar);
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        mayaPurchaseFinancingActivity.n1().a();
                        return;
                    }
                    break;
                case 1470672960:
                    if (str.equals("showWorkDetailsScreen")) {
                        mayaPurchaseFinancingActivity.getClass();
                        String strV13 = MayaPurchaseFinancingActivity.V1(rVar.f19113b);
                        mayaPurchaseFinancingActivity.Y1(EnumC1216e.WORK_DETAILS);
                        mayaPurchaseFinancingActivity.n1();
                        B5.i.f0(mayaPurchaseFinancingActivity, "FRAGMENT_WORK_DETAILS", strV13 != null ? strV13 : "");
                        mayaPurchaseFinancingActivity.f13538q = tVar;
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        yk.a.a();
                        tVar.success("");
                        mayaPurchaseFinancingActivity.getClass();
                        FlutterEngineCache.getInstance().remove("purchaseFinancingActivity");
                        mayaPurchaseFinancingActivity.X1();
                        mayaPurchaseFinancingActivity.finishActivity(1200);
                        mayaPurchaseFinancingActivity.finish();
                        return;
                    }
                    break;
            }
        }
        tVar.notImplemented();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void e() {
        r rVar = (r) this.f8231b;
        MayaScoreActivity mayaScoreActivity = (MayaScoreActivity) this.c;
        t tVar = (t) this.f8232d;
        int i = MayaScoreActivity.f13733p;
        String str = rVar.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        AbstractC1331a.t("access_token", mayaScoreActivity.V1().e.b(), tVar);
                        return;
                    }
                    break;
                case -1371499115:
                    if (str.equals("getMayaXpToggles")) {
                        M7.a aVarV1 = mayaScoreActivity.V1();
                        A5.b bVar = A5.b.f89Y0;
                        S5.c cVar = aVarV1.f;
                        tVar.success(M.h(new Pair("maya_xp", Boolean.valueOf(S5.c.b(cVar, bVar))), new Pair("maya_xp_benefits", Boolean.valueOf(S5.c.b(cVar, A5.b.f91Z0))), new Pair("maya_xp_focus", Boolean.valueOf(S5.c.b(cVar, A5.b.f95b1))), new Pair("maya_xp_earn", Boolean.valueOf(S5.c.b(cVar, A5.b.f93a1)))));
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        M7.a aVarV12 = mayaScoreActivity.V1();
                        String eventArgumentsString = rVar.f19113b.toString();
                        j.g(eventArgumentsString, "eventArgumentsString");
                        try {
                            q qVarG = T2.x(eventArgumentsString).g();
                            String strJ = qVarG.m("event_name").j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o oVarM = qVarG.m("attributes");
                            if (oVarM != null && !(oVarM instanceof p)) {
                                Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                                while (((com.google.gson.internal.h) it).hasNext()) {
                                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                }
                            }
                            linkedHashMap.toString();
                            yk.a.a();
                            InterfaceC2389a interfaceC2389a = (InterfaceC2389a) aVarV12.c.get();
                            j.d(strJ);
                            ((MayaScoreActivity) interfaceC2389a).X1(strJ, linkedHashMap);
                            break;
                        } catch (Exception unused) {
                            ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
                            yk.a.d();
                        }
                        tVar.success("");
                        return;
                    }
                    break;
                case 447853137:
                    if (str.equals("getKycStatus")) {
                        AbstractC1331a.t("kyc_status", mayaScoreActivity.V1().e.l(), tVar);
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        AbstractC1331a.t("session_token", mayaScoreActivity.V1().e.s(), tVar);
                        return;
                    }
                    break;
                case 1203902891:
                    if (str.equals("showUpgradeScreen")) {
                        String string = mayaScoreActivity.getString(R.string.maya_label_upgrade_dialog_title);
                        j.f(string, "getString(...)");
                        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string, mayaScoreActivity.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaScoreActivity.getString(R.string.maya_label_upgrade_now), new com.squareup.wire.internal.a(mayaScoreActivity, 23)), new Pair(mayaScoreActivity.getString(R.string.maya_label_maybe_later), null), null, 96);
                        mayaAlertBottomSheetDialogFragmentN.s1(mayaAlertBottomSheetDialogFragmentN.f11818a0);
                        mayaAlertBottomSheetDialogFragmentN.f11820c0 = mayaAlertBottomSheetDialogFragmentN.f11820c0;
                        FragmentTransaction fragmentTransactionBeginTransaction = mayaScoreActivity.getSupportFragmentManager().beginTransaction();
                        j.f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                        fragmentTransactionBeginTransaction.add(mayaAlertBottomSheetDialogFragmentN, "alert_dialog");
                        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                        return;
                    }
                    break;
                case 1611630172:
                    if (str.equals("showWebView")) {
                        M7.a aVarV13 = mayaScoreActivity.V1();
                        String str2 = (String) rVar.a(ImagesContract.URL);
                        MayaScoreActivity mayaScoreActivity2 = (MayaScoreActivity) ((InterfaceC2389a) aVarV13.c.get());
                        mayaScoreActivity2.n1().k0(mayaScoreActivity2, str2);
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        mayaScoreActivity.getClass();
                        FlutterEngineCache.getInstance().remove("mayaScoreActivity");
                        mayaScoreActivity.W1();
                        return;
                    }
                    break;
                case 2094332659:
                    if (str.equals("showSupportWebViewWithParams")) {
                        M7.a aVarV14 = mayaScoreActivity.V1();
                        String str3 = (String) rVar.a("customPath");
                        MayaScoreActivity mayaScoreActivity3 = (MayaScoreActivity) ((InterfaceC2389a) aVarV14.c.get());
                        mayaScoreActivity3.n1().v(mayaScoreActivity3, str3, mayaScoreActivity3.getString(R.string.maya_label_help));
                        return;
                    }
                    break;
            }
        }
        tVar.notImplemented();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final void f() {
        int i = 2;
        int i4 = 23;
        int i6 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        r rVar = (r) this.f8231b;
        CryptocurrencyV2Activity cryptocurrencyV2Activity = (CryptocurrencyV2Activity) this.c;
        t channelResult = (t) this.f8232d;
        int i10 = CryptocurrencyV2Activity.f12131o;
        String str = rVar.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1721459362:
                    if (str.equals("getFeatureFlagStatus")) {
                        C0323a c0323aV1 = cryptocurrencyV2Activity.V1();
                        String arguments = rVar.f19113b.toString();
                        j.g(channelResult, "channelResult");
                        j.g(arguments, "arguments");
                        try {
                            String strJ = T2.x(arguments).g().m("flag_key").j();
                            boolean zB = j.b(strJ, "cryptoPortfolio");
                            S5.c cVar = (S5.c) c0323aV1.f;
                            if (zB) {
                                channelResult.success(Boolean.valueOf(S5.c.b(cVar, A5.b.f139v)));
                            } else if (j.b(strJ, "cryptoSingleAssetPortfolio")) {
                                channelResult.success(Boolean.valueOf(S5.c.b(cVar, A5.b.f142w)));
                            } else {
                                channelResult.error("", "Unable to find key", null);
                            }
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            channelResult.error("", "Unable to parse json", null);
                            return;
                        }
                    }
                    break;
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        C0323a c0323aV12 = cryptocurrencyV2Activity.V1();
                        j.g(channelResult, "channelResult");
                        AbstractC1331a.t("access_token", ((com.paymaya.data.preference.a) c0323aV12.e).b(), channelResult);
                        return;
                    }
                    break;
                case -207051658:
                    if (str.equals("getServerUrl")) {
                        cryptocurrencyV2Activity.V1();
                        j.g(channelResult, "channelResult");
                        yk.a.a();
                        channelResult.success("{ \"url\": \"paymaya-api.cryptosrvc.com\" }");
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        C0323a c0323aV13 = cryptocurrencyV2Activity.V1();
                        String eventArgumentsString = rVar.f19113b.toString();
                        j.g(eventArgumentsString, "eventArgumentsString");
                        try {
                            q qVarG = T2.x(eventArgumentsString).g();
                            String strJ2 = qVarG.m("event_name").j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o oVarM = qVarG.m("attributes");
                            if (oVarM != null && !(oVarM instanceof p)) {
                                Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                                while (((com.google.gson.internal.h) it).hasNext()) {
                                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                }
                            }
                            linkedHashMap.toString();
                            yk.a.a();
                            InterfaceC2468a interfaceC2468a = (InterfaceC2468a) c0323aV13.c.get();
                            j.d(strJ2);
                            ((CryptocurrencyV2Activity) interfaceC2468a).W1(strJ2, linkedHashMap);
                            break;
                        } catch (Exception e7) {
                            ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
                            yk.a.d();
                            e7.printStackTrace();
                        }
                        channelResult.success("");
                        return;
                    }
                    break;
                case 727434611:
                    if (str.equals("getProfile")) {
                        C0323a c0323aV14 = cryptocurrencyV2Activity.V1();
                        j.g(channelResult, "channelResult");
                        Identity identityF = ((C1293x0) c0323aV14.h).f();
                        String strMType = identityF != null ? identityF.mType() : null;
                        String strMValue = identityF != null ? identityF.mValue() : null;
                        Boolean boolMVerified = identityF != null ? identityF.mVerified() : null;
                        String strL = ((com.paymaya.data.preference.a) c0323aV14.e).l();
                        if (strMType == null || strMValue == null || boolMVerified == null || strL == null) {
                            yk.a.a();
                            channelResult.error("", "Oops! Something’s up. But don’t worry, we’re now looking into it. Please try again later.", null);
                            return;
                        }
                        String string = A0.f(strMType, strMValue, strL, boolMVerified.booleanValue()).toString();
                        j.f(string, "toString(...)");
                        ">>>> Flutter call: getProfile = ".concat(string);
                        yk.a.a();
                        channelResult.success(string);
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        C0323a c0323aV15 = cryptocurrencyV2Activity.V1();
                        j.g(channelResult, "channelResult");
                        AbstractC1331a.t("session_token", ((com.paymaya.data.preference.a) c0323aV15.e).s(), channelResult);
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        cryptocurrencyV2Activity.n1().a();
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        yk.a.a();
                        channelResult.success("");
                        cryptocurrencyV2Activity.finishActivity(1200);
                        cryptocurrencyV2Activity.finish();
                        return;
                    }
                    break;
                case 1954849993:
                    if (str.equals("getBalanceAndLimits")) {
                        C0323a c0323aV16 = cryptocurrencyV2Activity.V1();
                        j.g(channelResult, "channelResult");
                        new Lh.d(new Lh.d(new Lh.h(Ah.p.l(new Lh.f(new Lh.h(((C1247a) c0323aV16.f2878g).a(), zh.b.a(), i6), new p8.a(c0323aV16, i4), i), new Lh.h(((C1249b) c0323aV16.i).a(), zh.b.a(), objArr4 == true ? 1 : 0), C2386a.f20701a), zh.b.a(), objArr3 == true ? 1 : 0), new C2387b(channelResult, 0), i), new C2038a(i4, c0323aV16, channelResult, objArr2 == true ? 1 : 0), objArr == true ? 1 : 0).e();
                        return;
                    }
                    break;
            }
        }
        channelResult.notImplemented();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0ad0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 3266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.b.run():void");
    }
}
