package androidx.camera.video;

import android.net.Uri;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7697a;

    public /* synthetic */ n(int i) {
        this.f7697a = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f7697a) {
            case 0:
                Recorder.RecordingRecord.lambda$new$0((Uri) obj);
                break;
            default:
                Recorder.lambda$composeRecorderMediaSpec$8((VideoSpec.Builder) obj);
                break;
        }
    }
}
