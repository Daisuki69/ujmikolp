package Ng;

import cj.C1110A;
import cj.C1112C;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.ktor.http.URLParserException;
import java.util.Collection;
import java.util.List;
import zj.C2576A;
import zj.C2579a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f4407a = cj.r.c("");

    public static final int a(int i, int i4, String str) {
        boolean z4 = false;
        while (i < i4) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z4 = true;
                } else if (cCharAt == ']') {
                    z4 = false;
                }
            } else if (!z4) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void b(A a8, String str) {
        kotlin.jvm.internal.j.g(a8, "<this>");
        if (C2576A.H(str)) {
            return;
        }
        try {
            c(a8, str);
        } catch (Throwable th2) {
            throw new URLParserException("Fail to parse url: ".concat(str), th2);
        }
    }

    public static final void c(A a8, String str) {
        int i;
        int i4;
        int i6;
        int i10;
        int i11;
        int i12;
        List listS;
        int iIntValue;
        int i13;
        int i14 = 1;
        kotlin.jvm.internal.j.g(a8, "<this>");
        int length = str.length();
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                i15 = -1;
                break;
            } else if (!C2579a.b(str.charAt(i15))) {
                break;
            } else {
                i15++;
            }
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i16 = length2 - 1;
                if (!C2579a.b(str.charAt(length2))) {
                    break;
                } else if (i16 < 0) {
                    break;
                } else {
                    length2 = i16;
                }
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int i17 = length2 + 1;
        char cCharAt = str.charAt(i15);
        char c = 'A';
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i = i15;
            i4 = i;
        } else {
            i4 = -1;
            i = i15;
        }
        while (true) {
            i6 = i14;
            if (i >= i17) {
                break;
            }
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == ':') {
                if (i4 != -1) {
                    throw new IllegalArgumentException(We.s.f(i4, "Illegal character in scheme at position "));
                }
                i10 = i - i15;
            } else {
                if (cCharAt2 == '#' || cCharAt2 == '/' || cCharAt2 == '?') {
                    break;
                }
                if (i4 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                    i4 = i;
                }
                i++;
                i14 = i6;
            }
        }
        i10 = -1;
        if (i10 > 0) {
            String strSubstring = str.substring(i15, i15 + i10);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            C c10 = C.c;
            int length3 = strSubstring.length();
            int i18 = 0;
            while (true) {
                if (i18 >= length3) {
                    i18 = -1;
                    break;
                }
                char cCharAt3 = strSubstring.charAt(i18);
                if ((('A' > cCharAt3 || cCharAt3 >= '[') ? (cCharAt3 < 0 || cCharAt3 >= 128) ? Character.toLowerCase(cCharAt3) : cCharAt3 : (char) (cCharAt3 + ' ')) != cCharAt3) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 != -1) {
                StringBuilder sb2 = new StringBuilder(strSubstring.length());
                sb2.append((CharSequence) strSubstring, 0, i18);
                int iB = C2576A.B(strSubstring);
                if (i18 <= iB) {
                    while (true) {
                        char cCharAt4 = strSubstring.charAt(i18);
                        if (c <= cCharAt4 && cCharAt4 < '[') {
                            cCharAt4 = (char) (cCharAt4 + ' ');
                        } else if (cCharAt4 < 0 || cCharAt4 >= 128) {
                            cCharAt4 = Character.toLowerCase(cCharAt4);
                        }
                        sb2.append(cCharAt4);
                        if (i18 == iB) {
                            break;
                        }
                        i18++;
                        c = 'A';
                    }
                }
                strSubstring = sb2.toString();
                kotlin.jvm.internal.j.f(strSubstring, "toString(...)");
            }
            C c11 = (C) C.e.get(strSubstring);
            if (c11 == null) {
                c11 = new C(strSubstring, 0);
            }
            a8.f4405d = c11;
            i15 += i10 + 1;
        }
        int i19 = 0;
        while (true) {
            i11 = i15 + i19;
            if (i11 >= i17 || str.charAt(i11) != '/') {
                break;
            } else {
                i19++;
            }
        }
        if (a8.c().f4409a.equals(Constants.FILE)) {
            if (i19 != 2) {
                if (i19 != 3) {
                    throw new IllegalArgumentException("Invalid file url: ".concat(str));
                }
                a8.f4403a = "";
                String strSubstring2 = str.substring(i11, i17);
                kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                Xh.i.C(a8, "/".concat(strSubstring2));
                return;
            }
            int iE = C2576A.E(str, '/', i11, 4);
            if (iE == -1 || iE == i17) {
                String strSubstring3 = str.substring(i11, i17);
                kotlin.jvm.internal.j.f(strSubstring3, "substring(...)");
                a8.f4403a = strSubstring3;
                return;
            } else {
                String strSubstring4 = str.substring(i11, iE);
                kotlin.jvm.internal.j.f(strSubstring4, "substring(...)");
                a8.f4403a = strSubstring4;
                String strSubstring5 = str.substring(iE, i17);
                kotlin.jvm.internal.j.f(strSubstring5, "substring(...)");
                Xh.i.C(a8, strSubstring5);
                return;
            }
        }
        if (a8.c().f4409a.equals("mailto")) {
            if (i19 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int iF = C2576A.F(str, "@", i11, false, 4);
            if (iF == -1) {
                throw new IllegalArgumentException(We.s.j("Invalid mailto url: ", str, ", it should contain '@'."));
            }
            String strSubstring6 = str.substring(i11, iF);
            kotlin.jvm.internal.j.f(strSubstring6, "substring(...)");
            String strC = AbstractC0493a.c(strSubstring6);
            a8.e = strC != null ? AbstractC0493a.e(strC, false) : null;
            String strSubstring7 = str.substring(iF + 1, i17);
            kotlin.jvm.internal.j.f(strSubstring7, "substring(...)");
            a8.f4403a = strSubstring7;
            return;
        }
        if (a8.c().f4409a.equals("about")) {
            if (i19 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring8 = str.substring(i11, i17);
            kotlin.jvm.internal.j.f(strSubstring8, "substring(...)");
            a8.f4403a = strSubstring8;
            return;
        }
        if (i19 >= 2) {
            while (true) {
                int iG = C2576A.G(str, S1.r.z("@/\\?#"), i11, false);
                Integer numValueOf = Integer.valueOf(iG);
                if (iG <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i17;
                if (iIntValue >= i17 || str.charAt(iIntValue) != '@') {
                    break;
                }
                int iA = a(i11, iIntValue, str);
                if (iA != -1) {
                    String strSubstring9 = str.substring(i11, iA);
                    kotlin.jvm.internal.j.f(strSubstring9, "substring(...)");
                    a8.e = strSubstring9;
                    String strSubstring10 = str.substring(iA + 1, iIntValue);
                    kotlin.jvm.internal.j.f(strSubstring10, "substring(...)");
                    a8.f = strSubstring10;
                } else {
                    String strSubstring11 = str.substring(i11, iIntValue);
                    kotlin.jvm.internal.j.f(strSubstring11, "substring(...)");
                    a8.e = strSubstring11;
                }
                i11 = iIntValue + 1;
            }
            int iA2 = a(i11, iIntValue, str);
            Integer numValueOf2 = Integer.valueOf(iA2);
            if (iA2 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
            String strSubstring12 = str.substring(i11, iIntValue2);
            kotlin.jvm.internal.j.f(strSubstring12, "substring(...)");
            a8.f4403a = strSubstring12;
            int i20 = iIntValue2 + 1;
            if (i20 < iIntValue) {
                String strSubstring13 = str.substring(i20, iIntValue);
                kotlin.jvm.internal.j.f(strSubstring13, "substring(...)");
                i13 = Integer.parseInt(strSubstring13);
            } else {
                i13 = 0;
            }
            a8.e(i13);
            i11 = iIntValue;
        }
        List list = f4407a;
        if (i11 >= i17) {
            if (str.charAt(length2) != '/') {
                list = C1112C.f9377a;
            }
            a8.d(list);
            return;
        }
        a8.d(i19 == 0 ? C1110A.x(a8.h) : C1112C.f9377a);
        int iG2 = C2576A.G(str, S1.r.z("?#"), i11, false);
        Integer numValueOf3 = Integer.valueOf(iG2);
        if (iG2 <= 0) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i17;
        if (iIntValue3 > i11) {
            String strSubstring14 = str.substring(i11, iIntValue3);
            kotlin.jvm.internal.j.f(strSubstring14, "substring(...)");
            Collection collection = (a8.h.size() == i6 && ((CharSequence) C1110A.A(a8.h)).length() == 0) ? C1112C.f9377a : a8.h;
            if (strSubstring14.equals("/")) {
                listS = list;
                i12 = 1;
            } else {
                i12 = 1;
                listS = C2576A.S(strSubstring14, new char[]{'/'});
            }
            if (i19 != i12) {
                list = C1112C.f9377a;
            }
            a8.h = C1110A.L(C1110A.L(listS, list), collection);
            i11 = iIntValue3;
        }
        if (i11 < i17 && str.charAt(i11) == '?') {
            int i21 = i11 + 1;
            if (i21 == i17) {
                a8.f4404b = true;
                i11 = i17;
            } else {
                int iE2 = C2576A.E(str, '#', i21, 4);
                Integer numValueOf4 = iE2 > 0 ? Integer.valueOf(iE2) : null;
                int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i17;
                String strSubstring15 = str.substring(i21, iIntValue4);
                kotlin.jvm.internal.j.f(strSubstring15, "substring(...)");
                X5.f.x(strSubstring15).b(new Ag.j(a8, 11));
                i11 = iIntValue4;
            }
        }
        if (i11 >= i17 || str.charAt(i11) != '#') {
            return;
        }
        String strSubstring16 = str.substring(i11 + 1, i17);
        kotlin.jvm.internal.j.f(strSubstring16, "substring(...)");
        a8.f4406g = strSubstring16;
    }
}
