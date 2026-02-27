package io.flutter.plugins.webviewflutter;

import bj.C1037h;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import io.flutter.plugins.webviewflutter.WebViewProxyApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17345a;

    public /* synthetic */ H(int i) {
        this.f17345a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1037h c1037h = (C1037h) obj;
        switch (this.f17345a) {
            case 0:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onFormResubmission$18(c1037h);
            case 1:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$doUpdateVisitedHistory$14(c1037h);
            case 2:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onPageStarted$0(c1037h);
            case 3:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedError$6(c1037h);
            case 4:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedSslError$28(c1037h);
            case 5:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$shouldOverrideUrlLoading$12(c1037h);
            case 6:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedLoginRequest$26(c1037h);
            case 7:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$shouldOverrideUrlLoading$10(c1037h);
            case 8:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedHttpAuthRequest$16(c1037h);
            case 9:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedClientCertRequest$24(c1037h);
            case 10:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedHttpError$4(c1037h);
            case 11:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onScaleChanged$30(c1037h);
            case 12:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onPageFinished$2(c1037h);
            default:
                return WebViewProxyApi.WebViewPlatformView.lambda$onScrollChanged$0(c1037h);
        }
    }
}
