package B5;

import Ah.p;
import Kh.T;
import android.app.Activity;
import android.app.Application;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import com.paymaya.PayMayaApplication;
import com.paymaya.domain.store.C1282s;
import com.paymaya.domain.store.r;
import com.paymaya.mayaui.common.view.activity.impl.MayaMaintenanceActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaUpdaterActivity;
import io.flutter.embedding.android.FlutterActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1282s f364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f365b;
    public final /* synthetic */ Application c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f366d;

    public h(i iVar, C1282s c1282s, d dVar, Application application) {
        this.f366d = iVar;
        this.f364a = c1282s;
        this.f365b = dVar;
        this.c = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if ((activity instanceof MayaUpdaterActivity) || (activity instanceof MayaMaintenanceActivity) || (activity instanceof FlutterActivity)) {
            return;
        }
        new WeakReference(activity);
        i iVar = this.f366d;
        iVar.getClass();
        if (iVar.f370g == null) {
            C1282s c1282s = this.f364a;
            p<Response<Void>> appSettingsHead = c1282s.c.getAppSettingsHead();
            r rVar = new r(c1282s, 0);
            appSettingsHead.getClass();
            Lh.h hVar = new Lh.h(new T(5, new Lh.d(new Lh.f(appSettingsHead, rVar, 0), new r(c1282s, 1), 2).d(new r(c1282s, 2)), new r(c1282s, 3)), zh.b.a(), 0);
            d dVar = this.f365b;
            Objects.requireNonNull(dVar);
            new Lh.d(new T(5, new Lh.d(hVar, new A7.c(dVar, 1), 0), new A7.r(1, this, dVar)), new A7.c(this, 2), 1).e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i iVar = this.f366d;
        iVar.f369d = true;
        Handler handler = iVar.f368b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            iVar.f368b.postDelayed(new g(0, this, this.c), 500L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i iVar = this.f366d;
        boolean z4 = iVar.c;
        iVar.c = true;
        iVar.f369d = false;
        if (z4) {
            return;
        }
        PayMayaApplication payMayaApplication = (PayMayaApplication) this.c;
        payMayaApplication.getClass();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ContextCompat.registerReceiver(payMayaApplication, payMayaApplication.f10205k, intentFilter, null, null, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
