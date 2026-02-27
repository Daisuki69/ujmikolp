package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kh.InterfaceC1778e;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 extends AtomicInteger implements InterfaceC1486b, ch.r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0[] f19150q = new C0[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0[] f19151r = new C0[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19153b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19154d;
    public final int e;
    public volatile InterfaceC1778e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19155g;
    public final Qh.c h = new Qh.c();
    public volatile boolean i;
    public final AtomicReference j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC1486b f19156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f19157l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f19159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19160p;

    public D0(int i, int i4, ch.r rVar, hh.n nVar, boolean z4) {
        this.f19152a = rVar;
        this.f19153b = nVar;
        this.c = z4;
        this.f19154d = i;
        this.e = i4;
        if (i != Integer.MAX_VALUE) {
            this.f19159o = new ArrayDeque(i);
        }
        this.j = new AtomicReference(f19150q);
    }

    public final boolean a() {
        if (!this.i) {
            Throwable th2 = (Throwable) this.h.get();
            if (this.c || th2 == null) {
                return false;
            }
            b();
            Qh.c cVar = this.h;
            cVar.getClass();
            Throwable thB = AbstractC2353d.b(cVar);
            if (thB != AbstractC2353d.f20501a) {
                this.f19152a.onError(thB);
            }
        }
        return true;
    }

    public final boolean b() {
        C0[] c0Arr;
        this.f19156k.dispose();
        AtomicReference atomicReference = this.j;
        C0[] c0Arr2 = (C0[]) atomicReference.get();
        C0[] c0Arr3 = f19151r;
        if (c0Arr2 == c0Arr3 || (c0Arr = (C0[]) atomicReference.getAndSet(c0Arr3)) == c0Arr3) {
            return false;
        }
        for (C0 c02 : c0Arr) {
            c02.getClass();
            EnumC1604b.a(c02);
        }
        return true;
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107 A[PHI: r4
  0x0107: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:76:0x00e6, B:88:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.D0.d():void");
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        if (b()) {
            Qh.c cVar = this.h;
            cVar.getClass();
            Throwable thB = AbstractC2353d.b(cVar);
            if (thB == null || thB == AbstractC2353d.f20501a) {
                return;
            }
            S1.s.r(thB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(C0 c02) {
        C0[] c0Arr;
        while (true) {
            AtomicReference atomicReference = this.j;
            C0[] c0Arr2 = (C0[]) atomicReference.get();
            int length = c0Arr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c0Arr2[i] == c02) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c0Arr = f19150q;
            } else {
                C0[] c0Arr3 = new C0[length - 1];
                System.arraycopy(c0Arr2, 0, c0Arr3, 0, i);
                System.arraycopy(c0Arr2, i + 1, c0Arr3, i, (length - i) - 1);
                c0Arr = c0Arr3;
            }
            while (!atomicReference.compareAndSet(c0Arr2, c0Arr)) {
                if (atomicReference.get() != c0Arr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(ch.p pVar) {
        boolean z4;
        do {
            z4 = false;
            if (!(pVar instanceof Callable)) {
                long j = this.f19157l;
                this.f19157l = 1 + j;
                C0 c02 = new C0(this, j);
                while (true) {
                    AtomicReference atomicReference = this.j;
                    C0[] c0Arr = (C0[]) atomicReference.get();
                    if (c0Arr == f19151r) {
                        EnumC1604b.a(c02);
                        return;
                    }
                    int length = c0Arr.length;
                    C0[] c0Arr2 = new C0[length + 1];
                    System.arraycopy(c0Arr, 0, c0Arr2, 0, length);
                    c0Arr2[length] = c02;
                    while (!atomicReference.compareAndSet(c0Arr, c0Arr2)) {
                        if (atomicReference.get() != c0Arr) {
                            break;
                        }
                    }
                    pVar.subscribe(c02);
                    return;
                }
            }
            try {
                Object objCall = ((Callable) pVar).call();
                if (objCall != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.f19152a.onNext(objCall);
                        if (decrementAndGet() != 0) {
                            d();
                        }
                    } else {
                        InterfaceC1778e cVar = this.f;
                        if (cVar == null) {
                            cVar = this.f19154d == Integer.MAX_VALUE ? new rh.c(this.e) : new rh.b(this.f19154d);
                            this.f = cVar;
                        }
                        if (cVar.offer(objCall)) {
                            if (getAndIncrement() != 0) {
                                return;
                            }
                            d();
                        } else {
                            onError(new IllegalStateException("Scalar queue full?!"));
                        }
                    }
                }
            } catch (Throwable th2) {
                of.p.F(th2);
                Qh.c cVar2 = this.h;
                cVar2.getClass();
                AbstractC2353d.a(cVar2, th2);
                c();
            }
            if (this.f19154d == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                try {
                    pVar = (ch.p) this.f19159o.poll();
                    if (pVar == null) {
                        this.f19160p--;
                        z4 = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (!z4);
        c();
    }

    public final void g(int i) {
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                return;
            }
            synchronized (this) {
                try {
                    ch.p pVar = (ch.p) this.f19159o.poll();
                    if (pVar == null) {
                        this.f19160p--;
                    } else {
                        f(pVar);
                    }
                } finally {
                }
            }
            i = i4;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19155g) {
            return;
        }
        this.f19155g = true;
        c();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f19155g) {
            S1.s.r(th2);
            return;
        }
        Qh.c cVar = this.h;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            S1.s.r(th2);
        } else {
            this.f19155g = true;
            c();
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19155g) {
            return;
        }
        try {
            Object objApply = this.f19153b.apply(obj);
            jh.e.b(objApply, "The mapper returned a null ObservableSource");
            ch.p pVar = (ch.p) objApply;
            if (this.f19154d != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i = this.f19160p;
                        if (i == this.f19154d) {
                            this.f19159o.offer(pVar);
                            return;
                        }
                        this.f19160p = i + 1;
                    } finally {
                    }
                }
            }
            f(pVar);
        } catch (Throwable th2) {
            of.p.F(th2);
            this.f19156k.dispose();
            onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f19156k, interfaceC1486b)) {
            this.f19156k = interfaceC1486b;
            this.f19152a.onSubscribe(this);
        }
    }
}
