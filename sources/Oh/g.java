package oh;

import S1.s;
import ch.AbstractC1103b;
import ch.InterfaceC1104c;
import ch.InterfaceC1105d;
import ch.r;
import fh.InterfaceC1486b;
import hh.n;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import of.p;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements r, InterfaceC1486b {
    public static final f h = new f(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1104c f18870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18871b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f18872d = new Qh.c();
    public final AtomicReference e = new AtomicReference();
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1486b f18873g;

    public g(InterfaceC1104c interfaceC1104c, n nVar, boolean z4) {
        this.f18870a = interfaceC1104c;
        this.f18871b = nVar;
        this.c = z4;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f18873g.dispose();
        AtomicReference atomicReference = this.e;
        f fVar = h;
        f fVar2 = (f) atomicReference.getAndSet(fVar);
        if (fVar2 == null || fVar2 == fVar) {
            return;
        }
        EnumC1604b.a(fVar2);
    }

    @Override // ch.r
    public final void onComplete() {
        this.f = true;
        if (this.e.get() == null) {
            Qh.c cVar = this.f18872d;
            cVar.getClass();
            Throwable thB = AbstractC2353d.b(cVar);
            if (thB == null) {
                this.f18870a.onComplete();
            } else {
                this.f18870a.onError(thB);
            }
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f18872d;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            s.r(th2);
            return;
        }
        if (this.c) {
            onComplete();
            return;
        }
        AtomicReference atomicReference = this.e;
        f fVar = h;
        f fVar2 = (f) atomicReference.getAndSet(fVar);
        if (fVar2 != null && fVar2 != fVar) {
            EnumC1604b.a(fVar2);
        }
        Throwable thB = AbstractC2353d.b(cVar);
        if (thB != AbstractC2353d.f20501a) {
            this.f18870a.onError(thB);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        try {
            Object objApply = this.f18871b.apply(obj);
            jh.e.b(objApply, "The mapper returned a null CompletableSource");
            InterfaceC1105d interfaceC1105d = (InterfaceC1105d) objApply;
            f fVar = new f(this);
            while (true) {
                AtomicReference atomicReference = this.e;
                f fVar2 = (f) atomicReference.get();
                if (fVar2 == h) {
                    return;
                }
                while (!atomicReference.compareAndSet(fVar2, fVar)) {
                    if (atomicReference.get() != fVar2) {
                        break;
                    }
                }
                if (fVar2 != null) {
                    EnumC1604b.a(fVar2);
                }
                ((AbstractC1103b) interfaceC1105d).b(fVar);
                return;
            }
        } catch (Throwable th2) {
            p.F(th2);
            this.f18873g.dispose();
            onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f18873g, interfaceC1486b)) {
            this.f18873g = interfaceC1486b;
            this.f18870a.onSubscribe(this);
        }
    }
}
