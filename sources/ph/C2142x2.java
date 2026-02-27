package ph;

import fh.InterfaceC1486b;
import ih.C1603a;
import ih.EnumC1604b;
import xh.C2479c;

/* JADX INFO: renamed from: ph.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2142x2 implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1603a f19687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2146y2 f19688b;
    public final C2479c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1486b f19689d;

    public C2142x2(C1603a c1603a, C2146y2 c2146y2, C2479c c2479c) {
        this.f19687a = c1603a;
        this.f19688b = c2146y2;
        this.c = c2479c;
    }

    @Override // ch.r
    public final void onComplete() {
        this.f19688b.f19697d = true;
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19687a.dispose();
        this.c.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19689d.dispose();
        this.f19688b.f19697d = true;
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f19689d, interfaceC1486b)) {
            this.f19689d = interfaceC1486b;
            this.f19687a.a(1, interfaceC1486b);
        }
    }
}
