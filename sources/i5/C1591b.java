package i5;

import b5.C0910b;

/* JADX INFO: renamed from: i5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1591b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0910b f17099a;

    public C1591b(C0910b bannerAd) {
        kotlin.jvm.internal.j.g(bannerAd, "bannerAd");
        this.f17099a = bannerAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1591b) && kotlin.jvm.internal.j.b(this.f17099a, ((C1591b) obj).f17099a);
    }

    public final int hashCode() {
        return this.f17099a.hashCode();
    }

    public final String toString() {
        return "AdLoadSuccess(bannerAd=" + this.f17099a + ")";
    }
}
