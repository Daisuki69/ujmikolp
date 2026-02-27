package com.google.android.material.color;

import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes2.dex */
final class Hct {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DE_MAX_ERROR = 1.0E-9f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private float chroma;
    private float hue;
    private float tone;

    private Hct(float f, float f3, float f7) {
        setInternalState(gamutMap(f, f3, f7));
    }

    private static Cam16 findCamByJ(float f, float f3, float f7) {
        float f10 = 100.0f;
        float f11 = 1000.0f;
        float f12 = 0.0f;
        Cam16 cam16 = null;
        float f13 = 1000.0f;
        while (Math.abs(f12 - f10) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f14 = ((f10 - f12) / 2.0f) + f12;
            int i = Cam16.fromJch(f14, f3, f).getInt();
            float fLstarFromInt = ColorUtils.lstarFromInt(i);
            float fAbs = Math.abs(f7 - fLstarFromInt);
            if (fAbs < 0.2f) {
                Cam16 cam16FromInt = Cam16.fromInt(i);
                float fDistance = cam16FromInt.distance(Cam16.fromJch(cam16FromInt.getJ(), cam16FromInt.getChroma(), f));
                if (fDistance <= 1.0f && fDistance <= f11) {
                    cam16 = cam16FromInt;
                    f13 = fAbs;
                    f11 = fDistance;
                }
            }
            if (f13 == 0.0f && f11 < DE_MAX_ERROR) {
                return cam16;
            }
            if (fLstarFromInt < f7) {
                f12 = f14;
            } else {
                f10 = f14;
            }
        }
        return cam16;
    }

    public static Hct from(float f, float f3, float f7) {
        return new Hct(f, f3, f7);
    }

    public static Hct fromInt(int i) {
        Cam16 cam16FromInt = Cam16.fromInt(i);
        return new Hct(cam16FromInt.getHue(), cam16FromInt.getChroma(), ColorUtils.lstarFromInt(i));
    }

    private static int gamutMap(float f, float f3, float f7) {
        return gamutMapInViewingConditions(f, f3, f7, ViewingConditions.DEFAULT);
    }

    public static int gamutMapInViewingConditions(float f, float f3, float f7, ViewingConditions viewingConditions) {
        if (f3 < 1.0d || Math.round(f7) <= AudioStats.AUDIO_AMPLITUDE_NONE || Math.round(f7) >= 100.0d) {
            return ColorUtils.intFromLstar(f7);
        }
        float fSanitizeDegrees = MathUtils.sanitizeDegrees(f);
        Cam16 cam16 = null;
        boolean z4 = true;
        float f10 = 0.0f;
        float f11 = f3;
        while (Math.abs(f10 - f3) >= CHROMA_SEARCH_ENDPOINT) {
            Cam16 cam16FindCamByJ = findCamByJ(fSanitizeDegrees, f11, f7);
            if (!z4) {
                if (cam16FindCamByJ == null) {
                    f3 = f11;
                } else {
                    f10 = f11;
                    cam16 = cam16FindCamByJ;
                }
                f11 = ((f3 - f10) / 2.0f) + f10;
            } else {
                if (cam16FindCamByJ != null) {
                    return cam16FindCamByJ.viewed(viewingConditions);
                }
                f11 = ((f3 - f10) / 2.0f) + f10;
                z4 = false;
            }
        }
        return cam16 == null ? ColorUtils.intFromLstar(f7) : cam16.viewed(viewingConditions);
    }

    private void setInternalState(int i) {
        Cam16 cam16FromInt = Cam16.fromInt(i);
        float fLstarFromInt = ColorUtils.lstarFromInt(i);
        this.hue = cam16FromInt.getHue();
        this.chroma = cam16FromInt.getChroma();
        this.tone = fLstarFromInt;
    }

    public float getChroma() {
        return this.chroma;
    }

    public float getHue() {
        return this.hue;
    }

    public float getTone() {
        return this.tone;
    }

    public void setChroma(float f) {
        setInternalState(gamutMap(this.hue, f, this.tone));
    }

    public void setHue(float f) {
        setInternalState(gamutMap(MathUtils.sanitizeDegrees(f), this.chroma, this.tone));
    }

    public void setTone(float f) {
        setInternalState(gamutMap(this.hue, this.chroma, f));
    }

    public int toInt() {
        return gamutMap(this.hue, this.chroma, this.tone);
    }
}
