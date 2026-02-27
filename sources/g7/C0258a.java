package G7;

import D.C0190x;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentTransaction;
import cj.L;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.R;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.common.view.activity.impl.MayaFullScreenFlutterFragmentActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: G7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0258a extends C0265h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public A7.h f1831A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f1832B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Intent f1833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FlutterEngine f1834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Intent f1835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public pg.u f1836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FlutterEngine f1837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Ag.f f1838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0190x f1839y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC0263f f1840z;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // G7.C0265h
    public final void g(pg.r call, pg.t result) {
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            A7.h hVar = this.f1831A;
            InterfaceC0263f interfaceC0263f = this.f1840z;
            Object obj = call.f19113b;
            switch (iHashCode) {
                case -670914607:
                    if (str.equals("getAvailability")) {
                        Map<String, Boolean> flutterAvailability = hVar.f212d.e().getFlutterAvailability();
                        kotlin.jvm.internal.j.f(flutterAvailability, "getFlutterAvailability(...)");
                        result.success(flutterAvailability);
                        return;
                    }
                    break;
                case -476469337:
                    if (str.equals("finishCurrentModuleForCard")) {
                        e().a("onModuleResult", obj, null);
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 310638497:
                    if (str.equals("getAdKitUserTags")) {
                        if (interfaceC0263f != null) {
                            ((MayaDashboardActivity) interfaceC0263f).a2(result);
                            return;
                        }
                        return;
                    }
                    break;
                case 403473919:
                    if (str.equals("goToSavingsTab")) {
                        if (interfaceC0263f != null) {
                            ((MayaDashboardActivity) interfaceC0263f).W1("savings", "");
                            return;
                        }
                        return;
                    }
                    break;
                case 699375000:
                    if (str.equals("requestCreditCard")) {
                        String str2 = (String) call.a("route");
                        if (str2 != null) {
                            MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) hVar.c.get());
                            mayaDashboardFragment.getClass();
                            InterfaceC0263f interfaceC0263f2 = mayaDashboardFragment.f12175p0;
                            if (interfaceC0263f2 != null) {
                                ((MayaDashboardActivity) interfaceC0263f2).n2(str2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    break;
                case 827711050:
                    if (str.equals("getToggle")) {
                        result.success(hVar.m());
                        return;
                    }
                    break;
                case 1203902891:
                    if (str.equals("showUpgradeScreen")) {
                        if (interfaceC0263f != null) {
                            EnumC1215d enumC1215d = EnumC1215d.MY_CARDS;
                            EnumC1216e enumC1216e = EnumC1216e.DASHBOARD;
                            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) interfaceC0263f;
                            String string = mayaDashboardActivity.getString(R.string.maya_label_upgrade_dialog_title);
                            kotlin.jvm.internal.j.f(string, "getString(...)");
                            MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string, mayaDashboardActivity.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaDashboardActivity.getString(R.string.maya_label_upgrade_now), new C7.e(mayaDashboardActivity, 0)), new Pair(mayaDashboardActivity.getString(R.string.maya_label_maybe_later), null), null, 96);
                            mayaAlertBottomSheetDialogFragmentN.s1(enumC1215d);
                            mayaAlertBottomSheetDialogFragmentN.f11820c0 = enumC1216e;
                            FragmentTransaction fragmentTransactionBeginTransaction = mayaDashboardActivity.getSupportFragmentManager().beginTransaction();
                            kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                            fragmentTransactionBeginTransaction.add(mayaAlertBottomSheetDialogFragmentN, "alert_dialog");
                            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                            return;
                        }
                        return;
                    }
                    break;
                case 1374266282:
                    if (str.equals("requestFullscreen")) {
                        c().a("requestFullscreen", obj, null);
                        n();
                        this.f1838x.invoke(d());
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 1611630172:
                    if (str.equals("showWebView")) {
                        String str3 = (String) call.a(ImagesContract.URL);
                        if (str3 == null || interfaceC0263f == null) {
                            return;
                        }
                        ((MayaDashboardActivity) interfaceC0263f).v2(str3);
                        return;
                    }
                    break;
            }
        }
        super.g(call, result);
    }

    @Override // G7.C0265h
    public final void j(String str, Function0 function0) {
        c().a("requestFullscreen", L.c(new Pair("route", str)), null);
        n();
        this.f1838x.invoke(d());
    }

    @Override // G7.C0265h
    public final void l(pg.u uVar, Intent destinationIntent) {
        kotlin.jvm.internal.j.g(destinationIntent, "destinationIntent");
        uVar.b(new A7.r(5, destinationIntent, this));
    }

    public final void n() {
        String str = this.f1832B;
        k(new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaFullScreenFlutterFragmentActivity.class, str).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) this.f1839y.invoke()));
        d().putExtra("engineId", str);
    }

    public final void o() {
        C0190x c0190x = this.f1839y;
        this.f1837w = new FlutterEngine((Context) c0190x.invoke());
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine = this.f1837w;
        if (flutterEngine == null) {
            kotlin.jvm.internal.j.n("flutterCheckoutActivityEngine");
            throw null;
        }
        flutterEngineCache.put("checkoutFullscreen", flutterEngine);
        FlutterEngine flutterEngine2 = this.f1837w;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterCheckoutActivityEngine");
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute("fullscreenFlowEntrypoint");
        FlutterEngine flutterEngine3 = this.f1837w;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterCheckoutActivityEngine");
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "package:paymaya_module/main.dart", "runCheckout"));
        Intent intentBuild = new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaFullScreenFlutterFragmentActivity.class, "checkoutFullscreen").build((Context) c0190x.invoke());
        this.f1835u = intentBuild;
        if (intentBuild == null) {
            kotlin.jvm.internal.j.n("flutterCheckoutActivityIntent");
            throw null;
        }
        intentBuild.putExtra("engineId", "checkoutFullscreen");
        FlutterEngine flutterEngine4 = this.f1837w;
        if (flutterEngine4 == null) {
            kotlin.jvm.internal.j.n("flutterCheckoutActivityEngine");
            throw null;
        }
        pg.u uVar = new pg.u(flutterEngine4.getDartExecutor().getBinaryMessenger(), "packages/paymaya_checkout");
        this.f1836v = uVar;
        Intent intent = this.f1835u;
        if (intent != null) {
            l(uVar, intent);
        } else {
            kotlin.jvm.internal.j.n("flutterCheckoutActivityIntent");
            throw null;
        }
    }

    public final void p() {
        C0190x c0190x = this.f1839y;
        this.f1834t = new FlutterEngine((Context) c0190x.invoke());
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine = this.f1834t;
        if (flutterEngine == null) {
            kotlin.jvm.internal.j.n("flutterUsernameActivityEngine");
            throw null;
        }
        flutterEngineCache.put("setUsernameFullscreen", flutterEngine);
        FlutterEngine flutterEngine2 = this.f1834t;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterUsernameActivityEngine");
            throw null;
        }
        flutterEngine2.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runSetUsername"));
        Intent intentBuild = new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaFullScreenFlutterFragmentActivity.class, "setUsernameFullscreen").build((Context) c0190x.invoke());
        this.f1833s = intentBuild;
        if (intentBuild == null) {
            kotlin.jvm.internal.j.n("flutterUsernameActivityIntent");
            throw null;
        }
        intentBuild.putExtra("engineId", "setUsernameFullscreen");
        FlutterEngine flutterEngine3 = this.f1834t;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterUsernameActivityEngine");
            throw null;
        }
        pg.u uVar = new pg.u(flutterEngine3.getDartExecutor().getBinaryMessenger(), "packages/paymaya_set_username");
        Intent intent = this.f1833s;
        if (intent != null) {
            l(uVar, intent);
        } else {
            kotlin.jvm.internal.j.n("flutterUsernameActivityIntent");
            throw null;
        }
    }
}
