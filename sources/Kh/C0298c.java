package Kh;

import bg.AbstractC0983W;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import w.C2360b;

/* JADX INFO: renamed from: Kh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0298c extends AtomicInteger implements io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2360b f2719b;
    public final C0297b[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f2720d;
    public final Mh.b e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f2721g;
    public final Qh.c h = new Qh.c();
    public int i;
    public int j;

    public C0298c(Ah.j jVar, C2360b c2360b, int i, int i4) {
        this.f2718a = jVar;
        this.f2719b = c2360b;
        this.f2720d = new Object[i];
        C0297b[] c0297bArr = new C0297b[i];
        for (int i6 = 0; i6 < i; i6++) {
            c0297bArr[i6] = new C0297b(this, i6, 0);
        }
        this.c = c0297bArr;
        this.e = new Mh.b(i4);
    }

    public final void a() {
        for (C0297b c0297b : this.c) {
            c0297b.getClass();
            Dh.a.a(c0297b);
        }
    }

    public final void b(Mh.b bVar) {
        synchronized (this) {
            this.f2720d = null;
        }
        bVar.clear();
    }

    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        Mh.b bVar = this.e;
        Ah.j jVar = this.f2718a;
        int iAddAndGet = 1;
        while (!this.f) {
            if (this.h.get() != null) {
                a();
                b(bVar);
                this.h.b(jVar);
                return;
            }
            boolean z4 = this.f2721g;
            Object[] objArr = (Object[]) bVar.poll();
            boolean z5 = objArr == null;
            if (z4 && z5) {
                b(bVar);
                this.h.b(jVar);
                return;
            }
            if (z5) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    Object objApply = this.f2719b.apply(objArr);
                    Objects.requireNonNull(objApply, "The combiner returned a null value");
                    jVar.onNext(objApply);
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    this.h.a(th2);
                    a();
                    b(bVar);
                    this.h.b(jVar);
                    return;
                }
            }
        }
        b(bVar);
        Qh.c cVar = this.h;
        cVar.getClass();
        Throwable thC = Qh.e.c(cVar);
        if (thC == null || thC == Qh.e.f5385a) {
            return;
        }
        E1.c.k(thC);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        c();
    }
}
