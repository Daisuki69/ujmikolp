package io.flutter.plugins.webviewflutter;

import bj.C1037h;
import io.flutter.plugins.webviewflutter.DownloadListenerProxyApi;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1640f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17357a;

    public /* synthetic */ C1640f(int i) {
        this.f17357a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1037h c1037h = (C1037h) obj;
        switch (this.f17357a) {
            case 0:
                return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$17(c1037h);
            case 1:
                return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$18(c1037h);
            case 2:
                return DownloadListenerProxyApi.DownloadListenerImpl.lambda$onDownloadStart$0(c1037h);
            case 3:
                return JavaScriptChannel.lambda$postMessage$0(c1037h);
            case 4:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onGeolocationPermissionsHidePrompt$4(c1037h);
            case 5:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onConsoleMessage$7(c1037h);
            case 6:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onShowCustomView$1(c1037h);
            case 7:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onGeolocationPermissionsShowPrompt$3(c1037h);
            case 8:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onProgressChanged$0(c1037h);
            case 9:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onPermissionRequest$6(c1037h);
            case 10:
                return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onHideCustomView$2(c1037h);
            case 11:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedError$8(c1037h);
            case 12:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onScaleChanged$30(c1037h);
            case 13:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$shouldOverrideUrlLoading$10(c1037h);
            case 14:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onPageFinished$2(c1037h);
            case 15:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedSslError$28(c1037h);
            case 16:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedHttpError$4(c1037h);
            case 17:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedClientCertRequest$24(c1037h);
            case 18:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onPageStarted$0(c1037h);
            case 19:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedLoginRequest$26(c1037h);
            case 20:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$doUpdateVisitedHistory$14(c1037h);
            case 21:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onLoadResource$20(c1037h);
            case 22:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onPageCommitVisible$22(c1037h);
            case 23:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$shouldOverrideUrlLoading$12(c1037h);
            case 24:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onFormResubmission$18(c1037h);
            case 25:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedHttpAuthRequest$16(c1037h);
            case 26:
                return WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedError$6(c1037h);
            case 27:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onPageCommitVisible$22(c1037h);
            case 28:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedError$8(c1037h);
            default:
                return WebViewClientProxyApi.WebViewClientImpl.lambda$onLoadResource$20(c1037h);
        }
    }
}
