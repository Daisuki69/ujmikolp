package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class OutConfig {
    @NonNull
    public static OutConfig of(@NonNull SurfaceEdge surfaceEdge) {
        return of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
    }

    @NonNull
    public abstract Rect getCropRect();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    @NonNull
    public abstract Size getSize();

    public abstract int getTargets();

    @NonNull
    public abstract UUID getUuid();

    public abstract boolean isMirroring();

    public abstract boolean shouldRespectInputCropRect();

    @NonNull
    public static OutConfig of(int i, int i4, @NonNull Rect rect, @NonNull Size size, int i6, boolean z4) {
        return of(i, i4, rect, size, i6, z4, false);
    }

    @NonNull
    public static OutConfig of(int i, int i4, @NonNull Rect rect, @NonNull Size size, int i6, boolean z4, boolean z5) {
        return new AutoValue_OutConfig(UUID.randomUUID(), i, i4, rect, size, i6, z4, z5);
    }
}
