package io.flutter.plugins.webviewflutter;

import android.util.Log;
import bj.C1037h;
import bj.C1038i;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManager;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidWebkitLibraryPigeonProxyApiRegistrar {
    private pg.q _codec;
    private final pg.j binaryMessenger;
    private boolean ignoreCallsToDart;
    private final AndroidWebkitLibraryPigeonInstanceManager instanceManager;

    /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar$1, reason: invalid class name */
    public static final class AnonymousClass1 implements AndroidWebkitLibraryPigeonInstanceManager.PigeonFinalizationListener {
        final /* synthetic */ AndroidWebkitLibraryPigeonInstanceManagerApi $api;

        public AnonymousClass1(AndroidWebkitLibraryPigeonInstanceManagerApi androidWebkitLibraryPigeonInstanceManagerApi) {
            this.$api = androidWebkitLibraryPigeonInstanceManagerApi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onFinalize$lambda$0(long j, C1037h c1037h) {
            if (c1037h.f9167a instanceof C1038i) {
                Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j);
            }
            return Unit.f18162a;
        }

        @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManager.PigeonFinalizationListener
        public void onFinalize(long j) {
            this.$api.removeStrongReference(j, new C1641g(j, 0));
        }
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar(pg.j binaryMessenger) {
        kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = AndroidWebkitLibraryPigeonInstanceManager.Companion.create(new AnonymousClass1(new AndroidWebkitLibraryPigeonInstanceManagerApi(binaryMessenger)));
    }

    public final pg.j getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public final pg.q getCodec() {
        if (this._codec == null) {
            this._codec = new AndroidWebkitLibraryPigeonProxyApiBaseCodec(this);
        }
        pg.q qVar = this._codec;
        kotlin.jvm.internal.j.d(qVar);
        return qVar;
    }

    public final boolean getIgnoreCallsToDart() {
        return this.ignoreCallsToDart;
    }

    public final AndroidWebkitLibraryPigeonInstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    public abstract PigeonApiAndroidMessage getPigeonApiAndroidMessage();

    public abstract PigeonApiCertificate getPigeonApiCertificate();

    public abstract PigeonApiClientCertRequest getPigeonApiClientCertRequest();

    public abstract PigeonApiConsoleMessage getPigeonApiConsoleMessage();

    public abstract PigeonApiCookieManager getPigeonApiCookieManager();

    public abstract PigeonApiCustomViewCallback getPigeonApiCustomViewCallback();

    public abstract PigeonApiDownloadListener getPigeonApiDownloadListener();

    public abstract PigeonApiFileChooserParams getPigeonApiFileChooserParams();

    public abstract PigeonApiFlutterAssetManager getPigeonApiFlutterAssetManager();

    public abstract PigeonApiGeolocationPermissionsCallback getPigeonApiGeolocationPermissionsCallback();

    public abstract PigeonApiHttpAuthHandler getPigeonApiHttpAuthHandler();

    public abstract PigeonApiJavaScriptChannel getPigeonApiJavaScriptChannel();

    public abstract PigeonApiPermissionRequest getPigeonApiPermissionRequest();

    public PigeonApiPrivateKey getPigeonApiPrivateKey() {
        return new PigeonApiPrivateKey(this);
    }

    public abstract PigeonApiSslCertificate getPigeonApiSslCertificate();

    public abstract PigeonApiSslCertificateDName getPigeonApiSslCertificateDName();

    public abstract PigeonApiSslError getPigeonApiSslError();

    public abstract PigeonApiSslErrorHandler getPigeonApiSslErrorHandler();

    public abstract PigeonApiView getPigeonApiView();

    public abstract PigeonApiWebChromeClient getPigeonApiWebChromeClient();

    public abstract PigeonApiWebResourceError getPigeonApiWebResourceError();

    public abstract PigeonApiWebResourceErrorCompat getPigeonApiWebResourceErrorCompat();

    public abstract PigeonApiWebResourceRequest getPigeonApiWebResourceRequest();

    public abstract PigeonApiWebResourceResponse getPigeonApiWebResourceResponse();

    public abstract PigeonApiWebSettings getPigeonApiWebSettings();

    public abstract PigeonApiWebSettingsCompat getPigeonApiWebSettingsCompat();

    public abstract PigeonApiWebStorage getPigeonApiWebStorage();

    public abstract PigeonApiWebView getPigeonApiWebView();

    public abstract PigeonApiWebViewClient getPigeonApiWebViewClient();

    public abstract PigeonApiWebViewFeature getPigeonApiWebViewFeature();

    public abstract PigeonApiWebViewPoint getPigeonApiWebViewPoint();

    public PigeonApiX509Certificate getPigeonApiX509Certificate() {
        return new PigeonApiX509Certificate(this);
    }

    public final void setIgnoreCallsToDart(boolean z4) {
        this.ignoreCallsToDart = z4;
    }

    public final void setUp() {
        AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers(this.binaryMessenger, this.instanceManager);
        PigeonApiCookieManager.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiCookieManager());
        PigeonApiWebView.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebView());
        PigeonApiWebSettings.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebSettings());
        PigeonApiJavaScriptChannel.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiJavaScriptChannel());
        PigeonApiWebViewClient.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebViewClient());
        PigeonApiDownloadListener.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiDownloadListener());
        PigeonApiWebChromeClient.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebChromeClient());
        PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiFlutterAssetManager());
        PigeonApiWebStorage.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebStorage());
        PigeonApiPermissionRequest.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiPermissionRequest());
        PigeonApiCustomViewCallback.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiCustomViewCallback());
        PigeonApiView.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiView());
        PigeonApiGeolocationPermissionsCallback.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiGeolocationPermissionsCallback());
        PigeonApiHttpAuthHandler.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiHttpAuthHandler());
        PigeonApiAndroidMessage.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiAndroidMessage());
        PigeonApiClientCertRequest.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiClientCertRequest());
        PigeonApiSslErrorHandler.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslErrorHandler());
        PigeonApiSslError.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslError());
        PigeonApiSslCertificateDName.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslCertificateDName());
        PigeonApiSslCertificate.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslCertificate());
        PigeonApiCertificate.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiCertificate());
        PigeonApiWebSettingsCompat.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebSettingsCompat());
        PigeonApiWebViewFeature.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebViewFeature());
    }

    public final void tearDown() {
        AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiCookieManager.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebView.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebSettings.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiJavaScriptChannel.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebViewClient.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiDownloadListener.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebChromeClient.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebStorage.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiPermissionRequest.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiCustomViewCallback.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiView.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiGeolocationPermissionsCallback.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiHttpAuthHandler.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiAndroidMessage.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiClientCertRequest.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiSslErrorHandler.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiSslError.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiSslCertificateDName.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiSslCertificate.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiCertificate.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebSettingsCompat.Companion.setUpMessageHandlers(this.binaryMessenger, null);
        PigeonApiWebViewFeature.Companion.setUpMessageHandlers(this.binaryMessenger, null);
    }
}
