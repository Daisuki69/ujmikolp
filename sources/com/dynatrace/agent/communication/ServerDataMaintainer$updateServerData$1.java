package com.dynatrace.agent.communication;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.agent.communication.ServerDataMaintainer", f = "ServerDataMaintainer.kt", l = {87, 91}, m = "updateServerData$com_dynatrace_agent_release")
public final class ServerDataMaintainer$updateServerData$1 extends AbstractC1609c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServerDataMaintainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerDataMaintainer$updateServerData$1(ServerDataMaintainer serverDataMaintainer, InterfaceC1526a<? super ServerDataMaintainer$updateServerData$1> interfaceC1526a) {
        super(interfaceC1526a);
        this.this$0 = serverDataMaintainer;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateServerData$com_dynatrace_agent_release(null, this);
    }
}
