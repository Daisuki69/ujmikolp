package androidx.constraintlayout.core.motion;

import We.s;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    HashMap<String, CustomVariable> customAttributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    float mRelativeAngle;
    Motion mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    float f7744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f7745y;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f, float f3) {
        return (Float.isNaN(f) || Float.isNaN(f3)) ? Float.isNaN(f) != Float.isNaN(f3) : Math.abs(f - f3) > 1.0E-6f;
    }

    private static final float xRotate(float f, float f3, float f7, float f10, float f11, float f12) {
        return (((f11 - f7) * f3) - ((f12 - f10) * f)) + f7;
    }

    private static final float yRotate(float f, float f3, float f7, float f10, float f11, float f12) {
        return ((f12 - f10) * f3) + ((f11 - f7) * f) + f10;
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.motion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.propertySet.mProgress;
        this.mRelativeAngle = 0.0f;
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.customAttributes.put(str, customAttribute);
            }
        }
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos(this.mProgress);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z4) {
        boolean zDiff = diff(this.f7744x, motionPaths.f7744x);
        boolean zDiff2 = diff(this.f7745y, motionPaths.f7745y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z5 = zDiff | zDiff2 | z4;
        zArr[1] = zArr[1] | z5;
        zArr[2] = z5 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f7744x, this.f7745y, this.width, this.height, this.mPathRotate};
        int i = 0;
        for (int i4 : iArr) {
            if (i4 < 6) {
                dArr[i] = fArr[r2];
                i++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.width;
        float f3 = this.height;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f7 = (float) dArr[i4];
            int i6 = iArr[i4];
            if (i6 == 3) {
                f = f7;
            } else if (i6 == 4) {
                f3 = f7;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f3;
    }

    public void getCenter(double d10, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f7744x;
        float fCos = this.f7745y;
        float f = this.width;
        float f3 = this.height;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f7 = (float) dArr[i4];
            int i6 = iArr[i4];
            if (i6 == 1) {
                fSin = f7;
            } else if (i6 == 2) {
                fCos = f7;
            } else if (i6 == 3) {
                f = f7;
            } else if (i6 == 4) {
                f3 = f7;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d10, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d11 = f10;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f11) - (Math.cos(d13) * d12)) - ((double) (f3 / 2.0f)));
        }
        fArr[i] = (f / 2.0f) + fSin + 0.0f;
        fArr[i + 1] = (f3 / 2.0f) + fCos + 0.0f;
    }

    public void getCenterVelocity(double d10, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f7744x;
        float fCos = this.f7745y;
        float f = this.width;
        float f3 = this.height;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f7 = (float) dArr[i4];
            int i6 = iArr[i4];
            if (i6 == 1) {
                fSin = f7;
            } else if (i6 == 2) {
                fCos = f7;
            } else if (i6 == 3) {
                f = f7;
            } else if (i6 == 4) {
                f3 = f7;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d10, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d11 = f10;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f11) - (Math.cos(d13) * d12)) - ((double) (f3 / 2.0f)));
        }
        fArr[i] = (f / 2.0f) + fSin + 0.0f;
        fArr[i + 1] = (f3 / 2.0f) + fCos + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i) {
        CustomVariable customVariable = this.customAttributes.get(str);
        int i4 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i] = customVariable.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        while (i4 < iNumberOfInterpolatedValues) {
            dArr[i] = r2[i4];
            i4++;
            i++;
        }
        return iNumberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        CustomVariable customVariable = this.customAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f7744x;
        float fCos = this.f7745y;
        float f3 = this.width;
        float f7 = this.height;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f10 = (float) dArr[i4];
            int i6 = iArr[i4];
            if (i6 == 1) {
                f = f10;
            } else if (i6 == 2) {
                fCos = f10;
            } else if (i6 == 3) {
                f3 = f10;
            } else if (i6 == 4) {
                f7 = f10;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d10 = f;
            double d11 = fCos;
            float fSin = (float) (((Math.sin(d11) * d10) + ((double) centerX)) - ((double) (f3 / 2.0f)));
            fCos = (float) ((((double) centerY) - (Math.cos(d11) * d10)) - ((double) (f7 / 2.0f)));
            f = fSin;
        }
        float f11 = f3 + f;
        float f12 = f7 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i] = f + 0.0f;
        fArr[i + 1] = fCos + 0.0f;
        fArr[i + 2] = f11 + 0.0f;
        fArr[i + 3] = fCos + 0.0f;
        fArr[i + 4] = f11 + 0.0f;
        fArr[i + 5] = f12 + 0.0f;
        fArr[i + 6] = f + 0.0f;
        fArr[i + 7] = f12 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.customAttributes.containsKey(str);
    }

    public void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f3 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f : motionKeyPosition.mPercentWidth;
        float f7 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f : motionKeyPosition.mPercentHeight;
        float f10 = motionPaths2.width;
        float f11 = motionPaths.width;
        float f12 = f10 - f11;
        float f13 = motionPaths2.height;
        float f14 = motionPaths.height;
        float f15 = f13 - f14;
        this.position = this.time;
        float f16 = motionPaths.f7744x;
        float f17 = motionPaths.f7745y;
        float f18 = f;
        float f19 = ((f10 / 2.0f) + motionPaths2.f7744x) - ((f11 / 2.0f) + f16);
        float f20 = ((f13 / 2.0f) + motionPaths2.f7745y) - ((f14 / 2.0f) + f17);
        float f21 = (f12 * f3) / 2.0f;
        this.f7744x = (int) (((f19 * f18) + f16) - f21);
        float f22 = (f15 * f7) / 2.0f;
        this.f7745y = (int) (((f20 * f18) + f17) - f22);
        this.width = (int) (f11 + r9);
        this.height = (int) (f14 + r12);
        float f23 = Float.isNaN(motionKeyPosition.mPercentX) ? f18 : motionKeyPosition.mPercentX;
        float f24 = Float.isNaN(motionKeyPosition.mAltPercentY) ? 0.0f : motionKeyPosition.mAltPercentY;
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f18 = motionKeyPosition.mPercentY;
        }
        float f25 = Float.isNaN(motionKeyPosition.mAltPercentX) ? 0.0f : motionKeyPosition.mAltPercentX;
        this.mMode = 0;
        this.f7744x = (int) (((f25 * f20) + ((f23 * f19) + motionPaths.f7744x)) - f21);
        this.f7745y = (int) (((f20 * f18) + ((f19 * f24) + motionPaths.f7745y)) - f22);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f3 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f : motionKeyPosition.mPercentWidth;
        float f7 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f : motionKeyPosition.mPercentHeight;
        float f10 = motionPaths2.width - motionPaths.width;
        float f11 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f = motionKeyPosition.mPercentX;
        }
        float f12 = motionPaths.f7744x;
        float f13 = motionPaths.width;
        float f14 = motionPaths.f7745y;
        float f15 = motionPaths.height;
        float f16 = f;
        float f17 = ((motionPaths2.width / 2.0f) + motionPaths2.f7744x) - ((f13 / 2.0f) + f12);
        float f18 = ((motionPaths2.height / 2.0f) + motionPaths2.f7745y) - ((f15 / 2.0f) + f14);
        float f19 = f17 * f16;
        float f20 = (f10 * f3) / 2.0f;
        this.f7744x = (int) ((f12 + f19) - f20);
        float f21 = f18 * f16;
        float f22 = (f11 * f7) / 2.0f;
        this.f7745y = (int) ((f14 + f21) - f22);
        this.width = (int) (f13 + r7);
        this.height = (int) (f15 + r8);
        float f23 = Float.isNaN(motionKeyPosition.mPercentY) ? 0.0f : motionKeyPosition.mPercentY;
        this.mMode = 1;
        float f24 = (int) ((motionPaths.f7744x + f19) - f20);
        float f25 = (int) ((motionPaths.f7745y + f21) - f22);
        this.f7744x = f24 + ((-f18) * f23);
        this.f7745y = f25 + (f17 * f23);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPolar(int i, int i4, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float fA;
        float f = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mMode = motionKeyPosition.mPositionType;
        float f3 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f : motionKeyPosition.mPercentWidth;
        float f7 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f : motionKeyPosition.mPercentHeight;
        float f10 = motionPaths2.width;
        float f11 = motionPaths.width;
        float f12 = motionPaths2.height;
        float f13 = motionPaths.height;
        this.position = this.time;
        this.width = (int) (((f10 - f11) * f3) + f11);
        this.height = (int) (((f12 - f13) * f7) + f13);
        int i6 = motionKeyPosition.mPositionType;
        if (i6 == 1) {
            float f14 = Float.isNaN(motionKeyPosition.mPercentX) ? f : motionKeyPosition.mPercentX;
            float f15 = motionPaths2.f7744x;
            float f16 = motionPaths.f7744x;
            this.f7744x = s.a(f15, f16, f14, f16);
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f = motionKeyPosition.mPercentY;
            }
            float f17 = motionPaths2.f7745y;
            float f18 = motionPaths.f7745y;
            this.f7745y = s.a(f17, f18, f, f18);
        } else if (i6 != 2) {
            float f19 = Float.isNaN(motionKeyPosition.mPercentX) ? f : motionKeyPosition.mPercentX;
            float f20 = motionPaths2.f7744x;
            float f21 = motionPaths.f7744x;
            this.f7744x = s.a(f20, f21, f19, f21);
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f = motionKeyPosition.mPercentY;
            }
            float f22 = motionPaths2.f7745y;
            float f23 = motionPaths.f7745y;
            this.f7745y = s.a(f22, f23, f, f23);
        } else {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                float f24 = motionPaths2.f7744x;
                float f25 = motionPaths.f7744x;
                fMin = s.a(f24, f25, f, f25);
            } else {
                fMin = Math.min(f7, f3) * motionKeyPosition.mPercentX;
            }
            this.f7744x = fMin;
            if (Float.isNaN(motionKeyPosition.mPercentY)) {
                float f26 = motionPaths2.f7745y;
                float f27 = motionPaths.f7745y;
                fA = s.a(f26, f27, f, f27);
            } else {
                fA = motionKeyPosition.mPercentY;
            }
            this.f7745y = fA;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initScreen(int i, int i4, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f3 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f : motionKeyPosition.mPercentWidth;
        float f7 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f : motionKeyPosition.mPercentHeight;
        float f10 = motionPaths2.width;
        float f11 = f10 - motionPaths.width;
        float f12 = motionPaths2.height;
        float f13 = f12 - motionPaths.height;
        this.position = this.time;
        float f14 = motionPaths.f7744x;
        float f15 = motionPaths.f7745y;
        float f16 = (f10 / 2.0f) + motionPaths2.f7744x;
        float f17 = (f12 / 2.0f) + motionPaths2.f7745y;
        float f18 = f11 * f3;
        this.f7744x = (int) ((((f16 - ((r8 / 2.0f) + f14)) * f) + f14) - (f18 / 2.0f));
        float f19 = f13 * f7;
        this.f7745y = (int) ((((f17 - ((r11 / 2.0f) + f15)) * f) + f15) - (f19 / 2.0f));
        this.width = (int) (r8 + f18);
        this.height = (int) (r11 + f19);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f7744x = (int) (motionKeyPosition.mPercentX * ((int) (i - this.width)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f7745y = (int) (motionKeyPosition.mPercentY * ((int) (i4 - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void setBounds(float f, float f3, float f7, float f10) {
        this.f7744x = f;
        this.f7745y = f3;
        this.width = f7;
        this.height = f10;
    }

    public void setDpDt(float f, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f13 = (float) dArr[i];
            double d10 = dArr2[i];
            int i4 = iArr[i];
            if (i4 == 1) {
                f7 = f13;
            } else if (i4 == 2) {
                f11 = f13;
            } else if (i4 == 3) {
                f10 = f13;
            } else if (i4 == 4) {
                f12 = f13;
            }
        }
        float f14 = f7 - ((0.0f * f10) / 2.0f);
        float f15 = f11 - ((0.0f * f12) / 2.0f);
        fArr[0] = (((f10 * 1.0f) + f14) * f) + ((1.0f - f) * f14) + 0.0f;
        fArr[1] = (((f12 * 1.0f) + f15) * f3) + ((1.0f - f3) * f15) + 0.0f;
    }

    public void setView(float f, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f3;
        float fSin = this.f7744x;
        float fCos = this.f7745y;
        float f7 = this.width;
        float f10 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            double[] dArr4 = this.mTempValue;
            int i6 = iArr[i4];
            dArr4[i6] = dArr[i4];
            this.mTempDelta[i6] = dArr2[i4];
        }
        float f11 = Float.NaN;
        int i10 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i10 >= dArr5.length) {
                break;
            }
            boolean zIsNaN = Double.isNaN(dArr5[i10]);
            double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
            if (zIsNaN && (dArr3 == null || dArr3[i10] == AudioStats.AUDIO_AMPLITUDE_NONE)) {
                f3 = f11;
            } else {
                if (dArr3 != null) {
                    d10 = dArr3[i10];
                }
                if (!Double.isNaN(this.mTempValue[i10])) {
                    d10 = this.mTempValue[i10] + d10;
                }
                f3 = f11;
                float f16 = (float) d10;
                float f17 = (float) this.mTempDelta[i10];
                if (i10 == 1) {
                    f11 = f3;
                    f12 = f17;
                    fSin = f16;
                } else if (i10 == 2) {
                    f11 = f3;
                    f13 = f17;
                    fCos = f16;
                } else if (i10 == 3) {
                    f11 = f3;
                    f14 = f17;
                    f7 = f16;
                } else if (i10 == 4) {
                    f11 = f3;
                    f15 = f17;
                    f10 = f16;
                } else if (i10 == 5) {
                    f11 = f16;
                }
                i10++;
            }
            f11 = f3;
            i10++;
        }
        float f18 = f11;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f, fArr, fArr2);
            float f19 = fArr[0];
            float f20 = fArr[1];
            float f21 = fArr2[0];
            float f22 = fArr2[1];
            double d11 = f19;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f7 / 2.0f)));
            fCos = (float) ((((double) f20) - (Math.cos(d13) * d12)) - ((double) (f10 / 2.0f)));
            double d14 = f21;
            double d15 = f12;
            double dSin = (Math.sin(d13) * d15) + d14;
            double dCos = Math.cos(d13) * d12;
            double d16 = f13;
            float f23 = (float) ((dCos * d16) + dSin);
            float fSin2 = (float) ((Math.sin(d13) * d12 * d16) + (((double) f22) - (Math.cos(d13) * d15)));
            if (dArr2.length >= 2) {
                dArr2[0] = f23;
                dArr2[1] = fSin2;
            }
            if (!Float.isNaN(f18)) {
                motionWidget.setRotationZ((float) (Math.toDegrees(Math.atan2(fSin2, f23)) + ((double) f18)));
            }
        } else if (!Float.isNaN(f18)) {
            motionWidget.setRotationZ((float) (Math.toDegrees(Math.atan2((f15 / 2.0f) + f13, (f14 / 2.0f) + f12)) + ((double) f18) + ((double) 0.0f)));
        }
        float f24 = fSin + 0.5f;
        float f25 = fCos + 0.5f;
        motionWidget.layout((int) f24, (int) f25, (int) (f24 + f7), (int) (f25 + f10));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d10 = (((this.width / 2.0f) + this.f7744x) - motionPaths.f7744x) - (motionPaths.width / 2.0f);
        double d11 = (((this.height / 2.0f) + this.f7745y) - motionPaths.f7745y) - (motionPaths.height / 2.0f);
        this.mRelativeToController = motion;
        this.f7744x = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f7745y = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f7745y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public MotionPaths(int i, int i4, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != -1) {
            initPolar(i, i4, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i6 = motionKeyPosition.mPositionType;
        if (i6 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i6 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i, i4, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenter(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float fSin = this.f7744x;
        float fCos = this.f7745y;
        float f3 = this.width;
        float f7 = this.height;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f14 = (float) dArr[i];
            float f15 = (float) dArr2[i];
            int i4 = iArr[i];
            if (i4 == 1) {
                fSin = f14;
                f10 = f15;
            } else if (i4 == 2) {
                fCos = f14;
                f12 = f15;
            } else if (i4 == 3) {
                f3 = f14;
                f11 = f15;
            } else if (i4 == 4) {
                f7 = f14;
                f13 = f15;
            }
        }
        float f16 = (f11 / 2.0f) + f10;
        float fSin2 = (f13 / 2.0f) + f12;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d10, fArr3, fArr4);
            float f17 = fArr3[0];
            float f18 = fArr3[1];
            float f19 = fArr4[0];
            float f20 = fArr4[1];
            f = 2.0f;
            double d11 = fSin;
            double d12 = fCos;
            fSin = (float) (((Math.sin(d12) * d11) + ((double) f17)) - ((double) (f3 / 2.0f)));
            fCos = (float) ((((double) f18) - (Math.cos(d12) * d11)) - ((double) (f7 / 2.0f)));
            double d13 = f10;
            double dSin = (Math.sin(d12) * d13) + ((double) f19);
            double d14 = f12;
            float fCos2 = (float) ((Math.cos(d12) * d14) + dSin);
            fSin2 = (float) ((Math.sin(d12) * d14) + (((double) f20) - (Math.cos(d12) * d13)));
            f16 = fCos2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f3 / f) + fSin + 0.0f;
        fArr[1] = (f7 / f) + fCos + 0.0f;
        fArr2[0] = f16;
        fArr2[1] = fSin2;
    }
}
