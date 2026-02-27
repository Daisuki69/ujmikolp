package io.flutter.plugins.webviewflutter;

import androidx.annotation.NonNull;
import androidx.webkit.WebViewFeature;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewFeatureProxyApi extends PigeonApiWebViewFeature {
    public WebViewFeatureProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewFeature
    public boolean isFeatureSupported(@NonNull String str) {
        return WebViewFeature.isFeatureSupported(str);
    }
}
