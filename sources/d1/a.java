package d1;

import We.s;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16244b;

    public a(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f16243a = i;
        this.f16244b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC2217b.b(this.f16243a, aVar.f16243a) && this.f16244b == aVar.f16244b;
    }

    public final int hashCode() {
        int iC = (AbstractC2217b.c(this.f16243a) ^ 1000003) * 1000003;
        long j = this.f16244b;
        return iC ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i = this.f16243a;
        sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return s.h(this.f16244b, "}", sb2);
    }
}
