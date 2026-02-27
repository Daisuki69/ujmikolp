package d5;

import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("data")
    private final c f16277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("meta")
    private final d f16278b;

    public final c a() {
        return this.f16277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.b(this.f16277a, bVar.f16277a) && j.b(this.f16278b, bVar.f16278b);
    }

    public final int hashCode() {
        return this.f16278b.hashCode() + (this.f16277a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorAttrs(data=" + this.f16277a + ", meta=" + this.f16278b + ")";
    }
}
