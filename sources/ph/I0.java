package ph;

import ch.AbstractC1103b;
import ch.InterfaceC1104c;
import ch.InterfaceC1105d;
import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class I0 extends AtomicInteger implements InterfaceC1486b, ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1104c f19217a;
    public final hh.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19219d;
    public InterfaceC1486b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19220g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qh.c f19218b = new Qh.c();
    public final C1485a e = new C1485a(0);

    public I0(InterfaceC1104c interfaceC1104c, hh.n nVar, boolean z4) {
        this.f19217a = interfaceC1104c;
        this.c = nVar;
        this.f19219d = z4;
        lazySet(1);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f19220g = true;
        this.f.dispose();
        this.e.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            Qh.c cVar = this.f19218b;
            cVar.getClass();
            Throwable thB = AbstractC2353d.b(cVar);
            InterfaceC1104c interfaceC1104c = this.f19217a;
            if (thB != null) {
                interfaceC1104c.onError(thB);
            } else {
                interfaceC1104c.onComplete();
            }
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f19218b;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            S1.s.r(th2);
            return;
        }
        boolean z4 = this.f19219d;
        InterfaceC1104c interfaceC1104c = this.f19217a;
        if (z4) {
            if (decrementAndGet() == 0) {
                cVar.getClass();
                interfaceC1104c.onError(AbstractC2353d.b(cVar));
                return;
            }
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            cVar.getClass();
            interfaceC1104c.onError(AbstractC2353d.b(cVar));
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        try {
            Object objApply = this.c.apply(obj);
            jh.e.b(objApply, "The mapper returned a null CompletableSource");
            InterfaceC1105d interfaceC1105d = (InterfaceC1105d) objApply;
            getAndIncrement();
            F0 f02 = new F0(this, 1);
            if (this.f19220g || !this.e.a(f02)) {
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
            this.f19217a.onSubscribe(this);
        }
    }
}
