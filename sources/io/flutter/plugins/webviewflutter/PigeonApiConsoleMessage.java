package io.flutter.plugins.webviewflutter;

import android.webkit.ConsoleMessage;
import bj.AbstractC1039j;
import bj.C1037h;
import cj.C1132s;
import d4.AbstractC1331a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import pg.C2042e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PigeonApiConsoleMessage {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public PigeonApiConsoleMessage(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
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

    public abstract ConsoleMessageLevel level(ConsoleMessage consoleMessage);

    public abstract long lineNumber(ConsoleMessage consoleMessage);

    public abstract String message(ConsoleMessage consoleMessage);

    public final void pigeon_newInstance(ConsoleMessage pigeon_instanceArg, Function1<? super C1037h<Unit>, Unit> callback) {
        int i = 4;
        kotlin.jvm.internal.j.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.g(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            C1037h.a aVar = C1037h.f9166b;
            AbstractC1331a.s(AbstractC1331a.m("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else {
            if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
                C1037h.a aVar2 = C1037h.f9166b;
                AbstractC1331a.u(Unit.f18162a, callback);
                return;
            }
            long jAddHostCreatedInstance = getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg);
            long jLineNumber = lineNumber(pigeon_instanceArg);
            new C2042e(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", getPigeonRegistrar().getCodec(), null).a(C1132s.g(Long.valueOf(jAddHostCreatedInstance), Long.valueOf(jLineNumber), message(pigeon_instanceArg), level(pigeon_instanceArg), sourceId(pigeon_instanceArg)), new C1636b(i, callback));
        }
    }

    public abstract String sourceId(ConsoleMessage consoleMessage);
}
