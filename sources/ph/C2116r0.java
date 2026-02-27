package ph;

import hh.InterfaceC1573f;
import lh.AbstractC1830a;

/* JADX INFO: renamed from: ph.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2116r0 extends AbstractC1830a {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f19614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2116r0(ch.r rVar, Object obj, int i) {
        super(rVar);
        this.f = i;
        this.f19614g = obj;
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f) {
            case 0:
                this.f18296a.onNext(obj);
                if (this.e == 0) {
                    try {
                        ((InterfaceC1573f) this.f19614g).accept(obj);
                    } catch (Throwable th2) {
                        a(th2);
                        return;
                    }
                }
                break;
            case 1:
                int i = this.e;
                ch.r rVar = this.f18296a;
                if (i != 0) {
                    rVar.onNext(null);
                } else {
                    try {
                        if (((hh.o) this.f19614g).test(obj)) {
                            rVar.onNext(obj);
                        }
                    } catch (Throwable th3) {
                        a(th3);
                        return;
                    }
                }
                break;
            default:
                if (!this.f18298d) {
                    int i4 = this.e;
                    ch.r rVar2 = this.f18296a;
                    if (i4 != 0) {
                        rVar2.onNext(null);
                    } else {
                        try {
                            Object objApply = ((hh.n) this.f19614g).apply(obj);
                            jh.e.b(objApply, "The mapper function returned a null value.");
                            rVar2.onNext(objApply);
                        } catch (Throwable th4) {
                            a(th4);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        Object objPoll;
        switch (this.f) {
            case 0:
                Object objPoll2 = this.c.poll();
                if (objPoll2 != null) {
                    ((InterfaceC1573f) this.f19614g).accept(objPoll2);
                }
                return objPoll2;
            case 1:
                break;
            default:
                Object objPoll3 = this.c.poll();
                if (objPoll3 == null) {
                    return null;
                }
                Object objApply = ((hh.n) this.f19614g).apply(objPoll3);
                jh.e.b(objApply, "The mapper function returned a null value.");
                return objApply;
        }
        do {
            objPoll = this.c.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((hh.o) this.f19614g).test(objPoll));
        return objPoll;
    }
}
