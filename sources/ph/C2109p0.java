package ph;

import java.util.Collection;
import lh.AbstractC1830a;

/* JADX INFO: renamed from: ph.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2109p0 extends AbstractC1830a {
    public final Collection f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hh.n f19589g;

    public C2109p0(ch.r rVar, hh.n nVar, Collection collection) {
        super(rVar);
        this.f19589g = nVar;
        this.f = collection;
    }

    @Override // lh.AbstractC1830a, kh.InterfaceC1779f
    public final void clear() {
        this.f.clear();
        super.clear();
    }

    @Override // lh.AbstractC1830a, ch.r
    public final void onComplete() {
        if (this.f18298d) {
            return;
        }
        this.f18298d = true;
        this.f.clear();
        this.f18296a.onComplete();
    }

    @Override // lh.AbstractC1830a, ch.r
    public final void onError(Throwable th2) {
        if (this.f18298d) {
            S1.s.r(th2);
            return;
        }
        this.f18298d = true;
        this.f.clear();
        this.f18296a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f18298d) {
            return;
        }
        int i = this.e;
        ch.r rVar = this.f18296a;
        if (i != 0) {
            rVar.onNext(null);
            return;
        }
        try {
            Object objApply = this.f19589g.apply(obj);
            jh.e.b(objApply, "The keySelector returned a null key");
            if (this.f.add(objApply)) {
                rVar.onNext(obj);
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        Object objPoll;
        Object objApply;
        do {
            objPoll = this.c.poll();
            if (objPoll == null) {
                break;
            }
            objApply = this.f19589g.apply(objPoll);
            jh.e.b(objApply, "The keySelector returned a null key");
        } while (!this.f.add(objApply));
        return objPoll;
    }
}
