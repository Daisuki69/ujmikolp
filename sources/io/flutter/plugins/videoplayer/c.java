package io.flutter.plugins.videoplayer;

import android.util.LongSparseArray;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements VideoPlayerPlugin.KeyForAssetFn, VideoPlayerPlugin.KeyForAssetAndPackageName, PlatformVideoViewFactory.VideoPlayerProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17325a;

    @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetFn
    public String get(String str) {
        return ((FlutterLoader) this.f17325a).getLookupKeyForAsset(str);
    }

    @Override // io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory.VideoPlayerProvider
    public VideoPlayer getVideoPlayer(Long l6) {
        return (VideoPlayer) ((LongSparseArray) this.f17325a).get(l6.longValue());
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetAndPackageName
    public String get(String str, String str2) {
        return ((FlutterLoader) this.f17325a).getLookupKeyForAsset(str, str2);
    }
}
