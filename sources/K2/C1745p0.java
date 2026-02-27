package k2;

import android.os.Build;

/* JADX INFO: renamed from: k2.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1745p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18000a;

    public C1745p0(boolean z4) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f18000a = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1745p0)) {
            return false;
        }
        C1745p0 c1745p0 = (C1745p0) obj;
        c1745p0.getClass();
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f18000a == c1745p0.f18000a;
    }

    public final int hashCode() {
        return ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.f18000a ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OsData{osRelease=");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", osCodeName=");
        sb2.append(Build.VERSION.CODENAME);
        sb2.append(", isRooted=");
        return We.s.s(sb2, this.f18000a, "}");
    }
}
