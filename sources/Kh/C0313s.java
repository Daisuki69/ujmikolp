package Kh;

import bg.AbstractC0983W;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Kh.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0313s extends AtomicInteger implements io.reactivex.rxjava3.disposables.b, Ah.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r[] f2749o = new r[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r[] f2750p = new r[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ch.f f2752b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2753d;
    public volatile Fh.f e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Qh.c f2754g = new Qh.c();
    public volatile boolean h;
    public final AtomicReference i;
    public io.reactivex.rxjava3.disposables.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2756l;
    public final ArrayDeque m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2757n;

    public C0313s(Ah.j jVar, Ch.f fVar, int i, int i4) {
        this.f2751a = jVar;
        this.f2752b = fVar;
        this.c = i;
        this.f2753d = i4;
        if (i != Integer.MAX_VALUE) {
            this.m = new ArrayDeque(i);
        }
        this.i = new AtomicReference(f2749o);
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.j, bVar)) {
            this.j = bVar;
            this.f2751a.a(this);
        }
    }

    public final boolean b() {
        if (this.h) {
            return true;
        }
        if (((Throwable) this.f2754g.get()) == null) {
            return false;
        }
        c();
        this.f2754g.b(this.f2751a);
        return true;
    }

    public final boolean c() {
        this.j.dispose();
        AtomicReference atomicReference = this.i;
        r[] rVarArr = f2750p;
        r[] rVarArr2 = (r[]) atomicReference.getAndSet(rVarArr);
        if (rVarArr2 == rVarArr) {
            return false;
        }
        for (r rVar : rVarArr2) {
            rVar.getClass();
            Dh.a.a(rVar);
        }
        return true;
    }

    public final void d() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.h = true;
        if (c()) {
            Qh.c cVar = this.f2754g;
            cVar.getClass();
            Throwable thC = Qh.e.c(cVar);
            if (thC == null || thC == Qh.e.f5385a) {
                return;
            }
            E1.c.k(thC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6 A[PHI: r4
  0x00c6: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00ac, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.C0313s.e():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(r rVar) {
        r[] rVarArr;
        while (true) {
            AtomicReference atomicReference = this.i;
            r[] rVarArr2 = (r[]) atomicReference.get();
            int length = rVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (rVarArr2[i] == rVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                rVarArr = f2749o;
            } else {
                r[] rVarArr3 = new r[length - 1];
                System.arraycopy(rVarArr2, 0, rVarArr3, 0, i);
                System.arraycopy(rVarArr2, i + 1, rVarArr3, i, (length - i) - 1);
                rVarArr = rVarArr3;
            }
            while (!atomicReference.compareAndSet(rVarArr2, rVarArr)) {
                if (atomicReference.get() != rVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Ah.h hVar) {
        boolean z4;
        do {
            z4 = false;
            if (!(hVar instanceof Ch.h)) {
                this.f2755k++;
                r rVar = new r(this);
                while (true) {
                    AtomicReference atomicReference = this.i;
                    r[] rVarArr = (r[]) atomicReference.get();
                    if (rVarArr == f2750p) {
                        Dh.a.a(rVar);
                        return;
                    }
                    int length = rVarArr.length;
                    r[] rVarArr2 = new r[length + 1];
                    System.arraycopy(rVarArr, 0, rVarArr2, 0, length);
                    rVarArr2[length] = rVar;
                    while (!atomicReference.compareAndSet(rVarArr, rVarArr2)) {
                        if (atomicReference.get() != rVarArr) {
                            break;
                        }
                    }
                    hVar.g(rVar);
                    return;
                }
            }
            try {
                Object obj = ((Ch.h) hVar).get();
                if (obj != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.f2751a.onNext(obj);
                        if (decrementAndGet() != 0) {
                        }
                    } else {
                        Fh.f bVar = this.e;
                        if (bVar == null) {
                            bVar = this.c == Integer.MAX_VALUE ? new Mh.b(this.f2753d) : new Mh.a(this.c);
                            this.e = bVar;
                        }
                        bVar.offer(obj);
                        if (getAndIncrement() != 0) {
                            return;
                        }
                    }
                    e();
                }
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                this.f2754g.a(th2);
                d();
            }
            if (this.c == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                try {
                    hVar = (Ah.h) this.m.poll();
                    if (hVar == 0) {
                        this.f2757n--;
                        z4 = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (!z4);
        d();
    }

    public final void h(int i) {
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                return;
            }
            synchronized (this) {
                try {
                    Ah.h hVar = (Ah.h) this.m.poll();
                    if (hVar == null) {
                        this.f2757n--;
                    } else {
                        g(hVar);
                    }
                } finally {
                }
            }
            i = i4;
        }
    }

    @Override // Ah.j
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        d();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (this.f) {
            E1.c.k(th2);
        } else if (this.f2754g.a(th2)) {
            this.f = true;
            d();
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (this.f) {
            return;
        }
        try {
            Object objApply = this.f2752b.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
            Ah.h hVar = (Ah.h) objApply;
            if (this.c != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i = this.f2757n;
                        if (i == this.c) {
                            this.m.offer(hVar);
                            return;
                        }
                        this.f2757n = i + 1;
                    } finally {
                    }
                }
            }
            g(hVar);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            this.j.dispose();
            onError(th2);
        }
    }
}
