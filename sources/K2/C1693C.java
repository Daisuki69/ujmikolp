package k2;

/* JADX INFO: renamed from: k2.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1693C extends P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17834b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17835d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17836g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1701K f17837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1698H f17838l;
    public final C1695E m;

    public C1693C(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, C1701K c1701k, C1698H c1698h, C1695E c1695e) {
        this.f17834b = str;
        this.c = str2;
        this.f17835d = i;
        this.e = str3;
        this.f = str4;
        this.f17836g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.f17837k = c1701k;
        this.f17838l = c1698h;
        this.m = c1695e;
    }

    public final C1692B a() {
        C1692B c1692b = new C1692B();
        c1692b.f17828a = this.f17834b;
        c1692b.f17829b = this.c;
        c1692b.c = this.f17835d;
        c1692b.f17830d = this.e;
        c1692b.e = this.f;
        c1692b.f = this.f17836g;
        c1692b.f17831g = this.h;
        c1692b.h = this.i;
        c1692b.i = this.j;
        c1692b.j = this.f17837k;
        c1692b.f17832k = this.f17838l;
        c1692b.f17833l = this.m;
        c1692b.m = (byte) 1;
        return c1692b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        C1693C c1693c = (C1693C) ((P0) obj);
        if (!this.f17834b.equals(c1693c.f17834b)) {
            return false;
        }
        if (!this.c.equals(c1693c.c) || this.f17835d != c1693c.f17835d || !this.e.equals(c1693c.e)) {
            return false;
        }
        String str = c1693c.f;
        String str2 = this.f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = c1693c.f17836g;
        String str4 = this.f17836g;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c1693c.h;
        String str6 = this.h;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (!this.i.equals(c1693c.i) || !this.j.equals(c1693c.j)) {
            return false;
        }
        C1701K c1701k = c1693c.f17837k;
        C1701K c1701k2 = this.f17837k;
        if (c1701k2 == null) {
            if (c1701k != null) {
                return false;
            }
        } else if (!c1701k2.equals(c1701k)) {
            return false;
        }
        C1698H c1698h = c1693c.f17838l;
        C1698H c1698h2 = this.f17838l;
        if (c1698h2 == null) {
            if (c1698h != null) {
                return false;
            }
        } else if (!c1698h2.equals(c1698h)) {
            return false;
        }
        C1695E c1695e = c1693c.m;
        C1695E c1695e2 = this.m;
        return c1695e2 == null ? c1695e == null : c1695e2.equals(c1695e);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f17834b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f17835d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f17836g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        C1701K c1701k = this.f17837k;
        int iHashCode5 = (iHashCode4 ^ (c1701k == null ? 0 : c1701k.hashCode())) * 1000003;
        C1698H c1698h = this.f17838l;
        int iHashCode6 = (iHashCode5 ^ (c1698h == null ? 0 : c1698h.hashCode())) * 1000003;
        C1695E c1695e = this.m;
        return iHashCode6 ^ (c1695e != null ? c1695e.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f17834b + ", gmpAppId=" + this.c + ", platform=" + this.f17835d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.f17836g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.f17837k + ", ndkPayload=" + this.f17838l + ", appExitInfo=" + this.m + "}";
    }
}
