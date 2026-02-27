package com.google.android.material.color;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class ColorUtils {
    private static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};

    private ColorUtils() {
    }

    public static int blueFromInt(int i) {
        return i & 255;
    }

    public static float delinearized(float f) {
        return f <= 0.0031308f ? f * 12.92f : (((float) Math.pow(f, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int greenFromInt(int i) {
        return (i & 65280) >> 8;
    }

    public static String hexFromInt(int i) {
        int iRedFromInt = redFromInt(i);
        int iBlueFromInt = blueFromInt(i);
        return String.format("#%02x%02x%02x", Integer.valueOf(iRedFromInt), Integer.valueOf(greenFromInt(i)), Integer.valueOf(iBlueFromInt));
    }

    public static int intFromLab(double d10, double d11, double d12) {
        double d13 = (d10 + 16.0d) / 116.0d;
        double d14 = (d11 / 500.0d) + d13;
        double d15 = d13 - (d12 / 200.0d);
        double d16 = d14 * d14 * d14;
        if (d16 <= 0.008856451679035631d) {
            d16 = ((d14 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d17 = d10 > 8.0d ? d13 * d13 * d13 : d10 / 903.2962962962963d;
        double d18 = d15 * d15 * d15;
        if (d18 <= 0.008856451679035631d) {
            d18 = ((d15 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        float[] fArr = WHITE_POINT_D65;
        return intFromXyzComponents((float) (d16 * ((double) fArr[0])), (float) (d17 * ((double) fArr[1])), (float) (d18 * ((double) fArr[2])));
    }

    public static int intFromLstar(float f) {
        float f3 = (f + 16.0f) / 116.0f;
        float f7 = f3 * f3 * f3;
        boolean z4 = f7 > 0.008856452f;
        float f10 = f > 8.0f ? f7 : f / 903.2963f;
        float f11 = z4 ? f7 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z4) {
            f7 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return intFromXyz(new float[]{f11 * fArr[0], f10 * fArr[1], f7 * fArr[2]});
    }

    public static int intFromRgb(int i, int i4, int i6) {
        return ((i & 255) << 16) | (-16777216) | ((i4 & 255) << 8) | (i6 & 255);
    }

    public static int intFromXyz(float[] fArr) {
        return intFromXyzComponents(fArr[0], fArr[1], fArr[2]);
    }

    public static int intFromXyzComponents(float f, float f3, float f7) {
        float f10 = f / 100.0f;
        float f11 = f3 / 100.0f;
        float f12 = f7 / 100.0f;
        float f13 = ((-0.4986f) * f12) + ((-1.5372f) * f11) + (3.2406f * f10);
        float f14 = (0.0415f * f12) + (1.8758f * f11) + ((-0.9689f) * f10);
        float f15 = f12 * 1.057f;
        float f16 = f15 + (f11 * (-0.204f)) + (f10 * 0.0557f);
        return intFromRgb(Math.max(Math.min(255, Math.round(delinearized(f13) * 255.0f)), 0), Math.max(Math.min(255, Math.round(delinearized(f14) * 255.0f)), 0), Math.max(Math.min(255, Math.round(delinearized(f16) * 255.0f)), 0));
    }

    public static double[] labFromInt(int i) {
        float[] fArrXyzFromInt = xyzFromInt(i);
        float f = fArrXyzFromInt[1];
        float[] fArr = WHITE_POINT_D65;
        double d10 = f / fArr[1];
        double dCbrt = d10 > 0.008856451679035631d ? Math.cbrt(d10) : ((d10 * 903.2962962962963d) + 16.0d) / 116.0d;
        double d11 = fArrXyzFromInt[0] / fArr[0];
        double dCbrt2 = d11 > 0.008856451679035631d ? Math.cbrt(d11) : ((d11 * 903.2962962962963d) + 16.0d) / 116.0d;
        double d12 = fArrXyzFromInt[2] / fArr[2];
        return new double[]{(116.0d * dCbrt) - 16.0d, (dCbrt2 - dCbrt) * 500.0d, (dCbrt - (d12 > 0.008856451679035631d ? Math.cbrt(d12) : ((d12 * 903.2962962962963d) + 16.0d) / 116.0d)) * 200.0d};
    }

    public static float linearized(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float lstarFromInt(int i) {
        return (float) labFromInt(i)[0];
    }

    public static int redFromInt(int i) {
        return (i & 16711680) >> 16;
    }

    public static final float[] whitePointD65() {
        return Arrays.copyOf(WHITE_POINT_D65, 3);
    }

    public static float[] xyzFromInt(int i) {
        float fLinearized = linearized(redFromInt(i) / 255.0f) * 100.0f;
        float fLinearized2 = linearized(greenFromInt(i) / 255.0f) * 100.0f;
        float fLinearized3 = linearized(blueFromInt(i) / 255.0f) * 100.0f;
        return new float[]{(0.18051042f * fLinearized3) + (0.35762063f * fLinearized2) + (0.41233894f * fLinearized), (0.0722f * fLinearized3) + (0.7152f * fLinearized2) + (0.2126f * fLinearized), (fLinearized3 * 0.9503448f) + (fLinearized2 * 0.11916382f) + (fLinearized * 0.01932141f)};
    }

    public static float yFromLstar(float f) {
        return (f > 8.0f ? (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
