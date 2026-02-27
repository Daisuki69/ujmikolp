package G7;

import D.C0190x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cj.L;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.store.K;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.ui.common.view.activity.impl.FlutterDialogActivity;
import com.paymaya.ui.common.view.activity.impl.FullScreenFlutterActivity;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends C0265h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0190x f1870A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Bundle f1871B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public FlutterEngine f1872C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public FlutterEngine f1873D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Function0 f1874E;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f1875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f1876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f1877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final A7.h f1879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC0263f f1880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Ag.f f1881y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Ag.f f1882z;

    public j(A7.h hVar, InterfaceC0263f interfaceC0263f, Ag.f fVar, Ag.f fVar2, C0190x c0190x, Bundle bundle) {
        super("runBnplHome", "loans", "loansActivity", "packages/paymaya_bnpl", hVar, interfaceC0263f, fVar, fVar2, c0190x, bundle, 2048);
        this.f1875s = "runBnplHome";
        this.f1876t = "loans";
        this.f1877u = "loansActivity";
        this.f1878v = "packages/paymaya_bnpl";
        this.f1879w = hVar;
        this.f1880x = interfaceC0263f;
        this.f1881y = fVar;
        this.f1882z = fVar2;
        this.f1870A = c0190x;
        this.f1871B = bundle;
    }

    @Override // G7.C0265h
    public final void a() {
        FlutterEngine flutterEngine = this.f1873D;
        if (flutterEngine != null) {
            new pg.u(flutterEngine.getDartExecutor().getBinaryMessenger(), "packages/paymaya_credit_scoring").b(new A7.r(8, this, d()));
        } else {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // G7.C0265h
    public final void f(pg.r call, pg.t result) {
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            InterfaceC0263f interfaceC0263f = this.f1880x;
            A7.h hVar = this.f1879w;
            switch (iHashCode) {
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        hVar.r(result);
                        return;
                    }
                    break;
                case -1356376904:
                    if (str.equals("onTouchActionDown")) {
                        hVar.B();
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1305289599:
                    if (str.equals("extract")) {
                        Bundle bundle = this.f1871B;
                        hVar.A(bundle != null ? bundle.getString("triggeredBy") : null, bundle != null ? bundle.getString("eventTrigger") : null, result);
                        return;
                    }
                    break;
                case -1249356004:
                    if (str.equals("getMin")) {
                        hVar.t(result);
                        return;
                    }
                    break;
                case -1246726632:
                    if (str.equals("reloadHome")) {
                        e().a("reloadHome", null, null);
                        return;
                    }
                    break;
                case -1179101518:
                    if (str.equals("getShieldSessionId")) {
                        hVar.y(result);
                        return;
                    }
                    break;
                case -599445191:
                    if (str.equals("complete")) {
                        Function0 function0 = this.f1874E;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        this.f1874E = null;
                        return;
                    }
                    break;
                case -590456363:
                    if (str.equals("getReKYCEnabled")) {
                        hVar.v(result);
                        return;
                    }
                    break;
                case -573598512:
                    if (str.equals("getGeolocation")) {
                        hVar.getClass();
                        K.d(hVar.f214k, new A7.d(result, 0));
                        return;
                    }
                    break;
                case -517688349:
                    if (str.equals("getVerificationStatus")) {
                        hVar.getClass();
                        BackUpIdentity backUpIdentityA = hVar.f216n.a();
                        boolean z4 = false;
                        if (backUpIdentityA != null && backUpIdentityA.isVerifiedEmail()) {
                            z4 = true;
                        }
                        result.success(Boolean.valueOf(z4));
                        return;
                    }
                    break;
                case -147145901:
                    if (str.equals("showReKYCFlow")) {
                        hVar.G();
                        return;
                    }
                    break;
                case -67833007:
                    if (str.equals("getPinningFingerprint")) {
                        hVar.u(result);
                        return;
                    }
                    break;
                case -28226511:
                    if (str.equals("onTouchActionUp")) {
                        hVar.C();
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 71767263:
                    if (str.equals("goToAccountRecovery")) {
                        hVar.o();
                        return;
                    }
                    break;
                case 199635814:
                    if (str.equals("showVerifyEmail")) {
                        hVar.I();
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        Object obj = call.f19113b;
                        obj.toString();
                        yk.a.a();
                        hVar.z(obj.toString());
                        return;
                    }
                    break;
                case 266256941:
                    if (str.equals("showReKYCDialog")) {
                        hVar.q();
                        return;
                    }
                    break;
                case 287777717:
                    if (str.equals("startDataExtract")) {
                        hVar.getClass();
                        hVar.f214k.c(hVar.f212d.C(), "lending", "loans", new A7.g(result));
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
                case 328315452:
                    if (str.equals("uploadDocument")) {
                        hVar.F();
                        return;
                    }
                    break;
                case 447853137:
                    if (str.equals("getKycStatus")) {
                        hVar.s(result);
                        result.success(Unit.f18162a);
                        return;
                    }
                    break;
                case 484563288:
                    if (str.equals("getReKYCFlag")) {
                        hVar.w(result);
                        return;
                    }
                    break;
                case 827711050:
                    if (str.equals("getToggle")) {
                        result.success(hVar.n());
                        return;
                    }
                    break;
                case 854478684:
                    if (str.equals("goToWallet")) {
                        InterfaceC0263f interfaceC0263f2 = ((MayaDashboardFragment) ((F7.a) hVar.c.get())).f12175p0;
                        if (interfaceC0263f2 != null) {
                            ((MayaDashboardActivity) interfaceC0263f2).W1("wallet", "");
                            return;
                        }
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        hVar.x(result);
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        this.f1881y.invoke(result);
                        if (interfaceC0263f != null) {
                            ((MayaDashboardActivity) interfaceC0263f).n1().a();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        throw new IllegalArgumentException(We.s.i(str, " is not defined in the host app"));
    }

    @Override // G7.C0265h
    public final void g(pg.r call, pg.t result) {
        String strValueOf;
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        String str = call.f19112a;
        if (!kotlin.jvm.internal.j.b(str, "requestFullscreen")) {
            if (!kotlin.jvm.internal.j.b(str, "showUpgradeScreen")) {
                f(call, result);
                return;
            }
            InterfaceC0263f interfaceC0263f = this.f1880x;
            if (interfaceC0263f != null) {
                ((MayaDashboardActivity) interfaceC0263f).t2(EnumC1215d.SAVINGS, EnumC1216e.DASHBOARD);
                return;
            }
            return;
        }
        c().a("requestFullscreen", call.f19113b, null);
        try {
            strValueOf = String.valueOf(call.a("screen_type"));
        } catch (Exception unused) {
            yk.a.e();
            strValueOf = "";
        }
        Class cls = strValueOf.equals("dialog") ? FlutterDialogActivity.class : FullScreenFlutterActivity.class;
        String str2 = this.f1877u;
        k(new FlutterActivity.CachedEngineIntentBuilder(cls, str2).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) this.f1870A.invoke()));
        d().putExtra("engineId", str2);
        this.f1882z.invoke(d());
        result.success(Boolean.TRUE);
    }

    @Override // G7.C0265h
    public final void h() {
        FlutterEngine flutterEngine = new FlutterEngine((Context) this.f1870A.invoke());
        this.f1872C = flutterEngine;
        flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", this.f1875s));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine2 = this.f1872C;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterEngine");
            throw null;
        }
        flutterEngineCache.put(this.f1876t, flutterEngine2);
        i();
        FlutterEngine flutterEngine3 = this.f1872C;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterEngine");
            throw null;
        }
        pg.u uVar = new pg.u(flutterEngine3.getDartExecutor().getBinaryMessenger(), this.f1878v);
        uVar.b(new A7.c(this, 28));
        this.f1857o = uVar;
    }

    @Override // G7.C0265h
    public final void i() {
        C0190x c0190x = this.f1870A;
        this.f1873D = new FlutterEngine((Context) c0190x.invoke());
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine = this.f1873D;
        if (flutterEngine == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        String str = this.f1877u;
        flutterEngineCache.put(str, flutterEngine);
        FlutterEngine flutterEngine2 = this.f1873D;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute("fullscreenFlowEntrypoint");
        FlutterEngine flutterEngine3 = this.f1873D;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", this.f1875s));
        k(new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, str).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) c0190x.invoke()));
        d().putExtra("engineId", str);
        FlutterEngine flutterEngine4 = this.f1873D;
        if (flutterEngine4 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        this.f1856n = new pg.u(flutterEngine4.getDartExecutor().getBinaryMessenger(), this.f1878v);
        c().b(new A7.r(8, this, d()));
    }

    @Override // G7.C0265h
    public final void j(String str, Function0 function0) {
        this.f1874E = function0;
        c().a("requestFullscreen", L.c(new Pair("route", str)), null);
        String str2 = this.f1877u;
        k(new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, str2).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) this.f1870A.invoke()));
        d().putExtra("engineId", str2);
        this.f1882z.invoke(d());
    }

    @Override // G7.C0265h
    public final void l(pg.u uVar, Intent intent) {
        uVar.b(new A7.r(8, this, intent));
    }
}
