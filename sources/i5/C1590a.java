package i5;

import b5.C0909a;

/* JADX INFO: renamed from: i5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1590a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0909a f17098b;

    public C1590a(String adUnitId, C0909a c0909a) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f17097a = adUnitId;
        this.f17098b = c0909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1590a)) {
            return false;
        }
        C1590a c1590a = (C1590a) obj;
        return kotlin.jvm.internal.j.b(this.f17097a, c1590a.f17097a) && kotlin.jvm.internal.j.b(this.f17098b, c1590a.f17098b);
    }

    public final int hashCode() {
        return this.f17098b.hashCode() + (this.f17097a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadFailed(adUnitId=" + this.f17097a + ", adKitError=" + this.f17098b + ")";
    }
}
