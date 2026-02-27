package b5;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeAd f8536b;

    public o(String id, NativeAd nativeAd) {
        kotlin.jvm.internal.j.g(id, "id");
        this.f8535a = id;
        this.f8536b = nativeAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.j.b(this.f8535a, oVar.f8535a) && kotlin.jvm.internal.j.b(this.f8536b, oVar.f8536b);
    }

    public final int hashCode() {
        int iHashCode = this.f8535a.hashCode() * 31;
        NativeAd nativeAd = this.f8536b;
        return iHashCode + (nativeAd == null ? 0 : nativeAd.hashCode());
    }

    public final String toString() {
        return "VerticalBannerAdItem(id=" + this.f8535a + ", ad=" + this.f8536b + ")";
    }
}
