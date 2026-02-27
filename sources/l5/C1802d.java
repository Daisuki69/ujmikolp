package l5;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: renamed from: l5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1802d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeAd f18235b;

    public C1802d(String adUnitId, NativeAd nativeAd) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f18234a = adUnitId;
        this.f18235b = nativeAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1802d)) {
            return false;
        }
        C1802d c1802d = (C1802d) obj;
        return kotlin.jvm.internal.j.b(this.f18234a, c1802d.f18234a) && kotlin.jvm.internal.j.b(this.f18235b, c1802d.f18235b);
    }

    public final int hashCode() {
        return this.f18235b.hashCode() + (this.f18234a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadSuccess(adUnitId=" + this.f18234a + ", ad=" + this.f18235b + ")";
    }
}
