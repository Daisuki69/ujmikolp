package io.flutter.plugins.videoplayer.platformview;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.texture.TextureVideoPlayer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements VideoPlayer.ExoPlayerProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17327b;
    public final /* synthetic */ VideoAsset c;

    public /* synthetic */ a(Context context, VideoAsset videoAsset, int i) {
        this.f17326a = i;
        this.f17327b = context;
        this.c = videoAsset;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer.ExoPlayerProvider
    public final ExoPlayer get() {
        switch (this.f17326a) {
            case 0:
                return PlatformViewVideoPlayer.lambda$create$0(this.f17327b, this.c);
            default:
                return TextureVideoPlayer.lambda$create$0(this.f17327b, this.c);
        }
    }
}
