package lg;

import Ah.j;
import ch.r;
import fh.InterfaceC1486b;

/* JADX INFO: renamed from: lg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1829b implements r, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1486b f18294b;

    public C1829b(j jVar) {
        this.f18293a = jVar;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.f18294b.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        this.f18293a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f18293a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f18293a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        this.f18294b = interfaceC1486b;
        this.f18293a.a(this);
    }
}
