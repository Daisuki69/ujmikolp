package com.dynatrace.agent.communication;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.agent.communication.RequestScheduler", f = "RequestScheduler.kt", l = {35}, m = "schedule-KLykuaI")
public final class RequestScheduler$schedule$1 extends AbstractC1609c {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RequestScheduler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestScheduler$schedule$1(RequestScheduler requestScheduler, InterfaceC1526a<? super RequestScheduler$schedule$1> interfaceC1526a) {
        super(interfaceC1526a);
        this.this$0 = requestScheduler;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m155scheduleKLykuaI(0L, null, this);
    }
}
