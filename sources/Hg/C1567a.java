package hg;

import android.content.Context;
import e2.C1421c;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import pg.u;

/* JADX INFO: renamed from: hg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1567a implements FlutterPlugin, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ci.b f17040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f17041b;
    public u c;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        j.g(binding, "binding");
        b bVar = this.f17041b;
        if (bVar == null) {
            j.n("manager");
            throw null;
        }
        binding.addActivityResultListener(bVar);
        Ci.b bVar2 = this.f17040a;
        if (bVar2 != null) {
            bVar2.c = binding.getActivity();
        } else {
            j.n("share");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        this.c = new u(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
        j.f(binding.getApplicationContext(), "getApplicationContext(...)");
        b bVar = new b();
        bVar.f17043b = new AtomicBoolean(true);
        this.f17041b = bVar;
        Context applicationContext = binding.getApplicationContext();
        j.f(applicationContext, "getApplicationContext(...)");
        b bVar2 = this.f17041b;
        if (bVar2 == null) {
            j.n("manager");
            throw null;
        }
        Ci.b bVar3 = new Ci.b(applicationContext, bVar2);
        this.f17040a = bVar3;
        b bVar4 = this.f17041b;
        if (bVar4 == null) {
            j.n("manager");
            throw null;
        }
        C1421c c1421c = new C1421c(bVar3, bVar4);
        u uVar = this.c;
        if (uVar != null) {
            uVar.b(c1421c);
        } else {
            j.n("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        Ci.b bVar = this.f17040a;
        if (bVar != null) {
            bVar.c = null;
        } else {
            j.n("share");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        u uVar = this.c;
        if (uVar != null) {
            uVar.b(null);
        } else {
            j.n("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        j.g(binding, "binding");
        onAttachedToActivity(binding);
    }
}
