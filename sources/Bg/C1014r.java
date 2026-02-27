package bg;

/* JADX INFO: renamed from: bg.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1014r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f9113b;
    public final int c;

    public C1014r(long j, m0 sensorEvent, int i) {
        kotlin.jvm.internal.j.h(sensorEvent, "sensorEvent");
        this.f9112a = j;
        this.f9113b = sensorEvent;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1014r)) {
            return false;
        }
        C1014r c1014r = (C1014r) obj;
        return this.f9112a == c1014r.f9112a && kotlin.jvm.internal.j.b(this.f9113b, c1014r.f9113b) && this.c == c1014r.c;
    }

    public final int hashCode() {
        long j = this.f9112a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        m0 m0Var = this.f9113b;
        return this.c + ((i + (m0Var != null ? m0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SensorSnapshot(timestamp=");
        sb2.append(this.f9112a);
        sb2.append(", sensorEvent=");
        sb2.append(this.f9113b);
        sb2.append(", sensorType=");
        return We.s.o(sb2, ")", this.c);
    }
}
