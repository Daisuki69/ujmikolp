package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class O1 extends AtomicInteger implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1487c f19292b;
    public final ch.p c;

    public O1(ch.r rVar, C1487c c1487c, ch.p pVar) {
        this.f19291a = rVar;
        this.f19292b = c1487c;
        this.c = pVar;
    }

    @Override // ch.r
    public final void onComplete() {
        try {
            throw null;
        } catch (Throwable th2) {
            of.p.F(th2);
            this.f19291a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19291a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19291a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        C1487c c1487c = this.f19292b;
        c1487c.getClass();
        EnumC1604b.c(c1487c, interfaceC1486b);
    }
}
