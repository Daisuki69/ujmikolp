package R;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f5418b;
    public final k c;

    public i(String str, j jVar, k kVar) {
        this.f5417a = str;
        this.f5418b = jVar;
        this.c = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.j.b(this.f5417a, iVar.f5417a) && this.f5418b == iVar.f5418b && kotlin.jvm.internal.j.b(this.c, iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f5418b.hashCode() + (this.f5417a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return numX49.tnTj78("bPuPd") + this.f5417a + numX49.tnTj78("bPuPi") + this.f5418b + numX49.tnTj78("bPuPE") + this.c + ')';
    }
}
