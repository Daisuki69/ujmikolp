package Kh;

import bg.AbstractC0983W;
import java.util.Objects;

/* JADX INFO: renamed from: Kh.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0306k extends Gh.a {
    public Object e;
    public boolean f;

    @Override // Fh.c
    public final int b(int i) {
        return 0;
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (this.f1984d) {
            return;
        }
        Ah.j jVar = this.f1982a;
        try {
            if (this.f) {
                boolean zEquals = Objects.equals(this.e, obj);
                this.e = obj;
                if (zEquals) {
                    return;
                }
            } else {
                this.f = true;
                this.e = obj;
            }
            jVar.onNext(obj);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            this.f1983b.dispose();
            onError(th2);
        }
    }

    @Override // Fh.g
    public final Object poll() {
        while (true) {
            Object objPoll = this.c.poll();
            if (objPoll == null) {
                return null;
            }
            if (!this.f) {
                this.f = true;
                this.e = objPoll;
                return objPoll;
            }
            if (!Objects.equals(this.e, objPoll)) {
                this.e = objPoll;
                return objPoll;
            }
            this.e = objPoll;
        }
    }
}
