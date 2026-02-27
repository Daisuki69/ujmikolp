package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import androidx.media3.exoplayer.video.VideoSink;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CompositingVideoSinkProvider.VideoSinkImpl f8131b;
    public final /* synthetic */ VideoSink.Listener c;

    public /* synthetic */ d(CompositingVideoSinkProvider.VideoSinkImpl videoSinkImpl, VideoSink.Listener listener, int i) {
        this.f8130a = i;
        this.f8131b = videoSinkImpl;
        this.c = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8130a) {
            case 0:
                this.f8131b.lambda$onFrameDropped$1(this.c);
                break;
            default:
                this.f8131b.lambda$onFirstFrameRendered$0(this.c);
                break;
        }
    }
}
