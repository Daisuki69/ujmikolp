package fg;

import U8.c;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import kotlin.jvm.internal.j;
import pg.u;

/* JADX INFO: renamed from: fg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1484a implements FlutterPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f16756a;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        pg.j binaryMessenger = binding.getBinaryMessenger();
        j.f(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        j.f(applicationContext, "getApplicationContext(...)");
        this.f16756a = new u(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = applicationContext.getPackageManager();
        j.f(packageManager, "getPackageManager(...)");
        Object systemService = applicationContext.getSystemService("activity");
        j.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = applicationContext.getContentResolver();
        j.d(contentResolver);
        c cVar = new c(20, packageManager, (ActivityManager) systemService, contentResolver);
        u uVar = this.f16756a;
        if (uVar != null) {
            uVar.b(cVar);
        } else {
            j.n("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        u uVar = this.f16756a;
        if (uVar != null) {
            uVar.b(null);
        } else {
            j.n("methodChannel");
            throw null;
        }
    }
}
