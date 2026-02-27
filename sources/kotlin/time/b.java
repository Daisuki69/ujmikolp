package kotlin.time;

import Aj.c;
import androidx.media3.common.PlaybackException;
import kotlin.jvm.internal.j;
import kotlin.ranges.d;
import kotlin.time.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final long a(long j) {
        long j6 = (j << 1) + 1;
        a.C0097a c0097a = a.f18208b;
        int i = Aj.a.f329a;
        return j6;
    }

    public static final long b(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? a(d.c(j, -4611686018427387903L, 4611686018427387903L)) : c(j * ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE));
    }

    public static final long c(long j) {
        long j6 = j << 1;
        a.C0097a c0097a = a.f18208b;
        int i = Aj.a.f329a;
        return j6;
    }

    public static final long d(double d10, Aj.b unit) {
        j.g(unit, "unit");
        double dA = c.a(d10, unit, Aj.b.f330b);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound = Math.round(dA);
        if (-4611686018426999999L <= jRound && jRound < 4611686018427000000L) {
            return c(jRound);
        }
        double dA2 = c.a(d10, unit, Aj.b.c);
        if (Double.isNaN(dA2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return b(Math.round(dA2));
    }

    public static final long e(int i, Aj.b unit) {
        j.g(unit, "unit");
        return unit.compareTo(Aj.b.f331d) <= 0 ? c(c.b(i, unit, Aj.b.f330b)) : f(i, unit);
    }

    public static final long f(long j, Aj.b unit) {
        j.g(unit, "unit");
        Aj.b bVar = Aj.b.f330b;
        long jB = c.b(4611686018426999999L, bVar, unit);
        if ((-jB) <= j && j <= jB) {
            return c(c.b(j, unit, bVar));
        }
        Aj.b targetUnit = Aj.b.c;
        j.g(targetUnit, "targetUnit");
        return a(d.c(targetUnit.f333a.convert(j, unit.f333a), -4611686018427387903L, 4611686018427387903L));
    }
}
