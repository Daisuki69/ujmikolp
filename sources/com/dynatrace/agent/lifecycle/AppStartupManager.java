package com.dynatrace.agent.lifecycle;

import com.dynatrace.agent.lifecycle.model.AppStartupPhase;

/* JADX INFO: loaded from: classes2.dex */
public interface AppStartupManager {
    void onStartupPhase(AppStartupPhase appStartupPhase);
}
