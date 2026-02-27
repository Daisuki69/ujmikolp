package com.dynatrace.agent.api;

import com.dynatrace.agent.communication.CommunicationManager;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CommunicationManagerBridgeImpl implements CommunicationManagerBridge {
    private final CommunicationManager communicationManager;

    public CommunicationManagerBridgeImpl(CommunicationManager communicationManager) {
        j.g(communicationManager, "communicationManager");
        this.communicationManager = communicationManager;
    }

    @Override // com.dynatrace.android.agent.communication.CommunicationManagerBridge
    public void updateConfigurationInOneAgent(ServerConfiguration serverConfigurationV3) {
        j.g(serverConfigurationV3, "serverConfigurationV3");
        this.communicationManager.updateV3Config(serverConfigurationV3);
    }

    @Override // com.dynatrace.android.agent.communication.CommunicationManagerBridge
    public void updateServerId(int i) {
        this.communicationManager.setServerId(Integer.valueOf(i));
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "received external server id update to: " + i);
    }
}
