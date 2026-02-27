package com.dynatrace.android.agent;

import com.dynatrace.android.agent.AgentStateListener;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
public class SrBeaconParamListener implements AgentStateListener.SrParameterListener {
    @Override // com.dynatrace.android.agent.AgentStateListener.SrParameterListener
    public void onSrParameterReady(Session session, String str) {
        session.srBasicParam = str;
    }
}
