package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.DTXActionImpl;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.lifecycle.appstart.AppStartController;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartPlaceholderSegment extends DTXActionImpl {
    private final AppStartController appStartController;
    private final UserAction parentUserAction;

    public AppStartPlaceholderSegment(String str, DTXAutoActionWrapper dTXAutoActionWrapper, AppStartController appStartController) {
        super(str, EventType.ACTION_MANUAL, dTXAutoActionWrapper.getTagId(), dTXAutoActionWrapper.getSession(), dTXAutoActionWrapper.getServerId(), false, dTXAutoActionWrapper.getDelegate());
        this.appStartController = appStartController;
        this.parentUserAction = dTXAutoActionWrapper;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        return new StringBuilder();
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public void discardAction() {
        if (isFinalized()) {
            return;
        }
        super.leaveAction(false);
        this.appStartController.cancelAppStart();
    }

    public UserAction getParentUserAction() {
        return this.parentUserAction;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public void leaveAction(boolean z4) {
        if (isFinalized()) {
            return;
        }
        super.leaveAction(false);
        this.appStartController.appStartStopped();
    }
}
