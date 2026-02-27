package com.dynatrace.android.agent;

import android.app.Application;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
public interface AgentStateListener {

    public interface SrParameterListener {
        void onSrParameterReady(Session session, String str);
    }

    void onAgentStarted(Application application, Configuration configuration, ServerConfiguration serverConfiguration, PrivacyRules privacyRules);

    void onNewSessionStarted(ServerConfiguration serverConfiguration, Session session, int i, SrParameterListener srParameterListener);

    void onServerConfigurationChanged(ServerConfiguration serverConfiguration);

    void onServerIdForceChanged(int i);

    void onSessionStatusChanged(Session session, ServerConfiguration serverConfiguration, SrParameterListener srParameterListener);
}
