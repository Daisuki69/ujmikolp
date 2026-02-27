package Ih;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends Ph.b implements Ah.e, nk.c {
    public nk.c c;

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (Ph.d.d(this.c, cVar)) {
            this.c = cVar;
            this.f5174a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // nk.c
    public final void cancel() {
        set(4);
        this.f5175b = null;
        this.c.cancel();
    }

    @Override // nk.b
    public final void onComplete() {
        e(this.f5175b);
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        this.f5175b = null;
        this.f5174a.onError(th2);
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        Collection collection = (Collection) this.f5175b;
        if (collection != null) {
            collection.add(obj);
        }
    }
}
