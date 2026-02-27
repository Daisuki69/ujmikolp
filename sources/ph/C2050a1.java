package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2050a1 extends AtomicReference implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f19406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19407b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2050a1(Y0 y0, boolean z4) {
        this.f19406a = (AtomicInteger) y0;
        this.f19407b = z4;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, ph.Y0] */
    @Override // ch.r
    public final void onComplete() {
        this.f19406a.c(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, ph.Y0] */
    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19406a.b(th2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, ph.Y0] */
    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19406a.e(obj, this.f19407b);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }
}
