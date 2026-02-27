package com.dynatrace.agent.lifecycle;

import com.dynatrace.agent.lifecycle.model.VisibilityStatus;

/* JADX INFO: loaded from: classes2.dex */
public interface VisibilityManager {
    VisibilityStatus getVisibilityStatus();

    void onActivityPaused(int i);

    void onActivityStarted(int i);

    void onActivityStopped(int i, boolean z4);
}
