package df;

import defpackage.AbstractC1414e;
import hf.AbstractC1566d;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class v {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f16492k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f16493l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16495b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16496d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16497g;
    public final boolean h;
    public final boolean i;

    public v(String str, String str2, long j6, String str3, String str4, boolean z4, boolean z5, boolean z8, boolean z9) {
        this.f16494a = str;
        this.f16495b = str2;
        this.c = j6;
        this.f16496d = str3;
        this.e = str4;
        this.f = z4;
        this.f16497g = z5;
        this.i = z8;
        this.h = z9;
    }

    public static int a(String str, int i, int i4, boolean z4) {
        while (i < i4) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z4)) {
                return i;
            }
            i++;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df.v.b(int, java.lang.String):long");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.f16494a.equals(this.f16494a) && vVar.f16495b.equals(this.f16495b) && vVar.f16496d.equals(this.f16496d) && vVar.e.equals(this.e) && vVar.c == this.c && vVar.f == this.f && vVar.f16497g == this.f16497g && vVar.h == this.h && vVar.i == this.i;
    }

    public final int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(527, 31, this.f16494a), 31, this.f16495b), 31, this.f16496d), 31, this.e);
        long j6 = this.c;
        return ((((((((iC + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (!this.f ? 1 : 0)) * 31) + (!this.f16497g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16494a);
        sb2.append('=');
        sb2.append(this.f16495b);
        if (this.h) {
            long j6 = this.c;
            if (j6 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(((DateFormat) AbstractC1566d.f17037a.get()).format(new Date(j6)));
            }
        }
        if (!this.i) {
            sb2.append("; domain=");
            sb2.append(this.f16496d);
        }
        sb2.append("; path=");
        sb2.append(this.e);
        if (this.f) {
            sb2.append("; secure");
        }
        if (this.f16497g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }
}
