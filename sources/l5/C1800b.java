package l5;

import We.s;

/* JADX INFO: renamed from: l5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1800b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18231a;

    public C1800b(String adUnitId) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f18231a = adUnitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1800b) && kotlin.jvm.internal.j.b(this.f18231a, ((C1800b) obj).f18231a);
    }

    public final int hashCode() {
        return this.f18231a.hashCode();
    }

    public final String toString() {
        return s.p(new StringBuilder("AdImpressionRecorded(adUnitId="), this.f18231a, ")");
    }
}
