package ph;

import java.util.concurrent.atomic.AtomicReference;
import vh.C2356g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class R1 extends AtomicReference implements W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U1 f19324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19325b;

    public R1() {
        U1 u12 = new U1(null);
        this.f19324a = u12;
        set(u12);
    }

    @Override // ph.W1
    public final void a(T1 t12) {
        if (t12.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            U1 u1D = (U1) t12.c;
            if (u1D == null) {
                u1D = d();
                t12.c = u1D;
            }
            while (!t12.f19346d) {
                U1 u12 = (U1) u1D.get();
                if (u12 != null) {
                    Object objE = e(u12.f19353a);
                    ch.r rVar = t12.f19345b;
                    if (objE == vh.h.f20506a) {
                        rVar.onComplete();
                    } else if (objE instanceof C2356g) {
                        rVar.onError(((C2356g) objE).f20505a);
                    } else {
                        rVar.onNext(objE);
                        u1D = u12;
                    }
                    t12.c = null;
                    return;
                }
                t12.c = u1D;
                iAddAndGet = t12.addAndGet(-iAddAndGet);
            }
            t12.c = null;
            return;
        } while (iAddAndGet != 0);
    }

    public Object b(Object obj) {
        return obj;
    }

    @Override // ph.W1
    public final void c(Object obj) {
        U1 u12 = new U1(b(obj));
        this.f19324a.set(u12);
        this.f19324a = u12;
        this.f19325b++;
        f();
    }

    @Override // ph.W1
    public final void complete() {
        U1 u12 = new U1(b(vh.h.f20506a));
        this.f19324a.set(u12);
        this.f19324a = u12;
        this.f19325b++;
        g();
    }

    public U1 d() {
        return (U1) get();
    }

    public Object e(Object obj) {
        return obj;
    }

    @Override // ph.W1
    public final void error(Throwable th2) {
        U1 u12 = new U1(b(new C2356g(th2)));
        this.f19324a.set(u12);
        this.f19324a = u12;
        this.f19325b++;
        g();
    }

    public abstract void f();

    public void g() {
        U1 u12 = (U1) get();
        if (u12.f19353a != null) {
            U1 u13 = new U1(null);
            u13.lazySet(u12.get());
            set(u13);
        }
    }
}
