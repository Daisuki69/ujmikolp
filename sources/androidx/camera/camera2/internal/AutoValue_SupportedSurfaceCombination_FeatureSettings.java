package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.SupportedSurfaceCombination;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SupportedSurfaceCombination_FeatureSettings extends SupportedSurfaceCombination.FeatureSettings {
    private final int cameraMode;
    private final boolean previewStabilizationOn;
    private final int requiredMaxBitDepth;
    private final boolean ultraHdrOn;

    public AutoValue_SupportedSurfaceCombination_FeatureSettings(int i, int i4, boolean z4, boolean z5) {
        this.cameraMode = i;
        this.requiredMaxBitDepth = i4;
        this.previewStabilizationOn = z4;
        this.ultraHdrOn = z5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SupportedSurfaceCombination.FeatureSettings) {
            SupportedSurfaceCombination.FeatureSettings featureSettings = (SupportedSurfaceCombination.FeatureSettings) obj;
            if (this.cameraMode == featureSettings.getCameraMode() && this.requiredMaxBitDepth == featureSettings.getRequiredMaxBitDepth() && this.previewStabilizationOn == featureSettings.isPreviewStabilizationOn() && this.ultraHdrOn == featureSettings.isUltraHdrOn()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public int getCameraMode() {
        return this.cameraMode;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public int getRequiredMaxBitDepth() {
        return this.requiredMaxBitDepth;
    }

    public int hashCode() {
        return ((((((this.cameraMode ^ 1000003) * 1000003) ^ this.requiredMaxBitDepth) * 1000003) ^ (this.previewStabilizationOn ? 1231 : 1237)) * 1000003) ^ (this.ultraHdrOn ? 1231 : 1237);
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isPreviewStabilizationOn() {
        return this.previewStabilizationOn;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isUltraHdrOn() {
        return this.ultraHdrOn;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureSettings{cameraMode=");
        sb2.append(this.cameraMode);
        sb2.append(", requiredMaxBitDepth=");
        sb2.append(this.requiredMaxBitDepth);
        sb2.append(", previewStabilizationOn=");
        sb2.append(this.previewStabilizationOn);
        sb2.append(", ultraHdrOn=");
        return We.s.s(sb2, this.ultraHdrOn, "}");
    }
}
