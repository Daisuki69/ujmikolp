package androidx.camera.core.impl;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static CameraSelector a(CameraInfoInternal cameraInfoInternal) {
        return new CameraSelector.Builder().addCameraFilter(new g(cameraInfoInternal, 0)).addCameraFilter(new LensFacingCameraFilter(cameraInfoInternal.getLensFacing())).build();
    }

    public static CameraInfoInternal b(CameraInfoInternal cameraInfoInternal) {
        return cameraInfoInternal;
    }

    public static boolean c(CameraInfoInternal cameraInfoInternal) {
        return false;
    }

    public static boolean d(CameraInfoInternal cameraInfoInternal) {
        return false;
    }

    public static /* synthetic */ List e(CameraInfoInternal cameraInfoInternal, List list) {
        String cameraId = cameraInfoInternal.getCameraId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            Preconditions.checkArgument(cameraInfo instanceof CameraInfoInternal);
            if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalStateException(We.s.j("Unable to find camera with id ", cameraId, " from list of available cameras."));
    }
}
