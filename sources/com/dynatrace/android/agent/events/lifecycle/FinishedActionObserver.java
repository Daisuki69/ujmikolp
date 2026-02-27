package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.action.LifecycleActionObserver;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import com.dynatrace.android.useraction.UserAction;

/* JADX INFO: loaded from: classes2.dex */
public class FinishedActionObserver implements LifecycleActionObserver {
    private final StoreActionObserver delegate = new StoreActionObserver();

    @Override // com.dynatrace.android.lifecycle.action.LifecycleActionObserver
    public void onActivityLifecycleAction(LifecycleAction<ActivityEventType> lifecycleAction) {
        this.delegate.onActivityLifecycleAction(lifecycleAction);
        UserAction parentAction = lifecycleAction.getParentAction();
        if (parentAction == null || parentAction.isFinalized()) {
            return;
        }
        parentAction.startTimerIfNeeded();
    }
}
