package androidx.camera.core.processing;

import S1.y;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceProcessor;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceProcessorInternal extends SurfaceProcessor {
    void release();

    @NonNull
    y snapshot(@IntRange(from = 0, to = 100) int i, @IntRange(from = 0, to = 359) int i4);
}
