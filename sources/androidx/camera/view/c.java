package androidx.camera.view;

import androidx.camera.core.ImageCapture;
import androidx.camera.view.CameraController;
import androidx.camera.view.PreviewViewImplementation;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7720b;

    public /* synthetic */ c(Object obj, int i) {
        this.f7719a = i;
        this.f7720b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7719a) {
            case 0:
                ((CameraController.AnonymousClass2) this.f7720b).lambda$accept$0();
                break;
            case 1:
                ((PreviewViewImplementation.OnSurfaceNotInUseListener) this.f7720b).onSurfaceNotInUse();
                break;
            default:
                ((ImageCapture.ScreenFlashListener) this.f7720b).onCompleted();
                break;
        }
    }
}
