package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f17340b;
    public final /* synthetic */ WebView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17341d;

    public /* synthetic */ F(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, String str, int i) {
        this.f17339a = i;
        this.f17340b = webViewClientCompatImpl;
        this.c = webView;
        this.f17341d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17339a) {
            case 0:
                this.f17340b.lambda$onPageStarted$1(this.c, this.f17341d);
                break;
            case 1:
                this.f17340b.lambda$shouldOverrideUrlLoading$13(this.c, this.f17341d);
                break;
            case 2:
                this.f17340b.lambda$onPageCommitVisible$23(this.c, this.f17341d);
                break;
            case 3:
                this.f17340b.lambda$onLoadResource$21(this.c, this.f17341d);
                break;
            default:
                this.f17340b.lambda$onPageFinished$3(this.c, this.f17341d);
                break;
        }
    }
}
