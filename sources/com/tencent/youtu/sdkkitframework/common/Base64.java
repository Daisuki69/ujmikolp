package com.tencent.youtu.sdkkitframework.common;

import android.annotation.SuppressLint;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class Base64 {

    public static class DecInputStream extends InputStream implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f15800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f15801b;
        public final int[] c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15802d = 0;
        public int e = 18;
        public int f = -8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f15803g = false;
        public boolean h = false;
        public byte[] i = new byte[1];

        public DecInputStream(InputStream inputStream, int[] iArr, boolean z4) {
            this.f15800a = inputStream;
            this.c = iArr;
            this.f15801b = z4;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            if (this.h) {
                throw new IOException("Stream is closed");
            }
            return this.f15800a.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.h) {
                return;
            }
            this.h = true;
            this.f15800a.close();
        }

        @Override // java.io.InputStream
        public int read() {
            if (read(this.i, 0, 1) == -1) {
                return -1;
            }
            return this.i[0] & 255;
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x0122, code lost:
        
            return r3 - r10;
         */
        @Override // java.io.InputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int read(byte[] r9, int r10, int r11) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.Base64.DecInputStream.read(byte[], int, int):int");
        }
    }

    public static Decoder getDecoder() {
        return Decoder.e;
    }

    public static Encoder getEncoder() {
        return Encoder.h;
    }

    public static Decoder getMimeDecoder() {
        return Decoder.f15805g;
    }

    public static Encoder getMimeEncoder() {
        return Encoder.j;
    }

    public static Decoder getUrlDecoder() {
        return Decoder.f;
    }

    public static Encoder getUrlEncoder() {
        return Encoder.i;
    }

    public static class EncOutputStream extends FilterOutputStream implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15809b;
        public int c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15810d;
        public boolean e;
        public final char[] f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f15811g;
        public final int h;
        public final boolean i;
        public int j;

        public EncOutputStream(OutputStream outputStream, char[] cArr, byte[] bArr, int i, boolean z4) {
            super(outputStream);
            this.f15808a = 0;
            this.e = false;
            this.j = 0;
            this.f = cArr;
            this.f15811g = bArr;
            this.h = i;
            this.i = z4;
        }

        public final void a() throws IOException {
            if (this.j == this.h) {
                ((FilterOutputStream) this).out.write(this.f15811g);
                this.j = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.e) {
                return;
            }
            this.e = true;
            int i = this.f15808a;
            if (i == 1) {
                a();
                ((FilterOutputStream) this).out.write(this.f[this.f15809b >> 2]);
                ((FilterOutputStream) this).out.write(this.f[(this.f15809b << 4) & 63]);
                if (this.i) {
                    ((FilterOutputStream) this).out.write(61);
                    ((FilterOutputStream) this).out.write(61);
                }
            } else if (i == 2) {
                a();
                ((FilterOutputStream) this).out.write(this.f[this.f15809b >> 2]);
                ((FilterOutputStream) this).out.write(this.f[((this.f15809b << 4) & 63) | (this.c >> 4)]);
                ((FilterOutputStream) this).out.write(this.f[(this.c << 2) & 63]);
                if (this.i) {
                    ((FilterOutputStream) this).out.write(61);
                }
            }
            this.f15808a = 0;
            ((FilterOutputStream) this).out.close();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            write(new byte[]{(byte) (i & 255)}, 0, 1);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i4) throws IOException {
            if (!this.e) {
                if (i < 0 || i4 < 0 || i4 > bArr.length - i) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                if (i4 == 0) {
                    return;
                }
                int i6 = this.f15808a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        int i10 = i + 1;
                        this.c = bArr[i] & 255;
                        i4--;
                        if (i4 == 0) {
                            this.f15808a = i6 + 1;
                            return;
                        }
                        i = i10;
                    }
                    this.f15810d = bArr[i] & 255;
                    i4--;
                    a();
                    ((FilterOutputStream) this).out.write(this.f[this.f15809b >> 2]);
                    ((FilterOutputStream) this).out.write(this.f[((this.f15809b << 4) & 63) | (this.c >> 4)]);
                    ((FilterOutputStream) this).out.write(this.f[((this.c << 2) & 63) | (this.f15810d >> 6)]);
                    ((FilterOutputStream) this).out.write(this.f[this.f15810d & 63]);
                    this.j += 4;
                    i++;
                }
                int i11 = i4 / 3;
                this.f15808a = i4 - (i11 * 3);
                while (true) {
                    int i12 = i11 - 1;
                    if (i11 <= 0) {
                        break;
                    }
                    a();
                    int i13 = i + 2;
                    int i14 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
                    i += 3;
                    int i15 = i14 | (bArr[i13] & 255);
                    ((FilterOutputStream) this).out.write(this.f[(i15 >>> 18) & 63]);
                    ((FilterOutputStream) this).out.write(this.f[(i15 >>> 12) & 63]);
                    ((FilterOutputStream) this).out.write(this.f[(i15 >>> 6) & 63]);
                    ((FilterOutputStream) this).out.write(this.f[i15 & 63]);
                    this.j += 4;
                    i11 = i12;
                }
                int i16 = this.f15808a;
                if (i16 == 1) {
                    this.f15809b = bArr[i] & 255;
                    return;
                } else {
                    if (i16 == 2) {
                        this.f15809b = bArr[i] & 255;
                        this.c = bArr[i + 1] & 255;
                        return;
                    }
                    return;
                }
            }
            throw new IOException("Stream is closed");
        }
    }

    public static Encoder getMimeEncoder(int i, byte[] bArr) {
        Objects.requireNonNull(bArr);
        int[] iArr = Decoder.c;
        for (byte b8 : bArr) {
            if (iArr[b8 & 255] != -1) {
                throw new IllegalArgumentException("Illegal base64 line separator character 0x" + Integer.toString(b8, 16));
            }
        }
        return i <= 0 ? Encoder.h : new Encoder(false, bArr, (i >> 2) << 2, true);
    }

    public static class Decoder {
        public static final int[] c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int[] f15804d;
        public static final Decoder e;
        public static final Decoder f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Decoder f15805g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f15806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f15807b;

        static {
            int[] iArr = new int[256];
            c = iArr;
            Arrays.fill(iArr, -1);
            int i = 0;
            while (true) {
                char[] cArr = Encoder.e;
                if (i >= cArr.length) {
                    break;
                }
                c[cArr[i]] = i;
                i++;
            }
            c[61] = -2;
            int[] iArr2 = new int[256];
            f15804d = iArr2;
            Arrays.fill(iArr2, -1);
            int i4 = 0;
            while (true) {
                char[] cArr2 = Encoder.f;
                if (i4 >= cArr2.length) {
                    f15804d[61] = -2;
                    e = new Decoder(false, false);
                    f = new Decoder(true, false);
                    f15805g = new Decoder(false, true);
                    return;
                }
                f15804d[cArr2[i4]] = i4;
                i4++;
            }
        }

        public Decoder(boolean z4, boolean z5) {
            this.f15806a = z4;
            this.f15807b = z5;
        }

        public final int a(byte[] bArr, int i, int i4) {
            int i6;
            int[] iArr = this.f15806a ? f15804d : c;
            int i10 = i4 - i;
            int i11 = 0;
            if (i10 == 0) {
                return 0;
            }
            if (i10 < 2) {
                if (this.f15807b && iArr[0] == -1) {
                    return 0;
                }
                throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
            }
            if (this.f15807b) {
                int i12 = 0;
                while (true) {
                    if (i >= i4) {
                        break;
                    }
                    int i13 = i + 1;
                    int i14 = bArr[i] & 255;
                    if (i14 == 61) {
                        i10 -= (i4 - i13) + 1;
                        break;
                    }
                    if (iArr[i14] == -1) {
                        i12++;
                    }
                    i = i13;
                }
                i10 -= i12;
            } else if (bArr[i4 - 1] == 61) {
                i11 = bArr[i4 - 2] == 61 ? 2 : 1;
            }
            if (i11 == 0 && (i6 = i10 & 3) != 0) {
                i11 = 4 - i6;
            }
            return (((i10 + 3) / 4) * 3) - i11;
        }

        public byte[] decode(byte[] bArr) {
            int iA = a(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[iA];
            int iA2 = a(bArr, 0, bArr.length, bArr2);
            return iA2 != iA ? Arrays.copyOf(bArr2, iA2) : bArr2;
        }

        public InputStream wrap(InputStream inputStream) {
            Objects.requireNonNull(inputStream);
            return new DecInputStream(inputStream, this.f15806a ? f15804d : c, this.f15807b);
        }

        @SuppressLint({"NewApi"})
        public byte[] decode(String str) {
            return decode(str.getBytes(StandardCharsets.ISO_8859_1));
        }

        public int decode(byte[] bArr, byte[] bArr2) {
            if (bArr2.length >= a(bArr, 0, bArr.length)) {
                return a(bArr, 0, bArr.length, bArr2);
            }
            throw new IllegalArgumentException("Output byte array is too small for decoding all input bytes");
        }

        public ByteBuffer decode(ByteBuffer byteBuffer) {
            int iRemaining;
            byte[] bArrArray;
            int iArrayOffset;
            int iPosition = byteBuffer.position();
            try {
                if (byteBuffer.hasArray()) {
                    bArrArray = byteBuffer.array();
                    iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    iRemaining = byteBuffer.arrayOffset() + byteBuffer.limit();
                    byteBuffer.position(byteBuffer.limit());
                } else {
                    iRemaining = byteBuffer.remaining();
                    bArrArray = new byte[iRemaining];
                    byteBuffer.get(bArrArray);
                    iArrayOffset = 0;
                }
                byte[] bArr = new byte[a(bArrArray, iArrayOffset, iRemaining)];
                return ByteBuffer.wrap(bArr, 0, a(bArrArray, iArrayOffset, iRemaining, bArr));
            } catch (IllegalArgumentException e7) {
                byteBuffer.position(iPosition);
                throw e7;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        
            if (r4 != 18) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        
            if (r4 != 6) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        
            r15[r5] = (byte) (r3 >> 16);
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        
            if (r4 != 0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
        
            r1 = r5 + 1;
            r15[r5] = (byte) (r3 >> 16);
            r5 = r5 + 2;
            r15[r1] = (byte) (r3 >> 8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        
            if (r4 == 12) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
        
            if (r13 >= r14) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
        
            if (r11.f15807b == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
        
            r15 = r13 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
        
            if (r0[r12[r13]] >= 0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
        
            r13 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
        
            r13 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        
            throw new java.lang.IllegalArgumentException(We.s.f(r13, "Input byte array has incorrect ending byte at "));
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
        
            throw new java.lang.IllegalArgumentException("Last unit does not have enough valid bits");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int a(byte[] r12, int r13, int r14, byte[] r15) {
            /*
                r11 = this;
                boolean r0 = r11.f15806a
                if (r0 == 0) goto L7
                int[] r0 = com.tencent.youtu.sdkkitframework.common.Base64.Decoder.f15804d
                goto L9
            L7:
                int[] r0 = com.tencent.youtu.sdkkitframework.common.Base64.Decoder.c
            L9:
                r1 = 18
                r2 = 0
                r4 = r1
                r3 = r2
                r5 = r3
            Lf:
                r6 = 6
                r7 = 16
                if (r13 >= r14) goto L77
                int r8 = r13 + 1
                r9 = r12[r13]
                r9 = r9 & 255(0xff, float:3.57E-43)
                r9 = r0[r9]
                if (r9 >= 0) goto L5a
                r10 = -2
                if (r9 != r10) goto L3a
                if (r4 != r6) goto L2e
                if (r8 == r14) goto L32
                int r13 = r13 + 2
                r2 = r12[r8]
                r8 = 61
                if (r2 != r8) goto L32
                goto L2f
            L2e:
                r13 = r8
            L2f:
                if (r4 == r1) goto L32
                goto L77
            L32:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Input byte array has wrong 4-byte ending unit"
                r12.<init>(r13)
                throw r12
            L3a:
                boolean r6 = r11.f15807b
                if (r6 == 0) goto L40
            L3e:
                r13 = r8
                goto Lf
            L40:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                java.lang.String r0 = "Illegal base64 character "
                r15.<init>(r0)
                r12 = r12[r13]
                java.lang.String r12 = java.lang.Integer.toString(r12, r7)
                r15.append(r12)
                java.lang.String r12 = r15.toString()
                r14.<init>(r12)
                throw r14
            L5a:
                int r13 = r9 << r4
                r3 = r3 | r13
                int r4 = r4 + (-6)
                if (r4 >= 0) goto L3e
                int r13 = r5 + 1
                int r4 = r3 >> 16
                byte r4 = (byte) r4
                r15[r5] = r4
                int r4 = r5 + 2
                int r6 = r3 >> 8
                byte r6 = (byte) r6
                r15[r13] = r6
                int r5 = r5 + 3
                byte r13 = (byte) r3
                r15[r4] = r13
                r4 = r1
                r3 = r2
                goto L3e
            L77:
                if (r4 != r6) goto L82
                int r1 = r5 + 1
                int r2 = r3 >> 16
                byte r2 = (byte) r2
                r15[r5] = r2
                r5 = r1
                goto L97
            L82:
                if (r4 != 0) goto L93
                int r1 = r5 + 1
                int r2 = r3 >> 16
                byte r2 = (byte) r2
                r15[r5] = r2
                int r5 = r5 + 2
                int r2 = r3 >> 8
                byte r2 = (byte) r2
                r15[r1] = r2
                goto L97
            L93:
                r15 = 12
                if (r4 == r15) goto Lb5
            L97:
                if (r13 >= r14) goto Lb4
                boolean r15 = r11.f15807b
                if (r15 == 0) goto La8
                int r15 = r13 + 1
                r13 = r12[r13]
                r13 = r0[r13]
                if (r13 >= 0) goto La7
                r13 = r15
                goto L97
            La7:
                r13 = r15
            La8:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r14 = "Input byte array has incorrect ending byte at "
                java.lang.String r13 = We.s.f(r13, r14)
                r12.<init>(r13)
                throw r12
            Lb4:
                return r5
            Lb5:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Last unit does not have enough valid bits"
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.Base64.Decoder.a(byte[], int, int, byte[]):int");
        }
    }

    public static class Encoder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final byte[] f15812g;
        public static final Encoder j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f15813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15814b;
        public final boolean c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f15815d;
        public static final char[] e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        public static final char[] f = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        public static final Encoder h = new Encoder(false, null, -1, true);
        public static final Encoder i = new Encoder(true, null, -1, true);

        static {
            byte[] bArr = {13, 10};
            f15812g = bArr;
            j = new Encoder(false, bArr, 76, true);
        }

        public Encoder(boolean z4, byte[] bArr, int i4, boolean z5) {
            this.c = z4;
            this.f15813a = bArr;
            this.f15814b = i4;
            this.f15815d = z5;
        }

        public final int a(int i4) {
            int i6;
            if (this.f15815d) {
                i6 = ((i4 + 2) / 3) * 4;
            } else {
                int i10 = i4 % 3;
                i6 = ((i4 / 3) * 4) + (i10 == 0 ? 0 : i10 + 1);
            }
            int i11 = this.f15814b;
            return i11 > 0 ? (((i6 - 1) / i11) * this.f15813a.length) + i6 : i6;
        }

        public byte[] encode(byte[] bArr) {
            int iA = a(bArr.length);
            byte[] bArr2 = new byte[iA];
            int iA2 = a(bArr, 0, bArr.length, bArr2);
            return iA2 != iA ? Arrays.copyOf(bArr2, iA2) : bArr2;
        }

        public String encodeToString(byte[] bArr) {
            byte[] bArrEncode = encode(bArr);
            return new String(bArrEncode, 0, 0, bArrEncode.length);
        }

        public Encoder withoutPadding() {
            return !this.f15815d ? this : new Encoder(this.c, this.f15813a, this.f15814b, false);
        }

        public OutputStream wrap(OutputStream outputStream) {
            Objects.requireNonNull(outputStream);
            return new EncOutputStream(outputStream, this.c ? f : e, this.f15813a, this.f15814b, this.f15815d);
        }

        public int encode(byte[] bArr, byte[] bArr2) {
            if (bArr2.length >= a(bArr.length)) {
                return a(bArr, 0, bArr.length, bArr2);
            }
            throw new IllegalArgumentException("Output byte array is too small for encoding all input bytes");
        }

        public final int a(byte[] bArr, int i4, int i6, byte[] bArr2) {
            int i10;
            char[] cArr = this.c ? f : e;
            int i11 = ((i6 - i4) / 3) * 3;
            int i12 = i4 + i11;
            int i13 = this.f15814b;
            if (i13 > 0 && i11 > (i10 = (i13 / 4) * 3)) {
                i11 = i10;
            }
            int i14 = i4;
            int i15 = 0;
            while (i14 < i12) {
                int iMin = Math.min(i14 + i11, i12);
                int i16 = i14;
                int i17 = i15;
                while (i16 < iMin) {
                    int i18 = i16 + 2;
                    int i19 = ((bArr[i16 + 1] & 255) << 8) | ((bArr[i16] & 255) << 16);
                    i16 += 3;
                    int i20 = i19 | (bArr[i18] & 255);
                    bArr2[i17] = (byte) cArr[(i20 >>> 18) & 63];
                    bArr2[i17 + 1] = (byte) cArr[(i20 >>> 12) & 63];
                    int i21 = i17 + 3;
                    bArr2[i17 + 2] = (byte) cArr[(i20 >>> 6) & 63];
                    i17 += 4;
                    bArr2[i21] = (byte) cArr[i20 & 63];
                }
                int i22 = ((iMin - i14) / 3) * 4;
                i15 += i22;
                if (i22 == this.f15814b && iMin < i6) {
                    byte[] bArr3 = this.f15813a;
                    int length = bArr3.length;
                    int i23 = 0;
                    while (i23 < length) {
                        bArr2[i15] = bArr3[i23];
                        i23++;
                        i15++;
                    }
                }
                i14 = iMin;
            }
            if (i14 >= i6) {
                return i15;
            }
            int i24 = i14 + 1;
            int i25 = bArr[i14] & 255;
            int i26 = i15 + 1;
            bArr2[i15] = (byte) cArr[i25 >> 2];
            if (i24 == i6) {
                int i27 = i15 + 2;
                bArr2[i26] = (byte) cArr[(i25 << 4) & 63];
                if (!this.f15815d) {
                    return i27;
                }
                int i28 = i15 + 3;
                bArr2[i27] = 61;
                int i29 = i15 + 4;
                bArr2[i28] = 61;
                return i29;
            }
            int i30 = bArr[i24] & 255;
            bArr2[i26] = (byte) cArr[((i25 << 4) & 63) | (i30 >> 4)];
            int i31 = i15 + 3;
            bArr2[i15 + 2] = (byte) cArr[(i30 << 2) & 63];
            if (!this.f15815d) {
                return i31;
            }
            int i32 = i15 + 4;
            bArr2[i31] = 61;
            return i32;
        }

        public ByteBuffer encode(ByteBuffer byteBuffer) {
            int iA;
            int iA2 = a(byteBuffer.remaining());
            byte[] bArrCopyOf = new byte[iA2];
            if (byteBuffer.hasArray()) {
                iA = a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() + byteBuffer.arrayOffset(), bArrCopyOf);
                byteBuffer.position(byteBuffer.limit());
            } else {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr);
                iA = a(bArr, 0, iRemaining, bArrCopyOf);
            }
            if (iA != iA2) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, iA);
            }
            return ByteBuffer.wrap(bArrCopyOf);
        }
    }
}
