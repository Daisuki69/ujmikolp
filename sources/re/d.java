package Re;

import io.flutter.embedding.engine.FlutterEngine;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements FlutterEngine.EngineLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f5519a;

    public d(e eVar) {
        this.f5519a = eVar;
    }

    @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
    public final void onEngineWillDestroy() {
    }

    @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
    public final void onPreEngineRestart() {
        this.f5519a.f5521b.f();
    }
}
