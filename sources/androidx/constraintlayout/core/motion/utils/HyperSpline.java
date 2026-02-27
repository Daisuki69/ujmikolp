package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class HyperSpline {
    double[][] mCtl;
    Cubic[][] mCurve;
    double[] mCurveLength;
    int mDimensionality;
    int mPoints;
    double mTotalLength;

    public static class Cubic {
        double mA;
        double mB;
        double mC;
        double mD;

        public Cubic(double d10, double d11, double d12, double d13) {
            this.mA = d10;
            this.mB = d11;
            this.mC = d12;
            this.mD = d13;
        }

        public double eval(double d10) {
            return (((((this.mD * d10) + this.mC) * d10) + this.mB) * d10) + this.mA;
        }

        public double vel(double d10) {
            return (((this.mC * 2.0d) + (this.mD * 3.0d * d10)) * d10) + this.mB;
        }
    }

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    public static Cubic[] calcNaturalCubic(int i, double[] dArr) {
        double[] dArr2 = new double[i];
        double[] dArr3 = new double[i];
        double[] dArr4 = new double[i];
        int i4 = i - 1;
        int i6 = 0;
        dArr2[0] = 0.5d;
        int i10 = 1;
        for (int i11 = 1; i11 < i4; i11++) {
            dArr2[i11] = 1.0d / (4.0d - dArr2[i11 - 1]);
        }
        int i12 = i - 2;
        dArr2[i4] = 1.0d / (2.0d - dArr2[i12]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i10 < i4) {
            int i13 = i10 + 1;
            int i14 = i10 - 1;
            dArr3[i10] = (((dArr[i13] - dArr[i14]) * 3.0d) - dArr3[i14]) * dArr2[i10];
            i10 = i13;
        }
        double d10 = (((dArr[i4] - dArr[i12]) * 3.0d) - dArr3[i12]) * dArr2[i4];
        dArr3[i4] = d10;
        dArr4[i4] = d10;
        while (i12 >= 0) {
            dArr4[i12] = dArr3[i12] - (dArr2[i12] * dArr4[i12 + 1]);
            i12--;
        }
        Cubic[] cubicArr = new Cubic[i4];
        while (i6 < i4) {
            double d11 = dArr[i6];
            double d12 = dArr4[i6];
            int i15 = i6 + 1;
            double d13 = dArr[i15];
            double d14 = dArr4[i15];
            cubicArr[i6] = new Cubic((float) d11, d12, (((d13 - d11) * 3.0d) - (d12 * 2.0d)) - d14, ((d11 - d13) * 2.0d) + d12 + d14);
            i6 = i15;
        }
        return cubicArr;
    }

    public double approxLength(Cubic[] cubicArr) {
        int i;
        int length = cubicArr.length;
        double[] dArr = new double[cubicArr.length];
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d11 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i = 0;
            if (d11 >= 1.0d) {
                break;
            }
            double d12 = 0.0d;
            while (i < cubicArr.length) {
                double d13 = dArr[i];
                double dEval = cubicArr[i].eval(d11);
                dArr[i] = dEval;
                double d14 = d13 - dEval;
                d12 += d14 * d14;
                i++;
            }
            if (d11 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                dSqrt += Math.sqrt(d12);
            }
            d11 += 0.1d;
        }
        while (i < cubicArr.length) {
            double d15 = dArr[i];
            double dEval2 = cubicArr[i].eval(1.0d);
            dArr[i] = dEval2;
            double d16 = d15 - dEval2;
            d10 += d16 * d16;
            i++;
        }
        return Math.sqrt(d10) + dSqrt;
    }

    public void getPos(double d10, double[] dArr) {
        double d11 = d10 * this.mTotalLength;
        int i = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d12 = dArr2[i];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i++;
        }
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr[i4] = this.mCurve[i4][i].eval(d11 / this.mCurveLength[i]);
        }
    }

    public void getVelocity(double d10, double[] dArr) {
        double d11 = d10 * this.mTotalLength;
        int i = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d12 = dArr2[i];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i++;
        }
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr[i4] = this.mCurve[i4][i].vel(d11 / this.mCurveLength[i]);
        }
    }

    public void setup(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.mDimensionality = length;
        int length2 = dArr.length;
        this.mPoints = length2;
        this.mCtl = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.mCurve = new Cubic[this.mDimensionality][];
        for (int i4 = 0; i4 < this.mDimensionality; i4++) {
            for (int i6 = 0; i6 < this.mPoints; i6++) {
                this.mCtl[i4][i6] = dArr[i6][i4];
            }
        }
        int i10 = 0;
        while (true) {
            i = this.mDimensionality;
            if (i10 >= i) {
                break;
            }
            Cubic[][] cubicArr = this.mCurve;
            double[] dArr2 = this.mCtl[i10];
            cubicArr[i10] = calcNaturalCubic(dArr2.length, dArr2);
            i10++;
        }
        this.mCurveLength = new double[this.mPoints - 1];
        this.mTotalLength = AudioStats.AUDIO_AMPLITUDE_NONE;
        Cubic[] cubicArr2 = new Cubic[i];
        for (int i11 = 0; i11 < this.mCurveLength.length; i11++) {
            for (int i12 = 0; i12 < this.mDimensionality; i12++) {
                cubicArr2[i12] = this.mCurve[i12][i11];
            }
            double d10 = this.mTotalLength;
            double[] dArr3 = this.mCurveLength;
            double dApproxLength = approxLength(cubicArr2);
            dArr3[i11] = dApproxLength;
            this.mTotalLength = d10 + dApproxLength;
        }
    }

    public HyperSpline() {
    }

    public void getPos(double d10, float[] fArr) {
        double d11 = d10 * this.mTotalLength;
        int i = 0;
        while (true) {
            double[] dArr = this.mCurveLength;
            if (i >= dArr.length - 1) {
                break;
            }
            double d12 = dArr[i];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i++;
        }
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr[i4] = (float) this.mCurve[i4][i].eval(d11 / this.mCurveLength[i]);
        }
    }

    public double getPos(double d10, int i) {
        double[] dArr;
        double d11 = d10 * this.mTotalLength;
        int i4 = 0;
        while (true) {
            dArr = this.mCurveLength;
            if (i4 >= dArr.length - 1) {
                break;
            }
            double d12 = dArr[i4];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i4++;
        }
        return this.mCurve[i][i4].eval(d11 / dArr[i4]);
    }
}
