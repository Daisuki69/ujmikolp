package vg;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebSettings;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.util.HashMap;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: renamed from: vg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2349a implements FlutterPlugin, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f20494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f20495b;
    public HashMap c;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        u uVar = new u(flutterPluginBinding.getBinaryMessenger(), "fk_user_agent");
        this.f20494a = uVar;
        uVar.b(this);
        this.f20495b = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f20494a.b(null);
        this.f20494a = null;
        this.f20495b = null;
    }

    @Override // pg.s
    public final void onMethodCall(r rVar, t tVar) {
        int i;
        PackageManager.NameNotFoundException nameNotFoundException;
        String str;
        String string;
        String str2;
        if (!"getProperties".equals(rVar.f19112a)) {
            tVar.notImplemented();
            return;
        }
        String str3 = "";
        HashMap map = this.c;
        if (map == null) {
            this.c = new HashMap();
            PackageManager packageManager = this.f20495b.getPackageManager();
            String packageName = this.f20495b.getPackageName();
            String strSubstring = packageName.substring(packageName.lastIndexOf(".") + 1);
            String property = System.getProperty("http.agent");
            int i4 = 0;
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                string = this.f20495b.getApplicationInfo().loadLabel(this.f20495b.getPackageManager()).toString();
                try {
                    str3 = packageInfo.versionName;
                    i4 = packageInfo.versionCode;
                    str2 = strSubstring + '/' + str3 + '.' + i4 + ' ' + property;
                } catch (PackageManager.NameNotFoundException e) {
                    str = str3;
                    str3 = string;
                    i = i4;
                    nameNotFoundException = e;
                    nameNotFoundException.printStackTrace();
                    i4 = i;
                    string = str3;
                    str3 = str;
                    str2 = property;
                }
            } catch (PackageManager.NameNotFoundException e7) {
                i = 0;
                nameNotFoundException = e7;
                str = "";
            }
            this.c.put("systemName", EventMetricsAggregator.OS_NAME);
            this.c.put("systemVersion", Build.VERSION.RELEASE);
            this.c.put("packageName", packageName);
            this.c.put("shortPackageName", strSubstring);
            this.c.put("applicationName", string);
            this.c.put("applicationVersion", str3);
            this.c.put("applicationBuildNumber", Integer.valueOf(i4));
            this.c.put("packageUserAgent", str2);
            this.c.put("userAgent", property);
            this.c.put("webViewUserAgent", WebSettings.getDefaultUserAgent(this.f20495b));
            map = this.c;
        }
        tVar.success(map);
    }
}
