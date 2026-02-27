package ph;

import a.AbstractC0617a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import oh.C1979a;

/* JADX INFO: renamed from: ph.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2114q1 extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19603b = new AtomicReference();
    public final C1979a c = new C1979a(this, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f19604d = new Qh.c();
    public volatile boolean e;
    public volatile boolean f;

    public C2114q1(ch.r rVar) {
        this.f19602a = rVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.f19603b);
        EnumC1604b.a(this.c);
    }

    @Override // ch.r
    public final void onComplete() {
        this.e = true;
        if (this.f) {
            AbstractC0617a.H(this.f19602a, this, this.f19604d);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        EnumC1604b.a(this.c);
        AbstractC0617a.I(this.f19602a, th2, this, this.f19604d);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        AbstractC0617a.J(this.f19602a, obj, this, this.f19604d);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.f19603b, interfaceC1486b);
    }
}
