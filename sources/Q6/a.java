package Q6;

import L9.C0323a;
import android.content.Intent;
import com.paymaya.domain.store.T0;
import com.paymaya.domain.store.U0;
import com.paymaya.mayaui.funds.view.activity.impl.FundsActivity;
import com.paymaya.ui.common.view.activity.impl.FullScreenFlutterActivity;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f5262b;

    public /* synthetic */ a(C0323a c0323a, int i) {
        this.f5261a = i;
        this.f5262b = c0323a;
    }

    @Override // Ch.a
    public final void run() {
        DartExecutor dartExecutor;
        switch (this.f5261a) {
            case 0:
                T6.a aVar = (T6.a) ((S6.a) this.f5262b.c.get());
                aVar.getClass();
                FundsActivity fundsActivity = (FundsActivity) aVar;
                FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(fundsActivity.f12393o);
                if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                    dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint(fundsActivity.f12395q, fundsActivity.f12396r, fundsActivity.f12397s));
                }
                fundsActivity.e.getClass();
                Intent intentBuild = new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, "funds").backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build(fundsActivity);
                intentBuild.putExtra("engineId", "funds");
                fundsActivity.startActivityForResult(intentBuild, 1200);
                return;
            case 1:
                C0323a c0323a = this.f5262b;
                c0323a.getClass();
                yk.a.a();
                B5.m mVar = ((T6.a) ((S6.a) c0323a.c.get())).f5797k;
                if (mVar == null) {
                    kotlin.jvm.internal.j.n("mSuspendSessionController");
                    throw null;
                }
                U0 u0 = mVar.f379d;
                new Hh.g(new Hh.a(new Hh.f(u0.f11397b.suspendSession().a(new T0(u0, 1)).a(new A7.c(mVar, 3)), zh.b.a(), 0), new a(c0323a, 2), 1), new h(c0323a), Eh.d.c, Eh.d.f1365b).c();
                return;
            default:
                C0323a c0323a2 = this.f5262b;
                yk.a.a();
                ArrayList arrayList = ((T6.a) ((S6.a) c0323a2.c.get())).m;
                if (!arrayList.isEmpty()) {
                    arrayList.remove(0);
                }
                c0323a2.k();
                return;
        }
    }
}
