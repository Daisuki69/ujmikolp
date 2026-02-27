package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.offline.DownloadService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8056b;

    public /* synthetic */ k(Object obj, int i) {
        this.f8055a = i;
        this.f8056b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8055a) {
            case 0:
                ((DownloadService.ForegroundNotificationUpdater) this.f8056b).update();
                break;
            default:
                ((DownloadHelper) this.f8056b).lambda$onMediaPrepared$4();
                break;
        }
    }
}
