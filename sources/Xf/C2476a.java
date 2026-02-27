package xf;

import io.flutter.embedding.android.KeyboardMap;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import oi.C1988f;

/* JADX INFO: renamed from: xf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2476a implements DataInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteOrder f20983a = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20984b = 0;
    public int c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20985d = false;
    public final byte[] e = new byte[8];
    public final InputStream f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1988f f20986g;

    public C2476a(InputStream inputStream) {
        C1988f c1988f = new C1988f();
        c1988f.f18901b = new ArrayList();
        this.f20986g = c1988f;
        this.f = inputStream;
    }

    public final void a() throws IOException {
        if (this.f20985d) {
            throw new IOException("stream is closed");
        }
    }

    public final void b(long j) throws IOException {
        a();
        if (j < 0) {
            throw new IllegalArgumentException("trying to seek before flushed pos");
        }
        this.c = 0;
        this.f20984b = j;
    }

    public final void finalize() throws Throwable {
        if (this.f20985d) {
            return;
        }
        try {
            a();
            this.f20985d = true;
            C1988f c1988f = this.f20986g;
            ((ArrayList) c1988f.f18901b).clear();
            c1988f.f18900a = 0L;
        } finally {
            super.finalize();
        }
    }

    public final int read() {
        this.c = 0;
        long j = this.f20984b;
        C1988f c1988f = this.f20986g;
        long j6 = c1988f.f18900a;
        if (j >= j6) {
            int i = (int) ((j - j6) + 1);
            if (c1988f.a(this.f, i) < i) {
                return -1;
            }
        }
        long j7 = this.f20984b;
        int i4 = j7 < c1988f.f18900a ? ((byte[]) ((ArrayList) c1988f.f18901b).get((int) (j7 >> 9)))[(int) (j7 & 511)] & 255 : -1;
        if (i4 >= 0) {
            this.f20984b++;
        }
        return i4;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws EOFException {
        int i = read();
        if (i >= 0) {
            return i != 0;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public final byte readByte() throws EOFException {
        int i = read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i4) throws IOException {
        if (i < 0 || i4 < 0 || i + i4 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (i4 > 0) {
            int i6 = read(bArr, i, i4);
            if (i6 == -1) {
                throw new EOFException();
            }
            i += i6;
            i4 -= i6;
        }
    }

    @Override // java.io.DataInput
    public final int readInt() throws EOFException {
        int i;
        byte b8;
        byte[] bArr = this.e;
        if (read(bArr, 0, 4) < 0) {
            throw new EOFException();
        }
        if (this.f20983a == ByteOrder.BIG_ENDIAN) {
            i = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
            b8 = bArr[3];
        } else {
            i = ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
            b8 = bArr[0];
        }
        return i | (b8 & 255);
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        StringBuilder sb2 = new StringBuilder(80);
        boolean z4 = true;
        while (true) {
            int i = read();
            if (i != -1) {
                if (i == 10) {
                    break;
                }
                if (i == 13) {
                    int i4 = read();
                    if (i4 != 10 && i4 != -1) {
                        a();
                        b(this.f20984b - 1);
                    }
                } else {
                    sb2.append((char) i);
                    z4 = false;
                }
            } else {
                break;
            }
        }
        z4 = false;
        if (z4) {
            return null;
        }
        return sb2.toString();
    }

    @Override // java.io.DataInput
    public final long readLong() throws EOFException {
        byte[] bArr = this.e;
        if (read(bArr, 0, 8) < 0) {
            throw new EOFException();
        }
        if (this.f20983a == ByteOrder.BIG_ENDIAN) {
            return ((((long) (((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255))) & KeyboardMap.kValueMask) << 32) | (((long) ((bArr[7] & 255) | ((bArr[6] & 255) << 8) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16))) & KeyboardMap.kValueMask);
        }
        int i = (bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
        return (((long) i) & KeyboardMap.kValueMask) | ((((long) ((bArr[4] & 255) | (((bArr[5] & 255) << 8) | (((bArr[7] & 255) << 24) | ((bArr[6] & 255) << 16))))) & KeyboardMap.kValueMask) << 32);
    }

    @Override // java.io.DataInput
    public final short readShort() throws EOFException {
        int i;
        byte b8;
        byte[] bArr = this.e;
        if (read(bArr, 0, 2) < 0) {
            throw new EOFException();
        }
        if (this.f20983a == ByteOrder.BIG_ENDIAN) {
            i = bArr[0] << 8;
            b8 = bArr[1];
        } else {
            i = bArr[1] << 8;
            b8 = bArr[0];
        }
        return (short) (i | (b8 & 255));
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        ByteOrder byteOrder = this.f20983a;
        this.f20983a = ByteOrder.BIG_ENDIAN;
        int unsignedShort = readUnsignedShort();
        char[] cArr = new char[unsignedShort];
        readFully(new byte[unsignedShort], 0, unsignedShort);
        this.f20983a = byteOrder;
        return new DataInputStream(new ByteArrayInputStream(this.e)).readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws EOFException {
        int i = read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return readShort() & 65535;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) throws IOException {
        long j = i;
        a();
        b(this.f20984b + j);
        return (int) j;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i4) throws IOException {
        int i6 = 0;
        this.c = 0;
        long j = this.f20984b;
        C1988f c1988f = this.f20986g;
        long j6 = c1988f.f18900a;
        if (j >= j6) {
            c1988f.a(this.f, (int) ((j - j6) + ((long) i4)));
        }
        long j7 = this.f20984b;
        c1988f.getClass();
        if (i4 > bArr.length - i || i4 < 0 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i4 != 0) {
            long j9 = c1988f.f18900a;
            if (j7 >= j9) {
                i6 = -1;
            } else {
                if (((long) i4) + j7 > j9) {
                    i4 = (int) (j9 - j7);
                }
                byte[] bArr2 = (byte[]) ((ArrayList) c1988f.f18901b).get((int) (j7 >> 9));
                int i10 = (int) (j7 & 511);
                int iMin = Math.min(i4, 512 - i10);
                System.arraycopy(bArr2, i10, bArr, i, iMin);
                i6 = iMin;
            }
        }
        if (i6 > 0) {
            this.f20984b += (long) i6;
        }
        return i6;
    }
}
