package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.ActionAggregator;
import com.dynatrace.android.lifecycle.LifecycleController;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* JADX INFO: loaded from: classes2.dex */
public class ActionAggregatorImpl implements ActionAggregator {
    private final ActionNameCustomizer nameCustomizer;

    public ActionAggregatorImpl(ActionNameCustomizer actionNameCustomizer) {
        this.nameCustomizer = actionNameCustomizer;
    }

    @Override // com.dynatrace.android.lifecycle.ActionAggregator
    public void aggregateAction(LifecycleAction<ActivityEventType> lifecycleAction, UserAction userAction, LifecycleController lifecycleController) {
        LifecyclePlaceholderSegment placeholderSegment = lifecycleAction.getPlaceholderSegment();
        placeholderSegment.setLifecycleDelegates(lifecycleAction, lifecycleController);
        userAction.addChildEvent(placeholderSegment);
        Core.getCalloutTable().addActionEvent(placeholderSegment);
    }

    @Override // com.dynatrace.android.lifecycle.ActionAggregator
    public DTXAutoActionWrapper determineUserAction(String str, MeasurementPoint measurementPoint) {
        return new DTXAutoActionWrapper(UserActionUtil.determineAutoUserAction(this.nameCustomizer.customize(str), measurementPoint));
    }
}
