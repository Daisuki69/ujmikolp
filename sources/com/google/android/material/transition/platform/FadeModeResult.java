package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
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
