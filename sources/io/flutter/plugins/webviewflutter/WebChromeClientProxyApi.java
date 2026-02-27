package io.flutter.plugins.webviewflutter;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import bj.C1037h;
import dOYHB6.lN8Dz0.wGEE15;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class WebChromeClientProxyApi extends PigeonApiWebChromeClient {

    public static class SecureWebChromeClient extends WebChromeClient {

        @Nullable
        WebViewClient webViewClient;

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(@NonNull WebView webView, boolean z4, boolean z5, @NonNull Message message) {
            return onCreateWindow(webView, message, new wGEE15(webView.getContext()));
        }

        public void setWebViewClient(@NonNull WebViewClient webViewClient) {
            this.webViewClient = webViewClient;
        }

        @VisibleForTesting
        public boolean onCreateWindow(@NonNull final WebView webView, @NonNull Message message, @Nullable WebView webView2) {
            if (this.webViewClient == null) {
                return false;
            }
            WebViewClient webViewClient = new WebViewClient() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.SecureWebChromeClient.1
                @Override // android.webkit.WebViewClient
                @RequiresApi(api = 24)
                public boolean shouldOverrideUrlLoading(@NonNull WebView webView3, @NonNull WebResourceRequest webResourceRequest) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView3, String str) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, str)) {
                        return true;
                    }
                    webView.loadUrl(str);
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new wGEE15(webView.getContext());
            }
            webView2.setWebViewClient(webViewClient);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static class WebChromeClientImpl extends SecureWebChromeClient {
        private static final String TAG = "WebChromeClientImpl";
        private final WebChromeClientProxyApi api;
        private boolean returnValueForOnShowFileChooser = false;
        private boolean returnValueForOnConsoleMessage = false;
        private boolean returnValueForOnJsAlert = false;
        private boolean returnValueForOnJsConfirm = false;
        private boolean returnValueForOnJsPrompt = false;

        public WebChromeClientImpl(@NonNull WebChromeClientProxyApi webChromeClientProxyApi) {
            this.api = webChromeClientProxyApi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onConsoleMessage$7(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onGeolocationPermissionsHidePrompt$4(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onGeolocationPermissionsShowPrompt$3(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onHideCustomView$2(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$onJsAlert$8(JsResult jsResult, ResultCompat resultCompat) {
            if (!resultCompat.isFailure()) {
                jsResult.confirm();
                return null;
            }
            ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
            Throwable thExceptionOrNull = resultCompat.exceptionOrNull();
            Objects.requireNonNull(thExceptionOrNull);
            pigeonRegistrar.logError(TAG, thExceptionOrNull);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$onJsConfirm$9(JsResult jsResult, ResultCompat resultCompat) {
            if (!resultCompat.isFailure()) {
                if (Boolean.TRUE.equals(resultCompat.getOrNull())) {
                    jsResult.confirm();
                } else {
                    jsResult.cancel();
                }
                return null;
            }
            ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
            Throwable thExceptionOrNull = resultCompat.exceptionOrNull();
            Objects.requireNonNull(thExceptionOrNull);
            pigeonRegistrar.logError(TAG, thExceptionOrNull);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$onJsPrompt$10(JsPromptResult jsPromptResult, ResultCompat resultCompat) {
            if (resultCompat.isFailure()) {
                ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
                Throwable thExceptionOrNull = resultCompat.exceptionOrNull();
                Objects.requireNonNull(thExceptionOrNull);
                pigeonRegistrar.logError(TAG, thExceptionOrNull);
                return null;
            }
            String str = (String) resultCompat.getOrNull();
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPermissionRequest$6(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onProgressChanged$0(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onShowCustomView$1(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$onShowFileChooser$5(boolean z4, ValueCallback valueCallback, ResultCompat resultCompat) {
            if (resultCompat.isFailure()) {
                ProxyApiRegistrar pigeonRegistrar = this.api.getPigeonRegistrar();
                Throwable thExceptionOrNull = resultCompat.exceptionOrNull();
                Objects.requireNonNull(thExceptionOrNull);
                pigeonRegistrar.logError(TAG, thExceptionOrNull);
                return null;
            }
            List list = (List) resultCompat.getOrNull();
            Objects.requireNonNull(list);
            List list2 = list;
            if (z4) {
                Uri[] uriArr = new Uri[list2.size()];
                for (int i = 0; i < list2.size(); i++) {
                    uriArr[i] = Uri.parse((String) list2.get(i));
                }
                valueCallback.onReceiveValue(uriArr);
            }
            return null;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.api.onConsoleMessage(this, consoleMessage, new C1640f(5));
            return this.returnValueForOnConsoleMessage;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            this.api.onGeolocationPermissionsHidePrompt(this, new C1640f(4));
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(@NonNull String str, @NonNull GeolocationPermissions.Callback callback) {
            this.api.onGeolocationPermissionsShowPrompt(this, str, callback, new C1640f(7));
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.api.onHideCustomView(this, new C1640f(10));
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.returnValueForOnJsAlert) {
                return false;
            }
            this.api.onJsAlert(this, webView, str, str2, ResultCompat.asCompatCallback(new C(this, jsResult, 1)));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.returnValueForOnJsConfirm) {
                return false;
            }
            this.api.onJsConfirm(this, webView, str, str2, ResultCompat.asCompatCallback(new C(this, jsResult, 0)));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!this.returnValueForOnJsPrompt) {
                return false;
            }
            this.api.onJsPrompt(this, webView, str, str2, str3, ResultCompat.asCompatCallback(new C7.f(22, this, jsPromptResult)));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(@NonNull PermissionRequest permissionRequest) {
            this.api.onPermissionRequest(this, permissionRequest, new C1640f(9));
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@NonNull WebView webView, int i) {
            this.api.onProgressChanged(this, webView, i, new C1640f(8));
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.api.onShowCustomView(this, view, customViewCallback, new C1640f(6));
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(@NonNull WebView webView, @NonNull final ValueCallback<Uri[]> valueCallback, @NonNull WebChromeClient.FileChooserParams fileChooserParams) {
            final boolean z4 = this.returnValueForOnShowFileChooser;
            this.api.onShowFileChooser(this, webView, fileChooserParams, ResultCompat.asCompatCallback(new Function1() { // from class: io.flutter.plugins.webviewflutter.D
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f17334a.lambda$onShowFileChooser$5(z4, valueCallback, (ResultCompat) obj);
                }
            }));
            return z4;
        }

        public void setReturnValueForOnConsoleMessage(boolean z4) {
            this.returnValueForOnConsoleMessage = z4;
        }

        public void setReturnValueForOnJsAlert(boolean z4) {
            this.returnValueForOnJsAlert = z4;
        }

        public void setReturnValueForOnJsConfirm(boolean z4) {
            this.returnValueForOnJsConfirm = z4;
        }

        public void setReturnValueForOnJsPrompt(boolean z4) {
            this.returnValueForOnJsPrompt = z4;
        }

        public void setReturnValueForOnShowFileChooser(boolean z4) {
            this.returnValueForOnShowFileChooser = z4;
        }
    }

    public WebChromeClientProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    @NonNull
    public WebChromeClientImpl pigeon_defaultConstructor() {
        return new WebChromeClientImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnConsoleMessage(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z4) {
        webChromeClientImpl.setReturnValueForOnConsoleMessage(z4);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsAlert(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z4) {
        webChromeClientImpl.setReturnValueForOnJsAlert(z4);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsConfirm(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z4) {
        webChromeClientImpl.setReturnValueForOnJsConfirm(z4);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsPrompt(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z4) {
        webChromeClientImpl.setReturnValueForOnJsPrompt(z4);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnShowFileChooser(@NonNull WebChromeClientImpl webChromeClientImpl, boolean z4) {
        webChromeClientImpl.setReturnValueForOnShowFileChooser(z4);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
