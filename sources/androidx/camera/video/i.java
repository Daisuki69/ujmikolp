package androidx.camera.video;

import androidx.camera.video.AudioSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7655b;

    public /* synthetic */ i(int i, int i4) {
        this.f7654a = i4;
        this.f7655b = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f7654a) {
            case 0:
                Recorder.Builder.lambda$setTargetVideoEncodingBitRate$1(this.f7655b, (VideoSpec.Builder) obj);
                break;
            case 1:
                ((AudioSpec.Builder) obj).setSource(this.f7655b);
                break;
            default:
                ((VideoSpec.Builder) obj).setAspectRatio(this.f7655b);
                break;
        }
    }
}
