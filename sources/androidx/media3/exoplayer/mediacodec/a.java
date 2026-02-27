package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f8038b;
    public final /* synthetic */ MediaCodecAdapter c;

    public /* synthetic */ a(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i) {
        this.f8037a = i;
        this.c = mediaCodecAdapter;
        this.f8038b = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j6) {
        switch (this.f8037a) {
            case 0:
                ((AsynchronousMediaCodecAdapter) this.c).lambda$setOnFrameRenderedListener$0(this.f8038b, mediaCodec, j, j6);
                break;
            default:
                ((SynchronousMediaCodecAdapter) this.c).lambda$setOnFrameRenderedListener$0(this.f8038b, mediaCodec, j, j6);
                break;
        }
    }
}
