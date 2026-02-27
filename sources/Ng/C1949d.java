package ng;

import com.google.firebase.messaging.p;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.platform.m;

/* JADX INFO: renamed from: ng.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1949d implements FlutterPlugin {
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        ((p) platformViewRegistry).x(numX49.tnTj78("bQ9P"), new C1948c(flutterPluginBinding.getBinaryMessenger()));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }
}
