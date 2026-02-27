package T4;

import android.app.Activity;
import com.appsflyer.AppsFlyerProperties;
import dOYHB6.iY9fr2.dLgao9;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements FlutterPlugin, s, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f5795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f5796b;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        j.g(binding, "binding");
        this.f5796b = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j.g(flutterPluginBinding, "flutterPluginBinding");
        u uVar = new u(flutterPluginBinding.getBinaryMessenger(), "packages/snap_safe");
        this.f5795a = uVar;
        uVar.b(this);
        flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        u uVar = this.f5795a;
        if (uVar != null) {
            uVar.b(null);
        } else {
            j.n(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    @Override // pg.s
    public final void onMethodCall(r call, t result) {
        j.g(call, "call");
        j.g(result, "result");
        String str = call.f19112a;
        if (j.b(str, "screenshotOff")) {
            Activity activity = this.f5796b;
            if (activity == null) {
                j.n("activity");
                throw null;
            }
            activity.getWindow().addFlags(8192);
            result.success(Boolean.TRUE);
            return;
        }
        if (!j.b(str, "screenshotOn")) {
            result.notImplemented();
            return;
        }
        Activity activity2 = this.f5796b;
        if (activity2 == null) {
            j.n("activity");
            throw null;
        }
        dLgao9.oVike1(activity2.getWindow(), 8192);
        result.success(Boolean.TRUE);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        j.g(binding, "binding");
        this.f5796b = binding.getActivity();
    }
}
