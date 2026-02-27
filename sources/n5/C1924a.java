package n5;

import b5.C0916h;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: n5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1924a extends AbstractC1926c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCustomFormatAd f18615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0916h f18616b;

    public C1924a(NativeCustomFormatAd nativeCustomFormatAd, C0916h variables) {
        j.g(variables, "variables");
        this.f18615a = nativeCustomFormatAd;
        this.f18616b = variables;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1924a)) {
            return false;
        }
        C1924a c1924a = (C1924a) obj;
        return j.b(this.f18615a, c1924a.f18615a) && j.b(this.f18616b, c1924a.f18616b);
    }

    public final int hashCode() {
        return this.f18616b.hashCode() + (this.f18615a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoaded(ad=" + this.f18615a + ", variables=" + this.f18616b + ")";
    }
}
