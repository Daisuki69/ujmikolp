package yf;

import We.s;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21274b;

    public n(long j, int i) {
        this.f21273a = j;
        this.f21274b = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        long j = nVar.f21273a;
        long j6 = this.f21273a;
        if (j6 < j) {
            return -1;
        }
        if (j6 > j) {
            return 1;
        }
        int i = this.f21274b;
        int i4 = nVar.f21274b;
        if (i < i4) {
            return -1;
        }
        return i > i4 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        n nVar = obj instanceof n ? (n) obj : null;
        return nVar != null && nVar.f21273a == this.f21273a && nVar.f21274b == this.f21274b;
    }

    public final int hashCode() {
        return Long.valueOf((this.f21273a << 4) + ((long) this.f21274b)).hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21273a);
        sb2.append(Global.BLANK);
        return s.o(sb2, " R", this.f21274b);
    }
}
