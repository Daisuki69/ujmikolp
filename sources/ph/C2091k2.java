package ph;

import java.util.concurrent.atomic.AtomicInteger;
import xh.C2479c;

/* JADX INFO: renamed from: ph.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2091k2 extends AbstractC2099m2 {
    public final AtomicInteger e;
    public volatile boolean f;

    public C2091k2(C2479c c2479c, ch.p pVar) {
        super(c2479c, pVar);
        this.e = new AtomicInteger();
    }

    @Override // ph.AbstractC2099m2
    public final void a() {
        this.f = true;
        if (this.e.getAndIncrement() == 0) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f19553a.onNext(andSet);
            }
            this.f19553a.onComplete();
        }
    }

    @Override // ph.AbstractC2099m2
    public final void b() {
        if (this.e.getAndIncrement() == 0) {
            do {
                boolean z4 = this.f;
                Object andSet = getAndSet(null);
                if (andSet != null) {
                    this.f19553a.onNext(andSet);
                }
                if (z4) {
                    this.f19553a.onComplete();
                    return;
                }
            } while (this.e.decrementAndGet() != 0);
        }
    }
}
