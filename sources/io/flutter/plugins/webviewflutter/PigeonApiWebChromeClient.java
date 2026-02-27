package io.flutter.plugins.webviewflutter;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import bj.AbstractC1039j;
import bj.C1037h;
import cj.C1132s;
import d4.AbstractC1331a;
import e2.C1421c;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PigeonApiWebChromeClient {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebChromeClient.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebChromeClient.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsPrompt(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnShowFileChooser(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnConsoleMessage(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsAlert(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsConfirm(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(pg.j binaryMessenger, final PigeonApiWebChromeClient pigeonApiWebChromeClient) {
            pg.q androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebChromeClient == null || (pigeonRegistrar = pigeonApiWebChromeClient.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            C2042e c2042e = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebChromeClient != null) {
                final int i = 0;
                c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.w
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e.b(null);
            }
            C2042e c2042e2 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebChromeClient != null) {
                final int i4 = 1;
                c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.w
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i4) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e2.b(null);
            }
            C2042e c2042e3 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebChromeClient != null) {
                final int i6 = 2;
                c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.w
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i6) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e3.b(null);
            }
            C2042e c2042e4 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebChromeClient != null) {
                final int i10 = 3;
                c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.w
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i10) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e4.b(null);
            }
            C2042e c2042e5 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebChromeClient != null) {
                final int i11 = 4;
                c2042e5.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.w
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i11) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e5.b(null);
            }
            C2042e c2042e6 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebChromeClient == null) {
                c2042e6.b(null);
            } else {
                final int i12 = 5;
                c2042e6.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.w
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i12) {
                            case 0:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebChromeClient, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebChromeClient(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        kotlin.jvm.internal.j.g(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConsoleMessage$lambda$7(Function1 function1, String str, Object obj) {
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
    public static final void onGeolocationPermissionsHidePrompt$lambda$6(Function1 function1, String str, Object obj) {
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
    public static final void onGeolocationPermissionsShowPrompt$lambda$5(Function1 function1, String str, Object obj) {
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
    public static final void onHideCustomView$lambda$4(Function1 function1, String str, Object obj) {
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
    public static final void onJsAlert$lambda$8(Function1 function1, String str, Object obj) {
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
    public static final void onJsConfirm$lambda$9(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
            return;
        }
        if (list.get(0) == null) {
            C1037h.a aVar3 = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("null-error", "Flutter api returned null value for non-null return value.", ""), function1);
        } else {
            Object obj4 = list.get(0);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            function1.invoke(new C1037h((Boolean) obj4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsPrompt$lambda$10(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            function1.invoke(new C1037h((String) list.get(0)));
            return;
        }
        C1037h.a aVar2 = C1037h.f9166b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
        AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionRequest$lambda$2(Function1 function1, String str, Object obj) {
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
    public static final void onProgressChanged$lambda$0(Function1 function1, String str, Object obj) {
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
    public static final void onShowCustomView$lambda$3(Function1 function1, String str, Object obj) {
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
    public static final void onShowFileChooser$lambda$1(Function1 function1, String str, Object obj) {
        if (!(obj instanceof List)) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1039j.a(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)), function1);
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            C1037h.a aVar2 = C1037h.f9166b;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            AbstractC1331a.s(AbstractC1039j.a(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))), function1);
            return;
        }
        if (list.get(0) == null) {
            C1037h.a aVar3 = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("null-error", "Flutter api returned null value for non-null return value.", ""), function1);
        } else {
            Object obj4 = list.get(0);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            function1.invoke(new C1037h((List) obj4));
        }
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public final void onConsoleMessage(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, ConsoleMessage messageArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(messageArg, "messageArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, messageArg), new C1636b(27, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onGeolocationPermissionsHidePrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", getPigeonRegistrar().getCodec(), null).a(cj.r.c(pigeon_instanceArg), new v(0, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onGeolocationPermissionsShowPrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, String originArg, GeolocationPermissions.Callback callbackArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(originArg, "originArg");
        kotlin.jvm.internal.j.g(callbackArg, "callbackArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, originArg, callbackArg), new C1636b(28, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onHideCustomView(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", getPigeonRegistrar().getCodec(), null).a(cj.r.c(pigeon_instanceArg), new C1636b(20, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onJsAlert(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(urlArg, "urlArg");
        kotlin.jvm.internal.j.g(messageArg, "messageArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, urlArg, messageArg), new C1636b(23, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onJsConfirm(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, Function1<? super C1037h<Boolean>, Unit> callback) {
        int i = 1;
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(urlArg, "urlArg");
        kotlin.jvm.internal.j.g(messageArg, "messageArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, urlArg, messageArg), new B(i, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onJsPrompt(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, Function1<? super C1037h<String>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(urlArg, "urlArg");
        kotlin.jvm.internal.j.g(messageArg, "messageArg");
        kotlin.jvm.internal.j.g(defaultValueArg, "defaultValueArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, urlArg, messageArg, defaultValueArg), new C1636b(22, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onPermissionRequest(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, PermissionRequest requestArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(requestArg, "requestArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, requestArg), new C1636b(25, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onProgressChanged(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, long j, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, Long.valueOf(j)), new C1636b(21, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onShowCustomView(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, View viewArg, WebChromeClient.CustomViewCallback callbackArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(viewArg, "viewArg");
        kotlin.jvm.internal.j.g(callbackArg, "callbackArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, viewArg, callbackArg), new C1636b(26, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public final void onShowFileChooser(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, WebView webViewArg, WebChromeClient.FileChooserParams paramsArg, Function1<? super C1037h<? extends List<String>>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.g(paramsArg, "paramsArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, webViewArg, paramsArg), new C1636b(24, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public abstract WebChromeClientProxyApi.WebChromeClientImpl pigeon_defaultConstructor();

    public final void pigeon_newInstance(WebChromeClientProxyApi.WebChromeClientImpl pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, callback);
        } else {
            C1037h.a aVar3 = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", ""), callback);
        }
    }

    public abstract void setSynchronousReturnValueForOnConsoleMessage(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z4);

    public abstract void setSynchronousReturnValueForOnJsAlert(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z4);

    public abstract void setSynchronousReturnValueForOnJsConfirm(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z4);

    public abstract void setSynchronousReturnValueForOnJsPrompt(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z4);

    public abstract void setSynchronousReturnValueForOnShowFileChooser(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z4);
}
