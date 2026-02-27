package df;

import com.dynatrace.android.agent.Global;
import com.paymaya.domain.store.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f16501a;

    public x(L l6) {
        ArrayList arrayList = (ArrayList) l6.f11367b;
        this.f16501a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void c(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str};
                byte[] bArr = ef.c.f16663a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
    }

    public static void d(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(We.s.j("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str};
                byte[] bArr = ef.c.f16663a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
            }
        }
    }

    public final L a() {
        L l6 = new L(6);
        Collections.addAll((ArrayList) l6.f11367b, this.f16501a);
        return l6;
    }

    public final String b(int i) {
        return this.f16501a[i * 2];
    }

    public final int e() {
        return this.f16501a.length / 2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && Arrays.equals(((x) obj).f16501a, this.f16501a);
    }

    public final String f(int i) {
        return this.f16501a[(i * 2) + 1];
    }

    public final String g(String str) {
        String[] strArr = this.f16501a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16501a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int iE = e();
        for (int i = 0; i < iE; i++) {
            sb2.append(b(i));
            sb2.append(": ");
            sb2.append(f(i));
            sb2.append(Global.NEWLINE);
        }
        return sb2.toString();
    }

    public x(String[] strArr) {
        this.f16501a = strArr;
    }
}
