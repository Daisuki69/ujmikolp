package i5;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17100a;

    public c(List ads) {
        kotlin.jvm.internal.j.g(ads, "ads");
        this.f17100a = ads;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && kotlin.jvm.internal.j.b(this.f17100a, ((c) obj).f17100a);
    }

    public final int hashCode() {
        return this.f17100a.hashCode();
    }

    public final String toString() {
        return "BannerLoaded(ads=" + this.f17100a + ")";
    }
}
