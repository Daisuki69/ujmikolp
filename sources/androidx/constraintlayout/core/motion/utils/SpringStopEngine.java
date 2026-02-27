package androidx.constraintlayout.core.motion.utils;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d10) {
        double d11 = this.mStiffness;
        double d12 = this.mDamping;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.mMass)) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / ((double) iSqrt);
        int i = 0;
        while (i < iSqrt) {
            float f = this.mPos;
            double d14 = this.mTargetPos;
            float f3 = this.mV;
            double d15 = d11;
            double d16 = ((-d11) * (((double) f) - d14)) - (((double) f3) * d12);
            float f7 = this.mMass;
            double d17 = d12;
            double d18 = (((d16 / ((double) f7)) * d13) / 2.0d) + ((double) f3);
            double d19 = ((((-((((d13 * d18) / 2.0d) + ((double) f)) - d14)) * d15) - (d18 * d17)) / ((double) f7)) * d13;
            float f10 = (float) (((double) f3) + d19);
            this.mV = f10;
            float f11 = (float) ((((d19 / 2.0d) + ((double) f3)) * d13) + ((double) f));
            this.mPos = f11;
            int i4 = this.mBoundaryMode;
            if (i4 > 0) {
                if (f11 < 0.0f && (i4 & 1) == 1) {
                    this.mPos = -f11;
                    this.mV = -f10;
                }
                float f12 = this.mPos;
                if (f12 > 1.0f && (i4 & 2) == 2) {
                    this.mPos = 2.0f - f12;
                    this.mV = -this.mV;
                }
            }
            i++;
            d11 = d15;
            d12 = d17;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        return null;
    }

    public float getAcceleration() {
        double d10 = this.mStiffness;
        return ((float) (((-d10) * (((double) this.mPos) - this.mTargetPos)) - (this.mDamping * ((double) this.mV)))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        compute(f - this.mLastTime);
        this.mLastTime = f;
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d10 = ((double) this.mPos) - this.mTargetPos;
        double d11 = this.mStiffness;
        double d12 = this.mV;
        return Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * ((double) this.mMass))) / d11) <= ((double) this.mStopThreshold);
    }

    public void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + Global.COLON + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void springConfig(float f, float f3, float f7, float f10, float f11, float f12, float f13, int i) {
        this.mTargetPos = f3;
        this.mDamping = f12;
        this.mInitialized = false;
        this.mPos = f;
        this.mLastVelocity = f7;
        this.mStiffness = f11;
        this.mMass = f10;
        this.mStopThreshold = f13;
        this.mBoundaryMode = i;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        return this.mV;
    }
}
