package androidx.core.math;

/* JADX INFO: loaded from: classes.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static int addExact(int i, int i4) {
        int i6 = i + i4;
        if ((i >= 0) == (i4 >= 0)) {
            if ((i >= 0) != (i6 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i6;
    }

    public static double clamp(double d10, double d11, double d12) {
        return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
    }

    public static int decrementExact(int i) {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i, int i4) {
        int i6 = i * i4;
        if (i == 0 || i4 == 0 || (i6 / i == i4 && i6 / i4 == i)) {
            return i6;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int subtractExact(int i, int i4) {
        int i6 = i - i4;
        if ((i < 0) != (i4 < 0)) {
            if ((i < 0) != (i6 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i6;
    }

    public static int toIntExact(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) j;
    }

    public static long addExact(long j, long j6) {
        long j7 = j + j6;
        if ((j >= 0) == (j6 >= 0)) {
            if ((j >= 0) != (j7 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j7;
    }

    public static float clamp(float f, float f3, float f7) {
        return f < f3 ? f3 : f > f7 ? f7 : f;
    }

    public static long decrementExact(long j) {
        if (j != Long.MIN_VALUE) {
            return j - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j) {
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long subtractExact(long j, long j6) {
        long j7 = j - j6;
        if ((j < 0) != (j6 < 0)) {
            if ((j < 0) != (j7 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j7;
    }

    public static int clamp(int i, int i4, int i6) {
        return i < i4 ? i4 : i > i6 ? i6 : i;
    }

    public static long multiplyExact(long j, long j6) {
        long j7 = j * j6;
        if (j == 0 || j6 == 0 || (j7 / j == j6 && j7 / j6 == j)) {
            return j7;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long clamp(long j, long j6, long j7) {
        return j < j6 ? j6 : j > j7 ? j7 : j;
    }
}
