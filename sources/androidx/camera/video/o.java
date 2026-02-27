package androidx.camera.video;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7699b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.f7698a = i;
        this.f7699b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f7698a) {
            case 0:
                ((Recorder.RecordingRecord) this.f7699b).lambda$updateVideoRecordEvent$6((VideoRecordEvent) this.c);
                break;
            case 1:
                ((VideoCapture.AnonymousClass2) this.f7699b).lambda$onCaptureCompleted$0((SessionConfig.Builder) this.c);
                break;
            case 2:
                ((VideoEncoderSession) this.f7699b).lambda$configureVideoEncoderInternal$4((Surface) this.c);
                break;
            case 3:
                ((Executor) this.f7699b).execute((Runnable) this.c);
                break;
            case 4:
                ((Recorder) this.f7699b).lambda$onSourceStateChanged$1((VideoOutput.SourceState) this.c);
                break;
            default:
                ((VideoCapture) this.f7699b).lambda$createPipeline$2((DeferrableSurface) this.c);
                break;
        }
    }
}
