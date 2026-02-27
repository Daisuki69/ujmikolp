package com.dynatrace.agent.communication;

import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalServerData {
    private final ServerConfigurationV4 config;
    private final ServerConfiguration configV3;
    private final AgentState state;

    public LocalServerData(AgentState state, ServerConfigurationV4 config, ServerConfiguration configV3) {
        j.g(state, "state");
        j.g(config, "config");
        j.g(configV3, "configV3");
        this.state = state;
        this.config = config;
        this.configV3 = configV3;
    }

    public static /* synthetic */ LocalServerData copy$default(LocalServerData localServerData, AgentState agentState, ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            agentState = localServerData.state;
        }
        if ((i & 2) != 0) {
            serverConfigurationV4 = localServerData.config;
        }
        if ((i & 4) != 0) {
            serverConfiguration = localServerData.configV3;
        }
        return localServerData.copy(agentState, serverConfigurationV4, serverConfiguration);
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

    public final LocalServerData copy(AgentState state, ServerConfigurationV4 config, ServerConfiguration configV3) {
        j.g(state, "state");
        j.g(config, "config");
        j.g(configV3, "configV3");
        return new LocalServerData(state, config, configV3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalServerData)) {
            return false;
        }
        LocalServerData localServerData = (LocalServerData) obj;
        return j.b(this.state, localServerData.state) && j.b(this.config, localServerData.config) && j.b(this.configV3, localServerData.configV3);
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
        return this.configV3.hashCode() + ((this.config.hashCode() + (this.state.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "LocalServerData(state=" + this.state + ", config=" + this.config + ", configV3=" + this.configV3 + ')';
    }
}
