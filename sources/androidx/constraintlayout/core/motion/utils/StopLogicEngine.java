package androidx.constraintlayout.core.motion.utils;

import We.s;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes.dex */
public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    private float calcY(float f) {
        this.mDone = false;
        float f3 = this.mStage1Duration;
        if (f <= f3) {
            float f7 = this.mStage1Velocity;
            return ((((this.mStage2Velocity - f7) * f) * f) / (f3 * 2.0f)) + (f7 * f);
        }
        int i = this.mNumberOfStages;
        if (i == 1) {
            return this.mStage1EndPosition;
        }
        float f10 = f - f3;
        float f11 = this.mStage2Duration;
        if (f10 < f11) {
            float f12 = this.mStage1EndPosition;
            float f13 = this.mStage2Velocity;
            return ((((this.mStage3Velocity - f13) * f10) * f10) / (f11 * 2.0f)) + (f13 * f10) + f12;
        }
        if (i == 2) {
            return this.mStage2EndPosition;
        }
        float f14 = f10 - f11;
        float f15 = this.mStage3Duration;
        if (f14 > f15) {
            this.mDone = true;
            return this.mStage3EndPosition;
        }
        float f16 = this.mStage2EndPosition;
        float f17 = this.mStage3Velocity;
        return ((f17 * f14) + f16) - (((f17 * f14) * f14) / (f15 * 2.0f));
    }

    private void setup(float f, float f3, float f7, float f10, float f11) {
        this.mDone = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.mStage1Velocity = f;
        float f12 = f / f7;
        float f13 = (f12 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f3 - ((((-f) / f7) * f) / 2.0f)) * f7);
            if (fSqrt < f10) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f;
                this.mStage2Velocity = fSqrt;
                this.mStage3Velocity = 0.0f;
                float f14 = (fSqrt - f) / f7;
                this.mStage1Duration = f14;
                this.mStage2Duration = fSqrt / f7;
                this.mStage1EndPosition = ((f + fSqrt) * f14) / 2.0f;
                this.mStage2EndPosition = f3;
                this.mStage3EndPosition = f3;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f;
            this.mStage2Velocity = f10;
            this.mStage3Velocity = f10;
            float f15 = (f10 - f) / f7;
            this.mStage1Duration = f15;
            float f16 = f10 / f7;
            this.mStage3Duration = f16;
            float f17 = ((f + f10) * f15) / 2.0f;
            float f18 = (f16 * f10) / 2.0f;
            this.mStage2Duration = ((f3 - f17) - f18) / f10;
            this.mStage1EndPosition = f17;
            this.mStage2EndPosition = f3 - f18;
            this.mStage3EndPosition = f3;
            return;
        }
        if (f13 >= f3) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f3;
            this.mStage1Duration = (2.0f * f3) / f;
            return;
        }
        float f19 = f3 - f13;
        float f20 = f19 / f;
        if (f20 + f12 < f11) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f;
            this.mStage2Velocity = f;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f19;
            this.mStage2EndPosition = f3;
            this.mStage1Duration = f20;
            this.mStage2Duration = f12;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f7 * f3));
        float f21 = (fSqrt2 - f) / f7;
        this.mStage1Duration = f21;
        float f22 = fSqrt2 / f7;
        this.mStage2Duration = f22;
        if (fSqrt2 < f10) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f;
            this.mStage2Velocity = fSqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f21;
            this.mStage2Duration = f22;
            this.mStage1EndPosition = ((f + fSqrt2) * f21) / 2.0f;
            this.mStage2EndPosition = f3;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f;
        this.mStage2Velocity = f10;
        this.mStage3Velocity = f10;
        float f23 = (f10 - f) / f7;
        this.mStage1Duration = f23;
        float f24 = f10 / f7;
        this.mStage3Duration = f24;
        float f25 = ((f + f10) * f23) / 2.0f;
        float f26 = (f24 * f10) / 2.0f;
        this.mStage2Duration = ((f3 - f25) - f26) / f10;
        this.mStage1EndPosition = f25;
        this.mStage2EndPosition = f3 - f26;
        this.mStage3EndPosition = f3;
    }

    public void config(float f, float f3, float f7, float f10, float f11, float f12) {
        this.mDone = false;
        this.mStartPosition = f;
        boolean z4 = f > f3;
        this.mBackwards = z4;
        if (z4) {
            setup(-f7, f - f3, f11, f12, f10);
        } else {
            setup(f7, f3 - f, f11, f12, f10);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        StringBuilder sbV = s.v(s.p(s.v(str, " ===== "), this.mType, Global.NEWLINE), str);
        sbV.append(this.mBackwards ? "backwards" : "forward ");
        sbV.append(" time = ");
        sbV.append(f);
        sbV.append("  stages ");
        String strO = s.o(sbV, Global.NEWLINE, this.mNumberOfStages);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strO);
        sb2.append(str);
        sb2.append(" dur ");
        sb2.append(this.mStage1Duration);
        sb2.append(" vel ");
        sb2.append(this.mStage1Velocity);
        sb2.append(" pos ");
        String strN = s.n(sb2, Global.NEWLINE, this.mStage1EndPosition);
        if (this.mNumberOfStages > 1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strN);
            sb3.append(str);
            sb3.append(" dur ");
            sb3.append(this.mStage2Duration);
            sb3.append(" vel ");
            sb3.append(this.mStage2Velocity);
            sb3.append(" pos ");
            strN = s.n(sb3, Global.NEWLINE, this.mStage2EndPosition);
        }
        if (this.mNumberOfStages > 2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strN);
            sb4.append(str);
            sb4.append(" dur ");
            sb4.append(this.mStage3Duration);
            sb4.append(" vel ");
            sb4.append(this.mStage3Velocity);
            sb4.append(" pos ");
            strN = s.n(sb4, Global.NEWLINE, this.mStage3EndPosition);
        }
        float f3 = this.mStage1Duration;
        if (f <= f3) {
            return androidx.camera.core.impl.a.j(strN, str, "stage 0\n");
        }
        int i = this.mNumberOfStages;
        if (i == 1) {
            return androidx.camera.core.impl.a.j(strN, str, "end stage 0\n");
        }
        float f7 = f - f3;
        float f10 = this.mStage2Duration;
        return f7 < f10 ? androidx.camera.core.impl.a.j(strN, str, " stage 1\n") : i == 2 ? androidx.camera.core.impl.a.j(strN, str, "end stage 1\n") : f7 - f10 < this.mStage3Duration ? androidx.camera.core.impl.a.j(strN, str, " stage 2\n") : androidx.camera.core.impl.a.j(strN, str, " end stage 2\n");
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        float fCalcY = calcY(f);
        this.mLastPosition = f;
        return this.mBackwards ? this.mStartPosition - fCalcY : this.mStartPosition + fCalcY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        float f3;
        float f7;
        float f10 = this.mStage1Duration;
        if (f <= f10) {
            f3 = this.mStage1Velocity;
            f7 = this.mStage2Velocity;
        } else {
            int i = this.mNumberOfStages;
            if (i == 1) {
                return 0.0f;
            }
            f -= f10;
            f10 = this.mStage2Duration;
            if (f >= f10) {
                if (i == 2) {
                    return this.mStage2EndPosition;
                }
                float f11 = f - f10;
                float f12 = this.mStage3Duration;
                if (f11 >= f12) {
                    return this.mStage3EndPosition;
                }
                float f13 = this.mStage3Velocity;
                return f13 - ((f11 * f13) / f12);
            }
            f3 = this.mStage2Velocity;
            f7 = this.mStage3Velocity;
        }
        return (((f7 - f3) * f) / f10) + f3;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < EPSILON && Math.abs(this.mStage3EndPosition - this.mLastPosition) < EPSILON;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastPosition) : getVelocity(this.mLastPosition);
    }
}
