package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8134a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f8135b;
    public final /* synthetic */ long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8136d;

    public /* synthetic */ g(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.f8135b = eventDispatcher;
        this.f8136d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8134a) {
            case 0:
                this.f8135b.lambda$droppedFrames$3(this.f8136d, this.c);
                break;
            default:
                this.f8135b.lambda$reportVideoFrameProcessingOffset$4(this.c, this.f8136d);
                break;
        }
    }

    public /* synthetic */ g(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.f8135b = eventDispatcher;
        this.c = j;
        this.f8136d = i;
    }
}
