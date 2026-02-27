package androidx.camera.camera2.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f7397b;
    public final /* synthetic */ SynchronizedCaptureSession c;

    public /* synthetic */ V(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, SynchronizedCaptureSession synchronizedCaptureSession, int i) {
        this.f7396a = i;
        this.f7397b = synchronizedCaptureSessionBaseImpl;
        this.c = synchronizedCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7396a) {
            case 0:
                this.f7397b.lambda$onSessionFinished$4(this.c);
                break;
            default:
                this.f7397b.lambda$onClosed$3(this.c);
                break;
        }
    }
}
