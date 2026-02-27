package androidx.datastore.core;

import Bj.E;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
public final class DataStoreImpl$transformAndWrite$2$newData$1<T> extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super T>, Object> {
    final /* synthetic */ Data<T> $curData;
    final /* synthetic */ Function2<T, InterfaceC1526a<? super T>, Object> $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$transformAndWrite$2$newData$1(Function2<? super T, ? super InterfaceC1526a<? super T>, ? extends Object> function2, Data<T> data, InterfaceC1526a<? super DataStoreImpl$transformAndWrite$2$newData$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$transform = function2;
        this.$curData = data;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super T> interfaceC1526a) {
        return ((DataStoreImpl$transformAndWrite$2$newData$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
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
        Function2<T, InterfaceC1526a<? super T>, Object> function2 = this.$transform;
        T value = this.$curData.getValue();
        this.label = 1;
        Object objInvoke = function2.invoke(value, this);
        return objInvoke == enumC1578a ? enumC1578a : objInvoke;
    }
}
