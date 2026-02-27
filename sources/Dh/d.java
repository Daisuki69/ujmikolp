package Dh;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicReference implements io.reactivex.rxjava3.disposables.b, Ah.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1160a;

    public /* synthetic */ d(int i) {
        this.f1160a = i;
    }

    @Override // Ah.b
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        a.d(this, bVar);
    }

    public boolean b() {
        return a.b((io.reactivex.rxjava3.disposables.b) get());
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f1160a) {
            case 0:
                a.a(this);
                break;
            default:
                a.a(this);
                break;
        }
    }

    @Override // Ah.b
    public void onComplete() {
        lazySet(a.f1154a);
    }

    @Override // Ah.b
    public void onError(Throwable th2) {
        lazySet(a.f1154a);
        E1.c.k(new OnErrorNotImplementedException(th2));
    }
}
