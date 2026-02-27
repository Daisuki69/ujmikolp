package k2;

/* JADX INFO: renamed from: k2.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1729h0 extends I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17954b;

    public C1729h0(String str, String str2) {
        this.f17953a = str;
        this.f17954b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I0) {
            I0 i02 = (I0) obj;
            if (this.f17953a.equals(((C1729h0) i02).f17953a) && this.f17954b.equals(((C1729h0) i02).f17954b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17953a.hashCode() ^ 1000003) * 1000003) ^ this.f17954b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f17953a);
        sb2.append(", variantId=");
        return We.s.p(sb2, this.f17954b, "}");
    }
}
