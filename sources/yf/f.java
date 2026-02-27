package yf;

import We.s;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigDecimal f21159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21160b;

    public f(float f) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f));
        this.f21159a = bigDecimal;
        this.f21160b = q(bigDecimal.toPlainString());
    }

    public static String q(String str) {
        if (str.indexOf(46) > -1 && !str.endsWith(".0")) {
            while (str.endsWith("0") && !str.endsWith(".0")) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && Float.floatToIntBits(((f) obj).f21159a.floatValue()) == Float.floatToIntBits(this.f21159a.floatValue());
    }

    @Override // yf.l
    public final float f() {
        return this.f21159a.floatValue();
    }

    public final int hashCode() {
        return this.f21159a.hashCode();
    }

    @Override // yf.l
    public final int i() {
        return this.f21159a.intValue();
    }

    @Override // yf.l
    public final long k() {
        return this.f21159a.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r8 = this;
            java.math.BigDecimal r0 = r8.f21159a
            float r0 = r0.floatValue()
            java.math.BigDecimal r1 = r8.f21159a
            double r1 = r1.doubleValue()
            r3 = -8388608(0xffffffffff800000, float:-Infinity)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r4 = 2139095040(0x7f800000, float:Infinity)
            r5 = 1
            if (r3 == 0) goto L30
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L1a
            goto L30
        L1a:
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L4a
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L4a
            double r1 = java.lang.Math.abs(r1)
            r3 = 4039728865751334912(0x3810000000000000, double:1.1754943508222875E-38)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L4a
            goto L4b
        L30:
            double r1 = java.lang.Math.abs(r1)
            r6 = 5183643170566569984(0x47efffffe0000000, double:3.4028234663852886E38)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L4a
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L43
            r0 = r5
            goto L44
        L43:
            r0 = -1
        L44:
            float r0 = (float) r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r0 = r0 * r1
            goto L4b
        L4a:
            r5 = 0
        L4b:
            if (r5 == 0) goto L5e
            double r0 = (double) r0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            r8.f21159a = r0
            java.lang.String r0 = r0.toPlainString()
            java.lang.String r0 = q(r0)
            r8.f21160b = r0
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.f.m():void");
    }

    public final String toString() {
        return s.p(new StringBuilder("COSFloat{"), this.f21160b, "}");
    }
}
