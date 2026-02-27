package gf;

import com.paymaya.domain.store.A0;
import df.C1357C;
import df.n;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f16822g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16824b;
    public final androidx.window.layout.adapter.extensions.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f16825d;
    public final A0 e;
    public boolean f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = ef.c.f16663a;
        f16822g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ef.b(0, "OkHttp ConnectionPool", true));
    }

    public f() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.c = new androidx.window.layout.adapter.extensions.a(this, 14);
        this.f16825d = new ArrayDeque();
        this.e = new A0(9);
        this.f16823a = 5;
        this.f16824b = timeUnit.toNanos(5L);
    }

    public final int a(e eVar, long j) {
        ArrayList arrayList = eVar.f16820p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                kf.f.f18131a.e(((j) reference).f16834a, "A connection to " + eVar.c.f16395a.f16458a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                eVar.f16816k = true;
                if (arrayList.isEmpty()) {
                    eVar.f16821q = j - this.f16824b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public final void b(C1357C c1357c, IOException iOException) {
        if (c1357c.f16396b.type() != Proxy.Type.DIRECT) {
            n nVar = c1357c.f16395a;
            nVar.f16461g.connectFailed(nVar.f16458a.k(), c1357c.f16396b.address(), iOException);
        }
        A0 a02 = this.e;
        synchronized (a02) {
            ((LinkedHashSet) a02.f11334b).add(c1357c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0006, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(df.n r10, gf.k r11, java.util.ArrayList r12, boolean r13) {
        /*
            r9 = this;
            java.util.ArrayDeque r0 = r9.f16825d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            gf.e r1 = (gf.e) r1
            if (r13 == 0) goto L19
            jf.k r3 = r1.h
            if (r3 == 0) goto L6
        L19:
            java.util.ArrayList r3 = r1.f16820p
            int r3 = r3.size()
            int r4 = r1.f16819o
            if (r3 >= r4) goto L6
            boolean r3 = r1.f16816k
            if (r3 == 0) goto L28
            goto L6
        L28:
            M2.b r3 = M2.b.c
            df.C r4 = r1.c
            df.n r5 = r4.f16395a
            r3.getClass()
            boolean r3 = r5.a(r10)
            if (r3 != 0) goto L38
            goto L6
        L38:
            df.z r3 = r10.f16458a
            java.lang.String r5 = r3.f16508d
            df.n r6 = r4.f16395a
            df.z r6 = r6.f16458a
            java.lang.String r6 = r6.f16508d
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L49
            goto L91
        L49:
            jf.k r5 = r1.h
            if (r5 != 0) goto L4e
            goto L6
        L4e:
            if (r12 == 0) goto L6
            int r5 = r12.size()
        L54:
            if (r2 >= r5) goto L6
            java.lang.Object r6 = r12.get(r2)
            df.C r6 = (df.C1357C) r6
            java.net.Proxy r7 = r6.f16396b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto Lab
            java.net.Proxy r7 = r4.f16396b
            java.net.Proxy$Type r7 = r7.type()
            if (r7 != r8) goto Lab
            java.net.InetSocketAddress r7 = r4.c
            java.net.InetSocketAddress r6 = r6.c
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Lab
            nf.c r2 = nf.C1945c.f18728a
            nf.c r4 = r10.i
            if (r4 == r2) goto L7f
            goto L6
        L7f:
            boolean r2 = r1.i(r3)
            if (r2 != 0) goto L86
            goto L6
        L86:
            df.r r2 = r10.j     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            java.lang.String r3 = r3.f16508d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            df.w r4 = r1.f     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            java.util.List r4 = r4.c     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            r2.b(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
        L91:
            gf.e r10 = r11.i
            if (r10 != 0) goto La5
            r11.i = r1
            java.util.ArrayList r10 = r1.f16820p
            gf.j r12 = new gf.j
            java.lang.Object r13 = r11.f
            r12.<init>(r11, r13)
            r10.add(r12)
            r10 = 1
            return r10
        La5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        Lab:
            int r2 = r2 + 1
            goto L54
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.f.c(df.n, gf.k, java.util.ArrayList, boolean):boolean");
    }
}
