package com.squareup.wire.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class MathMethodsKt {
    public static final long NANOS_PER_SECOND = 1000000000;

    public static final long addExactLong(long j, long j6) {
        long j7 = j + j6;
        if (((j6 ^ j) < 0) || ((j ^ j7) >= 0)) {
            return j7;
        }
        throw new ArithmeticException();
    }

    public static final long floorDivLong(long j, long j6) {
        long j7 = j / j6;
        return (j - (j6 * j7) != 0 && (((j ^ j6) >> 63) | 1) < 0) ? j7 - 1 : j7;
    }

    public static final long floorModLong(long j, long j6) {
        long j7 = j % j6;
        if (j7 == 0) {
            return 0L;
        }
        return (((j ^ j6) >> 63) | 1) > 0 ? j7 : j7 + j6;
    }
}
