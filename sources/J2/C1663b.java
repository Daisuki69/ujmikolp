package j2;

import We.s;

/* JADX INFO: renamed from: j2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1663b extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17673b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17674d;
    public final String e;
    public final long f;

    public C1663b(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f17673b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f17674d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f17673b.equals(((C1663b) nVar).f17673b)) {
                C1663b c1663b = (C1663b) nVar;
                if (this.c.equals(c1663b.c) && this.f17674d.equals(c1663b.f17674d) && this.e.equals(c1663b.e) && this.f == c1663b.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f17673b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f17674d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f17673b);
        sb2.append(", parameterKey=");
        sb2.append(this.c);
        sb2.append(", parameterValue=");
        sb2.append(this.f17674d);
        sb2.append(", variantId=");
        sb2.append(this.e);
        sb2.append(", templateVersion=");
        return s.h(this.f, "}", sb2);
    }
}
