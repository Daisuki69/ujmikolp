package androidx.camera.core.impl.utils;

import We.s;
import androidx.camera.core.Logger;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class CameraOrientationUtil {
    private static final String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalStateException(s.f(i, "Invalid sensor rotation: "));
    }

    public static int getRelativeImageRotation(int i, int i4, boolean z4) {
        int i6 = z4 ? ((i4 - i) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS : (i4 + i) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        if (Logger.isVerboseEnabled(TAG)) {
            StringBuilder sbU = s.u("getRelativeImageRotation: destRotationDegrees=", i, ", sourceRotationDegrees=", i4, ", isOppositeFacing=");
            sbU.append(z4);
            sbU.append(", result=");
            sbU.append(i6);
            Logger.d(TAG, sbU.toString());
        }
        return i6;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(s.f(i, "Unsupported surface rotation: "));
    }
}
