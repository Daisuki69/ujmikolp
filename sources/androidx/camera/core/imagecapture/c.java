package androidx.camera.core.imagecapture;

import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.CaptureNode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7518b;

    public /* synthetic */ c(Object obj, int i) {
        this.f7517a = i;
        this.f7518b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7517a) {
            case 0:
                ((SafeCloseImageReaderProxy) this.f7518b).safeClose();
                break;
            case 1:
                CaptureNode.lambda$releaseInputResources$4((SafeCloseImageReaderProxy) this.f7518b);
                break;
            default:
                ((CaptureNode.AnonymousClass1) this.f7518b).lambda$onCaptureStarted$0();
                break;
        }
    }
}
