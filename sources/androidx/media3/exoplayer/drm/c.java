package androidx.media3.exoplayer.drm;

import S1.E;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8003b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f8002a = i;
        this.f8003b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8002a) {
            case 0:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f8003b).lambda$acquire$0((Format) this.c);
                break;
            default:
                ((OfflineLicenseHelper) this.f8003b).lambda$releaseManagerOnHandlerThread$4((E) this.c);
                break;
        }
    }
}
