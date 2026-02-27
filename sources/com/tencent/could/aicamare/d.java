package com.tencent.could.aicamare;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.callback.CameraLoggerCallBack;
import com.tencent.could.aicamare.entity.CameraConfig;
import com.tencent.could.aicamare.util.CameraLogger;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.tencent.could.aicamare.entity.a f15530a = new com.tencent.could.aicamare.entity.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CameraEventListener f15531b;
    public CameraLoggerCallBack c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CameraConfig f15532d;
    public volatile boolean e;
    public WeakReference<Context> f;

    public void b(String str) {
        CameraLogger.b("CameraHolderImp", str, this.c);
    }

    public boolean a(Camera camera) {
        if (!this.f15532d.isByteDataBuffer()) {
            camera.setPreviewCallback(new b(this, camera));
            return true;
        }
        camera.setPreviewCallbackWithBuffer(new c(this, camera));
        Camera.Size size = this.f15530a.f15535d;
        if (size != null) {
            camera.addCallbackBuffer(new byte[(ImageFormat.getBitsPerPixel(17) * (size.width * size.height)) / 8]);
            return true;
        }
        a(3, "current size is null");
        CameraLogger.b("CameraHolderImp", "start Preview buffer happen error!", this.c);
        return false;
    }

    public void a(String str) {
        CameraLogger.a("CameraHolderImp", str, this.c);
    }

    public void a(Context context) {
        if (context == null) {
            CameraLogger.b("CameraHolderImp", "set context input a null", this.c);
            return;
        }
        WeakReference<Context> weakReference = this.f;
        if ((weakReference == null ? null : weakReference.get()) == null) {
            this.f = new WeakReference<>(context);
        }
    }

    public final void a(int i, String str) {
        CameraEventListener cameraEventListener = this.f15531b;
        if (cameraEventListener != null) {
            cameraEventListener.onEventError(i, str);
            return;
        }
        b("sendEventError, code: " + i + " msg: " + str);
    }
}
