package androidx.camera.video.internal.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioSource f7659b;

    public /* synthetic */ c(AudioSource audioSource, int i) {
        this.f7658a = i;
        this.f7659b = audioSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7658a) {
            case 0:
                this.f7659b.lambda$stop$3();
                break;
            default:
                this.f7659b.lambda$start$1();
                break;
        }
    }
}
