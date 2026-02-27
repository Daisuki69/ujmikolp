package androidx.media3.exoplayer.video;

import androidx.media3.common.Format;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8128b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8129d;

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.f8127a = i;
        this.f8128b = obj;
        this.c = obj2;
        this.f8129d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8127a) {
            case 0:
                ((CompositingVideoSinkProvider.VideoSinkImpl) this.f8128b).lambda$onVideoSizeChanged$2((VideoSink.Listener) this.c, (VideoSize) this.f8129d);
                break;
            case 1:
                ((CompositingVideoSinkProvider.VideoSinkImpl) this.f8128b).lambda$onError$3((VideoSink.Listener) this.c, (VideoFrameProcessingException) this.f8129d);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f8128b).lambda$inputFormatChanged$2((Format) this.c, (DecoderReuseEvaluation) this.f8129d);
                break;
        }
    }
}
