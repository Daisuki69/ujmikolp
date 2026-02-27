package Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f6871b;
    public final b c;

    public a(Object obj, e eVar, b bVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f6870a = obj;
        this.f6871b = eVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            ((a) dVar).getClass();
            if (this.f6870a.equals(((a) dVar).f6870a)) {
                a aVar = (a) dVar;
                if (this.f6871b.equals(aVar.f6871b)) {
                    b bVar = aVar.c;
                    b bVar2 = this.c;
                    if (bVar2 != null ? bVar2.equals(bVar) : bVar == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f6870a.hashCode()) * 1000003) ^ this.f6871b.hashCode()) * 1000003;
        b bVar = this.c;
        return (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f6870a + ", priority=" + this.f6871b + ", productData=" + this.c + ", eventContext=null}";
    }
}
