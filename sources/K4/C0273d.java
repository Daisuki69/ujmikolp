package K4;

/* JADX INFO: renamed from: K4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0273d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f2616b;
    public Integer c;

    public C0273d(long j, int i) {
        Integer num = (i & 2) != 0 ? null : num;
        num = (i & 4) != 0 ? null : 1;
        this.f2615a = j;
        this.f2616b = num;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0273d)) {
            return false;
        }
        C0273d c0273d = (C0273d) obj;
        return this.f2615a == c0273d.f2615a && kotlin.jvm.internal.j.b(this.f2616b, c0273d.f2616b) && kotlin.jvm.internal.j.b(this.c, c0273d.c);
    }

    public final int hashCode() {
        long j = this.f2615a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Integer num = this.f2616b;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ContactCountInfo(contactId=" + this.f2615a + ", numberCount=" + this.f2616b + ", emailCount=" + this.c + ')';
    }
}
