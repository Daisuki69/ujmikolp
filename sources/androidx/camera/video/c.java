package androidx.camera.video;

import androidx.camera.video.Recorder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recorder f7645b;
    public final /* synthetic */ Recorder.RecordingRecord c;

    public /* synthetic */ c(Recorder recorder, Recorder.RecordingRecord recordingRecord, int i) {
        this.f7644a = i;
        this.f7645b = recorder;
        this.c = recordingRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7644a) {
            case 0:
                this.f7645b.lambda$resume$4(this.c);
                break;
            default:
                this.f7645b.lambda$pause$3(this.c);
                break;
        }
    }
}
