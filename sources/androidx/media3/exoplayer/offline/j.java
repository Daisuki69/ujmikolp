package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadService;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8054b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.f8053a = i;
        this.f8054b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8053a) {
            case 0:
                ((DownloadService.DownloadManagerHelper) this.f8054b).lambda$attachService$0((DownloadService) this.c);
                break;
            case 1:
                ((DownloadHelper) this.f8054b).lambda$onMediaPreparationFailed$5((IOException) this.c);
                break;
            default:
                ((DownloadHelper) this.f8054b).lambda$prepare$3((DownloadHelper.Callback) this.c);
                break;
        }
    }
}
