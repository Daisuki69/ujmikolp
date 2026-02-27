package io.flutter.plugins.webviewflutter;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import bj.C1037h;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class JavaScriptChannel {
    private final JavaScriptChannelProxyApi api;
    final String javaScriptChannelName;

    public JavaScriptChannel(@NonNull String str, @NonNull JavaScriptChannelProxyApi javaScriptChannelProxyApi) {
        this.javaScriptChannelName = str;
        this.api = javaScriptChannelProxyApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$postMessage$0(C1037h c1037h) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postMessage$1(String str) {
        this.api.postMessage(this, str, new C1640f(3));
    }

    @JavascriptInterface
    public void postMessage(@NonNull String str) {
        this.api.getPigeonRegistrar().runOnMainThread(new io.flutter.plugins.firebase.core.a(this, str, 2));
    }
}
