package Ke;

import android.os.Build;
import cj.C1110A;
import com.dynatrace.android.agent.Global;
import java.util.Locale;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.k;
import zj.n;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f2649a = new o("(0|[1-9]\\d*)(?:\\.(0|[1-9]\\d*))?(?:\\.(0|[1-9]\\d*))?");

    public static final String a(String str) {
        String strValueOf;
        j.g(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : C1110A.W(C2576A.T(str, new String[]{Global.BLANK}, 6))) {
            Locale locale = Locale.getDefault();
            j.f(locale, "getDefault(...)");
            String lowerCase = str2.toLowerCase(locale);
            j.f(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() > 0) {
                StringBuilder sb3 = new StringBuilder();
                char cCharAt = lowerCase.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale2 = Locale.getDefault();
                    j.f(locale2, "getDefault(...)");
                    String strValueOf2 = String.valueOf(cCharAt);
                    j.e(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                    strValueOf = strValueOf2.toUpperCase(locale2);
                    j.f(strValueOf, "toUpperCase(...)");
                    if (strValueOf.length() <= 1) {
                        String strValueOf3 = String.valueOf(cCharAt);
                        j.e(strValueOf3, "null cannot be cast to non-null type java.lang.String");
                        String upperCase = strValueOf3.toUpperCase(Locale.ROOT);
                        j.f(upperCase, "toUpperCase(...)");
                        if (strValueOf.equals(upperCase)) {
                            strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                        }
                    } else if (cCharAt != 329) {
                        char cCharAt2 = strValueOf.charAt(0);
                        String strSubstring = strValueOf.substring(1);
                        j.f(strSubstring, "substring(...)");
                        String lowerCase2 = strSubstring.toLowerCase(Locale.ROOT);
                        j.f(lowerCase2, "toLowerCase(...)");
                        strValueOf = cCharAt2 + lowerCase2;
                    }
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb3.append((Object) strValueOf);
                String strSubstring2 = lowerCase.substring(1);
                j.f(strSubstring2, "substring(...)");
                sb3.append(strSubstring2);
                lowerCase = sb3.toString();
            }
            sb2.append(lowerCase + Global.BLANK);
        }
        String string = sb2.toString();
        j.f(string, "toString(...)");
        return string;
    }

    public static final String b(String str) {
        j.g(str, "<this>");
        return C2576A.b0(z.t(str, "•", "")).toString();
    }

    public static final String c() {
        n nVarB = f2649a.b("2.153.0");
        return nVarB != null ? nVarB.getValue() : "2.153.0";
    }

    public static String d(String str) {
        j.g(str, "<this>");
        return new o("₱[0-9,]+(?:\\.[0-9]{1,2})?").f("₱X.XX", str);
    }

    public static final String e() {
        String str = Build.VERSION.RELEASE;
        j.g(str, "<this>");
        n nVarD = f2649a.d(str);
        if (nVarD == null) {
            return str;
        }
        String str2 = (String) ((k) nVarD.a()).get(1);
        CharSequence charSequence = (CharSequence) ((k) nVarD.a()).get(2);
        if (charSequence.length() == 0) {
            charSequence = "0";
        }
        String str3 = (String) charSequence;
        CharSequence charSequence2 = (CharSequence) ((k) nVarD.a()).get(3);
        return str2 + "." + str3 + "." + ((String) (charSequence2.length() != 0 ? charSequence2 : "0"));
    }
}
