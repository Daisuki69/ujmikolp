package com.google.android.material.transition;

import We.s;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f, float f3, float f7, float f10, float f11, float f12, float f13) {
            float fLerp = TransitionUtils.lerp(f10, f12, f3, f7, f, true);
            float f14 = fLerp / f10;
            float f15 = fLerp / f12;
            return new FitModeResult(f14, f15, fLerp, f11 * f14, fLerp, f13 * f15);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            float fAbs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f, float f3, float f7, float f10, float f11, float f12, float f13) {
            float fLerp = TransitionUtils.lerp(f11, f13, f3, f7, f, true);
            float f14 = fLerp / f11;
            float f15 = fLerp / f13;
            return new FitModeResult(f14, f15, f10 * f14, fLerp, f12 * f15, fLerp);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }
    };

    private FitModeEvaluators() {
    }

    public static FitModeEvaluator get(int i, boolean z4, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return shouldAutoFitToWidth(z4, rectF, rectF2) ? WIDTH : HEIGHT;
        }
        if (i == 1) {
            return WIDTH;
        }
        if (i == 2) {
            return HEIGHT;
        }
        throw new IllegalArgumentException(s.f(i, "Invalid fit mode: "));
    }

    private static boolean shouldAutoFitToWidth(boolean z4, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        return z4 ? (fHeight2 * fWidth) / fWidth2 >= fHeight : (fWidth2 * fHeight) / fWidth >= fHeight2;
    }
}
