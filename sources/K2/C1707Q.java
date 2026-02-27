package k2;

/* JADX INFO: renamed from: k2.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1707Q extends L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17884b;
    public final C1708S c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1721d0 f17885d;
    public final C1723e0 e;
    public final C1731i0 f;

    public C1707Q(long j, String str, C1708S c1708s, C1721d0 c1721d0, C1723e0 c1723e0, C1731i0 c1731i0) {
        this.f17883a = j;
        this.f17884b = str;
        this.c = c1708s;
        this.f17885d = c1721d0;
        this.e = c1723e0;
        this.f = c1731i0;
    }

    public final C1706P a() {
        C1706P c1706p = new C1706P();
        c1706p.f17878a = this.f17883a;
        c1706p.f17879b = this.f17884b;
        c1706p.c = this.c;
        c1706p.f17880d = this.f17885d;
        c1706p.e = this.e;
        c1706p.f = this.f;
        c1706p.f17881g = (byte) 1;
        return c1706p;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        C1707Q c1707q = (C1707Q) ((L0) obj);
        if (this.f17883a != c1707q.f17883a) {
            return false;
        }
        if (!this.f17884b.equals(c1707q.f17884b) || !this.c.equals(c1707q.c) || !this.f17885d.equals(c1707q.f17885d)) {
            return false;
        }
        C1723e0 c1723e0 = c1707q.e;
        C1723e0 c1723e02 = this.e;
        if (c1723e02 == null) {
            if (c1723e0 != null) {
                return false;
            }
        } else if (!c1723e02.equals(c1723e0)) {
            return false;
        }
        C1731i0 c1731i0 = c1707q.f;
        C1731i0 c1731i02 = this.f;
        return c1731i02 == null ? c1731i0 == null : c1731i02.equals(c1731i0);
    }

    public final int hashCode() {
        long j = this.f17883a;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17884b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f17885d.hashCode()) * 1000003;
        C1723e0 c1723e0 = this.e;
        int iHashCode2 = (iHashCode ^ (c1723e0 == null ? 0 : c1723e0.hashCode())) * 1000003;
        C1731i0 c1731i0 = this.f;
        return iHashCode2 ^ (c1731i0 != null ? c1731i0.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f17883a + ", type=" + this.f17884b + ", app=" + this.c + ", device=" + this.f17885d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
