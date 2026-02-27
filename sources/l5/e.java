package l5;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18236a;

    public e(String adUnitId) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f18236a = adUnitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.j.b(this.f18236a, ((e) obj).f18236a);
    }

    public final int hashCode() {
        return this.f18236a.hashCode();
    }

    public final String toString() {
        return s.p(new StringBuilder("AdTapped(adUnitId="), this.f18236a, ")");
    }
}
