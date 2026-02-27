package of;

import dOYHB6.tiZVw8.numX49;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements s, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18824b;
    public final Inflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f18825d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18823a = 0;
    public final CRC32 e = new CRC32();

    public i(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQubb"));
        }
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        Logger logger = k.f18829a;
        n nVar = new n(sVar);
        this.f18824b = nVar;
        this.f18825d = new j(nVar, inflater);
    }

    public static void c(int i, int i4, String str) throws IOException {
        if (i4 != i) {
            throw new IOException(String.format(numX49.tnTj78("bQub2"), str, Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    @Override // of.s
    public final long a(long j, e eVar) throws IOException {
        long j6;
        long j7;
        i iVar = this;
        int i = iVar.f18823a;
        CRC32 crc32 = iVar.e;
        n nVar = iVar.f18824b;
        if (i == 0) {
            nVar.k(10L);
            byte bZ = nVar.f18833a.z(3L);
            boolean z4 = ((bZ >> 1) & 1) == 1;
            if (z4) {
                iVar.b(nVar.f18833a, 0L, 10L);
            }
            c(8075, nVar.readShort(), numX49.tnTj78("bQubL"));
            nVar.i(8L);
            if (((bZ >> 2) & 1) == 1) {
                nVar.k(2L);
                if (z4) {
                    b(nVar.f18833a, 0L, 2L);
                }
                long jA = v.a(nVar.f18833a.readShort());
                nVar.k(jA);
                if (z4) {
                    b(nVar.f18833a, 0L, jA);
                }
                nVar.i(jA);
            }
            if (((bZ >> 3) & 1) == 1) {
                long jB = nVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    j6 = -1;
                    j7 = 2;
                    b(nVar.f18833a, 0L, jB + 1);
                } else {
                    j6 = -1;
                    j7 = 2;
                }
                nVar.i(jB + 1);
            } else {
                j6 = -1;
                j7 = 2;
            }
            if (((bZ >> 4) & 1) == 1) {
                long jB2 = nVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB2 == j6) {
                    throw new EOFException();
                }
                if (z4) {
                    iVar = this;
                    iVar.b(nVar.f18833a, 0L, jB2 + 1);
                } else {
                    iVar = this;
                }
                nVar.i(jB2 + 1);
            } else {
                iVar = this;
            }
            if (z4) {
                nVar.k(j7);
                c(v.a(nVar.f18833a.readShort()), (short) crc32.getValue(), numX49.tnTj78("bQubr"));
                crc32.reset();
            }
            iVar.f18823a = 1;
        } else {
            j6 = -1;
        }
        if (iVar.f18823a == 1) {
            long j9 = eVar.f18822b;
            long jA2 = iVar.f18825d.a(8192L, eVar);
            if (jA2 != j6) {
                iVar.b(eVar, j9, jA2);
                return jA2;
            }
            iVar.f18823a = 2;
        }
        if (iVar.f18823a == 2) {
            nVar.k(4L);
            int i4 = nVar.f18833a.readInt();
            Charset charset = v.f18845a;
            c(((i4 & 255) << 24) | ((i4 & (-16777216)) >>> 24) | ((i4 & 16711680) >>> 8) | ((i4 & 65280) << 8), (int) crc32.getValue(), numX49.tnTj78("bQubZ"));
            nVar.k(4L);
            int i6 = nVar.f18833a.readInt();
            c(((i6 & 255) << 24) | ((i6 & (-16777216)) >>> 24) | ((i6 & 16711680) >>> 8) | ((i6 & 65280) << 8), (int) iVar.c.getBytesWritten(), numX49.tnTj78("bQubk"));
            iVar.f18823a = 3;
            if (!nVar.m()) {
                throw new IOException(numX49.tnTj78("bQubB"));
            }
        }
        return j6;
    }

    public final void b(e eVar, long j, long j6) {
        o oVar = eVar.f18821a;
        while (true) {
            long j7 = oVar.c - oVar.f18836b;
            if (j < j7) {
                break;
            }
            j -= j7;
            oVar = oVar.f;
        }
        while (j6 > 0) {
            int i = (int) (((long) oVar.f18836b) + j);
            int iMin = (int) Math.min(oVar.c - i, j6);
            this.e.update(oVar.f18835a, i, iMin);
            j6 -= (long) iMin;
            oVar = oVar.f;
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18825d.close();
    }

    @Override // of.s
    public final u timeout() {
        return this.f18824b.f18834b.timeout();
    }
}
