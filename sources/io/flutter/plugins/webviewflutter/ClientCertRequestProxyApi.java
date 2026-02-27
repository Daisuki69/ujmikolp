package io.flutter.plugins.webviewflutter;

import android.webkit.ClientCertRequest;
import androidx.annotation.NonNull;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class ClientCertRequestProxyApi extends PigeonApiClientCertRequest {
    public ClientCertRequestProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest
    public void cancel(@NonNull ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest
    public void ignore(@NonNull ClientCertRequest clientCertRequest) {
        clientCertRequest.ignore();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest
    public void proceed(@NonNull ClientCertRequest clientCertRequest, @NonNull PrivateKey privateKey, @NonNull List<? extends X509Certificate> list) {
        clientCertRequest.proceed(privateKey, (X509Certificate[]) list.toArray(new X509Certificate[0]));
    }
}
