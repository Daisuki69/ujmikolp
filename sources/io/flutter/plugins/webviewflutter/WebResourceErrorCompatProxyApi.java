package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.webkit.WebResourceErrorCompat;

/* JADX INFO: loaded from: classes4.dex */
public class WebResourceErrorCompatProxyApi extends PigeonApiWebResourceErrorCompat {
    public WebResourceErrorCompatProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceErrorCompat
    @NonNull
    @SuppressLint({"RequiresFeature"})
    public String description(@NonNull WebResourceErrorCompat webResourceErrorCompat) {
        return webResourceErrorCompat.getDescription().toString();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebResourceErrorCompat
    @SuppressLint({"RequiresFeature"})
    public long errorCode(@NonNull WebResourceErrorCompat webResourceErrorCompat) {
        return webResourceErrorCompat.getErrorCode();
    }
}
