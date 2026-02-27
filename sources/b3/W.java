package b3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class W implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f8418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8419b;

    public W(e0 sharedSessionRepository) {
        kotlin.jvm.internal.j.g(sharedSessionRepository, "sharedSessionRepository");
        this.f8418a = sharedSessionRepository;
        this.f8419b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.j.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.j.g(activity, "activity");
        if (this.f8419b) {
            this.f8418a.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.j.g(activity, "activity");
        if (this.f8419b) {
            e0 e0Var = this.f8418a;
            e0Var.i = true;
            C0868H c0868h = e0Var.h;
            if (c0868h == null) {
                Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
                return;
            }
            if (c0868h == null) {
                kotlin.jvm.internal.j.n("localSessionData");
                throw null;
            }
            Log.d("FirebaseSessions", "App foregrounded on " + e0Var.f.a());
            if (e0Var.d(c0868h) || e0Var.c(c0868h)) {
                Bj.H.w(Bj.H.c(e0Var.f8453g), null, null, new c0(e0Var, c0868h, null), 3);
            }
        }
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
