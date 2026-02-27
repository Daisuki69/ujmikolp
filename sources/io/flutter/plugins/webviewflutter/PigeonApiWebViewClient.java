package io.flutter.plugins.webviewflutter;

import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import bj.AbstractC1039j;
import bj.C1037h;
import cj.C1132s;
import d4.AbstractC1331a;
import e2.C1421c;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewClient;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PigeonApiWebViewClient {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebViewClient pigeonApiWebViewClient, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebViewClient.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebViewClient.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebViewClient pigeonApiWebViewClient, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebViewClient");
            WebViewClient webViewClient = (WebViewClient) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading(webViewClient, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(pg.j binaryMessenger, final PigeonApiWebViewClient pigeonApiWebViewClient) {
            pg.q androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebViewClient == null || (pigeonRegistrar = pigeonApiWebViewClient.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            C2042e c2042e = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebViewClient != null) {
                final int i = 0;
                c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.A
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i) {
                            case 0:
                                PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebViewClient, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebViewClient, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e.b(null);
            }
            C2042e c2042e2 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebViewClient == null) {
                c2042e2.b(null);
            } else {
                final int i4 = 1;
                c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.A
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i4) {
                            case 0:
                                PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebViewClient, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebViewClient, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebViewClient(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        kotlin.jvm.internal.j.g(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doUpdateVisitedHistory$lambda$9(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFormResubmission$lambda$11(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLoadResource$lambda$12(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageCommitVisible$lambda$13(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageFinished$lambda$2(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPageStarted$lambda$1(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedClientCertRequest$lambda$14(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedError$lambda$6(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedHttpAuthRequest$lambda$10(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedHttpError$lambda$3(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedLoginRequest$lambda$15(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedRequestError$lambda$4(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedRequestErrorCompat$lambda$5(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceivedSslError$lambda$16(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScaleChanged$lambda$17(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pigeon_newInstance$lambda$0(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLoading$lambda$7(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void urlLoading$lambda$8(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, function1);
            return;
        }
        C1037h.a aVar3 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    public final void doUpdateVisitedHistory(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, boolean z4, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(urlArg, "urlArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, urlArg, Boolean.valueOf(z4)), new v(13, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public final void onFormResubmission(WebViewClient pigeon_instanceArg, WebView viewArg, Message dontResendArg, Message resendArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(viewArg, "viewArg");
        kotlin.jvm.internal.j.g(dontResendArg, "dontResendArg");
        kotlin.jvm.internal.j.g(resendArg, "resendArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, viewArg, dontResendArg, resendArg), new v(25, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onLoadResource(WebViewClient pigeon_instanceArg, WebView viewArg, String urlArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(viewArg, "viewArg");
        kotlin.jvm.internal.j.g(urlArg, "urlArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, viewArg, urlArg), new v(15, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onPageCommitVisible(WebViewClient pigeon_instanceArg, WebView viewArg, String urlArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(viewArg, "viewArg");
        kotlin.jvm.internal.j.g(urlArg, "urlArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, viewArg, urlArg), new v(20, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onPageFinished(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(urlArg, "urlArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, urlArg), new v(22, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onPageStarted(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(urlArg, "urlArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, urlArg), new v(17, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onReceivedClientCertRequest(WebViewClient pigeon_instanceArg, WebView viewArg, ClientCertRequest requestArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(viewArg, "viewArg");
        kotlin.jvm.internal.j.g(requestArg, "requestArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, viewArg, requestArg), new v(18, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onReceivedError(WebViewClient pigeon_instanceArg, WebView webViewArg, long j, String descriptionArg, String failingUrlArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(descriptionArg, "descriptionArg");
        kotlin.jvm.internal.j.g(failingUrlArg, "failingUrlArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, Long.valueOf(j), descriptionArg, failingUrlArg), new v(23, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onReceivedHttpAuthRequest(WebViewClient pigeon_instanceArg, WebView webViewArg, HttpAuthHandler handlerArg, String hostArg, String realmArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(handlerArg, "handlerArg");
        kotlin.jvm.internal.j.g(hostArg, "hostArg");
        kotlin.jvm.internal.j.g(realmArg, "realmArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, handlerArg, hostArg, realmArg), new v(24, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onReceivedHttpError(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, WebResourceResponse responseArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(requestArg, "requestArg");
        kotlin.jvm.internal.j.g(responseArg, "responseArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, requestArg, responseArg), new v(14, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onReceivedLoginRequest(WebViewClient pigeon_instanceArg, WebView viewArg, String realmArg, String str, String argsArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(viewArg, "viewArg");
        kotlin.jvm.internal.j.g(realmArg, "realmArg");
        kotlin.jvm.internal.j.g(argsArg, "argsArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, viewArg, realmArg, str, argsArg), new v(16, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    @RequiresApi(api = 23)
    public final void onReceivedRequestError(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, WebResourceError errorArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(requestArg, "requestArg");
        kotlin.jvm.internal.j.g(errorArg, "errorArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, requestArg, errorArg), new v(21, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onReceivedRequestErrorCompat(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, WebResourceErrorCompat errorArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(requestArg, "requestArg");
        kotlin.jvm.internal.j.g(errorArg, "errorArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, requestArg, errorArg), new v(10, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onReceivedSslError(WebViewClient pigeon_instanceArg, WebView viewArg, SslErrorHandler handlerArg, SslError errorArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(viewArg, "viewArg");
        kotlin.jvm.internal.j.g(handlerArg, "handlerArg");
        kotlin.jvm.internal.j.g(errorArg, "errorArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, viewArg, handlerArg, errorArg), new v(27, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onScaleChanged(WebViewClient pigeon_instanceArg, WebView viewArg, double d10, double d11, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(viewArg, "viewArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, viewArg, Double.valueOf(d10), Double.valueOf(d11)), new v(11, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public abstract WebViewClient pigeon_defaultConstructor();

    public final void pigeon_newInstance(WebViewClient pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, callback);
        } else {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", getPigeonRegistrar().getCodec(), null).a(cj.r.c(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new v(26, callback));
        }
    }

    public final void requestLoading(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(requestArg, "requestArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, requestArg), new v(19, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public abstract void setSynchronousReturnValueForShouldOverrideUrlLoading(WebViewClient webViewClient, boolean z4);

    public final void urlLoading(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(urlArg, "urlArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, urlArg), new v(12, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }
}
