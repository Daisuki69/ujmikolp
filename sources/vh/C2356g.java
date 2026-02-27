package vh;

import java.io.Serializable;

/* JADX INFO: renamed from: vh.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2356g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f20505a;

    public C2356g(Throwable th2) {
        this.f20505a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2356g) {
            return jh.e.a(this.f20505a, ((C2356g) obj).f20505a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20505a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f20505a + "]";
    }
}
