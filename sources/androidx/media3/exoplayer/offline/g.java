package androidx.media3.exoplayer.offline;

import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements RequirementsWatcher.Listener, CacheWriter.ProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8052a;

    public /* synthetic */ g(Object obj) {
        this.f8052a = obj;
    }

    @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
    public void onProgress(long j, long j6, long j7) {
        ((ProgressiveDownloader) this.f8052a).onProgress(j, j6, j7);
    }

    @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        ((DownloadManager) this.f8052a).onRequirementsStateChanged(requirementsWatcher, i);
    }
}
