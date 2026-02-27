package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcessClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcessClient f8199b;
    public final /* synthetic */ WebView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcessImpl f8200d;

    public /* synthetic */ i(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcessImpl webViewRenderProcessImpl, int i) {
        this.f8198a = i;
        this.f8199b = webViewRenderProcessClient;
        this.c = webView;
        this.f8200d = webViewRenderProcessImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8198a) {
            case 0:
                this.f8199b.onRenderProcessResponsive(this.c, this.f8200d);
                break;
            default:
                this.f8199b.onRenderProcessUnresponsive(this.c, this.f8200d);
                break;
        }
    }
}
