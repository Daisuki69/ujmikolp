package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import n4.RunnableC1918b;

/* JADX INFO: renamed from: ph.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2085j0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19507b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.u f19508d;
    public final boolean e;
    public InterfaceC1486b f;

    public C2085j0(ch.r rVar, long j, TimeUnit timeUnit, ch.u uVar, boolean z4) {
        this.f19506a = rVar;
        this.f19507b = j;
        this.c = timeUnit;
        this.f19508d = uVar;
        this.e = z4;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f.dispose();
        this.f19508d.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        this.f19508d.b(new C.h(this, 29), this.f19507b, this.c);
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19508d.b(new RunnableC1918b(5, this, th2), this.e ? this.f19507b : 0L, this.c);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19508d.b(new RunnableC1918b(6, this, obj), this.f19507b, this.c);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f, interfaceC1486b)) {
            this.f = interfaceC1486b;
            this.f19506a.onSubscribe(this);
        }
    }
}
