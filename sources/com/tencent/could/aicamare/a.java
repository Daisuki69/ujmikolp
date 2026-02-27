package com.tencent.could.aicamare;

import android.hardware.Camera;
import com.tencent.could.aicamare.callback.CameraEventListener;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15525a;

    public a(d dVar) {
        this.f15525a = dVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z4, Camera camera) {
        this.f15525a.e = false;
        this.f15525a.a("cameraFocus focus: " + z4);
        CameraEventListener cameraEventListener = this.f15525a.f15531b;
        if (cameraEventListener != null) {
            cameraEventListener.onAutoFocusSucceed();
        }
    }
}
