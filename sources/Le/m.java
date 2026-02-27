package Le;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.common.view.activity.impl.MayaFullScreenFlutterFragmentActivity;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B5.i f2978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2979b;
    public final C1220i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S5.c f2980d;
    public FlutterEngine e;

    public m(B5.i iVar, com.paymaya.data.preference.a aVar, C1220i c1220i, S5.c cVar) {
        this.f2978a = iVar;
        this.f2979b = aVar;
        this.c = c1220i;
        this.f2980d = cVar;
    }

    public static void b() {
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("mycards");
        if (flutterEngine != null) {
            new u(flutterEngine.getDartExecutor().getBinaryMessenger(), "packages/paymaya_card").a("reloadHome", null, null);
        }
    }

    public final void a(FragmentActivity fragmentActivity) {
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("securityDeposit");
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(fragmentActivity.getApplicationContext());
        }
        this.e = flutterEngine;
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine2 = this.e;
        if (flutterEngine2 != null) {
            flutterEngineCache.put("securityDeposit", flutterEngine2);
        } else {
            kotlin.jvm.internal.j.n("flutterEngine");
            throw null;
        }
    }

    public final void c(FragmentActivity fragmentActivity, Map initialParams, Function1 function1) {
        DartExecutor dartExecutor;
        kotlin.jvm.internal.j.g(initialParams, "initialParams");
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("securityDeposit");
        if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
            dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runSecurityDeposit"));
        }
        FlutterEngine flutterEngine2 = this.e;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterEngine");
            throw null;
        }
        DartExecutor dartExecutor2 = flutterEngine2.getDartExecutor();
        if (dartExecutor2 != null) {
            new u(dartExecutor2.getBinaryMessenger(), "packages/security_deposit").b(new l(this, fragmentActivity, initialParams, function1));
        }
        Intent intentBuild = new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaFullScreenFlutterFragmentActivity.class, "securityDeposit").build(fragmentActivity.getApplicationContext());
        kotlin.jvm.internal.j.f(intentBuild, "build(...)");
        intentBuild.putExtra("engineId", "securityDeposit");
        fragmentActivity.startActivityForResult(intentBuild, S5.c.b(this.f2980d, A5.b.f69M0) ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 1200);
    }
}
