package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import bj.AbstractC1039j;
import bj.C1037h;
import d4.AbstractC1331a;
import e2.C1421c;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PigeonApiWebSettings {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setDomStorageEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setMediaPlaybackRequiresUserGesture(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$13$lambda$12(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setSupportZoom(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$15$lambda$14(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setLoadWithOverviewMode(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$17$lambda$16(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setUseWideViewPort(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$19$lambda$18(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setDisplayZoomControls(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$21$lambda$20(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setBuiltInZoomControls(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$23$lambda$22(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setAllowFileAccess(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$25$lambda$24(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setAllowContentAccess(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$27$lambda$26(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setGeolocationEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$29$lambda$28(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebSettings.setTextZoom(webSettings, ((Long) obj3).longValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setJavaScriptCanOpenWindowsAutomatically(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$31$lambda$30(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            try {
                listWrapError = cj.r.c(pigeonApiWebSettings.getUserAgentString((WebSettings) obj2));
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$33$lambda$32(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
            try {
                pigeonApiWebSettings.setMixedContentMode(webSettings, (MixedContentMode) obj3);
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setSupportMultipleWindows(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setJavaScriptEnabled(webSettings, ((Boolean) obj3).booleanValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebSettings pigeonApiWebSettings, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            try {
                pigeonApiWebSettings.setUserAgentString((WebSettings) obj2, (String) list.get(1));
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(pg.j binaryMessenger, final PigeonApiWebSettings pigeonApiWebSettings) {
            pg.q androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebSettings == null || (pigeonRegistrar = pigeonApiWebSettings.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            C2042e c2042e = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i = 0;
                c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e.b(null);
            }
            C2042e c2042e2 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i4 = 15;
                c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i4) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e2.b(null);
            }
            C2042e c2042e3 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i6 = 16;
                c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i6) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e3.b(null);
            }
            C2042e c2042e4 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i10 = 1;
                c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i10) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e4.b(null);
            }
            C2042e c2042e5 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i11 = 2;
                c2042e5.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i11) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e5.b(null);
            }
            C2042e c2042e6 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i12 = 3;
                c2042e6.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i12) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e6.b(null);
            }
            C2042e c2042e7 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i13 = 4;
                c2042e7.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i13) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e7.b(null);
            }
            C2042e c2042e8 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i14 = 5;
                c2042e8.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i14) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e8.b(null);
            }
            C2042e c2042e9 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i15 = 6;
                c2042e9.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i15) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e9.b(null);
            }
            C2042e c2042e10 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i16 = 7;
                c2042e10.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i16) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e10.b(null);
            }
            C2042e c2042e11 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i17 = 8;
                c2042e11.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i17) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e11.b(null);
            }
            C2042e c2042e12 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i18 = 9;
                c2042e12.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i18) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e12.b(null);
            }
            C2042e c2042e13 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i19 = 10;
                c2042e13.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i19) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e13.b(null);
            }
            C2042e c2042e14 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i20 = 11;
                c2042e14.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i20) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e14.b(null);
            }
            C2042e c2042e15 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i21 = 12;
                c2042e15.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i21) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e15.b(null);
            }
            C2042e c2042e16 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings != null) {
                final int i22 = 13;
                c2042e16.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i22) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e16.b(null);
            }
            C2042e c2042e17 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiWebSettings == null) {
                c2042e17.b(null);
            } else {
                final int i23 = 14;
                c2042e17.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i23) {
                            case 0:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$lambda$6(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$lambda$8(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$lambda$10(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$lambda$12(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$lambda$14(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$17$lambda$16(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$21$lambda$20(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$23$lambda$22(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$27$lambda$26(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$29$lambda$28(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$31$lambda$30(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 14:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$33$lambda$32(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            case 15:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiWebSettings, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiWebSettings(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public abstract String getUserAgentString(WebSettings webSettings);

    public final void pigeon_newInstance(WebSettings pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, callback);
        } else {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", getPigeonRegistrar().getCodec(), null).a(cj.r.c(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new v(5, callback));
        }
    }

    public abstract void setAllowContentAccess(WebSettings webSettings, boolean z4);

    public abstract void setAllowFileAccess(WebSettings webSettings, boolean z4);

    public abstract void setBuiltInZoomControls(WebSettings webSettings, boolean z4);

    public abstract void setDisplayZoomControls(WebSettings webSettings, boolean z4);

    public abstract void setDomStorageEnabled(WebSettings webSettings, boolean z4);

    public abstract void setGeolocationEnabled(WebSettings webSettings, boolean z4);

    public abstract void setJavaScriptCanOpenWindowsAutomatically(WebSettings webSettings, boolean z4);

    public abstract void setJavaScriptEnabled(WebSettings webSettings, boolean z4);

    public abstract void setLoadWithOverviewMode(WebSettings webSettings, boolean z4);

    public abstract void setMediaPlaybackRequiresUserGesture(WebSettings webSettings, boolean z4);

    public abstract void setMixedContentMode(WebSettings webSettings, MixedContentMode mixedContentMode);

    public abstract void setSupportMultipleWindows(WebSettings webSettings, boolean z4);

    public abstract void setSupportZoom(WebSettings webSettings, boolean z4);

    public abstract void setTextZoom(WebSettings webSettings, long j);

    public abstract void setUseWideViewPort(WebSettings webSettings, boolean z4);

    public abstract void setUserAgentString(WebSettings webSettings, String str);
}
