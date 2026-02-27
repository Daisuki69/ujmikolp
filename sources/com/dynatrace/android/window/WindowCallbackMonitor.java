package com.dynatrace.android.window;

import android.app.Activity;
import android.app.Application;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WindowCallbackMonitor {
    private ActivityWindowTracker tracker;

    public void startMonitoring(Application application, Activity activity, List<WindowListenerFactory> list) {
        if (list.isEmpty()) {
            return;
        }
        ActivityWindowTracker activityWindowTrackerNewTracker = ActivityWindowTracker.newTracker(new WindowCallbackInstrumentation(list), activity);
        this.tracker = activityWindowTrackerNewTracker;
        application.registerActivityLifecycleCallbacks(activityWindowTrackerNewTracker);
    }

    public void stopMonitoring(Application application) {
        ActivityWindowTracker activityWindowTracker = this.tracker;
        if (activityWindowTracker != null) {
            application.unregisterActivityLifecycleCallbacks(activityWindowTracker);
            this.tracker = null;
        }
    }
}
