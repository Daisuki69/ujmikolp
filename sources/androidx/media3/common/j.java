package androidx.media3.common;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimpleBasePlayer.State f7881b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(SimpleBasePlayer.State state, Object obj, int i) {
        this.f7880a = i;
        this.f7881b = state;
        this.c = obj;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f7880a) {
            case 0:
                return SimpleBasePlayer.lambda$setVideoTextureView$20(this.f7881b, (Size) this.c);
            case 1:
                return SimpleBasePlayer.lambda$setPlaylistMetadata$15(this.f7881b, (MediaMetadata) this.c);
            case 2:
                return SimpleBasePlayer.lambda$setVideoSurfaceHolder$18(this.f7881b, (SurfaceHolder) this.c);
            case 3:
                return SimpleBasePlayer.lambda$setVideoSurfaceView$19(this.f7881b, (SurfaceView) this.c);
            case 4:
                return SimpleBasePlayer.lambda$setAudioAttributes$30(this.f7881b, (AudioAttributes) this.c);
            case 5:
                return SimpleBasePlayer.lambda$setPlaybackParameters$11(this.f7881b, (PlaybackParameters) this.c);
            default:
                return SimpleBasePlayer.lambda$setTrackSelectionParameters$14(this.f7881b, (TrackSelectionParameters) this.c);
        }
    }
}
