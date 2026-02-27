package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f7991b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ f(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i) {
        this.f7990a = i;
        this.f7991b = eventDispatcher;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7990a) {
            case 0:
                this.f7991b.lambda$audioCodecError$9(this.c);
                break;
            default:
                this.f7991b.lambda$audioSinkError$8(this.c);
                break;
        }
    }
}
