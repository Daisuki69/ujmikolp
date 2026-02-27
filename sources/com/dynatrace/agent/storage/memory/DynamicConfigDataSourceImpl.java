package com.dynatrace.agent.storage.memory;

import com.dynatrace.agent.communication.api.AgentState;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicConfigDataSourceImpl implements DynamicConfigDataSource {
    private AgentState agentState = new AgentState.Enabled(false);

    @Override // com.dynatrace.agent.storage.memory.DynamicConfigDataSource
    public AgentState getAgentState() {
        return this.agentState;
    }

    @Override // com.dynatrace.agent.storage.memory.DynamicConfigDataSource
    public void setAgentState(AgentState agentState) {
        j.g(agentState, "<set-?>");
        this.agentState = agentState;
    }
}
