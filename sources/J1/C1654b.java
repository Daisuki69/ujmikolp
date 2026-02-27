package j1;

/* JADX INFO: renamed from: j1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1654b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1.i f17660b;
    public final c1.h c;

    public C1654b(long j, c1.i iVar, c1.h hVar) {
        this.f17659a = j;
        this.f17660b = iVar;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1654b)) {
            return false;
        }
        C1654b c1654b = (C1654b) obj;
        return this.f17659a == c1654b.f17659a && this.f17660b.equals(c1654b.f17660b) && this.c.equals(c1654b.c);
    }

    public final int hashCode() {
        long j = this.f17659a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17660b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f17659a + ", transportContext=" + this.f17660b + ", event=" + this.c + "}";
    }
}
