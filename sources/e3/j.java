package e3;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f16573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f16574b;
    public final Integer c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f16575d;
    public final Long e;

    public /* synthetic */ j(int i, Boolean bool, Double d10, Integer num, Integer num2, Long l6) {
        if (31 != (i & 31)) {
            Tj.m.d(i, 31, h.f16572a.d());
            throw null;
        }
        this.f16573a = bool;
        this.f16574b = d10;
        this.c = num;
        this.f16575d = num2;
        this.e = l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.j.b(this.f16573a, jVar.f16573a) && kotlin.jvm.internal.j.b(this.f16574b, jVar.f16574b) && kotlin.jvm.internal.j.b(this.c, jVar.c) && kotlin.jvm.internal.j.b(this.f16575d, jVar.f16575d) && kotlin.jvm.internal.j.b(this.e, jVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.f16573a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f16574b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f16575d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l6 = this.e;
        return iHashCode4 + (l6 != null ? l6.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f16573a + ", sessionSamplingRate=" + this.f16574b + ", sessionTimeoutSeconds=" + this.c + ", cacheDurationSeconds=" + this.f16575d + ", cacheUpdatedTimeSeconds=" + this.e + ')';
    }

    public j(Boolean bool, Double d10, Integer num, Integer num2, Long l6) {
        this.f16573a = bool;
        this.f16574b = d10;
        this.c = num;
        this.f16575d = num2;
        this.e = l6;
    }
}
