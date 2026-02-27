package Ih;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends Ph.a implements Ah.e, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.n f2326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2327b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f2328d = new AtomicLong();
    public nk.c e;
    public Fh.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f2329g;
    public volatile boolean h;
    public Throwable i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2331l;

    public t(Ah.n nVar, int i) {
        this.f2326a = nVar;
        this.f2327b = i;
        this.c = i - (i >> 2);
    }

    @Override // Fh.c
    public final int b(int i) {
        this.f2331l = true;
        return 2;
    }

    @Override // nk.c
    public final void cancel() {
        if (this.f2329g) {
            return;
        }
        this.f2329g = true;
        this.e.cancel();
        this.f2326a.dispose();
        if (this.f2331l || getAndIncrement() != 0) {
            return;
        }
        this.f.clear();
    }

    @Override // Fh.g
    public final void clear() {
        this.f.clear();
    }

    public final boolean e(boolean z4, boolean z5, nk.b bVar) {
        if (this.f2329g) {
            clear();
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th2 = this.i;
        if (th2 != null) {
            this.f2329g = true;
            clear();
            bVar.onError(th2);
            this.f2326a.dispose();
            return true;
        }
        if (!z5) {
            return false;
        }
        this.f2329g = true;
        bVar.onComplete();
        this.f2326a.dispose();
        return true;
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public final void i() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f2326a.b(this);
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    @Override // nk.b
    public final void onComplete() {
        if (this.h) {
            return;
        }
        this.h = true;
        i();
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        if (this.h) {
            E1.c.k(th2);
            return;
        }
        this.i = th2;
        this.h = true;
        i();
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (this.h) {
            return;
        }
        if (this.j == 2) {
            i();
            return;
        }
        if (!this.f.offer(obj)) {
            this.e.cancel();
            this.i = new MissingBackpressureException("Queue is full?!");
            this.h = true;
        }
        i();
    }

    @Override // nk.c
    public final void request(long j) {
        if (Ph.d.c(j)) {
            v0.c(this.f2328d, j);
            i();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2331l) {
            g();
        } else if (this.j == 1) {
            h();
        } else {
            f();
        }
    }
}
