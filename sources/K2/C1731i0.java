package k2;

import java.util.List;

/* JADX INFO: renamed from: k2.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1731i0 extends K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17959a;

    public C1731i0(List list) {
        this.f17959a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        return this.f17959a.equals(((C1731i0) ((K0) obj)).f17959a);
    }

    public final int hashCode() {
        return this.f17959a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return We.s.r(new StringBuilder("RolloutsState{rolloutAssignments="), this.f17959a, "}");
    }
}
