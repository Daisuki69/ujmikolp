package io.flutter.plugins.webviewflutter;

import android.webkit.CookieManager;
import android.webkit.WebView;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import d4.AbstractC1331a;
import e2.C1421c;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PigeonApiCookieManager {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiCookieManager pigeonApiCookieManager, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiCookieManager.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiCookieManager.instance(), ((Long) obj2).longValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiCookieManager pigeonApiCookieManager, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            CookieManager cookieManager = (CookieManager) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiCookieManager.setCookie(cookieManager, str, (String) obj4);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$6$lambda$5(PigeonApiCookieManager pigeonApiCookieManager, Object obj, InterfaceC2041d reply) {
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            pigeonApiCookieManager.removeAllCookies((CookieManager) obj2, new l(reply, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUpMessageHandlers$lambda$6$lambda$5$lambda$4(InterfaceC2041d interfaceC2041d, C1037h c1037h) {
            Throwable thA = C1037h.a(c1037h.f9167a);
            if (thA != null) {
                interfaceC2041d.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(thA));
            } else {
                Object obj = c1037h.f9167a;
                if (obj instanceof C1038i) {
                    obj = null;
                }
                interfaceC2041d.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapResult((Boolean) obj));
            }
            return Unit.f18162a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$8$lambda$7(PigeonApiCookieManager pigeonApiCookieManager, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            CookieManager cookieManager = (CookieManager) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiCookieManager.setAcceptThirdPartyCookies(cookieManager, webView, ((Boolean) obj4).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(pg.j binaryMessenger, final PigeonApiCookieManager pigeonApiCookieManager) {
            pg.q androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
            if (pigeonApiCookieManager == null || (pigeonRegistrar = pigeonApiCookieManager.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            C2042e c2042e = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiCookieManager != null) {
                final int i = 0;
                c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.m
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i) {
                            case 0:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$8$lambda$7(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e.b(null);
            }
            C2042e c2042e2 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiCookieManager != null) {
                final int i4 = 1;
                c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.m
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i4) {
                            case 0:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$8$lambda$7(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e2.b(null);
            }
            C2042e c2042e3 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiCookieManager != null) {
                final int i6 = 2;
                c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.m
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i6) {
                            case 0:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$8$lambda$7(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e3.b(null);
            }
            C2042e c2042e4 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiCookieManager == null) {
                c2042e4.b(null);
            } else {
                final int i10 = 3;
                c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.m
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i10) {
                            case 0:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$8$lambda$7(pigeonApiCookieManager, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiCookieManager(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        kotlin.jvm.internal.j.g(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
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

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public abstract CookieManager instance();

    public final void pigeon_newInstance(CookieManager pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, callback);
        } else {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", getPigeonRegistrar().getCodec(), null).a(cj.r.c(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new C1636b(5, callback));
        }
    }

    public abstract void removeAllCookies(CookieManager cookieManager, Function1<? super C1037h<Boolean>, Unit> function1);

    public abstract void setAcceptThirdPartyCookies(CookieManager cookieManager, WebView webView, boolean z4);

    public abstract void setCookie(CookieManager cookieManager, String str, String str2);
}
