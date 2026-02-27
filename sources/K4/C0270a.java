package K4;

/* JADX INFO: renamed from: K4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0270a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2613b;
    public final Long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f2614d;

    public C0270a(long j, String str, Long l6, Long l8) {
        this.f2612a = j;
        this.f2613b = str;
        this.c = l6;
        this.f2614d = l8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0270a)) {
            return false;
        }
        C0270a c0270a = (C0270a) obj;
        return this.f2612a == c0270a.f2612a && kotlin.jvm.internal.j.b(this.f2613b, c0270a.f2613b) && kotlin.jvm.internal.j.b(this.c, c0270a.c) && kotlin.jvm.internal.j.b(this.f2614d, c0270a.f2614d);
    }

    public final int hashCode() {
        long j = this.f2612a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f2613b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Long l6 = this.c;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.f2614d;
        return iHashCode2 + (l8 != null ? l8.hashCode() : 0);
    }

    public final String toString() {
        return "CalendarReminderDetail(eventId=" + this.f2612a + ", title=" + this.f2613b + ", startTime=" + this.c + ", endTime=" + this.f2614d + ')';
    }
}
