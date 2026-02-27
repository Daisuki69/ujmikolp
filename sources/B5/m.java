package B5;

import Kh.C0305j;
import Kh.x;
import Kh.z;
import android.app.Activity;
import bj.C1034e;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.U0;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OkHttpClient f378b;
    public final S0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U0 f379d;
    public final S5.c e;
    public Gh.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f380g;

    public m(l sessionController, OkHttpClient okHttpClient, S0 successStore, U0 suspendSessionStore, S5.c flagConfigurationService) {
        kotlin.jvm.internal.j.g(sessionController, "sessionController");
        kotlin.jvm.internal.j.g(okHttpClient, "okHttpClient");
        kotlin.jvm.internal.j.g(successStore, "successStore");
        kotlin.jvm.internal.j.g(suspendSessionStore, "suspendSessionStore");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        this.f377a = sessionController;
        this.f378b = okHttpClient;
        this.c = successStore;
        this.f379d = suspendSessionStore;
        this.e = flagConfigurationService;
        this.f380g = (((Number) C1034e.b(new Ag.k(this, 3)).getValue()).longValue() * ((long) 60)) / 120;
    }

    public final void a() {
        l lVar = this.f377a;
        WeakReference weakReference = lVar.h;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if (lVar.f && activity != null) {
            lVar.f = false;
            lVar.a(activity);
            k kVar = lVar.e;
            if (kVar != null) {
                kVar.start();
            }
            lVar.f373a.c0();
        }
        Gh.f fVar = this.f;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
    }

    public final void b() {
        Ah.h xVar;
        Gh.f fVar = this.f;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Nh.e eVar = Th.e.f5841b;
        long j = this.f380g;
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "count >= 0 required but it was "));
        }
        if (j == 0) {
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(eVar, "scheduler is null");
            xVar = new C0305j(eVar);
        } else {
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(eVar, "scheduler is null");
            xVar = new x(j - 1, Math.max(0L, 120L), Math.max(0L, 120L), eVar);
        }
        this.f = (Gh.f) new z(xVar, new A5.l(this, 3), 0).f();
    }
}
