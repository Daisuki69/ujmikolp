package androidx.camera.video;

import android.content.Context;
import android.net.Uri;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7696b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f7695a = i;
        this.f7696b = obj;
        this.c = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f7695a) {
            case 0:
                Recorder.RecordingRecord.lambda$initializeRecording$4((MediaStoreOutputOptions) this.f7696b, (Context) this.c, (Uri) obj);
                break;
            default:
                ((Recorder) this.f7696b).lambda$updateEncoderCallbacks$11((CallbackToFutureAdapter.Completer) this.c, (Throwable) obj);
                break;
        }
    }
}
