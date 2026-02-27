package ag;

import We.s;
import android.content.pm.PackageInfo;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ag.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0701k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PackageInfo f7211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7212b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0701k)) {
            return false;
        }
        C0701k c0701k = (C0701k) obj;
        return kotlin.jvm.internal.j.b(this.f7211a, c0701k.f7211a) && this.f7212b == c0701k.f7212b;
    }

    public final int hashCode() {
        PackageInfo packageInfo = this.f7211a;
        return this.f7212b + ((packageInfo != null ? packageInfo.hashCode() : 0) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bueq"));
        sb2.append(this.f7211a);
        sb2.append(numX49.tnTj78("buez"));
        return s.o(sb2, numX49.tnTj78("buel"), this.f7212b);
    }
}
