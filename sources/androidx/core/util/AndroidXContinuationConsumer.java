package androidx.core.util;

import bj.C1037h;
import gj.InterfaceC1526a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    private final InterfaceC1526a<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidXContinuationConsumer(InterfaceC1526a<? super T> interfaceC1526a) {
        super(false);
        this.continuation = interfaceC1526a;
    }

    @Override // androidx.core.util.Consumer
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
