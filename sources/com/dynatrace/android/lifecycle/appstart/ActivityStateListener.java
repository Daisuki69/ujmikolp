package com.dynatrace.android.lifecycle.appstart;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.dynatrace.android.agent.measurement.MeasurementProvider;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityStateListener implements Application.ActivityLifecycleCallbacks {
    private final AppStartController appStartController;
    private final MeasurementProvider measurementProvider;

    public ActivityStateListener(AppStartController appStartController, MeasurementProvider measurementProvider) {
        this.appStartController = appStartController;
        this.measurementProvider = measurementProvider;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.appStartController.appStartComplete(this.measurementProvider.measure(), activity.getComponentName().getClassName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (Build.VERSION.SDK_INT < 29) {
            this.appStartController.appStartComplete(this.measurementProvider.measure(), activity.getComponentName().getClassName());
        }
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
