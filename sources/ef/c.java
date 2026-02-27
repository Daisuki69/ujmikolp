package ef;

import We.s;
import com.paymaya.domain.store.L;
import dOYHB6.tiZVw8.numX49;
import df.l;
import df.x;
import df.z;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import of.C1976a;
import of.e;
import of.h;
import p003if.AbstractC1601a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f16663a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f16664b;
    public static final l c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final of.l f16665d;
    public static final Charset e;
    public static final Charset f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TimeZone f16666g;
    public static final A7.l h;
    public static final Method i;
    public static final Pattern j;

    static {
        Method declaredMethod;
        String[] strArr = (String[]) new String[0].clone();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            String str = strArr[i4];
            if (str == null) {
                throw new IllegalArgumentException(numX49.tnTj78("bi2P"));
            }
            strArr[i4] = str.trim();
        }
        for (int i6 = 0; i6 < strArr.length; i6 += 2) {
            String str2 = strArr[i6];
            String str3 = strArr[i6 + 1];
            x.c(str2);
            x.d(str3, str2);
        }
        f16664b = new x(strArr);
        byte[] bArr = f16663a;
        e eVar = new e();
        eVar.k(0, bArr);
        long j6 = 0;
        c = new l(j6, eVar);
        if (j6 < 0 || j6 > j6 || 0 < j6) {
            throw new ArrayIndexOutOfBoundsException();
        }
        f16665d = new of.l((C1976a[]) new C1976a[]{C1976a.c(numX49.tnTj78("bi2b")), C1976a.c(numX49.tnTj78("bi22")), C1976a.c(numX49.tnTj78("bi2L")), C1976a.c(numX49.tnTj78("bi2r")), C1976a.c(numX49.tnTj78("bi2Z"))}.clone());
        e = Charset.forName(numX49.tnTj78("bi2k"));
        f = Charset.forName(numX49.tnTj78("bi2B"));
        f16666g = TimeZone.getTimeZone(numX49.tnTj78("bi2u"));
        h = new A7.l(9);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod(numX49.tnTj78("bi2V"), Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        i = declaredMethod;
        j = Pattern.compile(numX49.tnTj78("bi2S"));
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public static int b(int i4, int i6, String str, String str2) {
        while (i4 < i6) {
            if (str2.indexOf(str.charAt(i4)) != -1) {
                return i4;
            }
            i4++;
        }
        return i6;
    }

    public static int c(long j6) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j6 < 0) {
            throw new IllegalArgumentException(numX49.tnTj78("bi2E"));
        }
        if (timeUnit == null) {
            throw new NullPointerException(numX49.tnTj78("bi2i"));
        }
        long millis = timeUnit.toMillis(j6);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(numX49.tnTj78("bi2d"));
        }
        if (millis != 0 || j6 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(numX49.tnTj78("bi2j"));
    }

    public static int d(String str, char c10, int i4, int i6) {
        while (i4 < i6) {
            if (str.charAt(i4) == c10) {
                return i4;
            }
            i4++;
        }
        return i6;
    }

    public static String e(z zVar, boolean z4) {
        String str = zVar.f16508d;
        String strTnTj78 = numX49.tnTj78("bi2F");
        boolean zContains = str.contains(strTnTj78);
        String strJ = zVar.f16508d;
        if (zContains) {
            strJ = s.j(numX49.tnTj78("bi2H"), strJ, numX49.tnTj78("bi2O"));
        }
        int i4 = zVar.e;
        return (z4 || i4 != z.a(zVar.f16506a)) ? androidx.media3.datasource.cache.c.h(i4, strJ, strTnTj78) : strJ;
    }

    public static String f(String str) {
        int i4 = -1;
        int i6 = 0;
        if (!str.contains(numX49.tnTj78("bi2Q"))) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i6 < lowerCase.length()) {
                    char cCharAt = lowerCase.charAt(i6);
                    if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                        return null;
                    }
                    i6++;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressG = (str.startsWith(numX49.tnTj78("bi2t")) && str.endsWith(numX49.tnTj78("bi2U"))) ? g(1, str.length() - 1, str) : g(0, str.length(), str);
        if (inetAddressG == null) {
            return null;
        }
        byte[] address = inetAddressG.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressG.getHostAddress();
            }
            throw new AssertionError(s.j(numX49.tnTj78("bi2e"), str, numX49.tnTj78("bi28")));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < address.length) {
            int i12 = i10;
            while (i12 < 16 && address[i12] == 0 && address[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i4 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        e eVar = new e();
        while (i6 < address.length) {
            if (i6 == i4) {
                eVar.t(58);
                i6 += i11;
                if (i6 == 16) {
                    eVar.t(58);
                }
            } else {
                if (i6 > 0) {
                    eVar.t(58);
                }
                eVar.D(((address[i6] & 255) << 8) | (address[i6 + 1] & 255));
                i6 += 2;
            }
        }
        return eVar.F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d2, code lost:
    
        if (r7 == 16) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d4, code lost:
    
        if (r8 != (-1)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ee, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress g(int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.c.g(int, int, java.lang.String):java.net.InetAddress");
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static void i(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e7) {
                if (!k(e7)) {
                    throw e7;
                }
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean j(z zVar, z zVar2) {
        return zVar.f16508d.equals(zVar2.f16508d) && zVar.e == zVar2.e && zVar.f16506a.equals(zVar2.f16506a);
    }

    public static boolean k(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains(numX49.tnTj78("bi2K"))) ? false : true;
    }

    public static String[] l(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i4]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i4++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int m(int i4, int i6, String str) {
        while (i4 < i6) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i4;
            }
            i4++;
        }
        return i6;
    }

    public static x n(ArrayList arrayList) {
        L l6 = new L(6);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jf.a aVar = (jf.a) it.next();
            M2.b bVar = M2.b.c;
            String strL = aVar.f17739a.l();
            String strL2 = aVar.f17740b.l();
            bVar.getClass();
            ArrayList arrayList2 = (ArrayList) l6.f11367b;
            arrayList2.add(strL);
            arrayList2.add(strL2.trim());
        }
        return new x(l6);
    }

    public static boolean o(AbstractC1601a abstractC1601a, int i4) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        h hVar = abstractC1601a.f17133a;
        long jE = hVar.e.f() ? hVar.e.e() - jNanoTime : Long.MAX_VALUE;
        hVar.c(Math.min(jE, timeUnit.toNanos(i4)) + jNanoTime);
        try {
            e eVar = new e();
            while (abstractC1601a.a(8192L, eVar) != -1) {
                eVar.E();
            }
            if (jE == Long.MAX_VALUE) {
                hVar.a();
                return true;
            }
            hVar.c(jNanoTime + jE);
            return true;
        } catch (InterruptedIOException unused) {
            if (jE == Long.MAX_VALUE) {
                hVar.a();
                return false;
            }
            hVar.c(jNanoTime + jE);
            return false;
        } catch (Throwable th2) {
            if (jE == Long.MAX_VALUE) {
                hVar.a();
            } else {
                hVar.c(jNanoTime + jE);
            }
            throw th2;
        }
    }

    public static boolean p(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int q(int i4, int i6, String str) {
        for (int i10 = i6 - 1; i10 >= i4; i10--) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10 + 1;
            }
        }
        return i4;
    }
}
