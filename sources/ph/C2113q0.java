package ph;

import hh.InterfaceC1571d;
import lh.AbstractC1830a;

/* JADX INFO: renamed from: ph.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2113q0 extends AbstractC1830a {
    public final hh.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f19601g;
    public boolean h;

    public C2113q0(ch.r rVar, hh.n nVar, InterfaceC1571d interfaceC1571d) {
        super(rVar);
        this.f = nVar;
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f18298d) {
            return;
        }
        int i = this.e;
        ch.r rVar = this.f18296a;
        if (i != 0) {
            rVar.onNext(obj);
            return;
        }
        try {
            Object objApply = this.f.apply(obj);
            if (this.h) {
                boolean zA = jh.e.a(this.f19601g, objApply);
                this.f19601g = objApply;
                if (zA) {
                    return;
                }
            } else {
                this.h = true;
                this.f19601g = objApply;
            }
            rVar.onNext(obj);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        while (true) {
            Object objPoll = this.c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f.apply(objPoll);
            if (!this.h) {
                this.h = true;
                this.f19601g = objApply;
                return objPoll;
            }
            if (!jh.e.a(this.f19601g, objApply)) {
                this.f19601g = objApply;
                return objPoll;
            }
            this.f19601g = objApply;
        }
    }
}
