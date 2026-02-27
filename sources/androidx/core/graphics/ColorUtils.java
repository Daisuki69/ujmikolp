package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.video.AudioStats;
import androidx.collection.ScatterMapKt;
import androidx.core.content.res.CamColor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static Color compositeColors(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float fAlpha = color.alpha();
            float fAlpha2 = (1.0f - fAlpha) * color2.alpha();
            int componentCount = color2.getComponentCount() - 1;
            float f = fAlpha + fAlpha2;
            components2[componentCount] = f;
            if (f > 0.0f) {
                fAlpha /= f;
                fAlpha2 /= f;
            }
            for (int i = 0; i < componentCount; i++) {
                components2[i] = (components2[i] * fAlpha2) + (components[i] * fAlpha);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    private ColorUtils() {
    }

    @ColorInt
    public static int HSLToColor(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f = fArr[0];
        float f3 = fArr[1];
        float f7 = fArr[2];
        float fAbs = (1.0f - Math.abs((f7 * 2.0f) - 1.0f)) * f3;
        float f10 = f7 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f) / 60) {
            case 0:
                iRound = Math.round((fAbs + f10) * 255.0f);
                iRound2 = Math.round((fAbs2 + f10) * 255.0f);
                iRound3 = Math.round(f10 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f10) * 255.0f);
                iRound2 = Math.round((fAbs + f10) * 255.0f);
                iRound3 = Math.round(f10 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f10 * 255.0f);
                iRound2 = Math.round((fAbs + f10) * 255.0f);
                iRound3 = Math.round((fAbs2 + f10) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f10 * 255.0f);
                iRound2 = Math.round((fAbs2 + f10) * 255.0f);
                iRound3 = Math.round((fAbs + f10) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f10) * 255.0f);
                iRound2 = Math.round(f10 * 255.0f);
                iRound3 = Math.round((fAbs + f10) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f10) * 255.0f);
                iRound2 = Math.round(f10 * 255.0f);
                iRound3 = Math.round((fAbs2 + f10) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(constrain(iRound, 0, 255), constrain(iRound2, 0, 255), constrain(iRound3, 0, 255));
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = XYZ_WHITE_REFERENCE_Y) double d10, @FloatRange(from = -128.0d, to = 127.0d) double d11, @FloatRange(from = -128.0d, to = 127.0d) double d12) {
        double[] tempDouble3Array = getTempDouble3Array();
        LABToXYZ(d10, d11, d12, tempDouble3Array);
        return XYZToColor(tempDouble3Array[0], tempDouble3Array[1], tempDouble3Array[2]);
    }

    public static void LABToXYZ(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = XYZ_WHITE_REFERENCE_Y) double d10, @FloatRange(from = -128.0d, to = 127.0d) double d11, @FloatRange(from = -128.0d, to = 127.0d) double d12, double[] dArr) {
        double d13 = (d10 + 16.0d) / 116.0d;
        double d14 = (d11 / 500.0d) + d13;
        double d15 = d13 - (d12 / 200.0d);
        double dPow = Math.pow(d14, 3.0d);
        if (dPow <= XYZ_EPSILON) {
            dPow = ((d14 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        double dPow2 = d10 > 7.9996247999999985d ? Math.pow(d13, 3.0d) : d10 / XYZ_KAPPA;
        double dPow3 = Math.pow(d15, 3.0d);
        if (dPow3 <= XYZ_EPSILON) {
            dPow3 = ((d15 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        dArr[0] = dPow * XYZ_WHITE_REFERENCE_X;
        dArr[1] = dPow2 * XYZ_WHITE_REFERENCE_Y;
        dArr[2] = dPow3 * XYZ_WHITE_REFERENCE_Z;
    }

    @ColorInt
    public static int M3HCTToColor(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 360.0d, toInclusive = false) float f, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = XYZ_WHITE_REFERENCE_Y) float f7) {
        return CamColor.toColor(f, f3, f7);
    }

    public static void RGBToHSL(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i4, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i6, float[] fArr) {
        float f;
        float fAbs;
        float f3 = i / 255.0f;
        float f7 = i4 / 255.0f;
        float f10 = i6 / 255.0f;
        float fMax = Math.max(f3, Math.max(f7, f10));
        float fMin = Math.min(f3, Math.min(f7, f10));
        float f11 = fMax - fMin;
        float f12 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            f = fMax == f3 ? ((f7 - f10) / f11) % 6.0f : fMax == f7 ? ((f10 - f3) / f11) + 2.0f : 4.0f + ((f3 - f7) / f11);
            fAbs = f11 / (1.0f - Math.abs((2.0f * f12) - 1.0f));
        }
        float f13 = (f * 60.0f) % 360.0f;
        if (f13 < 0.0f) {
            f13 += 360.0f;
        }
        fArr[0] = constrain(f13, 0.0f, 360.0f);
        fArr[1] = constrain(fAbs, 0.0f, 1.0f);
        fArr[2] = constrain(f12, 0.0f, 1.0f);
    }

    public static void RGBToLAB(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i4, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i6, double[] dArr) {
        RGBToXYZ(i, i4, i6, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i4, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i6, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = ((double) i) / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) i4) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) i6) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * XYZ_WHITE_REFERENCE_Y;
        dArr[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * XYZ_WHITE_REFERENCE_Y;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * XYZ_WHITE_REFERENCE_Y;
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = XYZ_WHITE_REFERENCE_X) double d10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = XYZ_WHITE_REFERENCE_Y) double d11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = XYZ_WHITE_REFERENCE_Z) double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / XYZ_WHITE_REFERENCE_Y;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / XYZ_WHITE_REFERENCE_Y;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / XYZ_WHITE_REFERENCE_Y;
        return Color.rgb(constrain((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d), 0, 255));
    }

    public static void XYZToLAB(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = XYZ_WHITE_REFERENCE_X) double d10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = XYZ_WHITE_REFERENCE_Y) double d11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = XYZ_WHITE_REFERENCE_Z) double d12, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dPivotXyzComponent = pivotXyzComponent(d10 / XYZ_WHITE_REFERENCE_X);
        double dPivotXyzComponent2 = pivotXyzComponent(d11 / XYZ_WHITE_REFERENCE_Y);
        double dPivotXyzComponent3 = pivotXyzComponent(d12 / XYZ_WHITE_REFERENCE_Z);
        dArr[0] = Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (116.0d * dPivotXyzComponent2) - 16.0d);
        dArr[1] = (dPivotXyzComponent - dPivotXyzComponent2) * 500.0d;
        dArr[2] = (dPivotXyzComponent2 - dPivotXyzComponent3) * 200.0d;
    }

    @ColorInt
    public static int blendARGB(@ColorInt int i, @ColorInt int i4, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        float f3 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i4) * f) + (Color.alpha(i) * f3)), (int) ((Color.red(i4) * f) + (Color.red(i) * f3)), (int) ((Color.green(i4) * f) + (Color.green(i) * f3)), (int) ((Color.blue(i4) * f) + (Color.blue(i) * f3)));
    }

    public static void blendHSL(float[] fArr, float[] fArr2, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f, float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f3 = 1.0f - f;
        fArr3[0] = circularInterpolate(fArr[0], fArr2[0], f);
        fArr3[1] = (fArr2[1] * f) + (fArr[1] * f3);
        fArr3[2] = (fArr2[2] * f) + (fArr[2] * f3);
    }

    public static void blendLAB(double[] dArr, double[] dArr2, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) double d10, double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d11 = 1.0d - d10;
        dArr3[0] = (dArr2[0] * d10) + (dArr[0] * d11);
        dArr3[1] = (dArr2[1] * d10) + (dArr[1] * d11);
        dArr3[2] = (dArr2[2] * d10) + (dArr[2] * d11);
    }

    public static double calculateContrast(@ColorInt int i, @ColorInt int i4) {
        if (Color.alpha(i4) != 255) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.e(i4, new StringBuilder("background can not be translucent: #")));
        }
        if (Color.alpha(i) < 255) {
            i = compositeColors(i, i4);
        }
        double dCalculateLuminance = calculateLuminance(i) + 0.05d;
        double dCalculateLuminance2 = calculateLuminance(i4) + 0.05d;
        return Math.max(dCalculateLuminance, dCalculateLuminance2) / Math.min(dCalculateLuminance, dCalculateLuminance2);
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d)
    public static double calculateLuminance(@ColorInt int i) {
        double[] tempDouble3Array = getTempDouble3Array();
        colorToXYZ(i, tempDouble3Array);
        return tempDouble3Array[1] / XYZ_WHITE_REFERENCE_Y;
    }

    public static int calculateMinimumAlpha(@ColorInt int i, @ColorInt int i4, float f) {
        int i6 = 255;
        if (Color.alpha(i4) != 255) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.e(i4, new StringBuilder("background can not be translucent: #")));
        }
        double d10 = f;
        if (calculateContrast(setAlphaComponent(i, 255), i4) < d10) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 <= 10 && i6 - i10 > 1; i11++) {
            int i12 = (i10 + i6) / 2;
            if (calculateContrast(setAlphaComponent(i, i12), i4) < d10) {
                i10 = i12;
            } else {
                i6 = i12;
            }
        }
        return i6;
    }

    @VisibleForTesting
    public static float circularInterpolate(float f, float f3, float f7) {
        if (Math.abs(f3 - f) > 180.0f) {
            if (f3 > f) {
                f += 360.0f;
            } else {
                f3 += 360.0f;
            }
        }
        return (((f3 - f) * f7) + f) % 360.0f;
    }

    public static void colorToHSL(@ColorInt int i, float[] fArr) {
        RGBToHSL(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void colorToLAB(@ColorInt int i, double[] dArr) {
        RGBToLAB(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static void colorToM3HCT(@ColorInt int i, @Size(ImageCapture.SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS) float[] fArr) {
        CamColor.getM3HCTfromColor(i, fArr);
    }

    public static void colorToXYZ(@ColorInt int i, double[] dArr) {
        RGBToXYZ(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    private static int compositeAlpha(int i, int i4) {
        return 255 - (((255 - i) * (255 - i4)) / 255);
    }

    public static int compositeColors(@ColorInt int i, @ColorInt int i4) {
        int iAlpha = Color.alpha(i4);
        int iAlpha2 = Color.alpha(i);
        int iCompositeAlpha = compositeAlpha(iAlpha2, iAlpha);
        return Color.argb(iCompositeAlpha, compositeComponent(Color.red(i), iAlpha2, Color.red(i4), iAlpha, iCompositeAlpha), compositeComponent(Color.green(i), iAlpha2, Color.green(i4), iAlpha, iCompositeAlpha), compositeComponent(Color.blue(i), iAlpha2, Color.blue(i4), iAlpha, iCompositeAlpha));
    }

    private static int compositeComponent(int i, int i4, int i6, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((255 - i4) * (i6 * i10)) + ((i * 255) * i4)) / (i11 * 255);
    }

    private static float constrain(float f, float f3, float f7) {
        return f < f3 ? f3 : Math.min(f, f7);
    }

    public static double distanceEuclidean(double[] dArr, double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[0] - dArr2[0], 2.0d));
    }

    private static double[] getTempDouble3Array() {
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static double pivotXyzComponent(double d10) {
        return d10 > XYZ_EPSILON ? Math.pow(d10, 0.3333333333333333d) : ((d10 * XYZ_KAPPA) + 16.0d) / 116.0d;
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int i, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i4) {
        if (i4 < 0 || i4 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i4 << 24);
    }

    private static int constrain(int i, int i4, int i6) {
        return i < i4 ? i4 : Math.min(i, i6);
    }

    @RequiresApi(26)
    public static Color compositeColors(Color color, Color color2) {
        return Api26Impl.compositeColors(color, color2);
    }
}
