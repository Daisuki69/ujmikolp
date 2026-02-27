package com.dynatrace.agent.communication.api;

import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import gj.InterfaceC1526a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public interface ServerDataListener {
    Object onConfigurationUpdate(AgentState agentState, ServerConfigurationV4 serverConfigurationV4, InterfaceC1526a<? super Unit> interfaceC1526a);

    Object onConfigurationV3Update(ServerConfiguration serverConfiguration, InterfaceC1526a<? super Unit> interfaceC1526a);
}
