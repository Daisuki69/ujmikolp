package b5;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: renamed from: b5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0918j extends AbstractC0919k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAd f8532a;

    public C0918j(NativeAd nativeAd) {
        this.f8532a = nativeAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0918j) && kotlin.jvm.internal.j.b(this.f8532a, ((C0918j) obj).f8532a);
    }

    public final int hashCode() {
        return this.f8532a.hashCode();
    }

    public final String toString() {
        return "Success(nativeAd=" + this.f8532a + ")";
    }
}
