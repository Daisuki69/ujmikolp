package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceEdge.SettableSurface f7596b;

    public /* synthetic */ j(SurfaceEdge.SettableSurface settableSurface, int i) {
        this.f7595a = i;
        this.f7596b = settableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7595a) {
            case 0:
                this.f7596b.close();
                break;
            case 1:
                this.f7596b.decrementUseCount();
                break;
            default:
                this.f7596b.lambda$close$1();
                break;
        }
    }
}
