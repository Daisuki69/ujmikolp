package androidx.camera.core.processing.util;

import We.s;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_OutConfig extends OutConfig {
    private final Rect getCropRect;
    private final int getFormat;
    private final int getRotationDegrees;
    private final Size getSize;
    private final int getTargets;
    private final UUID getUuid;
    private final boolean isMirroring;
    private final boolean shouldRespectInputCropRect;

    public AutoValue_OutConfig(UUID uuid, int i, int i4, Rect rect, Size size, int i6, boolean z4, boolean z5) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.getUuid = uuid;
        this.getTargets = i;
        this.getFormat = i4;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.getCropRect = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.getSize = size;
        this.getRotationDegrees = i6;
        this.isMirroring = z4;
        this.shouldRespectInputCropRect = z5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutConfig) {
            OutConfig outConfig = (OutConfig) obj;
            if (this.getUuid.equals(outConfig.getUuid()) && this.getTargets == outConfig.getTargets() && this.getFormat == outConfig.getFormat() && this.getCropRect.equals(outConfig.getCropRect()) && this.getSize.equals(outConfig.getSize()) && this.getRotationDegrees == outConfig.getRotationDegrees() && this.isMirroring == outConfig.isMirroring() && this.shouldRespectInputCropRect == outConfig.shouldRespectInputCropRect()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    @NonNull
    public Rect getCropRect() {
        return this.getCropRect;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getFormat() {
        return this.getFormat;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getRotationDegrees() {
        return this.getRotationDegrees;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    @NonNull
    public Size getSize() {
        return this.getSize;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getTargets() {
        return this.getTargets;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    @NonNull
    public UUID getUuid() {
        return this.getUuid;
    }

    public int hashCode() {
        return ((((((((((((((this.getUuid.hashCode() ^ 1000003) * 1000003) ^ this.getTargets) * 1000003) ^ this.getFormat) * 1000003) ^ this.getCropRect.hashCode()) * 1000003) ^ this.getSize.hashCode()) * 1000003) ^ this.getRotationDegrees) * 1000003) ^ (this.isMirroring ? 1231 : 1237)) * 1000003) ^ (this.shouldRespectInputCropRect ? 1231 : 1237);
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public boolean isMirroring() {
        return this.isMirroring;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public boolean shouldRespectInputCropRect() {
        return this.shouldRespectInputCropRect;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OutConfig{getUuid=");
        sb2.append(this.getUuid);
        sb2.append(", getTargets=");
        sb2.append(this.getTargets);
        sb2.append(", getFormat=");
        sb2.append(this.getFormat);
        sb2.append(", getCropRect=");
        sb2.append(this.getCropRect);
        sb2.append(", getSize=");
        sb2.append(this.getSize);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.getRotationDegrees);
        sb2.append(", isMirroring=");
        sb2.append(this.isMirroring);
        sb2.append(", shouldRespectInputCropRect=");
        return s.s(sb2, this.shouldRespectInputCropRect, "}");
    }
}
