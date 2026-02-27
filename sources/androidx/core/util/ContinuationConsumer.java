package androidx.core.util;

import androidx.annotation.RequiresApi;
import bj.C1037h;
import gj.InterfaceC1526a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {
    private final InterfaceC1526a<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(InterfaceC1526a<? super T> interfaceC1526a) {
        super(false);
        this.continuation = interfaceC1526a;
    }

    @Override // java.util.function.Consumer
    public void accept(T t5) {
        if (compareAndSet(false, true)) {
            InterfaceC1526a<T> interfaceC1526a = this.continuation;
            C1037h.a aVar = C1037h.f9166b;
            interfaceC1526a.resumeWith(t5);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
