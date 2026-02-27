package com.dynatrace.agent.communication;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import com.dynatrace.agent.communication.CommunicationState;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.time.a;
import kotlin.time.b;

/* JADX INFO: loaded from: classes2.dex */
public final class CommunicationContextTaskScheduler {
    private InterfaceC0156n0 job;
    private final long schedulingTime;
    private final E scope;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationContextTaskScheduler$startTimer$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.CommunicationContextTaskScheduler$startTimer$1", f = "CommunicationContextTaskScheduler.kt", l = {56, 57}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Function1<InterfaceC1526a<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super InterfaceC1526a<? super Unit>, ? extends Object> function1, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$block = function1;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = CommunicationContextTaskScheduler.this.new AnonymousClass1(this.$block, interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.invoke(r6) != r0) goto L7;
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
                goto L44
            L25:
                bj.AbstractC1039j.b(r7)
                java.lang.Object r7 = r6.L$0
                Bj.E r7 = (Bj.E) r7
            L2c:
                boolean r1 = Bj.H.t(r7)
                if (r1 == 0) goto L51
                com.dynatrace.agent.communication.CommunicationContextTaskScheduler r1 = com.dynatrace.agent.communication.CommunicationContextTaskScheduler.this
                long r4 = com.dynatrace.agent.communication.CommunicationContextTaskScheduler.access$getSchedulingTime$p(r1)
                r6.L$0 = r7
                r6.label = r3
                java.lang.Object r1 = Bj.O.c(r4, r6)
                if (r1 != r0) goto L43
                goto L50
            L43:
                r1 = r7
            L44:
                kotlin.jvm.functions.Function1<gj.a<? super kotlin.Unit>, java.lang.Object> r7 = r6.$block
                r6.L$0 = r1
                r6.label = r2
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r0) goto L13
            L50:
                return r0
            L51:
                kotlin.Unit r7 = kotlin.Unit.f18162a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.CommunicationContextTaskScheduler.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ CommunicationContextTaskScheduler(E e, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(e, j);
    }

    private final void startTimer(Function1<? super InterfaceC1526a<? super Unit>, ? extends Object> function1) {
        stopTimer();
        this.job = H.w(this.scope, null, null, new AnonymousClass1(function1, null), 3);
    }

    private final void stopTimer() {
        InterfaceC0156n0 interfaceC0156n0 = this.job;
        if (interfaceC0156n0 != null) {
            interfaceC0156n0.b(null);
        }
        this.job = null;
    }

    public final void scheduleTask$com_dynatrace_agent_release(CommunicationState state, Function1<? super InterfaceC1526a<? super Unit>, ? extends Object> block) {
        j.g(state, "state");
        j.g(block, "block");
        if (this.job == null && state.equals(CommunicationState.Offline.INSTANCE)) {
            startTimer(block);
        } else {
            stopTimer();
        }
    }

    public final void stopExecution$com_dynatrace_agent_release() {
        stopTimer();
    }

    private CommunicationContextTaskScheduler(E scope, long j) {
        j.g(scope, "scope");
        this.scope = scope;
        this.schedulingTime = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CommunicationContextTaskScheduler(E e, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            a.C0097a c0097a = a.f18208b;
            j = b.e(5, Aj.b.e);
        }
        this(e, j, null);
    }
}
