package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("jni_common.cc")
public final class MultiScaleDecodingOptions {

    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];

    @UsedByNative("jni_common.cc")
    private int minimumDetectedDimension = 10;

    @UsedByNative("jni_common.cc")
    private boolean skipProcessingIfBarcodeFound = true;

    public final void a(float[] fArr) {
        this.extraScales = fArr;
    }

    public final void b(int i) {
        this.minimumDetectedDimension = i;
    }

    public final void c(boolean z4) {
        this.skipProcessingIfBarcodeFound = z4;
    }
}
