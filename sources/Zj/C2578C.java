package zj;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: zj.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C2578C extends C2577B {
    public static char c0(String str) {
        kotlin.jvm.internal.j.g(str, "<this>");
        if (str.length() != 0) {
            return str.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char d0(CharSequence charSequence) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(C2576A.B(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String e0(int i, String str) {
        kotlin.jvm.internal.j.g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(We.s.g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String f0(int i, String str) {
        kotlin.jvm.internal.j.g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(We.s.g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(length - i);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }
}
