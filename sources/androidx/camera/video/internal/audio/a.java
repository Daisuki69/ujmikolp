package androidx.camera.video.internal.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioSource f7657b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a(AudioSource audioSource, boolean z4, int i) {
        this.f7656a = i;
        this.f7657b = audioSource;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7656a) {
            case 0:
                this.f7657b.lambda$mute$7(this.c);
                break;
            default:
                this.f7657b.lambda$start$2(this.c);
                break;
        }
    }
}
