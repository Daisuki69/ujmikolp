package Kh;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends AtomicReference implements io.reactivex.rxjava3.disposables.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2768b;
    public long c = 0;

    public w(Ah.j jVar, long j) {
        this.f2767a = jVar;
        this.f2768b = j;
    }

    public final boolean a() {
        return get() == Dh.a.f1154a;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Dh.a.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (a()) {
            return;
        }
        long j = this.c;
        Long lValueOf = Long.valueOf(j);
        Ah.j jVar = this.f2767a;
        jVar.onNext(lValueOf);
        if (j != this.f2768b) {
            this.c = j + 1;
            return;
        }
        if (!a()) {
            jVar.onComplete();
        }
        Dh.a.a(this);
    }
}
