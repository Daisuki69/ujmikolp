package K4;

/* JADX INFO: renamed from: K4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0275f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f2621b;
    public Integer c = 1;

    public C0275f(long j, Integer num) {
        this.f2620a = j;
        this.f2621b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0275f)) {
            return false;
        }
        C0275f c0275f = (C0275f) obj;
        return this.f2620a == c0275f.f2620a && kotlin.jvm.internal.j.b(this.f2621b, c0275f.f2621b) && kotlin.jvm.internal.j.b(this.c, c0275f.c);
    }

    public final int hashCode() {
        long j = this.f2620a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Integer num = this.f2621b;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "EventAttendeesCountInfo(eventId=" + this.f2620a + ", confirmedAttendeesCount=" + this.f2621b + ", attendeesCount=" + this.c + ')';
    }
}
