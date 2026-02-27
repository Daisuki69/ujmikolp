package androidx.work;

import Bj.E;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
public final class ListenableFutureKt$launchFuture$1$2 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ Function2<E, InterfaceC1526a<? super T>, Object> $block;
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$launchFuture$1$2(Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> function2, CallbackToFutureAdapter.Completer<T> completer, InterfaceC1526a<? super ListenableFutureKt$launchFuture$1$2> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$block = function2;
        this.$completer = completer;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        ListenableFutureKt$launchFuture$1$2 listenableFutureKt$launchFuture$1$2 = new ListenableFutureKt$launchFuture$1$2(this.$block, this.$completer, interfaceC1526a);
        listenableFutureKt$launchFuture$1$2.L$0 = obj;
        return listenableFutureKt$launchFuture$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((ListenableFutureKt$launchFuture$1$2) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                E e = (E) this.L$0;
                Function2<E, InterfaceC1526a<? super T>, Object> function2 = this.$block;
                this.label = 1;
                obj = function2.invoke(e, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            this.$completer.set((T) obj);
        } catch (CancellationException unused) {
            this.$completer.setCancelled();
        } catch (Throwable th2) {
            this.$completer.setException(th2);
        }
        return Unit.f18162a;
    }
}
