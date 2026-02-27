package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelayMetCommandHandler f8234b;

    public /* synthetic */ a(DelayMetCommandHandler delayMetCommandHandler, int i) {
        this.f8233a = i;
        this.f8234b = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8233a) {
            case 0:
                this.f8234b.stopWork();
                break;
            default:
                this.f8234b.startWork();
                break;
        }
    }
}
