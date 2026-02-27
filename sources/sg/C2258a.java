package sg;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.webkit.internal.AssetHelper;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
import java.util.HashMap;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.t;
import pg.w;

/* JADX INFO: renamed from: sg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2258a implements FlutterPlugin, ActivityAware, w, ProcessTextChannel.ProcessTextMethodHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f20075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActivityPluginBinding f20076b;
    public HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f20077d = new HashMap();

    public C2258a(ProcessTextChannel processTextChannel) {
        this.f20075a = processTextChannel.packageManager;
        processTextChannel.setMethodHandler(this);
    }

    @Override // pg.w
    public final boolean onActivityResult(int i, int i4, Intent intent) {
        HashMap map = this.f20077d;
        if (!map.containsKey(Integer.valueOf(i))) {
            return false;
        }
        ((t) map.remove(Integer.valueOf(i))).success(i4 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f20076b = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.f20076b.removeActivityResultListener(this);
        this.f20076b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        this.f20076b.removeActivityResultListener(this);
        this.f20076b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.f20076b = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
    public final void processTextAction(String str, String str2, boolean z4, t tVar) {
        if (this.f20076b == null) {
            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Plugin not bound to an Activity", null);
            return;
        }
        HashMap map = this.c;
        if (map == null) {
            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Text processing activity not found", null);
            return;
        }
        int iHashCode = tVar.hashCode();
        this.f20077d.put(Integer.valueOf(iHashCode), tVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z4);
        this.f20076b.getActivity().startActivityForResult(intent, iHashCode);
    }

    @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
    public final Map queryTextActions() {
        HashMap map = this.c;
        PackageManager packageManager = this.f20075a;
        if (map == null) {
            this.c = new HashMap();
            int i = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(AssetHelper.DEFAULT_MIME_TYPE);
            for (ResolveInfo resolveInfo : i >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.c.put(str, resolveInfo);
            }
        }
        HashMap map2 = new HashMap();
        for (String str2 : this.c.keySet()) {
            map2.put(str2, ((ResolveInfo) this.c.get(str2)).loadLabel(packageManager).toString());
        }
        return map2;
    }
}
