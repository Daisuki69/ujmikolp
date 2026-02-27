package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class Z0 extends AtomicReference implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f19395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19396b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public Z0(Y0 y0, boolean z4, int i) {
        this.f19395a = (AtomicInteger) y0;
        this.f19396b = z4;
        this.c = i;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, ph.Y0] */
    @Override // ch.r
    public final void onComplete() {
        this.f19395a.a(this.f19396b, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, ph.Y0] */
    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19395a.d(th2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.atomic.AtomicInteger, ph.Y0] */
    @Override // ch.r
    public final void onNext(Object obj) {
        if (EnumC1604b.a(this)) {
            this.f19395a.a(this.f19396b, this);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }
}
