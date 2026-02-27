package eg;

import android.content.Context;
import android.net.ConnectivityManager;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.T;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import pg.j;
import pg.n;
import pg.u;

/* JADX INFO: renamed from: eg.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1441c implements FlutterPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f16671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f16672b;
    public C1440b c;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        this.f16671a = new u(binaryMessenger, numX49.tnTj78("biLb"));
        this.f16672b = new n(binaryMessenger, numX49.tnTj78("biL2"));
        T t5 = new T((ConnectivityManager) applicationContext.getSystemService(numX49.tnTj78("biLL")), 6);
        L l6 = new L(t5, 7);
        this.c = new C1440b(applicationContext, t5);
        this.f16671a.b(l6);
        this.f16672b.a(this.c);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f16671a.b(null);
        this.f16672b.a(null);
        this.c.onCancel(null);
        this.f16671a = null;
        this.f16672b = null;
        this.c = null;
    }
}
