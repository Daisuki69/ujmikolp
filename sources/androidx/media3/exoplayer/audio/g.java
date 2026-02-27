package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7993b;
    public final /* synthetic */ long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7994d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, String str, long j, long j6, int i) {
        this.f7992a = i;
        this.e = obj;
        this.f7993b = str;
        this.c = j;
        this.f7994d = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7992a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.e).lambda$decoderInitialized$1(this.f7993b, this.c, this.f7994d);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.e).lambda$decoderInitialized$1(this.f7993b, this.c, this.f7994d);
                break;
        }
    }
}
