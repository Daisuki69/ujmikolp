package androidx.constraintlayout.core.motion.utils;

import We.s;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.MotionWidget;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class KeyCycleOscillator {
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    private CycleOscillator mCycleOscillator;
    private String mType;
    private int mWaveShape = 0;
    private String mWaveString = null;
    public int mVariesBy = 0;
    ArrayList<WavePoint> mWavePoints = new ArrayList<>();

    public static class CoreSpline extends KeyCycleOscillator {
        String type;
        int typeId;

        public CoreSpline(String str) {
            this.type = str;
            this.typeId = c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f) {
            motionWidget.setValue(this.typeId, get(f));
        }
    }

    public static class CycleOscillator {
        private static final String TAG = "CycleOscillator";
        static final int UNSET = -1;
        private final int OFFST;
        private final int PHASE;
        private final int VALUE;
        CurveFit mCurveFit;
        float[] mOffset;
        Oscillator mOscillator;
        float mPathLength;
        float[] mPeriod;
        float[] mPhase;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        public CycleOscillator(int i, String str, int i4, int i6) {
            Oscillator oscillator = new Oscillator();
            this.mOscillator = oscillator;
            this.OFFST = 0;
            this.PHASE = 1;
            this.VALUE = 2;
            this.mWaveShape = i;
            this.mVariesBy = i4;
            oscillator.setType(i, str);
            this.mValues = new float[i6];
            this.mPosition = new double[i6];
            this.mPeriod = new float[i6];
            this.mOffset = new float[i6];
            this.mPhase = new float[i6];
            this.mScale = new float[i6];
        }

        public double getLastPhase() {
            return this.mSplineValueCache[1];
        }

        public double getSlope(float f) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d10 = f;
                curveFit.getSlope(d10, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d10, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d11 = f;
            double value = this.mOscillator.getValue(d11, this.mSplineValueCache[1]);
            double slope = this.mOscillator.getSlope(d11, this.mSplineValueCache[1], this.mSplineSlopeCache[1]);
            double[] dArr2 = this.mSplineSlopeCache;
            return (slope * this.mSplineValueCache[2]) + (value * dArr2[2]) + dArr2[0];
        }

        public double getValues(float f) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos(f, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = this.mOffset[0];
                dArr[1] = this.mPhase[0];
                dArr[2] = this.mValues[0];
            }
            double[] dArr2 = this.mSplineValueCache;
            return (this.mOscillator.getValue(f, dArr2[1]) * this.mSplineValueCache[2]) + dArr2[0];
        }

        public void setPoint(int i, int i4, float f, float f3, float f7, float f10) {
            this.mPosition[i] = ((double) i4) / 100.0d;
            this.mPeriod[i] = f;
            this.mOffset[i] = f3;
            this.mPhase[i] = f7;
            this.mValues[i] = f10;
        }

        public void setup(float f) {
            this.mPathLength = f;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.mPosition.length, 3);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[fArr.length + 2];
            this.mSplineSlopeCache = new double[fArr.length + 2];
            if (this.mPosition[0] > AudioStats.AUDIO_AMPLITUDE_NONE) {
                this.mOscillator.addPoint(AudioStats.AUDIO_AMPLITUDE_NONE, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.mOffset[i];
                dArr3[1] = this.mPhase[i];
                dArr3[2] = this.mValues[i];
                this.mOscillator.addPoint(this.mPosition[i], this.mPeriod[i]);
            }
            this.mOscillator.normalize();
            double[] dArr4 = this.mPosition;
            if (dArr4.length > 1) {
                this.mCurveFit = CurveFit.get(0, dArr4, dArr);
            } else {
                this.mCurveFit = null;
            }
        }
    }

    public static class IntDoubleSort {
        private IntDoubleSort() {
        }

        private static int partition(int[] iArr, float[] fArr, int i, int i4) {
            int i6 = iArr[i4];
            int i10 = i;
            while (i < i4) {
                if (iArr[i] <= i6) {
                    swap(iArr, fArr, i10, i);
                    i10++;
                }
                i++;
            }
            swap(iArr, fArr, i10, i4);
            return i10;
        }

        public static void sort(int[] iArr, float[] fArr, int i, int i4) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i4;
            iArr2[1] = i;
            int i6 = 2;
            while (i6 > 0) {
                int i10 = iArr2[i6 - 1];
                int i11 = i6 - 2;
                int i12 = iArr2[i11];
                if (i10 < i12) {
                    int iPartition = partition(iArr, fArr, i10, i12);
                    iArr2[i11] = iPartition - 1;
                    iArr2[i6 - 1] = i10;
                    int i13 = i6 + 1;
                    iArr2[i6] = i12;
                    i6 += 2;
                    iArr2[i13] = iPartition + 1;
                } else {
                    i6 = i11;
                }
            }
        }

        private static void swap(int[] iArr, float[] fArr, int i, int i4) {
            int i6 = iArr[i];
            iArr[i] = iArr[i4];
            iArr[i4] = i6;
            float f = fArr[i];
            fArr[i] = fArr[i4];
            fArr[i4] = f;
        }
    }

    public static class IntFloatFloatSort {
        private IntFloatFloatSort() {
        }

        private static int partition(int[] iArr, float[] fArr, float[] fArr2, int i, int i4) {
            int i6 = iArr[i4];
            int i10 = i;
            while (i < i4) {
                if (iArr[i] <= i6) {
                    swap(iArr, fArr, fArr2, i10, i);
                    i10++;
                }
                i++;
            }
            swap(iArr, fArr, fArr2, i10, i4);
            return i10;
        }

        public static void sort(int[] iArr, float[] fArr, float[] fArr2, int i, int i4) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i4;
            iArr2[1] = i;
            int i6 = 2;
            while (i6 > 0) {
                int i10 = iArr2[i6 - 1];
                int i11 = i6 - 2;
                int i12 = iArr2[i11];
                if (i10 < i12) {
                    int iPartition = partition(iArr, fArr, fArr2, i10, i12);
                    iArr2[i11] = iPartition - 1;
                    iArr2[i6 - 1] = i10;
                    int i13 = i6 + 1;
                    iArr2[i6] = i12;
                    i6 += 2;
                    iArr2[i13] = iPartition + 1;
                } else {
                    i6 = i11;
                }
            }
        }

        private static void swap(int[] iArr, float[] fArr, float[] fArr2, int i, int i4) {
            int i6 = iArr[i];
            iArr[i] = iArr[i4];
            iArr[i4] = i6;
            float f = fArr[i];
            fArr[i] = fArr[i4];
            fArr[i4] = f;
            float f3 = fArr2[i];
            fArr2[i] = fArr2[i4];
            fArr2[i4] = f3;
        }
    }

    public static class PathRotateSet extends KeyCycleOscillator {
        String type;
        int typeId;

        public PathRotateSet(String str) {
            this.type = str;
            this.typeId = c.a(str);
        }

        public void setPathRotate(MotionWidget motionWidget, float f, double d10, double d11) {
            motionWidget.setRotationZ(get(f) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f) {
            motionWidget.setValue(this.typeId, get(f));
        }
    }

    public static class WavePoint {
        float mOffset;
        float mPeriod;
        float mPhase;
        int mPosition;
        float mValue;

        public WavePoint(int i, float f, float f3, float f7, float f10) {
            this.mPosition = i;
            this.mValue = f10;
            this.mOffset = f3;
            this.mPeriod = f;
            this.mPhase = f7;
        }
    }

    public static KeyCycleOscillator makeWidgetCycle(String str) {
        return str.equals("pathRotate") ? new PathRotateSet(str) : new CoreSpline(str);
    }

    public float get(float f) {
        return (float) this.mCycleOscillator.getValues(f);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f) {
        return (float) this.mCycleOscillator.getSlope(f);
    }

    public void setCustom(Object obj) {
    }

    public void setPoint(int i, int i4, String str, int i6, float f, float f3, float f7, float f10, Object obj) {
        this.mWavePoints.add(new WavePoint(i, f, f3, f7, f10));
        if (i6 != -1) {
            this.mVariesBy = i6;
        }
        this.mWaveShape = i4;
        setCustom(obj);
        this.mWaveString = str;
    }

    public void setProperty(MotionWidget motionWidget, float f) {
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(float f) {
        int size = this.mWavePoints.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.mWavePoints, new Comparator<WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
            @Override // java.util.Comparator
            public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                return Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
            }
        });
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, size);
        int i = 0;
        for (WavePoint wavePoint : this.mWavePoints) {
            float f3 = wavePoint.mPeriod;
            dArr[i] = ((double) f3) * 0.01d;
            double[] dArr3 = dArr2[i];
            float f7 = wavePoint.mValue;
            dArr3[0] = f7;
            float f10 = wavePoint.mOffset;
            dArr3[1] = f10;
            float f11 = wavePoint.mPhase;
            dArr3[2] = f11;
            this.mCycleOscillator.setPoint(i, wavePoint.mPosition, f3, f10, f11, f7);
            i++;
        }
        this.mCycleOscillator.setup(f);
        this.mCurveFit = CurveFit.get(0, dArr, dArr2);
    }

    public String toString() {
        String string = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (WavePoint wavePoint : this.mWavePoints) {
            StringBuilder sbV = s.v(string, "[");
            sbV.append(wavePoint.mPosition);
            sbV.append(" , ");
            sbV.append(decimalFormat.format(wavePoint.mValue));
            sbV.append("] ");
            string = sbV.toString();
        }
        return string;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    public void setPoint(int i, int i4, String str, int i6, float f, float f3, float f7, float f10) {
        this.mWavePoints.add(new WavePoint(i, f, f3, f7, f10));
        if (i6 != -1) {
            this.mVariesBy = i6;
        }
        this.mWaveShape = i4;
        this.mWaveString = str;
    }
}
