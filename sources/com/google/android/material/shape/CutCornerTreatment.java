package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f3, float f7) {
        shapePath.reset(0.0f, f7 * f3, 180.0f, 180.0f - f);
        double d10 = f7;
        double d11 = f3;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f)) * d10 * d11));
    }

    @Deprecated
    public CutCornerTreatment(float f) {
        this.size = f;
    }
}
