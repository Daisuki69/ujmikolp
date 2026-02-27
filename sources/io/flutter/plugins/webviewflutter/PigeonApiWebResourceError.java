package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceError;
import androidx.annotation.RequiresApi;
import bj.AbstractC1039j;
import bj.C1037h;
import cj.C1132s;
import d4.AbstractC1331a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import pg.C2042e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PigeonApiWebResourceError {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public PigeonApiWebResourceError(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    @RequiresApi(api = 23)
    public abstract String description(WebResourceError webResourceError);

    @RequiresApi(api = 23)
    public abstract long errorCode(WebResourceError webResourceError);

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    @RequiresApi(api = 23)
    public final void pigeon_newInstance(WebResourceError pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        int i = 1;
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1331a.u(Unit.f18162a, callback);
        } else {
            long jAddHostCreatedInstance = getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg);
            long jErrorCode = errorCode(pigeon_instanceArg);
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", getPigeonRegistrar().getCodec(), null).a(C1132s.g(Long.valueOf(jAddHostCreatedInstance), Long.valueOf(jErrorCode), description(pigeon_instanceArg)), new v(i, callback));
        }
    }
}
