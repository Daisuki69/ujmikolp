package androidx.camera.video;

import androidx.camera.core.impl.SessionConfig;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7643b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f7642a = i;
        this.f7643b = obj;
        this.c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7642a) {
            case 0:
                return ((Recorder) this.f7643b).lambda$updateEncoderCallbacks$10((Recorder.RecordingRecord) this.c, completer);
            case 1:
                return ((Recorder) this.f7643b).lambda$updateEncoderCallbacks$12((Recorder.RecordingRecord) this.c, completer);
            default:
                return ((VideoCapture) this.f7643b).lambda$setupSurfaceUpdateNotifier$6((SessionConfig.Builder) this.c, completer);
        }
    }
}
