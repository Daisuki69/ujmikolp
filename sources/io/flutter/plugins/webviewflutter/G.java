package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class G implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f17343b;
    public final /* synthetic */ WebView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17344d;

    public /* synthetic */ G(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, String str, int i) {
        this.f17342a = i;
        this.f17343b = webViewClientImpl;
        this.c = webView;
        this.f17344d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17342a) {
            case 0:
                this.f17343b.lambda$onPageFinished$3(this.c, this.f17344d);
                break;
            case 1:
                this.f17343b.lambda$onPageCommitVisible$23(this.c, this.f17344d);
                break;
            case 2:
                this.f17343b.lambda$onPageStarted$1(this.c, this.f17344d);
                break;
            case 3:
                this.f17343b.lambda$shouldOverrideUrlLoading$13(this.c, this.f17344d);
                break;
            default:
                this.f17343b.lambda$onLoadResource$21(this.c, this.f17344d);
                break;
        }
    }
}
