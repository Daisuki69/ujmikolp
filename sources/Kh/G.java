package Kh;

import bg.AbstractC0983W;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends Ah.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ch.f f2688b;

    public G(Object obj, Ch.f fVar) {
        this.f2687a = obj;
        this.f2688b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ah.h
    public final void h(Ah.j jVar) {
        io.reactivex.rxjava3.disposables.b bVar = Dh.b.f1156a;
        try {
            Object objApply = this.f2688b.apply(this.f2687a);
            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
            Ah.h hVar = (Ah.h) objApply;
            if (!(hVar instanceof Ch.h)) {
                hVar.g(jVar);
                return;
            }
            try {
                Object obj = ((Ch.h) hVar).get();
                if (obj == null) {
                    jVar.a(bVar);
                    jVar.onComplete();
                } else {
                    F f = new F(jVar, obj);
                    jVar.a(f);
                    f.run();
                }
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                jVar.a(bVar);
                jVar.onError(th2);
            }
        } catch (Throwable th3) {
            AbstractC0983W.G(th3);
            jVar.a(bVar);
            jVar.onError(th3);
        }
    }
}
