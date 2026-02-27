package k2;

import e2.C1421c;

/* JADX INFO: renamed from: k2.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1741n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17989b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17990d;
    public final int e;
    public final C1421c f;

    public C1741n0(String str, String str2, String str3, String str4, int i, C1421c c1421c) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f17988a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f17989b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f17990d = str4;
        this.e = i;
        this.f = c1421c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1741n0)) {
            return false;
        }
        C1741n0 c1741n0 = (C1741n0) obj;
        return this.f17988a.equals(c1741n0.f17988a) && this.f17989b.equals(c1741n0.f17989b) && this.c.equals(c1741n0.c) && this.f17990d.equals(c1741n0.f17990d) && this.e == c1741n0.e && this.f.equals(c1741n0.f);
    }

    public final int hashCode() {
        return ((((((((((this.f17988a.hashCode() ^ 1000003) * 1000003) ^ this.f17989b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f17990d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f17988a + ", versionCode=" + this.f17989b + ", versionName=" + this.c + ", installUuid=" + this.f17990d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
