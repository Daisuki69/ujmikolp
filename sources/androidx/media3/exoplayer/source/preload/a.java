package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8103b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f8102a = i;
        this.f8103b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8102a) {
            case 0:
                ((BasePreloadManager) this.f8103b).lambda$onPreloadCompleted$0((MediaSource) this.c);
                break;
            default:
                ((PreloadMediaSource) this.f8103b).lambda$onChildSourceInfoRefreshed$2((Timeline) this.c);
                break;
        }
    }
}
