package ph;

import ch.AbstractC1103b;
import ch.InterfaceC1105d;
import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import lh.AbstractC1831b;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class G0 extends AbstractC1831b implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19192a;
    public final hh.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19194d;
    public InterfaceC1486b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19195g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qh.c f19193b = new Qh.c();
    public final C1485a e = new C1485a(0);

    public G0(ch.r rVar, hh.n nVar, boolean z4) {
        this.f19192a = rVar;
        this.c = nVar;
        this.f19194d = z4;
        lazySet(1);
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        return 2;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f19195g = true;
        this.f.dispose();
        this.e.dispose();
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return true;
    }

    @Override // ch.r
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            Qh.c cVar = this.f19193b;
            cVar.getClass();
            Throwable thB = AbstractC2353d.b(cVar);
            ch.r rVar = this.f19192a;
            if (thB != null) {
                rVar.onError(thB);
            } else {
                rVar.onComplete();
            }
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f19193b;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            S1.s.r(th2);
            return;
        }
        boolean z4 = this.f19194d;
        ch.r rVar = this.f19192a;
        if (z4) {
            if (decrementAndGet() == 0) {
                cVar.getClass();
                rVar.onError(AbstractC2353d.b(cVar));
                return;
            }
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            cVar.getClass();
            rVar.onError(AbstractC2353d.b(cVar));
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        try {
            Object objApply = this.c.apply(obj);
            jh.e.b(objApply, "The mapper returned a null CompletableSource");
            InterfaceC1105d interfaceC1105d = (InterfaceC1105d) objApply;
            getAndIncrement();
            F0 f02 = new F0(this, 0);
            if (this.f19195g || !this.e.a(f02)) {
                return;
            }
            ((AbstractC1103b) interfaceC1105d).b(f02);
        } catch (Throwable th2) {
            of.p.F(th2);
            this.f.dispose();
            onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f, interfaceC1486b)) {
            this.f = interfaceC1486b;
            this.f19192a.onSubscribe(this);
        }
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        return null;
    }
}
