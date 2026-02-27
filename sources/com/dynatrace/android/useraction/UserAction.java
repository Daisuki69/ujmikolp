package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
public interface UserAction {
    void addChildEvent(CustomSegment customSegment);

    int getServerId();

    Session getSession();

    long getTagId();

    boolean isFinalized();

    void reportValue(String str, String str2);

    void startTimer();

    void startTimer(int i);

    void startTimerIfNeeded();
}
