package i1;

import java.util.HashMap;
import l1.InterfaceC1797a;

/* JADX INFO: renamed from: i1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1581a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1797a f17067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f17068b;

    public C1581a(InterfaceC1797a interfaceC1797a, HashMap map) {
        this.f17067a = interfaceC1797a;
        this.f17068b = map;
    }

    public final long a(Z0.e eVar, long j, int i) {
        long jF = j - this.f17067a.f();
        C1582b c1582b = (C1582b) this.f17068b.get(eVar);
        long j6 = c1582b.f17069a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * ((long) r12)))), jF), c1582b.f17070b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1581a)) {
            return false;
        }
        C1581a c1581a = (C1581a) obj;
        return this.f17067a.equals(c1581a.f17067a) && this.f17068b.equals(c1581a.f17068b);
    }

    public final int hashCode() {
        return ((this.f17067a.hashCode() ^ 1000003) * 1000003) ^ this.f17068b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f17067a + ", values=" + this.f17068b + "}";
    }
}
