package jf;

import java.io.IOException;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements of.r, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of.e f17790a = new of.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17791b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f17792d;

    public r(t tVar) {
        this.f17792d = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r13) throws java.io.IOException {
        /*
            r12 = this;
            jf.t r1 = r12.f17792d
            monitor-enter(r1)
            jf.t r0 = r12.f17792d     // Catch: java.lang.Throwable -> L77
            gf.i r0 = r0.j     // Catch: java.lang.Throwable -> L77
            r0.k()     // Catch: java.lang.Throwable -> L77
        La:
            jf.t r0 = r12.f17792d     // Catch: java.lang.Throwable -> L24
            long r2 = r0.f17797b     // Catch: java.lang.Throwable -> L24
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L27
            boolean r2 = r12.c     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L27
            boolean r2 = r12.f17791b     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L27
            int r2 = r0.f17800k     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L27
            r0.j()     // Catch: java.lang.Throwable -> L24
            goto La
        L24:
            r0 = move-exception
            r13 = r0
            goto L7a
        L27:
            gf.i r0 = r0.j     // Catch: java.lang.Throwable -> L77
            r0.o()     // Catch: java.lang.Throwable -> L77
            jf.t r0 = r12.f17792d     // Catch: java.lang.Throwable -> L77
            r0.e()     // Catch: java.lang.Throwable -> L77
            jf.t r0 = r12.f17792d     // Catch: java.lang.Throwable -> L77
            long r2 = r0.f17797b     // Catch: java.lang.Throwable -> L77
            of.e r0 = r12.f17790a     // Catch: java.lang.Throwable -> L77
            long r4 = r0.f18822b     // Catch: java.lang.Throwable -> L77
            long r10 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L77
            jf.t r0 = r12.f17792d     // Catch: java.lang.Throwable -> L77
            long r2 = r0.f17797b     // Catch: java.lang.Throwable -> L77
            long r2 = r2 - r10
            r0.f17797b = r2     // Catch: java.lang.Throwable -> L77
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            gf.i r0 = r0.j
            r0.k()
            if (r13 == 0) goto L5a
            of.e r13 = r12.f17790a     // Catch: java.lang.Throwable -> L57
            long r0 = r13.f18822b     // Catch: java.lang.Throwable -> L57
            int r13 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r13 != 0) goto L5a
            r13 = 1
        L55:
            r8 = r13
            goto L5c
        L57:
            r0 = move-exception
            r13 = r0
            goto L6f
        L5a:
            r13 = 0
            goto L55
        L5c:
            jf.t r13 = r12.f17792d     // Catch: java.lang.Throwable -> L57
            jf.k r6 = r13.f17798d     // Catch: java.lang.Throwable -> L57
            int r7 = r13.c     // Catch: java.lang.Throwable -> L57
            of.e r9 = r12.f17790a     // Catch: java.lang.Throwable -> L57
            r6.i(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L57
            jf.t r13 = r12.f17792d
            gf.i r13 = r13.j
            r13.o()
            return
        L6f:
            jf.t r0 = r12.f17792d
            gf.i r0 = r0.j
            r0.o()
            throw r13
        L77:
            r0 = move-exception
            r13 = r0
            goto L82
        L7a:
            jf.t r0 = r12.f17792d     // Catch: java.lang.Throwable -> L77
            gf.i r0 = r0.j     // Catch: java.lang.Throwable -> L77
            r0.o()     // Catch: java.lang.Throwable -> L77
            throw r13     // Catch: java.lang.Throwable -> L77
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.r.b(boolean):void");
    }

    @Override // of.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f17792d) {
            try {
                if (this.f17791b) {
                    return;
                }
                t tVar = this.f17792d;
                if (!tVar.h.c) {
                    if (this.f17790a.f18822b > 0) {
                        while (this.f17790a.f18822b > 0) {
                            b(true);
                        }
                    } else {
                        tVar.f17798d.i(tVar.c, true, null, 0L);
                    }
                }
                synchronized (this.f17792d) {
                    this.f17791b = true;
                }
                this.f17792d.f17798d.flush();
                this.f17792d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // of.r, java.io.Flushable
    public final void flush() throws IOException {
        synchronized (this.f17792d) {
            this.f17792d.e();
        }
        while (this.f17790a.f18822b > 0) {
            b(false);
            this.f17792d.f17798d.flush();
        }
    }

    @Override // of.r
    public final void s(long j, of.e eVar) throws IOException {
        of.e eVar2 = this.f17790a;
        eVar2.s(j, eVar);
        while (eVar2.f18822b >= Http2Stream.EMIT_BUFFER_SIZE) {
            b(false);
        }
    }

    @Override // of.r
    public final of.u timeout() {
        return this.f17792d.j;
    }
}
