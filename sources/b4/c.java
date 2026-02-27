package B4;

import Bj.H;
import Bj.U;
import Gj.m;
import Ij.e;
import Wf.d;
import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements FlutterPlugin, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f346b;
    public final Gj.c c;

    public c() {
        e eVar = U.f603a;
        this.c = H.c(m.f2024a);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j.g(flutterPluginBinding, "flutterPluginBinding");
        u uVar = new u(flutterPluginBinding.getBinaryMessenger(), "credolab");
        this.f345a = uVar;
        uVar.b(this);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        j.f(applicationContext, "getApplicationContext(...)");
        Context applicationContext2 = applicationContext.getApplicationContext();
        j.c(applicationContext2, "context.applicationContext");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new Zf.a(0));
        this.f346b = new d(applicationContext2, arrayList, arrayList2);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        u uVar = this.f345a;
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
        H.w(this.c, null, null, new b(call, result, this, null), 3);
    }
}
