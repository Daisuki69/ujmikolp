package Qh;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5386a;

    public f(Throwable th2) {
        this.f5386a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Objects.equals(this.f5386a, ((f) obj).f5386a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5386a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f5386a + "]";
    }
}
