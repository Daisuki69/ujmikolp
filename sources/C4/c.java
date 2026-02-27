package C4;

import Bj.H;
import Bj.U;
import C2.f;
import Ij.e;
import android.content.Context;
import android.util.Log;
import cj.M;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements FlutterPlugin, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f733b;
    public final LinkedHashMap c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f734d = "ad_image";
    public final String e = "redirection_url";
    public final String f = "redirection_url_type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f735g = "hide_ad_badge";
    public final String h = "ad_unit_id";
    public final String i = "ad_error_domain";
    public final String j = "ad_error_message";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f736k = "ad_error_code";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f737l = "ad_error_reason";

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j.g(flutterPluginBinding, "flutterPluginBinding");
        u uVar = new u(flutterPluginBinding.getBinaryMessenger(), "com.maya.maya_ad_kit/custom_native_ads");
        this.f732a = uVar;
        uVar.b(this);
        this.f733b = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        u uVar = this.f732a;
        if (uVar != null) {
            uVar.b(null);
        } else {
            j.n(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    public final void onMethodCall(r call, t result) {
        int i = 1;
        j.g(call, "call");
        j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            LinkedHashMap linkedHashMap = this.c;
            switch (iHashCode) {
                case -1675847722:
                    if (str.equals("handleOnAdTapped")) {
                        NativeCustomFormatAd nativeCustomFormatAd = (NativeCustomFormatAd) linkedHashMap.get((String) call.a("adUnitId"));
                        if (nativeCustomFormatAd != null) {
                            nativeCustomFormatAd.performClick(this.f734d);
                        }
                        Log.d("NativeAdCarouselVM", "Custom format ad clicked.");
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1097963206:
                    if (str.equals("recordImpression")) {
                        NativeCustomFormatAd nativeCustomFormatAd2 = (NativeCustomFormatAd) linkedHashMap.get((String) call.a("adUnitId"));
                        if (nativeCustomFormatAd2 == null) {
                            result.error("AD_NOT_FOUND", "No ad found for the given ad unit ID", null);
                            return;
                        }
                        nativeCustomFormatAd2.recordImpression();
                        Log.d("NativeAdCarouselVM", "Custom format ad impression recorded.");
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 256746417:
                    if (str.equals("loadCustomNativeAd")) {
                        String str2 = (String) call.a("adUnitId");
                        String str3 = (String) call.a("customFormatId");
                        Map mapE = (Map) call.a("userTags");
                        if (mapE == null) {
                            mapE = M.e();
                        }
                        if (str2 == null || str3 == null) {
                            result.error("INVALID_ARGUMENT", "Ad unit ID or customFormatId is null", null);
                            return;
                        }
                        Context context = this.f733b;
                        if (context == null) {
                            j.n("applicationContext");
                            throw null;
                        }
                        AdLoader adLoaderBuild = new AdLoader.Builder(context, str2).forCustomFormatAd(str3, new Bb.c(i, this, str2, result), new f(i)).withAdListener(new a(this, str2, result)).build();
                        j.f(adLoaderBuild, "build(...)");
                        AdRequest.Builder builder = new AdRequest.Builder();
                        if (!mapE.isEmpty()) {
                            for (Map.Entry entry : mapE.entrySet()) {
                                builder.addCustomTargeting((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        AdRequest adRequestBuild = builder.build();
                        j.f(adRequestBuild, "build(...)");
                        adLoaderBuild.loadAd(adRequestBuild);
                        return;
                    }
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        e eVar = U.f603a;
                        H.w(H.c(Ij.d.f2362a), null, null, new b(this, null), 3).i(new Ag.d(result, 5));
                        return;
                    }
                    break;
                case 1478094737:
                    if (str.equals("destroyLoadedAds")) {
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((NativeCustomFormatAd) it.next()).destroy();
                        }
                        linkedHashMap.clear();
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
