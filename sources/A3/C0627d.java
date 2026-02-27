package a3;

import java.util.HashSet;

/* JADX INFO: renamed from: a3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0627d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6991a;

    public C0627d(HashSet hashSet) {
        this.f6991a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0627d)) {
            return false;
        }
        return this.f6991a.equals(((C0627d) obj).f6991a);
    }

    public final int hashCode() {
        return this.f6991a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f6991a + "}";
    }
}
