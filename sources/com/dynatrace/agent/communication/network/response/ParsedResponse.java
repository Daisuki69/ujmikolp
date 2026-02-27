package com.dynatrace.agent.communication.network.response;

import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ParsedResponse {
    private final ServerConfigurationV4 configuration;
    private final AgentState state;

    public ParsedResponse(AgentState state, ServerConfigurationV4 serverConfigurationV4) {
        j.g(state, "state");
        this.state = state;
        this.configuration = serverConfigurationV4;
    }

    public static /* synthetic */ ParsedResponse copy$default(ParsedResponse parsedResponse, AgentState agentState, ServerConfigurationV4 serverConfigurationV4, int i, Object obj) {
        if ((i & 1) != 0) {
            agentState = parsedResponse.state;
        }
        if ((i & 2) != 0) {
            serverConfigurationV4 = parsedResponse.configuration;
        }
        return parsedResponse.copy(agentState, serverConfigurationV4);
    }

    public final AgentState component1() {
        return this.state;
    }

    public final ServerConfigurationV4 component2() {
        return this.configuration;
    }

    public final ParsedResponse copy(AgentState state, ServerConfigurationV4 serverConfigurationV4) {
        j.g(state, "state");
        return new ParsedResponse(state, serverConfigurationV4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsedResponse)) {
            return false;
        }
        ParsedResponse parsedResponse = (ParsedResponse) obj;
        return j.b(this.state, parsedResponse.state) && j.b(this.configuration, parsedResponse.configuration);
    }

    public final ServerConfigurationV4 getConfiguration() {
        return this.configuration;
    }

    public final AgentState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        ServerConfigurationV4 serverConfigurationV4 = this.configuration;
        return iHashCode + (serverConfigurationV4 == null ? 0 : serverConfigurationV4.hashCode());
    }

    public String toString() {
        return "ParsedResponse(state=" + this.state + ", configuration=" + this.configuration + ')';
    }
}
