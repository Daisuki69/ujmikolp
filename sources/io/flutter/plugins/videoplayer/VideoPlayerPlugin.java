package io.flutter.plugins.videoplayer;

import We.s;
import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.p;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.platform.m;
import io.flutter.plugins.videoplayer.Messages;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory;
import io.flutter.plugins.videoplayer.platformview.PlatformViewVideoPlayer;
import io.flutter.plugins.videoplayer.texture.TextureVideoPlayer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.t;
import java.util.Objects;
import og.C1978b;
import pg.j;
import pg.n;

/* JADX INFO: loaded from: classes4.dex */
public class VideoPlayerPlugin implements FlutterPlugin, Messages.AndroidVideoPlayerApi {
    private static final String TAG = "VideoPlayerPlugin";
    private FlutterState flutterState;
    private final LongSparseArray<VideoPlayer> videoPlayers = new LongSparseArray<>();
    private final VideoPlayerOptions options = new VideoPlayerOptions();
    private Long nextPlatformViewPlayerId = Long.MAX_VALUE;

    public static final class FlutterState {
        final Context applicationContext;
        final j binaryMessenger;
        final KeyForAssetFn keyForAsset;
        final KeyForAssetAndPackageName keyForAssetAndPackageName;
        final t textureRegistry;

        public FlutterState(Context context, j jVar, KeyForAssetFn keyForAssetFn, KeyForAssetAndPackageName keyForAssetAndPackageName, t tVar) {
            this.applicationContext = context;
            this.binaryMessenger = jVar;
            this.keyForAsset = keyForAssetFn;
            this.keyForAssetAndPackageName = keyForAssetAndPackageName;
            this.textureRegistry = tVar;
        }

        public void startListening(VideoPlayerPlugin videoPlayerPlugin, j jVar) {
            b.m(jVar, videoPlayerPlugin);
        }

        public void stopListening(j jVar) {
            b.m(jVar, null);
        }
    }

    public interface KeyForAssetAndPackageName {
        String get(String str, String str2);
    }

    public interface KeyForAssetFn {
        String get(String str);
    }

    @NonNull
    private n createEventChannel(long j) {
        return new n(this.flutterState.binaryMessenger, androidx.camera.core.impl.a.f(j, "flutter.io/videoPlayer/videoEvents"));
    }

    private void disposeAllPlayers() {
        for (int i = 0; i < this.videoPlayers.size(); i++) {
            this.videoPlayers.valueAt(i).dispose();
        }
        this.videoPlayers.clear();
    }

