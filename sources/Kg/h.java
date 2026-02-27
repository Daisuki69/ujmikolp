package Kg;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jg.c f2671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wg.c f2672b;

    public h(Jg.c cVar, wg.c client) {
        j.g(client, "client");
        this.f2671a = cVar;
        this.f2672b = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Kg.c r5, ij.AbstractC1609c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Kg.f
            if (r0 == 0) goto L13
            r0 = r6
            Kg.f r0 = (Kg.f) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Kg.f r0 = new Kg.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2667a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            bj.AbstractC1039j.b(r6)
            goto L59
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            bj.AbstractC1039j.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r5.getCoroutineContext()
            Bj.m0 r2 = Bj.C0154m0.f630a
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            kotlin.jvm.internal.j.d(r6)
            Bj.s r6 = (Bj.InterfaceC0160s) r6
            r2 = r6
            Bj.o0 r2 = (Bj.o0) r2
            r2.h0()
            io.ktor.utils.io.n r5 = r5.c()     // Catch: java.lang.Throwable -> L4e
            M8.A0.i(r5)     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0.c = r3
            Bj.u0 r6 = (Bj.u0) r6
            java.lang.Object r5 = r6.z(r0)
            if (r5 != r1) goto L59
            return r1
        L59:
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Kg.h.a(Kg.c, ij.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ij.AbstractC1609c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Kg.g
            if (r0 == 0) goto L13
            r0 = r8
            Kg.g r0 = (Kg.g) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            Kg.g r0 = new Kg.g
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f2669a
            Kg.c r0 = (Kg.c) r0
            bj.AbstractC1039j.b(r8)     // Catch: java.util.concurrent.CancellationException -> L31
            return r0
        L31:
            r8 = move-exception
            goto L94
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            xg.b r2 = r0.f2670b
            java.lang.Object r4 = r0.f2669a
            Kg.h r4 = (Kg.h) r4
            bj.AbstractC1039j.b(r8)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L7b
        L45:
            java.lang.Object r2 = r0.f2669a
            Kg.h r2 = (Kg.h) r2
            bj.AbstractC1039j.b(r8)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L68
        L4d:
            bj.AbstractC1039j.b(r8)
            Jg.c r8 = new Jg.c     // Catch: java.util.concurrent.CancellationException -> L31
            r8.<init>()     // Catch: java.util.concurrent.CancellationException -> L31
            Jg.c r2 = r7.f2671a     // Catch: java.util.concurrent.CancellationException -> L31
            r8.c(r2)     // Catch: java.util.concurrent.CancellationException -> L31
            wg.c r2 = r7.f2672b     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f2669a = r7     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f = r5     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r8 = r2.b(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r8 != r1) goto L67
            goto L92
        L67:
            r2 = r7
        L68:
            xg.b r8 = (xg.b) r8     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f2669a = r2     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f2670b = r8     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f = r4     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r4 = E1.c.o(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r4 != r1) goto L77
            goto L92
        L77:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L7b:
            xg.b r8 = (xg.b) r8     // Catch: java.util.concurrent.CancellationException -> L31
            Kg.c r8 = r8.d()     // Catch: java.util.concurrent.CancellationException -> L31
            Kg.c r2 = r2.d()     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f2669a = r8     // Catch: java.util.concurrent.CancellationException -> L31
            r5 = 0
            r0.f2670b = r5     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f = r3     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r0 = r4.a(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r0 != r1) goto L93
        L92:
            return r1
        L93:
            return r8
        L94:
            java.lang.Throwable r8 = Lg.a.a(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Kg.h.b(ij.c):java.lang.Object");
    }

    public final String toString() {
        return "HttpStatement[" + this.f2671a.f2520a + ']';
    }
}
