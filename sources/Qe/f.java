package Qe;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pg.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements FlutterPlugin, s {
    public static Map c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f5365d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f5366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f5367b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        u uVar = new u(binaryMessenger, "com.ryanheise.audio_session");
        this.f5366a = uVar;
        uVar.b(this);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        e eVar = new e();
        if (e.f5363b == null) {
            d dVar = new d();
            Handler handler = new Handler(Looper.getMainLooper());
            dVar.f5359a = new ArrayList();
            dVar.h = new ArrayList();
            dVar.e = applicationContext;
            dVar.f = (AudioManager) applicationContext.getSystemService("audio");
            b bVar = new b(dVar);
            dVar.f5362g = bVar;
            dVar.f.registerAudioDeviceCallback(bVar, handler);
            e.f5363b = dVar;
        }
        eVar.f5364a = new u(binaryMessenger, "com.ryanheise.android_audio_manager");
        e.f5363b.f5359a.add(eVar);
        eVar.f5364a.b(eVar);
        this.f5367b = eVar;
        f5365d.add(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f5366a.b(null);
        this.f5366a = null;
        e eVar = this.f5367b;
        eVar.f5364a.b(null);
        e.f5363b.f5359a.remove(eVar);
        if (e.f5363b.f5359a.size() == 0) {
            d dVar = e.f5363b;
            dVar.a();
            dVar.f.unregisterAudioDeviceCallback(dVar.f5362g);
            dVar.e = null;
            dVar.f = null;
            e.f5363b = null;
        }
        eVar.f5364a = null;
        this.f5367b = null;
        f5365d.remove(this);
    }

    @Override // pg.s
    public final void onMethodCall(r rVar, t tVar) {
        List list = (List) rVar.f19113b;
        String str = rVar.f19112a;
        str.getClass();
        if (!str.equals("setConfiguration")) {
            if (str.equals("getConfiguration")) {
                tVar.success(c);
                return;
            } else {
                tVar.notImplemented();
                return;
            }
        }
        c = (Map) list.get(0);
        tVar.success(null);
        Object[] objArr = {c};
        Iterator it = f5365d.iterator();
        while (it.hasNext()) {
            ((f) it.next()).f5366a.a("onConfigurationChanged", new ArrayList(Arrays.asList(objArr)), null);
        }
    }
}
