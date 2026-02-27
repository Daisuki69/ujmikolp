package androidx.media3.exoplayer.drm;

import S1.E;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OfflineLicenseHelper f8015b;
    public final /* synthetic */ DrmSession c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f8016d;

    public /* synthetic */ o(E e, DrmSession drmSession, OfflineLicenseHelper offlineLicenseHelper) {
        this.f8014a = 1;
        this.f8015b = offlineLicenseHelper;
        this.c = drmSession;
        this.f8016d = e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8014a) {
            case 0:
                this.f8015b.lambda$getLicenseDurationRemainingSec$0(this.f8016d, this.c);
                break;
            case 1:
                this.f8015b.lambda$acquireFirstSessionOnHandlerThread$3(this.c, this.f8016d);
                break;
            default:
                this.f8015b.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(this.f8016d, this.c);
                break;
        }
    }

    public /* synthetic */ o(OfflineLicenseHelper offlineLicenseHelper, E e, DrmSession drmSession, int i) {
        this.f8014a = i;
        this.f8015b = offlineLicenseHelper;
        this.f8016d = e;
        this.c = drmSession;
    }
}
