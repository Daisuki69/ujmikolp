package of;

import androidx.media3.extractor.ts.PsExtractor;
import dOYHB6.tiZVw8.numX49;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements g, f, Cloneable, ByteChannel, AutoCloseable {
    public static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f18821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18822b;

    public static boolean i(o oVar, int i, C1976a c1976a, int i4) {
        int i6 = oVar.c;
        byte[] bArr = oVar.f18835a;
        for (int i10 = 0; i10 < i4; i10++) {
            if (i == i6) {
                oVar = oVar.f;
                bArr = oVar.f18835a;
                i = oVar.f18836b;
                i6 = oVar.c;
            }
            if (bArr[i] != c1976a.e(i10)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final void B(int i) {
        if (i < 128) {
            t(i);
            return;
        }
        if (i < 2048) {
            t((i >> 6) | PsExtractor.AUDIO_STREAM);
            t((i & 63) | 128);
            return;
        }
        if (i >= 65536) {
            if (i > 1114111) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.e(i, new StringBuilder(numX49.tnTj78("bQuV"))));
            }
            t((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            t(((i >> 12) & 63) | 128);
            t(((i >> 6) & 63) | 128);
            t((i & 63) | 128);
            return;
        }
        if (i >= 55296 && i <= 57343) {
            t(63);
            return;
        }
        t((i >> 12) | 224);
        t(((i >> 6) & 63) | 128);
        t((i & 63) | 128);
    }

    public final String C(long j) throws EOFException {
        if (j > 0) {
            long j6 = j - 1;
            if (z(j6) == 13) {
                String strC = c(j6, v.f18845a);
                r(2L);
                return strC;
            }
        }
        String strC2 = c(j, v.f18845a);
        r(1L);
        return strC2;
    }

    public final void D(long j) {
        if (j == 0) {
            t(48);
            return;
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        o oVarQ = q(iNumberOfTrailingZeros);
        int i = oVarQ.c;
        for (int i4 = (i + iNumberOfTrailingZeros) - 1; i4 >= i; i4--) {
            oVarQ.f18835a[i4] = c[(int) (15 & j)];
            j >>>= 4;
        }
        oVarQ.c += iNumberOfTrailingZeros;
        this.f18822b += (long) iNumberOfTrailingZeros;
    }

    public final void E() {
        try {
            r(this.f18822b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String F() {
        try {
            return c(this.f18822b, v.f18845a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // of.f
    public final f a(String str) {
        f(0, str.length(), str);
        return this;
    }

    public final int b(byte[] bArr, int i, int i4) {
        v.b(bArr.length, i, i4);
        o oVar = this.f18821a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i4, oVar.c - oVar.f18836b);
        System.arraycopy(oVar.f18835a, oVar.f18836b, bArr, i, iMin);
        int i6 = oVar.f18836b + iMin;
        oVar.f18836b = i6;
        this.f18822b -= (long) iMin;
        if (i6 == oVar.c) {
            this.f18821a = oVar.a();
            p.c(oVar);
        }
        return iMin;
    }

    public final String c(long j, Charset charset) {
        v.b(this.f18822b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuE"));
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bQui")));
        }
        if (j == 0) {
            return numX49.tnTj78("bQud");
        }
        o oVar = this.f18821a;
        int i = oVar.f18836b;
        if (((long) i) + j > oVar.c) {
            return new String(y(j), charset);
        }
        String str = new String(oVar.f18835a, i, (int) j, charset);
        int i4 = (int) (((long) oVar.f18836b) + j);
        oVar.f18836b = i4;
        this.f18822b -= j;
        if (i4 == oVar.c) {
            this.f18821a = oVar.a();
            p.c(oVar);
        }
        return str;
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f18822b == 0) {
            return eVar;
        }
        o oVarD = this.f18821a.d();
        eVar.f18821a = oVarD;
        oVarD.f18838g = oVarD;
        oVarD.f = oVarD;
        for (o oVar = this.f18821a.f; oVar != this.f18821a; oVar = oVar.f) {
            eVar.f18821a.f18838g.b(oVar.d());
        }
        eVar.f18822b = this.f18822b;
        return eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, of.r
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j = this.f18822b;
        if (j != eVar.f18822b) {
            return false;
        }
        long j6 = 0;
        if (j == 0) {
            return true;
        }
        o oVar = this.f18821a;
        o oVar2 = eVar.f18821a;
        int i = oVar.f18836b;
        int i4 = oVar2.f18836b;
        while (j6 < this.f18822b) {
            long jMin = Math.min(oVar.c - i, oVar2.c - i4);
            int i6 = 0;
            while (i6 < jMin) {
                int i10 = i + 1;
                int i11 = i4 + 1;
                if (oVar.f18835a[i] != oVar2.f18835a[i4]) {
                    return false;
                }
                i6++;
                i = i10;
                i4 = i11;
            }
            if (i == oVar.c) {
                oVar = oVar.f;
                i = oVar.f18836b;
            }
            if (i4 == oVar2.c) {
                oVar2 = oVar2.f;
                i4 = oVar2.f18836b;
            }
            j6 += jMin;
        }
        return true;
    }

    public final void f(int i, int i4, String str) {
        char cCharAt;
        if (i < 0) {
            throw new IllegalArgumentException(We.s.f(i, numX49.tnTj78("bQut")));
        }
        if (i4 < i) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.c(i4, i, numX49.tnTj78("bQuO"), numX49.tnTj78("bQuQ")));
        }
        if (i4 > str.length()) {
            StringBuilder sbT = We.s.t(i4, numX49.tnTj78("bQuF"), numX49.tnTj78("bQuH"));
            sbT.append(str.length());
            throw new IllegalArgumentException(sbT.toString());
        }
        while (i < i4) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                o oVarQ = q(1);
                int i6 = oVarQ.c - i;
                int iMin = Math.min(i4, 8192 - i6);
                int i10 = i + 1;
                byte[] bArr = oVarQ.f18835a;
                bArr[i + i6] = (byte) cCharAt2;
                while (true) {
                    i = i10;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i10 = i + 1;
                    bArr[i + i6] = (byte) cCharAt;
                }
                int i11 = oVarQ.c;
                int i12 = (i6 + i) - i11;
                oVarQ.c = i11 + i12;
                this.f18822b += (long) i12;
            } else {
                if (cCharAt2 < 2048) {
                    t((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    t((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    t((cCharAt2 >> '\f') | 224);
                    t(((cCharAt2 >> 6) & 63) | 128);
                    t((cCharAt2 & '?') | 128);
                } else {
                    int i13 = i + 1;
                    char cCharAt3 = i13 < i4 ? str.charAt(i13) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        t(63);
                        i = i13;
                    } else {
                        int i14 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        t((i14 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        t(((i14 >> 12) & 63) | 128);
                        t(((i14 >> 6) & 63) | 128);
                        t((i14 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // of.r, java.io.Flushable
    public final void flush() {
    }

    public final void g(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuU"));
        }
        while (sVar.a(8192L, this) != -1) {
        }
    }

    public final int hashCode() {
        o oVar = this.f18821a;
        if (oVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i4 = oVar.c;
            for (int i6 = oVar.f18836b; i6 < i4; i6++) {
                i = (i * 31) + oVar.f18835a[i6];
            }
            oVar = oVar.f;
        } while (oVar != this.f18821a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // of.g
    public final String j(Charset charset) {
        try {
            return c(this.f18822b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void k(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQue"));
        }
        int i4 = 0;
        long j = i;
        v.b(bArr.length, 0, j);
        while (i4 < i) {
            o oVarQ = q(1);
            int iMin = Math.min(i - i4, 8192 - oVarQ.c);
            System.arraycopy(bArr, i4, oVarQ.f18835a, oVarQ.c, iMin);
            i4 += iMin;
            oVarQ.c += iMin;
        }
        this.f18822b += j;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093 A[EDGE_INSN: B:43:0x0093->B:37:0x0093 BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m() {
        /*
            r14 = this;
            long r0 = r14.f18822b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L9a
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            of.o r6 = r14.f18821a
            byte[] r7 = r6.f18835a
            int r8 = r6.f18836b
            int r9 = r6.c
        L13:
            if (r8 >= r9) goto L7f
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L37
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-87)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L66
            r11 = 70
            if (r10 > r11) goto L66
            int r11 = r10 + (-55)
        L37:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L47
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L47:
            of.e r0 = new of.e
            r0.<init>()
            r0.D(r4)
            r0.t(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.F()
            java.lang.String r2 = "bQu8"
            java.lang.String r2 = dOYHB6.tiZVw8.numX49.tnTj78(r2)
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            if (r0 == 0) goto L6a
            r1 = 1
            goto L7f
        L6a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "bQuC"
            java.lang.String r2 = dOYHB6.tiZVw8.numX49.tnTj78(r2)
            r1.<init>(r2)
            java.lang.String r1 = androidx.camera.core.impl.a.e(r10, r1)
            r0.<init>(r1)
            throw r0
        L7f:
            if (r8 != r9) goto L8b
            of.o r7 = r6.a()
            r14.f18821a = r7
            of.p.c(r6)
            goto L8d
        L8b:
            r6.f18836b = r8
        L8d:
            if (r1 != 0) goto L93
            of.o r6 = r14.f18821a
            if (r6 != 0) goto Lb
        L93:
            long r1 = r14.f18822b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f18822b = r1
            return r4
        L9a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "bQu4"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: of.e.m():long");
    }

    @Override // of.g
    public final int n(l lVar) {
        o oVar = this.f18821a;
        if (oVar == null) {
            return lVar.indexOf(C1976a.e);
        }
        C1976a[] c1976aArr = lVar.f18830a;
        int length = c1976aArr.length;
        for (int i = 0; i < length; i++) {
            C1976a c1976a = c1976aArr[i];
            if (this.f18822b >= c1976a.size() && i(oVar, oVar.f18836b, c1976a, c1976a.size())) {
                try {
                    r(c1976a.size());
                    return i;
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
        }
        return -1;
    }

    public final o q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        o oVar = this.f18821a;
        if (oVar == null) {
            o oVarB = p.b();
            this.f18821a = oVarB;
            oVarB.f18838g = oVarB;
            oVarB.f = oVarB;
            return oVarB;
        }
        o oVar2 = oVar.f18838g;
        if (oVar2.c + i <= 8192 && oVar2.e) {
            return oVar2;
        }
        o oVarB2 = p.b();
        oVar2.b(oVarB2);
        return oVarB2;
    }

    public final void r(long j) throws EOFException {
        while (j > 0) {
            if (this.f18821a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, r0.c - r0.f18836b);
            long j6 = iMin;
            this.f18822b -= j6;
            j -= j6;
            o oVar = this.f18821a;
            int i = oVar.f18836b + iMin;
            oVar.f18836b = i;
            if (i == oVar.c) {
                this.f18821a = oVar.a();
                p.c(oVar);
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        o oVar = this.f18821a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), oVar.c - oVar.f18836b);
        byteBuffer.put(oVar.f18835a, oVar.f18836b, iMin);
        int i = oVar.f18836b + iMin;
        oVar.f18836b = i;
        this.f18822b -= (long) iMin;
        if (i == oVar.c) {
            this.f18821a = oVar.a();
            p.c(oVar);
        }
        return iMin;
    }

    public final byte readByte() {
        long j = this.f18822b;
        if (j == 0) {
            throw new IllegalStateException(numX49.tnTj78("bQuo"));
        }
        o oVar = this.f18821a;
        int i = oVar.f18836b;
        int i4 = oVar.c;
        int i6 = i + 1;
        byte b8 = oVar.f18835a[i];
        this.f18822b = j - 1;
        if (i6 != i4) {
            oVar.f18836b = i6;
            return b8;
        }
        this.f18821a = oVar.a();
        p.c(oVar);
        return b8;
    }

    public final int readInt() {
        long j = this.f18822b;
        if (j < 4) {
            throw new IllegalStateException(numX49.tnTj78("bQuK") + this.f18822b);
        }
        o oVar = this.f18821a;
        int i = oVar.f18836b;
        int i4 = oVar.c;
        if (i4 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = oVar.f18835a;
        int i6 = i + 3;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i11 = i + 4;
        int i12 = i10 | (bArr[i6] & 255);
        this.f18822b = j - 4;
        if (i11 != i4) {
            oVar.f18836b = i11;
            return i12;
        }
        this.f18821a = oVar.a();
        p.c(oVar);
        return i12;
    }

    public final short readShort() {
        long j = this.f18822b;
        if (j < 2) {
            throw new IllegalStateException(numX49.tnTj78("bQuw") + this.f18822b);
        }
        o oVar = this.f18821a;
        int i = oVar.f18836b;
        int i4 = oVar.c;
        if (i4 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i6 = i + 1;
        byte[] bArr = oVar.f18835a;
        int i10 = (bArr[i] & 255) << 8;
        int i11 = i + 2;
        int i12 = (bArr[i6] & 255) | i10;
        this.f18822b = j - 2;
        if (i11 == i4) {
            this.f18821a = oVar.a();
            p.c(oVar);
        } else {
            oVar.f18836b = i11;
        }
        return (short) i12;
    }

    @Override // of.r
    public final void s(long j, e eVar) {
        o oVarB;
        if (eVar == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQum"));
        }
        if (eVar == this) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuc"));
        }
        v.b(eVar.f18822b, 0L, j);
        while (j > 0) {
            o oVar = eVar.f18821a;
            int i = oVar.c;
            int i4 = oVar.f18836b;
            if (j < i - i4) {
                o oVar2 = this.f18821a;
                o oVar3 = oVar2 != null ? oVar2.f18838g : null;
                if (oVar3 != null && oVar3.e) {
                    if ((((long) oVar3.c) + j) - ((long) (oVar3.f18837d ? 0 : oVar3.f18836b)) <= 8192) {
                        oVar.c(oVar3, (int) j);
                        eVar.f18822b -= j;
                        this.f18822b += j;
                        return;
                    }
                }
                int i6 = (int) j;
                if (i6 <= 0 || i6 > i - i4) {
                    throw new IllegalArgumentException();
                }
                if (i6 >= 1024) {
                    oVarB = oVar.d();
                } else {
                    oVarB = p.b();
                    System.arraycopy(oVar.f18835a, oVar.f18836b, oVarB.f18835a, 0, i6);
                }
                oVarB.c = oVarB.f18836b + i6;
                oVar.f18836b += i6;
                oVar.f18838g.b(oVarB);
                eVar.f18821a = oVarB;
            }
            o oVar4 = eVar.f18821a;
            long j6 = oVar4.c - oVar4.f18836b;
            eVar.f18821a = oVar4.a();
            o oVar5 = this.f18821a;
            if (oVar5 == null) {
                this.f18821a = oVar4;
                oVar4.f18838g = oVar4;
                oVar4.f = oVar4;
            } else {
                oVar5.f18838g.b(oVar4);
                o oVar6 = oVar4.f18838g;
                if (oVar6 == oVar4) {
                    throw new IllegalStateException();
                }
                if (oVar6.e) {
                    int i10 = oVar4.c - oVar4.f18836b;
                    if (i10 <= (8192 - oVar6.c) + (oVar6.f18837d ? 0 : oVar6.f18836b)) {
                        oVar4.c(oVar6, i10);
                        oVar4.a();
                        p.c(oVar4);
                    }
                }
            }
            eVar.f18822b -= j6;
            this.f18822b += j6;
            j -= j6;
        }
    }

    public final void t(int i) {
        o oVarQ = q(1);
        int i4 = oVarQ.c;
        oVarQ.c = i4 + 1;
        oVarQ.f18835a[i4] = (byte) i;
        this.f18822b++;
    }

    @Override // of.s
    public final u timeout() {
        return u.f18842d;
    }

    public final String toString() {
        long j = this.f18822b;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? C1976a.e : new q(this, i)).toString();
        }
        throw new IllegalArgumentException(numX49.tnTj78("bQuD") + this.f18822b);
    }

    public final boolean w() {
        return this.f18822b == 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuh"));
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            o oVarQ = q(1);
            int iMin = Math.min(i, 8192 - oVarQ.c);
            byteBuffer.get(oVarQ.f18835a, oVarQ.c, iMin);
            i -= iMin;
            oVarQ.c += iMin;
        }
        this.f18822b += (long) iRemaining;
        return iRemaining;
    }

    @Override // of.g
    public final byte[] x() {
        try {
            return y(this.f18822b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] y(long j) throws EOFException {
        v.b(this.f18822b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bQuM")));
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i4 = 0;
        while (i4 < i) {
            int iB = b(bArr, i4, i - i4);
            if (iB == -1) {
                throw new EOFException();
            }
            i4 += iB;
        }
        return bArr;
    }

    public final byte z(long j) {
        v.b(this.f18822b, j, 1L);
        long j6 = this.f18822b;
        if (j6 - j > j) {
            o oVar = this.f18821a;
            long j7 = j;
            while (true) {
                int i = oVar.c;
                int i4 = oVar.f18836b;
                long j9 = i - i4;
                if (j7 < j9) {
                    return oVar.f18835a[i4 + ((int) j7)];
                }
                j7 -= j9;
                oVar = oVar.f;
            }
        } else {
            long j10 = j - j6;
            o oVar2 = this.f18821a.f18838g;
            while (true) {
                int i6 = oVar2.c;
                int i10 = oVar2.f18836b;
                j10 += (long) (i6 - i10);
                if (j10 >= 0) {
                    return oVar2.f18835a[i10 + ((int) j10)];
                }
                oVar2 = oVar2.f18838g;
            }
        }
    }

    @Override // of.s
    public final long a(long j, e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuj"));
        }
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bQuS")));
        }
        long j6 = this.f18822b;
        if (j6 == 0) {
            return -1L;
        }
        if (j > j6) {
            j = j6;
        }
        eVar.s(j, this);
        return j;
    }
}
