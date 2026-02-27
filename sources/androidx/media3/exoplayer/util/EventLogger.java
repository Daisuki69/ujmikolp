package androidx.media3.exoplayer.util;

import O1.S;
import We.s;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.a;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes2.dex */
public class EventLogger implements AnalyticsListener {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final Timeline.Period period;
    private final long startTimeMs;
    private final String tag;
    private final Timeline.Window window;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger() {
        this(DEFAULT_TAG);
    }

    private static String getAudioTrackConfigString(AudioSink.AudioTrackConfig audioTrackConfig) {
        return audioTrackConfig.encoding + "," + audioTrackConfig.channelConfig + "," + audioTrackConfig.sampleRate + "," + audioTrackConfig.tunneling + "," + audioTrackConfig.offload + "," + audioTrackConfig.bufferSize;
    }

    private static String getDiscontinuityReasonString(int i) {
        switch (i) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return "SKIP";
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return Global.QUESTION;
        }
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, @Nullable String str2, @Nullable Throwable th2) {
        StringBuilder sbV = s.v(str, " [");
        sbV.append(getEventTimeString(eventTime));
        String string = sbV.toString();
        if (th2 instanceof PlaybackException) {
            StringBuilder sbV2 = s.v(string, ", errorCode=");
            sbV2.append(((PlaybackException) th2).getErrorCodeName());
            string = sbV2.toString();
        }
        if (str2 != null) {
            string = a.j(string, ", ", str2);
        }
        String throwableString = Log.getThrowableString(th2);
        if (!TextUtils.isEmpty(throwableString)) {
            StringBuilder sbV3 = s.v(string, "\n  ");
            sbV3.append(throwableString.replace(Global.NEWLINE, "\n  "));
            sbV3.append('\n');
            string = sbV3.toString();
        }
        return s.i(string, "]");
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        String string = "window=" + eventTime.windowIndex;
        if (eventTime.mediaPeriodId != null) {
            StringBuilder sbV = s.v(string, ", period=");
            sbV.append(eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid));
            string = sbV.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                StringBuilder sbV2 = s.v(string, ", adGroup=");
                sbV2.append(eventTime.mediaPeriodId.adGroupIndex);
                StringBuilder sbV3 = s.v(sbV2.toString(), ", ad=");
                sbV3.append(eventTime.mediaPeriodId.adIndexInAdGroup);
                string = sbV3.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder("eventTime=");
        sb2.append(getTimeString(eventTime.realtimeMs - this.startTimeMs));
        sb2.append(", mediaPos=");
        return s.q(sb2, getTimeString(eventTime.eventPlaybackPositionMs), ", ", string);
    }

    private static String getMediaItemTransitionReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Global.QUESTION : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    private static String getPlayWhenReadyChangeReasonString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Global.QUESTION : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    private static String getPlaybackSuppressionReasonString(int i) {
        return i != 0 ? i != 1 ? Global.QUESTION : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    private static String getRepeatModeString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? Global.QUESTION : "ALL" : "ONE" : "OFF";
    }

    private static String getStateString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? Global.QUESTION : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String getTimeString(long j) {
        return j == C.TIME_UNSET ? Global.QUESTION : TIME_FORMAT.format(j / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i) {
        return i != 0 ? i != 1 ? Global.QUESTION : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(boolean z4) {
        return z4 ? "[X]" : "[ ]";
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i = 0; i < metadata.length(); i++) {
            StringBuilder sbW = a.w(str);
            sbW.append(metadata.get(i));
            logd(sbW.toString());
        }
    }

    @UnstableApi
    public void logd(String str) {
        Log.d(this.tag, str);
    }

    @UnstableApi
    public void loge(String str) {
        Log.e(this.tag, str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        logd(eventTime, "audioAttributes", audioAttributes.contentType + "," + audioAttributes.flags + "," + audioAttributes.usage + "," + audioAttributes.allowedCapturePolicy);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        androidx.media3.exoplayer.analytics.a.b(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        androidx.media3.exoplayer.analytics.a.c(this, eventTime, str, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "audioInputFormat", Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.a.i(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "audioSessionId", Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
        androidx.media3.exoplayer.analytics.a.k(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioTrackInitialized(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackInit", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioTrackReleased(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackReleased", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j6) {
        loge(eventTime, "audioTrackUnderrun", i + ", " + j + ", " + j6, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
        androidx.media3.exoplayer.analytics.a.o(this, eventTime, commands);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j6) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
        androidx.media3.exoplayer.analytics.a.q(this, eventTime, cueGroup);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceInfoChanged(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
        androidx.media3.exoplayer.analytics.a.s(this, eventTime, deviceInfo);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceVolumeChanged(AnalyticsListener.EventTime eventTime, int i, boolean z4) {
        androidx.media3.exoplayer.analytics.a.t(this, eventTime, i, z4);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.a.y(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        logd(eventTime, "droppedFrames", Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
        androidx.media3.exoplayer.analytics.a.D(this, player, events);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z4) {
        logd(eventTime, "loading", Boolean.toString(z4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z4) {
        logd(eventTime, "isPlaying", Boolean.toString(z4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z4) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z4) {
        androidx.media3.exoplayer.analytics.a.K(this, eventTime, z4);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.a.L(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, @Nullable MediaItem mediaItem, int i) {
        logd("mediaItem [" + getEventTimeString(eventTime) + ", reason=" + getMediaItemTransitionReasonString(i) + "]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.a.N(this, eventTime, mediaMetadata);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        logd("metadata [" + getEventTimeString(eventTime));
        printMetadata(metadata, "  ");
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z4, int i) {
        logd(eventTime, "playWhenReady", z4 + ", " + getPlayWhenReadyChangeReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "state", getStateString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        loge(eventTime, "playerFailed", playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        androidx.media3.exoplayer.analytics.a.U(this, eventTime, playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.a.V(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z4, int i) {
        androidx.media3.exoplayer.analytics.a.W(this, eventTime, z4, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.a.X(this, eventTime, mediaMetadata);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.a.Y(this, eventTime, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        logd(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "repeatMode", getRepeatModeString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.a.c0(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.a.d0(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.a.e0(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z4) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z4) {
        logd(eventTime, "skipSilenceEnabled", Boolean.toString(z4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i4) {
        logd(eventTime, "surfaceSize", i + ", " + i4);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        logd("timeline [" + getEventTimeString(eventTime) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i));
        for (int i4 = 0; i4 < Math.min(periodCount, 3); i4++) {
            eventTime.timeline.getPeriod(i4, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i6 = 0; i6 < Math.min(windowCount, 3); i6++) {
            eventTime.timeline.getWindow(i6, this.window);
            logd("  window [" + getTimeString(this.window.getDurationMs()) + ", seekable=" + this.window.isSeekable + ", dynamic=" + this.window.isDynamic + "]");
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onTrackSelectionParametersChanged(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
        androidx.media3.exoplayer.analytics.a.j0(this, eventTime, trackSelectionParameters);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        Metadata metadata;
        logd("tracks [" + getEventTimeString(eventTime));
        S groups = tracks.getGroups();
        for (int i = 0; i < groups.size(); i++) {
            Tracks.Group group = (Tracks.Group) groups.get(i);
            logd("  group [");
            for (int i4 = 0; i4 < group.length; i4++) {
                String trackStatusString = getTrackStatusString(group.isTrackSelected(i4));
                String formatSupportString = Util.getFormatSupportString(group.getTrackSupport(i4));
                StringBuilder sbR = a.r(i4, "    ", trackStatusString, " Track:", ", ");
                sbR.append(Format.toLogString(group.getTrackFormat(i4)));
                sbR.append(", supported=");
                sbR.append(formatSupportString);
                logd(sbR.toString());
            }
            logd("  ]");
        }
        boolean z4 = false;
        for (int i6 = 0; !z4 && i6 < groups.size(); i6++) {
            Tracks.Group group2 = (Tracks.Group) groups.get(i6);
            for (int i10 = 0; !z4 && i10 < group2.length; i10++) {
                if (group2.isTrackSelected(i10) && (metadata = group2.getTrackFormat(i10).metadata) != null && metadata.length() > 0) {
                    logd("  Metadata [");
                    printMetadata(metadata, "    ");
                    logd("  ]");
                    z4 = true;
                }
            }
        }
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        androidx.media3.exoplayer.analytics.a.m0(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        androidx.media3.exoplayer.analytics.a.n0(this, eventTime, str, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
        androidx.media3.exoplayer.analytics.a.s0(this, eventTime, j, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "videoInputFormat", Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i4, int i6, float f) {
        androidx.media3.exoplayer.analytics.a.u0(this, eventTime, i, i4, i6, f);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        logd(eventTime, MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, Float.toString(f));
    }

    public EventLogger(String str) {
        this.tag = str;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str, null, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, @Nullable Throwable th2) {
        loge(getEventString(eventTime, str, null, th2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j6) {
        logd(eventTime, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, List list) {
        androidx.media3.exoplayer.analytics.a.r(this, eventTime, list);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "drmSessionAcquired", s.f(i, "state="));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        StringBuilder sb2 = new StringBuilder("reason=");
        sb2.append(getDiscontinuityReasonString(i));
        sb2.append(", PositionInfo:old [mediaItem=");
        sb2.append(positionInfo.mediaItemIndex);
        sb2.append(", period=");
        sb2.append(positionInfo.periodIndex);
        sb2.append(", pos=");
        sb2.append(positionInfo.positionMs);
        if (positionInfo.adGroupIndex != -1) {
            sb2.append(", contentPos=");
            sb2.append(positionInfo.contentPositionMs);
            sb2.append(", adGroup=");
            sb2.append(positionInfo.adGroupIndex);
            sb2.append(", ad=");
            sb2.append(positionInfo.adIndexInAdGroup);
        }
        sb2.append("], PositionInfo:new [mediaItem=");
        sb2.append(positionInfo2.mediaItemIndex);
        sb2.append(", period=");
        sb2.append(positionInfo2.periodIndex);
        sb2.append(", pos=");
        sb2.append(positionInfo2.positionMs);
        if (positionInfo2.adGroupIndex != -1) {
            sb2.append(", contentPos=");
            sb2.append(positionInfo2.contentPositionMs);
            sb2.append(", adGroup=");
            sb2.append(positionInfo2.adGroupIndex);
            sb2.append(", ad=");
            sb2.append(positionInfo2.adIndexInAdGroup);
        }
        sb2.append("]");
        logd(eventTime, "positionDiscontinuity", sb2.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j6) {
        logd(eventTime, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        logd(eventTime, "videoSize", videoSize.width + ", " + videoSize.height);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, @Nullable Throwable th2) {
        loge(getEventString(eventTime, str, str2, th2));
    }

    @UnstableApi
    @Deprecated
    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector) {
        this(DEFAULT_TAG);
    }

    @UnstableApi
    @Deprecated
    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector, String str) {
        this(str);
    }
}
