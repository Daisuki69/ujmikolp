package Nh;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Ah.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dh.c f4452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dh.c f4453b;
    public final Dh.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f4454d;
    public volatile boolean e;

    public b(d dVar) {
        this.f4454d = dVar;
        Dh.c cVar = new Dh.c(0);
        this.f4452a = cVar;
        Dh.c cVar2 = new Dh.c(1);
        this.f4453b = cVar2;
        Dh.c cVar3 = new Dh.c(0);
        this.c = cVar3;
        cVar3.a(cVar);
        cVar3.a(cVar2);
    }

    @Override // Ah.n
    public final io.reactivex.rxjava3.disposables.b b(Runnable runnable) {
        return this.e ? Dh.b.f1156a : this.f4454d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f4452a);
    }

    @Override // Ah.n
    public final io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.e ? Dh.b.f1156a : this.f4454d.e(runnable, j, timeUnit, this.f4453b);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.c.dispose();
    }
}
