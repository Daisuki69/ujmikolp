package com.dynatrace.agent;

import Bj.E;
import Bj.H;
import Bj.O;
import bj.AbstractC1039j;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.agent.OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1", f = "OneAgentStartupEventDispatcher.kt", l = {89}, m = "invokeSuspend")
public final class OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OneAgentStartupEventDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1(OneAgentStartupEventDispatcher oneAgentStartupEventDispatcher, SessionInformationMetrics sessionInformationMetrics, InterfaceC1526a<? super OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = oneAgentStartupEventDispatcher;
        this.$sessionInformationMetrics = sessionInformationMetrics;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1 oneAgentStartupEventDispatcher$dispatchNativeEvent$1$1 = new OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1(this.this$0, this.$sessionInformationMetrics, interfaceC1526a);
        oneAgentStartupEventDispatcher$dispatchNativeEvent$1$1.L$0 = obj;
        return oneAgentStartupEventDispatcher$dispatchNativeEvent$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        E e;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                E e7 = (E) this.L$0;
                long j = this.this$0.cacheTimeMillis;
                this.L$0 = e7;
                this.label = 1;
                if (O.b(j, this) == enumC1578a) {
                    return enumC1578a;
                }
                e = e7;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e = (E) this.L$0;
                AbstractC1039j.b(obj);
            }
            OneAgentStartupEventDispatcher oneAgentStartupEventDispatcher = this.this$0;
            SessionInformationMetrics sessionInformationMetrics = this.$sessionInformationMetrics;
            synchronized (oneAgentStartupEventDispatcher) {
                try {
                    JSONObject jSONObject = oneAgentStartupEventDispatcher.pendingEvent;
                    if (jSONObject != null && H.t(e)) {
                        oneAgentStartupEventDispatcher.verifyDataPrivacyAndSendEvent(jSONObject, sessionInformationMetrics);
                    }
                    oneAgentStartupEventDispatcher.resetPendingEvent();
                    Unit unit = Unit.f18162a;
                } finally {
                }
            }
        } catch (Exception e10) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "Native startupEvent is stopped to be processed", e10);
        }
        return Unit.f18162a;
    }
}
