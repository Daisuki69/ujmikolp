package com.dynatrace.agent.communication;

import bj.AbstractC1039j;
import com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$scheduleNextCommunicationAttempt$1", f = "CommunicationManagerImpl.kt", l = {160}, m = "invokeSuspend")
public final class CommunicationManagerImpl$scheduleNextCommunicationAttempt$1 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
    int label;
    final /* synthetic */ CommunicationManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunicationManagerImpl$scheduleNextCommunicationAttempt$1(CommunicationManagerImpl communicationManagerImpl, InterfaceC1526a<? super CommunicationManagerImpl$scheduleNextCommunicationAttempt$1> interfaceC1526a) {
        super(1, interfaceC1526a);
        this.this$0 = communicationManagerImpl;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
        return new CommunicationManagerImpl$scheduleNextCommunicationAttempt$1(this.this$0, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((CommunicationManagerImpl$scheduleNextCommunicationAttempt$1) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i == 0) {
            AbstractC1039j.b(obj);
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "DB is sanitized during Offline mode");
            DispatchableDataProvider dispatchableDataProvider = this.this$0.dispatchableDataProvider;
            this.label = 1;
            if (dispatchableDataProvider.sanitizeDataSource(this) == enumC1578a) {
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
