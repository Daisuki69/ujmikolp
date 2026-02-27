package Kh;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends Ah.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nh.e f2711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2712b;

    public S(long j, Nh.e eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2712b = j;
        this.f2711a = eVar;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        Hh.h hVar = new Hh.h(jVar, 1);
        jVar.a(hVar);
        io.reactivex.rxjava3.disposables.b bVarC = this.f2711a.c(hVar, this.f2712b, TimeUnit.MILLISECONDS);
        while (!hVar.compareAndSet(null, bVarC)) {
            if (hVar.get() != null) {
                if (hVar.get() == Dh.a.f1154a) {
                    bVarC.dispose();
                    return;
                }
                return;
            }
        }
    }
}
