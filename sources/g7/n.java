package G7;

import Bj.B0;
import Bj.C0165x;
import D.C0190x;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import cj.L;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.Config;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.ui.common.view.activity.impl.FlutterDialogActivity;
import com.paymaya.ui.common.view.activity.impl.FullScreenFlutterActivity;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m5.C1847a;
import n5.C1928e;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends C0265h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0190x f1898A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final S5.c f1899B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1900C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public FlutterEngine f1901D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public FlutterEngine f1902E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Intent f1903F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public pg.u f1904G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public pg.u f1905H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public M f1906I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f1907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f1908t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f1909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final A7.h f1911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC0263f f1912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Ag.f f1913y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Ag.f f1914z;

    public n(A7.h hVar, InterfaceC0263f interfaceC0263f, Ag.f fVar, Ag.f fVar2, C0190x c0190x, Config config, S5.c cVar, com.paymaya.data.preference.a aVar) {
        super("runConsumerSavings", "savings", "savingsActivity", "packages/paymaya_consumer_savings", hVar, interfaceC0263f, fVar, fVar2, c0190x, null, 3072);
        this.f1907s = "runConsumerSavings";
        this.f1908t = "savings";
        this.f1909u = "savingsActivity";
        this.f1910v = "packages/paymaya_consumer_savings";
        this.f1911w = hVar;
        this.f1912x = interfaceC0263f;
        this.f1913y = fVar;
        this.f1914z = fVar2;
        this.f1898A = c0190x;
        this.f1899B = cVar;
        this.f1900C = aVar;
    }

    public static LinkedHashMap n(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iB = L.b(cj.t.l(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            kotlin.jvm.internal.j.e(key, "null cannot be cast to non-null type kotlin.String");
            kotlin.jvm.internal.j.e(value, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) key, (String) value);
        }
        return linkedHashMap;
    }

    public static void q(Object obj, pg.t tVar, Function1 function1) {
        if (obj == null || !(obj instanceof Map)) {
            tVar.error("INVALID_ARGUMENT", "Expected Map<String, String> as argument, but received " + obj, null);
        } else {
            try {
                function1.invoke(n((Map) obj));
            } catch (ClassCastException e) {
                tVar.error("INVALID_ARGUMENT", "Expected Map<String, String> as argument, but found incorrect key/value types.", e);
            }
        }
    }

    @Override // G7.C0265h
    public final void b() {
        M m = this.f1906I;
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
            this.f1906I = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0212, code lost:
    
        if (r6.equals(r0) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0240, code lost:
    
        if (r6.equals(r9) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0187, code lost:
    
        if (r6.equals(r1) != false) goto L82;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    @Override // G7.C0265h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(pg.r r31, final pg.t r32) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G7.n.f(pg.r, pg.t):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // G7.C0265h
    public final void g(pg.r call, pg.t result) {
        String strValueOf;
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            A7.h hVar = this.f1911w;
            InterfaceC0263f interfaceC0263f = this.f1912x;
            Object obj = call.f19113b;
            switch (iHashCode) {
                case -1356376904:
                    if (str.equals("onTouchActionDown")) {
                        hVar.B();
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1242573971:
                    if (str.equals("openCreditApplication")) {
                        if (!S5.c.b(this.f1899B, A5.b.f68L0) || interfaceC0263f == null) {
                            return;
                        }
                        ((MayaDashboardActivity) interfaceC0263f).n2("creditCardOverviewScreen?product_key=MAYA_BLACK_CREDIT_CARD_CONSUMER_LOAN");
                        return;
                    }
                    break;
                case -373350368:
                    if (str.equals("sendToFullscreenEngine")) {
                        pg.u uVar = this.f1904G;
                        if (uVar == null) {
                            kotlin.jvm.internal.j.n("flutterSavingsActivityEngineMethodChannel");
                            throw null;
                        }
                        uVar.a("sendToFullscreenEngine", obj, null);
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
                        if (interfaceC0263f != null) {
                            ((MayaDashboardActivity) interfaceC0263f).t2(EnumC1215d.SAVINGS, EnumC1216e.DASHBOARD);
                            return;
                        }
                        return;
                    }
                    break;
                case 1374266282:
                    if (str.equals("requestFullscreen")) {
                        pg.u uVar2 = this.f1904G;
                        if (uVar2 == null) {
                            kotlin.jvm.internal.j.n("flutterSavingsActivityEngineMethodChannel");
                            throw null;
                        }
                        uVar2.a("requestFullscreen", obj, null);
                        try {
                            strValueOf = String.valueOf(call.a("screen_type"));
                            break;
                        } catch (Exception unused) {
                            yk.a.e();
                            strValueOf = "";
                        }
                        Class cls = strValueOf.equals("dialog") ? FlutterDialogActivity.class : FullScreenFlutterActivity.class;
                        String str2 = this.f1909u;
                        Intent intentBuild = new FlutterActivity.CachedEngineIntentBuilder(cls, str2).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) this.f1898A.invoke());
                        this.f1903F = intentBuild;
                        if (intentBuild == null) {
                            kotlin.jvm.internal.j.n("flutterSavingsActivityIntent");
                            throw null;
                        }
                        intentBuild.putExtra("engineId", str2);
                        Intent intent = this.f1903F;
                        if (intent == null) {
                            kotlin.jvm.internal.j.n("flutterSavingsActivityIntent");
                            throw null;
                        }
                        this.f1914z.invoke(intent);
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
            }
        }
        f(call, result);
    }

    @Override // G7.C0265h
    public final void h() {
        FlutterEngine flutterEngine = new FlutterEngine((Context) this.f1898A.invoke());
        this.f1901D = flutterEngine;
        flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", this.f1907s));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine2 = this.f1901D;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterEngine");
            throw null;
        }
        flutterEngineCache.put(this.f1908t, flutterEngine2);
        i();
        FlutterEngine flutterEngine3 = this.f1901D;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterEngine");
            throw null;
        }
        pg.u uVar = new pg.u(flutterEngine3.getDartExecutor().getBinaryMessenger(), this.f1910v);
        uVar.b(new A7.c(this, 29));
        this.f1905H = uVar;
    }

    @Override // G7.C0265h
    public final void i() {
        C0190x c0190x = this.f1898A;
        this.f1902E = new FlutterEngine((Context) c0190x.invoke());
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine = this.f1902E;
        if (flutterEngine == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        String str = this.f1909u;
        flutterEngineCache.put(str, flutterEngine);
        FlutterEngine flutterEngine2 = this.f1902E;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute("fullscreenFlowEntrypoint");
        FlutterEngine flutterEngine3 = this.f1902E;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", this.f1907s));
        Intent intentBuild = new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, str).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) c0190x.invoke());
        this.f1903F = intentBuild;
        if (intentBuild == null) {
            kotlin.jvm.internal.j.n("flutterSavingsActivityIntent");
            throw null;
        }
        intentBuild.putExtra("engineId", str);
        FlutterEngine flutterEngine4 = this.f1902E;
        if (flutterEngine4 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        pg.u uVar = new pg.u(flutterEngine4.getDartExecutor().getBinaryMessenger(), this.f1910v);
        this.f1904G = uVar;
        Intent intent = this.f1903F;
        if (intent != null) {
            l(uVar, intent);
        } else {
            kotlin.jvm.internal.j.n("flutterSavingsActivityIntent");
            throw null;
        }
    }

    @Override // G7.C0265h
    public final void j(String str, Function0 function0) {
        pg.u uVar = this.f1904G;
        if (uVar == null) {
            kotlin.jvm.internal.j.n("flutterSavingsActivityEngineMethodChannel");
            throw null;
        }
        uVar.a("requestFullscreen", L.c(new Pair("route", str)), null);
        String str2 = this.f1909u;
        Intent intentBuild = new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, str2).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build((Context) this.f1898A.invoke());
        this.f1903F = intentBuild;
        if (intentBuild == null) {
            kotlin.jvm.internal.j.n("flutterSavingsActivityIntent");
            throw null;
        }
        intentBuild.putExtra("engineId", str2);
        Intent intent = this.f1903F;
        if (intent != null) {
            this.f1914z.invoke(intent);
        } else {
            kotlin.jvm.internal.j.n("flutterSavingsActivityIntent");
            throw null;
        }
    }

    @Override // G7.C0265h
    public final void l(pg.u uVar, Intent destinationIntent) {
        kotlin.jvm.internal.j.g(destinationIntent, "destinationIntent");
        uVar.b(new A7.r(9, this, destinationIntent));
    }

    @Override // G7.C0265h
    public final void m(Fragment fragment, s5.f fVar) {
        if (S5.c.b(this.f1899B, A5.b.f134s1)) {
            if (this.f1906I == null) {
                M m = new M(fragment, fVar);
                Ag.a aVar = new Ag.a(23);
                C1847a c1847a = (C1847a) m.f11371b;
                c1847a.f17717d = aVar;
                c1847a.e = new Ag.a(24);
                c1847a.f = new C0165x(7);
                this.f1906I = m;
            }
            M m2 = this.f1906I;
            if (m2 != null) {
                m2.j();
            }
        }
    }

    public final void o(Map map, pg.t tVar) {
        if (!S5.c.b(this.f1899B, A5.b.f68L0)) {
            tVar.success(Boolean.FALSE);
            return;
        }
        StringBuilder sb2 = new StringBuilder("securityDepositReprocessScreen?");
        sb2.append("loan_application_id=" + map.get("loan_application_id") + "&");
        sb2.append("sd_account_id=" + map.get("sd_account_id") + "&");
        sb2.append("sd_account_number=" + map.get("sd_account_number") + "&");
        sb2.append("sd_account_name=" + map.get("sd_account_name") + "&");
        sb2.append("productKey=MAYA_BLACK_CREDIT_CARD_CONSUMER_LOAN");
        String string = sb2.toString();
        InterfaceC0263f interfaceC0263f = this.f1912x;
        if (interfaceC0263f != null) {
            ((MayaDashboardActivity) interfaceC0263f).n2(string);
        }
        tVar.success(Boolean.TRUE);
    }

    public final void p(pg.t tVar) {
        if (!S5.c.b(this.f1899B, A5.b.f68L0)) {
            tVar.success(Boolean.FALSE);
            return;
        }
        A7.h hVar = this.f1911w;
        hVar.getClass();
        hVar.k("?productOffering=MAYA_BLACK_CREDIT_CARD_CONSUMER_LOAN");
        tVar.success(Boolean.TRUE);
    }

    public final void r(Object obj) {
        pg.u uVar = this.f1904G;
        if (uVar == null) {
            kotlin.jvm.internal.j.n("flutterSavingsActivityEngineMethodChannel");
            throw null;
        }
        uVar.a("requestFullscreenFromNative", obj, null);
        Intent intent = this.f1903F;
        if (intent != null) {
            this.f1914z.invoke(intent);
        } else {
            kotlin.jvm.internal.j.n("flutterSavingsActivityIntent");
            throw null;
        }
    }
}
