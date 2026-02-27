package Ih;

import bg.AbstractC0983W;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends Oh.b {
    public final Ch.f f;

    public s(Ah.e eVar, Ch.f fVar) {
        super(eVar);
        this.f = fVar;
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (this.f4806d) {
            return;
        }
        int i = this.e;
        Ah.e eVar = this.f4804a;
        if (i != 0) {
            eVar.onNext(null);
            return;
        }
        try {
            Object objApply = this.f.apply(obj);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            eVar.onNext(objApply);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            this.f4805b.cancel();
            onError(th2);
        }
    }

    @Override // Fh.g
    public final Object poll() {
        Object objPoll = this.c.poll();
        if (objPoll == null) {
            return null;
        }
        Object objApply = this.f.apply(objPoll);
        Objects.requireNonNull(objApply, "The mapper function returned a null value.");
        return objApply;
    }
}
