package Kh;

import bg.AbstractC0983W;
import java.util.Objects;

/* JADX INFO: renamed from: Kh.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0314t extends AbstractC0296a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ch.f f2758b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2759d;

    public C0314t(Ah.h hVar, Ch.f fVar, int i, int i4) {
        super(hVar);
        this.f2758b = fVar;
        this.c = i;
        this.f2759d = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ah.h
    public final void h(Ah.j jVar) {
        io.reactivex.rxjava3.disposables.b bVar = Dh.b.f1156a;
        Ch.f fVar = this.f2758b;
        Ah.h hVar = this.f2715a;
        if (!(hVar instanceof Ch.h)) {
            hVar.g(new C0313s(jVar, fVar, this.c, this.f2759d));
            return;
        }
        try {
            Object obj = ((Ch.h) hVar).get();
            if (obj == null) {
                jVar.a(bVar);
                jVar.onComplete();
                return;
            }
            try {
                Object objApply = fVar.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                Ah.h hVar2 = (Ah.h) objApply;
                if (!(hVar2 instanceof Ch.h)) {
                    hVar2.g(jVar);
                    return;
                }
                try {
                    Object obj2 = ((Ch.h) hVar2).get();
                    if (obj2 == null) {
                        jVar.a(bVar);
                        jVar.onComplete();
                    } else {
                        F f = new F(jVar, obj2);
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
        } catch (Throwable th4) {
            AbstractC0983W.G(th4);
            jVar.a(bVar);
            jVar.onError(th4);
        }
    }
}
