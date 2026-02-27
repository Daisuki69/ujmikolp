package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class K1 extends AtomicBoolean implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L1 f19246b;
    public final J1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1486b f19247d;

    public K1(ch.r rVar, L1 l12, J1 j12) {
        this.f19245a = rVar;
        this.f19246b = l12;
        this.c = j12;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f19247d.dispose();
        if (compareAndSet(false, true)) {
            L1 l12 = this.f19246b;
            J1 j12 = this.c;
            synchronized (l12) {
                try {
                    J1 j13 = l12.c;
                    if (j13 != null && j13 == j12) {
                        long j = j12.f19233b - 1;
                        j12.f19233b = j;
                        if (j == 0 && j12.c) {
                            l12.e(j12);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // ch.r
    public final void onComplete() {
        if (compareAndSet(false, true)) {
            this.f19246b.d(this.c);
            this.f19245a.onComplete();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (!compareAndSet(false, true)) {
            S1.s.r(th2);
        } else {
            this.f19246b.d(this.c);
            this.f19245a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19245a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f19247d, interfaceC1486b)) {
            this.f19247d = interfaceC1486b;
            this.f19245a.onSubscribe(this);
        }
    }
}
