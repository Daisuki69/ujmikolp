package io.flutter.plugins.webviewflutter;

import bj.AbstractC1039j;
import bj.C1037h;
import d4.AbstractC1331a;
import e2.C1421c;
import io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PigeonApiFlutterAssetManager {
    public static final Companion Companion = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiFlutterAssetManager pigeonApiFlutterAssetManager, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiFlutterAssetManager.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiFlutterAssetManager.instance(), ((Long) obj2).longValue());
                listWrapError = cj.r.c(null);
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiFlutterAssetManager pigeonApiFlutterAssetManager, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
            FlutterAssetManager flutterAssetManager = (FlutterAssetManager) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                listWrapError = cj.r.c(pigeonApiFlutterAssetManager.list(flutterAssetManager, (String) obj3));
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiFlutterAssetManager pigeonApiFlutterAssetManager, Object obj, InterfaceC2041d reply) {
            List<Object> listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
            FlutterAssetManager flutterAssetManager = (FlutterAssetManager) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                listWrapError = cj.r.c(pigeonApiFlutterAssetManager.getAssetFilePathByName(flutterAssetManager, (String) obj3));
            } catch (Throwable th2) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        public final void setUpMessageHandlers(pg.j binaryMessenger, final PigeonApiFlutterAssetManager pigeonApiFlutterAssetManager) {
            pg.q androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
            if (pigeonApiFlutterAssetManager == null || (pigeonRegistrar = pigeonApiFlutterAssetManager.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            C2042e c2042e = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiFlutterAssetManager != null) {
                final int i = 0;
                c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.n
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i) {
                            case 0:
                                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiFlutterAssetManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiFlutterAssetManager, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiFlutterAssetManager, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e.b(null);
            }
            C2042e c2042e2 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiFlutterAssetManager != null) {
                final int i4 = 1;
                c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.n
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i4) {
                            case 0:
                                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiFlutterAssetManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiFlutterAssetManager, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiFlutterAssetManager, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e2.b(null);
            }
            C2042e c2042e3 = new C2042e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", androidWebkitLibraryPigeonCodec, null);
            if (pigeonApiFlutterAssetManager == null) {
                c2042e3.b(null);
            } else {
                final int i6 = 2;
                c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.webviewflutter.n
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i6) {
                            case 0:
                                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(pigeonApiFlutterAssetManager, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$3$lambda$2(pigeonApiFlutterAssetManager, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$5$lambda$4(pigeonApiFlutterAssetManager, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            }
        }

        private Companion() {
        }
    }

    public PigeonApiFlutterAssetManager(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public abstract String getAssetFilePathByName(FlutterAssetManager flutterAssetManager, String str);

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public abstract FlutterAssetManager instance();

    public abstract List<String> list(FlutterAssetManager flutterAssetManager, String str);

    public final void pigeon_newInstance(FlutterAssetManager pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, callback);
        } else {
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", getPigeonRegistrar().getCodec(), null).a(cj.r.c(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new C1636b(9, callback));
        }
    }
}
