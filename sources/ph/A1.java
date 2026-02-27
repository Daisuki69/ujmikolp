package ph;

import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class A1 extends AtomicReference implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19121a;

    public A1(ch.r rVar, B1 b12) {
        this.f19121a = rVar;
        lazySet(b12);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        B1 b12 = (B1) getAndSet(null);
        if (b12 != null) {
            b12.a(this);
        }
    }
}
