package Bg;

import kotlin.jvm.internal.C1790e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ok.b f472a = ok.d.b().a().a("io.ktor.client.plugins.HttpCallValidator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Cg.c f473b = jk.b.f("HttpResponseValidator", C0125w.f562a, new Ag.a(4));
    public static final Rg.a c;

    static {
        kotlin.jvm.internal.F fC;
        C1790e c1790eA = kotlin.jvm.internal.z.a(Boolean.class);
        try {
            fC = kotlin.jvm.internal.z.c(Boolean.TYPE);
        } catch (Throwable unused) {
            fC = null;
        }
        c = new Rg.a("ExpectSuccessAttributeKey", new Wg.a(c1790eA, fC));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit a(java.util.List r4, java.lang.Throwable r5, Jg.b r6, ij.AbstractC1609c r7) {
        /*
            boolean r0 = r7 instanceof Bg.A
            if (r0 == 0) goto L13
            r0 = r7
            Bg.A r0 = (Bg.A) r0
            int r1 = r0.f466b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f466b = r1
            goto L18
        L13:
            Bg.A r0 = new Bg.A
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f465a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r0 = r0.f466b
            if (r0 == 0) goto L34
            r4 = 1
            if (r0 == r4) goto L26
            r4 = 2
            if (r0 != r4) goto L2a
        L26:
            bj.AbstractC1039j.b(r7)
            goto L32
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            r4 = 0
            goto L5c
        L34:
            bj.AbstractC1039j.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Processing exception "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " for request "
            r7.append(r5)
            Ng.E r5 = r6.getUrl()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            ok.b r6 = Bg.D.f472a
            r6.g(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L5c:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L65
            kotlin.Unit r4 = kotlin.Unit.f18162a
            return r4
        L65:
            java.lang.Object r4 = r4.next()
            if (r4 != 0) goto L71
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L71:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.D.a(java.util.List, java.lang.Throwable, Jg.b, ij.c):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.List r4, Kg.c r5, ij.AbstractC1609c r6) {
        /*
            boolean r0 = r6 instanceof Bg.B
            if (r0 == 0) goto L13
            r0 = r6
            Bg.B r0 = (Bg.B) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Bg.B r0 = new Bg.B
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r4 = r0.f468b
            Kg.c r5 = r0.f467a
            bj.AbstractC1039j.b(r6)
            goto L5b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            bj.AbstractC1039j.b(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Validating response for request "
            r6.<init>(r2)
            xg.b r2 = r5.b()
            Jg.b r2 = r2.c()
            Ng.E r2 = r2.getUrl()
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            ok.b r2 = Bg.D.f472a
            r2.g(r6)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L74
            java.lang.Object r6 = r4.next()
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r0.f467a = r5
            r0.f468b = r4
            r0.e = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L5b
            return r1
        L74:
            kotlin.Unit r4 = kotlin.Unit.f18162a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.D.b(java.util.List, Kg.c, ij.c):java.lang.Object");
    }
}
