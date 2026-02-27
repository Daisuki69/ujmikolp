package i1;

import java.util.Set;

/* JADX INFO: renamed from: i1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1582b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17070b;
    public final Set c;

    public C1582b(long j, long j6, Set set) {
        this.f17069a = j;
        this.f17070b = j6;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1582b) {
            C1582b c1582b = (C1582b) obj;
            if (this.f17069a == c1582b.f17069a && this.f17070b == c1582b.f17070b && this.c.equals(c1582b.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17069a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.f17070b;
        return ((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f17069a + ", maxAllowedDelay=" + this.f17070b + ", flags=" + this.c + "}";
    }
}
