package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
public class DTXAutoActionWrapper implements UserAction {
    private final DTXAutoAction delegate;

    public DTXAutoActionWrapper(DTXAutoAction dTXAutoAction) {
        this.delegate = dTXAutoAction;
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public void addChildEvent(CustomSegment customSegment) {
        this.delegate.addChildEvent(customSegment);
    }

    @Deprecated
    public DTXAutoAction getDelegate() {
        return this.delegate;
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public int getServerId() {
        return this.delegate.getServerId();
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public Session getSession() {
        return this.delegate.getSession();
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public long getTagId() {
        return this.delegate.getTagId();
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public boolean isFinalized() {
        return this.delegate.isFinalized();
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public void reportValue(String str, String str2) {
        this.delegate.reportValue(str, str2);
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public void startTimer(int i) {
        this.delegate.startTimer(i);
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public void startTimerIfNeeded() {
        this.delegate.startTimerIfNeeded();
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public void startTimer() {
        this.delegate.startTimer();
    }
}
