package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialArcMotion extends PathMotion {
    private static PointF getControlPoint(float f, float f3, float f7, float f10) {
        return f3 > f10 ? new PointF(f7, f3) : new PointF(f, f10);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f, float f3, float f7, float f10) {
        Path path = new Path();
        path.moveTo(f, f3);
        PointF controlPoint = getControlPoint(f, f3, f7, f10);
        path.quadTo(controlPoint.x, controlPoint.y, f7, f10);
        return path;
    }
}
