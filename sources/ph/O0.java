package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import lh.C1835f;

/* JADX INFO: loaded from: classes4.dex */
public final class O0 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19288a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19289b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19290d;

    public O0(long j, TimeUnit timeUnit, ch.v vVar) {
        this.f19289b = j;
        this.c = timeUnit;
        this.f19290d = vVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19288a) {
            case 0:
                C1835f c1835f = new C1835f(rVar);
                rVar.onSubscribe(c1835f);
                if (!c1835f.c()) {
                    try {
                        TimeUnit timeUnit = this.c;
                        Future future = (Future) this.f19290d;
                        Object obj = timeUnit != null ? future.get(this.f19289b, timeUnit) : future.get();
                        jh.e.b(obj, "Future returned null");
                        c1835f.a(obj);
                    } catch (Throwable th2) {
                        of.p.F(th2);
                        if (c1835f.c()) {
                            return;
                        }
                        rVar.onError(th2);
                        return;
                    }
                }
                break;
            default:
                T2 t22 = new T2(rVar);
                rVar.onSubscribe(t22);
                InterfaceC1486b interfaceC1486bE = ((ch.v) this.f19290d).e(t22, this.f19289b, this.c);
                while (!t22.compareAndSet(null, interfaceC1486bE)) {
                    if (t22.get() != null) {
                        if (t22.get() == EnumC1604b.f17147a) {
                            interfaceC1486bE.dispose();
                        }
                        break;
                    }
                }
                break;
        }
    }

    public O0(Future future, long j, TimeUnit timeUnit) {
        this.f19290d = future;
        this.f19289b = j;
        this.c = timeUnit;
    }
}
