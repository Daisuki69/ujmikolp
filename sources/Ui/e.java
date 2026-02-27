package Ui;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5990a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // Ui.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r1, java.util.HashMap r2, U8.c r3) {
        /*
            r0 = this;
            java.util.HashSet r2 = Ui.l.f6001a
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L9
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L27
        L9:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L26
            java.util.HashSet r2 = Ui.l.f6001a
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r1.toLowerCase(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L26
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 == 0) goto L33
            boolean r1 = r1.booleanValue()
            boolean r2 = r0.f5990a
            if (r1 != r2) goto L33
            r1 = 1
            return r1
        L33:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ui.e.c(java.lang.Object, java.util.HashMap, U8.c):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e.class == obj.getClass() && this.f5990a == ((e) obj).f5990a;
    }

    public final int hashCode() {
        return this.f5990a ? 1 : 0;
    }

    public final String toString() {
        return "is " + this.f5990a;
    }
}
