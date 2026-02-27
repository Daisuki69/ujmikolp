package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f17337b;
    public final /* synthetic */ float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f17338d;
    public final /* synthetic */ WebViewClient e;

    public /* synthetic */ E(WebViewClient webViewClient, WebView webView, float f, float f3, int i) {
        this.f17336a = i;
        this.e = webViewClient;
        this.f17337b = webView;
        this.c = f;
        this.f17338d = f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17336a) {
            case 0:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.e).lambda$onScaleChanged$31(this.f17337b, this.c, this.f17338d);
                break;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) this.e).lambda$onScaleChanged$31(this.f17337b, this.c, this.f17338d);
                break;
        }
    }
}
