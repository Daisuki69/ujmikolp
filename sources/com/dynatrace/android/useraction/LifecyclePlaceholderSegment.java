package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.DTXActionImpl;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.lifecycle.LifecycleController;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* JADX INFO: loaded from: classes2.dex */
public class LifecyclePlaceholderSegment extends DTXActionImpl {
    private LifecycleAction<ActivityEventType> lifecycleAction;
    private LifecycleController lifecycleController;

    public LifecyclePlaceholderSegment(String str, DTXAutoActionWrapper dTXAutoActionWrapper) {
        super(str, EventType.ACTION_MANUAL, dTXAutoActionWrapper.getTagId(), dTXAutoActionWrapper.getSession(), dTXAutoActionWrapper.getServerId(), false, dTXAutoActionWrapper.getDelegate());
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        return new StringBuilder();
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public void leaveAction(boolean z4) {
        if (isFinalized()) {
            return;
        }
        super.leaveAction(false);
        this.lifecycleController.onUserActionClosed(this.lifecycleAction);
    }

    public void setLifecycleDelegates(LifecycleAction<ActivityEventType> lifecycleAction, LifecycleController lifecycleController) {
        this.lifecycleController = lifecycleController;
        this.lifecycleAction = lifecycleAction;
    }
}
