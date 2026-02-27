package Tg;

import Tj.g;
import Tj.m;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Comparable<d> {
    public static final c Companion = new c();
    public static final Pj.a[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5829b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f5830d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f5831g;
    public final int h;
    public final long i;

    static {
        f[] values = f.values();
        j.g(values, "values");
        g gVar = new g("io.ktor.util.date.WeekDay", values);
        e[] values2 = e.values();
        j.g(values2, "values");
        j = new Pj.a[]{null, null, null, gVar, null, null, new g("io.ktor.util.date.Month", values2), null, null};
        a.a(0L);
    }

    public /* synthetic */ d(int i, int i4, int i6, int i10, f fVar, int i11, int i12, e eVar, int i13, long j6) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            m.d(i, FrameMetricsAggregator.EVERY_DURATION, b.f5827a.d());
            throw null;
        }
        this.f5828a = i4;
        this.f5829b = i6;
        this.c = i10;
        this.f5830d = fVar;
        this.e = i11;
        this.f = i12;
        this.f5831g = eVar;
        this.h = i13;
        this.i = j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d other = dVar;
        j.g(other, "other");
        long j6 = this.i;
        long j7 = other.i;
        if (j6 < j7) {
            return -1;
        }
        return j6 == j7 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5828a == dVar.f5828a && this.f5829b == dVar.f5829b && this.c == dVar.c && this.f5830d == dVar.f5830d && this.e == dVar.e && this.f == dVar.f && this.f5831g == dVar.f5831g && this.h == dVar.h && this.i == dVar.i;
    }

    public final int hashCode() {
        int iHashCode = (((this.f5831g.hashCode() + ((((((this.f5830d.hashCode() + (((((this.f5828a * 31) + this.f5829b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f) * 31)) * 31) + this.h) * 31;
        long j6 = this.i;
        return iHashCode + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.f5828a + ", minutes=" + this.f5829b + ", hours=" + this.c + ", dayOfWeek=" + this.f5830d + ", dayOfMonth=" + this.e + ", dayOfYear=" + this.f + ", month=" + this.f5831g + ", year=" + this.h + ", timestamp=" + this.i + ')';
    }

    public d(int i, int i4, int i6, f dayOfWeek, int i10, int i11, e month, int i12, long j6) {
        j.g(dayOfWeek, "dayOfWeek");
        j.g(month, "month");
        this.f5828a = i;
        this.f5829b = i4;
        this.c = i6;
        this.f5830d = dayOfWeek;
        this.e = i10;
        this.f = i11;
        this.f5831g = month;
        this.h = i12;
        this.i = j6;
    }
}
