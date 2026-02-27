package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7984b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, long j, int i) {
        this.f7983a = i;
        this.c = obj;
        this.f7984b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7983a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.c).lambda$positionAdvancing$3(this.f7984b);
                break;
            default:
                ((PreloadMediaSource) this.c).lambda$preload$0(this.f7984b);
                break;
        }
    }
}
