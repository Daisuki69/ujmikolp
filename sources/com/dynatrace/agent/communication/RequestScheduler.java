package com.dynatrace.agent.communication;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestScheduler {
    private InterfaceC0156n0 job;
    private final E scope;

    public RequestScheduler(E scope) {
        j.g(scope, "scope");
        this.scope = scope;
    }

    /* JADX INFO: renamed from: schedule-KLykuaI$default, reason: not valid java name */
    public static Object m154scheduleKLykuaI$default(RequestScheduler requestScheduler, long j, Function1 function1, InterfaceC1526a interfaceC1526a, int i, Object obj) {
        if ((i & 1) != 0) {
            a.f18208b.getClass();
            j = 0;
        }
        return requestScheduler.m155scheduleKLykuaI(j, function1, interfaceC1526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: schedule-KLykuaI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m155scheduleKLykuaI(long r5, kotlin.jvm.functions.Function1<? super gj.InterfaceC1526a<? super kotlin.Unit>, ? extends java.lang.Object> r7, gj.InterfaceC1526a<? super kotlin.Unit> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.dynatrace.agent.communication.RequestScheduler$schedule$1
            if (r0 == 0) goto L13
            r0 = r8
            com.dynatrace.agent.communication.RequestScheduler$schedule$1 r0 = (com.dynatrace.agent.communication.RequestScheduler$schedule$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.communication.RequestScheduler$schedule$1 r0 = new com.dynatrace.agent.communication.RequestScheduler$schedule$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r5 = r0.J$0
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r0 = r0.L$0
            com.dynatrace.agent.communication.RequestScheduler r0 = (com.dynatrace.agent.communication.RequestScheduler) r0
            bj.AbstractC1039j.b(r8)
            goto L50
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            bj.AbstractC1039j.b(r8)
            Bj.n0 r8 = r4.job
            if (r8 == 0) goto L4f
            r0.L$0 = r4
            r0.L$1 = r7
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r8 = Bj.H.k(r8, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
        L50:
            Bj.E r8 = r0.scope
            com.dynatrace.agent.communication.RequestScheduler$schedule$2 r1 = new com.dynatrace.agent.communication.RequestScheduler$schedule$2
            r2 = 0
            r1.<init>(r5, r7, r2)
            r5 = 3
            Bj.B0 r5 = Bj.H.w(r8, r2, r2, r1, r5)
            r0.job = r5
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.RequestScheduler.m155scheduleKLykuaI(long, kotlin.jvm.functions.Function1, gj.a):java.lang.Object");
    }

    public final Object stopExecution(InterfaceC1526a<? super Unit> interfaceC1526a) {
        InterfaceC0156n0 interfaceC0156n0 = this.job;
        if (interfaceC0156n0 == null) {
            return Unit.f18162a;
        }
        Object objK = H.k(interfaceC0156n0, interfaceC1526a);
        return objK == EnumC1578a.f17050a ? objK : Unit.f18162a;
    }
}
