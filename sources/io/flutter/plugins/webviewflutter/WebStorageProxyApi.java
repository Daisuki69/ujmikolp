package io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class WebStorageProxyApi extends PigeonApiWebStorage {
    public WebStorageProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebStorage
    public void deleteAllData(@NonNull WebStorage webStorage) {
        webStorage.deleteAllData();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebStorage
    @NonNull
    public WebStorage instance() {
        return WebStorage.getInstance();
    }
}
