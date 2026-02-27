package z2;

import java.util.ArrayList;

/* JADX INFO: renamed from: z2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2551a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21355b;

    public C2551a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f21354a = str;
        this.f21355b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2551a)) {
            return false;
        }
        C2551a c2551a = (C2551a) obj;
        return this.f21354a.equals(c2551a.f21354a) && this.f21355b.equals(c2551a.f21355b);
    }

    public final int hashCode() {
        return ((this.f21354a.hashCode() ^ 1000003) * 1000003) ^ this.f21355b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f21354a + ", usedDates=" + this.f21355b + "}";
    }
}
