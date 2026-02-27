package com.dynatrace.android.lifecycle.callback;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.dynatrace.android.lifecycle.LifecycleController;
import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ActivityLifecycleListenerLegacy implements Application.ActivityLifecycleCallbacks {
    private final ComponentIdentifier<Activity> componentIdentifier;
    private final LifecycleController lifecycleController;

    public ActivityLifecycleListenerLegacy(LifecycleController lifecycleController, ComponentIdentifier<Activity> componentIdentifier) {
        this.lifecycleController = lifecycleController;
        this.componentIdentifier = componentIdentifier;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.lifecycleController.createEvent(this.componentIdentifier.obtainIdentity(activity), ActivityEventType.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.lifecycleController.onLifecycleCompleted(this.componentIdentifier.obtainIdentity(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.lifecycleController.createEvent(this.componentIdentifier.obtainIdentity(activity), ActivityEventType.ON_RESUME);
        this.lifecycleController.onLifecycleCompleted(this.componentIdentifier.obtainIdentity(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.lifecycleController.createEvent(this.componentIdentifier.obtainIdentity(activity), ActivityEventType.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.lifecycleController.onLifecycleCompleted(this.componentIdentifier.obtainIdentity(activity));
    }
}
