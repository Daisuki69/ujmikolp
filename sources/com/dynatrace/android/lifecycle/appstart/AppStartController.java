package com.dynatrace.android.lifecycle.appstart;

import We.s;
import android.app.Application;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.measurement.MeasurementProvider;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.appstart.AppStartAction;
import com.dynatrace.android.useraction.AppStartPlaceholderSegment;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartController {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "AppStartController");
    private final ActivityStateListener activityStateListener;
    private AppStartAction.Builder appStartActionBuilder;
    private final AppStartActionObserver appStartActionObserver;
    private final AppStartAggregator appStartAggregator;
    private final Application application;
    private final AtomicBoolean isActionFinalized = new AtomicBoolean(false);
    private final MeasurementProvider measurementProvider;

    public AppStartController(MeasurementProvider measurementProvider, AppStartAggregator appStartAggregator, AppStartActionObserver appStartActionObserver, Application application) {
        this.measurementProvider = measurementProvider;
        this.appStartAggregator = appStartAggregator;
        this.appStartActionObserver = appStartActionObserver;
        this.application = application;
        this.activityStateListener = new ActivityStateListener(this, measurementProvider);
    }

    public void appStart(String str, MeasurementPoint measurementPoint, MeasurementPoint measurementPoint2) {
        DTXAutoActionWrapper dTXAutoActionWrapperDetermineUserAction = this.appStartAggregator.determineUserAction(str, measurementPoint);
        dTXAutoActionWrapperDetermineUserAction.startTimer(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
        AppStartPlaceholderSegment appStartPlaceholderSegment = new AppStartPlaceholderSegment(str, dTXAutoActionWrapperDetermineUserAction, this);
        this.appStartAggregator.aggregatePlaceholder(appStartPlaceholderSegment);
        this.appStartActionBuilder = new AppStartAction.Builder().withName(str).withStartPoint(measurementPoint2).withParentAction(dTXAutoActionWrapperDetermineUserAction).withPlaceholderSegment(appStartPlaceholderSegment);
        this.application.registerActivityLifecycleCallbacks(this.activityStateListener);
    }

    public void appStartComplete(MeasurementPoint measurementPoint, String str) {
        if (this.isActionFinalized.compareAndSet(false, true)) {
            this.appStartActionBuilder.withEndPoint(measurementPoint);
            this.appStartActionBuilder.withName(str);
            AppStartAction appStartActionBuild = this.appStartActionBuilder.build();
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "AppStart action completed: " + appStartActionBuild);
            }
            this.appStartActionObserver.onAppStartCompleted(appStartActionBuild);
            this.application.unregisterActivityLifecycleCallbacks(this.activityStateListener);
        }
    }

    public void appStartStopped() {
        appStartComplete(this.measurementProvider.measure(), null);
    }

    public void cancelAppStart() {
        if (this.isActionFinalized.compareAndSet(false, true)) {
            this.application.unregisterActivityLifecycleCallbacks(this.activityStateListener);
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "AppStart action dropped");
            }
        }
    }

    public ActivityStateListener getActivityStateListener() {
        return this.activityStateListener;
    }

    public AppStartAction.Builder getAppStartActionBuilder() {
        return this.appStartActionBuilder;
    }

    public boolean isActionFinalized() {
        return this.isActionFinalized.get();
    }
}
