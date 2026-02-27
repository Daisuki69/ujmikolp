package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.CaptureNode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7520b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(Object obj, int i, int i4) {
        this.f7519a = i4;
        this.c = obj;
        this.f7520b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7519a) {
            case 0:
                ((CaptureNode.AnonymousClass1) this.c).lambda$onCaptureProcessProgressed$1(this.f7520b);
                break;
            default:
                ((TakePictureRequest) this.c).lambda$onCaptureProcessProgressed$3(this.f7520b);
                break;
        }
    }
}
