package com.dynatrace.android.lifecycle.appstate;

import android.app.Application;
import com.dynatrace.android.agent.AppFgBgStateListener;
import com.dynatrace.android.lifecycle.callback.ActivityComponentIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class ApplicationStateMonitor {
    private ApplicationStateTracker tracker;

    public void startMonitoring(Application application) {
        ApplicationStateTracker applicationStateTracker = new ApplicationStateTracker(new ActivityComponentIdentifier());
        this.tracker = applicationStateTracker;
        applicationStateTracker.registerAppStateListener(new AppFgBgStateListener());
        application.registerActivityLifecycleCallbacks(this.tracker);
    }

    public void stopMonitoring(Application application) {
        ApplicationStateTracker applicationStateTracker = this.tracker;
        if (applicationStateTracker != null) {
            application.unregisterActivityLifecycleCallbacks(applicationStateTracker);
            this.tracker = null;
        }
    }
}
