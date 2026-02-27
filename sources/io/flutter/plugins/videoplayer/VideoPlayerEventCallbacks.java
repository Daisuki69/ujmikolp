package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import pg.k;
import pg.m;
import pg.n;

/* JADX INFO: loaded from: classes4.dex */
final class VideoPlayerEventCallbacks implements VideoPlayerCallbacks {
    private final k eventSink;

    private VideoPlayerEventCallbacks(k kVar) {
        this.eventSink = kVar;
    }

    public static VideoPlayerEventCallbacks bindTo(n nVar) {
        final QueuingEventSink queuingEventSink = new QueuingEventSink();
        nVar.a(new m() { // from class: io.flutter.plugins.videoplayer.VideoPlayerEventCallbacks.1
            @Override // pg.m
            public void onCancel(Object obj) {
                queuingEventSink.setDelegate(null);
            }

            @Override // pg.m
            public void onListen(Object obj, k kVar) {
                queuingEventSink.setDelegate(kVar);
            }
        });
        return withSink(queuingEventSink);
    }

    @VisibleForTesting
    public static VideoPlayerEventCallbacks withSink(k kVar) {
        return new VideoPlayerEventCallbacks(kVar);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onBufferingEnd() {
        this.eventSink.success(androidx.media3.datasource.cache.c.p("event", "bufferingEnd"));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onBufferingStart() {
        this.eventSink.success(androidx.media3.datasource.cache.c.p("event", "bufferingStart"));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onBufferingUpdate(long j) {
        HashMap mapP = androidx.media3.datasource.cache.c.p("event", "bufferingUpdate");
        mapP.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(j))));
        this.eventSink.success(mapP);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onCompleted() {
        this.eventSink.success(androidx.media3.datasource.cache.c.p("event", "completed"));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onError(@NonNull String str, @Nullable String str2, @Nullable Object obj) {
        this.eventSink.error(str, str2, obj);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onInitialized(int i, int i4, long j, int i6) {
        HashMap mapP = androidx.media3.datasource.cache.c.p("event", "initialized");
        androidx.media3.datasource.cache.c.t(i, mapP, "width", i4, "height");
        mapP.put("duration", Long.valueOf(j));
        if (i6 != 0) {
            mapP.put("rotationCorrection", Integer.valueOf(i6));
        }
        this.eventSink.success(mapP);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onIsPlayingStateUpdate(boolean z4) {
        HashMap mapP = androidx.media3.datasource.cache.c.p("event", "isPlayingStateUpdate");
        mapP.put("isPlaying", Boolean.valueOf(z4));
        this.eventSink.success(mapP);
    }
}
