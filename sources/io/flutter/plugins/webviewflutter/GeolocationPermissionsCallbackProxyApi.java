package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class GeolocationPermissionsCallbackProxyApi extends PigeonApiGeolocationPermissionsCallback {
    public GeolocationPermissionsCallbackProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiGeolocationPermissionsCallback
    public void invoke(@NonNull GeolocationPermissions.Callback callback, @NonNull String str, boolean z4, boolean z5) {
        callback.invoke(str, z4, z5);
    }
}
