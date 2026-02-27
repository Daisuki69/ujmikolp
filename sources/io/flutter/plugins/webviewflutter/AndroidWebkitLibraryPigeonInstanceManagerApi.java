package io.flutter.plugins.webviewflutter;

import bj.AbstractC1039j;
import bj.C1034e;
import bj.C1037h;
import bj.InterfaceC1033d;
import d4.AbstractC1331a;
import e2.C1421c;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManagerApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
final class AndroidWebkitLibraryPigeonInstanceManagerApi {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC1033d codec$delegate = C1034e.b(new C1637c());
    private final pg.j binaryMessenger;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                androidWebkitLibraryPigeonInstanceManager.remove(((Long) obj2).longValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            try {
                androidWebkitLibraryPigeonInstanceManager.clear();
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        public final pg.q getCodec() {
            return (pg.q) AndroidWebkitLibraryPigeonInstanceManagerApi.codec$delegate.getValue();
        }

        public final void setUpMessageHandlers(pg.j binaryMessenger, final AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager) {
            kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
            C2042e c2042e = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", getCodec(), null);
            if (androidWebkitLibraryPigeonInstanceManager != null) {
                final int i = 0;
                c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.d
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i) {
                            case 0:
                                AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$1$lambda$0(androidWebkitLibraryPigeonInstanceManager, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$3$lambda$2(androidWebkitLibraryPigeonInstanceManager, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e.b(null);
            }
            C2042e c2042e2 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", getCodec(), null);
            if (androidWebkitLibraryPigeonInstanceManager == null) {
                c2042e2.b(null);
            } else {
                final int i4 = 1;
                c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.d
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i4) {
                            case 0:
                                AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$1$lambda$0(androidWebkitLibraryPigeonInstanceManager, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$3$lambda$2(androidWebkitLibraryPigeonInstanceManager, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public AndroidWebkitLibraryPigeonInstanceManagerApi(pg.j binaryMessenger) {
        kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
        this.binaryMessenger = binaryMessenger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidWebkitLibraryPigeonCodec codec_delegate$lambda$1() {
        return new AndroidWebkitLibraryPigeonCodec();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeStrongReference$lambda$0(Function1 function1, String str, Object obj) {
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

    public final pg.j getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public final void removeStrongReference(long j, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(callback, "callback");
        new C2042e(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", Companion.getCodec(), null).a(cj.r.c(Long.valueOf(j)), new C1636b(0, callback));
    }
}
