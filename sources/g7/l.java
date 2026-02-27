package G7;

import D.C0190x;
import M8.C0332a;
import M8.M1;
import android.content.Intent;
import com.paymaya.mayaui.referral.view.activity.impl.MayaReferralV2Activity;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M1 f1885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0332a f1886b;
    public final M1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M1 f1887d;
    public final M1 e;
    public final M1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FlutterEngine f1888g;
    public pg.u h;
    public final M1 i;
    public FlutterEngine j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Intent f1889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ta.a f1890l;
    public final M1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Ta.a f1891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0190x f1892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f1894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C5.b f1895r = new C5.b();

    public l(M1 m12, C0332a c0332a, M1 m13, M1 m14, M1 m15, M1 m16, Ta.a aVar, M1 m17, M1 m18, Ta.a aVar2, C0190x c0190x) {
        this.f1885a = m12;
        this.f1886b = c0332a;
        this.c = m13;
        this.f1887d = m14;
        this.e = m15;
        this.f = m16;
        this.i = m17;
        this.f1890l = aVar;
        this.m = m18;
        this.f1891n = aVar2;
        this.f1892o = c0190x;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(pg.r rVar, pg.t tVar) {
        String str = rVar.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            M1 m12 = this.i;
            C5.b bVar = this.f1895r;
            switch (iHashCode) {
                case -2035876535:
                    if (str.equals("requestSetUsername")) {
                        Intent intent = this.f1889k;
                        if (intent == null) {
                            kotlin.jvm.internal.j.n("setUsernameActivityIntent");
                            throw null;
                        }
                        this.f1885a.invoke(intent);
                        tVar.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        this.c.invoke(tVar);
                        return;
                    }
                    break;
                case -1583371773:
                    if (str.equals("startTrace")) {
                        bVar.h(1, rVar, tVar);
                        return;
                    }
                    break;
                case -599445191:
                    if (str.equals("complete")) {
                        Boolean bool = Boolean.TRUE;
                        tVar.success(bool);
                        FlutterEngineCache.getInstance().remove("myreferralFullscreen");
                        b();
                        m12.invoke(bool);
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        this.e.invoke(rVar.f19113b.toString());
                        tVar.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 234540986:
                    if (str.equals("setTraceAttributes")) {
                        bVar.h(3, rVar, tVar);
                        return;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        this.f1887d.invoke(tVar);
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        this.f.invoke(tVar);
                        return;
                    }
                    break;
                case 1611630172:
                    if (str.equals("showWebView")) {
                        this.f1892o.invoke();
                        return;
                    }
                    break;
                case 1619896931:
                    if (str.equals("stopTrace")) {
                        bVar.h(2, rVar, tVar);
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        tVar.success(Boolean.TRUE);
                        FlutterEngineCache.getInstance().remove("myreferralFullscreen");
                        b();
                        if (kotlin.jvm.internal.j.b(this.f1894q, "inviteFriendScreen")) {
                            m12.invoke(Boolean.valueOf(this.f1893p));
                            return;
                        } else {
                            m12.invoke(Boolean.FALSE);
                            return;
                        }
                    }
                    break;
                case 1812186700:
                    if (str.equals("getUsername")) {
                        tVar.success((String) this.f1890l.invoke());
                        return;
                    }
                    break;
            }
        }
        throw new IllegalArgumentException(We.s.i(str, " is not defined in the host app"));
    }

    public final void b() {
        C0332a c0332a = this.f1886b;
        int i = MayaReferralV2Activity.f13660p;
        this.f1888g = new FlutterEngine((MayaReferralV2Activity) c0332a.f3262b);
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine = this.f1888g;
        if (flutterEngine == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngineCache.put("myreferralFullscreen", flutterEngine);
        FlutterEngine flutterEngine2 = this.f1888g;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute("fullscreenFlowEntrypoint");
        FlutterEngine flutterEngine3 = this.f1888g;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runReferral"));
        FlutterEngine flutterEngine4 = this.f1888g;
        if (flutterEngine4 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        pg.u uVar = new pg.u(flutterEngine4.getDartExecutor().getBinaryMessenger(), "packages/maya_referral");
        this.h = uVar;
        uVar.b(new k(this, 0));
    }

    public final void c() {
        C0332a c0332a = this.f1886b;
        int i = MayaReferralV2Activity.f13660p;
        MayaReferralV2Activity mayaReferralV2Activity = (MayaReferralV2Activity) c0332a.f3262b;
        FlutterEngine flutterEngine = new FlutterEngine(mayaReferralV2Activity);
        this.j = flutterEngine;
        flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runSetUsername"));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine2 = this.j;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("setUsernameFlutterFullscreenEngine");
            throw null;
        }
        flutterEngineCache.put("setUsernameFullscreen", flutterEngine2);
        this.f1889k = FlutterActivity.withCachedEngine("setUsernameFullscreen").build(mayaReferralV2Activity);
        FlutterEngine flutterEngine3 = this.j;
        if (flutterEngine3 != null) {
            new pg.u(flutterEngine3.getDartExecutor().getBinaryMessenger(), "packages/paymaya_set_username").b(new k(this, 1));
        } else {
            kotlin.jvm.internal.j.n("setUsernameFlutterFullscreenEngine");
            throw null;
        }
    }
}
