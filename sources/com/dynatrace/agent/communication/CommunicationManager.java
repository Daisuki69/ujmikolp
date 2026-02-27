package com.dynatrace.agent.communication;

import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import gj.InterfaceC1526a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public interface CommunicationManager {
    void flush();

    Integer getServerId();

    void setServerId(Integer num);

    Object start(ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration, InterfaceC1526a<? super Unit> interfaceC1526a);

    void stopCommunication();

    void updateV3Config(ServerConfiguration serverConfiguration);
}
