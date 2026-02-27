package r5;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19858a;

    public e(String adUnitId) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f19858a = adUnitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.j.b(this.f19858a, ((e) obj).f19858a);
    }

    public final int hashCode() {
        return this.f19858a.hashCode();
    }

    public final String toString() {
        return s.p(new StringBuilder("AdTapped(adUnitId="), this.f19858a, ")");
    }
}
