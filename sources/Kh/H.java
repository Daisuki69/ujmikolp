package Kh;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements Ah.j, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.b f2690b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2691d;
    public final Object e;

    public /* synthetic */ H(Object obj, int i) {
        this.f2689a = i;
        this.e = obj;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f2689a) {
            case 0:
                if (Dh.a.e(this.f2690b, bVar)) {
                    this.f2690b = bVar;
                    ((Ah.f) this.e).a(this);
                }
                break;
            default:
                if (Dh.a.e(this.f2690b, bVar)) {
                    this.f2690b = bVar;
                    ((Ah.q) this.e).a(this);
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f2689a) {
            case 0:
                this.f2690b.dispose();
                break;
            default:
                this.f2690b.dispose();
                break;
        }
    }

    @Override // Ah.j
    public final void onComplete() {
        switch (this.f2689a) {
            case 0:
                if (!this.f2691d) {
                    this.f2691d = true;
                    Object obj = this.c;
                    this.c = null;
                    Ah.f fVar = (Ah.f) this.e;
                    if (obj != null) {
                        fVar.onSuccess(obj);
                    } else {
                        fVar.onComplete();
                    }
                    break;
                }
                break;
            default:
                if (!this.f2691d) {
                    this.f2691d = true;
                    Object obj2 = this.c;
                    this.c = null;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    Ah.q qVar = (Ah.q) this.e;
                    if (obj2 == null) {
                        qVar.onError(new NoSuchElementException());
                    } else {
                        qVar.onSuccess(obj2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        switch (this.f2689a) {
            case 0:
                if (!this.f2691d) {
                    this.f2691d = true;
                    ((Ah.f) this.e).onError(th2);
                } else {
                    E1.c.k(th2);
                }
                break;
            default:
                if (!this.f2691d) {
                    this.f2691d = true;
                    ((Ah.q) this.e).onError(th2);
                } else {
                    E1.c.k(th2);
                }
                break;
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        switch (this.f2689a) {
            case 0:
                if (!this.f2691d) {
                    if (this.c == null) {
                        this.c = obj;
                    } else {
                        this.f2691d = true;
                        this.f2690b.dispose();
                        ((Ah.f) this.e).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
            default:
                if (!this.f2691d) {
                    if (this.c == null) {
                        this.c = obj;
                    } else {
                        this.f2691d = true;
                        this.f2690b.dispose();
                        ((Ah.q) this.e).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
        }
    }
}
