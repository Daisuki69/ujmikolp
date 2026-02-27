package io.flutter.plugins.videoplayer.platformview;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import io.flutter.plugins.videoplayer.Messages;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.b;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class PlatformVideoViewFactory extends l {
    private final VideoPlayerProvider videoPlayerProvider;

    @FunctionalInterface
    public interface VideoPlayerProvider {
        @NonNull
        VideoPlayer getVideoPlayer(@NonNull Long l6);
    }

    public PlatformVideoViewFactory(@NonNull VideoPlayerProvider videoPlayerProvider) {
        super(b.a());
        this.videoPlayerProvider = videoPlayerProvider;
    }

    @Override // io.flutter.plugin.platform.l
    @NonNull
    public k create(@NonNull Context context, int i, @Nullable Object obj) {
        Messages.PlatformVideoViewCreationParams platformVideoViewCreationParams = (Messages.PlatformVideoViewCreationParams) obj;
        Objects.requireNonNull(platformVideoViewCreationParams);
        return new PlatformVideoView(context, this.videoPlayerProvider.getVideoPlayer(platformVideoViewCreationParams.getPlayerId()).getExoPlayer());
    }
}
