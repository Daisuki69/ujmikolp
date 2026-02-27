package androidx.privacysandbox.ads.adservices.java.internal;

import Bj.K;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineAdapterKt$asListenableFuture$1$1 extends k implements Function1<Throwable, Unit> {
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    final /* synthetic */ K $this_asListenableFuture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer<T> completer, K k8) {
        super(1);
        this.$completer = completer;
        this.$this_asListenableFuture = k8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f18162a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void invoke(Throwable th2) {
        if (th2 == null) {
            this.$completer.set((T) this.$this_asListenableFuture.c());
        } else if (th2 instanceof CancellationException) {
            this.$completer.setCancelled();
        } else {
            this.$completer.setException(th2);
        }
    }
}
