package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class L2 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f19262b;
    public final ch.v c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19263d;
    public InterfaceC1486b e;

    public L2(ch.r rVar, TimeUnit timeUnit, ch.v vVar) {
        this.f19261a = rVar;
        this.c = vVar;
        this.f19262b = timeUnit;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.e.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        this.f19261a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19261a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        ch.v vVar = this.c;
        TimeUnit timeUnit = this.f19262b;
        long jC = vVar.c(timeUnit);
        long j = this.f19263d;
        this.f19263d = jC;
        this.f19261a.onNext(new Vh.g(obj, jC - j, timeUnit));
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.e, interfaceC1486b)) {
            this.e = interfaceC1486b;
            this.f19263d = this.c.c(this.f19262b);
            this.f19261a.onSubscribe(this);
        }
    }
}
