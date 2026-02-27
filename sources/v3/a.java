package V3;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U3.b f6043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U3.b f6044b;
    public final U3.c c;

    public a(U3.b bVar, U3.b bVar2, U3.c cVar) {
        this.f6043a = bVar;
        this.f6044b = bVar2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f6043a.equals(aVar.f6043a)) {
                U3.b bVar = this.f6044b;
                U3.b bVar2 = aVar.f6044b;
                if ((bVar == null ? bVar2 == null : bVar.equals(bVar2)) && this.c.equals(aVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6043a.hashCode();
        U3.b bVar = this.f6044b;
        return (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bLe2"));
        sb2.append(this.f6043a);
        sb2.append(numX49.tnTj78("bLeL"));
        sb2.append(this.f6044b);
        sb2.append(numX49.tnTj78("bLer"));
        U3.c cVar = this.c;
        return androidx.camera.core.impl.a.m(sb2, cVar == null ? numX49.tnTj78("bLeZ") : Integer.valueOf(cVar.f5930a), numX49.tnTj78("bLek"));
    }
}
