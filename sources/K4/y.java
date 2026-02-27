package K4;

import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b(MediaRouteProviderProtocol.SERVICE_DATA_ERROR)
    private final C0274e f2641a;

    public y(C0274e c0274e) {
        this.f2641a = c0274e;
    }

    public final C0274e a() {
        return this.f2641a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.j.b(this.f2641a, ((y) obj).f2641a);
    }

    public final int hashCode() {
        C0274e c0274e = this.f2641a;
        if (c0274e == null) {
            return 0;
        }
        return c0274e.hashCode();
    }

    public final String toString() {
        return "RavenError(error=" + this.f2641a + ')';
    }
}
