package com.google.android.material.color;

import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes2.dex */
final class Cam16 {
    private final float astar;
    private final float bstar;
    private final float chroma;
    private final float hue;
    private final float j;
    private final float jstar;
    private final float m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f9712q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f9713s;
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    private Cam16(float f, float f3, float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.hue = f;
        this.chroma = f3;
        this.j = f7;
        this.f9712q = f10;
        this.m = f11;
        this.f9713s = f12;
        this.jstar = f13;
        this.astar = f14;
        this.bstar = f15;
    }

    public static Cam16 fromInt(int i) {
        return fromIntInViewingConditions(i, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromIntInViewingConditions(int i, ViewingConditions viewingConditions) {
        float fLinearized = ColorUtils.linearized(((16711680 & i) >> 16) / 255.0f) * 100.0f;
        float fLinearized2 = ColorUtils.linearized(((65280 & i) >> 8) / 255.0f) * 100.0f;
        float fLinearized3 = ColorUtils.linearized((i & 255) / 255.0f) * 100.0f;
        float f = (0.18051042f * fLinearized3) + (0.35762063f * fLinearized2) + (0.41233894f * fLinearized);
        float f3 = (0.0722f * fLinearized3) + (0.7152f * fLinearized2) + (0.2126f * fLinearized);
        float f7 = (fLinearized3 * 0.9503448f) + (fLinearized2 * 0.11916382f) + (fLinearized * 0.01932141f);
        float[][] fArr = XYZ_TO_CAM16RGB;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * f7) + (fArr2[1] * f3) + (fArr2[0] * f);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * f7) + (fArr3[1] * f3) + (fArr3[0] * f);
        float[] fArr4 = fArr[2];
        float f12 = (f7 * fArr4[2]) + (f3 * fArr4[1]) + (f * fArr4[0]);
        float f13 = viewingConditions.getRgbD()[0] * f10;
        float f14 = viewingConditions.getRgbD()[1] * f11;
        float f15 = viewingConditions.getRgbD()[2] * f12;
        float fPow = (float) Math.pow(((double) (Math.abs(f13) * viewingConditions.getFl())) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f14) * viewingConditions.getFl())) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f15) * viewingConditions.getFl())) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f13) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f14) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f15) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f16 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d10)) / 11.0f;
        float f17 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f18)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f20 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float aw = (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(fPow4 / 100.0f)) * viewingConditions.getFlRoot();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(Math.toRadians(((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.hypot(r2, r5))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float flRoot = fPow5 * viewingConditions.getFlRoot();
        float fSqrt = ((float) Math.sqrt((r2 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f22 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog1p = ((float) Math.log1p(0.0228f * flRoot)) * 43.85965f;
        double d11 = f21;
        return new Cam16(fAtan2, fPow5, fPow4, aw, flRoot, fSqrt, f22, fLog1p * ((float) Math.cos(d11)), fLog1p * ((float) Math.sin(d11)));
    }

    public static Cam16 fromJch(float f, float f3, float f7) {
        return fromJchInViewingConditions(f, f3, f7, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(float f, float f3, float f7, ViewingConditions viewingConditions) {
        float aw = (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(((double) f) / 100.0d)) * viewingConditions.getFlRoot();
        float flRoot = viewingConditions.getFlRoot() * f3;
        float fSqrt = ((float) Math.sqrt(((f3 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f10 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog1p = ((float) Math.log1p(((double) flRoot) * 0.0228d)) * 43.85965f;
        double d10 = (3.1415927f * f7) / 180.0f;
        return new Cam16(f7, f3, f, aw, flRoot, fSqrt, f10, ((float) Math.cos(d10)) * fLog1p, fLog1p * ((float) Math.sin(d10)));
    }

    public static Cam16 fromUcs(float f, float f3, float f7) {
        return fromUcsInViewingConditions(f, f3, f7, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(float f, float f3, float f7, ViewingConditions viewingConditions) {
        double d10 = f3;
        double d11 = f7;
        double dExpm1 = (Math.expm1(Math.hypot(d10, d11) * 0.02280000038444996d) / 0.02280000038444996d) / ((double) viewingConditions.getFlRoot());
        double dAtan2 = Math.atan2(d11, d10) * 57.29577951308232d;
        if (dAtan2 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            dAtan2 += 360.0d;
        }
        return fromJchInViewingConditions(f / (1.0f - ((f - 100.0f) * 0.007f)), (float) dExpm1, (float) dAtan2, viewingConditions);
    }

    public float distance(Cam16 cam16) {
        float jStar = getJStar() - cam16.getJStar();
        float aStar = getAStar() - cam16.getAStar();
        float bStar = getBStar() - cam16.getBStar();
        return (float) (Math.pow(Math.sqrt((bStar * bStar) + (aStar * aStar) + (jStar * jStar)), 0.63d) * 1.41d);
    }

    public float getAStar() {
        return this.astar;
    }

    public float getBStar() {
        return this.bstar;
    }

    public float getChroma() {
        return this.chroma;
    }

    public float getHue() {
        return this.hue;
    }

    public int getInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public float getJ() {
        return this.j;
    }

    public float getJStar() {
        return this.jstar;
    }

    public float getM() {
        return this.m;
    }

    public float getQ() {
        return this.f9712q;
    }

    public float getS() {
        return this.f9713s;
    }

    public int viewed(ViewingConditions viewingConditions) {
        float fPow = (float) Math.pow(((double) ((((double) getChroma()) == AudioStats.AUDIO_AMPLITUDE_NONE || ((double) getJ()) == AudioStats.AUDIO_AMPLITUDE_NONE) ? 0.0f : getChroma() / ((float) Math.sqrt(((double) getJ()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(((double) getJ()) / 100.0d, (1.0d / ((double) viewingConditions.getC())) / ((double) viewingConditions.getZ())));
        float nc = fCos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float fSin = (float) Math.sin(hue);
        float fCos2 = (float) Math.cos(hue);
        float f = (((0.305f + nbb) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (nc * 23.0f)));
        float f3 = fCos2 * f;
        float f7 = f * fSin;
        float f10 = nbb * 460.0f;
        float f11 = ((288.0f * f7) + ((451.0f * f3) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f3)) - (261.0f * f7)) / 1403.0f;
        float f13 = ((f10 - (f3 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
        float fl = (100.0f / viewingConditions.getFl()) * Math.signum(f11) * ((float) Math.pow((float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fl2 = (100.0f / viewingConditions.getFl()) * Math.signum(f12) * ((float) Math.pow((float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fl3 = (100.0f / viewingConditions.getFl()) * Math.signum(f13) * ((float) Math.pow((float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float f14 = fl / viewingConditions.getRgbD()[0];
        float f15 = fl2 / viewingConditions.getRgbD()[1];
        float f16 = fl3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f17 = (fArr2[2] * f16) + (fArr2[1] * f15) + (fArr2[0] * f14);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
        float[] fArr4 = fArr[2];
        return ColorUtils.intFromXyzComponents(f17, f18, (f16 * fArr4[2]) + (f15 * fArr4[1]) + (f14 * fArr4[0]));
    }
}
