package com.dynatrace.agent.metrics;

import Bj.E;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.agent.metrics.MetricsRepository$runPeriodicMetricsUpdate$1", f = "MetricsRepository.kt", l = {70, 71}, m = "invokeSuspend")
public final class MetricsRepository$runPeriodicMetricsUpdate$1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MetricsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricsRepository$runPeriodicMetricsUpdate$1(MetricsRepository metricsRepository, InterfaceC1526a<? super MetricsRepository$runPeriodicMetricsUpdate$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = metricsRepository;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        MetricsRepository$runPeriodicMetricsUpdate$1 metricsRepository$runPeriodicMetricsUpdate$1 = new MetricsRepository$runPeriodicMetricsUpdate$1(this.this$0, interfaceC1526a);
        metricsRepository$runPeriodicMetricsUpdate$1.L$0 = obj;
        return metricsRepository$runPeriodicMetricsUpdate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((MetricsRepository$runPeriodicMetricsUpdate$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (Bj.O.c(r4, r6) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:7:0x0013). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r6.L$0
            Bj.E r1 = (Bj.E) r1
            bj.AbstractC1039j.b(r7)
        L13:
            r7 = r1
            goto L2c
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r1 = r6.L$0
            Bj.E r1 = (Bj.E) r1
            bj.AbstractC1039j.b(r7)
            goto L40
        L25:
            bj.AbstractC1039j.b(r7)
            java.lang.Object r7 = r6.L$0
            Bj.E r7 = (Bj.E) r7
        L2c:
            boolean r1 = Bj.H.t(r7)
            if (r1 == 0) goto L51
            com.dynatrace.agent.metrics.MetricsRepository r1 = r6.this$0
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r1 = com.dynatrace.agent.metrics.MetricsRepository.access$updateMetrics(r1, r6)
            if (r1 != r0) goto L3f
            goto L50
        L3f:
            r1 = r7
        L40:
            com.dynatrace.agent.metrics.MetricsRepository r7 = r6.this$0
            long r4 = com.dynatrace.agent.metrics.MetricsRepository.access$getInterval$p(r7)
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r7 = Bj.O.c(r4, r6)
            if (r7 != r0) goto L13
        L50:
            return r0
        L51:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.metrics.MetricsRepository$runPeriodicMetricsUpdate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
