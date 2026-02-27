package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final InterfaceC1526a<R> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(InterfaceC1526a<? super R> interfaceC1526a) {
        super(false);
        this.continuation = interfaceC1526a;
    }

    public void onError(E e) {
        if (compareAndSet(false, true)) {
            InterfaceC1526a<R> interfaceC1526a = this.continuation;
            C1037h.a aVar = C1037h.f9166b;
            interfaceC1526a.resumeWith(AbstractC1039j.a(e));
        }
    }

    public void onResult(R r9) {
        if (compareAndSet(false, true)) {
            InterfaceC1526a<R> interfaceC1526a = this.continuation;
            C1037h.a aVar = C1037h.f9166b;
            interfaceC1526a.resumeWith(r9);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
