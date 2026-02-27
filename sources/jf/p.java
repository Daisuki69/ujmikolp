package jf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements of.s, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of.n f17784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17785b;
    public byte c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17786d;
    public int e;
    public short f;

    public p(of.n nVar) {
        this.f17784a = nVar;
    }

    @Override // of.s
    public final long a(long j, of.e eVar) throws IOException {
        int i;
        int i4;
        do {
            int i6 = this.e;
            of.n nVar = this.f17784a;
            if (i6 == 0) {
                nVar.i(this.f);
                this.f = (short) 0;
                if ((this.c & 4) == 0) {
                    i = this.f17786d;
                    int iC = q.c(nVar);
                    this.e = iC;
                    this.f17785b = iC;
                    byte b8 = (byte) (nVar.readByte() & 255);
                    this.c = (byte) (nVar.readByte() & 255);
                    Logger logger = q.e;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(d.a(true, this.f17786d, this.f17785b, b8, this.c));
                    }
                    i4 = nVar.readInt() & Integer.MAX_VALUE;
                    this.f17786d = i4;
                    if (b8 != 9) {
                        d.c("%s != TYPE_CONTINUATION", Byte.valueOf(b8));
                        throw null;
                    }
                }
            } else {
                long jA = nVar.a(Math.min(8192L, i6), eVar);
                if (jA != -1) {
                    this.e = (int) (((long) this.e) - jA);
                    return jA;
                }
            }
            return -1L;
        } while (i4 == i);
        d.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // of.s
    public final of.u timeout() {
        return this.f17784a.f18834b.timeout();
    }
}
