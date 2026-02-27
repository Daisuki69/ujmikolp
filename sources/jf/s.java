package jf;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements of.s, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of.e f17793a = new of.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of.e f17794b = new of.e();
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17795d;
    public boolean e;
    public final /* synthetic */ t f;

    public s(t tVar, long j) {
        this.f = tVar;
        this.c = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    @Override // of.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r13, of.e r15) throws java.lang.Throwable {
        /*
            r12 = this;
        L0:
            jf.t r13 = r12.f
            monitor-enter(r13)
            jf.t r14 = r12.f     // Catch: java.lang.Throwable -> L79
            gf.i r14 = r14.i     // Catch: java.lang.Throwable -> L79
            r14.k()     // Catch: java.lang.Throwable -> L79
            jf.t r14 = r12.f     // Catch: java.lang.Throwable -> L1f
            int r0 = r14.f17800k     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L22
            java.io.IOException r14 = r14.f17801l     // Catch: java.lang.Throwable -> L1f
            if (r14 == 0) goto L15
            goto L23
        L15:
            com.tencent.cloud.ai.network.okhttp3.internal.http2.v r14 = new com.tencent.cloud.ai.network.okhttp3.internal.http2.v     // Catch: java.lang.Throwable -> L1f
            jf.t r0 = r12.f     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.f17800k     // Catch: java.lang.Throwable -> L1f
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r14 = move-exception
            goto L9c
        L22:
            r14 = 0
        L23:
            boolean r0 = r12.f17795d     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L94
            of.e r0 = r12.f17794b     // Catch: java.lang.Throwable -> L1f
            long r1 = r0.f18822b     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = -1
            if (r5 <= 0) goto L65
            r8 = 8192(0x2000, double:4.0474E-320)
            long r1 = java.lang.Math.min(r8, r1)     // Catch: java.lang.Throwable -> L1f
            long r0 = r0.a(r1, r15)     // Catch: java.lang.Throwable -> L1f
            jf.t r15 = r12.f     // Catch: java.lang.Throwable -> L1f
            long r8 = r15.f17796a     // Catch: java.lang.Throwable -> L1f
            long r8 = r8 + r0
            r15.f17796a = r8     // Catch: java.lang.Throwable -> L1f
            if (r14 != 0) goto L7c
            jf.k r15 = r15.f17798d     // Catch: java.lang.Throwable -> L1f
            Ri.a r15 = r15.f17769q     // Catch: java.lang.Throwable -> L1f
            int r15 = r15.a()     // Catch: java.lang.Throwable -> L1f
            int r15 = r15 / 2
            long r10 = (long) r15     // Catch: java.lang.Throwable -> L1f
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 < 0) goto L7c
            jf.t r15 = r12.f     // Catch: java.lang.Throwable -> L1f
            jf.k r2 = r15.f17798d     // Catch: java.lang.Throwable -> L1f
            int r5 = r15.c     // Catch: java.lang.Throwable -> L1f
            long r8 = r15.f17796a     // Catch: java.lang.Throwable -> L1f
            r2.g(r5, r8)     // Catch: java.lang.Throwable -> L1f
            jf.t r15 = r12.f     // Catch: java.lang.Throwable -> L1f
            r15.f17796a = r3     // Catch: java.lang.Throwable -> L1f
            goto L7c
        L65:
            boolean r0 = r12.e     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L7b
            if (r14 != 0) goto L7b
            jf.t r14 = r12.f     // Catch: java.lang.Throwable -> L1f
            r14.j()     // Catch: java.lang.Throwable -> L1f
            jf.t r14 = r12.f     // Catch: java.lang.Throwable -> L79
            gf.i r14 = r14.i     // Catch: java.lang.Throwable -> L79
            r14.o()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L79
            goto L0
        L79:
            r14 = move-exception
            goto La4
        L7b:
            r0 = r6
        L7c:
            jf.t r15 = r12.f     // Catch: java.lang.Throwable -> L79
            gf.i r15 = r15.i     // Catch: java.lang.Throwable -> L79
            r15.o()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L79
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 == 0) goto L90
            jf.t r13 = r12.f
            jf.k r13 = r13.f17798d
            r13.m(r0)
            return r0
        L90:
            if (r14 != 0) goto L93
            return r6
        L93:
            throw r14
        L94:
            java.io.IOException r14 = new java.io.IOException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r15 = "stream closed"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L1f
            throw r14     // Catch: java.lang.Throwable -> L1f
        L9c:
            jf.t r15 = r12.f     // Catch: java.lang.Throwable -> L79
            gf.i r15 = r15.i     // Catch: java.lang.Throwable -> L79
            r15.o()     // Catch: java.lang.Throwable -> L79
            throw r14     // Catch: java.lang.Throwable -> L79
        La4:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L79
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.s.a(long, of.e):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.f) {
            this.f17795d = true;
            of.e eVar = this.f17794b;
            j = eVar.f18822b;
            eVar.E();
            this.f.notifyAll();
        }
        if (j > 0) {
            this.f.f17798d.m(j);
        }
        this.f.a();
    }

    @Override // of.s
    public final of.u timeout() {
        return this.f.i;
    }
}
