package com.dynatrace.agent.events;

import Bj.E;
import Bj.H;
import Ej.C0235m;
import Ej.C0241t;
import Ej.N;
import Ej.W;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class EventFlowGovernor {
    private final N flow;
    private final E scope;

    /* JADX INFO: renamed from: com.dynatrace.agent.events.EventFlowGovernor$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.events.EventFlowGovernor$1", f = "EventFlowGovernor.kt", l = {29}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<Function1<? super InterfaceC1526a<? super Unit>, ? extends Object>, InterfaceC1526a<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                Function1 function1 = (Function1) this.L$0;
                this.label = 1;
                if (function1.invoke(this) == enumC1578a) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Function1<? super InterfaceC1526a<? super Unit>, ? extends Object> function1, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(function1, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.events.EventFlowGovernor$enqueue$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.events.EventFlowGovernor$enqueue$1", f = "EventFlowGovernor.kt", l = {39}, m = "invokeSuspend")
    public static final class C11441 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Function1<InterfaceC1526a<? super Unit>, Object> $body;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11441(Function1<? super InterfaceC1526a<? super Unit>, ? extends Object> function1, InterfaceC1526a<? super C11441> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$body = function1;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return EventFlowGovernor.this.new C11441(this.$body, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11441) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                N n7 = EventFlowGovernor.this.flow;
                Function1<InterfaceC1526a<? super Unit>, Object> function1 = this.$body;
                this.label = 1;
                if (n7.emit(function1, this) == enumC1578a) {
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

    public EventFlowGovernor(N flow, E scope) {
        j.g(flow, "flow");
        j.g(scope, "scope");
        this.flow = flow;
        this.scope = scope;
        H.w(scope, null, null, new C0235m(new C0241t(flow, new AnonymousClass1(null), 2), null), 3);
    }

    public final void enqueue(Function1<? super InterfaceC1526a<? super Unit>, ? extends Object> body) {
        j.g(body, "body");
        H.w(this.scope, null, null, new C11441(body, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EventFlowGovernor(N n7, E e, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            Dj.a aVar = Dj.a.f1163a;
            n7 = W.a(0, Integer.MAX_VALUE, Dj.a.f1163a);
        }
        this(n7, e);
    }
}
