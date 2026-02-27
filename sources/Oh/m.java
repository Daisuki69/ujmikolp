package oh;

import S1.s;
import ch.r;
import ch.w;
import ch.y;
import fh.InterfaceC1486b;
import hh.n;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import of.p;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AtomicInteger implements r, InterfaceC1486b {
    public static final l i = new l(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f18887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18888b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f18889d = new Qh.c();
    public final AtomicReference e = new AtomicReference();
    public InterfaceC1486b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f18890g;
    public volatile boolean h;

    public m(r rVar, n nVar, boolean z4) {
        this.f18887a = rVar;
        this.f18888b = nVar;
        this.c = z4;
    }

    public final void a() {
        AtomicReference atomicReference = this.e;
        l lVar = i;
        l lVar2 = (l) atomicReference.getAndSet(lVar);
        if (lVar2 == null || lVar2 == lVar) {
            return;
        }
        EnumC1604b.a(lVar2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        r rVar = this.f18887a;
        Qh.c cVar = this.f18889d;
        AtomicReference atomicReference = this.e;
        int iAddAndGet = 1;
        while (!this.h) {
            if (cVar.get() != null && !this.c) {
                rVar.onError(AbstractC2353d.b(cVar));
                return;
            }
            boolean z4 = this.f18890g;
            l lVar = (l) atomicReference.get();
            boolean z5 = lVar == null;
            if (z4 && z5) {
                Throwable thB = AbstractC2353d.b(cVar);
                if (thB != null) {
                    rVar.onError(thB);
                    return;
                } else {
                    rVar.onComplete();
                    return;
                }
            }
            if (z5 || lVar.f18886b == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(lVar, null) && atomicReference.get() == lVar) {
                }
                rVar.onNext(lVar.f18886b);
            }
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.h = true;
        this.f.dispose();
        a();
    }

    @Override // ch.r
    public final void onComplete() {
        this.f18890g = true;
        b();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f18889d;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            s.r(th2);
            return;
        }
        if (!this.c) {
            a();
        }
        this.f18890g = true;
        b();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        l lVar = i;
        AtomicReference atomicReference = this.e;
        l lVar2 = (l) atomicReference.get();
        if (lVar2 != null) {
            EnumC1604b.a(lVar2);
        }
        try {
            Object objApply = this.f18888b.apply(obj);
            jh.e.b(objApply, "The mapper returned a null SingleSource");
            y yVar = (y) objApply;
            l lVar3 = new l(this);
            while (true) {
                l lVar4 = (l) atomicReference.get();
                if (lVar4 == lVar) {
                    return;
                }
                while (!atomicReference.compareAndSet(lVar4, lVar3)) {
                    if (atomicReference.get() != lVar4) {
                        break;
                    }
                }
                ((w) yVar).c(lVar3);
                return;
            }
        } catch (Throwable th2) {
            p.F(th2);
            this.f.dispose();
            atomicReference.getAndSet(lVar);
            onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f, interfaceC1486b)) {
            this.f = interfaceC1486b;
            this.f18887a.onSubscribe(this);
        }
    }
}
