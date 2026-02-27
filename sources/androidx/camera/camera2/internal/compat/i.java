package androidx.camera.camera2.internal.compat;

import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraManagerCompat.AvailabilityCallbackExecutorWrapper f7440b;
    public final /* synthetic */ String c;

    public /* synthetic */ i(CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper, String str, int i) {
        this.f7439a = i;
        this.f7440b = availabilityCallbackExecutorWrapper;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7439a) {
            case 0:
                this.f7440b.lambda$onCameraAvailable$1(this.c);
                break;
            default:
                this.f7440b.lambda$onCameraUnavailable$2(this.c);
                break;
        }
    }
}
