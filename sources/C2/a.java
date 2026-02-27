package C2;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f669b;
    public final long c;

    public a(String str, long j, long j6) {
        this.f668a = str;
        this.f669b = j;
        this.c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f668a.equals(aVar.f668a) && this.f669b == aVar.f669b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f668a.hashCode() ^ 1000003) * 1000003;
        long j = this.f669b;
        long j6 = this.c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f668a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f669b);
        sb2.append(", tokenCreationTimestamp=");
        return s.h(this.c, "}", sb2);
    }
}
