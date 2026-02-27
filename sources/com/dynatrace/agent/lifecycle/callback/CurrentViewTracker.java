package com.dynatrace.agent.lifecycle.callback;

import android.app.Activity;
import android.app.Application;
import com.dynatrace.agent.OneAgentConfiguration;
import com.dynatrace.agent.api.ViewContextApi;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CurrentViewTracker extends BaseActivityLifecycleCallbacks {
    private boolean alreadyAdded;
    private final Application applicationContext;
    private final OneAgentConfiguration oneAgentConfiguration;
    private final ViewContextApi viewContextApi;

    public CurrentViewTracker(ViewContextApi viewContextApi, Application applicationContext, OneAgentConfiguration oneAgentConfiguration) {
        j.g(viewContextApi, "viewContextApi");
        j.g(applicationContext, "applicationContext");
        j.g(oneAgentConfiguration, "oneAgentConfiguration");
        this.viewContextApi = viewContextApi;
        this.applicationContext = applicationContext;
        this.oneAgentConfiguration = oneAgentConfiguration;
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        j.g(activity, "activity");
        this.viewContextApi.stopView();
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        j.g(activity, "activity");
        this.viewContextApi.startView(activity.getComponentName().getClassName());
    }

    public final void setUp() {
        if (!this.oneAgentConfiguration.getActivityMonitoring() || this.alreadyAdded) {
            return;
        }
        this.applicationContext.registerActivityLifecycleCallbacks(this);
        this.alreadyAdded = true;
    }

    public final void tearDown() {
        this.applicationContext.unregisterActivityLifecycleCallbacks(this);
        this.alreadyAdded = false;
    }
}
