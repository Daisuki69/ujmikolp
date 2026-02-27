package U4;

import Bj.C0144h0;
import Bj.H;
import Bj.U;
import Gj.m;
import Ij.e;
import com.appsflyer.AppsFlyerProperties;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements FlutterPlugin, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f5941a;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j.g(flutterPluginBinding, "flutterPluginBinding");
        u uVar = new u(flutterPluginBinding.getBinaryMessenger(), "packages/spki_pinner");
        this.f5941a = uVar;
        uVar.b(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        u uVar = this.f5941a;
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
        if (!j.b(call.f19112a, "fetchHostCertificates")) {
            result.notImplemented();
            return;
        }
        C0144h0 c0144h0 = C0144h0.f623a;
        e eVar = U.f603a;
        H.w(c0144h0, m.f2024a, null, new b(call, result, this, null), 2);
    }
}
