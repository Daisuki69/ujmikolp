package androidx.core.util;

import We.s;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f, String str) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(s.i(str, " must not be NaN"));
        }
        if (Float.isInfinite(f)) {
            throw new IllegalArgumentException(s.i(str, " must not be infinite"));
        }
        return f;
    }

    public static int checkArgumentInRange(int i, int i4, int i6, String str) {
        if (i < i4) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i4 + ", " + i6 + "] (too low)");
        }
        if (i <= i6) {
            return i;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i4 + ", " + i6 + "] (too high)");
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i, int i4) {
        if ((i & i4) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i4) + " are allowed");
    }

    public static <T> T checkNotNull(T t5) {
        t5.getClass();
        return t5;
    }

    public static void checkState(boolean z4, String str) {
        if (!z4) {
            throw new IllegalStateException(str);
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t5) {
        if (TextUtils.isEmpty(t5)) {
            throw new IllegalArgumentException();
        }
        return t5;
    }

    public static void checkArgument(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T checkNotNull(T t5, Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z4) {
        checkState(z4, null);
    }

    public static void checkArgument(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t5, Object obj) {
        if (TextUtils.isEmpty(t5)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t5;
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t5, String str, Object... objArr) {
        if (TextUtils.isEmpty(t5)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t5;
    }

    public static long checkArgumentInRange(long j, long j6, long j7, String str) {
        if (j < j6) {
            Locale locale = Locale.US;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" is out of range of [");
            sb2.append(j6);
            sb2.append(", ");
            throw new IllegalArgumentException(s.h(j7, "] (too low)", sb2));
        }
        if (j <= j7) {
            return j;
        }
        Locale locale2 = Locale.US;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" is out of range of [");
        sb3.append(j6);
        sb3.append(", ");
        throw new IllegalArgumentException(s.h(j7, "] (too high)", sb3));
    }

    public static float checkArgumentInRange(float f, float f3, float f7, String str) {
        if (f < f3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f3), Float.valueOf(f7)));
        }
        if (f <= f7) {
            return f;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f3), Float.valueOf(f7)));
    }

    public static double checkArgumentInRange(double d10, double d11, double d12, String str) {
        if (d10 < d11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d11), Double.valueOf(d12)));
        }
        if (d10 <= d12) {
            return d10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d11), Double.valueOf(d12)));
    }
}
