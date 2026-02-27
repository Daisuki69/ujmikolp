package com.dynatrace.agent.lifecycle.callback;

import android.app.Activity;
import android.os.Bundle;
import com.dynatrace.agent.lifecycle.AppStartupManager;
import com.dynatrace.agent.lifecycle.VisibilityManager;
import com.dynatrace.agent.lifecycle.VisibilityManagerKt;
import com.dynatrace.agent.lifecycle.model.AppStartupPhase;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityLifecycleListener extends BaseActivityLifecycleCallbacks {
    private final AppStartupManager appStartupManager;
    private final VisibilityManager visibilityManager;

    public ActivityLifecycleListener(AppStartupManager appStartupManager, VisibilityManager visibilityManager) {
        j.g(appStartupManager, "appStartupManager");
        j.g(visibilityManager, "visibilityManager");
        this.appStartupManager = appStartupManager;
        this.visibilityManager = visibilityManager;
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        j.g(activity, "activity");
        this.visibilityManager.onActivityPaused(VisibilityManagerKt.toIdHash(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        j.g(activity, "activity");
        this.appStartupManager.onStartupPhase(AppStartupPhase.ACTIVITY_RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        j.g(activity, "activity");
        this.appStartupManager.onStartupPhase(AppStartupPhase.ACTIVITY_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        j.g(activity, "activity");
        this.appStartupManager.onStartupPhase(AppStartupPhase.ACTIVITY_START);
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        j.g(activity, "activity");
        this.visibilityManager.onActivityStarted(VisibilityManagerKt.toIdHash(activity));
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        j.g(activity, "activity");
        this.visibilityManager.onActivityStopped(VisibilityManagerKt.toIdHash(activity), activity.isChangingConfigurations());
    }
}
