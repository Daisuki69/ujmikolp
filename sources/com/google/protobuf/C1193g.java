package com.google.protobuf;

import androidx.work.WorkInfo;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1193g extends b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f10096g = Logger.getLogger(C1193g.class.getName());
    public static final boolean h = o0.e;
    public E c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10097d;
    public final int e;
    public int f;

    public C1193g(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f10097d = bArr;
        this.f = 0;
        this.e = i;
    }

    public static int d(int i, C1192f c1192f) {
        return e(c1192f) + h(i);
    }

    public static int e(C1192f c1192f) {
        int size = c1192f.size();
        return i(size) + size;
    }

    public static int f(int i) {
        if (i >= 0) {
            return i(i);
        }
        return 10;
    }

    public static int g(String str) {
        int length;
        try {
            length = r0.b(str);
        } catch (q0 unused) {
            length = str.getBytes(AbstractC1207v.f10124a).length;
        }
        return i(length) + length;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void k(byte b8) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f10097d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b8;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    public final void l(byte[] bArr, int i, int i4) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f10097d, this.f, i4);
            this.f += i4;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i4)), e);
        }
    }

    public final void m(C1192f c1192f) {
        u(c1192f.size());
        l(c1192f.f10092b, c1192f.d(), c1192f.size());
    }

    public final void n(int i, int i4) {
        t(i, 5);
        o(i4);
    }

    public final void o(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f10097d;
            int i4 = this.f;
            int i6 = i4 + 1;
            this.f = i6;
            bArr[i4] = (byte) (i & 255);
            int i10 = i4 + 2;
            this.f = i10;
            bArr[i6] = (byte) ((i >> 8) & 255);
            int i11 = i4 + 3;
            this.f = i11;
            bArr[i10] = (byte) ((i >> 16) & 255);
            this.f = i4 + 4;
            bArr[i11] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    public final void p(int i, long j) {
        t(i, 1);
        q(j);
    }

    public final void q(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f10097d;
            int i = this.f;
            int i4 = i + 1;
            this.f = i4;
            bArr[i] = (byte) (((int) j) & 255);
            int i6 = i + 2;
            this.f = i6;
            bArr[i4] = (byte) (((int) (j >> 8)) & 255);
            int i10 = i + 3;
            this.f = i10;
            bArr[i6] = (byte) (((int) (j >> 16)) & 255);
            int i11 = i + 4;
            this.f = i11;
            bArr[i10] = (byte) (((int) (j >> 24)) & 255);
            int i12 = i + 5;
            this.f = i12;
            bArr[i11] = (byte) (((int) (j >> 32)) & 255);
            int i13 = i + 6;
            this.f = i13;
            bArr[i12] = (byte) (((int) (j >> 40)) & 255);
            int i14 = i + 7;
            this.f = i14;
            bArr[i13] = (byte) (((int) (j >> 48)) & 255);
            this.f = i + 8;
            bArr[i14] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    public final void r(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            u(i);
        } else {
            w(i);
        }
    }

    public final void s(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f;
        try {
            int i4 = i(str.length() * 3);
            int i6 = i(str.length());
            byte[] bArr = this.f10097d;
            int i10 = this.e;
            if (i6 != i4) {
                u(r0.b(str));
                int i11 = this.f;
                this.f = r0.f10123a.a(str, bArr, i11, i10 - i11);
                return;
            }
            int i12 = i + i6;
            this.f = i12;
            int iA = r0.f10123a.a(str, bArr, i12, i10 - i12);
            this.f = i;
            u((iA - i) - i6);
            this.f = iA;
        } catch (q0 e) {
            this.f = i;
            f10096g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(AbstractC1207v.f10124a);
            try {
                u(bytes.length);
                l(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e7) {
                throw new CodedOutputStream$OutOfSpaceException(e7);
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream$OutOfSpaceException(e10);
        }
    }

    public final void t(int i, int i4) {
        u((i << 3) | i4);
    }

    public final void u(int i) {
        while (true) {
            int i4 = i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            byte[] bArr = this.f10097d;
            if (i4 == 0) {
                int i6 = this.f;
                this.f = i6 + 1;
                bArr[i6] = (byte) i;
                return;
            } else {
                try {
                    int i10 = this.f;
                    this.f = i10 + 1;
                    bArr[i10] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    public final void v(int i, long j) {
        t(i, 0);
        w(j);
    }

    public final void w(long j) throws CodedOutputStream$OutOfSpaceException {
        byte[] bArr = this.f10097d;
        boolean z4 = h;
        int i = this.e;
        if (z4 && i - this.f >= 10) {
            while ((j & (-128)) != 0) {
                int i4 = this.f;
                this.f = i4 + 1;
                o0.k(bArr, i4, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i6 = this.f;
            this.f = 1 + i6;
            o0.k(bArr, i6, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i10 = this.f;
                this.f = i10 + 1;
                bArr[i10] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(i), 1), e);
            }
        }
        int i11 = this.f;
        this.f = i11 + 1;
        bArr[i11] = (byte) j;
    }
}
