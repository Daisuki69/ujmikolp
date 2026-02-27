package b1;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends AbstractC0846A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f8327a;

    public o(m mVar) {
        this.f8327a = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0846A)) {
            return false;
        }
        AbstractC0846A abstractC0846A = (AbstractC0846A) obj;
        Object obj2 = z.f8347a;
        ((o) abstractC0846A).getClass();
        return obj2.equals(obj2) && this.f8327a.equals(((o) abstractC0846A).f8327a);
    }

    public final int hashCode() {
        return ((z.f8347a.hashCode() ^ 1000003) * 1000003) ^ this.f8327a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + z.f8347a + ", androidClientInfo=" + this.f8327a + "}";
    }
}
