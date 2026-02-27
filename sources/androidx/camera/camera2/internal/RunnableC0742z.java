package androidx.camera.camera2.internal;

import android.util.Log;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0742z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7491a;

    public /* synthetic */ RunnableC0742z(int i) {
        this.f7491a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7491a) {
            case 0:
                Log.d(Camera2CapturePipeline.TAG, "enableExternalFlashAeMode disabled");
                break;
            case 1:
                Camera2CameraControlImpl.lambda$clearInteropConfig$1();
                break;
            default:
                Camera2CameraControlImpl.lambda$addInteropConfig$0();
                break;
        }
    }
}
