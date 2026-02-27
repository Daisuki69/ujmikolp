package io.flutter.plugins.webviewflutter;

import E8.RunnableC0218a;
import E8.RunnableC0219b;
import E8.RunnableC0220c;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import bj.C1037h;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewClientProxyApi extends PigeonApiWebViewClient {
    public WebViewClientProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    @NonNull
    public WebViewClient pigeon_defaultConstructor() {
        return getPigeonRegistrar().sdkIsAtLeast(24) ? new WebViewClientImpl(this) : new WebViewClientCompatImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    public void setSynchronousReturnValueForShouldOverrideUrlLoading(@NonNull WebViewClient webViewClient, boolean z4) {
        if (webViewClient instanceof WebViewClientCompatImpl) {
            ((WebViewClientCompatImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(z4);
        } else {
            if (!getPigeonRegistrar().sdkIsAtLeast(24) || !(webViewClient instanceof WebViewClientImpl)) {
                throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
            }
            ((WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(z4);
        }
    }

    public static class WebViewClientCompatImpl extends WebViewClientCompat {
        private final WebViewClientProxyApi api;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientCompatImpl(@NonNull WebViewClientProxyApi webViewClientProxyApi) {
            this.api = webViewClientProxyApi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$doUpdateVisitedHistory$14(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doUpdateVisitedHistory$15(WebView webView, String str, boolean z4) {
            this.api.doUpdateVisitedHistory(this, webView, str, z4, new C1640f(20));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onFormResubmission$18(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFormResubmission$19(WebView webView, Message message, Message message2) {
            this.api.onFormResubmission(this, webView, message, message2, new C1640f(24));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onLoadResource$20(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadResource$21(WebView webView, String str) {
            this.api.onLoadResource(this, webView, str, new C1640f(21));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPageCommitVisible$22(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageCommitVisible$23(WebView webView, String str) {
            this.api.onPageCommitVisible(this, webView, str, new C1640f(22));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPageFinished$2(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageFinished$3(WebView webView, String str) {
            this.api.onPageFinished(this, webView, str, new C1640f(14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPageStarted$0(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageStarted$1(WebView webView, String str) {
            this.api.onPageStarted(this, webView, str, new C1640f(18));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedClientCertRequest$24(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedClientCertRequest$25(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.onReceivedClientCertRequest(this, webView, clientCertRequest, new C1640f(17));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedError$6(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedError$7(WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorCompat webResourceErrorCompat) {
            this.api.onReceivedRequestErrorCompat(this, webView, webResourceRequest, webResourceErrorCompat, new C1640f(26));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedError$8(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedError$9(WebView webView, int i, String str, String str2) {
            this.api.onReceivedError(this, webView, i, str, str2, new C1640f(11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedHttpAuthRequest$16(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpAuthRequest$17(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new C1640f(25));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedHttpError$4(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpError$5(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new C1640f(16));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedLoginRequest$26(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedLoginRequest$27(WebView webView, String str, String str2, String str3) {
            this.api.onReceivedLoginRequest(this, webView, str, str2, str3, new C1640f(19));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedSslError$28(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedSslError$29(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.onReceivedSslError(this, webView, sslErrorHandler, sslError, new C1640f(15));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onScaleChanged$30(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onScaleChanged$31(WebView webView, float f, float f3) {
            this.api.onScaleChanged(this, webView, f, f3, new C1640f(12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$10(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shouldOverrideUrlLoading$11(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.requestLoading(this, webView, webResourceRequest, new C1640f(13));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$12(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shouldOverrideUrlLoading$13(WebView webView, String str) {
            this.api.urlLoading(this, webView, str, new C1640f(23));
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(@NonNull WebView webView, @NonNull String str, boolean z4) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0220c(3, this, webView, str, z4));
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(@NonNull WebView webView, @NonNull Message message, @NonNull Message message2) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0219b(this, webView, message, message2, 11));
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new F(this, webView, str, 3));
        }

        @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new F(this, webView, str, 2));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new F(this, webView, str, 4));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NonNull WebView webView, @NonNull String str, @NonNull Bitmap bitmap) {
            this.api.getPigeonRegistrar().runOnMainThread(new F(this, webView, str, 0));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(@NonNull WebView webView, @NonNull ClientCertRequest clientCertRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new androidx.work.impl.b(14, this, webView, clientCertRequest));
        }

        @Override // androidx.webkit.WebViewClientCompat
        public void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceErrorCompat webResourceErrorCompat) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0219b(this, webView, webResourceRequest, webResourceErrorCompat, 13));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(@NonNull WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0218a(this, webView, httpAuthHandler, str, str2, 6));
        }

        @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0219b(this, webView, webResourceRequest, webResourceResponse, 14));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(@NonNull WebView webView, @NonNull String str, @Nullable String str2, @NonNull String str3) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0218a(this, webView, str, str2, str3, 7));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NonNull WebView webView, @NonNull SslErrorHandler sslErrorHandler, @NonNull SslError sslError) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0219b(this, webView, sslErrorHandler, sslError, 12));
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(@NonNull WebView webView, float f, float f3) {
            this.api.getPigeonRegistrar().runOnMainThread(new E(this, webView, f, f3, 0));
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(@NonNull WebView webView, @NonNull KeyEvent keyEvent) {
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z4) {
            this.returnValueForShouldOverrideUrlLoading = z4;
        }

        @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new androidx.work.impl.b(15, this, webView, webResourceRequest));
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull WebView webView, int i, @NonNull String str, @NonNull String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new C7.d(this, webView, i, str, str2, 3));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new F(this, webView, str, 1));
            return this.returnValueForShouldOverrideUrlLoading;
        }
    }

    @RequiresApi(24)
    public static class WebViewClientImpl extends WebViewClient {
        private final WebViewClientProxyApi api;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientImpl(@NonNull WebViewClientProxyApi webViewClientProxyApi) {
            this.api = webViewClientProxyApi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$doUpdateVisitedHistory$14(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doUpdateVisitedHistory$15(WebView webView, String str, boolean z4) {
            this.api.doUpdateVisitedHistory(this, webView, str, z4, new H(1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onFormResubmission$18(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFormResubmission$19(WebView webView, Message message, Message message2) {
            this.api.onFormResubmission(this, webView, message, message2, new H(0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onLoadResource$20(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadResource$21(WebView webView, String str) {
            this.api.onLoadResource(this, webView, str, new C1640f(29));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPageCommitVisible$22(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageCommitVisible$23(WebView webView, String str) {
            this.api.onPageCommitVisible(this, webView, str, new C1640f(27));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPageFinished$2(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageFinished$3(WebView webView, String str) {
            this.api.onPageFinished(this, webView, str, new H(12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPageStarted$0(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageStarted$1(WebView webView, String str) {
            this.api.onPageStarted(this, webView, str, new H(2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedClientCertRequest$24(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedClientCertRequest$25(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.onReceivedClientCertRequest(this, webView, clientCertRequest, new H(9));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedError$6(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedError$7(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.api.onReceivedRequestError(this, webView, webResourceRequest, webResourceError, new H(3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedError$8(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedError$9(WebView webView, int i, String str, String str2) {
            this.api.onReceivedError(this, webView, i, str, str2, new C1640f(28));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedHttpAuthRequest$16(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpAuthRequest$17(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new H(8));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedHttpError$4(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpError$5(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new H(10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedLoginRequest$26(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedLoginRequest$27(WebView webView, String str, String str2, String str3) {
            this.api.onReceivedLoginRequest(this, webView, str, str2, str3, new H(6));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedSslError$28(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedSslError$29(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.onReceivedSslError(this, webView, sslErrorHandler, sslError, new H(4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onScaleChanged$30(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onScaleChanged$31(WebView webView, float f, float f3) {
            this.api.onScaleChanged(this, webView, f, f3, new H(11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$10(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shouldOverrideUrlLoading$11(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.requestLoading(this, webView, webResourceRequest, new H(7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$12(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shouldOverrideUrlLoading$13(WebView webView, String str) {
            this.api.urlLoading(this, webView, str, new H(5));
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(@NonNull WebView webView, @NonNull String str, boolean z4) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0220c(4, this, webView, str, z4));
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(@NonNull WebView webView, @NonNull Message message, @NonNull Message message2) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0219b(this, webView, message, message2, 15));
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new G(this, webView, str, 4));
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new G(this, webView, str, 1));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new G(this, webView, str, 0));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NonNull WebView webView, @NonNull String str, @NonNull Bitmap bitmap) {
            this.api.getPigeonRegistrar().runOnMainThread(new G(this, webView, str, 2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(@NonNull WebView webView, @NonNull ClientCertRequest clientCertRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new androidx.work.impl.b(17, this, webView, clientCertRequest));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceError webResourceError) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0219b(this, webView, webResourceRequest, webResourceError, 17));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(@NonNull WebView webView, @NonNull HttpAuthHandler httpAuthHandler, @NonNull String str, @NonNull String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0218a(this, webView, httpAuthHandler, str, str2, 9));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0219b(this, webView, webResourceRequest, webResourceResponse, 18));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(@NonNull WebView webView, @NonNull String str, @Nullable String str2, @NonNull String str3) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0218a(this, webView, str, str2, str3, 8));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NonNull WebView webView, @NonNull SslErrorHandler sslErrorHandler, @NonNull SslError sslError) {
            this.api.getPigeonRegistrar().runOnMainThread(new RunnableC0219b(this, webView, sslErrorHandler, sslError, 16));
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(@NonNull WebView webView, float f, float f3) {
            this.api.getPigeonRegistrar().runOnMainThread(new E(this, webView, f, f3, 1));
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(@NonNull WebView webView, @NonNull KeyEvent keyEvent) {
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z4) {
            this.returnValueForShouldOverrideUrlLoading = z4;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new androidx.work.impl.b(16, this, webView, webResourceRequest));
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull WebView webView, int i, @NonNull String str, @NonNull String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new C7.d(this, webView, i, str, str2, 4));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new G(this, webView, str, 3));
            return this.returnValueForShouldOverrideUrlLoading;
        }
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
