package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7574b;

    public /* synthetic */ p(Object obj, int i) {
        this.f7573a = i;
        this.f7574b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7573a) {
            case 0:
                ((ImageAnalysisNonBlockingAnalyzer) this.f7574b).analyzeCachedImage();
                break;
            case 1:
                ((Preview) this.f7574b).notifyReset();
                break;
            default:
                ((SurfaceRequest) this.f7574b).lambda$new$3();
                break;
        }
    }
}
