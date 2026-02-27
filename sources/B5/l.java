package B5;

import Ah.n;
import Kh.B;
import Kh.M;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import bg.AbstractC0983W;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.activity.impl.MayaMaintenanceActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.time.a;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.paymaya.data.preference.a f373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S5.c f374b;
    public final C1220i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uh.d f375d;
    public k e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Gh.f f376g;
    public WeakReference h;
    public WeakReference i;
    public final InterfaceC1033d j;

    public l(Application application, com.paymaya.data.preference.a preference, S5.c flagConfigurationService, C1220i analyticsUtils, Uh.d sessionSubject) {
        kotlin.jvm.internal.j.g(application, "application");
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(analyticsUtils, "analyticsUtils");
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.f373a = preference;
        this.f374b = flagConfigurationService;
        this.c = analyticsUtils;
        this.f375d = sessionSubject;
        this.j = C1034e.b(new Ag.k(this, 2));
        Gh.f fVar = this.f376g;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
        B bE = sessionSubject.e(zh.b.a());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Nh.e eVar = Th.e.f5841b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(eVar, "scheduler is null");
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        Gh.f fVar2 = new Gh.f(new V2.c(this, 3), Eh.d.f1366d);
        try {
            Rh.a aVar = new Rh.a(fVar2);
            n nVarA = eVar.a();
            TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
            bE.g(new M(aVar, nVarA));
            this.f376g = fVar2;
            application.registerActivityLifecycleCallbacks(new b(this, 2));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final void a(Activity activity) {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.h = new WeakReference(activity);
        k kVar = this.e;
        if (kVar != null) {
            kVar.cancel();
        }
        a.C0097a c0097a = kotlin.time.a.f18208b;
        this.e = new k(this, kotlin.time.a.d(kotlin.time.b.d(((Number) this.j.getValue()).doubleValue(), Aj.b.e)));
    }

    public final void b() {
        yk.a.a();
        this.f375d.onNext(PayMayaError.sBuilder().mErrorCode(-5).build());
    }

    public final void c() {
        Activity activity;
        com.paymaya.data.preference.a aVar = this.f373a;
        aVar.r0(true);
        aVar.w0("");
        yk.a.a();
        WeakReference weakReference = this.i;
        if ((weakReference != null ? (Activity) weakReference.get() : null) instanceof MayaSessionExpiredActivity) {
            return;
        }
        FirebaseAnalytics.getInstance(this.c.c).f9742a.zzo(null);
        WeakReference weakReference2 = this.i;
        if (weakReference2 == null || (activity = (Activity) weakReference2.get()) == null) {
            return;
        }
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaSessionExpiredActivity.class);
        intent.setFlags(335544320);
        boolean z4 = activity instanceof DeepLinkActivity;
        if (z4) {
            intent.setData(activity.getIntent().getData());
            intent.putExtra("extra_attribution_source", activity.getIntent().getParcelableExtra("extra_attribution_source"));
            activity.getIntent().removeExtra("extra_attribution_source");
        }
        activity.startActivity(intent);
        if ((activity instanceof LauncherActivity) || (activity instanceof MayaMaintenanceActivity) || z4) {
            activity.finish();
        }
    }
}
