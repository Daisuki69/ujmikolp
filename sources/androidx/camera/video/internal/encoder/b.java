package androidx.camera.video.internal.encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderImpl f7666b;
    public final /* synthetic */ long c;

    public /* synthetic */ b(EncoderImpl encoderImpl, long j, int i) {
        this.f7665a = i;
        this.f7666b = encoderImpl;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7665a) {
            case 0:
                this.f7666b.lambda$start$1(this.c);
                break;
            default:
                this.f7666b.lambda$pause$5(this.c);
                break;
        }
    }
}
