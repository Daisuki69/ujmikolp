package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
class FitModeResult {
    final float currentEndHeight;
    final float currentEndWidth;
    final float currentStartHeight;
    final float currentStartWidth;
    final float endScale;
    final float startScale;

    public FitModeResult(float f, float f3, float f7, float f10, float f11, float f12) {
        this.startScale = f;
        this.endScale = f3;
        this.currentStartWidth = f7;
        this.currentStartHeight = f10;
        this.currentEndWidth = f11;
        this.currentEndHeight = f12;
    }
}
