package com.google.android.material.color;

import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes2.dex */
final class ViewingConditions {
    public static final ViewingConditions DEFAULT = make(ColorUtils.whitePointD65(), (float) ((((double) ColorUtils.yFromLstar(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float aw;
    private final float c;
    private final float fl;
    private final float flRoot;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f9714n;
    private final float nbb;
    private final float nc;
    private final float ncb;
    private final float[] rgbD;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f9715z;

    private ViewingConditions(float f, float f3, float f7, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f9714n = f;
        this.aw = f3;
        this.nbb = f7;
        this.ncb = f10;
        this.c = f11;
        this.nc = f12;
        this.rgbD = fArr;
        this.fl = f13;
        this.flRoot = f14;
        this.f9715z = f15;
    }

    public static ViewingConditions make(float[] fArr, float f, float f3, float f7, boolean z4) {
        float[][] fArr2 = Cam16.XYZ_TO_CAM16RGB;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = (f7 / 10.0f) + 0.8f;
        float fLerp = ((double) f18) >= 0.9d ? MathUtils.lerp(0.59f, 0.69f, (f18 - 0.9f) * 10.0f) : MathUtils.lerp(0.525f, 0.59f, (f18 - 0.8f) * 10.0f);
        float fExp = z4 ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f18;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * f) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(((double) f) * 5.0d))) + (f20 * f);
        float fYFromLstar = ColorUtils.yFromLstar(f3) / fArr[1];
        double d11 = fYFromLstar;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f17)) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        return new ViewingConditions(fYFromLstar, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, fLerp, f18, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float getAw() {
        return this.aw;
    }

    public float getC() {
        return this.c;
    }

    public float getFl() {
        return this.fl;
    }

    public float getFlRoot() {
        return this.flRoot;
    }

    public float getN() {
        return this.f9714n;
    }

    public float getNbb() {
        return this.nbb;
    }

    public float getNc() {
        return this.nc;
    }

    public float getNcb() {
        return this.ncb;
    }

    public float[] getRgbD() {
        return this.rgbD;
    }

    public float getZ() {
        return this.f9715z;
    }
}
