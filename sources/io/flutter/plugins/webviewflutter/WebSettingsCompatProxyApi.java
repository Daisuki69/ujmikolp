package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.webkit.WebSettingsCompat;

/* JADX INFO: loaded from: classes4.dex */
public class WebSettingsCompatProxyApi extends PigeonApiWebSettingsCompat {
    public WebSettingsCompatProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettingsCompat
    @SuppressLint({"RequiresFeature"})
    public void setPaymentRequestEnabled(@NonNull WebSettings webSettings, boolean z4) {
        WebSettingsCompat.setPaymentRequestEnabled(webSettings, z4);
    }
}
