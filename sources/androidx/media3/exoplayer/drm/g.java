package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f8007b;
    public final /* synthetic */ DrmSessionEventListener c;

    public /* synthetic */ g(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.f8006a = i;
        this.f8007b = eventDispatcher;
        this.c = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8006a) {
            case 0:
                this.f8007b.lambda$drmKeysRemoved$4(this.c);
                break;
            case 1:
                this.f8007b.lambda$drmKeysRestored$3(this.c);
                break;
            case 2:
                this.f8007b.lambda$drmKeysLoaded$1(this.c);
                break;
            default:
                this.f8007b.lambda$drmSessionReleased$5(this.c);
                break;
        }
    }
}
