package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.appstart.AppStartAggregator;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartAggregatorImpl implements AppStartAggregator {
    private final ActionNameCustomizer nameCustomizer;

    public AppStartAggregatorImpl(ActionNameCustomizer actionNameCustomizer) {
        this.nameCustomizer = actionNameCustomizer;
    }

    @Override // com.dynatrace.android.lifecycle.appstart.AppStartAggregator
    public void aggregatePlaceholder(AppStartPlaceholderSegment appStartPlaceholderSegment) {
        appStartPlaceholderSegment.getParentUserAction().addChildEvent(appStartPlaceholderSegment);
        Core.getCalloutTable().addActionEvent(appStartPlaceholderSegment);
    }

    @Override // com.dynatrace.android.lifecycle.appstart.AppStartAggregator
    public DTXAutoActionWrapper determineUserAction(String str, MeasurementPoint measurementPoint) {
        return new DTXAutoActionWrapper(UserActionUtil.determineAutoUserAction(this.nameCustomizer.customize(str), measurementPoint));
    }
}
