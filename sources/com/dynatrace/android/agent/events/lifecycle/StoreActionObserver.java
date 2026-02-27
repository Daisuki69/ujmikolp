package com.dynatrace.android.agent.events.lifecycle;

import We.s;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.action.LifecycleActionObserver;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;
import com.dynatrace.android.useraction.UserAction;

/* JADX INFO: loaded from: classes2.dex */
public class StoreActionObserver implements LifecycleActionObserver {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "StoreActionObserver");

    @Override // com.dynatrace.android.lifecycle.action.LifecycleActionObserver
    public void onActivityLifecycleAction(LifecycleAction<ActivityEventType> lifecycleAction) {
        UserAction parentAction = lifecycleAction.getParentAction();
        if (parentAction != null && !parentAction.isFinalized()) {
            if (Dynatrace.getCaptureStatus()) {
                Core.saveSegment(new DisplaySegmentFactory().createSegment(lifecycleAction, parentAction.getSession(), parentAction.getServerId()));
            }
            LifecyclePlaceholderSegment placeholderSegment = lifecycleAction.getPlaceholderSegment();
            Core.removeFromCalloutTable(placeholderSegment);
            placeholderSegment.leaveAction();
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOG_TAG, "Parent action is not available anymore, discard lifecycle action '" + lifecycleAction.getName() + "'");
        }
    }
}
