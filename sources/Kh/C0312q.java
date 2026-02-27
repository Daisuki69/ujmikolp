package Kh;

import bg.AbstractC0983W;
import java.util.Objects;

/* JADX INFO: renamed from: Kh.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0312q extends Gh.a {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0312q(Ah.j jVar, Object obj, int i) {
        super(jVar);
        this.e = i;
        this.f = obj;
    }

    @Override // Fh.c
    public final int b(int i) {
        switch (this.e) {
        }
        return c(7);
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        switch (this.e) {
            case 0:
                Ah.j jVar = this.f1982a;
                try {
                    if (((Ch.g) this.f).test(obj)) {
                        jVar.onNext(obj);
                    }
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    this.f1983b.dispose();
                    onError(th2);
                    return;
                }
                break;
            default:
                if (!this.f1984d) {
                    Ah.j jVar2 = this.f1982a;
                    try {
                        Object objApply = ((Ch.f) this.f).apply(obj);
                        Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                        jVar2.onNext(objApply);
                    } catch (Throwable th3) {
                        AbstractC0983W.G(th3);
                        this.f1983b.dispose();
                        onError(th3);
                    }
                    break;
                }
                break;
        }
    }

    @Override // Fh.g
    public final Object poll() {
        Object objPoll;
        switch (this.e) {
            case 0:
                break;
            default:
                Object objPoll2 = this.c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((Ch.f) this.f).apply(objPoll2);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                return objApply;
        }
        do {
            objPoll = this.c.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((Ch.g) this.f).test(objPoll));
        return objPoll;
    }
}
