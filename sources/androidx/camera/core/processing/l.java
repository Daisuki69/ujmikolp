package androidx.camera.core.processing;

import androidx.window.area.WindowAreaControllerImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7599a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7600b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7601d;

    public /* synthetic */ l(int i, int i4, WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer rearDisplayPresentationSessionConsumer) {
        this.f7600b = i;
        this.c = i4;
        this.f7601d = rearDisplayPresentationSessionConsumer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7599a) {
            case 0:
                ((SurfaceEdge) this.f7601d).lambda$updateTransformation$3(this.f7600b, this.c);
                break;
            default:
                WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer.accept$lambda$0(this.f7600b, this.c, (WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer) this.f7601d);
                break;
        }
    }

    public /* synthetic */ l(SurfaceEdge surfaceEdge, int i, int i4) {
        this.f7601d = surfaceEdge;
        this.f7600b = i;
        this.c = i4;
    }
}
