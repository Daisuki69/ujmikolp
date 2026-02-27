package ph;

import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2137w1 extends AtomicReference implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19676a;

    public C2137w1(ch.r rVar) {
        this.f19676a = rVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((C2141x1) andSet).b(this);
    }
}
