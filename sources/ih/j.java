package Ih;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Oh.a {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2309g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Fh.a aVar, Object obj, int i) {
        super(aVar);
        this.f = i;
        this.f2309g = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r1.d(r4) != false) goto L23;
     */
    @Override // Fh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.f4803d
            if (r0 == 0) goto Lb
            r4 = 0
            goto L24
        Lb:
            java.lang.Object r0 = r3.f2309g     // Catch: java.lang.Throwable -> L1f
            Ch.f r0 = (Ch.f) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "The mapper function returned a null value."
            java.util.Objects.requireNonNull(r4, r0)     // Catch: java.lang.Throwable -> L1f
            Fh.a r0 = r3.f4801a
            boolean r4 = r0.d(r4)
            goto L24
        L1f:
            r4 = move-exception
            r3.a(r4)
            r4 = 1
        L24:
            return r4
        L25:
            boolean r0 = r3.f4803d
            if (r0 == 0) goto L2a
            goto L49
        L2a:
            int r0 = r3.e
            Fh.a r1 = r3.f4801a
            if (r0 == 0) goto L36
            r4 = 0
            boolean r4 = r1.d(r4)
            goto L50
        L36:
            r0 = 1
            java.lang.Object r2 = r3.f2309g     // Catch: java.lang.Throwable -> L4b
            Ch.g r2 = (Ch.g) r2     // Catch: java.lang.Throwable -> L4b
            boolean r2 = r2.test(r4)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L49
            boolean r4 = r1.d(r4)
            if (r4 == 0) goto L49
        L47:
            r4 = r0
            goto L50
        L49:
            r4 = 0
            goto L50
        L4b:
            r4 = move-exception
            r3.a(r4)
            goto L47
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ih.j.d(java.lang.Object):boolean");
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        switch (this.f) {
            case 0:
                if (!d(obj)) {
                    this.f4802b.request(1L);
                }
                break;
            default:
                if (!this.f4803d) {
                    int i = this.e;
                    Fh.a aVar = this.f4801a;
                    if (i != 0) {
                        aVar.onNext(null);
                    } else {
                        try {
                            Object objApply = ((Ch.f) this.f2309g).apply(obj);
                            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                            aVar.onNext(objApply);
                        } catch (Throwable th2) {
                            a(th2);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // Fh.g
    public final Object poll() {
        switch (this.f) {
            case 0:
                Fh.d dVar = this.c;
                while (true) {
                    Object objPoll = dVar.poll();
                    if (objPoll == null) {
                        return null;
                    }
                    if (((Ch.g) this.f2309g).test(objPoll)) {
                        return objPoll;
                    }
                    if (this.e == 2) {
                        dVar.request(1L);
                    }
                }
                break;
            default:
                Object objPoll2 = this.c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((Ch.f) this.f2309g).apply(objPoll2);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                return objApply;
        }
    }
}
