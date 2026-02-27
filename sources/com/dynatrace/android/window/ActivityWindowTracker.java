package com.dynatrace.android.window;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityWindowTracker implements Application.ActivityLifecycleCallbacks {
    private final Set<Integer> cache = new HashSet();
    private final WindowCallbackInstrumentation instrumentation;

    private ActivityWindowTracker(WindowCallbackInstrumentation windowCallbackInstrumentation) {
        this.instrumentation = windowCallbackInstrumentation;
    }

    private int identity(Activity activity) {
        return System.identityHashCode(activity);
    }

    private void instrumentActivity(Activity activity) {
        int iIdentity = identity(activity);
        if (this.cache.contains(Integer.valueOf(iIdentity))) {
            return;
        }
        this.instrumentation.interceptWindowCallback(activity.getWindow());
        this.cache.add(Integer.valueOf(iIdentity));
    }

    public static ActivityWindowTracker newTracker(WindowCallbackInstrumentation windowCallbackInstrumentation, Activity activity) {
        ActivityWindowTracker activityWindowTracker = new ActivityWindowTracker(windowCallbackInstrumentation);
        if (activity != null) {
            activityWindowTracker.instrumentActivity(activity);
        }
        return activityWindowTracker;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.cache.remove(Integer.valueOf(identity(activity)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        instrumentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
