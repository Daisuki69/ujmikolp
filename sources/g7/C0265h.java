package G7;

import Bj.B0;
import Bj.C0165x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import cj.L;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.M;
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
import kotlin.jvm.functions.Function1;
import m5.C1847a;
import n5.C1928e;

/* JADX INFO: renamed from: G7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0265h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1851b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1852d;
    public final A7.h e;
    public final InterfaceC0263f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kotlin.jvm.internal.i f1853g;
    public final kotlin.jvm.internal.i h;
    public final kotlin.jvm.internal.i i;
    public final Bundle j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FlutterEngine f1854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FlutterEngine f1855l;
    public Intent m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public pg.u f1856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public pg.u f1857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function0 f1858p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C5.b f1859q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M f1860r;

    /* JADX WARN: Multi-variable type inference failed */
    public C0265h(String str, String str2, String str3, String str4, A7.h hVar, InterfaceC0263f interfaceC0263f, Function1 function1, Function1 function12, Function0 function0, Bundle bundle, int i) {
        bundle = (i & 1024) != 0 ? null : bundle;
        this.f1850a = str;
        this.f1851b = str2;
        this.c = str3;
        this.f1852d = str4;
        this.e = hVar;
        this.f = interfaceC0263f;
        this.f1853g = (kotlin.jvm.internal.i) function1;
        this.h = (kotlin.jvm.internal.i) function12;
        this.i = (kotlin.jvm.internal.i) function0;
        this.j = bundle;
        this.f1859q = new C5.b();
    }

    public void a() {
        FlutterEngine flutterEngine = this.f1855l;
        if (flutterEngine != null) {
            l(new pg.u(flutterEngine.getDartExecutor().getBinaryMessenger(), "packages/paymaya_credit_scoring"), d());
        } else {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
    }

    public void b() {
        M m = this.f1860r;
        if (m != null) {
            C1928e c1928e = ((C1847a) m.f11371b).j;
            if (c1928e != null) {
                B0 b02 = c1928e.f;
                if (b02 != null) {
                    b02.b(null);
                }
                NativeCustomFormatAd nativeCustomFormatAd = c1928e.f18624g;
                if (nativeCustomFormatAd != null) {
                    nativeCustomFormatAd.destroy();
                }
                c1928e.f18624g = null;
            }
            this.f1860r = null;
        }
    }

    public final pg.u c() {
        pg.u uVar = this.f1856n;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.j.n("flutterActivityEngineMethodChannel");
        throw null;
    }

    public final Intent d() {
        Intent intent = this.m;
        if (intent != null) {
            return intent;
        }
        kotlin.jvm.internal.j.n("flutterActivityIntent");
        throw null;
    }

    public final pg.u e() {
        pg.u uVar = this.f1857o;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.j.n("partialScreenFlowChannel");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r8v66, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    public void f(pg.r call, pg.t result) {
        boolean z4 = false;
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            C5.b bVar = this.f1859q;
            A7.h hVar = this.e;
            switch (iHashCode) {
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        hVar.r(result);
                        return;
                    }
                    break;
                case -1583371773:
                    if (str.equals("startTrace")) {
                        bVar.h(1, call, result);
                        return;
                    }
                    break;
                case -1305289599:
                    if (str.equals("extract")) {
                        Bundle bundle = this.j;
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
                        Function0 function0 = this.f1858p;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        this.f1858p = null;
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
                        K.d(hVar.f214k, new A7.d(result, 0));
                        return;
                    }
                    break;
                case -517688349:
                    if (str.equals("getVerificationStatus")) {
                        BackUpIdentity backUpIdentityA = hVar.f216n.a();
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
                case 234540986:
                    if (str.equals("setTraceAttributes")) {
                        bVar.h(3, call, result);
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
                        hVar.f214k.c(hVar.f212d.C(), "lending", "loans", new A7.g(result));
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
                        result.success(this.e.n());
                        Unit unit = Unit.f18162a;
                        return;
                    }
                    break;
                case 854478684:
                    if (str.equals("goToWallet")) {
                        InterfaceC0263f interfaceC0263f = ((MayaDashboardFragment) ((F7.a) hVar.c.get())).f12175p0;
                        if (interfaceC0263f != null) {
                            ((MayaDashboardActivity) interfaceC0263f).W1("wallet", "");
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
                        this.f1853g.invoke(result);
                        InterfaceC0263f interfaceC0263f2 = this.f;
                        if (interfaceC0263f2 != null) {
                            ((MayaDashboardActivity) interfaceC0263f2).n1().a();
                            return;
                        }
                        return;
                    }
                    break;
                case 1619896931:
                    if (str.equals("stopTrace")) {
                        bVar.h(2, call, result);
                        return;
                    }
                    break;
            }
        }
        throw new IllegalArgumentException(We.s.i(str, " is not defined in the host app"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    public void g(pg.r call, pg.t result) {
        String strValueOf;
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            A7.h hVar = this.e;
            switch (iHashCode) {
                case -1356376904:
                    if (str.equals("onTouchActionDown")) {
                        hVar.B();
                        result.success(Boolean.TRUE);
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
                case 1203902891:
                    if (str.equals("showUpgradeScreen")) {
                        InterfaceC0263f interfaceC0263f = this.f;
                        if (interfaceC0263f != null) {
                            ((MayaDashboardActivity) interfaceC0263f).t2(EnumC1215d.SAVINGS, EnumC1216e.DASHBOARD);
                            return;
                        }
                        return;
                    }
                    break;
                case 1374266282:
                    if (str.equals("requestFullscreen")) {
                        c().a("requestFullscreen", call.f19113b, null);
                        try {
                            strValueOf = String.valueOf(call.a("screen_type"));
                            break;
                        } catch (Exception unused) {
                            yk.a.e();
                            strValueOf = "";
                        }
                        Class cls = strValueOf.equals("dialog") ? FlutterDialogActivity.class : FullScreenFlutterActivity.class;
                        String str2 = this.c;
                        k(new FlutterActivity.CachedEngineIntentBuilder(cls, str2).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) this.i.invoke()));
                        d().putExtra("engineId", str2);
                        this.h.invoke(d());
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
            }
        }
        f(call, result);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.i] */
    public void h() {
        FlutterEngine flutterEngine = new FlutterEngine((Context) this.i.invoke());
        this.f1854k = flutterEngine;
        flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", this.f1850a));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine2 = this.f1854k;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterEngine");
            throw null;
        }
        flutterEngineCache.put(this.f1851b, flutterEngine2);
        i();
        FlutterEngine flutterEngine3 = this.f1854k;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterEngine");
            throw null;
        }
        pg.u uVar = new pg.u(flutterEngine3.getDartExecutor().getBinaryMessenger(), this.f1852d);
        uVar.b(new A7.c(this, 27));
        this.f1857o = uVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.i] */
    public void i() {
        ?? r1 = this.i;
        this.f1855l = new FlutterEngine((Context) r1.invoke());
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine = this.f1855l;
        if (flutterEngine == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        String str = this.c;
        flutterEngineCache.put(str, flutterEngine);
        FlutterEngine flutterEngine2 = this.f1855l;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute("fullscreenFlowEntrypoint");
        FlutterEngine flutterEngine3 = this.f1855l;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", this.f1850a));
        k(new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, str).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) r1.invoke()));
        d().putExtra("engineId", str);
        FlutterEngine flutterEngine4 = this.f1855l;
        if (flutterEngine4 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        this.f1856n = new pg.u(flutterEngine4.getDartExecutor().getBinaryMessenger(), this.f1852d);
        l(c(), d());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    public void j(String str, Function0 function0) {
        this.f1858p = function0;
        c().a("requestFullscreen", L.c(new Pair("route", str)), null);
        String str2 = this.c;
        k(new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, str2).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) this.i.invoke()));
        d().putExtra("engineId", str2);
        this.h.invoke(d());
    }

    public final void k(Intent intent) {
        kotlin.jvm.internal.j.g(intent, "<set-?>");
        this.m = intent;
    }

    public void l(pg.u uVar, Intent intent) {
        uVar.b(new A7.r(6, this, intent));
    }

    public void m(Fragment fragment, s5.f fVar) {
        s5.f fVar2 = s5.f.e;
        if (this.f1860r == null) {
            M m = new M(fragment, fVar2);
            Ag.a aVar = new Ag.a(21);
            C1847a c1847a = (C1847a) m.f11371b;
            c1847a.f17717d = aVar;
            c1847a.e = new Ag.a(22);
            c1847a.f = new C0165x(6);
            this.f1860r = m;
        }
        M m2 = this.f1860r;
        if (m2 != null) {
            m2.j();
        }
    }
}
