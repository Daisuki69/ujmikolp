package b5;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: renamed from: b5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0914f extends AbstractC0915g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCustomFormatAd f8524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0911c f8525b;

    public C0914f(NativeCustomFormatAd nativeCustomFormatAd, AbstractC0911c variables) {
        kotlin.jvm.internal.j.g(variables, "variables");
        this.f8524a = nativeCustomFormatAd;
        this.f8525b = variables;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0914f)) {
            return false;
        }
        C0914f c0914f = (C0914f) obj;
        return kotlin.jvm.internal.j.b(this.f8524a, c0914f.f8524a) && kotlin.jvm.internal.j.b(this.f8525b, c0914f.f8525b);
    }

    public final int hashCode() {
        return this.f8525b.hashCode() + (this.f8524a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(nativeAd=" + this.f8524a + ", variables=" + this.f8525b + ")";
    }
}
