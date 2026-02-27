package Jh;

import Ah.f;
import Ah.j;
import Ah.q;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements f, q, io.reactivex.rxjava3.disposables.b, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.b f2542b;
    public final Object c;

    public /* synthetic */ b(Object obj, int i) {
        this.f2541a = i;
        this.c = obj;
    }

    @Override // Ah.f
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f2541a) {
            case 0:
                if (Dh.a.e(this.f2542b, bVar)) {
                    this.f2542b = bVar;
                    ((f) this.c).a(this);
                }
                break;
            default:
                this.f2542b = bVar;
                ((Ah.b) this.c).a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f2541a) {
            case 0:
                this.f2542b.dispose();
                break;
            default:
                this.f2542b.dispose();
                break;
        }
    }

    @Override // Ah.f
    public final void onComplete() {
        switch (this.f2541a) {
            case 0:
                ((f) this.c).onComplete();
                break;
            default:
                ((Ah.b) this.c).onComplete();
                break;
        }
    }

    @Override // Ah.f
    public final void onError(Throwable th2) {
        switch (this.f2541a) {
            case 0:
                ((f) this.c).onComplete();
                break;
            default:
                ((Ah.b) this.c).onError(th2);
                break;
        }
    }

    @Override // Ah.j
    public void onNext(Object obj) {
    }

    @Override // Ah.f
    public void onSuccess(Object obj) {
        ((f) this.c).onSuccess(obj);
    }
}
