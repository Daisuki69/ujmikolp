package Ih;

import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Ph.a implements Ah.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.e f2311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ch.f f2312b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2313d;
    public nk.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Fh.g f2314g;
    public volatile boolean h;
    public volatile boolean i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Iterator f2315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2316l;
    public int m;
    public final AtomicReference j = new AtomicReference();
    public final AtomicLong e = new AtomicLong();

    public m(Ah.e eVar, Ch.f fVar, int i) {
        this.f2311a = eVar;
        this.f2312b = fVar;
        this.c = i;
        this.f2313d = i - (i >> 2);
    }

    @Override // Fh.c
    public final int b(int i) {
        return this.m == 1 ? 1 : 0;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (Ph.d.d(this.f, cVar)) {
            this.f = cVar;
            if (cVar instanceof Fh.d) {
                Fh.d dVar = (Fh.d) cVar;
                int iB = dVar.b(3);
                if (iB == 1) {
                    this.m = iB;
                    this.f2314g = dVar;
                    this.h = true;
                    this.f2311a.c(this);
                    return;
                }
                if (iB == 2) {
                    this.m = iB;
                    this.f2314g = dVar;
                    this.f2311a.c(this);
                    cVar.request(this.c);
                    return;
                }
            }
            this.f2314g = new Mh.a(this.c);
            this.f2311a.c(this);
            cVar.request(this.c);
        }
    }

    @Override // nk.c
    public final void cancel() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f.cancel();
        if (getAndIncrement() == 0) {
            this.f2314g.clear();
        }
    }

    @Override // Fh.g
    public final void clear() {
        this.f2315k = null;
        this.f2314g.clear();
    }

    public final boolean e(boolean z4, boolean z5, Ah.e eVar, Fh.g gVar) {
        if (this.i) {
            this.f2315k = null;
            gVar.clear();
            return true;
        }
        if (!z4) {
            return false;
        }
        if (((Throwable) this.j.get()) == null) {
            if (!z5) {
                return false;
            }
            eVar.onComplete();
            return true;
        }
        Throwable thC = Qh.e.c(this.j);
        this.f2315k = null;
        gVar.clear();
        eVar.onError(thC);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        int i;
        long j;
        if (getAndIncrement() != 0) {
            return;
        }
        Ah.e eVar = this.f2311a;
        Fh.g gVar = this.f2314g;
        int i4 = 1;
        boolean z4 = this.m != 1;
        Iterator it = this.f2315k;
        int iAddAndGet = 1;
        while (true) {
            if (it == null) {
                boolean z5 = this.h;
                try {
                    Object objPoll = gVar.poll();
                    if (e(z5, objPoll == null ? i4 : 0, eVar, gVar)) {
                        return;
                    }
                    if (objPoll != null) {
                        try {
                            it = ((Iterable) this.f2312b.apply(objPoll)).iterator();
                            if (it.hasNext()) {
                                this.f2315k = it;
                            } else {
                                if (z4) {
                                    int i6 = this.f2316l + i4;
                                    if (i6 == this.f2313d) {
                                        this.f2316l = 0;
                                        this.f.request(i6);
                                    } else {
                                        this.f2316l = i6;
                                    }
                                }
                                it = null;
                            }
                        } catch (Throwable th2) {
                            AbstractC0983W.G(th2);
                            this.f.cancel();
                            Qh.e.a(this.j, th2);
                            eVar.onError(Qh.e.c(this.j));
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    AbstractC0983W.G(th3);
                    this.f.cancel();
                    Qh.e.a(this.j, th3);
                    Throwable thC = Qh.e.c(this.j);
                    this.f2315k = null;
                    gVar.clear();
                    eVar.onError(thC);
                    return;
                }
            }
            if (it != null) {
                long j6 = this.e.get();
                long j7 = 0;
                while (true) {
                    if (j7 == j6) {
                        i = i4;
                        j = 0;
                        break;
                    }
                    if (e(this.h, false, eVar, gVar)) {
                        return;
                    }
                    try {
                        Object next = it.next();
                        i = i4;
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        eVar.onNext(next);
                        if (e(this.h, false, eVar, gVar)) {
                            return;
                        }
                        j7++;
                        try {
                            if (it.hasNext()) {
                                i4 = i;
                            } else {
                                if (z4) {
                                    int i10 = this.f2316l + 1;
                                    if (i10 == this.f2313d) {
                                        this.f2316l = 0;
                                        j = 0;
                                        this.f.request(i10);
                                    } else {
                                        j = 0;
                                        this.f2316l = i10;
                                    }
                                } else {
                                    j = 0;
                                }
                                this.f2315k = null;
                                it = null;
                            }
                        } catch (Throwable th4) {
                            AbstractC0983W.G(th4);
                            this.f2315k = null;
                            this.f.cancel();
                            Qh.e.a(this.j, th4);
                            eVar.onError(Qh.e.c(this.j));
                            return;
                        }
                    } catch (Throwable th5) {
                        AbstractC0983W.G(th5);
                        this.f2315k = null;
                        this.f.cancel();
                        Qh.e.a(this.j, th5);
                        eVar.onError(Qh.e.c(this.j));
                        return;
                    }
                }
                if (j7 == j6) {
                    if (e(this.h, (gVar.isEmpty() && it == null) ? i : 0, eVar, gVar)) {
                        return;
                    }
                }
                if (j7 != j && j6 != Long.MAX_VALUE) {
                    this.e.addAndGet(-j7);
                }
                if (it != null) {
                }
                i4 = i;
            } else {
                i = i4;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            i4 = i;
        }
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return this.f2315k == null && this.f2314g.isEmpty();
    }

    @Override // nk.b
    public final void onComplete() {
        if (this.h) {
            return;
        }
        this.h = true;
        f();
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        if (this.h || !Qh.e.a(this.j, th2)) {
            E1.c.k(th2);
        } else {
            this.h = true;
            f();
        }
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (this.h) {
            return;
        }
        if (this.m != 0 || this.f2314g.offer(obj)) {
            f();
        } else {
            onError(new MissingBackpressureException("Queue is full?!"));
        }
    }

    @Override // Fh.g
    public final Object poll() {
        Iterator it = this.f2315k;
        while (true) {
            if (it == null) {
                Object objPoll = this.f2314g.poll();
                if (objPoll != null) {
                    it = ((Iterable) this.f2312b.apply(objPoll)).iterator();
                    if (it.hasNext()) {
                        this.f2315k = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f2315k = null;
        }
        return next;
    }

    @Override // nk.c
    public final void request(long j) {
        if (Ph.d.c(j)) {
            v0.c(this.e, j);
            f();
        }
    }
}
