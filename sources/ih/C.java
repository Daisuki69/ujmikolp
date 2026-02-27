package Ih;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements Ah.e, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.q f2297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nk.c f2298b;
    public ArrayList c;

    public C(Ah.q qVar, ArrayList arrayList) {
        this.f2297a = qVar;
        this.c = arrayList;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (Ph.d.d(this.f2298b, cVar)) {
            this.f2298b = cVar;
            this.f2297a.a(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.f2298b.cancel();
        this.f2298b = Ph.d.f5178a;
    }

    @Override // nk.b
    public final void onComplete() {
        this.f2298b = Ph.d.f5178a;
        this.f2297a.onSuccess(this.c);
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        this.c = null;
        this.f2298b = Ph.d.f5178a;
        this.f2297a.onError(th2);
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        this.c.add(obj);
    }
}
