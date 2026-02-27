package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.Recorder;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7701b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7702d;

    public /* synthetic */ p(int i, Object obj, Object obj2, Object obj3) {
        this.f7700a = i;
        this.f7702d = obj;
        this.f7701b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7700a) {
            case 0:
                ((Recorder.SetupVideoTask) this.f7702d).lambda$setupVideo$0((SurfaceRequest) this.f7701b, (Timebase) this.c);
                break;
            case 1:
                ((Recorder) this.f7702d).lambda$onSurfaceRequested$0((SurfaceRequest) this.f7701b, (Timebase) this.c);
                break;
            default:
                VideoCapture.lambda$setupSurfaceUpdateNotifier$5((AtomicBoolean) this.f7702d, (SessionConfig.Builder) this.f7701b, (CameraCaptureCallback) this.c);
                break;
        }
    }
}
