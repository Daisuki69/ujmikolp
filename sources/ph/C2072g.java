package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import vh.C2356g;

/* JADX INFO: renamed from: ph.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2072g implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1486b f19469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f19470b;

    @Override // ch.r
    public final void onComplete() {
        this.f19470b = vh.h.f20506a;
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19470b = new C2356g(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19470b = obj;
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        InterfaceC1486b interfaceC1486b2 = this.f19469a;
        jh.e.b(interfaceC1486b, "next is null");
        if (interfaceC1486b2 == null) {
            this.f19469a = interfaceC1486b;
            return;
        }
        interfaceC1486b.dispose();
        if (interfaceC1486b2 != EnumC1604b.f17147a) {
            Xh.i.A(C2072g.class);
        }
    }
}
