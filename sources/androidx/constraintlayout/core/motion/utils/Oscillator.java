package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double[] mArea;
    MonotonicCurveFit mCustomCurve;
    String mCustomType;
    int mType;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    double PI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public void addPoint(double d10, float f) {
        int length = this.mPeriod.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.mPosition[iBinarySearch] = d10;
        this.mPeriod[iBinarySearch] = f;
        this.mNormalized = false;
    }

    public double getDP(double d10) {
        if (d10 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d10 = 1.0E-5d;
        } else if (d10 >= 1.0d) {
            d10 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d10);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int i = -iBinarySearch;
        int i4 = i - 1;
        float[] fArr = this.mPeriod;
        float f = fArr[i4];
        int i6 = i - 2;
        float f3 = fArr[i6];
        double[] dArr = this.mPosition;
        double d11 = dArr[i4];
        double d12 = dArr[i6];
        double d13 = ((double) (f - f3)) / (d11 - d12);
        return (((double) f3) - (d13 * d12)) + (d10 * d13);
    }

    public double getP(double d10) {
        if (d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d10 = 0.0d;
        } else if (d10 > 1.0d) {
            d10 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d10);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int i = -iBinarySearch;
        int i4 = i - 1;
        float[] fArr = this.mPeriod;
        float f = fArr[i4];
        int i6 = i - 2;
        float f3 = fArr[i6];
        double[] dArr = this.mPosition;
        double d11 = dArr[i4];
        double d12 = dArr[i6];
        double d13 = ((double) (f - f3)) / (d11 - d12);
        return ((((d10 * d10) - (d12 * d12)) * d13) / 2.0d) + ((d10 - d12) * (((double) f3) - (d13 * d12))) + this.mArea[i6];
    }

    public double getSlope(double d10, double d11, double d12) {
        double d13;
        double dSignum;
        double p10 = getP(d10) + d11;
        double dp = getDP(d10) + d12;
        switch (this.mType) {
            case 1:
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            case 2:
                d13 = dp * 4.0d;
                dSignum = Math.signum((((p10 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return dp * 2.0d;
            case 4:
                return (-dp) * 2.0d;
            case 5:
                double d14 = this.PI2;
                return Math.sin(d14 * p10) * (-d14) * dp;
            case 6:
                return ((((p10 * 4.0d) + 2.0d) % 4.0d) - 2.0d) * dp * 4.0d;
            case 7:
                return this.mCustomCurve.getSlope(p10 % 1.0d, 0);
            default:
                double d15 = this.PI2;
                d13 = dp * d15;
                dSignum = Math.cos(d15 * p10);
                break;
        }
        return dSignum * d13;
    }

    public double getValue(double d10, double d11) {
        double dAbs;
        double p10 = getP(d10) + d11;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (p10 % 1.0d));
            case 2:
                dAbs = Math.abs((((p10 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((p10 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((p10 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d11 + p10) * this.PI2);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((p10 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.mCustomCurve.getPos(p10 % 1.0d, 0);
            default:
                return Math.sin(this.PI2 * p10);
        }
        return 1.0d - dAbs;
    }

    public void normalize() {
        double d10 = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i >= fArr.length) {
                break;
            }
            d10 += (double) fArr[i];
            i++;
        }
        double d11 = 0.0d;
        int i4 = 1;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i4 >= fArr2.length) {
                break;
            }
            int i6 = i4 - 1;
            float f = (fArr2[i6] + fArr2[i4]) / 2.0f;
            double[] dArr = this.mPosition;
            d11 += (dArr[i4] - dArr[i6]) * ((double) f);
            i4++;
        }
        int i10 = 0;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i10 >= fArr3.length) {
                break;
            }
            fArr3[i10] = (float) (((double) fArr3[i10]) * (d10 / d11));
            i10++;
        }
        this.mArea[0] = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr4 = this.mPeriod;
            if (i11 >= fArr4.length) {
                this.mNormalized = true;
                return;
            }
            int i12 = i11 - 1;
            float f3 = (fArr4[i12] + fArr4[i11]) / 2.0f;
            double[] dArr2 = this.mPosition;
            double d12 = dArr2[i11] - dArr2[i12];
            double[] dArr3 = this.mArea;
            dArr3[i11] = (d12 * ((double) f3)) + dArr3[i12];
            i11++;
        }
    }

    public void setType(int i, String str) {
        this.mType = i;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }
}
