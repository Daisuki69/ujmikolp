package mh;

import ch.InterfaceC1108g;
import ch.r;
import fh.InterfaceC1486b;

/* JADX INFO: renamed from: mh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1865b implements r, nk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1108g f18423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1486b f18424b;

    public C1865b(InterfaceC1108g interfaceC1108g) {
        this.f18423a = interfaceC1108g;
    }

    @Override // nk.c
    public final void cancel() {
        this.f18424b.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        this.f18423a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f18423a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f18423a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        this.f18424b = interfaceC1486b;
        this.f18423a.c(this);
    }

    @Override // nk.c
    public final void request(long j) {
    }
}
