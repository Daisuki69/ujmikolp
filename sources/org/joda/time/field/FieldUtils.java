package org.joda.time.field;

import androidx.camera.core.impl.a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes5.dex */
public class FieldUtils {
    private FieldUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int getWrappedValue(int i, int i4, int i6, int i10) {
        return getWrappedValue(i + i4, i6, i10);
    }

    public static int safeAdd(int i, int i4) {
        int i6 = i + i4;
        if ((i ^ i6) >= 0 || (i ^ i4) < 0) {
            return i6;
        }
        throw new ArithmeticException(a.c(i, i4, "The calculation caused an overflow: ", " + "));
    }

    public static long safeDivide(long j, long j6) {
        if (j != Long.MIN_VALUE || j6 != -1) {
            return j / j6;
        }
        StringBuilder sbS = a.s(j, "Multiplication overflows a long: ", " / ");
        sbS.append(j6);
        throw new ArithmeticException(sbS.toString());
    }

    public static int safeMultiply(int i, int i4) {
        long j = ((long) i) * ((long) i4);
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException(a.c(i, i4, "Multiplication overflows an int: ", " * "));
        }
        return (int) j;
    }

    public static int safeMultiplyToInt(long j, long j6) {
        return safeToInt(safeMultiply(j, j6));
    }

    public static int safeNegate(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }

    public static long safeSubtract(long j, long j6) {
        long j7 = j - j6;
        if ((j ^ j7) >= 0 || (j ^ j6) >= 0) {
            return j7;
        }
        StringBuilder sbS = a.s(j, "The calculation caused an overflow: ", " - ");
        sbS.append(j6);
        throw new ArithmeticException(sbS.toString());
    }

    public static int safeToInt(long j) {
        if (-2147483648L > j || j > 2147483647L) {
            throw new ArithmeticException(a.f(j, "Value cannot fit in an int: "));
        }
        return (int) j;
    }

    public static void verifyValueBounds(DateTimeField dateTimeField, int i, int i4, int i6) {
        if (i < i4 || i > i6) {
            throw new IllegalFieldValueException(dateTimeField.getType(), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6));
        }
    }

    public static int getWrappedValue(int i, int i4, int i6) {
        if (i4 >= i6) {
            throw new IllegalArgumentException("MIN > MAX");
        }
        int i10 = (i6 - i4) + 1;
        int i11 = i - i4;
        if (i11 >= 0) {
            return (i11 % i10) + i4;
        }
        int i12 = (-i11) % i10;
        return i12 == 0 ? i4 : (i10 - i12) + i4;
    }

    public static void verifyValueBounds(DateTimeFieldType dateTimeFieldType, int i, int i4, int i6) {
        if (i < i4 || i > i6) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6));
        }
    }

    public static void verifyValueBounds(String str, int i, int i4, int i6) {
        if (i < i4 || i > i6) {
            throw new IllegalFieldValueException(str, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6));
        }
    }

    public static long safeDivide(long j, long j6, RoundingMode roundingMode) {
        if (j == Long.MIN_VALUE && j6 == -1) {
            StringBuilder sbS = a.s(j, "Multiplication overflows a long: ", " / ");
            sbS.append(j6);
            throw new ArithmeticException(sbS.toString());
        }
        return new BigDecimal(j).divide(new BigDecimal(j6), roundingMode).longValue();
    }

    public static long safeAdd(long j, long j6) {
        long j7 = j + j6;
        if ((j ^ j7) >= 0 || (j ^ j6) < 0) {
            return j7;
        }
        StringBuilder sbS = a.s(j, "The calculation caused an overflow: ", " + ");
        sbS.append(j6);
        throw new ArithmeticException(sbS.toString());
    }

    public static long safeMultiply(long j, int i) {
        if (i == -1) {
            if (j != Long.MIN_VALUE) {
                return -j;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        }
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return j;
        }
        long j6 = i;
        long j7 = j * j6;
        if (j7 / j6 == j) {
            return j7;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
    }

    public static long safeMultiply(long j, long j6) {
        if (j6 == 1) {
            return j;
        }
        if (j == 1) {
            return j6;
        }
        if (j == 0 || j6 == 0) {
            return 0L;
        }
        long j7 = j * j6;
        if (j7 / j6 == j && ((j != Long.MIN_VALUE || j6 != -1) && (j6 != Long.MIN_VALUE || j != -1))) {
            return j7;
        }
        StringBuilder sbS = a.s(j, "Multiplication overflows a long: ", " * ");
        sbS.append(j6);
        throw new ArithmeticException(sbS.toString());
    }
}
