package k2;

/* JADX INFO: renamed from: k2.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1739m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1741n0 f17983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1745p0 f17984b;
    public final C1743o0 c;

    public C1739m0(C1741n0 c1741n0, C1745p0 c1745p0, C1743o0 c1743o0) {
        this.f17983a = c1741n0;
        this.f17984b = c1745p0;
        this.c = c1743o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1739m0) {
            C1739m0 c1739m0 = (C1739m0) obj;
            if (this.f17983a.equals(c1739m0.f17983a) && this.f17984b.equals(c1739m0.f17984b) && this.c.equals(c1739m0.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f17983a.hashCode() ^ 1000003) * 1000003) ^ this.f17984b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f17983a + ", osData=" + this.f17984b + ", deviceData=" + this.c + "}";
    }
}
