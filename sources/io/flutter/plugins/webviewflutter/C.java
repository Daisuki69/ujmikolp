package io.flutter.plugins.webviewflutter;

import android.webkit.JsResult;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebChromeClientProxyApi.WebChromeClientImpl f17333b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ C(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, JsResult jsResult, int i) {
        this.f17332a = i;
        this.f17333b = webChromeClientImpl;
        this.c = jsResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ResultCompat resultCompat = (ResultCompat) obj;
        switch (this.f17332a) {
            case 0:
                return this.f17333b.lambda$onJsConfirm$9(this.c, resultCompat);
            default:
                return this.f17333b.lambda$onJsAlert$8(this.c, resultCompat);
        }
    }
}
