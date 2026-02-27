package d5;

import We.s;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("timestamp")
    private final String f16280a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.b(this.f16280a, ((d) obj).f16280a);
    }

    public final int hashCode() {
        return this.f16280a.hashCode();
    }

    public final String toString() {
        return s.j("ErrorMeta(timestamp=", this.f16280a, ")");
    }
}
