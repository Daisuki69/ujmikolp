package r5;

import b5.C0909a;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0909a f19856b;

    public c(String adUnitId, C0909a c0909a) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f19855a = adUnitId;
        this.f19856b = c0909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.j.b(this.f19855a, cVar.f19855a) && kotlin.jvm.internal.j.b(this.f19856b, cVar.f19856b);
    }

    public final int hashCode() {
        return this.f19856b.hashCode() + (this.f19855a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadFailed(adUnitId=" + this.f19855a + ", adKitError=" + this.f19856b + ")";
    }
}
