package jf;

import D.Z;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ThreadPoolExecutor f17759w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f17761b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17762d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17763g;
    public final ScheduledThreadPoolExecutor h;
    public final ThreadPoolExecutor i;
    public final mg.c j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f17768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Ri.a f17769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ri.a f17770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Socket f17771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f17772t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f17773u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f17774v;
    public final LinkedHashMap c = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17764k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17765l = 0;
    public long m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17766n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f17767o = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = ef.c.f16663a;
        f17759w = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ef.b(0, "OkHttp Http2Connection", true));
    }

    public k(Z z4) {
        Ri.a aVar = new Ri.a();
        this.f17769q = aVar;
        Ri.a aVar2 = new Ri.a();
        this.f17770r = aVar2;
        this.f17774v = new LinkedHashSet();
        this.j = mg.c.f18415d;
        boolean z5 = z4.f889a;
        this.f17760a = z5;
        this.f17761b = (h) z4.f;
        int i = z5 ? 1 : 2;
        this.f = i;
        if (z5) {
            this.f = i + 2;
        }
        if (z5) {
            aVar.b(7, 16777216);
        }
        String str = (String) z4.c;
        this.f17762d = str;
        byte[] bArr = ef.c.f16663a;
        Locale locale = Locale.US;
        this.h = new ScheduledThreadPoolExecutor(1, new ef.b(0, We.s.j("OkHttp ", str, " Writer"), false));
        this.i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ef.b(0, We.s.j("OkHttp ", str, " Push Observer"), true));
        aVar2.b(7, 65535);
        aVar2.b(5, 16384);
        this.f17768p = aVar2.a();
        this.f17771s = (Socket) z4.f890b;
        this.f17772t = new u((of.m) z4.e, z5);
        this.f17773u = new j(this, new q((of.n) z4.f891d, z5));
    }

    public final void b(int i) {
        synchronized (this.f17772t) {
            synchronized (this) {
                if (this.f17763g) {
                    return;
                }
                this.f17763g = true;
                this.f17772t.g(this.e, i, ef.c.f16663a);
            }
        }
    }

    public final void c(int i, int i4) {
        try {
            this.h.execute(new e(this, new Object[]{this.f17762d, Integer.valueOf(i)}, i, i4));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f(1, 6, null);
    }

    public final void f(int i, int i4, IOException iOException) {
        t[] tVarArr;
        try {
            b(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.c.isEmpty()) {
                    tVarArr = null;
                } else {
                    tVarArr = (t[]) this.c.values().toArray(new t[this.c.size()]);
                    this.c.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (tVarArr != null) {
            for (t tVar : tVarArr) {
                try {
                    tVar.d(iOException, i4);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f17772t.close();
        } catch (IOException unused3) {
        }
        try {
            this.f17771s.close();
        } catch (IOException unused4) {
        }
        this.h.shutdown();
        this.i.shutdown();
    }

    public final void flush() {
        u uVar = this.f17772t;
        synchronized (uVar) {
            if (uVar.e) {
                throw new IOException("closed");
            }
            uVar.f17803a.flush();
        }
    }

    public final void g(int i, long j) {
        try {
            this.h.execute(new f(this, new Object[]{this.f17762d, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f17772t.f17805d);
        r6 = r2;
        r8.f17768p -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r9, boolean r10, of.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            jf.u r12 = r8.f17772t
            r12.q(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r4 = r8.f17768p     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.LinkedHashMap r2 = r8.c     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            goto L12
        L28:
            r9 = move-exception
            goto L63
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            jf.u r4 = r8.f17772t     // Catch: java.lang.Throwable -> L28
            int r4 = r4.f17805d     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f17768p     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f17768p = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            jf.u r4 = r8.f17772t
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.q(r5, r9, r11, r2)
            goto Ld
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.k.i(int, boolean, of.e, long):void");
    }

    public final synchronized void k(int i) {
        notifyAll();
    }

    public final synchronized void m(long j) {
        long j6 = this.f17767o + j;
        this.f17767o = j6;
        if (j6 >= this.f17769q.a() / 2) {
            g(0, this.f17767o);
            this.f17767o = 0L;
        }
    }
}
