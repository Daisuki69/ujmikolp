package com.dynatrace.agent.util;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import Bj.O;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public class CoroutineHandler {
    private final E coroutineScope;

    /* JADX INFO: renamed from: com.dynatrace.agent.util.CoroutineHandler$launchWithDelay$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.util.CoroutineHandler$launchWithDelay$1", f = "CoroutineHandler.kt", l = {35}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ long $delay;
        final /* synthetic */ Function0<Unit> $task;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Function0<Unit> function0, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$delay = j;
            this.$task = function0;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delay, this.$task, interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC1039j.b(obj);
                    if (H.t((E) this.L$0)) {
                        long j = this.$delay;
                        this.label = 1;
                        if (O.b(j, this) == enumC1578a) {
                            return enumC1578a;
                        }
                    }
                    return Unit.f18162a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                this.$task.invoke();
                return Unit.f18162a;
            } catch (CancellationException unused) {
                return Unit.f18162a;
            }
        }
    }

    public CoroutineHandler(E coroutineScope) {
        j.g(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    public final InterfaceC0156n0 launchWithDelay(long j, Function0<Unit> task) {
        j.g(task, "task");
        return H.w(this.coroutineScope, null, null, new AnonymousClass1(j, task, null), 3);
    }
}
