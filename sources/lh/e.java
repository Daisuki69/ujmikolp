package Lh;

import Ah.p;
import Ah.q;
import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicReference implements q, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f2994b;
    public final Ch.f c;

    public /* synthetic */ e(int i, q qVar, Ch.f fVar) {
        this.f2993a = i;
        this.f2994b = qVar;
        this.c = fVar;
    }

    @Override // Ah.q, Ah.b
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f2993a) {
            case 0:
                if (Dh.a.d(this, bVar)) {
                    this.f2994b.a(this);
                }
                break;
            default:
                if (Dh.a.d(this, bVar)) {
                    this.f2994b.a(this);
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f2993a) {
            case 0:
                Dh.a.a(this);
                break;
            default:
                Dh.a.a(this);
                break;
        }
    }

    @Override // Ah.q, Ah.b
    public final void onError(Throwable th2) {
        q qVar = this.f2994b;
        switch (this.f2993a) {
            case 0:
                qVar.onError(th2);
                break;
            default:
                try {
                    Object objApply = this.c.apply(th2);
                    Objects.requireNonNull(objApply, "The nextFunction returned a null SingleSource.");
                    ((p) objApply).f(new A7.f(16, this, qVar));
                } catch (Throwable th3) {
                    AbstractC0983W.G(th3);
                    qVar.onError(new CompositeException(th2, th3));
                    return;
                }
                break;
        }
    }

    @Override // Ah.q
    public final void onSuccess(Object obj) {
        switch (this.f2993a) {
            case 0:
                q qVar = this.f2994b;
                try {
                    Object objApply = this.c.apply(obj);
                    Objects.requireNonNull(objApply, "The single returned by the mapper is null");
                    p pVar = (p) objApply;
                    if (!Dh.a.b((io.reactivex.rxjava3.disposables.b) get())) {
                        pVar.f(new c(2, this, qVar));
                    }
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    qVar.onError(th2);
                    return;
                }
                break;
            default:
                this.f2994b.onSuccess(obj);
                break;
        }
    }
}
