package androidx.datastore.core;

import Ej.InterfaceC0231i;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
public final class SingleProcessCoordinator$updateNotifications$1 extends AbstractC1616j implements Function2<InterfaceC0231i, InterfaceC1526a<? super Unit>, Object> {
    int label;

    public SingleProcessCoordinator$updateNotifications$1(InterfaceC1526a<? super SingleProcessCoordinator$updateNotifications$1> interfaceC1526a) {
        super(2, interfaceC1526a);
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new SingleProcessCoordinator$updateNotifications$1(interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC0231i interfaceC0231i, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(interfaceC0231i, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1039j.b(obj);
        return Unit.f18162a;
    }
}
