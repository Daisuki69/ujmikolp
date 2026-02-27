package b5;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: renamed from: b5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0912d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeCustomFormatAd f8521b;
    public final C0910b c;

    public C0912d(String id, NativeCustomFormatAd nativeCustomFormatAd, C0910b c0910b) {
        kotlin.jvm.internal.j.g(id, "id");
        this.f8520a = id;
        this.f8521b = nativeCustomFormatAd;
        this.c = c0910b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0912d)) {
            return false;
        }
        C0912d c0912d = (C0912d) obj;
        return kotlin.jvm.internal.j.b(this.f8520a, c0912d.f8520a) && kotlin.jvm.internal.j.b(this.f8521b, c0912d.f8521b) && kotlin.jvm.internal.j.b(this.c, c0912d.c);
    }

    public final int hashCode() {
        int iHashCode = this.f8520a.hashCode() * 31;
        NativeCustomFormatAd nativeCustomFormatAd = this.f8521b;
        int iHashCode2 = (iHashCode + (nativeCustomFormatAd == null ? 0 : nativeCustomFormatAd.hashCode())) * 31;
        C0910b c0910b = this.c;
        return iHashCode2 + (c0910b != null ? c0910b.hashCode() : 0);
    }

    public final String toString() {
        return "CarouselAdItem(id=" + this.f8520a + ", ad=" + this.f8521b + ", variables=" + this.c + ")";
    }
}
