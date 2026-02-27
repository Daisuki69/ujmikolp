package k2;

import java.util.List;

/* JADX INFO: renamed from: k2.X, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1713X extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17902b;
    public final List c;

    public C1713X(String str, int i, List list) {
        this.f17901a = str;
        this.f17902b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0) {
            C0 c02 = (C0) obj;
            if (this.f17901a.equals(((C1713X) c02).f17901a)) {
                C1713X c1713x = (C1713X) c02;
                if (this.f17902b == c1713x.f17902b && this.c.equals(c1713x.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f17901a.hashCode() ^ 1000003) * 1000003) ^ this.f17902b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Thread{name=");
        sb2.append(this.f17901a);
        sb2.append(", importance=");
        sb2.append(this.f17902b);
        sb2.append(", frames=");
        return We.s.r(sb2, this.c, "}");
    }
}
