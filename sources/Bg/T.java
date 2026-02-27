package Bg;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wg.c f497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f498b;
    public xg.b c;

    public T(wg.c client) {
        kotlin.jvm.internal.j.g(client, "client");
        this.f497a = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Bg.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Jg.c r6, ij.AbstractC1609c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Bg.S
            if (r0 == 0) goto L13
            r0 = r7
            Bg.S r0 = (Bg.S) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Bg.S r0 = new Bg.S
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f496b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            Bg.T r6 = r0.f495a
            bj.AbstractC1039j.b(r7)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            bj.AbstractC1039j.b(r7)
            xg.b r7 = r5.c
            if (r7 == 0) goto L3c
            Bj.H.i(r7, r3)
        L3c:
            int r7 = r5.f498b
            r2 = 20
            if (r7 >= r2) goto L7b
            int r7 = r7 + r4
            r5.f498b = r7
            wg.c r7 = r5.f497a
            Jg.f r7 = r7.f20790g
            java.lang.Object r2 = r6.f2522d
            r0.f495a = r5
            r0.e = r4
            java.lang.Object r7 = r7.a(r6, r2, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r6 = r5
        L57:
            boolean r0 = r7 instanceof xg.b
            if (r0 == 0) goto L5e
            r3 = r7
            xg.b r3 = (xg.b) r3
        L5e:
            if (r3 == 0) goto L63
            r6.c = r3
            return r3
        L63:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L7b:
            io.ktor.client.plugins.SendCountExceedException r6 = new io.ktor.client.plugins.SendCountExceedException
            java.lang.String r7 = "Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.T.a(Jg.c, ij.c):java.lang.Object");
    }
}
