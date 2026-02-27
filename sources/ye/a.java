package Ye;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.tom_roush.pdfbox.pdmodel.encryption.InvalidPasswordException;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;
import yf.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements FlutterPlugin, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f6785a;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j.g(flutterPluginBinding, "flutterPluginBinding");
        u uVar = new u(flutterPluginBinding.getBinaryMessenger(), "com.tarique/password_protected_pdf_checker");
        this.f6785a = uVar;
        uVar.b(this);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        if (applicationContext != null) {
            applicationContext.getApplicationContext().getAssets();
        } else {
            j.n("context");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        u uVar = this.f6785a;
        if (uVar != null) {
            uVar.b(null);
        } else {
            j.n(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    @Override // pg.s
    public final void onMethodCall(r call, t result) {
        boolean z4;
        j.g(call, "call");
        j.g(result, "result");
        String str = call.f19112a;
        if (j.b(str, "getPlatformVersion")) {
            result.success("Android " + Build.VERSION.RELEASE);
            return;
        }
        if (!j.b(str, "checkPasswordProtectedPDF")) {
            result.notImplemented();
            return;
        }
        try {
            try {
                d dVar = Cf.a.b((byte[]) call.f19113b).f761a.f21157d;
                z4 = dVar != null ? dVar.q(yf.j.f21227j0) instanceof d : false;
            } catch (InvalidPasswordException unused) {
                z4 = true;
            }
            result.success(Boolean.valueOf(z4));
        } catch (Exception unused2) {
            result.success(Boolean.FALSE);
        }
    }
}
