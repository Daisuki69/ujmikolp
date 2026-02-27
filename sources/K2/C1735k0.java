package k2;

/* JADX INFO: renamed from: k2.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1735k0 extends M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17974b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17975d;

    public C1735k0(String str, int i, String str2, boolean z4) {
        this.f17973a = i;
        this.f17974b = str;
        this.c = str2;
        this.f17975d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M0) {
            M0 m0 = (M0) obj;
            if (this.f17973a == ((C1735k0) m0).f17973a) {
                C1735k0 c1735k0 = (C1735k0) m0;
                if (this.f17974b.equals(c1735k0.f17974b) && this.c.equals(c1735k0.c) && this.f17975d == c1735k0.f17975d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f17973a ^ 1000003) * 1000003) ^ this.f17974b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.f17975d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f17973a);
        sb2.append(", version=");
        sb2.append(this.f17974b);
        sb2.append(", buildVersion=");
        sb2.append(this.c);
        sb2.append(", jailbroken=");
        return We.s.s(sb2, this.f17975d, "}");
    }
}
