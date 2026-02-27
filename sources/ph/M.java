package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends AtomicInteger implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19265b;
    public final L[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f19266d;
    public final rh.c e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19267g;
    public volatile boolean h;
    public final Qh.c i = new Qh.c();
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19268k;

    public M(int i, int i4, ch.r rVar, hh.n nVar, boolean z4) {
        this.f19264a = rVar;
        this.f19265b = nVar;
        this.f = z4;
        this.f19266d = new Object[i];
        L[] lArr = new L[i];
        for (int i6 = 0; i6 < i; i6++) {
            lArr[i6] = new L(this, i6);
        }
        this.c = lArr;
        this.e = new rh.c(i4);
    }

    public final void a() {
        for (L l6 : this.c) {
            l6.getClass();
            EnumC1604b.a(l6);
        }
    }

    public final void b(rh.c cVar) {
        synchronized (this) {
            this.f19266d = null;
        }
        cVar.clear();
    }

    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        rh.c cVar = this.e;
        ch.r rVar = this.f19264a;
        boolean z4 = this.f;
        int iAddAndGet = 1;
        while (!this.f19267g) {
            if (!z4 && this.i.get() != null) {
                a();
                b(cVar);
                Qh.c cVar2 = this.i;
                cVar2.getClass();
                rVar.onError(AbstractC2353d.b(cVar2));
                return;
            }
            boolean z5 = this.h;
            Object[] objArr = (Object[]) cVar.poll();
            boolean z8 = objArr == null;
            if (z5 && z8) {
                b(cVar);
                Qh.c cVar3 = this.i;
                cVar3.getClass();
                Throwable thB = AbstractC2353d.b(cVar3);
                if (thB == null) {
                    rVar.onComplete();
                    return;
                } else {
                    rVar.onError(thB);
                    return;
                }
            }
            if (z8) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    Object objApply = this.f19265b.apply(objArr);
                    jh.e.b(objApply, "The combiner returned a null value");
                    rVar.onNext(objApply);
                } catch (Throwable th2) {
                    of.p.F(th2);
                    Qh.c cVar4 = this.i;
                    cVar4.getClass();
                    AbstractC2353d.a(cVar4, th2);
                    a();
                    b(cVar);
                    Qh.c cVar5 = this.i;
                    cVar5.getClass();
                    rVar.onError(AbstractC2353d.b(cVar5));
                    return;
                }
            }
        }
        b(cVar);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f19267g) {
            return;
        }
        this.f19267g = true;
        a();
        if (getAndIncrement() == 0) {
            b(this.e);
        }
    }
}
