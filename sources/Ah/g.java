package Ah;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f313b = new g(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f314a;

    public g(Object obj) {
        this.f314a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return Objects.equals(this.f314a, ((g) obj).f314a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f314a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f314a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (obj instanceof Qh.f) {
            return "OnErrorNotification[" + ((Qh.f) obj).f5386a + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
