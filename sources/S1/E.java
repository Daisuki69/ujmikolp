package S1;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends i {
    public final boolean l(Object obj) {
        if (obj == null) {
            obj = p.f5620g;
        }
        if (!p.f.j(this, null, obj)) {
            return false;
        }
        p.d(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(S1.y r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f5621a
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = S1.p.g(r6)
            of.p r0 = S1.p.f
            boolean r6 = r0.j(r5, r3, r6)
            if (r6 == 0) goto L4f
            S1.p.d(r5, r1)
            return r2
        L20:
            S1.f r0 = new S1.f
            r0.<init>(r5, r6)
            of.p r4 = S1.p.f
            boolean r3 = r4.j(r5, r3, r0)
            if (r3 == 0) goto L42
            S1.t r1 = S1.t.f5626a     // Catch: java.lang.Throwable -> L33
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            S1.c r1 = new S1.c     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            S1.c r1 = S1.C0589c.f5606b
        L3c:
            of.p r6 = S1.p.f
            r6.j(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f5621a
        L44:
            boolean r2 = r0 instanceof S1.C0587a
            if (r2 == 0) goto L4f
            S1.a r0 = (S1.C0587a) r0
            boolean r0 = r0.f5604a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.E.m(S1.y):boolean");
    }
}
