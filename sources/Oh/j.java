package oh;

import S1.s;
import ch.AbstractC1109h;
import ch.r;
import fh.InterfaceC1486b;
import hh.n;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import of.p;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends AtomicInteger implements r, InterfaceC1486b {
    public static final i i = new i(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f18878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18879b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f18880d = new Qh.c();
    public final AtomicReference e = new AtomicReference();
    public InterfaceC1486b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f18881g;
    public volatile boolean h;

    public j(r rVar, n nVar, boolean z4) {
        this.f18878a = rVar;
        this.f18879b = nVar;
        this.c = z4;
    }

    public final void a() {
        AtomicReference atomicReference = this.e;
        i iVar = i;
        i iVar2 = (i) atomicReference.getAndSet(iVar);
        if (iVar2 == null || iVar2 == iVar) {
            return;
        }
        EnumC1604b.a(iVar2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        r rVar = this.f18878a;
        Qh.c cVar = this.f18880d;
        AtomicReference atomicReference = this.e;
        int iAddAndGet = 1;
        while (!this.h) {
            if (cVar.get() != null && !this.c) {
                rVar.onError(AbstractC2353d.b(cVar));
                return;
            }
            boolean z4 = this.f18881g;
            i iVar = (i) atomicReference.get();
            boolean z5 = iVar == null;
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
            if (z5 || iVar.f18877b == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(iVar, null) && atomicReference.get() == iVar) {
                }
                rVar.onNext(iVar.f18877b);
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
        this.f18881g = true;
        b();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f18880d;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            s.r(th2);
            return;
        }
        if (!this.c) {
            a();
        }
        this.f18881g = true;
        b();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        i iVar = i;
        AtomicReference atomicReference = this.e;
        i iVar2 = (i) atomicReference.get();
        if (iVar2 != null) {
            EnumC1604b.a(iVar2);
        }
        try {
            Object objApply = this.f18879b.apply(obj);
            jh.e.b(objApply, "The mapper returned a null MaybeSource");
            ch.j jVar = (ch.j) objApply;
            i iVar3 = new i(this);
            while (true) {
                i iVar4 = (i) atomicReference.get();
                if (iVar4 == iVar) {
                    return;
                }
                while (!atomicReference.compareAndSet(iVar4, iVar3)) {
                    if (atomicReference.get() != iVar4) {
                        break;
                    }
                }
                ((AbstractC1109h) jVar).b(iVar3);
                return;
            }
        } catch (Throwable th2) {
            p.F(th2);
            this.f.dispose();
            atomicReference.getAndSet(iVar);
            onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f, interfaceC1486b)) {
            this.f = interfaceC1486b;
            this.f18878a.onSubscribe(this);
        }
    }
}
