package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f8133b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(VideoRendererEventListener.EventDispatcher eventDispatcher, Object obj, int i) {
        this.f8132a = i;
        this.f8133b = eventDispatcher;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8132a) {
            case 0:
                this.f8133b.lambda$videoSizeChanged$5((VideoSize) this.c);
                break;
            case 1:
                this.f8133b.lambda$videoCodecError$9((Exception) this.c);
                break;
            default:
                this.f8133b.lambda$decoderReleased$7((String) this.c);
                break;
        }
    }
}
