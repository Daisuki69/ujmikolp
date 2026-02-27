package com.dynatrace.agent.communication.api;

import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerDataUpdate {
    private final ServerConfigurationV4 config;
    private final ServerConfiguration configV3;
    private final AgentState state;

    public ServerDataUpdate(AgentState state, ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration) {
        j.g(state, "state");
        this.state = state;
        this.config = serverConfigurationV4;
        this.configV3 = serverConfiguration;
    }

    public static /* synthetic */ ServerDataUpdate copy$default(ServerDataUpdate serverDataUpdate, AgentState agentState, ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            agentState = serverDataUpdate.state;
        }
        if ((i & 2) != 0) {
            serverConfigurationV4 = serverDataUpdate.config;
        }
        if ((i & 4) != 0) {
            serverConfiguration = serverDataUpdate.configV3;
        }
        return serverDataUpdate.copy(agentState, serverConfigurationV4, serverConfiguration);
    }

    public final AgentState component1() {
        return this.state;
    }

    public final ServerConfigurationV4 component2() {
        return this.config;
    }

    public final ServerConfiguration component3() {
        return this.configV3;
    }

    public final ServerDataUpdate copy(AgentState state, ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration) {
        j.g(state, "state");
        return new ServerDataUpdate(state, serverConfigurationV4, serverConfiguration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerDataUpdate)) {
            return false;
        }
        ServerDataUpdate serverDataUpdate = (ServerDataUpdate) obj;
        return j.b(this.state, serverDataUpdate.state) && j.b(this.config, serverDataUpdate.config) && j.b(this.configV3, serverDataUpdate.configV3);
    }

    public final ServerConfigurationV4 getConfig() {
        return this.config;
    }

    public final ServerConfiguration getConfigV3() {
        return this.configV3;
    }

    public final AgentState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        ServerConfigurationV4 serverConfigurationV4 = this.config;
        int iHashCode2 = (iHashCode + (serverConfigurationV4 == null ? 0 : serverConfigurationV4.hashCode())) * 31;
        ServerConfiguration serverConfiguration = this.configV3;
        return iHashCode2 + (serverConfiguration != null ? serverConfiguration.hashCode() : 0);
    }

    public String toString() {
        return "ServerDataUpdate(state=" + this.state + ", config=" + this.config + ", configV3=" + this.configV3 + ')';
    }
}
