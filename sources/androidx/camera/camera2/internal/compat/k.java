package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static CameraManagerCompat.CameraManagerCompatImpl a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return i >= 30 ? new CameraManagerCompatApi30Impl(context) : i >= 29 ? new CameraManagerCompatApi29Impl(context) : i >= 28 ? CameraManagerCompatApi28Impl.create(context) : CameraManagerCompatBaseImpl.create(context, handler);
    }
}
