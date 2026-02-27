package androidx.room;

import Bj.E;
import Bj.InterfaceC0147j;
import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
public final class CoroutinesRoom$Companion$execute$4$job$1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ InterfaceC0147j $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, InterfaceC0147j interfaceC0147j, InterfaceC1526a<? super CoroutinesRoom$Companion$execute$4$job$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$callable = callable;
        this.$continuation = interfaceC0147j;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1039j.b(obj);
        try {
            Object objCall = this.$callable.call();
            InterfaceC0147j interfaceC0147j = this.$continuation;
            C1037h.a aVar = C1037h.f9166b;
            interfaceC0147j.resumeWith(objCall);
        } catch (Throwable th2) {
            InterfaceC0147j interfaceC0147j2 = this.$continuation;
            C1037h.a aVar2 = C1037h.f9166b;
            interfaceC0147j2.resumeWith(AbstractC1039j.a(th2));
        }
        return Unit.f18162a;
    }
}
