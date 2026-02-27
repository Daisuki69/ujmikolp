package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioSource.AudioSourceCallback f7661b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d(AudioSource.AudioSourceCallback audioSourceCallback, boolean z4, int i) {
        this.f7660a = i;
        this.f7661b = audioSourceCallback;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7660a) {
            case 0:
                this.f7661b.onSilenceStateChanged(this.c);
                break;
            default:
                this.f7661b.onSuspendStateChanged(this.c);
                break;
        }
    }
}
