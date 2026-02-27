package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.C1132s;
import d4.AbstractC1331a;
import e2.C1421c;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PigeonApiWebView {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebView.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebView.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type kotlin.ByteArray");
            try {
                pigeonApiWebView.postUrl(webView, str, (byte[]) obj4);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$13$lambda$12(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                listWrapError = cj.r.c(pigeonApiWebView.getUrl((WebView) obj2));
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$15$lambda$14(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                listWrapError = cj.r.c(Boolean.valueOf(pigeonApiWebView.canGoBack((WebView) obj2)));
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$17$lambda$16(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                listWrapError = cj.r.c(Boolean.valueOf(pigeonApiWebView.canGoForward((WebView) obj2)));
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$19$lambda$18(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.goBack((WebView) obj2);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$21$lambda$20(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.goForward((WebView) obj2);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$23$lambda$22(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.reload((WebView) obj2);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$25$lambda$24(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebView.clearCache(webView, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$28$lambda$27(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            pigeonApiWebView.evaluateJavascript((WebView) obj2, (String) obj3, new l(reply, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUpMessageHandlers$lambda$28$lambda$27$lambda$26(InterfaceC2041d interfaceC2041d, C1037h c1037h) {
            Throwable thA = C1037h.a(c1037h.f9167a);
            if (thA != null) {
                interfaceC2041d.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(thA));
            } else {
                Object obj = c1037h.f9167a;
                if (obj instanceof C1038i) {
                    obj = null;
                }
                interfaceC2041d.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapResult((String) obj));
            }
            return Unit.f18162a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebView.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebView.settings(webView), ((Long) obj3).longValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$30$lambda$29(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                listWrapError = cj.r.c(pigeonApiWebView.getTitle((WebView) obj2));
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$32$lambda$31(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebView.setWebContentsDebuggingEnabled(((Boolean) obj2).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$34$lambda$33(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.setWebViewClient((WebView) obj2, (WebViewClient) list.get(1));
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$36$lambda$35(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
            try {
                pigeonApiWebView.addJavaScriptChannel(webView, (JavaScriptChannel) obj3);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$38$lambda$37(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiWebView.removeJavaScriptChannel(webView, (String) obj3);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$40$lambda$39(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.setDownloadListener((WebView) obj2, (DownloadListener) list.get(1));
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$42$lambda$41(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.setWebChromeClient((WebView) obj2, (WebChromeClientProxyApi.WebChromeClientImpl) list.get(1));
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$44$lambda$43(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebView.setBackgroundColor(webView, ((Long) obj3).longValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$46$lambda$45(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.destroy((WebView) obj2);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiWebView.loadData(webView, (String) obj3, (String) list.get(2), (String) list.get(3));
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            String str = (String) list.get(1);
            Object obj3 = list.get(2);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiWebView.loadDataWithBaseUrl(webView, str, (String) obj3, (String) list.get(3), (String) list.get(4), (String) list.get(5));
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebView pigeonApiWebView, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            try {
                pigeonApiWebView.loadUrl(webView, str, (Map) obj4);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(pg.j binaryMessenger, final PigeonApiWebView pigeonApiWebView) {
            pg.q androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebView == null || (pigeonRegistrar = pigeonApiWebView.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            C2042e c2042e = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i = 0;
                c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e.b(null);
            }
            C2042e c2042e2 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i4 = 2;
                c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i4) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e2.b(null);
            }
            C2042e c2042e3 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i6 = 6;
                c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i6) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e3.b(null);
            }
            C2042e c2042e4 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i10 = 7;
                c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i10) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e4.b(null);
            }
            C2042e c2042e5 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i11 = 8;
                c2042e5.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i11) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e5.b(null);
            }
            C2042e c2042e6 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i12 = 9;
                c2042e6.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i12) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e6.b(null);
            }
            C2042e c2042e7 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i13 = 10;
                c2042e7.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i13) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e7.b(null);
            }
            C2042e c2042e8 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i14 = 12;
                c2042e8.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i14) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e8.b(null);
            }
            C2042e c2042e9 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i15 = 13;
                c2042e9.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i15) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e9.b(null);
            }
            C2042e c2042e10 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i16 = 14;
                c2042e10.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i16) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e10.b(null);
            }
            C2042e c2042e11 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i17 = 11;
                c2042e11.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i17) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e11.b(null);
            }
            C2042e c2042e12 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i18 = 15;
                c2042e12.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i18) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e12.b(null);
            }
            C2042e c2042e13 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i19 = 16;
                c2042e13.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i19) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e13.b(null);
            }
            C2042e c2042e14 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i20 = 17;
                c2042e14.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i20) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e14.b(null);
            }
            C2042e c2042e15 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i21 = 18;
                c2042e15.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i21) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e15.b(null);
            }
            C2042e c2042e16 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i22 = 19;
                c2042e16.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i22) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e16.b(null);
            }
            C2042e c2042e17 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i23 = 20;
                c2042e17.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i23) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e17.b(null);
            }
            C2042e c2042e18 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i24 = 21;
                c2042e18.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i24) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e18.b(null);
            }
            C2042e c2042e19 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i25 = 22;
                c2042e19.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i25) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e19.b(null);
            }
            C2042e c2042e20 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i26 = 1;
                c2042e20.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i26) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e20.b(null);
            }
            C2042e c2042e21 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i27 = 3;
                c2042e21.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i27) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e21.b(null);
            }
            C2042e c2042e22 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView != null) {
                final int i28 = 4;
                c2042e22.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i28) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e22.b(null);
            }
            C2042e c2042e23 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebView == null) {
                c2042e23.b(null);
            } else {
                final int i29 = 5;
                c2042e23.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i29) {
                            case 0:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$40$lambda$39(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$42$lambda$41(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$44$lambda$43(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$46$lambda$45(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 16:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 17:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 18:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$30$lambda$29(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 19:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$32$lambda$31(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 20:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$34$lambda$33(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            case 21:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$36$lambda$35(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$38$lambda$37(pigeonApiWebView, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebView(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        kotlin.jvm.internal.j.g(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScrollChanged$lambda$1(Function1 function1, String str, Object obj) {
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

    public abstract void addJavaScriptChannel(WebView webView, JavaScriptChannel javaScriptChannel);

    public abstract boolean canGoBack(WebView webView);

    public abstract boolean canGoForward(WebView webView);

    public abstract void clearCache(WebView webView, boolean z4);

    public abstract void destroy(WebView webView);

    public abstract void evaluateJavascript(WebView webView, String str, Function1<? super C1037h<String>, Unit> function1);

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public abstract String getTitle(WebView webView);

    public abstract String getUrl(WebView webView);

    public abstract void goBack(WebView webView);

    public abstract void goForward(WebView webView);

    public abstract void loadData(WebView webView, String str, String str2, String str3);

    public abstract void loadDataWithBaseUrl(WebView webView, String str, String str2, String str3, String str4, String str5);

    public abstract void loadUrl(WebView webView, String str, Map<String, String> map);

    public final void onScrollChanged(WebView pigeon_instanceArg, long j, long j6, long j7, long j9, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (!getPigeonRegistrar().getIgnoreCallsToDart()) {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", getPigeonRegistrar().getCodec(), null).a(C1132s.g(pigeon_instanceArg, Long.valueOf(j), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j9)), new v(8, callback));
        } else {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        }
    }

    public abstract WebView pigeon_defaultConstructor();

    public final PigeonApiView pigeon_getPigeonApiView() {
        return getPigeonRegistrar().getPigeonApiView();
    }

    public final void pigeon_newInstance(WebView pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, callback);
        } else {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", getPigeonRegistrar().getCodec(), null).a(cj.r.c(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new v(9, callback));
        }
    }

    public abstract void postUrl(WebView webView, String str, byte[] bArr);

    public abstract void reload(WebView webView);

    public abstract void removeJavaScriptChannel(WebView webView, String str);

    public abstract void setBackgroundColor(WebView webView, long j);

    public abstract void setDownloadListener(WebView webView, DownloadListener downloadListener);

    public abstract void setWebChromeClient(WebView webView, WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl);

    public abstract void setWebContentsDebuggingEnabled(boolean z4);

    public abstract void setWebViewClient(WebView webView, WebViewClient webViewClient);

    public abstract WebSettings settings(WebView webView);
}
