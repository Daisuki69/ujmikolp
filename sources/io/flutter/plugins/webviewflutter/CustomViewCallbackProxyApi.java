package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class CustomViewCallbackProxyApi extends PigeonApiCustomViewCallback {
    public CustomViewCallbackProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCustomViewCallback
    public void onCustomViewHidden(@NonNull WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
