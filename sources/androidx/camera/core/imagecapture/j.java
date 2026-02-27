package androidx.camera.core.imagecapture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TakePictureManager f7532b;

    public /* synthetic */ j(TakePictureManager takePictureManager, int i) {
        this.f7531a = i;
        this.f7532b = takePictureManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7531a) {
            case 0:
                this.f7532b.lambda$trackCurrentRequests$0();
                break;
            default:
                this.f7532b.issueNextRequest();
                break;
        }
    }
}
