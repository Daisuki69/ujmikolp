package com.google.android.exoplayer2;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;
import n1.AbstractC1894G;
import n1.C1888A;
import n1.C1890C;
import n1.C1910p;
import n1.InterfaceC1912r;
import n1.InterfaceC1913s;
import n1.t;
import n1.v;
import n1.w;
import n1.x;
import n1.y;
import n1.z;
import s1.InterfaceC2230e;
import s1.InterfaceC2231f;
import v1.d;
import v1.e;
import z1.InterfaceC2546a;

/* JADX INFO: loaded from: classes2.dex */
public interface ExoPlayer extends y {
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Override // n1.y
    /* synthetic */ void addListener(t tVar);

    /* synthetic */ void addMediaItem(int i, MediaItem mediaItem);

    /* synthetic */ void addMediaItem(MediaItem mediaItem);

    /* synthetic */ void addMediaItems(int i, List list);

    /* synthetic */ void addMediaItems(List list);

    void addMediaSource(int i, InterfaceC2230e interfaceC2230e);

    void addMediaSource(InterfaceC2230e interfaceC2230e);

    void addMediaSources(int i, List<InterfaceC2230e> list);

    void addMediaSources(List<InterfaceC2230e> list);

    /* synthetic */ void clearMediaItems();

    C1888A createMessage(z zVar);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z4);

    @Override // n1.y
    /* synthetic */ Looper getApplicationLooper();

    @Nullable
    /* synthetic */ InterfaceC1912r getAudioComponent();

    /* synthetic */ int getBufferedPercentage();

    /* synthetic */ long getBufferedPosition();

    InterfaceC2546a getClock();

    @Override // n1.y
    /* synthetic */ long getContentBufferedPosition();

    /* synthetic */ long getContentDuration();

    @Override // n1.y
    /* synthetic */ long getContentPosition();

    /* synthetic */ int getCurrentAdGroupIndex();

    /* synthetic */ int getCurrentAdIndexInAdGroup();

    /* synthetic */ long getCurrentLiveOffset();

    @Nullable
    /* synthetic */ Object getCurrentManifest();

    @Nullable
    /* synthetic */ MediaItem getCurrentMediaItem();

    /* synthetic */ int getCurrentPeriodIndex();

    @Override // n1.y
    /* synthetic */ long getCurrentPosition();

    @Override // n1.y
    /* synthetic */ List getCurrentStaticMetadata();

    @Nullable
    @Deprecated
    /* synthetic */ Object getCurrentTag();

    @Override // n1.y
    /* synthetic */ AbstractC1894G getCurrentTimeline();

    @Override // n1.y
    /* synthetic */ TrackGroupArray getCurrentTrackGroups();

    @Override // n1.y
    /* synthetic */ d getCurrentTrackSelections();

    @Override // n1.y
    /* synthetic */ int getCurrentWindowIndex();

    @Nullable
    /* synthetic */ InterfaceC1913s getDeviceComponent();

    @Override // n1.y
    /* synthetic */ long getDuration();

    /* synthetic */ MediaItem getMediaItemAt(int i);

    /* synthetic */ int getMediaItemCount();

    @Nullable
    /* synthetic */ v getMetadataComponent();

    @Override // n1.y
    /* synthetic */ int getNextWindowIndex();

    boolean getPauseAtEndOfMediaItems();

    @Override // n1.y
    /* synthetic */ boolean getPlayWhenReady();

    @Nullable
    @Deprecated
    /* synthetic */ ExoPlaybackException getPlaybackError();

    Looper getPlaybackLooper();

    @Override // n1.y
    /* synthetic */ C1910p getPlaybackParameters();

    @Override // n1.y
    /* synthetic */ int getPlaybackState();

    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // n1.y
    @Nullable
    /* synthetic */ ExoPlaybackException getPlayerError();

    @Override // n1.y
    /* synthetic */ int getPreviousWindowIndex();

    /* synthetic */ int getRendererCount();

    @Override // n1.y
    /* synthetic */ int getRendererType(int i);

    @Override // n1.y
    /* synthetic */ int getRepeatMode();

    C1890C getSeekParameters();

    @Override // n1.y
    /* synthetic */ boolean getShuffleModeEnabled();

    @Override // n1.y
    @Nullable
    /* synthetic */ w getTextComponent();

    /* synthetic */ long getTotalBufferedDuration();

    @Nullable
    e getTrackSelector();

    @Override // n1.y
    @Nullable
    /* synthetic */ x getVideoComponent();

    @Override // n1.y
    /* synthetic */ boolean hasNext();

    /* synthetic */ boolean hasPrevious();

    /* synthetic */ boolean isCurrentWindowDynamic();

    /* synthetic */ boolean isCurrentWindowLive();

    @Override // n1.y
    /* synthetic */ boolean isCurrentWindowSeekable();

    /* synthetic */ boolean isLoading();

    @Override // n1.y
    /* synthetic */ boolean isPlaying();

    @Override // n1.y
    /* synthetic */ boolean isPlayingAd();

    /* synthetic */ void moveMediaItem(int i, int i4);

    /* synthetic */ void moveMediaItems(int i, int i4, int i6);

    /* synthetic */ void next();

    /* synthetic */ void pause();

    /* synthetic */ void play();

    @Override // n1.y
    /* synthetic */ void prepare();

    @Deprecated
    void prepare(InterfaceC2230e interfaceC2230e);

    @Deprecated
    void prepare(InterfaceC2230e interfaceC2230e, boolean z4, boolean z5);

    /* synthetic */ void previous();

    /* synthetic */ void release();

    @Override // n1.y
    /* synthetic */ void removeListener(t tVar);

    /* synthetic */ void removeMediaItem(int i);

    /* synthetic */ void removeMediaItems(int i, int i4);

    @Deprecated
    void retry();

    @Override // n1.y
    /* synthetic */ void seekTo(int i, long j);

    /* synthetic */ void seekTo(long j);

    /* synthetic */ void seekToDefaultPosition();

    /* synthetic */ void seekToDefaultPosition(int i);

    void setForegroundMode(boolean z4);

    /* synthetic */ void setMediaItem(MediaItem mediaItem);

    /* synthetic */ void setMediaItem(MediaItem mediaItem, long j);

    /* synthetic */ void setMediaItem(MediaItem mediaItem, boolean z4);

    /* synthetic */ void setMediaItems(List list);

    /* synthetic */ void setMediaItems(List list, int i, long j);

    /* synthetic */ void setMediaItems(List list, boolean z4);

    void setMediaSource(InterfaceC2230e interfaceC2230e);

    void setMediaSource(InterfaceC2230e interfaceC2230e, long j);

    void setMediaSource(InterfaceC2230e interfaceC2230e, boolean z4);

    void setMediaSources(List<InterfaceC2230e> list);

    void setMediaSources(List<InterfaceC2230e> list, int i, long j);

    void setMediaSources(List<InterfaceC2230e> list, boolean z4);

    void setPauseAtEndOfMediaItems(boolean z4);

    @Override // n1.y
    /* synthetic */ void setPlayWhenReady(boolean z4);

    @Override // n1.y
    /* synthetic */ void setPlaybackParameters(@Nullable C1910p c1910p);

    @Override // n1.y
    /* synthetic */ void setRepeatMode(int i);

    void setSeekParameters(@Nullable C1890C c1890c);

    @Override // n1.y
    /* synthetic */ void setShuffleModeEnabled(boolean z4);

    void setShuffleOrder(InterfaceC2231f interfaceC2231f);

    /* synthetic */ void stop();

    @Deprecated
    /* synthetic */ void stop(boolean z4);
}
