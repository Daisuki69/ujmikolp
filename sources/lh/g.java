package Lh;

import Ah.o;
import Ah.q;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AtomicReference implements q, io.reactivex.rxjava3.disposables.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f2997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f2998b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f2999d;

    public g(q qVar, o oVar) {
        this.f2997a = qVar;
        this.f2998b = oVar;
    }

    @Override // Ah.q, Ah.b
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.d(this, bVar)) {
            this.f2997a.a(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Dh.a.a(this);
    }

    @Override // Ah.q, Ah.b
    public final void onError(Throwable th2) {
        this.f2999d = th2;
        Dh.a.c(this, this.f2998b.b(this));
    }

    @Override // Ah.q
    public final void onSuccess(Object obj) {
        this.c = obj;
        Dh.a.c(this, this.f2998b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th2 = this.f2999d;
        q qVar = this.f2997a;
        if (th2 != null) {
            qVar.onError(th2);
        } else {
            qVar.onSuccess(this.c);
        }
    }
}
