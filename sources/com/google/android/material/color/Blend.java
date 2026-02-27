package com.google.android.material.color;

import We.s;
import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes2.dex */
final class Blend {
    private static final float HARMONIZE_MAX_DEGREES = 15.0f;
    private static final float HARMONIZE_PERCENTAGE = 0.5f;

    private Blend() {
    }

    public static int blendCam16Ucs(int i, int i4, float f) {
        Cam16 cam16FromInt = Cam16.fromInt(i);
        Cam16 cam16FromInt2 = Cam16.fromInt(i4);
        float jStar = cam16FromInt.getJStar();
        float aStar = cam16FromInt.getAStar();
        float bStar = cam16FromInt.getBStar();
        return Cam16.fromUcs(s.a(cam16FromInt2.getJStar(), jStar, f, jStar), s.a(cam16FromInt2.getAStar(), aStar, f, aStar), s.a(cam16FromInt2.getBStar(), bStar, f, bStar)).getInt();
    }

    public static int blendHctHue(int i, int i4, float f) {
        return Hct.from(Cam16.fromInt(blendCam16Ucs(i, i4, f)).getHue(), Cam16.fromInt(i).getChroma(), ColorUtils.lstarFromInt(i)).toInt();
    }

    public static int harmonize(int i, int i4) {
        Hct hctFromInt = Hct.fromInt(i);
        Hct hctFromInt2 = Hct.fromInt(i4);
        float fMin = Math.min(MathUtils.differenceDegrees(hctFromInt.getHue(), hctFromInt2.getHue()) * 0.5f, HARMONIZE_MAX_DEGREES);
        return Hct.from(MathUtils.sanitizeDegrees((fMin * rotationDirection(hctFromInt.getHue(), hctFromInt2.getHue())) + hctFromInt.getHue()), hctFromInt.getChroma(), hctFromInt.getTone()).toInt();
    }

    private static float rotationDirection(float f, float f3) {
        float f7 = f3 - f;
        float f10 = f7 + 360.0f;
        float f11 = f7 - 360.0f;
        float fAbs = Math.abs(f7);
        float fAbs2 = Math.abs(f10);
        float fAbs3 = Math.abs(f11);
        return (fAbs > fAbs2 || fAbs > fAbs3) ? (fAbs2 > fAbs || fAbs2 > fAbs3) ? ((double) f11) >= AudioStats.AUDIO_AMPLITUDE_NONE ? 1.0f : -1.0f : ((double) f10) >= AudioStats.AUDIO_AMPLITUDE_NONE ? 1.0f : -1.0f : ((double) f7) >= AudioStats.AUDIO_AMPLITUDE_NONE ? 1.0f : -1.0f;
    }
}
