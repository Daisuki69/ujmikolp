package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.EncoderImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7688b;

    public /* synthetic */ l(Object obj, int i) {
        this.f7687a = i;
        this.f7688b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7687a) {
            case 0:
                ((EncoderCallback) this.f7688b).onEncodeStop();
                break;
            case 1:
                ((EncoderCallback) this.f7688b).onEncodeStart();
                break;
            case 2:
                ((EncoderCallback) this.f7688b).onEncodePaused();
                break;
            default:
                ((EncoderImpl.MediaCodecCallback) this.f7688b).reachEndData();
                break;
        }
    }
}
