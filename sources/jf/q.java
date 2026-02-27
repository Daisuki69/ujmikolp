package jf;

import d4.AbstractC1331a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import of.C1976a;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Closeable, AutoCloseable {
    public static final Logger e = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of.n f17787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f17788b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f17789d;

    public q(of.n nVar, boolean z4) {
        this.f17787a = nVar;
        this.c = z4;
        p pVar = new p(nVar);
        this.f17788b = pVar;
        this.f17789d = new b(pVar);
    }

    public static int b(byte b8, short s9, int i) throws IOException {
        if ((b8 & 8) != 0) {
            i--;
        }
        if (s9 <= i) {
            return (short) (i - s9);
        }
        d.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s9), Integer.valueOf(i));
        throw null;
    }

    public static int c(of.n nVar) {
        return (nVar.readByte() & 255) | ((nVar.readByte() & 255) << 16) | ((nVar.readByte() & 255) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17787a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        throw new java.io.IOException(We.s.f(r4, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f(int r3, short r4, byte r5, int r6) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.q.f(int, short, byte, int):java.util.ArrayList");
    }

    public final void g(j jVar) throws IOException {
        if (this.c) {
            if (m(true, jVar)) {
                return;
            }
            d.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        C1976a c1976a = d.f17747a;
        C1976a c1976aC = this.f17787a.c(c1976a.f18814a.length);
        Level level = Level.FINE;
        Logger logger = e;
        if (logger.isLoggable(level)) {
            String strF = c1976aC.f();
            byte[] bArr = ef.c.f16663a;
            Locale locale = Locale.US;
            logger.fine("<< CONNECTION " + strF);
        }
        if (c1976a.equals(c1976aC)) {
            return;
        }
        d.c("Expected a connection header but was %s", c1976aC.l());
        throw null;
    }

    public final void i(j jVar, int i, byte b8, int i4) throws IOException {
        int i6;
        t tVar;
        if (i4 == 0) {
            d.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z4 = (b8 & 1) != 0;
        short s9 = (b8 & 8) != 0 ? (short) (this.f17787a.readByte() & 255) : (short) 0;
        if ((b8 & 32) != 0) {
            of.n nVar = this.f17787a;
            nVar.readInt();
            nVar.readByte();
            jVar.getClass();
            i6 = i - 5;
        } else {
            i6 = i;
        }
        ArrayList arrayListF = f(b(b8, s9, i6), s9, b8, i4);
        ((k) jVar.f17758d).getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            k kVar = (k) jVar.f17758d;
            kVar.getClass();
            try {
                m mVar = new m(kVar, new Object[]{kVar.f17762d, Integer.valueOf(i4)}, i4, arrayListF, 1);
                synchronized (kVar) {
                    if (!kVar.f17763g) {
                        kVar.i.execute(mVar);
                    }
                }
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (((k) jVar.f17758d)) {
            try {
                k kVar2 = (k) jVar.f17758d;
                synchronized (kVar2) {
                    tVar = (t) kVar2.c.get(Integer.valueOf(i4));
                }
                if (tVar != null) {
                    tVar.c(ef.c.n(arrayListF), z4);
                    return;
                }
                k kVar3 = (k) jVar.f17758d;
                if (kVar3.f17763g) {
                    return;
                }
                if (i4 <= kVar3.e) {
                    return;
                }
                if (i4 % 2 == kVar3.f % 2) {
                    return;
                }
                t tVar2 = new t(i4, (k) jVar.f17758d, false, z4, ef.c.n(arrayListF));
                k kVar4 = (k) jVar.f17758d;
                kVar4.e = i4;
                kVar4.c.put(Integer.valueOf(i4), tVar2);
                k.f17759w.execute(new j(jVar, new Object[]{((k) jVar.f17758d).f17762d, Integer.valueOf(i4)}, tVar2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(j jVar, int i, int i4) throws IOException {
        int i6;
        t[] tVarArr;
        if (i < 8) {
            d.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i4 != 0) {
            d.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int i10 = this.f17787a.readInt();
        int i11 = this.f17787a.readInt();
        int i12 = i - 8;
        int[] iArrD = AbstractC2217b.d(11);
        int length = iArrD.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                i6 = 0;
                break;
            }
            i6 = iArrD[i13];
            if (AbstractC1331a.g(i6) == i11) {
                break;
            } else {
                i13++;
            }
        }
        if (i6 == 0) {
            d.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i11));
            throw null;
        }
        C1976a c1976aC = C1976a.e;
        if (i12 > 0) {
            c1976aC = this.f17787a.c(i12);
        }
        jVar.getClass();
        c1976aC.size();
        synchronized (((k) jVar.f17758d)) {
            tVarArr = (t[]) ((k) jVar.f17758d).c.values().toArray(new t[((k) jVar.f17758d).c.size()]);
            ((k) jVar.f17758d).f17763g = true;
        }
        for (t tVar : tVarArr) {
            if (tVar.c > i10 && tVar.h()) {
                synchronized (tVar) {
                    if (tVar.f17800k == 0) {
                        tVar.f17800k = 5;
                        tVar.notifyAll();
                    }
                }
                ((k) jVar.f17758d).k(tVar.c);
            }
        }
    }

    public final boolean m(boolean z4, j jVar) throws IOException {
        t tVar;
        boolean z5;
        boolean z8;
        boolean z9;
        long j;
        try {
            this.f17787a.k(9L);
            int iC = c(this.f17787a);
            if (iC < 0 || iC > 16384) {
                d.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iC));
                throw null;
            }
            byte b8 = (byte) (this.f17787a.readByte() & 255);
            if (z4 && b8 != 4) {
                d.c("Expected a SETTINGS frame but was %s", Byte.valueOf(b8));
                throw null;
            }
            byte b10 = (byte) (this.f17787a.readByte() & 255);
            int i = this.f17787a.readInt();
            int i4 = Integer.MAX_VALUE & i;
            Logger logger = e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(d.a(true, i4, iC, b8, b10));
            }
            switch (b8) {
                case 0:
                    if (i4 == 0) {
                        d.c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z10 = (b10 & 1) != 0;
                    if ((b10 & 32) != 0) {
                        d.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    short s9 = (b10 & 8) != 0 ? (short) (this.f17787a.readByte() & 255) : (short) 0;
                    int iB = b(b10, s9, iC);
                    of.n nVar = this.f17787a;
                    ((k) jVar.f17758d).getClass();
                    if (i4 != 0 && (i & 1) == 0) {
                        k kVar = (k) jVar.f17758d;
                        kVar.getClass();
                        of.e eVar = new of.e();
                        long j6 = iB;
                        nVar.k(j6);
                        nVar.a(j6, eVar);
                        if (eVar.f18822b != j6) {
                            throw new IOException(eVar.f18822b + " != " + iB);
                        }
                        n nVar2 = new n(kVar, new Object[]{kVar.f17762d, Integer.valueOf(i4)}, i4, eVar, iB);
                        synchronized (kVar) {
                            if (!kVar.f17763g) {
                                kVar.i.execute(nVar2);
                            }
                            break;
                        }
                    } else {
                        k kVar2 = (k) jVar.f17758d;
                        synchronized (kVar2) {
                            tVar = (t) kVar2.c.get(Integer.valueOf(i4));
                        }
                        if (tVar != null) {
                            s sVar = tVar.f17799g;
                            long j7 = iB;
                            sVar.getClass();
                            while (true) {
                                if (j7 > 0) {
                                    synchronized (sVar.f) {
                                        z8 = sVar.e;
                                        z9 = sVar.f17794b.f18822b + j7 > sVar.c;
                                    }
                                    if (z9) {
                                        nVar.i(j7);
                                        sVar.f.b(4);
                                    } else if (z8) {
                                        nVar.i(j7);
                                    } else {
                                        long jA = nVar.a(j7, sVar.f17793a);
                                        if (jA == -1) {
                                            throw new EOFException();
                                        }
                                        j7 -= jA;
                                        synchronized (sVar.f) {
                                            try {
                                                if (sVar.f17795d) {
                                                    of.e eVar2 = sVar.f17793a;
                                                    j = eVar2.f18822b;
                                                    eVar2.E();
                                                } else {
                                                    of.e eVar3 = sVar.f17794b;
                                                    boolean z11 = eVar3.f18822b == 0;
                                                    eVar3.g(sVar.f17793a);
                                                    if (z11) {
                                                        sVar.f.notifyAll();
                                                    }
                                                    j = 0;
                                                }
                                            } finally {
                                            }
                                        }
                                        if (j > 0) {
                                            sVar.f.f17798d.m(j);
                                        }
                                    }
                                }
                            }
                            if (z10) {
                                z5 = true;
                                tVar.c(ef.c.f16664b, true);
                            } else {
                                z5 = true;
                            }
                            this.f17787a.i(s9);
                            return z5;
                        }
                        ((k) jVar.f17758d).c(i4, 2);
                        long j9 = iB;
                        ((k) jVar.f17758d).m(j9);
                        nVar.i(j9);
                    }
                    z5 = true;
                    this.f17787a.i(s9);
                    return z5;
                case 1:
                    i(jVar, iC, b10, i4);
                    return true;
                case 2:
                    if (iC != 5) {
                        d.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iC));
                        throw null;
                    }
                    if (i4 == 0) {
                        d.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    of.n nVar3 = this.f17787a;
                    nVar3.readInt();
                    nVar3.readByte();
                    jVar.getClass();
                    return true;
                case 3:
                    r(jVar, iC, i4);
                    return true;
                case 4:
                    if (i4 != 0) {
                        d.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b10 & 1) != 0) {
                        if (iC == 0) {
                            jVar.getClass();
                            return true;
                        }
                        d.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    if (iC % 6 != 0) {
                        d.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iC));
                        throw null;
                    }
                    Ri.a aVar = new Ri.a();
                    for (int i6 = 0; i6 < iC; i6 += 6) {
                        int i10 = this.f17787a.readShort() & 65535;
                        int i11 = this.f17787a.readInt();
                        if (i10 == 2) {
                            if (i11 != 0 && i11 != 1) {
                                d.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                        } else if (i10 == 3) {
                            i10 = 4;
                        } else if (i10 != 4) {
                            if (i10 == 5 && (i11 < 16384 || i11 > 16777215)) {
                                d.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i11));
                                throw null;
                            }
                        } else {
                            if (i11 < 0) {
                                d.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                throw null;
                            }
                            i10 = 7;
                        }
                        aVar.b(i10, i11);
                    }
                    jVar.getClass();
                    try {
                        k kVar3 = (k) jVar.f17758d;
                        kVar3.h.execute(new j(jVar, new Object[]{kVar3.f17762d}, aVar));
                        break;
                    } catch (RejectedExecutionException unused) {
                    }
                    return true;
                case 5:
                    t(jVar, iC, b10, i4);
                    return true;
                case 6:
                    q(jVar, iC, b10, i4);
                    return true;
                case 7:
                    k(jVar, iC, i4);
                    return true;
                case 8:
                    w(jVar, iC, i4);
                    return true;
                default:
                    this.f17787a.i(iC);
                    return true;
            }
        } catch (EOFException unused2) {
            return false;
        }
    }

    public final void q(j jVar, int i, byte b8, int i4) throws IOException {
        if (i != 8) {
            d.c("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i4 != 0) {
            d.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int i6 = this.f17787a.readInt();
        int i10 = this.f17787a.readInt();
        boolean z4 = (b8 & 1) != 0;
        jVar.getClass();
        if (!z4) {
            try {
                k kVar = (k) jVar.f17758d;
                kVar.h.execute(new i(kVar, i6, i10));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (((k) jVar.f17758d)) {
            try {
                if (i6 == 1) {
                    ((k) jVar.f17758d).f17764k++;
                } else if (i6 == 2) {
                    ((k) jVar.f17758d).m++;
                } else if (i6 == 3) {
                    k kVar2 = (k) jVar.f17758d;
                    kVar2.getClass();
                    kVar2.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(j jVar, int i, int i4) throws IOException {
        int i6;
        t tVar;
        if (i != 4) {
            d.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i4 == 0) {
            d.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int i10 = this.f17787a.readInt();
        int[] iArrD = AbstractC2217b.d(11);
        int length = iArrD.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i6 = 0;
                break;
            }
            i6 = iArrD[i11];
            if (AbstractC1331a.g(i6) == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i6 == 0) {
            d.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i10));
            throw null;
        }
        ((k) jVar.f17758d).getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            k kVar = (k) jVar.f17758d;
            m mVar = new m(kVar, new Object[]{kVar.f17762d, Integer.valueOf(i4)}, i4);
            synchronized (kVar) {
                if (!kVar.f17763g) {
                    kVar.i.execute(mVar);
                }
            }
            return;
        }
        k kVar2 = (k) jVar.f17758d;
        synchronized (kVar2) {
            tVar = (t) kVar2.c.remove(Integer.valueOf(i4));
            kVar2.notifyAll();
        }
        if (tVar != null) {
            synchronized (tVar) {
                if (tVar.f17800k == 0) {
                    tVar.f17800k = i6;
                    tVar.notifyAll();
                }
            }
        }
    }

    public final void t(j jVar, int i, byte b8, int i4) throws IOException {
        if (i4 == 0) {
            d.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s9 = (b8 & 8) != 0 ? (short) (this.f17787a.readByte() & 255) : (short) 0;
        int i6 = this.f17787a.readInt() & Integer.MAX_VALUE;
        ArrayList arrayListF = f(b(b8, s9, i - 4), s9, b8, i4);
        k kVar = (k) jVar.f17758d;
        synchronized (kVar) {
            try {
                if (kVar.f17774v.contains(Integer.valueOf(i6))) {
                    kVar.c(i6, 2);
                    return;
                }
                kVar.f17774v.add(Integer.valueOf(i6));
                try {
                    m mVar = new m(kVar, new Object[]{kVar.f17762d, Integer.valueOf(i6)}, i6, arrayListF, 0);
                    synchronized (kVar) {
                        if (!kVar.f17763g) {
                            kVar.i.execute(mVar);
                        }
                    }
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void w(j jVar, int i, int i4) throws IOException {
        t tVar;
        if (i != 4) {
            d.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            throw null;
        }
        long j = ((long) this.f17787a.readInt()) & 2147483647L;
        if (j == 0) {
            d.c("windowSizeIncrement was 0", Long.valueOf(j));
            throw null;
        }
        if (i4 == 0) {
            synchronized (((k) jVar.f17758d)) {
                k kVar = (k) jVar.f17758d;
                kVar.f17768p += j;
                kVar.notifyAll();
            }
            return;
        }
        k kVar2 = (k) jVar.f17758d;
        synchronized (kVar2) {
            tVar = (t) kVar2.c.get(Integer.valueOf(i4));
        }
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    tVar.f17797b += j;
                    if (j > 0) {
                        tVar.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
