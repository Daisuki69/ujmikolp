package androidx.camera.camera2.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoUsageControl f7403b;

    public /* synthetic */ Y(VideoUsageControl videoUsageControl, int i) {
        this.f7402a = i;
        this.f7403b = videoUsageControl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7402a) {
            case 0:
                VideoUsageControl.decrementUsage$lambda$1(this.f7403b);
                break;
            case 1:
                VideoUsageControl.reset$lambda$2(this.f7403b);
                break;
            default:
                VideoUsageControl.incrementUsage$lambda$0(this.f7403b);
                break;
        }
    }
}
