package com.dynatrace.android.lifecycle.activitytracking;

import android.app.Application;
import com.dynatrace.agent.di.CoreComponent;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsListener;
import com.dynatrace.android.lifecycle.callback.ActivityComponentIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class ActiveActivityMonitor implements ActiveActivityListener, ScreenMetricsListener {
    private ActiveActivityTracker activityTracker;

    @Override // com.dynatrace.android.lifecycle.activitytracking.ActiveActivityListener
    public void onActiveActivityChanged(String str) {
        AndroidMetrics.getInstance().setCurrentActivityName(str);
    }

    @Override // com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsListener
    public void onScreenMetrics(ScreenMetrics screenMetrics) {
        AndroidMetrics.getInstance().updateScreenMetrics(screenMetrics);
        CoreComponent holder = CoreComponent.Holder.getInstance();
        if (holder != null) {
            holder.getMetricsRepository().updateScreenMetrics(screenMetrics);
        }
    }

    public void startMonitoring(Application application) {
        ActiveActivityTracker activeActivityTracker = new ActiveActivityTracker(new ActivityComponentIdentifier(), this, new ActivityScreenMetricsCollector(), this);
        this.activityTracker = activeActivityTracker;
        application.registerActivityLifecycleCallbacks(activeActivityTracker);
    }

    public void stopMonitoring(Application application) {
        ActiveActivityTracker activeActivityTracker = this.activityTracker;
        if (activeActivityTracker != null) {
            application.unregisterActivityLifecycleCallbacks(activeActivityTracker);
            this.activityTracker = null;
        }
    }
}
