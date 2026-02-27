package androidx.camera.core;

import androidx.camera.core.SurfaceRequest;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener f7497b;
    public final /* synthetic */ SurfaceRequest.TransformationInfo c;

    public /* synthetic */ B(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo, int i) {
        this.f7496a = i;
        this.f7497b = transformationInfoListener;
        this.c = transformationInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7496a) {
            case 0:
                this.f7497b.onTransformationInfoUpdate(this.c);
                break;
            default:
                this.f7497b.onTransformationInfoUpdate(this.c);
                break;
        }
    }
}
