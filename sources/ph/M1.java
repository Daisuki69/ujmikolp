package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class M1 extends AtomicInteger implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1487c f19273b;
    public final ch.p c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19274d;

    public M1(ch.r rVar, long j, C1487c c1487c, ch.p pVar) {
        this.f19272a = rVar;
        this.f19273b = c1487c;
        this.c = pVar;
        this.f19274d = j;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f19273b.a()) {
                this.c.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // ch.r
    public final void onComplete() {
        long j = this.f19274d;
        if (j != Long.MAX_VALUE) {
            this.f19274d = j - 1;
        }
        if (j != 0) {
            a();
        } else {
            this.f19272a.onComplete();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19272a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19272a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        C1487c c1487c = this.f19273b;
        c1487c.getClass();
        EnumC1604b.c(c1487c, interfaceC1486b);
    }
}
