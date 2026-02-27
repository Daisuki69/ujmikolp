package androidx.media3.common.audio;

import We.s;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    public ChannelMixingMatrix(int i, int i4, float[] fArr) {
        boolean z4 = false;
        Assertions.checkArgument(i > 0, "Input channel count must be positive.");
        Assertions.checkArgument(i4 > 0, "Output channel count must be positive.");
        Assertions.checkArgument(fArr.length == i * i4, "Coefficient array length is invalid.");
        this.inputChannelCount = i;
        this.outputChannelCount = i4;
        this.coefficients = checkCoefficientsValid(fArr);
        int i6 = 0;
        boolean z5 = true;
        boolean z8 = true;
        boolean z9 = true;
        while (i6 < i) {
            int i10 = 0;
            while (i10 < i4) {
                float mixingCoefficient = getMixingCoefficient(i6, i10);
                boolean z10 = i6 == i10;
                if (mixingCoefficient != 1.0f && z10) {
                    z9 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z5 = false;
                    if (!z10) {
                        z8 = false;
                    }
                }
                i10++;
            }
            i6++;
        }
        this.isZero = z5;
        boolean z11 = isSquare() && z8;
        this.isDiagonal = z11;
        if (z11 && z9) {
            z4 = true;
        }
        this.isIdentity = z4;
    }

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] < 0.0f) {
                throw new IllegalArgumentException(s.g(i, "Coefficient at index ", " is negative."));
            }
        }
        return fArr;
    }

    public static ChannelMixingMatrix create(int i, int i4) {
        return new ChannelMixingMatrix(i, i4, createMixingCoefficients(i, i4));
    }

    private static float[] createMixingCoefficients(int i, int i4) {
        if (i == i4) {
            return initializeIdentityMatrix(i4);
        }
        if (i == 1 && i4 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i == 2 && i4 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException(androidx.camera.core.impl.a.h("Default channel mixing coefficients for ", i, "->", i4, " are not yet implemented."));
    }

    private static float[] initializeIdentityMatrix(int i) {
        float[] fArr = new float[i * i];
        for (int i4 = 0; i4 < i; i4++) {
            fArr[(i * i4) + i4] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i, int i4) {
        return this.coefficients[(i * this.outputChannelCount) + i4];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f) {
        float[] fArr = new float[this.coefficients.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i >= fArr2.length) {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i] = fArr2[i] * f;
            i++;
        }
    }
}
