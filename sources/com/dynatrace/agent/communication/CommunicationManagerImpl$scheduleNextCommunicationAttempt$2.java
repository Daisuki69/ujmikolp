package com.dynatrace.agent.communication;

import Bj.E;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$scheduleNextCommunicationAttempt$2", f = "CommunicationManagerImpl.kt", l = {DateTimeConstants.HOURS_PER_WEEK}, m = "invokeSuspend")
public final class CommunicationManagerImpl$scheduleNextCommunicationAttempt$2 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ CommunicationContext $communicationContext;
    int label;
    final /* synthetic */ CommunicationManagerImpl this$0;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$scheduleNextCommunicationAttempt$2$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$scheduleNextCommunicationAttempt$2$1", f = "CommunicationManagerImpl.kt", l = {171, 176, 177, 181, 202}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ CommunicationContext $communicationContext;
        Object L$0;
        int label;
        final /* synthetic */ CommunicationManagerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommunicationContext communicationContext, CommunicationManagerImpl communicationManagerImpl, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.$communicationContext = communicationContext;
            this.this$0 = communicationManagerImpl;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return new AnonymousClass1(this.$communicationContext, this.this$0, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        
            if (r15 != r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        
            if (r15 == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
        
            if (r15 == r0) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
        @Override // ij.AbstractC1607a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.CommunicationManagerImpl$scheduleNextCommunicationAttempt$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunicationManagerImpl$scheduleNextCommunicationAttempt$2(CommunicationManagerImpl communicationManagerImpl, CommunicationContext communicationContext, InterfaceC1526a<? super CommunicationManagerImpl$scheduleNextCommunicationAttempt$2> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = communicationManagerImpl;
        this.$communicationContext = communicationContext;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new CommunicationManagerImpl$scheduleNextCommunicationAttempt$2(this.this$0, this.$communicationContext, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((CommunicationManagerImpl$scheduleNextCommunicationAttempt$2) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i == 0) {
            AbstractC1039j.b(obj);
            RequestScheduler requestScheduler = this.this$0.dispatchScheduler;
            long jM153getWaitingTimeUwyO8pc = this.$communicationContext.m153getWaitingTimeUwyO8pc();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$communicationContext, this.this$0, null);
            this.label = 1;
            if (requestScheduler.m155scheduleKLykuaI(jM153getWaitingTimeUwyO8pc, anonymousClass1, this) == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        return Unit.f18162a;
    }
}
