package com.dynatrace.android.lifecycle.appstart;

import android.app.Application;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.events.lifecycle.AppStartActionObserverImpl;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.useraction.AppStartAggregatorImpl;
import com.dynatrace.android.useraction.LoadingActionNameGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class ApplicationStartMonitor {
    private ActivityStateListener activityStateListener;
    private AppStartController controller;

    public void onAgentShutdown(Application application) {
        ActivityStateListener activityStateListener = this.activityStateListener;
        if (activityStateListener != null) {
            application.unregisterActivityLifecycleCallbacks(activityStateListener);
            this.activityStateListener = null;
            this.controller = null;
        }
    }

    public void onAgentStart(Application application, TimeLineProvider timeLineProvider) {
        AppStartController appStartController = new AppStartController(new MeasurementProviderImpl(timeLineProvider), new AppStartAggregatorImpl(new LoadingActionNameGenerator()), new AppStartActionObserverImpl(), application);
        this.controller = appStartController;
        this.activityStateListener = appStartController.getActivityStateListener();
    }

    public void onApplicationStart(TimeLineProvider timeLineProvider) {
        if (this.controller == null) {
            return;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(timeLineProvider);
        MeasurementPoint measurementPointMeasure = measurementProviderImpl.measure();
        MeasurementPoint measurementPointMeasure2 = measurementProviderImpl.measure();
        String str = AdkSettings.applName;
        if (str == null || str.isEmpty()) {
            str = "null";
        }
        this.controller.appStart(str, measurementPointMeasure, measurementPointMeasure2);
    }
}
