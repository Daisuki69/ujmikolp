package androidx.camera.camera2.internal;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0728k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f7464b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ RunnableC0728k(Camera2CameraImpl camera2CameraImpl, ArrayList arrayList, int i) {
        this.f7463a = i;
        this.f7464b = camera2CameraImpl;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7463a) {
            case 0:
                this.f7464b.lambda$detachUseCases$16(this.c);
                break;
            default:
                this.f7464b.lambda$attachUseCases$15(this.c);
                break;
        }
    }
}
