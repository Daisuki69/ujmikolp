package r5;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19857a;

    public d(String adUnitId) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f19857a = adUnitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.j.b(this.f19857a, ((d) obj).f19857a);
    }

    public final int hashCode() {
        return this.f19857a.hashCode();
    }

    public final String toString() {
        return s.p(new StringBuilder("AdLoadSuccess(adUnitId="), this.f19857a, ")");
    }
}
