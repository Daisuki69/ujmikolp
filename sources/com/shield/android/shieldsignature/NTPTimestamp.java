package com.shield.android.shieldsignature;

/* JADX INFO: loaded from: classes4.dex */
public final class NTPTimestamp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15486b;

    public NTPTimestamp(boolean z4, long j) {
        this.f15485a = z4;
        this.f15486b = j;
    }

    public static /* synthetic */ NTPTimestamp copy$default(NTPTimestamp nTPTimestamp, boolean z4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = nTPTimestamp.f15485a;
        }
        if ((i & 2) != 0) {
            j = nTPTimestamp.f15486b;
        }
        return nTPTimestamp.copy(z4, j);
    }

    public final boolean component1() {
        return this.f15485a;
    }

    public final long component2() {
        return this.f15486b;
    }

    public final NTPTimestamp copy(boolean z4, long j) {
        return new NTPTimestamp(z4, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NTPTimestamp)) {
            return false;
        }
        NTPTimestamp nTPTimestamp = (NTPTimestamp) obj;
        return this.f15485a == nTPTimestamp.f15485a && this.f15486b == nTPTimestamp.f15486b;
    }

    public final long getTimestamp() {
        return this.f15486b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z4 = this.f15485a;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        long j = this.f15486b;
        return (r02 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isNTP() {
        return this.f15485a;
    }

    public String toString() {
        return "NTPTimestamp(isNTP=" + this.f15485a + ", timestamp=" + this.f15486b + ')';
    }
}
