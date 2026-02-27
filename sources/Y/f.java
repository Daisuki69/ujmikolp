package Y;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f6709a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f6710b = null;
    public final e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f6711d;
    public final a e;

    public f(e eVar, c cVar, a aVar) {
        this.c = eVar;
        this.f6711d = cVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j.b(this.f6709a, fVar.f6709a) && j.b(this.f6710b, fVar.f6710b) && j.b(this.c, fVar.c) && j.b(this.f6711d, fVar.f6711d) && j.b(this.e, fVar.e);
    }

    public final int hashCode() {
        d dVar = this.f6709a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        b bVar = this.f6710b;
        return this.e.hashCode() + ((this.f6711d.hashCode() + ((this.c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StoreRegistry(inAppStore=" + this.f6709a + ", impressionStore=" + this.f6710b + ", legacyInAppStore=" + this.c + ", inAppAssetsStore=" + this.f6711d + ", filesStore=" + this.e + ')';
    }
}
