package com.google.android.material.bottomappbar;

import We.s;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f, float f3, float f7) {
        this.fabMargin = f;
        this.roundedCornerRadius = f3;
        setCradleVerticalOffset(f7);
        this.horizontalOffset = 0.0f;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f3, float f7, @NonNull ShapePath shapePath) {
        float f10;
        float f11;
        float f12 = this.fabDiameter;
        if (f12 == 0.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f13 = ((this.fabMargin * 2.0f) + f12) / 2.0f;
        float f14 = f7 * this.roundedCornerRadius;
        float f15 = f3 + this.horizontalOffset;
        float fA = s.a(1.0f, f7, f13, this.cradleVerticalOffset * f7);
        if (fA / f13 >= 1.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f16 = this.fabCornerSize;
        float f17 = f16 * f7;
        boolean z4 = f16 == -1.0f || Math.abs((f16 * 2.0f) - f12) < 0.1f;
        if (z4) {
            f10 = fA;
            f11 = 0.0f;
        } else {
            f11 = ROUNDED_CORNER_FAB_OFFSET;
            f10 = 0.0f;
        }
        float f18 = f13 + f14;
        float f19 = f10 + f14;
        float fSqrt = (float) Math.sqrt((f18 * f18) - (f19 * f19));
        float f20 = f15 - fSqrt;
        float f21 = f15 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f19));
        float f22 = (90.0f - degrees) + f11;
        shapePath.lineTo(f20, 0.0f);
        float f23 = f20 - f14;
        float f24 = f20 + f14;
        float f25 = f14 * 2.0f;
        shapePath.addArc(f23, 0.0f, f24, f25, 270.0f, degrees);
        if (z4) {
            shapePath.addArc(f15 - f13, (-f13) - f10, f15 + f13, f13 - f10, 180.0f - f22, (f22 * 2.0f) - 180.0f);
        } else {
            float f26 = this.fabMargin;
            float f27 = f17 * 2.0f;
            float f28 = f26 + f27;
            float f29 = f15 - f13;
            shapePath.addArc(f29, -(f17 + f26), f28 + f29, f26 + f17, 180.0f - f22, ((f22 * 2.0f) - 180.0f) / 2.0f);
            float f30 = f15 + f13;
            float f31 = this.fabMargin;
            shapePath.lineTo(f30 - ((f31 / 2.0f) + f17), f31 + f17);
            float f32 = this.fabMargin;
            shapePath.addArc(f30 - (f27 + f32), -(f17 + f32), f30, f32 + f17, 90.0f, f22 - 90.0f);
        }
        shapePath.addArc(f21 - f14, 0.0f, f21 + f14, f25, 270.0f - degrees, degrees);
        shapePath.lineTo(f, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.fabDiameter;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setCradleVerticalOffset(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f;
    }

    public void setFabCornerSize(float f) {
        this.fabCornerSize = f;
    }

    public void setFabCradleMargin(float f) {
        this.fabMargin = f;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        this.roundedCornerRadius = f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float f) {
        this.fabDiameter = f;
    }

    public void setHorizontalOffset(float f) {
        this.horizontalOffset = f;
    }
}
