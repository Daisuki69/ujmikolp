package b1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8326a;

    public n(ArrayList arrayList) {
        this.f8326a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        return this.f8326a.equals(((n) ((y) obj)).f8326a);
    }

    public final int hashCode() {
        return this.f8326a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f8326a + "}";
    }
}
