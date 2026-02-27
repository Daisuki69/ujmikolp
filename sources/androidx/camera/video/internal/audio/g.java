package androidx.camera.video.internal.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BufferedAudioStream f7663b;

    public /* synthetic */ g(BufferedAudioStream bufferedAudioStream, int i) {
        this.f7662a = i;
        this.f7663b = bufferedAudioStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7662a) {
            case 0:
                this.f7663b.lambda$stop$1();
                break;
            case 1:
                this.f7663b.lambda$start$0();
                break;
            case 2:
                this.f7663b.collectAudioData();
                break;
            default:
                this.f7663b.lambda$release$2();
                break;
        }
    }
}
