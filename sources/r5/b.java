package r5;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19854a;

    public b(String adUnitId) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f19854a = adUnitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.j.b(this.f19854a, ((b) obj).f19854a);
    }

    public final int hashCode() {
        return this.f19854a.hashCode();
    }

    public final String toString() {
        return s.p(new StringBuilder("AdImpressionRecorded(adUnitId="), this.f19854a, ")");
    }
}
