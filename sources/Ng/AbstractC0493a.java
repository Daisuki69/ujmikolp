package Ng;

import M8.T2;
import cj.C1110A;
import cj.C1129o;
import cj.C1132s;
import cj.S;
import io.ktor.http.URLDecodeException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import zj.C2581c;

/* JADX INFO: renamed from: Ng.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0493a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f4419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f4420b;
    public static final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f4421d;
    public static final ArrayList e;

    static {
        ArrayList arrayListL = C1110A.L(new kotlin.ranges.b('0', '9'), C1110A.N(new kotlin.ranges.b('a', 'z'), new kotlin.ranges.b('A', 'Z')));
        ArrayList arrayList = new ArrayList(cj.t.l(arrayListL, 10));
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f4419a = C1110A.Z(arrayList);
        f4420b = C1110A.Z(C1110A.L(new kotlin.ranges.b('0', '9'), C1110A.N(new kotlin.ranges.b('a', 'z'), new kotlin.ranges.b('A', 'Z'))));
        C1110A.Z(C1110A.L(new kotlin.ranges.b('0', '9'), C1110A.N(new kotlin.ranges.b('a', 'f'), new kotlin.ranges.b('A', 'F'))));
        Set setC = C1129o.C(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(cj.t.l(setC, 10));
        Iterator it2 = setC.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        c = arrayList2;
        f4421d = C1129o.C(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        S.d(f4420b, C1129o.C(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listG = C1132s.g('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(cj.t.l(listG, 10));
        Iterator it3 = listG.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        e = arrayList3;
    }

    public static final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    public static final String b(String str, int i, int i4, boolean z4) throws URLDecodeException {
        int i6 = i;
        while (i6 < i4) {
            char cCharAt = str.charAt(i6);
            if (cCharAt == '%' || (z4 && cCharAt == '+')) {
                int i10 = i4 - i;
                if (i10 > 255) {
                    i10 /= 3;
                }
                StringBuilder sb2 = new StringBuilder(i10);
                if (i6 > i) {
                    sb2.append((CharSequence) str, i, i6);
                }
                byte[] bArr = null;
                while (i6 < i4) {
                    char cCharAt2 = str.charAt(i6);
                    if (z4 && cCharAt2 == '+') {
                        sb2.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i4 - i6) / 3];
                        }
                        int i11 = 0;
                        while (i6 < i4 && str.charAt(i6) == '%') {
                            int i12 = i6 + 2;
                            if (i12 >= i4) {
                                StringBuilder sb3 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb3.append(str.subSequence(i6, str.length()).toString());
                                sb3.append(", in ");
                                sb3.append((Object) str);
                                throw new URLDecodeException(androidx.camera.core.impl.a.o(sb3, " at ", i6));
                            }
                            int i13 = i6 + 1;
                            int iA = a(str.charAt(i13));
                            int iA2 = a(str.charAt(i12));
                            if (iA == -1 || iA2 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i13) + str.charAt(i12) + ", in " + ((Object) str) + ", at " + i6);
                            }
                            bArr[i11] = (byte) ((iA * 16) + iA2);
                            i6 += 3;
                            i11++;
                        }
                        sb2.append(zj.z.k(0, i11, bArr));
                    } else {
                        sb2.append(cCharAt2);
                    }
                    i6++;
                }
                String string = sb2.toString();
                kotlin.jvm.internal.j.f(string, "toString(...)");
                return string;
            }
            i6++;
        }
        if (i == 0 && i4 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i, i4);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String c(String str) {
        int length = str.length();
        Charset charset = C2581c.f21468b;
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(charset, "charset");
        return b(str, 0, length, false);
    }

    public static String d(int i, int i4, int i6, String str) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i4 = str.length();
        }
        boolean z4 = (i6 & 4) == 0;
        Charset charset = C2581c.f21468b;
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(charset, "charset");
        return b(str, i, i4, z4);
    }

    public static final String e(String str, boolean z4) {
        kotlin.jvm.internal.j.g(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = C2581c.f21468b.newEncoder();
        kotlin.jvm.internal.j.f(charsetEncoderNewEncoder, "newEncoder(...)");
        int length = str.length();
        Mj.a aVar = new Mj.a();
        T2.o(charsetEncoderNewEncoder, aVar, str, 0, length);
        f(aVar, new Nb.c(sb2, z4, 1));
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    public static final void f(Mj.a aVar, Function1 function1) {
        while (!aVar.exhausted()) {
            while (!aVar.exhausted()) {
                function1.invoke(Byte.valueOf(aVar.readByte()));
            }
        }
    }

    public static final String g(byte b8) {
        int i = (b8 & 255) >> 4;
        int i4 = b8 & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i4 < 0 || i4 >= 10) ? ((char) (i4 + 65)) - '\n' : i4 + 48)});
    }
}
