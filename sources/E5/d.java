package e5;

import We.s;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("timestamp")
    private final String f16607a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.b(this.f16607a, ((d) obj).f16607a);
    }

    public final int hashCode() {
        return this.f16607a.hashCode();
    }

    public final String toString() {
        return s.j("UserTagResponseMeta(timestamp=", this.f16607a, ")");
    }
}
