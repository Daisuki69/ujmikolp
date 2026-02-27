package com.dynatrace.android.lifecycle.appstate;

import We.s;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.callback.ComponentIdentifier;
import com.dynatrace.android.lifecycle.callback.ComponentIdentity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ApplicationStateTracker implements Application.ActivityLifecycleCallbacks {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "ApplicationStateTracker");
    private final ComponentIdentifier<Activity> activityComponentIdentifier;
    private final LinkedHashSet<ApplicationStateListener> applicationStateListeners = new LinkedHashSet<>();
    private boolean isConfigurationChange = false;
    private final Set<ComponentIdentity> startedActivities = new HashSet();

    public ApplicationStateTracker(ComponentIdentifier<Activity> componentIdentifier) {
        this.activityComponentIdentifier = componentIdentifier;
    }

    public LinkedHashSet<ApplicationStateListener> getApplicationStateListeners() {
        return this.applicationStateListeners;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.startedActivities.add(this.activityComponentIdentifier.obtainIdentity(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.startedActivities.add(this.activityComponentIdentifier.obtainIdentity(activity));
        if (this.startedActivities.size() != 1 || this.isConfigurationChange) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOG_TAG, "app returns to foreground");
        }
        Iterator<ApplicationStateListener> it = this.applicationStateListeners.iterator();
        while (it.hasNext()) {
            it.next().onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.isConfigurationChange = activity.isChangingConfigurations();
        this.startedActivities.remove(this.activityComponentIdentifier.obtainIdentity(activity));
        if (!this.startedActivities.isEmpty() || this.isConfigurationChange) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOG_TAG, "app goes into background");
        }
        Iterator<ApplicationStateListener> it = this.applicationStateListeners.iterator();
        while (it.hasNext()) {
            it.next().onBackground();
        }
    }

    public void registerAppStateListener(ApplicationStateListener applicationStateListener) {
        if (applicationStateListener != null) {
            this.applicationStateListeners.add(applicationStateListener);
        }
    }

    public void unregisterAppStateListener(ApplicationStateListener applicationStateListener) {
        this.applicationStateListeners.remove(applicationStateListener);
    }
}
