package zj;

import cj.C1127m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: zj.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C2576A extends z {
    public static boolean A(String str, CharSequence charSequence) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        return charSequence instanceof String ? z.n((String) charSequence, 2, str, false) : L(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int B(CharSequence charSequence) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int C(CharSequence charSequence, String string, int i, boolean z4) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        kotlin.jvm.internal.j.g(string, "string");
        return (z4 || !(charSequence instanceof String)) ? D(charSequence, string, i, charSequence.length(), z4, false) : ((String) charSequence).indexOf(string, i);
    }

    public static final int D(CharSequence charSequence, CharSequence charSequence2, int i, int i4, boolean z4, boolean z5) {
        kotlin.ranges.c cVarD;
        int i6 = i;
        int i10 = i4;
        if (z5) {
            int iB = B(charSequence);
            if (i6 > iB) {
                i6 = iB;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            cVarD = kotlin.ranges.d.d(i6, i10);
        } else {
            if (i6 < 0) {
                i6 = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            cVarD = new IntRange(i6, i10, 1);
        }
        boolean z8 = charSequence instanceof String;
        int i11 = cVarD.c;
        int i12 = cVarD.f18202b;
        int i13 = cVarD.f18201a;
        if (!z8 || !(charSequence2 instanceof String)) {
            if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
                return -1;
            }
            while (!L(charSequence2, 0, charSequence, i13, charSequence2.length(), z4)) {
                if (i13 == i12) {
                    return -1;
                }
                i13 += i11;
            }
            return i13;
        }
        if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
            return -1;
        }
        int i14 = i13;
        while (true) {
            String str = (String) charSequence2;
            if (z.q(str, 0, z4, (String) charSequence, i14, str.length())) {
                return i14;
            }
            if (i14 == i12) {
                return -1;
            }
            i14 += i11;
        }
    }

    public static int E(CharSequence charSequence, char c, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        return !(charSequence instanceof String) ? G(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i, boolean z4, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return C(charSequence, str, i, z4);
    }

    public static final int G(CharSequence charSequence, char[] cArr, int i, boolean z4) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        if (!z4 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iB = B(charSequence);
        if (i > iB) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (C2580b.c(c, cCharAt, z4)) {
                    return i;
                }
            }
            if (i == iB) {
                return -1;
            }
            i++;
        }
    }

    public static boolean H(CharSequence charSequence) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!C2579a.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int I(String str, char c, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = B(str);
        }
        kotlin.jvm.internal.j.g(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    public static int J(String str, int i, int i4, boolean z4, String string) {
        if ((i4 & 2) != 0) {
            i = B(str);
        }
        int i6 = i;
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        boolean z5 = z4;
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(string, "string");
        return !z5 ? str.lastIndexOf(string, i6) : D(str, string, i6, 0, z5, true);
    }

    public static String K(int i, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.j.g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(We.s.g(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            int length = i - str.length();
            int i4 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean L(CharSequence charSequence, int i, CharSequence other, int i4, int i6, boolean z4) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        kotlin.jvm.internal.j.g(other, "other");
        if (i4 < 0 || i < 0 || i > charSequence.length() - i6 || i4 > other.length() - i6) {
            return false;
        }
        for (int i10 = 0; i10 < i6; i10++) {
            if (!C2580b.c(charSequence.charAt(i + i10), other.charAt(i4 + i10), z4)) {
                return false;
            }
        }
        return true;
    }

    public static String M(String str, String prefix) {
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(prefix, "prefix");
        if (!U(str, prefix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String N(String str, String str2) {
        kotlin.jvm.internal.j.g(str, "<this>");
        if (!A(str2, str)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String O(String str) {
        kotlin.jvm.internal.j.g(str, "<this>");
        if (str.length() < 2 || !U(str, "\"") || !A("\"", str)) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final StringBuilder P(int i, int i4, String str) {
        kotlin.jvm.internal.j.g(str, "<this>");
        if (i4 < i) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.h("End index (", i4, ") is less than start index (", i, ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str, 0, i);
        sb2.append((CharSequence) "");
        sb2.append((CharSequence) str, i4, str.length());
        return sb2;
    }

    public static final void Q(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(We.s.f(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List R(CharSequence charSequence, int i, String str) {
        Q(i);
        int iC = C(charSequence, str, 0, false);
        if (iC == -1 || i == 1) {
            return cj.r.c(charSequence.toString());
        }
        boolean z4 = i > 0;
        int i4 = 10;
        if (z4 && i <= 10) {
            i4 = i;
        }
        ArrayList arrayList = new ArrayList(i4);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iC).toString());
            length = str.length() + iC;
            if (z4 && arrayList.size() == i - 1) {
                break;
            }
            iC = C(charSequence, str, length, false);
        } while (iC != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List S(CharSequence charSequence, char[] cArr) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        if (cArr.length == 1) {
            return R(charSequence, 0, String.valueOf(cArr[0]));
        }
        Q(0);
        Rj.g gVar = new Rj.g(new e(charSequence, 0, new Ag.j(cArr, 26)), 2);
        ArrayList arrayList = new ArrayList(cj.t.l(gVar, 10));
        Iterator it = gVar.iterator();
        while (true) {
            d dVar = (d) it;
            if (!dVar.hasNext()) {
                return arrayList;
            }
            IntRange range = (IntRange) dVar.next();
            kotlin.jvm.internal.j.g(range, "range");
            arrayList.add(charSequence.subSequence(range.f18201a, range.f18202b + 1).toString());
        }
    }

    public static List T(CharSequence charSequence, String[] strArr, int i) {
        int i4 = (i & 4) != 0 ? 0 : 2;
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return R(charSequence, i4, str);
            }
        }
        Q(i4);
        Rj.g gVar = new Rj.g(new e(charSequence, i4, new Ag.j(C1127m.c(strArr), 27)), 2);
        ArrayList arrayList = new ArrayList(cj.t.l(gVar, 10));
        Iterator it = gVar.iterator();
        while (true) {
            d dVar = (d) it;
            if (!dVar.hasNext()) {
                return arrayList;
            }
            IntRange range = (IntRange) dVar.next();
            kotlin.jvm.internal.j.g(range, "range");
            arrayList.add(charSequence.subSequence(range.f18201a, range.f18202b + 1).toString());
        }
    }

    public static boolean U(String str, String prefix) {
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(prefix, "prefix");
        return z.w(str, 2, prefix, false);
    }

    public static String V(String str, String delimiter, String str2) {
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(delimiter, "delimiter");
        int iF = F(str, delimiter, 0, false, 6);
        if (iF == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iF, str.length());
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String W(char c, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(missingDelimiterValue, "missingDelimiterValue");
        int I4 = I(str, c, 0, 6);
        if (I4 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(I4 + 1, str.length());
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Y(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.j.g(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.j.g(missingDelimiterValue, "missingDelimiterValue");
        int iF = F(missingDelimiterValue, str, 0, false, 6);
        if (iF == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iF);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Z(String str) {
        int I4 = I(str, '.', 0, 6);
        if (I4 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, I4);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String a0(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.j.g(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.j.g(missingDelimiterValue, "missingDelimiterValue");
        int iJ = J(missingDelimiterValue, 0, 6, false, str);
        if (iJ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iJ);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence b0(CharSequence charSequence) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean zB = C2579a.b(charSequence.charAt(!z4 ? i : length));
            if (z4) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i++;
            } else {
                z4 = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean x(CharSequence charSequence, CharSequence other, boolean z4) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        kotlin.jvm.internal.j.g(other, "other");
        if (other instanceof String) {
            if (F(charSequence, (String) other, 0, z4, 2) >= 0) {
                return true;
            }
        } else if (D(charSequence, other, 0, charSequence.length(), z4, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean y(CharSequence charSequence, char c) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        return E(charSequence, c, 0, 2) >= 0;
    }

    public static /* synthetic */ boolean z(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i) {
        if ((i & 2) != 0) {
            z4 = false;
        }
        return x(charSequence, charSequence2, z4);
    }
}
