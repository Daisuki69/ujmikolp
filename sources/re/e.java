package Re;

import android.content.Context;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import pg.j;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements FlutterPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f5520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cg.c f5521b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        j binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        this.f5521b = new Cg.c(binaryMessenger, applicationContext);
        u uVar = new u(binaryMessenger, numX49.tnTj78("bZpPs"));
        this.f5520a = uVar;
        uVar.b(this.f5521b);
        flutterPluginBinding.getFlutterEngine().addEngineLifecycleListener(new d(this));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f5521b.f();
        this.f5521b = null;
        this.f5520a.b(null);
    }
}
