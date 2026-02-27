package androidx.camera.core;

import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.internal.compat.MediaActionSoundCompat;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static float a(CameraInfo cameraInfo) {
        return 1.0f;
    }

    public static int b(CameraInfo cameraInfo) {
        return -1;
    }

    public static Set c(CameraInfo cameraInfo) {
        return Collections.EMPTY_SET;
    }

    public static Set d(CameraInfo cameraInfo) {
        return Collections.EMPTY_SET;
    }

    public static boolean e(CameraInfo cameraInfo, FocusMeteringAction focusMeteringAction) {
        return false;
    }

    public static boolean f(CameraInfo cameraInfo) {
        return false;
    }

    public static boolean g(CameraInfo cameraInfo) {
        return false;
    }

    public static boolean h(CameraInfo cameraInfo) {
        return false;
    }

    public static Set i(CameraInfo cameraInfo, Set set) {
        return DynamicRanges.findAllPossibleMatches(set, Collections.singleton(DynamicRange.SDR));
    }

    public static boolean j() {
        return MediaActionSoundCompat.mustPlayShutterSound();
    }
}
