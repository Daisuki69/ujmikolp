package androidx.media3.exoplayer.source.ads;

import androidx.annotation.CheckResult;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class ServerSideAdInsertionUtil {
    private ServerSideAdInsertionUtil() {
    }

    @CheckResult
    public static AdPlaybackState addAdGroupToAdPlaybackState(AdPlaybackState adPlaybackState, long j, long j6, long... jArr) {
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j, -1, adPlaybackState);
        int i = adPlaybackState.removedAdGroupCount;
        while (i < adPlaybackState.adGroupCount && adPlaybackState.getAdGroup(i).timeUs != Long.MIN_VALUE && adPlaybackState.getAdGroup(i).timeUs <= mediaPeriodPositionUsForContent) {
            i++;
        }
        AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState.withNewAdGroup(i, mediaPeriodPositionUsForContent).withIsServerSideInserted(i, true).withAdCount(i, jArr.length).withAdDurationsUs(i, jArr).withContentResumeOffsetUs(i, j6);
        AdPlaybackState adPlaybackStateWithSkippedAd = adPlaybackStateWithContentResumeOffsetUs;
        for (int i4 = 0; i4 < jArr.length && jArr[i4] == 0; i4++) {
            adPlaybackStateWithSkippedAd = adPlaybackStateWithSkippedAd.withSkippedAd(i, i4);
        }
        return correctFollowingAdGroupTimes(adPlaybackStateWithSkippedAd, i, Util.sum(jArr), j6);
    }

    private static AdPlaybackState correctFollowingAdGroupTimes(AdPlaybackState adPlaybackState, int i, long j, long j6) {
        long j7 = (-j) + j6;
        while (true) {
            i++;
            if (i >= adPlaybackState.adGroupCount) {
                return adPlaybackState;
            }
            long j9 = adPlaybackState.getAdGroup(i).timeUs;
            if (j9 != Long.MIN_VALUE) {
                adPlaybackState = adPlaybackState.withAdGroupTimeUs(i, j9 + j7);
            }
        }
    }

    public static int getAdCountInGroup(AdPlaybackState adPlaybackState, int i) {
        int i4 = adPlaybackState.getAdGroup(i).count;
        if (i4 == -1) {
            return 0;
        }
        return i4;
    }

    public static long getMediaPeriodPositionUs(long j, MediaSource.MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        return mediaPeriodId.isAd() ? getMediaPeriodPositionUsForAd(j, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : getMediaPeriodPositionUsForContent(j, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }

    public static long getMediaPeriodPositionUsForAd(long j, int i, int i4, AdPlaybackState adPlaybackState) {
        int i6;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
        long j6 = j - adGroup.timeUs;
        int i10 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i6 = 0;
            if (i10 >= i) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i10);
            while (i6 < getAdCountInGroup(adPlaybackState, i10)) {
                j6 -= adGroup2.durationsUs[i6];
                i6++;
            }
            j6 += adGroup2.contentResumeOffsetUs;
            i10++;
        }
        if (i4 < getAdCountInGroup(adPlaybackState, i)) {
            while (i6 < i4) {
                j6 -= adGroup.durationsUs[i6];
                i6++;
            }
        }
        return j6;
    }

    public static long getMediaPeriodPositionUsForContent(long j, int i, AdPlaybackState adPlaybackState) {
        if (i == -1) {
            i = adPlaybackState.adGroupCount;
        }
        long j6 = 0;
        for (int i4 = adPlaybackState.removedAdGroupCount; i4 < i; i4++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i4);
            long j7 = adGroup.timeUs;
            if (j7 == Long.MIN_VALUE || j7 > j - j6) {
                break;
            }
            for (int i6 = 0; i6 < getAdCountInGroup(adPlaybackState, i4); i6++) {
                j6 += adGroup.durationsUs[i6];
            }
            long j9 = adGroup.contentResumeOffsetUs;
            j6 -= j9;
            long j10 = adGroup.timeUs;
            long j11 = j - j6;
            if (j9 + j10 > j11) {
                return Math.max(j10, j11);
            }
        }
        return j - j6;
    }

    public static long getStreamPositionUs(Player player, AdPlaybackState adPlaybackState) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return C.TIME_UNSET;
        }
        Timeline.Period period = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), new Timeline.Period());
        if (!Util.areEqual(period.getAdsId(), adPlaybackState.adsId)) {
            return C.TIME_UNSET;
        }
        if (!player.isPlayingAd()) {
            return getStreamPositionUsForContent(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs(), -1, adPlaybackState);
        }
        return getStreamPositionUsForAd(Util.msToUs(player.getCurrentPosition()), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adPlaybackState);
    }

    public static long getStreamPositionUsForAd(long j, int i, int i4, AdPlaybackState adPlaybackState) {
        int i6;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
        long j6 = j + adGroup.timeUs;
        int i10 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i6 = 0;
            if (i10 >= i) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i10);
            while (i6 < getAdCountInGroup(adPlaybackState, i10)) {
                j6 += adGroup2.durationsUs[i6];
                i6++;
            }
            j6 -= adGroup2.contentResumeOffsetUs;
            i10++;
        }
        if (i4 < getAdCountInGroup(adPlaybackState, i)) {
            while (i6 < i4) {
                j6 += adGroup.durationsUs[i6];
                i6++;
            }
        }
        return j6;
    }

    public static long getStreamPositionUsForContent(long j, int i, AdPlaybackState adPlaybackState) {
        if (i == -1) {
            i = adPlaybackState.adGroupCount;
        }
        long j6 = 0;
        for (int i4 = adPlaybackState.removedAdGroupCount; i4 < i; i4++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i4);
            long j7 = adGroup.timeUs;
            if (j7 == Long.MIN_VALUE || j7 > j) {
                break;
            }
            long j9 = j7 + j6;
            for (int i6 = 0; i6 < getAdCountInGroup(adPlaybackState, i4); i6++) {
                j6 += adGroup.durationsUs[i6];
            }
            long j10 = adGroup.contentResumeOffsetUs;
            j6 -= j10;
            if (adGroup.timeUs + j10 > j) {
                return Math.max(j9, j + j6);
            }
        }
        return j + j6;
    }

    public static long getStreamPositionUs(long j, MediaSource.MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        if (mediaPeriodId.isAd()) {
            return getStreamPositionUsForAd(j, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        }
        return getStreamPositionUsForContent(j, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }
}
