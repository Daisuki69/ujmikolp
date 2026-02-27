package B5;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.paymaya.mayaui.common.view.activity.impl.MayaMaintenanceActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaPostLoginActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaWelcomeActivity;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A5.m f360b;
    public final /* synthetic */ com.paymaya.data.preference.a c;

    public e(f fVar, A5.m mVar, com.paymaya.data.preference.a aVar) {
        this.f359a = fVar;
        this.f360b = mVar;
        this.c = aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.g(activity, "activity");
        if ((activity instanceof LauncherActivity) || (activity instanceof DeepLinkActivity) || (activity instanceof MayaPostLoginActivity)) {
            return;
        }
        if (activity.isTaskRoot()) {
            this.f359a.f361a = new WeakReference(activity);
        }
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.f(RELEASE, "RELEASE");
        String strE = Ke.d.e();
        String strC = Ke.d.c();
        A5.m mVar = this.f360b;
        mVar.g(strE, strC);
        mVar.h();
        com.paymaya.data.preference.a aVar = this.c;
        if (aVar.C().length() == 0) {
            return;
        }
        mVar.i(aVar.C());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakReference weakReference;
        kotlin.jvm.internal.j.g(activity, "activity");
        if ((activity instanceof LauncherActivity) || (activity instanceof DeepLinkActivity) || (activity instanceof MayaWelcomeActivity) || (activity instanceof MayaSessionExpiredActivity) || (activity instanceof MayaMaintenanceActivity) || (activity instanceof MayaPostLoginActivity) || (weakReference = this.f359a.f361a) == null || !kotlin.jvm.internal.j.b((Activity) weakReference.get(), activity)) {
            return;
        }
        A5.m mVar = this.f360b;
        if (mVar.f178d) {
            return;
        }
        mVar.e = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.j.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.j.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.j.g(activity, "activity");
        kotlin.jvm.internal.j.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.j.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.j.g(activity, "activity");
    }
}
