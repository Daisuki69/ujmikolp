package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f7989b;
    public final /* synthetic */ AudioSink.AudioTrackConfig c;

    public /* synthetic */ e(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f7988a = i;
        this.f7989b = eventDispatcher;
        this.c = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7988a) {
            case 0:
                this.f7989b.lambda$audioTrackInitialized$10(this.c);
                break;
            default:
                this.f7989b.lambda$audioTrackReleased$11(this.c);
                break;
        }
    }
}
