package com.tencent.could.aicamare;

import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.util.CameraLogger;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Camera f15528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f15529b;

    public c(d dVar, Camera camera) {
        this.f15529b = dVar;
        this.f15528a = camera;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.f15528a == null) {
            CameraLogger.b("CameraHolderImp", "currentCamera is null!", this.f15529b.c);
            return;
        }
        CameraEventListener cameraEventListener = this.f15529b.f15531b;
        if (cameraEventListener != null) {
            cameraEventListener.onDataFrameCallBack(bArr);
        }
        this.f15528a.addCallbackBuffer(bArr);
    }
}
