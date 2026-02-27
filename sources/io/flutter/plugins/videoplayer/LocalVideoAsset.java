package io.flutter.plugins.videoplayer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes4.dex */
final class LocalVideoAsset extends VideoAsset {
    public LocalVideoAsset(@NonNull String str) {
        super(str);
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    @NonNull
    public MediaItem getMediaItem() {
        return new MediaItem.Builder().setUri(this.assetUrl).build();
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    @NonNull
    public MediaSource.Factory getMediaSourceFactory(@NonNull Context context) {
        return new DefaultMediaSourceFactory(context);
    }
}
