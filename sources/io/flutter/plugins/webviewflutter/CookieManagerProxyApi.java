package io.flutter.plugins.webviewflutter;

import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import bj.C1037h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class CookieManagerProxyApi extends PigeonApiCookieManager {
    public CookieManagerProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    @NonNull
    public CookieManager instance() {
        return CookieManager.getInstance();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    public void removeAllCookies(@NonNull CookieManager cookieManager, @NonNull Function1<? super C1037h<Boolean>, Unit> function1) {
        cookieManager.removeAllCookies(new C1642h(0, function1));
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    public void setAcceptThirdPartyCookies(@NonNull CookieManager cookieManager, @NonNull WebView webView, boolean z4) {
        cookieManager.setAcceptThirdPartyCookies(webView, z4);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    public void setCookie(@NonNull CookieManager cookieManager, @NonNull String str, @NonNull String str2) {
        cookieManager.setCookie(str, str2);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiCookieManager
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
