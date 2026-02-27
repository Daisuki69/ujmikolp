package K4;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2623b;
    public long c;

    public g(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        this.f2622a = name;
        this.f2623b = 0L;
        this.c = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.j.b(this.f2622a, gVar.f2622a) && this.f2623b == gVar.f2623b && this.c == gVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.f2622a.hashCode() * 31;
        long j = this.f2623b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j6 = this.c;
        return i + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "ExecutionLog(name=" + this.f2622a + ", startTime=" + this.f2623b + ", endTime=" + this.c + ')';
    }
}
