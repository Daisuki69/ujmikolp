package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static CaptureResult a(CameraCaptureResult cameraCaptureResult) {
        return null;
    }

    public static void b(CameraCaptureResult cameraCaptureResult, ExifData.Builder builder) {
        builder.setFlashState(cameraCaptureResult.getFlashState());
    }
}
