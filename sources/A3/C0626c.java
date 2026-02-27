package a3;

import We.s;

/* JADX INFO: renamed from: a3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0626c extends AbstractC0628e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6989b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6990d;
    public final String e;
    public final long f;

    public C0626c(String str, String str2, String str3, String str4, long j) {
        this.f6989b = str;
        this.c = str2;
        this.f6990d = str3;
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0628e) {
            AbstractC0628e abstractC0628e = (AbstractC0628e) obj;
            if (this.f6989b.equals(((C0626c) abstractC0628e).f6989b)) {
                C0626c c0626c = (C0626c) abstractC0628e;
                if (this.c.equals(c0626c.c) && this.f6990d.equals(c0626c.f6990d) && this.e.equals(c0626c.e) && this.f == c0626c.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f6989b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f6990d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f6989b);
        sb2.append(", variantId=");
        sb2.append(this.c);
        sb2.append(", parameterKey=");
        sb2.append(this.f6990d);
        sb2.append(", parameterValue=");
        sb2.append(this.e);
        sb2.append(", templateVersion=");
        return s.h(this.f, "}", sb2);
    }
}
