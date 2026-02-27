package androidx.media3.exoplayer.source.ads;

import O1.X;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8079b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8080d;

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.f8078a = i;
        this.f8079b = obj;
        this.c = obj2;
        this.f8080d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8078a) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f8079b).lambda$onPrepareError$1((MediaSource.MediaPeriodId) this.c, (IOException) this.f8080d);
                break;
            default:
                ((ServerSideAdInsertionMediaSource) this.f8079b).lambda$setAdPlaybackStates$0((X) this.c, (Timeline) this.f8080d);
                break;
        }
    }
}
