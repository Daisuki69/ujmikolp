package k2;

import java.util.List;

/* JADX INFO: renamed from: k2.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1695E extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17844b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17845d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f17846g;
    public final String h;
    public final List i;

    public C1695E(int i, String str, int i4, int i6, long j, long j6, long j7, String str2, List list) {
        this.f17843a = i;
        this.f17844b = str;
        this.c = i4;
        this.f17845d = i6;
        this.e = j;
        this.f = j6;
        this.f17846g = j7;
        this.h = str2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.f17843a == ((C1695E) r0Var).f17843a) {
                C1695E c1695e = (C1695E) r0Var;
                if (this.f17844b.equals(c1695e.f17844b) && this.c == c1695e.c && this.f17845d == c1695e.f17845d && this.e == c1695e.e && this.f == c1695e.f && this.f17846g == c1695e.f17846g) {
                    String str = c1695e.h;
                    String str2 = this.h;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        List list = c1695e.i;
                        List list2 = this.i;
                        if (list2 != null ? list2.equals(list) : list == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f17843a ^ 1000003) * 1000003) ^ this.f17844b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.f17845d) * 1000003;
        long j = this.e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j6 = this.f;
        int i4 = (i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f17846g;
        int i6 = (i4 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        String str = this.h;
        int iHashCode2 = (i6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationExitInfo{pid=");
        sb2.append(this.f17843a);
        sb2.append(", processName=");
        sb2.append(this.f17844b);
        sb2.append(", reasonCode=");
        sb2.append(this.c);
        sb2.append(", importance=");
        sb2.append(this.f17845d);
        sb2.append(", pss=");
        sb2.append(this.e);
        sb2.append(", rss=");
        sb2.append(this.f);
        sb2.append(", timestamp=");
        sb2.append(this.f17846g);
        sb2.append(", traceFile=");
        sb2.append(this.h);
        sb2.append(", buildIdMappingForArch=");
        return We.s.r(sb2, this.i, "}");
    }
}
