package Bj;

import ij.AbstractC1609c;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class G0 extends Gj.q implements Runnable {
    public final long e;

    public G0(long j, AbstractC1609c abstractC1609c) {
        super(abstractC1609c, abstractC1609c.getContext());
        this.e = j;
    }

    @Override // Bj.u0
    public final String V() {
        return super.V() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        O.d(this.c);
        B(new TimeoutCancellationException(We.s.h(this.e, " ms", new StringBuilder("Timed out waiting for ")), this));
    }
}
