package V4;

import R4.i;
import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.Lifecycle;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import pg.j;
import pg.n;
import pg.s;
import pg.u;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements s, FlutterPlugin, ActivityAware {
    public static String i;
    public static boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f6069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f6070l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivityPluginBinding f6071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f6072b;
    public Application c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FlutterPlugin.FlutterPluginBinding f6073d;
    public Lifecycle e;
    public d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Activity f6074g;
    public u h;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f6071a = activityPluginBinding;
        j binaryMessenger = this.f6073d.getBinaryMessenger();
        Application application = (Application) this.f6073d.getApplicationContext();
        Activity activity = this.f6071a.getActivity();
        ActivityPluginBinding activityPluginBinding2 = this.f6071a;
        this.f6074g = activity;
        this.c = application;
        this.f6072b = new c(activity);
        u uVar = new u(binaryMessenger, "miguelruivo.flutter.plugins.filepicker");
        this.h = uVar;
        uVar.b(this);
        new n(binaryMessenger, "miguelruivo.flutter.plugins.filepickerevent").a(new i(this, 3));
        this.f = new d(activity);
        activityPluginBinding2.addActivityResultListener(this.f6072b);
        Lifecycle activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding2);
        this.e = activityLifecycle;
        activityLifecycle.addObserver(this.f);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f6073d = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.f6071a.removeActivityResultListener(this.f6072b);
        this.f6071a = null;
        d dVar = this.f;
        if (dVar != null) {
            this.e.removeObserver(dVar);
            this.c.unregisterActivityLifecycleCallbacks(this.f);
        }
        this.e = null;
        this.f6072b.h = null;
        this.f6072b = null;
        this.h.b(null);
        this.h = null;
        this.c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f6073d = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e4  */
    @Override // pg.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(pg.r r34, pg.t r35) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.g.onMethodCall(pg.r, pg.t):void");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
