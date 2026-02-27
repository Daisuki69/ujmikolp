package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.CameraInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements CameraConfigProvider {
    @Override // androidx.camera.core.impl.CameraConfigProvider
    public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
        return e.a(cameraInfo, context);
    }
}
