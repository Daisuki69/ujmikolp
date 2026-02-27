package b5;

/* JADX INFO: renamed from: b5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0917i extends AbstractC0919k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0909a f8531b;

    public C0917i(String adUnitId, C0909a c0909a) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f8530a = adUnitId;
        this.f8531b = c0909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0917i)) {
            return false;
        }
        C0917i c0917i = (C0917i) obj;
        return kotlin.jvm.internal.j.b(this.f8530a, c0917i.f8530a) && kotlin.jvm.internal.j.b(this.f8531b, c0917i.f8531b);
    }

    public final int hashCode() {
        return this.f8531b.hashCode() + (this.f8530a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(adUnitId=" + this.f8530a + ", error=" + this.f8531b + ")";
    }
}
