package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class WebResourceResponseProxyApi extends PigeonApiWebResourceResponse {
    public WebResourceResponseProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceResponse
    public long statusCode(@NonNull WebResourceResponse webResourceResponse) {
        return webResourceResponse.getStatusCode();
    }
}
