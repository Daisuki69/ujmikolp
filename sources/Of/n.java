package of;

import dOYHB6.tiZVw8.numX49;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements g, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f18833a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f18834b;
    public boolean c;

    public n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException(numX49.tnTj78("bQuPm"));
        }
        this.f18834b = sVar;
    }

    @Override // of.s
    public final long a(long j, e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuPM"));
        }
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bQuPh")));
        }
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPD"));
        }
        e eVar2 = this.f18833a;
        if (eVar2.f18822b == 0 && this.f18834b.a(8192L, eVar2) == -1) {
            return -1L;
        }
        return eVar2.a(Math.min(j, eVar2.f18822b), eVar);
    }

    public final long b(byte b8, long j, long j6) {
        o oVar;
        long j7;
        long j9;
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPG"));
        }
        long jMax = 0;
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j6, numX49.tnTj78("bQuPX")));
        }
        while (jMax < j6) {
            e eVar = this.f18833a;
            eVar.getClass();
            long j10 = 0;
            if (jMax < 0 || j6 < jMax) {
                StringBuilder sbS = androidx.camera.core.impl.a.s(eVar.f18822b, numX49.tnTj78("bQuPN"), numX49.tnTj78("bQuP6"));
                sbS.append(jMax);
                throw new IllegalArgumentException(androidx.media3.datasource.cache.c.j(j6, numX49.tnTj78("bQuPa"), sbS));
            }
            long j11 = eVar.f18822b;
            long j12 = j6 > j11 ? j11 : j6;
            if (jMax == j12 || (oVar = eVar.f18821a) == null) {
                j7 = -1;
                j9 = -1;
            } else {
                if (j11 - jMax < jMax) {
                    while (j11 > jMax) {
                        oVar = oVar.f18838g;
                        j11 -= (long) (oVar.c - oVar.f18836b);
                    }
                } else {
                    while (true) {
                        long j13 = ((long) (oVar.c - oVar.f18836b)) + j10;
                        if (j13 >= jMax) {
                            break;
                        }
                        oVar = oVar.f;
                        j10 = j13;
                    }
                    j11 = j10;
                }
                long j14 = jMax;
                while (j11 < j12) {
                    byte[] bArr = oVar.f18835a;
                    j7 = -1;
                    int iMin = (int) Math.min(oVar.c, (((long) oVar.f18836b) + j12) - j11);
                    for (int i = (int) ((((long) oVar.f18836b) + j14) - j11); i < iMin; i++) {
                        if (bArr[i] == b8) {
                            j9 = ((long) (i - oVar.f18836b)) + j11;
                            break;
                        }
                    }
                    long j15 = ((long) (oVar.c - oVar.f18836b)) + j11;
                    oVar = oVar.f;
                    j14 = j15;
                    j11 = j14;
                }
                j7 = -1;
                j9 = -1;
            }
            if (j9 != j7) {
                return j9;
            }
            long j16 = eVar.f18822b;
            if (j16 >= j6 || this.f18834b.a(8192L, eVar) == j7) {
                return j7;
            }
            jMax = Math.max(jMax, j16);
        }
        return -1L;
    }

    public final C1976a c(long j) throws EOFException {
        if (!f(j)) {
            throw new EOFException();
        }
        e eVar = this.f18833a;
        eVar.getClass();
        return new C1976a(eVar.y(j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f18834b.close();
        this.f18833a.E();
    }

    public final boolean f(long j) {
        e eVar;
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bQuPy")));
        }
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuP3"));
        }
        do {
            eVar = this.f18833a;
            if (eVar.f18822b >= j) {
                return true;
            }
        } while (this.f18834b.a(8192L, eVar) != -1);
        return false;
    }

    public final String g(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bQuPA")));
        }
        long j6 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jB = b((byte) 10, 0L, j6);
        e eVar = this.f18833a;
        if (jB != -1) {
            return eVar.C(jB);
        }
        if (j6 < Long.MAX_VALUE && f(j6) && eVar.z(j6 - 1) == 13 && f(j6 + 1) && eVar.z(j6) == 10) {
            return eVar.C(j6);
        }
        e eVar2 = new e();
        long jMin = Math.min(32L, eVar.f18822b);
        long j7 = 0;
        v.b(eVar.f18822b, 0L, jMin);
        if (jMin != 0) {
            eVar2.f18822b += jMin;
            o oVar = eVar.f18821a;
            while (true) {
                long j9 = oVar.c - oVar.f18836b;
                if (j7 < j9) {
                    break;
                }
                j7 -= j9;
                oVar = oVar.f;
            }
            long j10 = jMin;
            while (j10 > 0) {
                o oVarD = oVar.d();
                int i = (int) (((long) oVarD.f18836b) + j7);
                oVarD.f18836b = i;
                oVarD.c = Math.min(i + ((int) j10), oVarD.c);
                o oVar2 = eVar2.f18821a;
                if (oVar2 == null) {
                    oVarD.f18838g = oVarD;
                    oVarD.f = oVarD;
                    eVar2.f18821a = oVarD;
                } else {
                    oVar2.f18838g.b(oVarD);
                }
                j10 -= (long) (oVarD.c - oVarD.f18836b);
                oVar = oVar.f;
                j7 = 0;
            }
        }
        throw new EOFException(numX49.tnTj78("bQuPv") + Math.min(eVar.f18822b, j) + numX49.tnTj78("bQuP7") + new C1976a(eVar2.x()).f() + (char) 8230);
    }

    public final void i(long j) throws EOFException {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPY"));
        }
        while (j > 0) {
            e eVar = this.f18833a;
            if (eVar.f18822b == 0 && this.f18834b.a(8192L, eVar) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, eVar.f18822b);
            eVar.r(jMin);
            j -= jMin;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // of.g
    public final String j(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuPT"));
        }
        e eVar = this.f18833a;
        eVar.g(this.f18834b);
        try {
            return eVar.c(eVar.f18822b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void k(long j) throws EOFException {
        if (!f(j)) {
            throw new EOFException();
        }
    }

    public final boolean m() {
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPR"));
        }
        e eVar = this.f18833a;
        return eVar.w() && this.f18834b.a(8192L, eVar) == -1;
    }

    @Override // of.g
    public final int n(l lVar) throws EOFException {
        e eVar;
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bQuPp"));
        }
        do {
            eVar = this.f18833a;
            o oVar = eVar.f18821a;
            C1976a[] c1976aArr = lVar.f18830a;
            int length = c1976aArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                C1976a c1976a = c1976aArr[i];
                int iMin = (int) Math.min(eVar.f18822b, c1976a.size());
                if (iMin == 0 || e.i(oVar, oVar.f18836b, c1976a, iMin)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                break;
            }
            long size = lVar.f18830a[i].size();
            if (size <= eVar.f18822b) {
                eVar.r(size);
                return i;
            }
        } while (this.f18834b.a(8192L, eVar) != -1);
        return -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        e eVar = this.f18833a;
        if (eVar.f18822b == 0 && this.f18834b.a(8192L, eVar) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    public final byte readByte() throws EOFException {
        k(1L);
        return this.f18833a.readByte();
    }

    public final void readFully(byte[] bArr) throws EOFException {
        e eVar = this.f18833a;
        int i = 0;
        try {
            k(bArr.length);
            while (i < bArr.length) {
                int iB = eVar.b(bArr, i, bArr.length - i);
                if (iB == -1) {
                    throw new EOFException();
                }
                i += iB;
            }
        } catch (EOFException e) {
            while (true) {
                long j = eVar.f18822b;
                if (j <= 0) {
                    throw e;
                }
                int iB2 = eVar.b(bArr, i, (int) j);
                if (iB2 == -1) {
                    throw new AssertionError();
                }
                i += iB2;
            }
        }
    }

    public final int readInt() throws EOFException {
        k(4L);
        return this.f18833a.readInt();
    }

    public final short readShort() throws EOFException {
        k(2L);
        return this.f18833a.readShort();
    }

    @Override // of.s
    public final u timeout() {
        return this.f18834b.timeout();
    }

    public final String toString() {
        return numX49.tnTj78("bQuP0") + this.f18834b + numX49.tnTj78("bQuPg");
    }

    @Override // of.g
    public final byte[] x() {
        e eVar = this.f18833a;
        eVar.g(this.f18834b);
        return eVar.x();
    }
}
