package com.google.android.material.transition;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f3, float f7, float f10) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f3, f7, f));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f3, float f7, float f10) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f3, f7, f), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f3, float f7, float f10) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f3, f7, f), TransitionUtils.lerp(0, 255, f3, f7, f));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f3, float f7, float f10) {
            float fA = s.a(f7, f3, f10, f3);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f3, fA, f), TransitionUtils.lerp(0, 255, fA, f7, f));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i, boolean z4) {
        if (i == 0) {
            return z4 ? IN : OUT;
        }
        if (i == 1) {
            return z4 ? OUT : IN;
        }
        if (i == 2) {
            return CROSS;
        }
        if (i == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException(s.f(i, "Invalid fade mode: "));
    }
}
