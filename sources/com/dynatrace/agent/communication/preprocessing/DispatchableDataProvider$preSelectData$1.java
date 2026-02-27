package com.dynatrace.agent.communication.preprocessing;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider", f = "DispatchableDataProvider.kt", l = {122, 123}, m = "preSelectData$com_dynatrace_agent_release")
public final class DispatchableDataProvider$preSelectData$1 extends AbstractC1609c {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DispatchableDataProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DispatchableDataProvider$preSelectData$1(DispatchableDataProvider dispatchableDataProvider, InterfaceC1526a<? super DispatchableDataProvider$preSelectData$1> interfaceC1526a) {
        super(interfaceC1526a);
        this.this$0 = dispatchableDataProvider;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.preSelectData$com_dynatrace_agent_release(null, 0, this);
    }
}
