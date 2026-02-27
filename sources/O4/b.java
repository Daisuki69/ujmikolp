package O4;

import K4.y;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f4642b;

    public b(Integer num, y yVar) {
        this.f4641a = num;
        this.f4642b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4641a.equals(bVar.f4641a) && kotlin.jvm.internal.j.b(this.f4642b, bVar.f4642b);
    }

    public final int hashCode() {
        int iHashCode = this.f4641a.hashCode() * 31;
        y yVar = this.f4642b;
        return iHashCode + (yVar == null ? 0 : yVar.hashCode());
    }

    public final String toString() {
        return "HttpError(code=" + this.f4641a + ", errorBody=" + this.f4642b + ')';
    }
}
