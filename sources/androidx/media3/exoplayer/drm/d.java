package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8005b;

    public /* synthetic */ d(Object obj, int i) {
        this.f8004a = i;
        this.f8005b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8004a) {
            case 0:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f8005b).lambda$release$1();
                break;
            default:
                ((DefaultDrmSession) this.f8005b).release(null);
                break;
        }
    }
}
