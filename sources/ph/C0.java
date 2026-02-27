package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import kh.InterfaceC1775b;
import kh.InterfaceC1779f;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 extends AtomicReference implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D0 f19139b;
    public volatile boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile InterfaceC1779f f19140d;
    public int e;

    public C0(D0 d02, long j) {
        this.f19138a = j;
        this.f19139b = d02;
    }

    @Override // ch.r
    public final void onComplete() {
        this.c = true;
        this.f19139b.c();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f19139b.h;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            S1.s.r(th2);
            return;
        }
        D0 d02 = this.f19139b;
        if (!d02.c) {
            d02.b();
        }
        this.c = true;
        this.f19139b.c();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.e != 0) {
            this.f19139b.c();
            return;
        }
        D0 d02 = this.f19139b;
        if (d02.get() == 0 && d02.compareAndSet(0, 1)) {
            d02.f19152a.onNext(obj);
            if (d02.decrementAndGet() == 0) {
                return;
            }
        } else {
            InterfaceC1779f cVar = this.f19140d;
            if (cVar == null) {
                cVar = new rh.c(d02.e);
                this.f19140d = cVar;
            }
            cVar.offer(obj);
            if (d02.getAndIncrement() != 0) {
                return;
            }
        }
        d02.d();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.e(this, interfaceC1486b) && (interfaceC1486b instanceof InterfaceC1775b)) {
            InterfaceC1775b interfaceC1775b = (InterfaceC1775b) interfaceC1486b;
            int iB = interfaceC1775b.b(7);
            if (iB == 1) {
                this.e = iB;
                this.f19140d = interfaceC1775b;
                this.c = true;
                this.f19139b.c();
                return;
            }
            if (iB == 2) {
                this.e = iB;
                this.f19140d = interfaceC1775b;
            }
        }
    }
}
