package androidx.room;

import Bj.E;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
public final class CoroutinesRoom$Companion$execute$2<R> extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super R>, Object> {
    final /* synthetic */ Callable<R> $callable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$2(Callable<R> callable, InterfaceC1526a<? super CoroutinesRoom$Companion$execute$2> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$callable = callable;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new CoroutinesRoom$Companion$execute$2(this.$callable, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super R> interfaceC1526a) {
        return ((CoroutinesRoom$Companion$execute$2) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1039j.b(obj);
        return this.$callable.call();
    }
}
