package y;

import dOYHB6.tiZVw8.numX49;
import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import pg.C2038a;
import v.AbstractC2329d;
import w4.C2378b;

/* JADX INFO: renamed from: y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2495b extends AbstractC2494a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ByteString f21031l = ByteString.encodeUtf8(numX49.tnTj78("bb3P"));
    public static final ByteString m = ByteString.encodeUtf8(numX49.tnTj78("bb3b"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ByteString f21032n = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    public final BufferedSource f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Buffer f21033g;
    public int h;
    public long i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f21034k;

    static {
        ByteString.encodeUtf8(numX49.tnTj78("bb32"));
        ByteString.encodeUtf8(numX49.tnTj78("bb3L"));
    }

    public C2495b(BufferedSource bufferedSource) {
        this.f21029b = new int[32];
        this.c = new String[32];
        this.f21030d = new int[32];
        this.h = 0;
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.f = bufferedSource;
        this.f21033g = bufferedSource.buffer();
        t(6);
    }

    public final void C() throws C2378b {
        B(numX49.tnTj78("bb3r"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b2, code lost:
    
        if (F(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b4, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01b6, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01bc, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01be, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c2, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01c4, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c6, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c9, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ca, code lost:
    
        r22.i = r8;
        r7.skip(r2);
        r9 = 16;
        r22.h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01d5, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d8, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01db, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01dd, code lost:
    
        r22.j = r2;
        r9 = 17;
        r22.h = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int D() throws w4.C2378b, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2495b.D():int");
    }

    public final int E(String str, C2038a c2038a) {
        int length = ((String[]) c2038a.f19100b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c2038a.f19100b)[i])) {
                this.h = 0;
                this.c[this.f21028a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean F(int i) throws C2378b {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        C();
        throw null;
    }

    public final String G() throws IOException {
        String strI;
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD == 14) {
            strI = J();
        } else if (iD == 13) {
            strI = I(m);
        } else if (iD == 12) {
            strI = I(f21031l);
        } else {
            if (iD != 15) {
                throw new Bh.a(numX49.tnTj78("bb3O") + AbstractC2329d.k(peek()) + numX49.tnTj78("bb3Q") + getPath(), 2);
            }
            strI = this.f21034k;
        }
        this.h = 0;
        this.c[this.f21028a - 1] = strI;
        return strI;
    }

    public final int H(boolean z4) throws C2378b, EOFException {
        int i = 0;
        while (true) {
            int i4 = i + 1;
            BufferedSource bufferedSource = this.f;
            if (!bufferedSource.request(i4)) {
                if (z4) {
                    throw new EOFException(numX49.tnTj78("bb3t"));
                }
                return -1;
            }
            long j = i;
            Buffer buffer = this.f21033g;
            byte b8 = buffer.getByte(j);
            if (b8 != 10 && b8 != 32 && b8 != 13 && b8 != 9) {
                buffer.skip(j);
                if (b8 == 47) {
                    if (bufferedSource.request(2L)) {
                        C();
                        throw null;
                    }
                } else if (b8 == 35) {
                    C();
                    throw null;
                }
                return b8;
            }
            i = i4;
        }
    }

    public final String I(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jIndexOfElement = this.f.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                B(numX49.tnTj78("bb3U"));
                throw null;
            }
            Buffer buffer = this.f21033g;
            if (buffer.getByte(jIndexOfElement) != 92) {
                if (sb2 == null) {
                    String utf8 = buffer.readUtf8(jIndexOfElement);
                    buffer.readByte();
                    return utf8;
                }
                sb2.append(buffer.readUtf8(jIndexOfElement));
                buffer.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(buffer.readUtf8(jIndexOfElement));
            buffer.readByte();
            sb2.append(K());
        }
    }

    public final String J() throws IOException {
        long jIndexOfElement = this.f.indexOfElement(f21032n);
        Buffer buffer = this.f21033g;
        return jIndexOfElement != -1 ? buffer.readUtf8(jIndexOfElement) : buffer.readUtf8();
    }

    public final char K() throws C2378b, EOFException {
        int i;
        BufferedSource bufferedSource = this.f;
        if (!bufferedSource.request(1L)) {
            B(numX49.tnTj78("bb34"));
            throw null;
        }
        Buffer buffer = this.f21033g;
        byte b8 = buffer.readByte();
        if (b8 == 10 || b8 == 34 || b8 == 39 || b8 == 47 || b8 == 92) {
            return (char) b8;
        }
        if (b8 == 98) {
            return '\b';
        }
        if (b8 == 102) {
            return '\f';
        }
        if (b8 == 110) {
            return '\n';
        }
        if (b8 == 114) {
            return '\r';
        }
        if (b8 == 116) {
            return '\t';
        }
        if (b8 != 117) {
            B(numX49.tnTj78("bb3C") + ((char) b8));
            throw null;
        }
        if (!bufferedSource.request(4L)) {
            throw new EOFException(numX49.tnTj78("bb38") + getPath());
        }
        char c = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            byte b10 = buffer.getByte(i4);
            char c10 = (char) (c << 4);
            if (b10 >= 48 && b10 <= 57) {
                i = b10 - 48;
            } else if (b10 >= 97 && b10 <= 102) {
                i = b10 - 87;
            } else {
                if (b10 < 65 || b10 > 70) {
                    B(numX49.tnTj78("bb3e") + buffer.readUtf8(4L));
                    throw null;
                }
                i = b10 - 55;
            }
            c = (char) (i + c10);
        }
        buffer.skip(4L);
        return c;
    }

    public final void L(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.f.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                B(numX49.tnTj78("bb3o"));
                throw null;
            }
            Buffer buffer = this.f21033g;
            if (buffer.getByte(jIndexOfElement) != 92) {
                buffer.skip(jIndexOfElement + 1);
                return;
            } else {
                buffer.skip(jIndexOfElement + 1);
                K();
            }
        }
    }

    @Override // y.AbstractC2494a
    public final void b() {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD == 3) {
            t(1);
            this.f21030d[this.f21028a - 1] = 0;
            this.h = 0;
        } else {
            throw new Bh.a(numX49.tnTj78("bb3K") + AbstractC2329d.k(peek()) + numX49.tnTj78("bb3w") + getPath(), 2);
        }
    }

    @Override // y.AbstractC2494a
    public final void c() {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD == 1) {
            t(3);
            this.h = 0;
        } else {
            throw new Bh.a(numX49.tnTj78("bb3c") + AbstractC2329d.k(peek()) + numX49.tnTj78("bb3m") + getPath(), 2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.h = 0;
        this.f21029b[0] = 8;
        this.f21028a = 1;
        this.f21033g.clear();
        this.f.close();
    }

    @Override // y.AbstractC2494a
    public final void f() {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD != 4) {
            throw new Bh.a(numX49.tnTj78("bb3D") + AbstractC2329d.k(peek()) + numX49.tnTj78("bb3h") + getPath(), 2);
        }
        int i = this.f21028a;
        this.f21028a = i - 1;
        int[] iArr = this.f21030d;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        this.h = 0;
    }

    @Override // y.AbstractC2494a
    public final void g() {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD != 2) {
            throw new Bh.a(numX49.tnTj78("bb3M") + AbstractC2329d.k(peek()) + numX49.tnTj78("bb3N") + getPath(), 2);
        }
        int i = this.f21028a;
        int i4 = i - 1;
        this.f21028a = i4;
        this.c[i4] = null;
        int[] iArr = this.f21030d;
        int i6 = i - 2;
        iArr[i6] = iArr[i6] + 1;
        this.h = 0;
    }

    @Override // y.AbstractC2494a
    public final boolean i() throws C2378b, EOFException {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        return (iD == 2 || iD == 4 || iD == 18) ? false : true;
    }

    @Override // y.AbstractC2494a
    public final boolean k() throws C2378b, EOFException {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD == 5) {
            this.h = 0;
            int[] iArr = this.f21030d;
            int i = this.f21028a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iD == 6) {
            this.h = 0;
            int[] iArr2 = this.f21030d;
            int i4 = this.f21028a - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        throw new Bh.a(numX49.tnTj78("bb36") + AbstractC2329d.k(peek()) + numX49.tnTj78("bb3a") + getPath(), 2);
    }

    @Override // y.AbstractC2494a
    public final double m() {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD == 16) {
            this.h = 0;
            int[] iArr = this.f21030d;
            int i = this.f21028a - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        String strTnTj78 = numX49.tnTj78("bb3X");
        String strTnTj782 = numX49.tnTj78("bb3G");
        if (iD == 17) {
            this.f21034k = this.f21033g.readUtf8(this.j);
        } else if (iD == 9) {
            this.f21034k = I(m);
        } else if (iD == 8) {
            this.f21034k = I(f21031l);
        } else if (iD == 10) {
            this.f21034k = J();
        } else if (iD != 11) {
            throw new Bh.a(strTnTj78 + AbstractC2329d.k(peek()) + strTnTj782 + getPath(), 2);
        }
        this.h = 11;
        try {
            double d10 = Double.parseDouble(this.f21034k);
            if (Double.isNaN(d10) || Double.isInfinite(d10)) {
                throw new C2378b(numX49.tnTj78("bb33") + d10 + strTnTj782 + getPath());
            }
            this.f21034k = null;
            this.h = 0;
            int[] iArr2 = this.f21030d;
            int i4 = this.f21028a - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new Bh.a(strTnTj78 + this.f21034k + strTnTj782 + getPath(), 2);
        }
    }

    @Override // y.AbstractC2494a
    public final int peek() throws C2378b, EOFException {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        switch (iD) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // y.AbstractC2494a
    public final int q() {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        String strTnTj78 = numX49.tnTj78("bb3y");
        String strTnTj782 = numX49.tnTj78("bb3v");
        if (iD == 16) {
            long j = this.i;
            int i = (int) j;
            if (j == i) {
                this.h = 0;
                int[] iArr = this.f21030d;
                int i4 = this.f21028a - 1;
                iArr[i4] = iArr[i4] + 1;
                return i;
            }
            throw new Bh.a(strTnTj782 + this.i + strTnTj78 + getPath(), 2);
        }
        if (iD == 17) {
            this.f21034k = this.f21033g.readUtf8(this.j);
        } else if (iD == 9 || iD == 8) {
            String strI = iD == 9 ? I(m) : I(f21031l);
            this.f21034k = strI;
            try {
                int i6 = Integer.parseInt(strI);
                this.h = 0;
                int[] iArr2 = this.f21030d;
                int i10 = this.f21028a - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i6;
            } catch (NumberFormatException unused) {
            }
        } else if (iD != 11) {
            throw new Bh.a(strTnTj782 + AbstractC2329d.k(peek()) + strTnTj78 + getPath(), 2);
        }
        this.h = 11;
        try {
            double d10 = Double.parseDouble(this.f21034k);
            int i11 = (int) d10;
            if (i11 != d10) {
                throw new Bh.a(strTnTj782 + this.f21034k + strTnTj78 + getPath(), 2);
            }
            this.f21034k = null;
            this.h = 0;
            int[] iArr3 = this.f21030d;
            int i12 = this.f21028a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return i11;
        } catch (NumberFormatException unused2) {
            throw new Bh.a(strTnTj782 + this.f21034k + strTnTj78 + getPath(), 2);
        }
    }

    @Override // y.AbstractC2494a
    public final String r() {
        String utf8;
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD == 10) {
            utf8 = J();
        } else if (iD == 9) {
            utf8 = I(m);
        } else if (iD == 8) {
            utf8 = I(f21031l);
        } else if (iD == 11) {
            utf8 = this.f21034k;
            this.f21034k = null;
        } else if (iD == 16) {
            utf8 = Long.toString(this.i);
        } else {
            if (iD != 17) {
                throw new Bh.a(numX49.tnTj78("bb37") + AbstractC2329d.k(peek()) + numX49.tnTj78("bb3A") + getPath(), 2);
            }
            utf8 = this.f21033g.readUtf8(this.j);
        }
        this.h = 0;
        int[] iArr = this.f21030d;
        int i = this.f21028a - 1;
        iArr[i] = iArr[i] + 1;
        return utf8;
    }

    public final String toString() {
        return numX49.tnTj78("bb3Y") + this.f + numX49.tnTj78("bb3T");
    }

    @Override // y.AbstractC2494a
    public final int w(C2038a c2038a) {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD < 12 || iD > 15) {
            return -1;
        }
        if (iD == 15) {
            return E(this.f21034k, c2038a);
        }
        int iSelect = this.f.select((Options) c2038a.c);
        if (iSelect != -1) {
            this.h = 0;
            this.c[this.f21028a - 1] = ((String[]) c2038a.f19100b)[iSelect];
            return iSelect;
        }
        String str = this.c[this.f21028a - 1];
        String strG = G();
        int iE = E(strG, c2038a);
        if (iE == -1) {
            this.h = 15;
            this.f21034k = strG;
            this.c[this.f21028a - 1] = str;
        }
        return iE;
    }

    @Override // y.AbstractC2494a
    public final void y() {
        int iD = this.h;
        if (iD == 0) {
            iD = D();
        }
        if (iD == 14) {
            long jIndexOfElement = this.f.indexOfElement(f21032n);
            Buffer buffer = this.f21033g;
            if (jIndexOfElement == -1) {
                jIndexOfElement = buffer.size();
            }
            buffer.skip(jIndexOfElement);
        } else if (iD == 13) {
            L(m);
        } else if (iD == 12) {
            L(f21031l);
        } else if (iD != 15) {
            throw new Bh.a(numX49.tnTj78("bb3p") + AbstractC2329d.k(peek()) + numX49.tnTj78("bb30") + getPath(), 2);
        }
        this.h = 0;
        this.c[this.f21028a - 1] = numX49.tnTj78("bb3R");
    }

    @Override // y.AbstractC2494a
    public final void z() {
        int i = 0;
        do {
            int iD = this.h;
            if (iD == 0) {
                iD = D();
            }
            if (iD == 3) {
                t(1);
            } else if (iD == 1) {
                t(3);
            } else {
                String strTnTj78 = numX49.tnTj78("bb3g");
                String strTnTj782 = numX49.tnTj78("bb3f");
                if (iD == 4) {
                    i--;
                    if (i < 0) {
                        throw new Bh.a(strTnTj782 + AbstractC2329d.k(peek()) + strTnTj78 + getPath(), 2);
                    }
                    this.f21028a--;
                } else if (iD == 2) {
                    i--;
                    if (i < 0) {
                        throw new Bh.a(strTnTj782 + AbstractC2329d.k(peek()) + strTnTj78 + getPath(), 2);
                    }
                    this.f21028a--;
                } else {
                    Buffer buffer = this.f21033g;
                    if (iD == 14 || iD == 10) {
                        long jIndexOfElement = this.f.indexOfElement(f21032n);
                        if (jIndexOfElement == -1) {
                            jIndexOfElement = buffer.size();
                        }
                        buffer.skip(jIndexOfElement);
                    } else if (iD == 9 || iD == 13) {
                        L(m);
                    } else if (iD == 8 || iD == 12) {
                        L(f21031l);
                    } else if (iD == 17) {
                        buffer.skip(this.j);
                    } else if (iD == 18) {
                        throw new Bh.a(strTnTj782 + AbstractC2329d.k(peek()) + strTnTj78 + getPath(), 2);
                    }
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.f21030d;
        int i4 = this.f21028a - 1;
        iArr[i4] = iArr[i4] + 1;
        this.c[i4] = numX49.tnTj78("bb31");
    }
}
