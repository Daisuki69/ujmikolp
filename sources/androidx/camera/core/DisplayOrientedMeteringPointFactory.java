package androidx.camera.core;

import android.graphics.PointF;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayOrientedMeteringPointFactory extends MeteringPointFactory {

    @NonNull
    private final CameraInfo mCameraInfo;

    @NonNull
    private final Display mDisplay;
    private final float mHeight;
    private final float mWidth;

    public DisplayOrientedMeteringPointFactory(@NonNull Display display, @NonNull CameraInfo cameraInfo, float f, float f3) {
        this.mWidth = f;
        this.mHeight = f3;
        this.mDisplay = display;
        this.mCameraInfo = cameraInfo;
    }

    private int getRelativeCameraOrientation(boolean z4) {
        try {
            int sensorRotationDegrees = this.mCameraInfo.getSensorRotationDegrees(this.mDisplay.getRotation());
            return z4 ? (360 - sensorRotationDegrees) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS : sensorRotationDegrees;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PointF convertPoint(float f, float f3) {
        float f7 = this.mWidth;
        float f10 = this.mHeight;
        boolean z4 = this.mCameraInfo.getLensFacing() == 0;
        int relativeCameraOrientation = getRelativeCameraOrientation(z4);
        if (relativeCameraOrientation != 90 && relativeCameraOrientation != 270) {
            f3 = f;
            f = f3;
            f10 = f7;
            f7 = f10;
        }
        if (relativeCameraOrientation == 90) {
            f = f7 - f;
        } else if (relativeCameraOrientation == 180) {
            f3 = f10 - f3;
            f = f7 - f;
        } else if (relativeCameraOrientation == 270) {
            f3 = f10 - f3;
        }
        if (z4) {
            f3 = f10 - f3;
        }
        return new PointF(f3 / f10, f / f7);
    }
}
