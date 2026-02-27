package jf;

import df.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17796a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17797b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f17798d;
    public final ArrayDeque e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f17799g;
    public final r h;
    public final gf.i i;
    public final gf.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IOException f17801l;

    public t(int i, k kVar, boolean z4, boolean z5, x xVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        int i4 = 1;
        this.i = new gf.i(this, i4);
        this.j = new gf.i(this, i4);
        if (kVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.c = i;
        this.f17798d = kVar;
        this.f17797b = kVar.f17770r.a();
        s sVar = new s(this, kVar.f17769q.a());
        this.f17799g = sVar;
        r rVar = new r(this);
        this.h = rVar;
        sVar.e = z5;
        rVar.c = z4;
        if (xVar != null) {
            arrayDeque.add(xVar);
        }
        if (h() && xVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!h() && xVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            jf.s r0 = r2.f17799g     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.e     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L1a
            boolean r0 = r0.f17795d     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            jf.r r0 = r2.h     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            boolean r0 = r0.f17791b     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            goto L18
        L16:
            r0 = move-exception
            goto L32
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r1 = r2.i()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L28
            r0 = 6
            r1 = 0
            r2.d(r1, r0)
            return
        L28:
            if (r1 != 0) goto L31
            jf.k r0 = r2.f17798d
            int r1 = r2.c
            r0.k(r1)
        L31:
            return
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.t.a():void");
    }

    public final void b(int i) {
        if (f(null, i)) {
            this.f17798d.c(this.c, i);
        }
    }

    public final void c(x xVar, boolean z4) {
        boolean zI;
        synchronized (this) {
            try {
                if (this.f && z4) {
                    this.f17799g.getClass();
                } else {
                    this.f = true;
                    this.e.add(xVar);
                }
                if (z4) {
                    this.f17799g.e = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zI) {
            return;
        }
        this.f17798d.k(this.c);
    }

    public final void d(IOException iOException, int i) {
        if (f(iOException, i)) {
            this.f17798d.f17772t.b(this.c, i);
        }
    }

    public final void e() throws IOException {
        r rVar = this.h;
        if (rVar.f17791b) {
            throw new IOException("stream closed");
        }
        if (rVar.c) {
            throw new IOException("stream finished");
        }
        if (this.f17800k != 0) {
            IOException iOException = this.f17801l;
            if (iOException == null) {
                throw new com.tencent.cloud.ai.network.okhttp3.internal.http2.v(this.f17800k);
            }
        }
    }

    public final boolean f(IOException iOException, int i) {
        synchronized (this) {
            try {
                if (this.f17800k != 0) {
                    return false;
                }
                if (this.f17799g.e && this.h.c) {
                    return false;
                }
                this.f17800k = i;
                this.f17801l = iOException;
                notifyAll();
                this.f17798d.k(this.c);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r g() {
        synchronized (this) {
            try {
                if (!this.f && !h()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.h;
    }

    public final boolean h() {
        return this.f17798d.f17760a == ((this.c & 1) == 1);
    }

    public final synchronized boolean i() {
        try {
            if (this.f17800k != 0) {
                return false;
            }
            s sVar = this.f17799g;
            if (sVar.e || sVar.f17795d) {
                r rVar = this.h;
                if (rVar.c || rVar.f17791b) {
                    if (this.f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
