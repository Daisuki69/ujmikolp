package com.dynatrace.android.lifecycle.action;

import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* JADX INFO: loaded from: classes2.dex */
public interface LifecycleActionObserver {
    void onActivityLifecycleAction(LifecycleAction<ActivityEventType> lifecycleAction);
}
