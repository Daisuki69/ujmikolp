package com.google.android.material.color;

import com.dynatrace.android.agent.conf.SessionSplitConfiguration;

/* JADX INFO: loaded from: classes2.dex */
final class MathUtils {
    private MathUtils() {
    }

    public static float clamp(float f, float f3, float f7) {
        return Math.min(Math.max(f7, f), f3);
    }

    public static float differenceDegrees(float f, float f3) {
        return 180.0f - Math.abs(Math.abs(f - f3) - 180.0f);
    }

    public static float lerp(float f, float f3, float f7) {
        return (f7 * f3) + ((1.0f - f7) * f);
    }

    public static float sanitizeDegrees(float f) {
        return f < 0.0f ? (f % 360.0f) + 360.0f : f >= 360.0f ? f % 360.0f : f;
    }

    public static float toDegrees(float f) {
        return (f * 180.0f) / 3.1415927f;
    }

    public static float toRadians(float f) {
        return (f / 180.0f) * 3.1415927f;
    }

    public static int sanitizeDegrees(int i) {
        return i < 0 ? (i % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS : i >= 360 ? i % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS : i;
    }
}
