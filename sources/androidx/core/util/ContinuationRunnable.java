package androidx.core.util;

import bj.C1037h;
import gj.InterfaceC1526a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final InterfaceC1526a<Unit> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(InterfaceC1526a<? super Unit> interfaceC1526a) {
        super(false);
        this.continuation = interfaceC1526a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            InterfaceC1526a<Unit> interfaceC1526a = this.continuation;
            C1037h.a aVar = C1037h.f9166b;
            interfaceC1526a.resumeWith(Unit.f18162a);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
