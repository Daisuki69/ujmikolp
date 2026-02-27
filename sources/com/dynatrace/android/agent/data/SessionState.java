package com.dynatrace.android.agent.data;

/* JADX INFO: loaded from: classes2.dex */
enum SessionState {
    CREATED(true, false),
    ENABLED(true, true),
    DISABLED(false, true);

    private boolean active;
    private boolean configurationApplied;

    SessionState(boolean z4, boolean z5) {
        this.active = z4;
        this.configurationApplied = z5;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean isConfigurationApplied() {
        return this.configurationApplied;
    }
}
