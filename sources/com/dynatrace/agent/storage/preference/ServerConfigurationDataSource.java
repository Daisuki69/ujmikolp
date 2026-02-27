package com.dynatrace.agent.storage.preference;

import gj.InterfaceC1526a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public interface ServerConfigurationDataSource {
    ServerConfigurationV4 getServerConfiguration();

    Object preloadServerConfiguration(InterfaceC1526a<? super Unit> interfaceC1526a);

    Object resetServerConfiguration(InterfaceC1526a<? super Unit> interfaceC1526a);

    Object setServerConfiguration(ServerConfigurationV4 serverConfigurationV4, InterfaceC1526a<? super Unit> interfaceC1526a);
}
