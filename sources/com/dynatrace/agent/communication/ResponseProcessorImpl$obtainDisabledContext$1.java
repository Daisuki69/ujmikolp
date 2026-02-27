package com.dynatrace.agent.communication;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.agent.communication.ResponseProcessorImpl", f = "ResponseProcessorImpl.kt", l = {276}, m = "obtainDisabledContext-bz6L7rs")
public final class ResponseProcessorImpl$obtainDisabledContext$1 extends AbstractC1609c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ResponseProcessorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseProcessorImpl$obtainDisabledContext$1(ResponseProcessorImpl responseProcessorImpl, InterfaceC1526a<? super ResponseProcessorImpl$obtainDisabledContext$1> interfaceC1526a) {
        super(interfaceC1526a);
        this.this$0 = responseProcessorImpl;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m158obtainDisabledContextbz6L7rs(0L, null, null, null, null, this);
    }
}
