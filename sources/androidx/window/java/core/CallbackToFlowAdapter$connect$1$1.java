package androidx.window.java.core;

import Bj.E;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import androidx.core.util.Consumer;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.window.java.core.CallbackToFlowAdapter$connect$1$1", f = "CallbackToFlowAdapter.kt", l = {46}, m = "invokeSuspend")
public final class CallbackToFlowAdapter$connect$1$1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ Consumer<T> $consumer;
    final /* synthetic */ InterfaceC0230h $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackToFlowAdapter$connect$1$1(InterfaceC0230h interfaceC0230h, Consumer<T> consumer, InterfaceC1526a<? super CallbackToFlowAdapter$connect$1$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$flow = interfaceC0230h;
        this.$consumer = consumer;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new CallbackToFlowAdapter$connect$1$1(this.$flow, this.$consumer, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((CallbackToFlowAdapter$connect$1$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i == 0) {
            AbstractC1039j.b(obj);
            InterfaceC0230h interfaceC0230h = this.$flow;
            final Consumer<T> consumer = this.$consumer;
            InterfaceC0231i interfaceC0231i = new InterfaceC0231i() { // from class: androidx.window.java.core.CallbackToFlowAdapter$connect$1$1.1
                @Override // Ej.InterfaceC0231i
                public final Object emit(T t5, InterfaceC1526a<? super Unit> interfaceC1526a) {
                    consumer.accept(t5);
                    return Unit.f18162a;
                }
            };
            this.label = 1;
            if (interfaceC0230h.collect(interfaceC0231i, this) == enumC1578a) {
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
