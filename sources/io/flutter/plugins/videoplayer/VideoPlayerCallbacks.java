package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface VideoPlayerCallbacks {
    void onBufferingEnd();

    void onBufferingStart();

    void onBufferingUpdate(long j);

    void onCompleted();

    void onError(@NonNull String str, @Nullable String str2, @Nullable Object obj);

    void onInitialized(int i, int i4, long j, int i6);

    void onIsPlayingStateUpdate(boolean z4);
}
