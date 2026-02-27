package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class D2 extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2 f19163k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19165b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19166d;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19167g;
    public InterfaceC1486b h;
    public volatile long j;
    public final AtomicReference i = new AtomicReference();
    public final Qh.c e = new Qh.c();

    static {
        C2 c22 = new C2(null, -1L, 1);
        f19163k = c22;
        EnumC1604b.a(c22);
    }

    public D2(int i, ch.r rVar, hh.n nVar, boolean z4) {
        this.f19164a = rVar;
        this.f19165b = nVar;
        this.c = i;
        this.f19166d = z4;
    }

    public final void a() {
        C2 c22;
        AtomicReference atomicReference = this.i;
        C2 c23 = (C2) atomicReference.get();
        C2 c24 = f19163k;
        if (c23 == c24 || (c22 = (C2) atomicReference.getAndSet(c24)) == c24 || c22 == null) {
            return;
        }
        EnumC1604b.a(c22);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.D2.b():void");
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f19167g) {
            return;
        }
        this.f19167g = true;
        this.h.dispose();
        a();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        b();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (!this.f) {
            Qh.c cVar = this.e;
            cVar.getClass();
            if (AbstractC2353d.a(cVar, th2)) {
                if (!this.f19166d) {
                    a();
                }
                this.f = true;
                b();
                return;
            }
        }
        S1.s.r(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        long j = this.j + 1;
        this.j = j;
        C2 c22 = (C2) this.i.get();
        if (c22 != null) {
            EnumC1604b.a(c22);
        }
        try {
            Object objApply = this.f19165b.apply(obj);
            jh.e.b(objApply, "The ObservableSource returned is null");
            ch.p pVar = (ch.p) objApply;
            C2 c23 = new C2(this, j, this.c);
            while (true) {
                C2 c24 = (C2) this.i.get();
                if (c24 == f19163k) {
                    return;
                }
                AtomicReference atomicReference = this.i;
                while (!atomicReference.compareAndSet(c24, c23)) {
                    if (atomicReference.get() != c24) {
                        break;
                    }
                }
                pVar.subscribe(c23);
                return;
            }
        } catch (Throwable th2) {
            of.p.F(th2);
            this.h.dispose();
            onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.h, interfaceC1486b)) {
            this.h = interfaceC1486b;
            this.f19164a.onSubscribe(this);
        }
    }
}
