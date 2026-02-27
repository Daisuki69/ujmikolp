package io.flutter.plugins.videoplayer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes4.dex */
final class RtspVideoAsset extends VideoAsset {
    public RtspVideoAsset(@NonNull String str) {
        super(str);
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    @NonNull
    public MediaItem getMediaItem() {
        return new MediaItem.Builder().setUri(this.assetUrl).build();
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    @OptIn(markerClass = {UnstableApi.class})
    public MediaSource.Factory getMediaSourceFactory(Context context) {
        return new RtspMediaSource.Factory();
    }
}
