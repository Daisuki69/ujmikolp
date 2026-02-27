package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.core.math.MathUtils;

/* JADX INFO: loaded from: classes.dex */
class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f, float f3) {
        this.mMaxZoomRatio = f;
        this.mMinZoomRatio = f3;
    }

    private float getPercentageByRatio(float f) {
        float f3 = this.mMaxZoomRatio;
        float f7 = this.mMinZoomRatio;
        if (f3 == f7) {
            return 0.0f;
        }
        if (f == f3) {
            return 1.0f;
        }
        if (f == f7) {
            return 0.0f;
        }
        float f10 = 1.0f / f7;
        return ((1.0f / f) - f10) / ((1.0f / f3) - f10);
    }

    private float getRatioByPercentage(float f) {
        if (f == 1.0f) {
            return this.mMaxZoomRatio;
        }
        if (f == 0.0f) {
            return this.mMinZoomRatio;
        }
        float f3 = this.mMaxZoomRatio;
        float f7 = this.mMinZoomRatio;
        double d10 = 1.0f / f7;
        return (float) MathUtils.clamp(1.0d / (((((double) (1.0f / f3)) - d10) * ((double) f)) + d10), f7, f3);
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setLinearZoom(float f) throws IllegalArgumentException {
        if (f <= 1.0f && f >= 0.0f) {
            this.mLinearZoom = f;
            this.mZoomRatio = getRatioByPercentage(f);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
        }
    }

    public void setZoomRatio(float f) throws IllegalArgumentException {
        if (f <= this.mMaxZoomRatio && f >= this.mMinZoomRatio) {
            this.mZoomRatio = f;
            this.mLinearZoom = getPercentageByRatio(f);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Requested zoomRatio ");
        sb2.append(f);
        sb2.append(" is not within valid range [");
        sb2.append(this.mMinZoomRatio);
        sb2.append(" , ");
        throw new IllegalArgumentException(We.s.n(sb2, "]", this.mMaxZoomRatio));
    }
}
