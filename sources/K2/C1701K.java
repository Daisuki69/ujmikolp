package k2;

import java.util.List;

/* JADX INFO: renamed from: k2.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1701K extends O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17862b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17863d;
    public final Long e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1702L f17864g;
    public final C1737l0 h;
    public final C1735k0 i;
    public final C1705O j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f17865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f17866l;

    public C1701K(String str, String str2, String str3, long j, Long l6, boolean z4, C1702L c1702l, C1737l0 c1737l0, C1735k0 c1735k0, C1705O c1705o, List list, int i) {
        this.f17861a = str;
        this.f17862b = str2;
        this.c = str3;
        this.f17863d = j;
        this.e = l6;
        this.f = z4;
        this.f17864g = c1702l;
        this.h = c1737l0;
        this.i = c1735k0;
        this.j = c1705o;
        this.f17865k = list;
        this.f17866l = i;
    }

    public final C1700J a() {
        C1700J c1700j = new C1700J();
        c1700j.f17855a = this.f17861a;
        c1700j.f17856b = this.f17862b;
        c1700j.c = this.c;
        c1700j.f17857d = this.f17863d;
        c1700j.e = this.e;
        c1700j.f = this.f;
        c1700j.f17858g = this.f17864g;
        c1700j.h = this.h;
        c1700j.i = this.i;
        c1700j.j = this.j;
        c1700j.f17859k = this.f17865k;
        c1700j.f17860l = this.f17866l;
        c1700j.m = (byte) 7;
        return c1700j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        C1701K c1701k = (C1701K) ((O0) obj);
        if (!this.f17861a.equals(c1701k.f17861a)) {
            return false;
        }
        if (!this.f17862b.equals(c1701k.f17862b)) {
            return false;
        }
        String str = c1701k.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f17863d != c1701k.f17863d) {
            return false;
        }
        Long l6 = c1701k.e;
        Long l8 = this.e;
        if (l8 == null) {
            if (l6 != null) {
                return false;
            }
        } else if (!l8.equals(l6)) {
            return false;
        }
        if (this.f != c1701k.f || !this.f17864g.equals(c1701k.f17864g)) {
            return false;
        }
        C1737l0 c1737l0 = c1701k.h;
        C1737l0 c1737l02 = this.h;
        if (c1737l02 == null) {
            if (c1737l0 != null) {
                return false;
            }
        } else if (!c1737l02.equals(c1737l0)) {
            return false;
        }
        C1735k0 c1735k0 = c1701k.i;
        C1735k0 c1735k02 = this.i;
        if (c1735k02 == null) {
            if (c1735k0 != null) {
                return false;
            }
        } else if (!c1735k02.equals(c1735k0)) {
            return false;
        }
        C1705O c1705o = c1701k.j;
        C1705O c1705o2 = this.j;
        if (c1705o2 == null) {
            if (c1705o != null) {
                return false;
            }
        } else if (!c1705o2.equals(c1705o)) {
            return false;
        }
        List list = c1701k.f17865k;
        List list2 = this.f17865k;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return this.f17866l == c1701k.f17866l;
    }

    public final int hashCode() {
        int iHashCode = (((this.f17861a.hashCode() ^ 1000003) * 1000003) ^ this.f17862b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.f17863d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l6 = this.e;
        int iHashCode3 = (((((i ^ (l6 == null ? 0 : l6.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f17864g.hashCode()) * 1000003;
        C1737l0 c1737l0 = this.h;
        int iHashCode4 = (iHashCode3 ^ (c1737l0 == null ? 0 : c1737l0.hashCode())) * 1000003;
        C1735k0 c1735k0 = this.i;
        int iHashCode5 = (iHashCode4 ^ (c1735k0 == null ? 0 : c1735k0.hashCode())) * 1000003;
        C1705O c1705o = this.j;
        int iHashCode6 = (iHashCode5 ^ (c1705o == null ? 0 : c1705o.hashCode())) * 1000003;
        List list = this.f17865k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f17866l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f17861a);
        sb2.append(", identifier=");
        sb2.append(this.f17862b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.c);
        sb2.append(", startedAt=");
        sb2.append(this.f17863d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f);
        sb2.append(", app=");
        sb2.append(this.f17864g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.i);
        sb2.append(", device=");
        sb2.append(this.j);
        sb2.append(", events=");
        sb2.append(this.f17865k);
        sb2.append(", generatorType=");
        return We.s.o(sb2, "}", this.f17866l);
    }
}
