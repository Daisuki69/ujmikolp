package W2;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6214a;

    public a(HashSet hashSet) {
        this.f6214a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f6214a.equals(((a) ((b) obj)).f6214a);
    }

    public final int hashCode() {
        return this.f6214a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f6214a + "}";
    }
}
