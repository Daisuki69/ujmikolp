package com.dynatrace.agent.communication;

import Kj.a;
import Kj.e;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.communication.api.ServerDataListener;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerDataMaintainer {
    private ServerConfigurationV4 configuration;
    private ServerConfiguration configurationV3;
    private final AtomicBoolean initialState;
    private final a mutex;
    private AgentState state;
    private final ServerDataListener updateListener;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.ServerDataMaintainer$updateInternalV3Config$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.ServerDataMaintainer", f = "ServerDataMaintainer.kt", l = {131, 121}, m = "updateInternalV3Config")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerDataMaintainer.this.updateInternalV3Config(null, false, this);
        }
    }

    public ServerDataMaintainer(LocalServerData initialServerData, ServerDataListener updateListener) {
        j.g(initialServerData, "initialServerData");
        j.g(updateListener, "updateListener");
        this.updateListener = updateListener;
        this.mutex = e.a(1, false);
        this.initialState = new AtomicBoolean(true);
        this.state = initialServerData.getState();
        this.configuration = initialServerData.getConfig();
        this.configurationV3 = initialServerData.getConfigV3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        if (r0.onConfigurationV3Update(r4, r2) == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:21:0x0079, B:24:0x007f, B:31:0x0096, B:33:0x009c, B:34:0x00a0, B:27:0x0088), top: B:48:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateInternalV3Config(com.dynatrace.android.agent.conf.ServerConfiguration r18, boolean r19, gj.InterfaceC1526a<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.ServerDataMaintainer.updateInternalV3Config(com.dynatrace.android.agent.conf.ServerConfiguration, boolean, gj.a):java.lang.Object");
    }

    public final LocalServerData localServerData$com_dynatrace_agent_release() {
        return new LocalServerData(this.state, this.configuration, this.configurationV3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r11.onConfigurationUpdate(r2, r5, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (r2.updateInternalV3Config(r10, true, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateServerData$com_dynatrace_agent_release(com.dynatrace.agent.communication.api.ServerDataUpdate r10, gj.InterfaceC1526a<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.ServerDataMaintainer.updateServerData$com_dynatrace_agent_release(com.dynatrace.agent.communication.api.ServerDataUpdate, gj.a):java.lang.Object");
    }

    public final Object updateV3Config$com_dynatrace_agent_release(ServerConfiguration serverConfiguration, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Object objUpdateInternalV3Config = updateInternalV3Config(serverConfiguration, false, interfaceC1526a);
        return objUpdateInternalV3Config == EnumC1578a.f17050a ? objUpdateInternalV3Config : Unit.f18162a;
    }
}
