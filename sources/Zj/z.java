package zj;

import cj.AbstractC1117c;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class z extends y {
    public static String h(String str) {
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.j.f(locale, "getDefault(...)");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(locale);
            kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static String i(char[] cArr, int i, int i4) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int length = cArr.length;
        aVar.getClass();
        AbstractC1117c.a.a(i, i4, length);
        return new String(cArr, i, i4 - i);
    }

    public static String j(byte[] bArr) {
        kotlin.jvm.internal.j.g(bArr, "<this>");
        return new String(bArr, C2581c.f21468b);
    }

    public static String k(int i, int i4, byte[] bArr) {
        kotlin.jvm.internal.j.g(bArr, "<this>");
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int length = bArr.length;
        aVar.getClass();
        AbstractC1117c.a.a(i, i4, length);
        return new String(bArr, i, i4 - i, C2581c.f21468b);
    }

    public static byte[] l(String str) {
        kotlin.jvm.internal.j.g(str, "<this>");
        byte[] bytes = str.getBytes(C2581c.f21468b);
        kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean m(String str, String suffix, boolean z4) {
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(suffix, "suffix");
        return !z4 ? str.endsWith(suffix) : q(str, str.length() - suffix.length(), true, suffix, 0, suffix.length());
    }

    public static /* synthetic */ boolean n(String str, int i, String str2, boolean z4) {
        if ((i & 2) != 0) {
            z4 = false;
        }
        return m(str, str2, z4);
    }

    public static boolean o(String str, String str2, boolean z4) {
        return str == null ? str2 == null : !z4 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static void p(kotlin.jvm.internal.C c) {
        kotlin.jvm.internal.j.g(c, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.j.f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }

    public static boolean q(String str, int i, boolean z4, String other, int i4, int i6) {
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(other, "other");
        return !z4 ? str.regionMatches(i, other, i4, i6) : str.regionMatches(z4, i, other, i4, i6);
    }

    public static String r(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i4 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i6 = 0; i6 < i; i6++) {
                cArr[i6] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i4 == i) {
                    break;
                }
                i4++;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.j.d(string);
        return string;
    }

    public static String s(String str, char c, char c10) {
        kotlin.jvm.internal.j.g(str, "<this>");
        String strReplace = str.replace(c, c10);
        kotlin.jvm.internal.j.f(strReplace, "replace(...)");
        return strReplace;
    }

    public static String t(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(oldValue, "oldValue");
        kotlin.jvm.internal.j.g(newValue, "newValue");
        int iC = C2576A.C(str, oldValue, 0, false);
        if (iC < 0) {
            return str;
        }
        int length = oldValue.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb2.append((CharSequence) str, i4, iC);
            sb2.append(newValue);
            i4 = iC + length;
            if (iC >= str.length()) {
                break;
            }
            iC = C2576A.C(str, oldValue, iC + i, false);
        } while (iC > 0);
        sb2.append((CharSequence) str, i4, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    public static boolean u(String str, int i, String str2, boolean z4) {
        kotlin.jvm.internal.j.g(str, "<this>");
        return !z4 ? str.startsWith(str2, i) : q(str, i, z4, str2, 0, str2.length());
    }

    public static boolean v(String str, String prefix, boolean z4) {
        kotlin.jvm.internal.j.g(str, "<this>");
        kotlin.jvm.internal.j.g(prefix, "prefix");
        return !z4 ? str.startsWith(prefix) : q(str, 0, z4, prefix, 0, prefix.length());
    }

    public static /* synthetic */ boolean w(String str, int i, String str2, boolean z4) {
        if ((i & 2) != 0) {
            z4 = false;
        }
        return v(str, str2, z4);
    }
}
