package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = UNSET;
        this.mMassState = new DynamicAnimation.MassState();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition == UNSET) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.mDampingRatio;
        if (d10 > 1.0d) {
            double d11 = this.mNaturalFreq;
            this.mGammaPlus = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
            double d12 = this.mDampingRatio;
            double d13 = this.mNaturalFreq;
            this.mGammaMinus = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
        } else if (d10 >= AudioStats.AUDIO_AMPLITUDE_NONE && d10 < 1.0d) {
            this.mDampedFreq = Math.sqrt(1.0d - (d10 * d10)) * this.mNaturalFreq;
        }
        this.mInitialized = true;
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f, float f3) {
        float finalPosition = f - getFinalPosition();
        double d10 = this.mNaturalFreq;
        return (float) (((-(d10 * d10)) * ((double) finalPosition)) - (((d10 * 2.0d) * this.mDampingRatio) * ((double) f3)));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d10 = this.mNaturalFreq;
        return (float) (d10 * d10);
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f, float f3) {
        return ((double) Math.abs(f3)) < this.mVelocityThreshold && ((double) Math.abs(f - getFinalPosition())) < this.mValueThreshold;
    }

    public SpringForce setDampingRatio(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.mDampingRatio = f;
        this.mInitialized = false;
        return this;
    }

    public SpringForce setFinalPosition(float f) {
        this.mFinalPosition = f;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.mNaturalFreq = Math.sqrt(f);
        this.mInitialized = false;
        return this;
    }

    public void setValueThreshold(double d10) {
        double dAbs = Math.abs(d10);
        this.mValueThreshold = dAbs;
        this.mVelocityThreshold = dAbs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    public DynamicAnimation.MassState updateValues(double d10, double d11, long j) {
        double dSin;
        double dCos;
        init();
        double d12 = j / 1000.0d;
        double d13 = d10 - this.mFinalPosition;
        double d14 = this.mDampingRatio;
        if (d14 > 1.0d) {
            double d15 = this.mGammaMinus;
            double d16 = this.mGammaPlus;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dSin = (Math.pow(2.718281828459045d, this.mGammaPlus * d12) * d18) + (Math.pow(2.718281828459045d, d15 * d12) * d17);
            double d19 = this.mGammaMinus;
            double dPow = Math.pow(2.718281828459045d, d19 * d12) * d17 * d19;
            double d20 = this.mGammaPlus;
            dCos = (Math.pow(2.718281828459045d, d20 * d12) * d18 * d20) + dPow;
        } else if (d14 == 1.0d) {
            double d21 = this.mNaturalFreq;
            double d22 = (d21 * d13) + d11;
            double d23 = (d22 * d12) + d13;
            double dPow2 = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d12) * d23;
            double d24 = this.mNaturalFreq;
            dCos = (Math.pow(2.718281828459045d, (-d24) * d12) * d22) + (dPow3 * (-d24));
            dSin = dPow2;
        } else {
            double d25 = 1.0d / this.mDampedFreq;
            double d26 = this.mNaturalFreq;
            double d27 = ((d14 * d26 * d13) + d11) * d25;
            dSin = ((Math.sin(this.mDampedFreq * d12) * d27) + (Math.cos(this.mDampedFreq * d12) * d13)) * Math.pow(2.718281828459045d, (-d14) * d26 * d12);
            double d28 = this.mNaturalFreq;
            double d29 = this.mDampingRatio;
            double d30 = (-d28) * dSin * d29;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d31 = this.mDampedFreq;
            double dSin2 = Math.sin(d31 * d12) * (-d31) * d13;
            double d32 = this.mDampedFreq;
            dCos = (((Math.cos(d32 * d12) * d27 * d32) + dSin2) * dPow4) + d30;
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (dSin + this.mFinalPosition);
        massState.mVelocity = (float) dCos;
        return massState;
    }

    public SpringForce(float f) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = UNSET;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f;
    }
}