    @NonNull
    private VideoPlayer getPlayer(long j) {
        VideoPlayer videoPlayer = this.videoPlayers.get(j);
        if (videoPlayer != null) {
            return videoPlayer;
        }
        String strI = androidx.media3.datasource.cache.c.i(j, "No player found with playerId <", ">");
        if (this.videoPlayers.size() == 0) {
            strI = s.i(strI, " and no active players created by the plugin.");
        }
        throw new IllegalStateException(strI);
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    @NonNull
    public Long create(@NonNull Messages.CreateMessage createMessage) {
        VideoAsset videoAssetFromRemoteUrl;
        long jId;
        VideoPlayer videoPlayerCreate;
        if (createMessage.getAsset() != null) {
            videoAssetFromRemoteUrl = VideoAsset.fromAssetUrl("asset:///" + (createMessage.getPackageName() != null ? this.flutterState.keyForAssetAndPackageName.get(createMessage.getAsset(), createMessage.getPackageName()) : this.flutterState.keyForAsset.get(createMessage.getAsset())));
        } else if (createMessage.getUri().startsWith("rtsp://")) {
            videoAssetFromRemoteUrl = VideoAsset.fromRtspUrl(createMessage.getUri());
        } else {
            VideoAsset.StreamingFormat streamingFormat = VideoAsset.StreamingFormat.UNKNOWN;
            String formatHint = createMessage.getFormatHint();
            if (formatHint != null) {
                switch (formatHint) {
                    case "ss":
                        streamingFormat = VideoAsset.StreamingFormat.SMOOTH;
                        break;
                    case "hls":
                        streamingFormat = VideoAsset.StreamingFormat.HTTP_LIVE;
                        break;
                    case "dash":
                        streamingFormat = VideoAsset.StreamingFormat.DYNAMIC_ADAPTIVE;
                        break;
                }
            }
            videoAssetFromRemoteUrl = VideoAsset.fromRemoteUrl(createMessage.getUri(), streamingFormat, createMessage.getHttpHeaders());
        }
        if (createMessage.getViewType() == Messages.PlatformVideoViewType.PLATFORM_VIEW) {
            Long l6 = this.nextPlatformViewPlayerId;
            this.nextPlatformViewPlayerId = Long.valueOf(l6.longValue() - 1);
            jId = l6.longValue();
            videoPlayerCreate = PlatformViewVideoPlayer.create(this.flutterState.applicationContext, VideoPlayerEventCallbacks.bindTo(createEventChannel(jId)), videoAssetFromRemoteUrl, this.options);
        } else {
            TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerCreateSurfaceProducer = this.flutterState.textureRegistry.createSurfaceProducer();
            jId = textureRegistry$SurfaceProducerCreateSurfaceProducer.id();
            videoPlayerCreate = TextureVideoPlayer.create(this.flutterState.applicationContext, VideoPlayerEventCallbacks.bindTo(createEventChannel(jId)), textureRegistry$SurfaceProducerCreateSurfaceProducer, videoAssetFromRemoteUrl, this.options);
        }
        this.videoPlayers.put(jId, videoPlayerCreate);
        return Long.valueOf(jId);
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void dispose(@NonNull Long l6) {
        getPlayer(l6.longValue()).dispose();
        this.videoPlayers.remove(l6.longValue());
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void initialize() {
        disposeAllPlayers();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C1978b c1978bA = C1978b.a();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        j binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        FlutterLoader flutterLoader = c1978bA.f18847a;
        FlutterState flutterState = new FlutterState(applicationContext, binaryMessenger, new c(flutterLoader), new c(flutterLoader), flutterPluginBinding.getTextureRegistry());
        this.flutterState = flutterState;
        flutterState.startListening(this, flutterPluginBinding.getBinaryMessenger());
        m platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        LongSparseArray<VideoPlayer> longSparseArray = this.videoPlayers;
        Objects.requireNonNull(longSparseArray);
        ((p) platformViewRegistry).x("plugins.flutter.dev/video_player_android", new PlatformVideoViewFactory(new c(longSparseArray)));
    }

    public void onDestroy() {
        disposeAllPlayers();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.flutterState == null) {
            Log.wtf(TAG, "Detached from the engine before registering to it.");
        }
        this.flutterState.stopListening(flutterPluginBinding.getBinaryMessenger());
        this.flutterState = null;
        onDestroy();
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void pause(@NonNull Long l6) {
        getPlayer(l6.longValue()).pause();
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void play(@NonNull Long l6) {
        getPlayer(l6.longValue()).play();
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    @NonNull
    public Long position(@NonNull Long l6) {
        VideoPlayer player = getPlayer(l6.longValue());
        long position = player.getPosition();
        player.sendBufferingUpdate();
        return Long.valueOf(position);
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void seekTo(@NonNull Long l6, @NonNull Long l8) {
        getPlayer(l6.longValue()).seekTo(l8.intValue());
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void setLooping(@NonNull Long l6, @NonNull Boolean bool) {
        getPlayer(l6.longValue()).setLooping(bool.booleanValue());
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void setMixWithOthers(@NonNull Boolean bool) {
        this.options.mixWithOthers = bool.booleanValue();
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void setPlaybackSpeed(@NonNull Long l6, @NonNull Double d10) {
        getPlayer(l6.longValue()).setPlaybackSpeed(d10.doubleValue());
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void setVolume(@NonNull Long l6, @NonNull Double d10) {
        getPlayer(l6.longValue()).setVolume(d10.doubleValue());
    }
}
