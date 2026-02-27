package ag;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ag.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0699i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApplicationInfo f7207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PackageInfo f7208b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0699i)) {
            return false;
        }
        C0699i c0699i = (C0699i) obj;
        return kotlin.jvm.internal.j.b(this.f7207a, c0699i.f7207a) && kotlin.jvm.internal.j.b(this.f7208b, c0699i.f7208b);
    }

    public final int hashCode() {
        ApplicationInfo applicationInfo = this.f7207a;
        int iHashCode = (applicationInfo != null ? applicationInfo.hashCode() : 0) * 31;
        PackageInfo packageInfo = this.f7208b;
        return iHashCode + (packageInfo != null ? packageInfo.hashCode() : 0);
    }

    public final String toString() {
        return numX49.tnTj78("bueP") + this.f7207a + numX49.tnTj78("bueb") + this.f7208b + numX49.tnTj78("bue2");
    }
}
