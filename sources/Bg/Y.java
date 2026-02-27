package Bg;

import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f508b;
    public Long c;

    static {
        kotlin.jvm.internal.z.a(Y.class);
        try {
            kotlin.jvm.internal.z.c(Y.class);
        } catch (Throwable unused) {
        }
        if (C2576A.H("TimeoutConfiguration")) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public Y() {
        this.f507a = 0L;
        this.f508b = 0L;
        this.c = 0L;
        this.f507a = null;
        this.f508b = null;
        this.c = null;
    }

    public static void a(Long l6) {
        if (l6 != null && l6.longValue() <= 0) {
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y.class != obj.getClass()) {
            return false;
        }
        Y y7 = (Y) obj;
        return kotlin.jvm.internal.j.b(this.f507a, y7.f507a) && kotlin.jvm.internal.j.b(this.f508b, y7.f508b) && kotlin.jvm.internal.j.b(this.c, y7.c);
    }

    public final int hashCode() {
        Long l6 = this.f507a;
        int iHashCode = (l6 != null ? l6.hashCode() : 0) * 31;
        Long l8 = this.f508b;
        int iHashCode2 = (iHashCode + (l8 != null ? l8.hashCode() : 0)) * 31;
        Long l10 = this.c;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }
}
