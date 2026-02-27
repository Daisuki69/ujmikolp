package com.dynatrace.android.lifecycle.activitytracking;

import We.s;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsCollector;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsListener;
import com.dynatrace.android.lifecycle.callback.ComponentIdentifier;
import com.dynatrace.android.lifecycle.callback.ComponentIdentity;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class ActiveActivityTracker implements Application.ActivityLifecycleCallbacks {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "ActiveActivityTracker");
    private final ActiveActivityListener activeActivityListener;
    private final ComponentIdentifier<Activity> componentIdentifier;
    private ComponentIdentity lastReportedActivity;
    private final ScreenMetricsListener metricsListener;
    private final LinkedList<ComponentIdentity> resumedActivities = new LinkedList<>();
    private final ScreenMetricsCollector screenMetricsCollector;

    public ActiveActivityTracker(ComponentIdentifier<Activity> componentIdentifier, ActiveActivityListener activeActivityListener, ScreenMetricsCollector screenMetricsCollector, ScreenMetricsListener screenMetricsListener) {
        this.componentIdentifier = componentIdentifier;
        this.activeActivityListener = activeActivityListener;
        this.screenMetricsCollector = screenMetricsCollector;
        this.metricsListener = screenMetricsListener;
    }

    private void reportActivityChange(ComponentIdentity componentIdentity) {
        if (this.lastReportedActivity == componentIdentity) {
            return;
        }
        if (Global.DEBUG) {
            if (componentIdentity == null) {
                Utility.zlogD(LOG_TAG, "unset current activity");
            } else {
                Utility.zlogD(LOG_TAG, "set current activity to " + componentIdentity.getComponentName());
            }
        }
        if (componentIdentity == null) {
            this.activeActivityListener.onActiveActivityChanged(null);
        } else {
            this.activeActivityListener.onActiveActivityChanged(componentIdentity.getComponentName());
        }
        this.lastReportedActivity = componentIdentity;
    }

    public ComponentIdentity getLastReportedActivity() {
        return this.lastReportedActivity;
    }

    public LinkedList<ComponentIdentity> getResumedActivities() {
        return this.resumedActivities;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.metricsListener.onScreenMetrics(this.screenMetricsCollector.collectMetrics(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.resumedActivities.remove(this.componentIdentifier.obtainIdentity(activity));
        if (this.resumedActivities.size() > 0) {
            reportActivityChange(this.resumedActivities.peekFirst());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ComponentIdentity componentIdentityObtainIdentity = this.componentIdentifier.obtainIdentity(activity);
        if (componentIdentityObtainIdentity.equals(this.lastReportedActivity)) {
            return;
        }
        this.resumedActivities.addFirst(componentIdentityObtainIdentity);
        reportActivityChange(componentIdentityObtainIdentity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.resumedActivities.size() == 0) {
            reportActivityChange(null);
        }
    }
}
