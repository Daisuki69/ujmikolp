package com.tencent.could.aicamare;

import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.util.CameraLogger;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Camera f15526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f15527b;

    public b(d dVar, Camera camera) {
        this.f15527b = dVar;
        this.f15526a = camera;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.f15526a == null) {
            CameraLogger.b("CameraHolderImp", "currentCamera is null!", this.f15527b.c);
            return;
        }
        CameraEventListener cameraEventListener = this.f15527b.f15531b;
        if (cameraEventListener != null) {
            cameraEventListener.onDataFrameCallBack(bArr);
        }
    }
}
