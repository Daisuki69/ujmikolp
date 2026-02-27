package com.google.android.material.transition;

/* JADX INFO: loaded from: classes2.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i, int i4, boolean z4) {
        this.startAlpha = i;
        this.endAlpha = i4;
        this.endOnTop = z4;
    }

    public static FadeModeResult endOnTop(int i, int i4) {
        return new FadeModeResult(i, i4, true);
    }

    public static FadeModeResult startOnTop(int i, int i4) {
        return new FadeModeResult(i, i4, false);
    }
}
