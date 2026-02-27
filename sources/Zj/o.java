package zj;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zc.C2556a;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21491b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f21492a;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public o(String pattern) {
        kotlin.jvm.internal.j.g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.j.f(patternCompile, "compile(...)");
        this.f21492a = patternCompile;
    }

    public static yj.i c(String input, o oVar) {
        kotlin.jvm.internal.j.g(input, "input");
        if (input.length() >= 0) {
            return new yj.i(new C2556a(1, oVar, input), p.f21493a);
        }
        StringBuilder sbT = We.s.t(0, "Start index out of bounds: ", ", input length: ");
        sbT.append(input.length());
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final boolean a(String input) {
        kotlin.jvm.internal.j.g(input, "input");
        return this.f21492a.matcher(input).find();
    }

    public final n b(String input) {
        kotlin.jvm.internal.j.g(input, "input");
        Matcher matcher = this.f21492a.matcher(input);
        kotlin.jvm.internal.j.f(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new n(matcher, input);
        }
        return null;
    }

    public final n d(String input) {
        kotlin.jvm.internal.j.g(input, "input");
        Matcher matcher = this.f21492a.matcher(input);
        kotlin.jvm.internal.j.f(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new n(matcher, input);
        }
        return null;
    }

    public final boolean e(CharSequence input) {
        kotlin.jvm.internal.j.g(input, "input");
        return this.f21492a.matcher(input).matches();
    }

    public final String f(String replacement, CharSequence input) {
        kotlin.jvm.internal.j.g(input, "input");
        kotlin.jvm.internal.j.g(replacement, "replacement");
        String strReplaceAll = this.f21492a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.j.f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String g(String str, Function1 function1) {
        n nVarB = b(str);
        if (nVarB == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i = 0;
        do {
            sb2.append((CharSequence) str, i, nVarB.b().f18201a);
            sb2.append((CharSequence) function1.invoke(nVarB));
            i = nVarB.b().f18202b + 1;
            nVarB = nVarB.next();
            if (i >= length) {
                break;
            }
        } while (nVarB != null);
        if (i < length) {
            sb2.append((CharSequence) str, i, length);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    public final String h(String input, String replacement) {
        kotlin.jvm.internal.j.g(input, "input");
        kotlin.jvm.internal.j.g(replacement, "replacement");
        String strReplaceFirst = this.f21492a.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.j.f(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List i(int i, String input) {
        kotlin.jvm.internal.j.g(input, "input");
        C2576A.Q(i);
        Matcher matcher = this.f21492a.matcher(input);
        if (i == 1 || !matcher.find()) {
            return cj.r.c(input.toString());
        }
        int i4 = 10;
        if (i > 0 && i <= 10) {
            i4 = i;
        }
        ArrayList arrayList = new ArrayList(i4);
        int i6 = i - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i6 >= 0 && arrayList.size() == i6) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f21492a.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    public o(String pattern, q option) {
        kotlin.jvm.internal.j.g(pattern, "pattern");
        kotlin.jvm.internal.j.g(option, "option");
        f21491b.getClass();
        int i = option.f21495a;
        Pattern patternCompile = Pattern.compile(pattern, (i & 2) != 0 ? i | 64 : i);
        kotlin.jvm.internal.j.f(patternCompile, "compile(...)");
        this.f21492a = patternCompile;
    }
}
