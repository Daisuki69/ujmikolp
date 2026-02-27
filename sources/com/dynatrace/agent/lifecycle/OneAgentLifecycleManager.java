package com.dynatrace.agent.lifecycle;

import android.app.Application;
import android.os.Build;
import com.dynatrace.agent.lifecycle.callback.ActivityLifecycleListener;
import com.dynatrace.agent.lifecycle.callback.ActivityLifecycleListenerLegacy;
import com.dynatrace.agent.lifecycle.model.AppStartupPhase;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentLifecycleManager {
    private final Application.ActivityLifecycleCallbacks activityLifecycleListener;
    private final AppStartupManager appStartupManager;
    private final Application application;
    private boolean isAppStarted;

    public OneAgentLifecycleManager(AppStartupManager appStartupManager, VisibilityManager visibilityManager, Application application) {
        j.g(appStartupManager, "appStartupManager");
        j.g(visibilityManager, "visibilityManager");
        j.g(application, "application");
        this.appStartupManager = appStartupManager;
        this.application = application;
        this.activityLifecycleListener = Build.VERSION.SDK_INT >= 29 ? new ActivityLifecycleListener(appStartupManager, visibilityManager) : new ActivityLifecycleListenerLegacy(appStartupManager, visibilityManager);
    }

    public final void onAgentShutdown() {
        this.isAppStarted = false;
        this.application.unregisterActivityLifecycleCallbacks(this.activityLifecycleListener);
    }

    public final void onAppStart() {
        if (this.isAppStarted) {
            return;
        }
        this.isAppStarted = true;
        this.appStartupManager.onStartupPhase(AppStartupPhase.APPLICATION_CREATE);
        this.application.registerActivityLifecycleCallbacks(this.activityLifecycleListener);
    }
}
