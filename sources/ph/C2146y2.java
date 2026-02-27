package ph;

import fh.InterfaceC1486b;
import ih.C1603a;
import ih.EnumC1604b;
import xh.C2479c;

/* JADX INFO: renamed from: ph.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2146y2 implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2479c f19695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1603a f19696b;
    public InterfaceC1486b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f19697d;
    public boolean e;

    public C2146y2(C2479c c2479c, C1603a c1603a) {
        this.f19695a = c2479c;
        this.f19696b = c1603a;
    }

    @Override // ch.r
    public final void onComplete() {
        this.f19696b.dispose();
        this.f19695a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19696b.dispose();
        this.f19695a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.e) {
            this.f19695a.onNext(obj);
        } else if (this.f19697d) {
            this.e = true;
            this.f19695a.onNext(obj);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.c, interfaceC1486b)) {
            this.c = interfaceC1486b;
            this.f19696b.a(0, interfaceC1486b);
        }
    }
}
