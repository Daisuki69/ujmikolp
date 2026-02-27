package androidx.camera.video;

import androidx.camera.video.Recorder;
import androidx.camera.video.internal.encoder.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7704b;

    public /* synthetic */ q(Object obj, int i) {
        this.f7703a = i;
        this.f7704b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7703a) {
            case 0:
                ((Recorder.SetupVideoTask.AnonymousClass1) this.f7704b).lambda$onFailure$0();
                break;
            case 1:
                ((VideoEncoderSession) this.f7704b).lambda$terminateNow$3();
                break;
            case 2:
                Recorder.lambda$stopInternal$13((Encoder) this.f7704b);
                break;
            default:
                ((VideoCapture) this.f7704b).notifyReset();
                break;
        }
    }
}
