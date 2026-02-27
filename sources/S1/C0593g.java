package S1;

/* JADX INFO: renamed from: S1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0593g extends of.p {
    @Override // of.p
    public final void A(o oVar, Thread thread) {
        oVar.f5617a = thread;
    }

    @Override // of.p
    public final boolean i(p pVar, C0590d c0590d, C0590d c0590d2) {
        synchronized (pVar) {
            try {
                if (pVar.f5622b != c0590d) {
                    return false;
                }
                pVar.f5622b = c0590d2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // of.p
    public final boolean j(p pVar, Object obj, Object obj2) {
        synchronized (pVar) {
            try {
                if (pVar.f5621a != obj) {
                    return false;
                }
                pVar.f5621a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // of.p
    public final boolean k(p pVar, o oVar, o oVar2) {
        synchronized (pVar) {
            try {
                if (pVar.c != oVar) {
                    return false;
                }
                pVar.c = oVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // of.p
    public final C0590d q(p pVar) {
        C0590d c0590d;
        C0590d c0590d2 = C0590d.f5608d;
        synchronized (pVar) {
            c0590d = pVar.f5622b;
            if (c0590d != c0590d2) {
                pVar.f5622b = c0590d2;
            }
        }
        return c0590d;
    }

    @Override // of.p
    public final o r(p pVar) {
        o oVar;
        o oVar2 = o.c;
        synchronized (pVar) {
            oVar = pVar.c;
            if (oVar != oVar2) {
                pVar.c = oVar2;
            }
        }
        return oVar;
    }

    @Override // of.p
    public final void z(o oVar, o oVar2) {
        oVar.f5618b = oVar2;
    }
}
