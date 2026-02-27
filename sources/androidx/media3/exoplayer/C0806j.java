package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: renamed from: androidx.media3.exoplayer.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0806j implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSource.Factory f8032b;

    public /* synthetic */ C0806j(MediaSource.Factory factory, int i) {
        this.f8031a = i;
        this.f8032b = factory;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f8031a) {
            case 0:
                return ExoPlayer.Builder.lambda$new$7(this.f8032b);
            case 1:
                return ExoPlayer.Builder.lambda$new$9(this.f8032b);
            case 2:
                return ExoPlayer.Builder.lambda$new$5(this.f8032b);
            default:
                return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(this.f8032b);
        }
    }
}
