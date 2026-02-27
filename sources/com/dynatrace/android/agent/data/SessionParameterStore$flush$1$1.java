package com.dynatrace.android.agent.data;

import Bj.E;
import Bj.InterfaceC0156n0;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.android.agent.data.SessionParameterStore$flush$1$1", f = "SessionParameterStore.kt", l = {175}, m = "invokeSuspend")
public final class SessionParameterStore$flush$1$1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ InterfaceC0156n0 $job;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionParameterStore$flush$1$1(InterfaceC0156n0 interfaceC0156n0, InterfaceC1526a<? super SessionParameterStore$flush$1$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$job = interfaceC0156n0;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new SessionParameterStore$flush$1$1(this.$job, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((SessionParameterStore$flush$1$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i == 0) {
            AbstractC1039j.b(obj);
            InterfaceC0156n0 interfaceC0156n0 = this.$job;
            this.label = 1;
            if (interfaceC0156n0.z(this) == enumC1578a) {
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
