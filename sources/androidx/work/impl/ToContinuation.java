package androidx.work.impl;

import Bj.InterfaceC0147j;
import S1.y;
import bj.AbstractC1039j;
import bj.C1037h;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
final class ToContinuation<T> implements Runnable {
    private final InterfaceC0147j continuation;
    private final y futureToObserve;

    public ToContinuation(y futureToObserve, InterfaceC0147j continuation) {
        j.g(futureToObserve, "futureToObserve");
        j.g(continuation, "continuation");
        this.futureToObserve = futureToObserve;
        this.continuation = continuation;
    }

    public final InterfaceC0147j getContinuation() {
        return this.continuation;
    }

    public final y getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            this.continuation.a(null);
            return;
        }
        try {
            InterfaceC0147j interfaceC0147j = this.continuation;
            C1037h.a aVar = C1037h.f9166b;
            interfaceC0147j.resumeWith(WorkerWrapperKt.getUninterruptibly(this.futureToObserve));
        } catch (ExecutionException e) {
            InterfaceC0147j interfaceC0147j2 = this.continuation;
            C1037h.a aVar2 = C1037h.f9166b;
            interfaceC0147j2.resumeWith(AbstractC1039j.a(WorkerWrapperKt.nonNullCause(e)));
        }
    }
}
