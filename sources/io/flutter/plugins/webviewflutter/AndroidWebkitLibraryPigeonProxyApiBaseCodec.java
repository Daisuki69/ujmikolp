package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import bj.C1037h;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
final class AndroidWebkitLibraryPigeonProxyApiBaseCodec extends AndroidWebkitLibraryPigeonCodec {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar registrar;

    public AndroidWebkitLibraryPigeonProxyApiBaseCodec(AndroidWebkitLibraryPigeonProxyApiRegistrar registrar) {
        kotlin.jvm.internal.j.g(registrar, "registrar");
        this.registrar = registrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$0(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$1(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$10(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$11(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$12(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$13(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$14(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$15(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$16(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$17(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$18(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$19(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$2(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$20(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$21(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$22(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$23(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$24(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$25(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$26(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$27(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$28(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$29(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$3(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$30(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$31(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$4(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$5(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$6(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$7(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$8(C1037h c1037h) {
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$9(C1037h c1037h) {
        return Unit.f18162a;
    }

    public final AndroidWebkitLibraryPigeonProxyApiRegistrar getRegistrar() {
        return this.registrar;
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, pg.C2037D
    public Object readValueOfType(byte b8, ByteBuffer buffer) {
        kotlin.jvm.internal.j.g(buffer, "buffer");
        if (b8 != -128) {
            return super.readValueOfType(b8, buffer);
        }
        Object value = readValue(buffer);
        kotlin.jvm.internal.j.e(value, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) value).longValue();
        Object androidWebkitLibraryPigeonInstanceManager = this.registrar.getInstanceManager().getInstance(jLongValue);
        if (androidWebkitLibraryPigeonInstanceManager == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return androidWebkitLibraryPigeonInstanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, pg.C2037D
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.j.g(stream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof FileChooserMode) || (obj instanceof ConsoleMessageLevel) || (obj instanceof OverScrollMode) || (obj instanceof SslErrorType) || (obj instanceof MixedContentMode) || obj == null) {
            super.writeValue(stream, obj);
            return;
        }
        if (obj instanceof WebResourceRequest) {
            final int i = 0;
            this.registrar.getPigeonApiWebResourceRequest().pigeon_newInstance((WebResourceRequest) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebResourceResponse) {
            final int i4 = 2;
            this.registrar.getPigeonApiWebResourceResponse().pigeon_newInstance((WebResourceResponse) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i4) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebResourceError) {
            final int i6 = 14;
            this.registrar.getPigeonApiWebResourceError().pigeon_newInstance((WebResourceError) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i6) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebResourceErrorCompat) {
            final int i10 = 17;
            this.registrar.getPigeonApiWebResourceErrorCompat().pigeon_newInstance((WebResourceErrorCompat) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i10) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebViewPoint) {
            final int i11 = 18;
            this.registrar.getPigeonApiWebViewPoint().pigeon_newInstance((WebViewPoint) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i11) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof ConsoleMessage) {
            final int i12 = 19;
            this.registrar.getPigeonApiConsoleMessage().pigeon_newInstance((ConsoleMessage) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i12) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof CookieManager) {
            final int i13 = 20;
            this.registrar.getPigeonApiCookieManager().pigeon_newInstance((CookieManager) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i13) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebView) {
            final int i14 = 21;
            this.registrar.getPigeonApiWebView().pigeon_newInstance((WebView) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i14) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebSettings) {
            final int i15 = 23;
            this.registrar.getPigeonApiWebSettings().pigeon_newInstance((WebSettings) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i15) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof JavaScriptChannel) {
            final int i16 = 24;
            this.registrar.getPigeonApiJavaScriptChannel().pigeon_newInstance((JavaScriptChannel) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i16) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebViewClient) {
            final int i17 = 11;
            this.registrar.getPigeonApiWebViewClient().pigeon_newInstance((WebViewClient) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i17) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof DownloadListener) {
            final int i18 = 22;
            this.registrar.getPigeonApiDownloadListener().pigeon_newInstance((DownloadListener) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i18) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebChromeClientProxyApi.WebChromeClientImpl) {
            final int i19 = 25;
            this.registrar.getPigeonApiWebChromeClient().pigeon_newInstance((WebChromeClientProxyApi.WebChromeClientImpl) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i19) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof FlutterAssetManager) {
            final int i20 = 26;
            this.registrar.getPigeonApiFlutterAssetManager().pigeon_newInstance((FlutterAssetManager) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i20) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebStorage) {
            final int i21 = 27;
            this.registrar.getPigeonApiWebStorage().pigeon_newInstance((WebStorage) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i21) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            final int i22 = 28;
            this.registrar.getPigeonApiFileChooserParams().pigeon_newInstance((WebChromeClient.FileChooserParams) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i22) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof PermissionRequest) {
            final int i23 = 29;
            this.registrar.getPigeonApiPermissionRequest().pigeon_newInstance((PermissionRequest) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i23) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            this.registrar.getPigeonApiCustomViewCallback().pigeon_newInstance((WebChromeClient.CustomViewCallback) obj, new C1640f(0));
        } else if (obj instanceof View) {
            this.registrar.getPigeonApiView().pigeon_newInstance((View) obj, new C1640f(1));
        } else if (obj instanceof GeolocationPermissions.Callback) {
            final int i24 = 1;
            this.registrar.getPigeonApiGeolocationPermissionsCallback().pigeon_newInstance((GeolocationPermissions.Callback) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i24) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof HttpAuthHandler) {
            final int i25 = 3;
            this.registrar.getPigeonApiHttpAuthHandler().pigeon_newInstance((HttpAuthHandler) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i25) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof Message) {
            final int i26 = 4;
            this.registrar.getPigeonApiAndroidMessage().pigeon_newInstance((Message) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i26) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof ClientCertRequest) {
            final int i27 = 5;
            this.registrar.getPigeonApiClientCertRequest().pigeon_newInstance((ClientCertRequest) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i27) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof PrivateKey) {
            final int i28 = 6;
            this.registrar.getPigeonApiPrivateKey().pigeon_newInstance((PrivateKey) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i28) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof X509Certificate) {
            final int i29 = 7;
            this.registrar.getPigeonApiX509Certificate().pigeon_newInstance((X509Certificate) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i29) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof SslErrorHandler) {
            final int i30 = 8;
            this.registrar.getPigeonApiSslErrorHandler().pigeon_newInstance((SslErrorHandler) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i30) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof SslError) {
            final int i31 = 9;
            this.registrar.getPigeonApiSslError().pigeon_newInstance((SslError) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i31) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof SslCertificate.DName) {
            final int i32 = 10;
            this.registrar.getPigeonApiSslCertificateDName().pigeon_newInstance((SslCertificate.DName) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i32) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof SslCertificate) {
            final int i33 = 12;
            this.registrar.getPigeonApiSslCertificate().pigeon_newInstance((SslCertificate) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i33) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof Certificate) {
            final int i34 = 13;
            this.registrar.getPigeonApiCertificate().pigeon_newInstance((Certificate) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i34) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebSettingsCompat) {
            final int i35 = 15;
            this.registrar.getPigeonApiWebSettingsCompat().pigeon_newInstance((WebSettingsCompat) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i35) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        } else if (obj instanceof WebViewFeature) {
            final int i36 = 16;
            this.registrar.getPigeonApiWebViewFeature().pigeon_newInstance((WebViewFeature) obj, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C1037h c1037h = (C1037h) obj2;
                    switch (i36) {
                        case 0:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(c1037h);
                        case 1:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(c1037h);
                        case 2:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(c1037h);
                        case 3:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(c1037h);
                        case 4:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(c1037h);
                        case 5:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(c1037h);
                        case 6:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(c1037h);
                        case 7:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(c1037h);
                        case 8:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(c1037h);
                        case 9:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(c1037h);
                        case 10:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(c1037h);
                        case 11:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(c1037h);
                        case 12:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(c1037h);
                        case 13:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(c1037h);
                        case 14:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(c1037h);
                        case 15:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(c1037h);
                        case 16:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(c1037h);
                        case 17:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(c1037h);
                        case 18:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(c1037h);
                        case 19:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(c1037h);
                        case 20:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(c1037h);
                        case 21:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(c1037h);
                        case 22:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(c1037h);
                        case 23:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(c1037h);
                        case 24:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(c1037h);
                        case 25:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(c1037h);
                        case 26:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(c1037h);
                        case 27:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(c1037h);
                        case 28:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(c1037h);
                        default:
                            return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(c1037h);
                    }
                }
            });
        }
        if (this.registrar.getInstanceManager().containsInstance(obj)) {
            stream.write(128);
            writeValue(stream, this.registrar.getInstanceManager().getIdentifierForStrongReference(obj));
            return;
        }
        throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
    }
}
