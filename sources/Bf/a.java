package Bf;

import We.s;
import android.util.Log;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.ws.WebSocketProtocol;
import yf.k;
import yf.l;
import yf.m;
import yf.n;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f429d = Long.toString(Long.MAX_VALUE).length();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f430a = Nf.a.e.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f431b;
    public yf.e c;

    public a(i iVar) {
        this.f431b = iVar;
    }

    public static boolean d(int i) {
        return i >= 48 && i <= 57;
    }

    public static boolean e(int i) {
        return i == 32 || i == 13 || i == 10 || i == 9 || i == 62 || i == 60 || i == 91 || i == 47 || i == 93 || i == 41 || i == 40 || i == 0 || i == 12 || i == 37;
    }

    public static boolean f(char c) {
        if (d(c)) {
            return true;
        }
        if (c < 'a' || c > 'f') {
            return c >= 'A' && c <= 'F';
        }
        return true;
    }

    public static boolean g(int i) {
        return i == 0 || i == 9 || i == 12 || i == 10 || i == 13 || i == 32;
    }

    public final int a(int i) {
        byte b8;
        byte[] bArr = new byte[3];
        i iVar = this.f431b;
        int i4 = iVar.read(bArr);
        if (i4 == 3 && bArr[0] == 13 && (((b8 = bArr[1]) == 10 && bArr[2] == 47) || bArr[2] == 62 || b8 == 47 || b8 == 62)) {
            i = 0;
        }
        if (i4 > 0) {
            iVar.d(i4, bArr);
        }
        return i;
    }

    public final m b(n nVar) throws IOException {
        yf.e eVar = this.c;
        if (eVar != null) {
            return eVar.f(nVar);
        }
        throw new IOException("object reference " + nVar + " at offset " + this.f431b.getPosition() + " in content stream");
    }

    public final boolean c() {
        return d(this.f431b.peek());
    }

    public final yf.d h() throws IOException {
        l('<');
        l('<');
        t();
        yf.d dVar = new yf.d();
        boolean z4 = false;
        loop0: while (!z4) {
            t();
            i iVar = this.f431b;
            char cPeek = (char) iVar.peek();
            if (cPeek == '>') {
                z4 = true;
            } else if (cPeek == '/') {
                yf.j jVarI = i();
                if (jVarI == null || jVarI.f21267a.isEmpty()) {
                    Log.w("PdfBox-Android", "Empty COSName at offset " + iVar.getPosition());
                }
                long position = iVar.getPosition();
                yf.b bVarK = k();
                t();
                if ((bVarK instanceof l) && c()) {
                    long position2 = iVar.getPosition();
                    yf.b bVarK2 = k();
                    t();
                    l('R');
                    boolean z5 = bVarK instanceof yf.i;
                    k kVar = k.f21269a;
                    if (!z5) {
                        Log.e("PdfBox-Android", "expected number, actual=" + bVarK + " at offset " + position);
                    } else if (bVarK2 instanceof yf.i) {
                        long j = ((yf.i) bVarK).f21165a;
                        if (j <= 0) {
                            StringBuilder sbS = androidx.camera.core.impl.a.s(j, "invalid object number value =", " at offset ");
                            sbS.append(position);
                            Log.w("PdfBox-Android", sbS.toString());
                        } else {
                            int i = (int) ((yf.i) bVarK2).f21165a;
                            if (i < 0) {
                                Log.e("PdfBox-Android", "invalid generation number value =" + i + " at offset " + position);
                            } else {
                                bVarK = b(new n(j, i));
                            }
                        }
                    } else {
                        Log.e("PdfBox-Android", "expected number, actual=" + bVarK2 + " at offset " + position2);
                    }
                    bVarK = kVar;
                }
                t();
                if (bVarK == null) {
                    Log.w("PdfBox-Android", "Bad dictionary declaration at offset " + iVar.getPosition());
                    return dVar;
                }
                if (!(bVarK instanceof yf.i) || ((yf.i) bVarK).f21166b) {
                    dVar.F(jVarI, bVarK);
                } else {
                    Log.w("PdfBox-Android", "Skipped out of range number value at offset " + iVar.getPosition());
                }
            } else {
                Log.w("PdfBox-Android", "Invalid dictionary, found: '" + cPeek + "' but expected: '/' at offset " + iVar.getPosition());
                int i4 = iVar.read();
                while (i4 != -1 && i4 != 47 && i4 != 62) {
                    if (i4 == 101 && iVar.read() == 110 && iVar.read() == 100) {
                        int i6 = iVar.read();
                        boolean z8 = i6 == 115 && iVar.read() == 116 && iVar.read() == 114 && iVar.read() == 101 && iVar.read() == 97 && iVar.read() == 109;
                        boolean z9 = !z8 && i6 == 111 && iVar.read() == 98 && iVar.read() == 106;
                        if (z8 || z9) {
                            break loop0;
                        }
                    }
                    i4 = iVar.read();
                }
                if (i4 == -1) {
                    return dVar;
                }
                iVar.unread(i4);
            }
        }
        l('>');
        l('>');
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yf.j i() throws java.io.IOException {
        /*
            r9 = this;
            r0 = 47
            r9.l(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            Bf.i r1 = r9.f431b
            int r2 = r1.read()
        L10:
            r3 = -1
            if (r2 == r3) goto L82
            r4 = 35
            if (r2 != r4) goto L73
            int r4 = r1.read()
            int r5 = r1.read()
            char r6 = (char) r4
            boolean r7 = f(r6)
            if (r7 == 0) goto L5d
            char r7 = (char) r5
            boolean r8 = f(r7)
            if (r8 == 0) goto L5d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = java.lang.Character.toString(r6)
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r3 = 16
            int r3 = java.lang.Integer.parseInt(r2, r3)     // Catch: java.lang.NumberFormatException -> L4e
            r0.write(r3)     // Catch: java.lang.NumberFormatException -> L4e
            int r4 = r1.read()
            goto L68
        L4e:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "Error: expected hex digit, actual='"
            java.lang.String r4 = "'"
            java.lang.String r2 = We.s.j(r3, r2, r4)
            r1.<init>(r2, r0)
            throw r1
        L5d:
            if (r5 == r3) goto L6a
            if (r4 != r3) goto L62
            goto L6a
        L62:
            r1.unread(r5)
            r0.write(r2)
        L68:
            r2 = r4
            goto L10
        L6a:
            java.lang.String r2 = "PdfBox-Android"
            java.lang.String r4 = "Premature EOF in BaseParser#parseCOSName"
            android.util.Log.e(r2, r4)
            r2 = r3
            goto L82
        L73:
            boolean r4 = e(r2)
            if (r4 == 0) goto L7a
            goto L82
        L7a:
            r0.write(r2)
            int r2 = r1.read()
            goto L10
        L82:
            if (r2 == r3) goto L87
            r1.unread(r2)
        L87:
            byte[] r0 = r0.toByteArray()
            java.nio.charset.CharsetDecoder r1 = r9.f430a     // Catch: java.nio.charset.CharacterCodingException -> L9c
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)     // Catch: java.nio.charset.CharacterCodingException -> L9c
            r1.decode(r2)     // Catch: java.nio.charset.CharacterCodingException -> L9c
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = Nf.a.e
            r1.<init>(r0, r2)
            goto La3
        L9c:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = Nf.a.f4398d
            r1.<init>(r0, r2)
        La3:
            yf.j r0 = yf.j.f(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.a.i():yf.j");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r2 = r0.toString();
        r0 = yf.q.f21278b;
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.lang.StringBuilder(r2.trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if ((r4.length() % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        r4.append('0');
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        r5 = r4.length();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r0 >= r5) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r6 = r0 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r3.write(java.lang.Integer.parseInt(r4.substring(r0, r6), 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (yf.q.f21278b != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        android.util.Log.w("PdfBox-Android", "Encountered a malformed hex string");
        r3.write(63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        throw new java.io.IOException("Invalid hex string: ".concat(r2), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        return new yf.q(r3.toByteArray());
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yf.q j() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.a.j():yf.q");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0258, code lost:
    
        r0.read();
        t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yf.b k() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bf.a.k():yf.b");
    }

    public final void l(char c) throws IOException {
        i iVar = this.f431b;
        char c10 = (char) iVar.read();
        if (c10 == c) {
            return;
        }
        throw new IOException("expected='" + c + "' actual='" + c10 + "' at offset " + iVar.getPosition());
    }

    public final void m(char[] cArr) throws IOException {
        t();
        for (char c : cArr) {
            i iVar = this.f431b;
            if (iVar.read() != c) {
                throw new IOException("Expected string '" + new String(cArr) + "' but missed at character '" + c + "' at offset " + iVar.getPosition());
            }
        }
        t();
    }

    public final int n() throws IOException {
        t();
        StringBuilder sbS = s();
        try {
            int i = Integer.parseInt(sbS.toString());
            if (i < 0 || i > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                throw new IOException(s.g(i, "Generation Number '", "' has more than 5 digits"));
            }
            return i;
        } catch (NumberFormatException e) {
            byte[] bytes = sbS.toString().getBytes(Nf.a.c);
            i iVar = this.f431b;
            iVar.unread(bytes);
            throw new IOException("Error: Expected an integer type at offset " + iVar.getPosition() + ", instead got '" + ((Object) sbS) + "'", e);
        }
    }

    public final String o() throws IOException {
        int i;
        i iVar = this.f431b;
        if (iVar.v()) {
            throw new IOException("Error: End-of-File, expected line at offset " + iVar.getPosition());
        }
        StringBuilder sb2 = new StringBuilder(11);
        while (true) {
            i = iVar.read();
            if (i == -1 || 10 == i || 13 == i) {
                break;
            }
            sb2.append((char) i);
        }
        if (13 == i && 10 == iVar.peek()) {
            iVar.read();
        }
        return sb2.toString();
    }

    public final long p() throws IOException {
        t();
        StringBuilder sbS = s();
        try {
            return Long.parseLong(sbS.toString());
        } catch (NumberFormatException e) {
            byte[] bytes = sbS.toString().getBytes(Nf.a.c);
            i iVar = this.f431b;
            iVar.unread(bytes);
            throw new IOException("Error: Expected a long type at offset " + iVar.getPosition() + ", instead got '" + ((Object) sbS) + "'", e);
        }
    }

    public final long q() throws IOException {
        long jP = p();
        if (jP < 0 || jP >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            throw new IOException(androidx.media3.datasource.cache.c.i(jP, "Object Number '", "' has more than 10 digits or is negative"));
        }
        return jP;
    }

    public final String r() {
        t();
        StringBuilder sb2 = new StringBuilder();
        i iVar = this.f431b;
        int i = iVar.read();
        while (true) {
            char c = (char) i;
            if (e(c) || i == -1) {
                break;
            }
            sb2.append(c);
            i = iVar.read();
        }
        if (i != -1) {
            iVar.unread(i);
        }
        return sb2.toString();
    }

    public final StringBuilder s() throws IOException {
        i iVar;
        StringBuilder sb2 = new StringBuilder();
        do {
            iVar = this.f431b;
            int i = iVar.read();
            if (i < 48 || i > 57) {
                if (i != -1) {
                    iVar.unread(i);
                }
                return sb2;
            }
            sb2.append((char) i);
        } while (sb2.length() <= f429d);
        throw new IOException("Number '" + ((Object) sb2) + "' is getting too long, stop reading at offset " + iVar.getPosition());
    }

    public final void t() {
        i iVar = this.f431b;
        int i = iVar.read();
        while (true) {
            if (!g(i) && i != 37) {
                break;
            }
            if (i == 37) {
                i = iVar.read();
                while (10 != i && 13 != i && i != -1) {
                    i = iVar.read();
                }
            } else {
                i = iVar.read();
            }
        }
        if (i != -1) {
            iVar.unread(i);
        }
    }

    public final void u() {
        i iVar = this.f431b;
        int i = iVar.read();
        while (32 == i) {
            i = iVar.read();
        }
        if (13 != i) {
            if (10 != i) {
                iVar.unread(i);
            }
        } else {
            int i4 = iVar.read();
            if (10 != i4) {
                iVar.unread(i4);
            }
        }
    }
}
