package androidx.camera.core.impl;

import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static CameraControl a(CameraInternal cameraInternal) {
        return cameraInternal.getCameraControlInternal();
    }

    public static CameraInfo b(CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfoInternal();
    }

    public static CameraConfig c(CameraInternal cameraInternal) {
        return CameraConfigs.defaultConfig();
    }

    public static boolean d(CameraInternal cameraInternal) {
        return true;
    }

    public static boolean e(CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfo().getLensFacing() == 0;
    }

    public static void f(CameraInternal cameraInternal, boolean z4) {
    }

    public static void g(CameraInternal cameraInternal, CameraConfig cameraConfig) {
    }

    public static void h(CameraInternal cameraInternal, boolean z4) {
    }
}
