package com.dynatrace.agent.communication;

import Bj.E;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.agent.communication.RequestScheduler$schedule$2", f = "RequestScheduler.kt", l = {37, 38}, m = "invokeSuspend")
public final class RequestScheduler$schedule$2 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ Function1<InterfaceC1526a<? super Unit>, Object> $block;
    final /* synthetic */ long $schedulingTime;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RequestScheduler$schedule$2(long j, Function1<? super InterfaceC1526a<? super Unit>, ? extends Object> function1, InterfaceC1526a<? super RequestScheduler$schedule$2> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$schedulingTime = j;
        this.$block = function1;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new RequestScheduler$schedule$2(this.$schedulingTime, this.$block, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((RequestScheduler$schedule$2) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r7.invoke(r6) == r0) goto L15;
     */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            bj.AbstractC1039j.b(r7)
            goto L35
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            bj.AbstractC1039j.b(r7)
            goto L2a
        L1c:
            bj.AbstractC1039j.b(r7)
            long r4 = r6.$schedulingTime
            r6.label = r3
            java.lang.Object r7 = Bj.O.c(r4, r6)
            if (r7 != r0) goto L2a
            goto L34
        L2a:
            kotlin.jvm.functions.Function1<gj.a<? super kotlin.Unit>, java.lang.Object> r7 = r6.$block
            r6.label = r2
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L35
        L34:
            return r0
        L35:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.RequestScheduler$schedule$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
