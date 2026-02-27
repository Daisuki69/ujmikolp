package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Consumer;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceOutput extends Closeable {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class CameraInputInfo {
        @NonNull
        public static CameraInputInfo of(@NonNull Size size, @NonNull Rect rect, @Nullable CameraInternal cameraInternal, int i, boolean z4) {
            return new AutoValue_SurfaceOutput_CameraInputInfo(size, rect, cameraInternal, i, z4);
        }

        @Nullable
        public abstract CameraInternal getCameraInternal();

        @NonNull
        public abstract Rect getInputCropRect();

        @NonNull
        public abstract Size getInputSize();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();
    }

    public static abstract class Event {
        public static final int EVENT_REQUEST_CLOSE = 0;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface EventCode {
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Event of(int i, @NonNull SurfaceOutput surfaceOutput) {
            return new AutoValue_SurfaceOutput_Event(i, surfaceOutput);
        }

        public abstract int getEventCode();

        @NonNull
        public abstract SurfaceOutput getSurfaceOutput();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    int getFormat();

    @NonNull
    Matrix getSensorToBufferTransform();

    @NonNull
    Size getSize();

    @NonNull
    Surface getSurface(@NonNull Executor executor, @NonNull Consumer<Event> consumer);

    int getTargets();

    void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2, boolean z4);
}
