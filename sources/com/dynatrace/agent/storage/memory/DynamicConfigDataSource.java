package com.dynatrace.agent.storage.memory;

import com.dynatrace.agent.communication.api.AgentState;

/* JADX INFO: loaded from: classes2.dex */
public interface DynamicConfigDataSource {
    AgentState getAgentState();

    void setAgentState(AgentState agentState);
}
