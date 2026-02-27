package io.flutter.plugins.videoplayer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoAsset {

    @Nullable
    protected final String assetUrl;

    public enum StreamingFormat {
        UNKNOWN,
        SMOOTH,
        DYNAMIC_ADAPTIVE,
        HTTP_LIVE
    }

    public VideoAsset(@Nullable String str) {
        this.assetUrl = str;
    }

    @NonNull
    public static VideoAsset fromAssetUrl(@NonNull String str) {
        if (str.startsWith("asset:///")) {
            return new LocalVideoAsset(str);
        }
        throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
    }

    @NonNull
    public static VideoAsset fromRemoteUrl(@Nullable String str, @NonNull StreamingFormat streamingFormat, @NonNull Map<String, String> map) {
        return new HttpVideoAsset(str, streamingFormat, new HashMap(map));
    }

    @NonNull
    public static VideoAsset fromRtspUrl(@NonNull String str) {
        if (str.startsWith("rtsp://")) {
            return new RtspVideoAsset(str);
        }
        throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
    }

    @NonNull
    public abstract MediaItem getMediaItem();

    @NonNull
    public abstract MediaSource.Factory getMediaSourceFactory(@NonNull Context context);
}
