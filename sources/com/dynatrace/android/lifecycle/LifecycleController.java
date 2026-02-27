package com.dynatrace.android.lifecycle;

import We.s;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.events.lifecycle.FinishedActionObserver;
import com.dynatrace.android.agent.events.lifecycle.StoreActionObserver;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.measurement.MeasurementProvider;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.action.LifecycleActionFactory;
import com.dynatrace.android.lifecycle.callback.ComponentIdentity;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import com.dynatrace.android.lifecycle.event.LifecycleEvent;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LifecycleController {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "LifecycleController");
    private final ActionAggregator actionAggregator;
    private final LifecycleActionFactory actionFactory;
    private final Map<ComponentIdentity, LifecycleAction<ActivityEventType>> actionMap = new HashMap();
    private final FinishedActionObserver finishedActionObserver;
    private final MeasurementProvider measurementProvider;
    private final StoreActionObserver storeActionObserver;

    public LifecycleController(LifecycleActionFactory lifecycleActionFactory, FinishedActionObserver finishedActionObserver, StoreActionObserver storeActionObserver, MeasurementProvider measurementProvider, ActionAggregator actionAggregator) {
        this.actionFactory = lifecycleActionFactory;
        this.finishedActionObserver = finishedActionObserver;
        this.storeActionObserver = storeActionObserver;
        this.measurementProvider = measurementProvider;
        this.actionAggregator = actionAggregator;
    }

    public void createEvent(ComponentIdentity componentIdentity, ActivityEventType activityEventType) {
        MeasurementPoint measurementPointMeasure;
        LifecycleAction<ActivityEventType> lifecycleAction = this.actionMap.get(componentIdentity);
        if (lifecycleAction != null) {
            measurementPointMeasure = this.measurementProvider.measure();
        } else {
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "start activity monitoring for " + componentIdentity);
            }
            MeasurementPoint measurementPointMeasure2 = this.measurementProvider.measure();
            MeasurementPoint measurementPointMeasure3 = this.measurementProvider.measure();
            MeasurementPoint measurementPointMeasure4 = this.measurementProvider.measure();
            DTXAutoActionWrapper dTXAutoActionWrapperDetermineUserAction = this.actionAggregator.determineUserAction(componentIdentity.getComponentName(), measurementPointMeasure2);
            LifecycleAction<ActivityEventType> lifecycleActionCreateActivityLifecycleAction = this.actionFactory.createActivityLifecycleAction(componentIdentity.getComponentName(), dTXAutoActionWrapperDetermineUserAction, measurementPointMeasure3);
            this.actionAggregator.aggregateAction(lifecycleActionCreateActivityLifecycleAction, dTXAutoActionWrapperDetermineUserAction, this);
            this.actionMap.put(componentIdentity, lifecycleActionCreateActivityLifecycleAction);
            lifecycleAction = lifecycleActionCreateActivityLifecycleAction;
            measurementPointMeasure = measurementPointMeasure4;
        }
        LifecycleEvent<T> lifecycleEvent = new LifecycleEvent<>(activityEventType, measurementPointMeasure);
        synchronized (lifecycleAction) {
            lifecycleAction.addEvent(lifecycleEvent);
        }
    }

    public void onLifecycleCompleted(ComponentIdentity componentIdentity) {
        LifecycleAction<ActivityEventType> lifecycleActionRemove = this.actionMap.remove(componentIdentity);
        if (lifecycleActionRemove == null) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOG_TAG, "finish activity monitoring for " + componentIdentity);
        }
        if (lifecycleActionRemove.isFinalized().compareAndSet(false, true)) {
            lifecycleActionRemove.setEndPoint(this.measurementProvider.measure());
            this.finishedActionObserver.onActivityLifecycleAction(lifecycleActionRemove);
        }
    }

    public void onUserActionClosed(LifecycleAction<ActivityEventType> lifecycleAction) {
        if (lifecycleAction.isFinalized().compareAndSet(false, true)) {
            lifecycleAction.setEndPoint(this.measurementProvider.measure());
            this.storeActionObserver.onActivityLifecycleAction(lifecycleAction);
        }
    }
}
