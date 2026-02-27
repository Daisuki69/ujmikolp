package androidx.work.impl;

import Bj.E;
import androidx.work.impl.WorkerWrapper;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
public final class WorkerWrapper$launch$1$resolution$1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super WorkerWrapper.Resolution>, Object> {
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$launch$1$resolution$1(WorkerWrapper workerWrapper, InterfaceC1526a<? super WorkerWrapper$launch$1$resolution$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = workerWrapper;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new WorkerWrapper$launch$1$resolution$1(this.this$0, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super WorkerWrapper.Resolution> interfaceC1526a) {
        return ((WorkerWrapper$launch$1$resolution$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return obj;
        }
        AbstractC1039j.b(obj);
        WorkerWrapper workerWrapper = this.this$0;
        this.label = 1;
        Object objRunWorker = workerWrapper.runWorker(this);
        return objRunWorker == enumC1578a ? enumC1578a : objRunWorker;
    }
}
