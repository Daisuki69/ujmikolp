package com.dynatrace.android.agent.communication;

import com.dynatrace.android.agent.conf.ServerConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public interface CommunicationManagerBridge {
    void updateConfigurationInOneAgent(ServerConfiguration serverConfiguration);

    void updateServerId(int i);
}
