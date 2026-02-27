package gf;

import D.Z;
import We.s;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.agent.Global;
import com.paymaya.domain.store.L;
import df.C1357C;
import df.C1364f;
import df.C1365g;
import df.EnumC1355A;
import df.r;
import df.w;
import df.x;
import df.z;
import hf.C1564b;
import hf.InterfaceC1565c;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import jf.o;
import jf.t;
import jf.u;
import nf.C1945c;
import of.m;
import of.n;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends jf.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16813b;
    public final C1357C c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f16814d;
    public Socket e;
    public w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EnumC1355A f16815g;
    public jf.k h;
    public n i;
    public m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16817l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16819o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f16820p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f16821q = Long.MAX_VALUE;

    public e(f fVar, C1357C c1357c) {
        this.f16813b = fVar;
        this.c = c1357c;
    }

    @Override // jf.h
    public final void a(jf.k kVar) {
        int i;
        synchronized (this.f16813b) {
            try {
                synchronized (kVar) {
                    Ri.a aVar = kVar.f17770r;
                    i = (aVar.f5558b & 16) != 0 ? ((int[]) aVar.c)[4] : Integer.MAX_VALUE;
                }
                this.f16819o = i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // jf.h
    public final void b(t tVar) {
        tVar.d(null, 5);
    }

    public final InterfaceC1565c c(C1364f c1364f, C1564b c1564b) throws SocketException {
        if (this.h != null) {
            return new o(c1364f, this, c1564b, this.h);
        }
        Socket socket = this.e;
        int i = c1564b.h;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.i.f18834b.timeout().b(i);
        this.j.f18832b.timeout().b(c1564b.i);
        return new p003if.g(c1364f, this, this.i, this.j);
    }

    public final void d() throws SocketException {
        int i;
        int i4 = 1;
        this.e.setSoTimeout(0);
        Z z4 = new Z();
        z4.f = jf.h.f17754a;
        z4.f889a = true;
        Socket socket = this.e;
        String str = this.c.f16395a.f16458a.f16508d;
        n nVar = this.i;
        m mVar = this.j;
        z4.f890b = socket;
        z4.c = str;
        z4.f891d = nVar;
        z4.e = mVar;
        z4.f = this;
        jf.k kVar = new jf.k(z4);
        this.h = kVar;
        u uVar = kVar.f17772t;
        synchronized (uVar) {
            try {
                if (uVar.e) {
                    throw new IOException("closed");
                }
                if (uVar.f17804b) {
                    Logger logger = u.f17802g;
                    if (logger.isLoggable(Level.FINE)) {
                        String strF = jf.d.f17747a.f();
                        byte[] bArr = ef.c.f16663a;
                        Locale locale = Locale.US;
                        logger.fine(">> CONNECTION " + strF);
                    }
                    uVar.f17803a.b((byte[]) jf.d.f17747a.f18814a.clone());
                    uVar.f17803a.flush();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        u uVar2 = kVar.f17772t;
        Ri.a aVar = kVar.f17769q;
        synchronized (uVar2) {
            try {
                if (uVar2.e) {
                    throw new IOException("closed");
                }
                uVar2.c(0, Integer.bitCount(aVar.f5558b) * 6, (byte) 4, (byte) 0);
                int i6 = 0;
                while (i6 < 10) {
                    if (((i4 << i6) & aVar.f5558b) != 0) {
                        int i10 = i6 == 4 ? 3 : i6 == 7 ? 4 : i6;
                        m mVar2 = uVar2.f17803a;
                        if (mVar2.c) {
                            throw new IllegalStateException("closed");
                        }
                        of.e eVar = mVar2.f18831a;
                        of.o oVarQ = eVar.q(2);
                        int i11 = oVarQ.c;
                        i = i4;
                        byte[] bArr2 = oVarQ.f18835a;
                        bArr2[i11] = (byte) ((i10 >>> 8) & 255);
                        bArr2[i11 + 1] = (byte) (i10 & 255);
                        oVarQ.c = i11 + 2;
                        eVar.f18822b += 2;
                        mVar2.g();
                        uVar2.f17803a.c(((int[]) aVar.c)[i6]);
                    } else {
                        i = i4;
                    }
                    i6++;
                    i4 = i;
                }
                uVar2.f17803a.flush();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (kVar.f17769q.a() != 65535) {
            kVar.f17772t.i(0, r0 - 65535);
        }
        new Thread(kVar.f17773u).start();
    }

    public final void e(int i, int i4, int i6, mg.c cVar) throws IOException {
        Ci.b bVar = new Ci.b();
        C1357C c1357c = this.c;
        z zVar = c1357c.f16395a.f16458a;
        if (zVar == null) {
            throw new NullPointerException("url == null");
        }
        bVar.f785b = zVar;
        bVar.F("CONNECT", null);
        df.n nVar = c1357c.f16395a;
        bVar.z("Host", ef.c.e(nVar.f16458a, true));
        bVar.z("Proxy-Connection", "Keep-Alive");
        bVar.z(RtspHeaders.USER_AGENT, "okhttp/3.14.0");
        C1365g c1365gK = bVar.k();
        df.j jVar = new df.j();
        jVar.e = c1365gK;
        jVar.f = EnumC1355A.HTTP_1_1;
        jVar.f16445b = 407;
        jVar.f16444a = "Preemptive Authenticate";
        jVar.i = ef.c.c;
        jVar.c = -1L;
        jVar.f16446d = -1L;
        L l6 = (L) jVar.h;
        l6.getClass();
        x.c(RtspHeaders.PROXY_AUTHENTICATE);
        x.d("OkHttp-Preemptive", RtspHeaders.PROXY_AUTHENTICATE);
        l6.b(RtspHeaders.PROXY_AUTHENTICATE);
        ArrayList arrayList = (ArrayList) l6.f11367b;
        arrayList.add(RtspHeaders.PROXY_AUTHENTICATE);
        arrayList.add("OkHttp-Preemptive");
        jVar.a();
        nVar.f16460d.getClass();
        g(i, i4, cVar);
        String str = "CONNECT " + ef.c.e(c1365gK.f16439a, true) + " HTTP/1.1";
        n nVar2 = this.i;
        m mVar = this.j;
        p003if.g gVar = new p003if.g(null, null, nVar2, mVar);
        of.u uVarTimeout = nVar2.f18834b.timeout();
        long j = i4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVarTimeout.b(j);
        this.j.f18832b.timeout().b(i6);
        gVar.g(c1365gK.c, str);
        mVar.flush();
        df.j jVarD = gVar.d(false);
        jVarD.e = c1365gK;
        df.k kVarA = jVarD.a();
        long jC = hf.e.c(kVarA);
        if (jC != -1) {
            p003if.d dVarF = gVar.f(jC);
            ef.c.o(dVarF, Integer.MAX_VALUE);
            dVarF.close();
        }
        int i10 = kVarA.c;
        if (i10 != 200) {
            if (i10 != 407) {
                throw new IOException(s.f(i10, "Unexpected response code for CONNECT: "));
            }
            nVar.f16460d.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!this.i.f18833a.w() || !this.j.f18831a.w()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r10, int r11, int r12, boolean r13, mg.c r14) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.e.f(int, int, int, boolean, mg.c):void");
    }

    public final void g(int i, int i4, mg.c cVar) throws IOException {
        C1357C c1357c = this.c;
        Proxy proxy = c1357c.f16396b;
        InetSocketAddress inetSocketAddress = c1357c.c;
        Socket socketCreateSocket = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? c1357c.f16395a.c.createSocket() : new Socket(proxy);
        this.f16814d = socketCreateSocket;
        cVar.getClass();
        socketCreateSocket.setSoTimeout(i4);
        try {
            kf.f.f18131a.f(this.f16814d, inetSocketAddress, i);
            try {
                this.i = new n(of.k.b(this.f16814d));
                this.j = new m(of.k.a(this.f16814d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e7);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(C1518a c1518a, mg.c cVar) throws Throwable {
        SSLSocket sSLSocket;
        df.n nVar = this.c.f16395a;
        SSLSocketFactory sSLSocketFactory = nVar.h;
        z zVar = nVar.f16458a;
        EnumC1355A enumC1355AA = EnumC1355A.HTTP_1_1;
        List list = nVar.e;
        if (sSLSocketFactory == null) {
            EnumC1355A enumC1355A = EnumC1355A.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC1355A)) {
                this.e = this.f16814d;
                this.f16815g = enumC1355AA;
                return;
            } else {
                this.e = this.f16814d;
                this.f16815g = enumC1355A;
                d();
                return;
            }
        }
        cVar.getClass();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(this.f16814d, zVar.f16508d, zVar.e, true);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (AssertionError e) {
            e = e;
        }
        try {
            df.u uVarA = c1518a.a(sSLSocket);
            String str = zVar.f16508d;
            boolean z4 = uVarA.f16490b;
            if (z4) {
                kf.f.f18131a.g(sSLSocket, str, list);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            w wVarA = w.a(session);
            boolean zVerify = nVar.i.verify(str, session);
            List list2 = wVarA.c;
            if (zVerify) {
                nVar.j.b(str, list2);
                String strC = z4 ? kf.f.f18131a.c(sSLSocket) : null;
                this.e = sSLSocket;
                this.i = new n(of.k.b(sSLSocket));
                this.j = new m(of.k.a(this.e));
                this.f = wVarA;
                if (strC != null) {
                    enumC1355AA = EnumC1355A.a(strC);
                }
                this.f16815g = enumC1355AA;
                kf.f.f18131a.getClass();
                if (enumC1355AA == EnumC1355A.HTTP_2) {
                    d();
                    return;
                }
                return;
            }
            if (list2.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + str + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) list2.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + r.a(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C1945c.a(x509Certificate));
        } catch (AssertionError e7) {
            e = e7;
            if (!ef.c.k(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                kf.f.f18131a.getClass();
            }
            ef.c.i(sSLSocket2);
            throw th;
        }
    }

    public final boolean i(z zVar) {
        int i = zVar.e;
        z zVar2 = this.c.f16395a.f16458a;
        if (i == zVar2.e) {
            String str = zVar.f16508d;
            if (str.equals(zVar2.f16508d)) {
                return true;
            }
            w wVar = this.f;
            if (wVar != null && C1945c.c(str, (X509Certificate) wVar.c.get(0))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r3 >= r0.f17766n) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(boolean r10) {
        /*
            r9 = this;
            java.net.Socket r0 = r9.e
            boolean r0 = r0.isClosed()
            r1 = 0
            if (r0 != 0) goto L68
            java.net.Socket r0 = r9.e
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L68
            java.net.Socket r0 = r9.e
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L1a
            goto L68
        L1a:
            jf.k r0 = r9.h
            r2 = 1
            if (r0 == 0) goto L3f
            long r3 = java.lang.System.nanoTime()
            monitor-enter(r0)
            boolean r10 = r0.f17763g     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L29
            goto L37
        L29:
            long r5 = r0.m     // Catch: java.lang.Throwable -> L39
            long r7 = r0.f17765l     // Catch: java.lang.Throwable -> L39
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L3b
            long r5 = r0.f17766n     // Catch: java.lang.Throwable -> L39
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 < 0) goto L3b
        L37:
            monitor-exit(r0)
            return r1
        L39:
            r10 = move-exception
            goto L3d
        L3b:
            monitor-exit(r0)
            return r2
        L3d:
            monitor-exit(r0)
            throw r10
        L3f:
            if (r10 == 0) goto L67
            java.net.Socket r10 = r9.e     // Catch: java.net.SocketTimeoutException -> L67 java.io.IOException -> L68
            int r10 = r10.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L67 java.io.IOException -> L68
            java.net.Socket r0 = r9.e     // Catch: java.lang.Throwable -> L60
            r0.setSoTimeout(r2)     // Catch: java.lang.Throwable -> L60
            of.n r0 = r9.i     // Catch: java.lang.Throwable -> L60
            boolean r0 = r0.m()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L5a
            java.net.Socket r0 = r9.e     // Catch: java.net.SocketTimeoutException -> L67 java.io.IOException -> L68
            r0.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> L67 java.io.IOException -> L68
            return r1
        L5a:
            java.net.Socket r0 = r9.e     // Catch: java.net.SocketTimeoutException -> L67 java.io.IOException -> L68
            r0.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> L67 java.io.IOException -> L68
            return r2
        L60:
            r0 = move-exception
            java.net.Socket r3 = r9.e     // Catch: java.net.SocketTimeoutException -> L67 java.io.IOException -> L68
            r3.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> L67 java.io.IOException -> L68
            throw r0     // Catch: java.net.SocketTimeoutException -> L67 java.io.IOException -> L68
        L67:
            return r2
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.e.j(boolean):boolean");
    }

    public final void k() {
        synchronized (this.f16813b) {
            this.f16816k = true;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Connection{");
        C1357C c1357c = this.c;
        sb2.append(c1357c.f16395a.f16458a.f16508d);
        sb2.append(Global.COLON);
        sb2.append(c1357c.f16395a.f16458a.e);
        sb2.append(", proxy=");
        sb2.append(c1357c.f16396b);
        sb2.append(" hostAddress=");
        sb2.append(c1357c.c);
        sb2.append(" cipherSuite=");
        w wVar = this.f;
        sb2.append(wVar != null ? wVar.f16499b : "none");
        sb2.append(" protocol=");
        sb2.append(this.f16815g);
        sb2.append('}');
        return sb2.toString();
    }
}
