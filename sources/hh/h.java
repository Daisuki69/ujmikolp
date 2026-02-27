package Hh;

import Ah.j;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AtomicReference implements io.reactivex.rxjava3.disposables.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2191b;

    public /* synthetic */ h(Object obj, int i) {
        this.f2190a = i;
        this.f2191b = obj;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f2190a) {
            case 0:
                Dh.a.a(this);
                break;
            default:
                Dh.a.a(this);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2190a) {
            case 0:
                ((Ah.b) this.f2191b).onComplete();
                break;
            default:
                if (!(get() == Dh.a.f1154a)) {
                    j jVar = (j) this.f2191b;
                    jVar.onNext(0L);
                    lazySet(Dh.b.f1156a);
                    jVar.onComplete();
                }
                break;
        }
    }
}
