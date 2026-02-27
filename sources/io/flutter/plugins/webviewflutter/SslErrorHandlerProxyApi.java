package io.flutter.plugins.webviewflutter;

import android.webkit.SslErrorHandler;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
class SslErrorHandlerProxyApi extends PigeonApiSslErrorHandler {
    public SslErrorHandlerProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslErrorHandler
    public void cancel(@NonNull SslErrorHandler sslErrorHandler) {
        sslErrorHandler.cancel();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiSslErrorHandler
    public void proceed(@NonNull SslErrorHandler sslErrorHandler) {
        sslErrorHandler.proceed();
    }
}
