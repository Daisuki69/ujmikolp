package G7;

import android.content.Context;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.UUID;
import z7.InterfaceC2555b;

/* JADX INFO: loaded from: classes4.dex */
public final class H {
    public static String i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1827a = "mayaScorePartial";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1828b = "runXP";
    public final String c = "packages/maya_xp_sdk";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2555b f1829d;
    public final G e;
    public final Ag.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1830g;
    public pg.u h;

    public H(InterfaceC2555b interfaceC2555b, G g8, Ag.k kVar) {
        this.f1829d = interfaceC2555b;
        this.e = g8;
        this.f = kVar;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        this.f1830g = string;
    }

    public final void a() {
        FlutterEngine flutterEngine;
        String str = this.f1827a;
        if (str.length() == 0) {
            return;
        }
        if (FlutterEngineCache.getInstance().contains(str)) {
            flutterEngine = FlutterEngineCache.getInstance().get(str);
        } else {
            flutterEngine = new FlutterEngine((Context) this.f.invoke());
            flutterEngine.getNavigationChannel().setInitialRoute("/");
            flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", this.f1828b));
            FlutterEngineCache.getInstance().put(str, flutterEngine);
        }
        if (flutterEngine != null) {
            pg.u uVar = new pg.u(flutterEngine.getDartExecutor().getBinaryMessenger(), this.c);
            this.h = uVar;
            uVar.b(new t(this, 2));
            i = this.f1830g;
        }
    }
}
