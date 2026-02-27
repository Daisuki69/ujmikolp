package com.dynatrace.android.lifecycle;

import android.app.Application;
import android.os.Build;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.events.lifecycle.FinishedActionObserver;
import com.dynatrace.android.agent.events.lifecycle.StoreActionObserver;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.lifecycle.action.LifecycleActionFactoryImpl;
import com.dynatrace.android.lifecycle.callback.ActivityComponentIdentifier;
import com.dynatrace.android.lifecycle.callback.ActivityLifecycleListener;
import com.dynatrace.android.lifecycle.callback.ActivityLifecycleListenerLegacy;
import com.dynatrace.android.useraction.ActionAggregatorImpl;
import com.dynatrace.android.useraction.LoadingActionNameGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityLifecycleMonitor {
    private Application.ActivityLifecycleCallbacks lifecycleCallbacks;

    public void startMonitoring(Application application, TimeLineProvider timeLineProvider) {
        LifecycleController lifecycleController = new LifecycleController(new LifecycleActionFactoryImpl(), new FinishedActionObserver(), new StoreActionObserver(), new MeasurementProviderImpl(timeLineProvider), new ActionAggregatorImpl(new LoadingActionNameGenerator()));
        ActivityComponentIdentifier activityComponentIdentifier = new ActivityComponentIdentifier();
        Application.ActivityLifecycleCallbacks activityLifecycleListener = Build.VERSION.SDK_INT >= 29 ? new ActivityLifecycleListener(lifecycleController, activityComponentIdentifier) : new ActivityLifecycleListenerLegacy(lifecycleController, activityComponentIdentifier);
        this.lifecycleCallbacks = activityLifecycleListener;
        application.registerActivityLifecycleCallbacks(activityLifecycleListener);
    }

    public void stopMonitoring(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.lifecycleCallbacks;
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            this.lifecycleCallbacks = null;
        }
    }
}
