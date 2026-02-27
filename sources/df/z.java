package df;

import androidx.webkit.ProxyConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class z {
    public static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16507b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16508d;
    public final int e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16509g;
    public final String h;

    public z(y yVar) {
        this.f16506a = yVar.f16502a;
        String str = yVar.f16503b;
        this.f16507b = d(str, 0, str.length(), false);
        String str2 = yVar.c;
        this.c = d(str2, 0, str2.length(), false);
        this.f16508d = yVar.f16504d;
        int i4 = yVar.e;
        this.e = i4 == -1 ? a(yVar.f16502a) : i4;
        e(yVar.f, false);
        ArrayList arrayList = yVar.f16505g;
        this.f = arrayList != null ? e(arrayList, true) : null;
        String str3 = yVar.h;
        this.f16509g = str3 != null ? d(str3, 0, str3.length(), false) : null;
        this.h = yVar.toString();
    }

    public static int a(String str) {
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1;
    }

    public static String c(String str, int i4, int i6, String str2, boolean z4, boolean z5, boolean z8, boolean z9) {
        int iCharCount = i4;
        while (iCharCount < i6) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z9) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z4 || (z5 && !f(iCharCount, i6, str)))) || (iCodePointAt == 43 && z8)))) {
                of.e eVar = new of.e();
                eVar.f(i4, iCharCount, str);
                of.e eVar2 = null;
                while (iCharCount < i6) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z4 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z8) {
                            String str3 = z4 ? "+" : "%2B";
                            eVar.f(0, str3.length(), str3);
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z9) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z4 || (z5 && !f(iCharCount, i6, str)))))) {
                            if (eVar2 == null) {
                                eVar2 = new of.e();
                            }
                            eVar2.B(iCodePointAt2);
                            while (!eVar2.w()) {
                                byte b8 = eVar2.readByte();
                                eVar.t(37);
                                char[] cArr = i;
                                eVar.t(cArr[((b8 & 255) >> 4) & 15]);
                                eVar.t(cArr[b8 & 15]);
                            }
                        } else {
                            eVar.B(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return eVar.F();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(java.lang.String r8, int r9, int r10, boolean r11) {
        /*
            r0 = r9
        L1:
            if (r0 >= r10) goto L60
            char r1 = r8.charAt(r0)
            r2 = 43
            r3 = 37
            if (r1 == r3) goto L15
            if (r1 != r2) goto L12
            if (r11 == 0) goto L12
            goto L15
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            of.e r1 = new of.e
            r1.<init>()
            r1.f(r9, r0, r8)
        L1d:
            if (r0 >= r10) goto L5b
            int r9 = r8.codePointAt(r0)
            if (r9 != r3) goto L48
            int r4 = r0 + 2
            if (r4 >= r10) goto L48
            int r5 = r0 + 1
            char r5 = r8.charAt(r5)
            int r5 = ef.c.a(r5)
            char r6 = r8.charAt(r4)
            int r6 = ef.c.a(r6)
            r7 = -1
            if (r5 == r7) goto L52
            if (r6 == r7) goto L52
            int r0 = r5 << 4
            int r0 = r0 + r6
            r1.t(r0)
            r0 = r4
            goto L55
        L48:
            if (r9 != r2) goto L52
            if (r11 == 0) goto L52
            r4 = 32
            r1.t(r4)
            goto L55
        L52:
            r1.B(r9)
        L55:
            int r9 = java.lang.Character.charCount(r9)
            int r0 = r0 + r9
            goto L1d
        L5b:
            java.lang.String r8 = r1.F()
            return r8
        L60:
            java.lang.String r8 = r8.substring(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: df.z.d(java.lang.String, int, int, boolean):java.lang.String");
    }

    public static List e(ArrayList arrayList, boolean z4) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            String str = (String) arrayList.get(i4);
            arrayList2.add(str != null ? d(str, 0, str.length(), z4) : null);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean f(int i4, int i6, String str) {
        int i10 = i4 + 2;
        return i10 < i6 && str.charAt(i4) == '%' && ef.c.a(str.charAt(i4 + 1)) != -1 && ef.c.a(str.charAt(i10)) != -1;
    }

    public static ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 <= str.length()) {
            int iIndexOf = str.indexOf(38, i4);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i4);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i4, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i4, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i4 = iIndexOf + 1;
        }
        return arrayList;
    }

    public final String b() {
        if (this.c.isEmpty()) {
            return "";
        }
        int length = this.f16506a.length() + 3;
        String str = this.h;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && ((z) obj).h.equals(this.h);
    }

    public final ArrayList h() {
        int length = this.f16506a.length() + 3;
        String str = this.h;
        int iIndexOf = str.indexOf(47, length);
        int iB = ef.c.b(iIndexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iB) {
            int i4 = iIndexOf + 1;
            int iD = ef.c.d(str, '/', i4, iB);
            arrayList.add(str.substring(i4, iD));
            iIndexOf = iD;
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String i() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, ef.c.d(str, '#', iIndexOf, str.length()));
    }

    public final String j() {
        if (this.f16507b.isEmpty()) {
            return "";
        }
        int length = this.f16506a.length() + 3;
        String str = this.h;
        return str.substring(length, ef.c.b(length, str.length(), str, ":@"));
    }

    public final URI k() {
        y yVar = new y();
        String str = this.f16506a;
        yVar.f16502a = str;
        yVar.f16503b = j();
        yVar.c = b();
        yVar.f16504d = this.f16508d;
        int iA = a(str);
        int i4 = this.e;
        if (i4 == iA) {
            i4 = -1;
        }
        yVar.e = i4;
        ArrayList arrayList = yVar.f;
        arrayList.clear();
        arrayList.addAll(h());
        String strI = i();
        String strSubstring = null;
        yVar.f16505g = strI != null ? g(c(strI, 0, strI.length(), HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
        if (this.f16509g != null) {
            String str2 = this.h;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        yVar.h = strSubstring;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            String str3 = (String) arrayList.get(i6);
            arrayList.set(i6, c(str3, 0, str3.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = yVar.f16505g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str4 = (String) yVar.f16505g.get(i10);
                if (str4 != null) {
                    yVar.f16505g.set(i10, c(str4, 0, str4.length(), HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                }
            }
        }
        String str5 = yVar.h;
        if (str5 != null) {
            yVar.h = c(str5, 0, str5.length(), HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
        }
        String string = yVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.h;
    }
}
