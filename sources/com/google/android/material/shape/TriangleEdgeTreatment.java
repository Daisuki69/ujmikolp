package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f, boolean z4) {
        this.size = f;
        this.inside = z4;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f3, float f7, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f3 - (this.size * f7), 0.0f);
        shapePath.lineTo(f3, (this.inside ? this.size : -this.size) * f7);
        shapePath.lineTo((this.size * f7) + f3, 0.0f);
        shapePath.lineTo(f, 0.0f);
    }
}
