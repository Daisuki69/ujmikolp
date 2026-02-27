package androidx.camera.video.internal.encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderImpl f7672b;

    public /* synthetic */ e(EncoderImpl encoderImpl, int i) {
        this.f7671a = i;
        this.f7672b = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7671a) {
            case 0:
                this.f7672b.lambda$stop$2();
                break;
            case 1:
                this.f7672b.lambda$release$6();
                break;
            case 2:
                this.f7672b.lambda$requestKeyFrame$8();
                break;
            case 3:
                this.f7672b.lambda$signalSourceStopped$7();
                break;
            case 4:
                this.f7672b.signalEndOfInputStream();
                break;
            default:
                this.f7672b.lambda$stop$3();
                break;
        }
    }
}
