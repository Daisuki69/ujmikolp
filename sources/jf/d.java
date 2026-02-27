package jf;

import java.io.IOException;
import java.util.Locale;
import of.C1976a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1976a f17747a = C1976a.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f17748b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] c = new String[64];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f17749d = new String[256];

    static {
        int i = 0;
        int i4 = 0;
        while (true) {
            String[] strArr = f17749d;
            if (i4 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i4)};
            byte[] bArr = ef.c.f16663a;
            strArr[i4] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i4++;
        }
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i6 = iArr[0];
        strArr2[i6 | 8] = We.s.p(new StringBuilder(), strArr2[i6], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr2[i10];
            int i12 = iArr[0];
            String[] strArr3 = c;
            int i13 = i12 | i11;
            strArr3[i13] = strArr3[i12] + '|' + strArr3[i11];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i12]);
            sb2.append('|');
            strArr3[i13 | 8] = We.s.p(sb2, strArr3[i11], "|PADDED");
        }
        while (true) {
            String[] strArr4 = c;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f17749d[i];
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(boolean r10, int r11, int r12, byte r13, byte r14) {
        /*
            r0 = 5
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 1
            java.lang.String[] r6 = jf.d.f17748b
            int r7 = r6.length
            if (r13 >= r7) goto Le
            r6 = r6[r13]
            goto L20
        Le:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r13)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r3] = r6
            byte[] r6 = ef.c.f16663a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r8 = "0x%02x"
            java.lang.String r6 = java.lang.String.format(r6, r8, r7)
        L20:
            if (r14 != 0) goto L25
            java.lang.String r13 = ""
            goto L6b
        L25:
            java.lang.String[] r7 = jf.d.f17749d
            if (r13 == r2) goto L69
            if (r13 == r1) goto L69
            if (r13 == r4) goto L61
            r8 = 6
            if (r13 == r8) goto L61
            r8 = 7
            if (r13 == r8) goto L69
            r8 = 8
            if (r13 == r8) goto L69
            java.lang.String[] r8 = jf.d.c
            int r9 = r8.length
            if (r14 >= r9) goto L3f
            r7 = r8[r14]
            goto L41
        L3f:
            r7 = r7[r14]
        L41:
            if (r13 != r0) goto L50
            r8 = r14 & 4
            if (r8 == 0) goto L50
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            java.lang.String r13 = r7.replace(r13, r14)
            goto L6b
        L50:
            if (r13 != 0) goto L5f
            r13 = r14 & 32
            if (r13 == 0) goto L5f
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
            java.lang.String r13 = r7.replace(r13, r14)
            goto L6b
        L5f:
            r13 = r7
            goto L6b
        L61:
            if (r14 != r5) goto L66
            java.lang.String r13 = "ACK"
            goto L6b
        L66:
            r13 = r7[r14]
            goto L6b
        L69:
            r13 = r7[r14]
        L6b:
            if (r10 == 0) goto L70
            java.lang.String r10 = "<<"
            goto L72
        L70:
            java.lang.String r10 = ">>"
        L72:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r3] = r10
            r14[r5] = r11
            r14[r2] = r12
            r14[r1] = r6
            r14[r4] = r13
            byte[] r10 = ef.c.f16663a
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r11 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = java.lang.String.format(r10, r11, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.d.a(boolean, int, int, byte, byte):java.lang.String");
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = ef.c.f16663a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) throws IOException {
        byte[] bArr = ef.c.f16663a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
