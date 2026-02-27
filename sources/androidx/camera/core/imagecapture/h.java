package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7528b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.f7527a = i;
        this.f7528b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7527a) {
            case 0:
                ((ProcessingRequest) this.f7528b).onProcessFailure((ImageCaptureException) this.c);
                break;
            case 1:
                ((ProcessingRequest) this.f7528b).onFinalResult((ImageProxy) this.c);
                break;
            case 2:
                ((ProcessingRequest) this.f7528b).onFinalResult((ImageCapture.OutputFileResults) this.c);
                break;
            case 3:
                ((ProcessingRequest) this.f7528b).onPostviewBitmapAvailable((Bitmap) this.c);
                break;
            case 4:
                ((TakePictureManager) this.f7528b).lambda$trackCurrentRequests$1((RequestWithCallback) this.c);
                break;
            case 5:
                ((TakePictureRequest) this.f7528b).lambda$onResult$2((ImageProxy) this.c);
                break;
            case 6:
                ((TakePictureRequest) this.f7528b).lambda$onPostviewBitmapAvailable$4((Bitmap) this.c);
                break;
            case 7:
                ((TakePictureRequest) this.f7528b).lambda$onResult$1((ImageCapture.OutputFileResults) this.c);
                break;
            default:
                ((TakePictureRequest) this.f7528b).lambda$onError$0((ImageCaptureException) this.c);
                break;
        }
    }
}
