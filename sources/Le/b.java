package Le;

import android.app.Activity;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.store.K;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B5.i f2962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2963b;
    public final K c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1220i f2964d;
    public final S5.c e;

    public b(B5.i iVar, com.paymaya.data.preference.a aVar, K k8, C1220i c1220i, S5.c cVar) {
        this.f2962a = iVar;
        this.f2963b = aVar;
        this.c = k8;
        this.f2964d = c1220i;
        this.e = cVar;
    }

    public static final void a(b bVar, Activity activity, String str, Map map) {
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        bVar.f2964d.c(activity, c1219hE);
    }

    public final void b(Activity activity) {
        kotlin.jvm.internal.j.g(activity, "activity");
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("creditScoringFullscreen");
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(activity.getApplicationContext());
        }
        FlutterEngineCache.getInstance().put("creditScoringFullscreen", flutterEngine);
    }
}
