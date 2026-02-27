package ck;

import We.s;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9397b;
    public long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9396a == aVar.f9396a && this.f9397b == aVar.f9397b && this.c == aVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        boolean z4 = this.f9396a;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        long j = this.f9397b;
        long j6 = this.c;
        return (((((((r02 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + 1) * 31) + 1) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bPzL"));
        sb2.append(this.f9396a);
        sb2.append(numX49.tnTj78("bPzr"));
        sb2.append(this.f9397b);
        sb2.append(numX49.tnTj78("bPzZ"));
        return s.h(this.c, numX49.tnTj78("bPzk"), sb2);
    }
}
