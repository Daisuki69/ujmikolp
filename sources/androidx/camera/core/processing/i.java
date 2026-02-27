package androidx.camera.core.processing;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceEdge f7594b;

    public /* synthetic */ i(SurfaceEdge surfaceEdge, int i) {
        this.f7593a = i;
        this.f7594b = surfaceEdge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7593a) {
            case 0:
                this.f7594b.lambda$createSurfaceRequest$1();
                break;
            default:
                this.f7594b.lambda$createSurfaceRequest$0();
                break;
        }
    }
}
