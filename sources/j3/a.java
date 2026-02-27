package j3;

import Kh.I;
import We.s;
import com.google.gson.stream.MalformedJsonException;
import d4.AbstractC1331a;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f17694a;
    public long h;
    public int i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f17698k;
    public String[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f17700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17701o = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f17695b = new char[1024];
    public int c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17696d = 0;
    public int e = 0;
    public int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17697g = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17699l = 1;

    static {
        I.f2692b = new I(25);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f17698k = iArr;
        iArr[0] = 6;
        this.m = new String[32];
        this.f17700n = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f17694a = reader;
    }

    public double B() throws IOException {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f17697g = 0;
            int[] iArr = this.f17700n;
            int i = this.f17699l - 1;
            iArr[i] = iArr[i] + 1;
            return this.h;
        }
        if (iG == 16) {
            this.j = new String(this.f17695b, this.c, this.i);
            this.c += this.i;
        } else if (iG == 8 || iG == 9) {
            this.j = H(iG == 8 ? '\'' : '\"');
        } else if (iG == 10) {
            this.j = J();
        } else if (iG != 11) {
            throw S("a double");
        }
        this.f17697g = 11;
        double d10 = Double.parseDouble(this.j);
        if (this.f17701o != 1 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            R("JSON forbids NaN and infinities: " + d10);
            throw null;
        }
        this.j = null;
        this.f17697g = 0;
        int[] iArr2 = this.f17700n;
        int i4 = this.f17699l - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return d10;
    }

    public int C() throws IOException {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            long j = this.h;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.h + y());
            }
            this.f17697g = 0;
            int[] iArr = this.f17700n;
            int i4 = this.f17699l - 1;
            iArr[i4] = iArr[i4] + 1;
            return i;
        }
        if (iG == 16) {
            this.j = new String(this.f17695b, this.c, this.i);
            this.c += this.i;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw S("an int");
            }
            if (iG == 10) {
                this.j = J();
            } else {
                this.j = H(iG == 8 ? '\'' : '\"');
            }
            try {
                int i6 = Integer.parseInt(this.j);
                this.f17697g = 0;
                int[] iArr2 = this.f17700n;
                int i10 = this.f17699l - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f17697g = 11;
        double d10 = Double.parseDouble(this.j);
        int i11 = (int) d10;
        if (i11 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.j + y());
        }
        this.j = null;
        this.f17697g = 0;
        int[] iArr3 = this.f17700n;
        int i12 = this.f17699l - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return i11;
    }

    public long D() throws IOException {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f17697g = 0;
            int[] iArr = this.f17700n;
            int i = this.f17699l - 1;
            iArr[i] = iArr[i] + 1;
            return this.h;
        }
        if (iG == 16) {
            this.j = new String(this.f17695b, this.c, this.i);
            this.c += this.i;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw S("a long");
            }
            if (iG == 10) {
                this.j = J();
            } else {
                this.j = H(iG == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.j);
                this.f17697g = 0;
                int[] iArr2 = this.f17700n;
                int i4 = this.f17699l - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f17697g = 11;
        double d10 = Double.parseDouble(this.j);
        long j6 = (long) d10;
        if (j6 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.j + y());
        }
        this.j = null;
        this.f17697g = 0;
        int[] iArr3 = this.f17700n;
        int i6 = this.f17699l - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return j6;
    }

    public String E() {
        String strH;
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 14) {
            strH = J();
        } else if (iG == 12) {
            strH = H('\'');
        } else {
            if (iG != 13) {
                throw S("a name");
            }
            strH = H('\"');
        }
        this.f17697g = 0;
        this.m[this.f17699l - 1] = strH;
        return strH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.a.F(boolean):int");
    }

    public void G() {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 7) {
            throw S("null");
        }
        this.f17697g = 0;
        int[] iArr = this.f17700n;
        int i = this.f17699l - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r11.c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String H(char r12) throws com.google.gson.stream.MalformedJsonException {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.c
            int r3 = r11.f17696d
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r11.f17695b
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r5[r2]
            int r9 = r11.f17701o
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.R(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.c = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r5, r3, r8)
            return r12
        L31:
            r1.append(r5, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.c = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L4f:
            r1.append(r5, r3, r2)
            char r2 = r11.L()
            r1.append(r2)
            int r2 = r11.c
            int r3 = r11.f17696d
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.e
            int r2 = r2 + r6
            r11.e = r2
            r11.f = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r11.c = r2
            boolean r2 = r11.m(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.R(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.a.H(char):java.lang.String");
    }

    public String I() {
        String str;
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 10) {
            str = J();
        } else if (iG == 8) {
            str = H('\'');
        } else if (iG == 9) {
            str = H('\"');
        } else if (iG == 11) {
            str = this.j;
            this.j = null;
        } else if (iG == 15) {
            str = Long.toString(this.h);
        } else {
            if (iG != 16) {
                throw S("a string");
            }
            str = new String(this.f17695b, this.c, this.i);
            this.c += this.i;
        }
        this.f17697g = 0;
        int[] iArr = this.f17700n;
        int i = this.f17699l - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        f();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String J() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.c
            int r4 = r3 + r2
            int r5 = r7.f17696d
            char[] r6 = r7.f17695b
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.f()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.c
            r0.append(r6, r3, r2)
            int r3 = r7.c
            int r3 = r3 + r2
            r7.c = r3
            r2 = 1
            boolean r2 = r7.m(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.c
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.c
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.c
            int r2 = r2 + r1
            r7.c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.a.J():java.lang.String");
    }

    public final void K(int i) throws MalformedJsonException {
        int i4 = this.f17699l;
        if (i4 - 1 >= 255) {
            throw new MalformedJsonException("Nesting limit 255 reached" + y());
        }
        int[] iArr = this.f17698k;
        if (i4 == iArr.length) {
            int i6 = i4 * 2;
            this.f17698k = Arrays.copyOf(iArr, i6);
            this.f17700n = Arrays.copyOf(this.f17700n, i6);
            this.m = (String[]) Arrays.copyOf(this.m, i6);
        }
        int[] iArr2 = this.f17698k;
        int i10 = this.f17699l;
        this.f17699l = i10 + 1;
        iArr2[i10] = i;
    }

    public final char L() throws MalformedJsonException {
        int i;
        if (this.c == this.f17696d && !m(1)) {
            R("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.c;
        int i6 = i4 + 1;
        this.c = i6;
        char[] cArr = this.f17695b;
        char c = cArr[i4];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            R("Invalid escape sequence");
                            throw null;
                        }
                        if (i4 + 5 > this.f17696d && !m(4)) {
                            R("Unterminated escape sequence");
                            throw null;
                        }
                        int i10 = this.c;
                        int i11 = i10 + 4;
                        int i12 = 0;
                        while (i10 < i11) {
                            char c10 = cArr[i10];
                            int i13 = i12 << 4;
                            if (c10 >= '0' && c10 <= '9') {
                                i = c10 - '0';
                            } else if (c10 >= 'a' && c10 <= 'f') {
                                i = c10 - 'W';
                            } else {
                                if (c10 < 'A' || c10 > 'F') {
                                    R("Malformed Unicode escape \\u".concat(new String(cArr, this.c, 4)));
                                    throw null;
                                }
                                i = c10 - '7';
                            }
                            i12 = i + i13;
                            i10++;
                        }
                        this.c += 4;
                        return (char) i12;
                    }
                }
            }
            return c;
        }
        if (this.f17701o == 3) {
            R("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.e++;
        this.f = i6;
        if (this.f17701o == 3) {
            R("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void M(int i) {
        if (i == 0) {
            throw null;
        }
        this.f17701o = i;
    }

    public final void N(char c) throws MalformedJsonException {
        do {
            int i = this.c;
            int i4 = this.f17696d;
            while (i < i4) {
                int i6 = i + 1;
                char c10 = this.f17695b[i];
                if (c10 == c) {
                    this.c = i6;
                    return;
                }
                if (c10 == '\\') {
                    this.c = i6;
                    L();
                    i = this.c;
                    i4 = this.f17696d;
                } else {
                    if (c10 == '\n') {
                        this.e++;
                        this.f = i6;
                    }
                    i = i6;
                }
            }
            this.c = i;
        } while (m(1));
        R("Unterminated string");
        throw null;
    }

    public final void O() {
        char c;
        do {
            if (this.c >= this.f17696d && !m(1)) {
                return;
            }
            int i = this.c;
            int i4 = i + 1;
            this.c = i4;
            c = this.f17695b[i];
            if (c == '\n') {
                this.e++;
                this.f = i4;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.c
            int r2 = r1 + r0
            int r3 = r4.f17696d
            if (r2 >= r3) goto L51
            char[] r2 = r4.f17695b
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.f()
        L4b:
            int r1 = r4.c
            int r1 = r1 + r0
            r4.c = r1
            return
        L51:
            int r1 = r1 + r0
            r4.c = r1
            r0 = 1
            boolean r0 = r4.m(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.a.P():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void Q() {
        int i = 0;
        do {
            int iG = this.f17697g;
            if (iG == 0) {
                iG = g();
            }
            switch (iG) {
                case 1:
                    K(3);
                    i++;
                    this.f17697g = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.m[this.f17699l - 1] = null;
                    }
                    this.f17699l--;
                    i--;
                    this.f17697g = 0;
                    break;
                case 3:
                    K(1);
                    i++;
                    this.f17697g = 0;
                    break;
                case 4:
                    this.f17699l--;
                    i--;
                    this.f17697g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f17697g = 0;
                    break;
                case 8:
                    N('\'');
                    this.f17697g = 0;
                    break;
                case 9:
                    N('\"');
                    this.f17697g = 0;
                    break;
                case 10:
                    P();
                    this.f17697g = 0;
                    break;
                case 12:
                    N('\'');
                    if (i == 0) {
                        this.m[this.f17699l - 1] = "<skipped>";
                    }
                    this.f17697g = 0;
                    break;
                case 13:
                    N('\"');
                    if (i == 0) {
                        this.m[this.f17699l - 1] = "<skipped>";
                    }
                    this.f17697g = 0;
                    break;
                case 14:
                    P();
                    if (i == 0) {
                        this.m[this.f17699l - 1] = "<skipped>";
                    }
                    this.f17697g = 0;
                    break;
                case 16:
                    this.c += this.i;
                    this.f17697g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f17700n;
        int i4 = this.f17699l - 1;
        iArr[i4] = iArr[i4] + 1;
    }

    public final void R(String str) throws MalformedJsonException {
        StringBuilder sbW = androidx.camera.core.impl.a.w(str);
        sbW.append(y());
        sbW.append("\nSee ");
        sbW.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(sbW.toString());
    }

    public final IllegalStateException S(String str) {
        String str2 = peek() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbW = s.w("Expected ", str, " but was ");
        sbW.append(AbstractC1331a.x(peek()));
        sbW.append(y());
        sbW.append("\nSee ");
        sbW.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbW.toString());
    }

    public void b() throws IOException {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 3) {
            throw S("BEGIN_ARRAY");
        }
        K(1);
        this.f17700n[this.f17699l - 1] = 0;
        this.f17697g = 0;
    }

    public void c() {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 1) {
            throw S("BEGIN_OBJECT");
        }
        K(3);
        this.f17697g = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f17697g = 0;
        this.f17698k[0] = 8;
        this.f17699l = 1;
        this.f17694a.close();
    }

    public final void f() throws MalformedJsonException {
        if (this.f17701o == 1) {
            return;
        }
        R("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0219, code lost:
    
        if (w(r7) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0271 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.a.g():int");
    }

    public String getPath() {
        return q(false);
    }

    public void i() throws IOException {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 4) {
            throw S("END_ARRAY");
        }
        int i = this.f17699l;
        this.f17699l = i - 1;
        int[] iArr = this.f17700n;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        this.f17697g = 0;
    }

    public void k() {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 2) {
            throw S("END_OBJECT");
        }
        int i = this.f17699l;
        int i4 = i - 1;
        this.f17699l = i4;
        this.m[i4] = null;
        int[] iArr = this.f17700n;
        int i6 = i - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f17697g = 0;
    }

    public final boolean m(int i) throws IOException {
        int i4;
        int i6;
        int i10 = this.f;
        int i11 = this.c;
        this.f = i10 - i11;
        int i12 = this.f17696d;
        char[] cArr = this.f17695b;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f17696d = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f17696d = 0;
        }
        this.c = 0;
        do {
            int i14 = this.f17696d;
            int i15 = this.f17694a.read(cArr, i14, cArr.length - i14);
            if (i15 == -1) {
                return false;
            }
            i4 = this.f17696d + i15;
            this.f17696d = i4;
            if (this.e == 0 && (i6 = this.f) == 0 && i4 > 0 && cArr[0] == 65279) {
                this.c++;
                this.f = i6 + 1;
                i++;
            }
        } while (i4 < i);
        return true;
    }

    public int peek() {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        switch (iG) {
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
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final String q(boolean z4) {
        StringBuilder sb2 = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i4 = this.f17699l;
            if (i >= i4) {
                return sb2.toString();
            }
            int i6 = this.f17698k[i];
            switch (i6) {
                case 1:
                case 2:
                    int i10 = this.f17700n[i];
                    if (z4 && i10 > 0 && i == i4 - 1) {
                        i10--;
                    }
                    sb2.append('[');
                    sb2.append(i10);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.m[i];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(s.f(i6, "Unknown scope value: "));
            }
            i++;
        }
    }

    public String r() {
        return q(true);
    }

    public boolean t() throws IOException {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        return (iG == 2 || iG == 4 || iG == 17) ? false : true;
    }

    public String toString() {
        return getClass().getSimpleName() + y();
    }

    public final boolean w(char c) throws MalformedJsonException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        return false;
    }

    final String y() {
        StringBuilder sbU = s.u(" at line ", this.e + 1, " column ", (this.c - this.f) + 1, " path ");
        sbU.append(getPath());
        return sbU.toString();
    }

    public boolean z() throws IOException {
        int iG = this.f17697g;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 5) {
            this.f17697g = 0;
            int[] iArr = this.f17700n;
            int i = this.f17699l - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iG != 6) {
            throw S("a boolean");
        }
        this.f17697g = 0;
        int[] iArr2 = this.f17700n;
        int i4 = this.f17699l - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return false;
    }
}
