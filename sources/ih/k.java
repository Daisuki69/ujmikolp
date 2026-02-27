package Ih;

import bg.AbstractC0983W;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Oh.b implements Fh.a {
    public final Ch.g f;

    public k(Ah.e eVar, Ch.g gVar) {
        super(eVar);
        this.f = gVar;
    }

    @Override // Fh.a
    public final boolean d(Object obj) {
        if (this.f4806d) {
            return false;
        }
        int i = this.e;
        Ah.e eVar = this.f4804a;
        if (i != 0) {
            eVar.onNext(null);
            return true;
        }
        try {
            boolean zTest = this.f.test(obj);
            if (zTest) {
                eVar.onNext(obj);
            }
            return zTest;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            this.f4805b.cancel();
            onError(th2);
            return true;
        }
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (d(obj)) {
            return;
        }
        this.f4805b.request(1L);
    }

    @Override // Fh.g
    public final Object poll() {
        Fh.d dVar = this.c;
        while (true) {
            Object objPoll = dVar.poll();
            if (objPoll == null) {
                return null;
            }
            if (this.f.test(objPoll)) {
                return objPoll;
            }
            if (this.e == 2) {
                dVar.request(1L);
            }
        }
    }
}
