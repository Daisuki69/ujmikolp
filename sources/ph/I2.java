package ph;

import a.AbstractC0617a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class I2 extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19225b = new AtomicReference();
    public final P1 c = new P1(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f19226d = new Qh.c();

    public I2(ch.r rVar) {
        this.f19224a = rVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.f19225b);
        EnumC1604b.a(this.c);
    }

    @Override // ch.r
    public final void onComplete() {
        EnumC1604b.a(this.c);
        AbstractC0617a.H(this.f19224a, this, this.f19226d);
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        EnumC1604b.a(this.c);
        AbstractC0617a.I(this.f19224a, th2, this, this.f19226d);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        AbstractC0617a.J(this.f19224a, obj, this, this.f19226d);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.f19225b, interfaceC1486b);
    }
}
