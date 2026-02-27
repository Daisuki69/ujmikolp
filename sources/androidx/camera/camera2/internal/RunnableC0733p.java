package androidx.camera.camera2.internal;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0733p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f7475b;

    public /* synthetic */ RunnableC0733p(Camera2CameraImpl camera2CameraImpl, int i) {
        this.f7474a = i;
        this.f7475b = camera2CameraImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7474a) {
            case 0:
                this.f7475b.openInternal();
                break;
            case 1:
                this.f7475b.lambda$configAndCloseIfNeeded$0();
                break;
            default:
                this.f7475b.closeInternal();
                break;
        }
    }
}
