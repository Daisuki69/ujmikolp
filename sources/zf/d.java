package zf;

import We.s;
import androidx.media3.common.C;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final short[][] f21399o = {new short[]{2, 3}, new short[]{2, 3}, new short[]{2, 3}, new short[]{3}, new short[]{4, 5}, new short[]{4, 5, 7}, new short[]{4, 7}, new short[]{24}, new short[]{23, 24, 55, 8, 15}, new short[]{23, 24, 40, 55, 103, 104, 108, 8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31, 36, 39, 40, 43, 44, 51, 52, 53, 55, 56, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 200, 201, 202, 203, 204, 205, 210, 211, 212, 213, 214, 215, 218, 219}, new short[]{74, 75, 76, 77, 82, 83, 84, 85, 90, 91, 100, 101, 108, 109, 114, 115, 116, 117, 118, 119}};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final short[][] f21400p = {new short[]{3, 2}, new short[]{1, 4}, new short[]{6, 5}, new short[]{7}, new short[]{9, 8}, new short[]{10, 11, 12}, new short[]{13, 14}, new short[]{15}, new short[]{16, 17, 0, 18, 64}, new short[]{24, 25, 23, 22, 19, 20, 21, 1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560, 52, 55, 56, 59, 60, 320, 384, 448, 53, 54, 50, 51, 44, 45, 46, 47, 57, 58, 61, 256, 48, 49, 62, 63, 30, 31, 32, 33, 40, 41, 128, 192, 26, 27, 28, 29, 34, 35, 36, 37, 38, 39, 42, 43}, new short[]{640, 704, 768, 832, 1280, 1344, 1408, 1472, 1536, 1600, 1664, 1728, 512, 576, 896, 960, SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL, 1088, 1152, 1216}};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final short[][] f21401q = {new short[]{7, 8, 11, 12, 14, 15}, new short[]{18, 19, 20, 27, 7, 8}, new short[]{23, 24, 42, 43, 3, 52, 53, 7, 8}, new short[]{19, 23, 24, 36, 39, 40, 43, 3, 55, 4, 8, 12}, new short[]{18, 19, 20, 21, 22, 23, 26, 27, 2, 36, 37, 40, 41, 42, 43, 44, 45, 3, 50, 51, 52, 53, 54, 55, 4, 74, 75, 5, 82, 83, 84, 85, 88, 89, 90, 91, 100, 101, 103, 104, 10, 11}, new short[]{152, 153, 154, 155, 204, 205, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219}, new short[0], new short[]{8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31}};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final short[][] f21402r = {new short[]{2, 3, 4, 5, 6, 7}, new short[]{128, 8, 9, 64, 10, 11}, new short[]{192, 1664, 16, 17, 13, 14, 15, 1, 12}, new short[]{26, 21, 28, 27, 18, 24, 25, 22, 256, 23, 20, 19}, new short[]{33, 34, 35, 36, 37, 38, 31, 32, 29, 53, 54, 39, 40, 41, 42, 43, 44, 30, 61, 62, 63, 0, 320, 384, 45, 59, 60, 46, 49, 50, 51, 52, 55, 56, 57, 58, 448, 512, 640, 576, 47, 48}, new short[]{1472, 1536, 1600, 1728, 704, 768, 832, 896, 960, SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL, 1088, 1152, 1216, 1280, 1344, 1408}, new short[0], new short[]{1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560}};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f21403s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f21404t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final qc.c f21405u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final qc.c f21406v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final qc.c f21407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final qc.c f21408x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21410b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21411d;
    public final int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21412g;
    public int[] h;
    public int[] i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21414l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21415n;

    static {
        c cVar = new c();
        f21403s = cVar;
        cVar.e = true;
        cVar.c = C.PRIORITY_PROCESSING_FOREGROUND;
        c cVar2 = new c();
        f21404t = cVar2;
        cVar2.c = -1000;
        cVar2.f21396a = cVar2;
        cVar2.f21397b = cVar;
        qc.c cVar3 = new qc.c();
        f21407w = cVar3;
        try {
            cVar3.c(0, cVar2);
            cVar3.c(1, cVar);
            f21405u = new qc.c();
            for (int i = 0; i < 12; i++) {
                int i4 = 0;
                while (true) {
                    try {
                        short[] sArr = f21399o[i];
                        if (i4 < sArr.length) {
                            f21405u.b(i + 2, sArr[i4], f21400p[i][i4]);
                            i4++;
                        }
                    } catch (IOException e) {
                        throw new AssertionError(e);
                    }
                }
            }
            qc.c cVar4 = f21405u;
            cVar4.c(0, f21404t);
            cVar4.c(1, f21403s);
            f21406v = new qc.c();
            for (int i6 = 0; i6 < 9; i6++) {
                int i10 = 0;
                while (true) {
                    try {
                        short[] sArr2 = f21401q[i6];
                        if (i10 < sArr2.length) {
                            f21406v.b(i6 + 4, sArr2[i10], f21402r[i6][i10]);
                            i10++;
                        }
                    } catch (IOException e7) {
                        throw new AssertionError(e7);
                    }
                }
            }
            qc.c cVar5 = f21406v;
            cVar5.c(0, f21404t);
            cVar5.c(1, f21403s);
            qc.c cVar6 = new qc.c();
            f21408x = cVar6;
            try {
                cVar6.b(4, 1, C.PRIORITY_PLAYBACK_PRELOAD);
                cVar6.b(3, 1, -4000);
                cVar6.b(1, 1, 0);
                cVar6.b(3, 3, 1);
                cVar6.b(6, 3, 2);
                cVar6.b(7, 3, 3);
                cVar6.b(3, 2, -1);
                cVar6.b(6, 2, -2);
                cVar6.b(7, 2, -3);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public d(InputStream inputStream, int i, int i4, long j, boolean z4) {
        super(inputStream);
        this.f21414l = 0;
        this.m = -1;
        this.f21415n = -1;
        this.f21409a = i;
        this.e = i4;
        this.f21410b = new byte[(i + 7) / 8];
        int i6 = i + 2;
        this.h = new int[i6];
        this.i = new int[i6];
        if (i4 == 2) {
            this.f21411d = z4;
            this.c = false;
        } else if (i4 == 3) {
            this.f21411d = z4;
            this.c = (1 & j) != 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException(s.f(i4, "Illegal parameter: "));
            }
            this.f21411d = z4;
            this.c = false;
        }
    }

    public final void b() {
        int iG = 0;
        this.f21413k = 0;
        boolean z4 = true;
        do {
            iG += z4 ? g(f21406v) : g(f21405u);
            int[] iArr = this.i;
            int i = this.f21413k;
            this.f21413k = i + 1;
            iArr[i] = iG;
            z4 = !z4;
        } while (iG < this.f21409a);
    }

    public final void c() {
        int i;
        this.j = this.f21413k;
        int[] iArr = this.i;
        this.i = this.h;
        this.h = iArr;
        int iG = 0;
        this.f21413k = 0;
        boolean z4 = true;
        while (true) {
            int i4 = this.f21409a;
            if (iG >= i4) {
                return;
            }
            c cVar = (c) f21408x.f19770b;
            while (true) {
                cVar = m() ? cVar.f21397b : cVar.f21396a;
                if (cVar != null) {
                    if (cVar.e) {
                        int i6 = cVar.c;
                        if (i6 == -4000) {
                            qc.c cVar2 = f21405u;
                            qc.c cVar3 = f21406v;
                            int iG2 = g(z4 ? cVar3 : cVar2) + iG;
                            int[] iArr2 = this.i;
                            int i10 = this.f21413k;
                            this.f21413k = i10 + 1;
                            iArr2[i10] = iG2;
                            if (!z4) {
                                cVar2 = cVar3;
                            }
                            iG = g(cVar2) + iG2;
                            int[] iArr3 = this.i;
                            int i11 = this.f21413k;
                            this.f21413k = i11 + 1;
                            iArr3[i11] = iG;
                        } else if (i6 != -3000) {
                            int iK = k(iG, z4);
                            if (iK >= this.j || iK == -1) {
                                i = cVar.c;
                            } else {
                                i = this.h[iK];
                                i4 = cVar.c;
                            }
                            iG = i + i4;
                            int[] iArr4 = this.i;
                            int i12 = this.f21413k;
                            iArr4[i12] = iG;
                            this.f21413k = i12 + 1;
                            z4 = !z4;
                        } else {
                            int iK2 = k(iG, z4) + 1;
                            iG = iK2 >= this.j ? i4 : this.h[iK2];
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.d.f():void");
    }

    public final int g(qc.c cVar) throws IOException {
        c cVar2 = (c) cVar.f19770b;
        int i = 0;
        while (true) {
            cVar2 = m() ? cVar2.f21397b : cVar2.f21396a;
            if (cVar2 == null) {
                throw new IOException("Unknown code in Huffman RLE stream");
            }
            if (cVar2.e) {
                int i4 = cVar2.c;
                i += i4;
                if (i4 < 64) {
                    return i4 >= 0 ? i : this.f21409a;
                }
                cVar2 = (c) cVar.f19770b;
            }
        }
    }

    public final void i() throws IOException {
        if (this.f21412g >= this.f) {
            this.f = 0;
            try {
                f();
            } catch (EOFException e) {
                if (this.f != 0) {
                    throw e;
                }
                this.f = -1;
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new IOException("Malformed CCITT stream", e7);
            }
            this.f21412g = 0;
        }
    }

    public final int k(int i, boolean z4) {
        int i4 = (this.f21414l & (-2)) + (!z4 ? 1 : 0);
        if (i4 > 2) {
            i4 -= 2;
        }
        if (i == 0) {
            return i4;
        }
        while (i4 < this.j) {
            if (i < this.h[i4]) {
                this.f21414l = i4;
                return i4;
            }
            i4 += 2;
        }
        return -1;
    }

    public final boolean m() throws IOException {
        int i = this.f21415n;
        if (i < 0 || i > 7) {
            int i4 = ((FilterInputStream) this).in.read();
            this.m = i4;
            if (i4 == -1) {
                throw new EOFException("Unexpected end of Huffman RLE stream");
            }
            this.f21415n = 0;
        }
        int i6 = this.m;
        boolean z4 = (i6 & 128) != 0;
        this.m = i6 << 1;
        this.f21415n++;
        return z4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.f;
        if (i < 0) {
            return 0;
        }
        if (this.f21412g >= i) {
            i();
            if (this.f < 0) {
                return 0;
            }
        }
        int i4 = this.f21412g;
        this.f21412g = i4 + 1;
        return this.f21410b[i4] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        int i = this.f;
        if (i < 0) {
            return -1L;
        }
        if (this.f21412g >= i) {
            i();
            if (this.f < 0) {
                return -1L;
            }
        }
        int iMin = (int) Math.min(this.f - this.f21412g, j);
        this.f21412g += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i6 = this.f;
        if (i6 < 0) {
            Arrays.fill(bArr, i, i + i4, (byte) 0);
            return i4;
        }
        if (this.f21412g >= i6) {
            i();
            if (this.f < 0) {
                Arrays.fill(bArr, i, i + i4, (byte) 0);
                return i4;
            }
        }
        int iMin = Math.min(this.f - this.f21412g, i4);
        System.arraycopy(this.f21410b, this.f21412g, bArr, i, iMin);
        this.f21412g += iMin;
        return iMin;
    }
}
