package androidx.camera.camera2.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusMeteringControl f7370b;
    public final /* synthetic */ long c;

    public /* synthetic */ G(int i, long j, FocusMeteringControl focusMeteringControl) {
        this.f7369a = i;
        this.f7370b = focusMeteringControl;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7369a) {
            case 0:
                this.f7370b.lambda$executeMeteringAction$10(this.c);
                break;
            case 1:
                this.f7370b.lambda$executeMeteringAction$8(this.c);
                break;
            case 2:
                this.f7370b.lambda$executeMeteringAction$9(this.c);
                break;
            default:
                this.f7370b.lambda$executeMeteringAction$11(this.c);
                break;
        }
    }
}
