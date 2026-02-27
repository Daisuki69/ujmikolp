package r5;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19859a;

    public f(List ads) {
        kotlin.jvm.internal.j.g(ads, "ads");
        this.f19859a = ads;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.j.b(this.f19859a, ((f) obj).f19859a);
    }

    public final int hashCode() {
        return this.f19859a.hashCode();
    }

    public final String toString() {
        return "BannerLoaded(ads=" + this.f19859a + ")";
    }
}
