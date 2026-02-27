package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;

/* JADX INFO: renamed from: ph.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2140x0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.i f19681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19682b;
    public InterfaceC1486b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19683d;
    public boolean e;

    public C2140x0(ch.i iVar, long j) {
        this.f19681a = iVar;
        this.f19682b = j;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.c.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f19681a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.e) {
            S1.s.r(th2);
        } else {
            this.e = true;
            this.f19681a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.f19683d;
        if (j != this.f19682b) {
            this.f19683d = j + 1;
            return;
        }
        this.e = true;
        this.c.dispose();
        this.f19681a.onSuccess(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.c, interfaceC1486b)) {
            this.c = interfaceC1486b;
            this.f19681a.onSubscribe(this);
        }
    }
}
