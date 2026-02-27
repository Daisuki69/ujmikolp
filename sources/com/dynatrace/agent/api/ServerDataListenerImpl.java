package com.dynatrace.agent.api;

import com.dynatrace.agent.communication.api.ServerDataListener;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.android.agent.communication.ServerConfigurationListener;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerDataListenerImpl implements ServerDataListener {
    private final ConfigurationPublisher configurationPublisher;
    private final DynamicConfigDataSource dynamicConfigDataSource;
    private final ServerConfigurationListener legacyServerConfigurationListener;
    private final ServerConfigurationDataSource serverConfigurationDataSource;

    /* JADX INFO: renamed from: com.dynatrace.agent.api.ServerDataListenerImpl$onConfigurationUpdate$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.api.ServerDataListenerImpl", f = "ServerDataListenerImpl.kt", l = {40}, m = "onConfigurationUpdate")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerDataListenerImpl.this.onConfigurationUpdate(null, null, this);
        }
    }

    public ServerDataListenerImpl(ServerConfigurationListener legacyServerConfigurationListener, ServerConfigurationDataSource serverConfigurationDataSource, DynamicConfigDataSource dynamicConfigDataSource, ConfigurationPublisher configurationPublisher) {
        j.g(legacyServerConfigurationListener, "legacyServerConfigurationListener");
        j.g(serverConfigurationDataSource, "serverConfigurationDataSource");
        j.g(dynamicConfigDataSource, "dynamicConfigDataSource");
        j.g(configurationPublisher, "configurationPublisher");
        this.legacyServerConfigurationListener = legacyServerConfigurationListener;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.dynamicConfigDataSource = dynamicConfigDataSource;
        this.configurationPublisher = configurationPublisher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.dynatrace.agent.communication.api.ServerDataListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onConfigurationUpdate(com.dynatrace.agent.communication.api.AgentState r5, com.dynatrace.agent.storage.preference.ServerConfigurationV4 r6, gj.InterfaceC1526a<? super kotlin.Unit> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.api.ServerDataListenerImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.dynatrace.agent.api.ServerDataListenerImpl$onConfigurationUpdate$1 r0 = (com.dynatrace.agent.api.ServerDataListenerImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.api.ServerDataListenerImpl$onConfigurationUpdate$1 r0 = new com.dynatrace.agent.api.ServerDataListenerImpl$onConfigurationUpdate$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$1
            r6 = r5
            com.dynatrace.agent.storage.preference.ServerConfigurationV4 r6 = (com.dynatrace.agent.storage.preference.ServerConfigurationV4) r6
            java.lang.Object r5 = r0.L$0
            com.dynatrace.agent.api.ServerDataListenerImpl r5 = (com.dynatrace.agent.api.ServerDataListenerImpl) r5
            bj.AbstractC1039j.b(r7)
            goto L55
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            bj.AbstractC1039j.b(r7)
            com.dynatrace.android.agent.communication.ServerConfigurationListener r7 = r4.legacyServerConfigurationListener
            r7.onAgentStateChanged(r5)
            com.dynatrace.agent.storage.memory.DynamicConfigDataSource r7 = r4.dynamicConfigDataSource
            r7.setAgentState(r5)
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSource r5 = r4.serverConfigurationDataSource
            r0.L$0 = r4
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r5 = r5.setServerConfiguration(r6, r0)
            if (r5 != r1) goto L54
            return r1
        L54:
            r5 = r4
        L55:
            com.dynatrace.android.agent.conf.ConfigurationPublisher r5 = r5.configurationPublisher
            com.dynatrace.android.agent.conf.ConfigurationPublisher$ConfigChange r7 = com.dynatrace.android.agent.conf.ConfigurationPublisher.ConfigChange.IS_TOUCHES_ENABLED
            boolean r6 = r6.isTouchUserInteractionEnabled()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r6)
            java.util.Map r6 = cj.L.c(r0)
            r5.notify(r6)
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.api.ServerDataListenerImpl.onConfigurationUpdate(com.dynatrace.agent.communication.api.AgentState, com.dynatrace.agent.storage.preference.ServerConfigurationV4, gj.a):java.lang.Object");
    }

    @Override // com.dynatrace.agent.communication.api.ServerDataListener
    public Object onConfigurationV3Update(ServerConfiguration serverConfiguration, InterfaceC1526a<? super Unit> interfaceC1526a) {
        this.legacyServerConfigurationListener.onServerConfigurationChanged(serverConfiguration);
        return Unit.f18162a;
    }
}
