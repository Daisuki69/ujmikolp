package Qh;

import Ah.j;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference {
    public boolean a(Throwable th2) {
        if (e.a(this, th2)) {
            return true;
        }
        E1.c.k(th2);
        return false;
    }

    public void b(j jVar) {
        Throwable thC = e.c(this);
        if (thC == null) {
            jVar.onComplete();
        } else if (thC != e.f5385a) {
            jVar.onError(thC);
        }
    }

    public void c(nk.b bVar) {
        Throwable thC = e.c(this);
        if (thC == null) {
            bVar.onComplete();
        } else if (thC != e.f5385a) {
            bVar.onError(thC);
        }
    }
}
