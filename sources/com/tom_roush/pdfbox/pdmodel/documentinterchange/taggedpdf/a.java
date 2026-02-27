package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import yf.C2531a;
import yf.j;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.a {
    public a(yf.d dVar) {
        super(j.f21229k, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean p(java.lang.String r6) {
        /*
            r5 = this;
            yf.d r0 = r5.k()
            yf.j r1 = yf.j.f21242p
            yf.b r0 = r0.q(r1)
            yf.a r0 = (yf.C2531a) r0
            r1 = 0
            if (r0 == 0) goto L37
            r2 = r1
        L10:
            java.util.ArrayList r3 = r0.f21151a
            int r4 = r3.size()
            if (r2 >= r4) goto L37
            int r4 = r3.size()
            if (r2 >= r4) goto L2b
            java.lang.Object r3 = r3.get(r2)
            boolean r4 = r3 instanceof yf.j
            if (r4 == 0) goto L2b
            yf.j r3 = (yf.j) r3
            java.lang.String r3 = r3.f21267a
            goto L2c
        L2b:
            r3 = 0
        L2c:
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L34
            r6 = 1
            return r6
        L34:
            int r2 = r2 + 1
            goto L10
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.a.p(java.lang.String):boolean");
    }

    public Df.g m() {
        C2531a c2531a = (C2531a) k().q(j.f21246r);
        if (c2531a != null) {
            return new Df.g(c2531a);
        }
        return null;
    }

    public String n() {
        return k().z(j.f21252t1);
    }

    public String o() {
        return k().z(j.f21262x1);
    }

    public boolean q() {
        return p("Bottom");
    }

    public boolean r() {
        return p("Left");
    }

    public boolean s() {
        return p("Right");
    }

    public boolean t() {
        return p("Top");
    }
}
