package androidx.work.impl;

import S1.y;
import androidx.work.ListenableWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerWrapperKt$awaitWithin$2$1 extends k implements Function1<Throwable, Unit> {
    final /* synthetic */ y $this_awaitWithin;
    final /* synthetic */ ListenableWorker $worker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapperKt$awaitWithin$2$1(ListenableWorker listenableWorker, y yVar) {
        super(1);
        this.$worker = listenableWorker;
        this.$this_awaitWithin = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f18162a;
    }

    public final void invoke(Throwable th2) {
        if (th2 instanceof WorkerStoppedException) {
            this.$worker.stop(((WorkerStoppedException) th2).getReason());
        }
        this.$this_awaitWithin.cancel(false);
    }
}
