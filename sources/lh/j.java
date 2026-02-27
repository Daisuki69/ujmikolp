package Lh;

import Ah.q;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Ph.b implements q {
    public io.reactivex.rxjava3.disposables.b c;

    @Override // Ah.q, Ah.b
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.c, bVar)) {
            this.c = bVar;
            this.f5174a.c(this);
        }
    }

    @Override // nk.c
    public final void cancel() {
        set(4);
        this.f5175b = null;
        this.c.dispose();
    }

    @Override // Ah.q, Ah.b
    public final void onError(Throwable th2) {
        this.f5174a.onError(th2);
    }
}
