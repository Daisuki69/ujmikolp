package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r3 implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3 f19622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh.c f19623b;
    public volatile boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f19624d;
    public final AtomicReference e = new AtomicReference();

    public r3(q3 q3Var, int i) {
        this.f19622a = q3Var;
        this.f19623b = new rh.c(i);
    }

    @Override // ch.r
    public final void onComplete() {
        this.c = true;
        this.f19622a.b();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19624d = th2;
        this.c = true;
        this.f19622a.b();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19623b.offer(obj);
        this.f19622a.b();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.e, interfaceC1486b);
    }
}
