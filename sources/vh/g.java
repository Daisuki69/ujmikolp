package Vh;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6129b;
    public final TimeUnit c;

    public g(Object obj, long j, TimeUnit timeUnit) {
        this.f6128a = obj;
        this.f6129b = j;
        jh.e.b(timeUnit, "unit is null");
        this.c = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (jh.e.a(this.f6128a, gVar.f6128a) && this.f6129b == gVar.f6129b && jh.e.a(this.c, gVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f6128a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        long j = this.f6129b;
        return this.c.hashCode() + (((iHashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timed[time=");
        sb2.append(this.f6129b);
        sb2.append(", unit=");
        sb2.append(this.c);
        sb2.append(", value=");
        return androidx.camera.core.impl.a.m(sb2, this.f6128a, "]");
    }
}
