package androidx.camera.video;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7694b;

    public /* synthetic */ k(Object obj, int i) {
        this.f7693a = i;
        this.f7694b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f7693a) {
            case 0:
                Recorder.RecordingRecord.lambda$initializeRecording$2((MediaStoreOutputOptions) this.f7694b, (Uri) obj);
                break;
            case 1:
                Recorder.RecordingRecord.lambda$initializeRecording$5((ParcelFileDescriptor) this.f7694b, (Uri) obj);
                break;
            case 2:
                ((VideoEncoderSession) this.f7694b).onSurfaceRequestComplete((SurfaceRequest.Result) obj);
                break;
            case 3:
                ((Recorder) this.f7694b).lambda$setupAndStartMediaMuxer$9((Uri) obj);
                break;
            default:
                ((VideoSpec.Builder) obj).setQualitySelector((QualitySelector) this.f7694b);
                break;
        }
    }
}
