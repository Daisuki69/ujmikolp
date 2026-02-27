package com.dynatrace.android.agent;

import com.dynatrace.android.lifecycle.appstate.ApplicationStateListener;

/* JADX INFO: loaded from: classes2.dex */
public class AppFgBgStateListener implements ApplicationStateListener {
    @Override // com.dynatrace.android.lifecycle.appstate.ApplicationStateListener
    public void onBackground() {
        Dynatrace.pause();
    }

    @Override // com.dynatrace.android.lifecycle.appstate.ApplicationStateListener
    public void onForeground() {
        Dynatrace.resume();
    }
}
