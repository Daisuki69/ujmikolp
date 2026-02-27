package kotlin.ranges;

import kotlin.jvm.internal.j;
import kotlin.ranges.c;
import wj.f;

/* JADX INFO: loaded from: classes4.dex */
public class d extends f {
    public static float a(float f, float f3, float f7) {
        if (f3 <= f7) {
            return f < f3 ? f3 : f > f7 ? f7 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f7 + " is less than minimum " + f3 + '.');
    }

    public static int b(int i, int i4, int i6) {
        if (i4 <= i6) {
            return i < i4 ? i4 : i > i6 ? i6 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i6 + " is less than minimum " + i4 + '.');
    }

    public static long c(long j, long j6, long j7) {
        if (j6 <= j7) {
            return j < j6 ? j6 : j > j7 ? j7 : j;
        }
        StringBuilder sbS = androidx.camera.core.impl.a.s(j7, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbS.append(j6);
        sbS.append('.');
        throw new IllegalArgumentException(sbS.toString());
    }

    public static c d(int i, int i4) {
        c.f18200d.getClass();
        return new c(i, i4, -1);
    }

    public static c e(c cVar, int i) {
        j.g(cVar, "<this>");
        boolean z4 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z4) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        c.a aVar = c.f18200d;
        if (cVar.c <= 0) {
            i = -i;
        }
        aVar.getClass();
        return new c(cVar.f18201a, cVar.f18202b, i);
    }

    public static IntRange f(int i, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new IntRange(i, i4 - 1, 1);
        }
        IntRange.e.getClass();
        return IntRange.f;
    }
}
