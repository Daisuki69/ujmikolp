package com.google.android.material.math;

/* JADX INFO: loaded from: classes2.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static float dist(float f, float f3, float f7, float f10) {
        return (float) Math.hypot(f7 - f, f10 - f3);
    }

    public static float distanceToFurthestCorner(float f, float f3, float f7, float f10, float f11, float f12) {
        return max(dist(f, f3, f7, f10), dist(f, f3, f11, f10), dist(f, f3, f11, f12), dist(f, f3, f7, f12));
    }

    public static float floorMod(float f, int i) {
        float f3 = i;
        int i4 = (int) (f / f3);
        if (Math.signum(f) * f3 < 0.0f && i4 * i != f) {
            i4--;
        }
        return f - (i4 * i);
    }

    public static boolean geq(float f, float f3, float f7) {
        return f + f7 >= f3;
    }

    public static float lerp(float f, float f3, float f7) {
        return (f7 * f3) + ((1.0f - f7) * f);
    }

    private static float max(float f, float f3, float f7, float f10) {
        return (f <= f3 || f <= f7 || f <= f10) ? (f3 <= f7 || f3 <= f10) ? f7 > f10 ? f7 : f10 : f3 : f;
    }

    public static int floorMod(int i, int i4) {
        int i6 = i / i4;
        if ((i ^ i4) < 0 && i6 * i4 != i) {
            i6--;
        }
        return i - (i6 * i4);
    }
}
