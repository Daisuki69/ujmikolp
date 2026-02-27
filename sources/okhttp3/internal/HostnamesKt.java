package okhttp3.internal;

import androidx.media3.datasource.cache.c;
import com.dynatrace.android.agent.Global;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.j;
import okio.Buffer;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes5.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (j.i(cCharAt, 31) <= 0 || j.i(cCharAt, 127) >= 0 || C2576A.E(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i, int i4, byte[] bArr, int i6) {
        int i10 = i6;
        while (i < i4) {
            if (i10 == bArr.length) {
                return false;
            }
            if (i10 != i6) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i11 = i;
            int i12 = 0;
            while (i11 < i4) {
                char cCharAt = str.charAt(i11);
                if (j.i(cCharAt, 48) < 0 || j.i(cCharAt, 57) > 0) {
                    break;
                }
                if ((i12 == 0 && i != i11) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i11++;
            }
            if (i11 - i == 0) {
                return false;
            }
            bArr[i10] = (byte) i12;
            i10++;
            i = i11;
        }
        return i10 == i6 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r4 == 16) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        if (r5 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        r10 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r10, r10);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r10, int r11, int r12) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            if (r11 >= r12) goto L76
            if (r4 != r0) goto Lf
            goto L7a
        Lf:
            int r7 = r11 + 2
            if (r7 > r12) goto L27
            java.lang.String r8 = "::"
            boolean r8 = zj.z.u(r10, r11, r8, r2)
            if (r8 == 0) goto L27
            if (r5 == r3) goto L1f
            goto L7a
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r7 != r12) goto L25
            goto L76
        L25:
            r6 = r7
            goto L49
        L27:
            if (r4 == 0) goto L33
            java.lang.String r7 = ":"
            boolean r7 = zj.z.u(r10, r11, r7, r2)
            if (r7 == 0) goto L35
            int r11 = r11 + 1
        L33:
            r6 = r11
            goto L49
        L35:
            java.lang.String r7 = "."
            boolean r11 = zj.z.u(r10, r11, r7, r2)
            if (r11 == 0) goto L7a
            int r11 = r4 + (-2)
            boolean r10 = decodeIpv4Suffix(r10, r6, r12, r1, r11)
            if (r10 != 0) goto L46
            goto L7a
        L46:
            int r4 = r4 + 2
            goto L76
        L49:
            r7 = r2
            r11 = r6
        L4b:
            if (r11 >= r12) goto L5d
            char r8 = r10.charAt(r11)
            int r8 = okhttp3.internal.Util.parseHexDigit(r8)
            if (r8 == r3) goto L5d
            int r7 = r7 << 4
            int r7 = r7 + r8
            int r11 = r11 + 1
            goto L4b
        L5d:
            int r8 = r11 - r6
            if (r8 == 0) goto L7a
            r9 = 4
            if (r8 <= r9) goto L65
            goto L7a
        L65:
            int r8 = r4 + 1
            int r9 = r7 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r4 + 2
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r1[r8] = r7
            goto L9
        L76:
            if (r4 == r0) goto L88
            if (r5 != r3) goto L7c
        L7a:
            r10 = 0
            return r10
        L7c:
            int r10 = r4 - r5
            int r11 = 16 - r10
            java.lang.System.arraycopy(r1, r5, r1, r11, r10)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L88:
            java.net.InetAddress r10 = java.net.InetAddress.getByAddress(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i = -1;
        int i4 = 0;
        int i6 = 0;
        int i10 = 0;
        while (i6 < bArr.length) {
            int i11 = i6;
            while (i11 < 16 && bArr[i11] == 0 && bArr[i11 + 1] == 0) {
                i11 += 2;
            }
            int i12 = i11 - i6;
            if (i12 > i10 && i12 >= 4) {
                i = i6;
                i10 = i12;
            }
            i6 = i11 + 2;
        }
        Buffer buffer = new Buffer();
        while (i4 < bArr.length) {
            if (i4 == i) {
                buffer.writeByte(58);
                i4 += i10;
                if (i4 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i4 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i4], 255) << 8) | Util.and(bArr[i4 + 1], 255));
                i4 += 2;
            }
        }
        return buffer.readUtf8();
    }

    public static final String toCanonicalHost(String str) {
        j.g(str, "<this>");
        if (C2576A.z(str, Global.COLON, false, 2)) {
            InetAddress inetAddressDecodeIpv6 = (z.w(str, 2, "[", false) && z.n(str, 2, "]", false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            throw new AssertionError(c.g('\'', "Invalid IPv6 address: '", str));
        }
        try {
            String ascii = IDN.toASCII(str);
            j.f(ascii, "toASCII(host)");
            Locale US = Locale.US;
            j.f(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            j.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                return null;
            }
            if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
