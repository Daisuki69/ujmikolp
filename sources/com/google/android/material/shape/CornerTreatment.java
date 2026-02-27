package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f, float f3, @NonNull ShapePath shapePath) {
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f3, float f7) {
        getCornerPath(f, f3, shapePath);
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f3, @NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        getCornerPath(shapePath, f, f3, cornerSize.getCornerSize(rectF));
    }
}
