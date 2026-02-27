package s5;

import Bj.H;
import Bj.U;
import Bj.r;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f20024a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Gj.c f20025b;
    public static Map c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static r f20026d;

    static {
        Ij.e eVar = U.f603a;
        f20025b = H.c(Ij.d.f2362a.plus(H.e(1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ij.AbstractC1609c r4) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof s5.k
            if (r0 == 0) goto L13
            r0 = r4
            s5.k r0 = (s5.k) r0
            int r1 = r0.f20023b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20023b = r1
            goto L18
        L13:
            s5.k r0 = new s5.k
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f20022a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f20023b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            bj.AbstractC1039j.b(r4)     // Catch: java.lang.Exception -> L42
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2f:
            bj.AbstractC1039j.b(r4)
            Bj.r r4 = s5.l.f20026d     // Catch: java.lang.Exception -> L42
            if (r4 == 0) goto L42
            r0.f20023b = r3     // Catch: java.lang.Exception -> L42
            java.lang.Object r4 = r4.A(r0)     // Catch: java.lang.Exception -> L42
            if (r4 != r1) goto L3f
            return r1
        L3f:
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L42
            return r4
        L42:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.l.a(ij.c):java.lang.Object");
    }
}
