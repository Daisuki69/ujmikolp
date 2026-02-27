package androidx.media3.exoplayer.video;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;

/* JADX INFO: loaded from: classes2.dex */
final class VideoFrameRenderControl {
    private final FrameRenderer frameRenderer;
    private long outputStreamOffsetUs;

    @Nullable
    private VideoSize pendingOutputVideoSize;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
    private final TimedValueQueue<VideoSize> videoSizeChanges = new TimedValueQueue<>();
    private final TimedValueQueue<Long> streamOffsets = new TimedValueQueue<>();
    private final LongArrayQueue presentationTimestampsUs = new LongArrayQueue();
    private VideoSize reportedVideoSize = VideoSize.UNKNOWN;
    private long lastPresentationTimeUs = C.TIME_UNSET;

    public interface FrameRenderer {
        void dropFrame();

        void onVideoSizeChanged(VideoSize videoSize);

        void renderFrame(long j, long j6, long j7, boolean z4);
    }

    public VideoFrameRenderControl(FrameRenderer frameRenderer, VideoFrameReleaseControl videoFrameReleaseControl) {
        this.frameRenderer = frameRenderer;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
    }

    private void dropFrame() {
        Assertions.checkStateNotNull(Long.valueOf(this.presentationTimestampsUs.remove()));
        this.frameRenderer.dropFrame();
    }

    private static <T> T getLastAndClear(TimedValueQueue<T> timedValueQueue) {
        Assertions.checkArgument(timedValueQueue.size() > 0);
        while (timedValueQueue.size() > 1) {
            timedValueQueue.pollFirst();
        }
        return (T) Assertions.checkNotNull(timedValueQueue.pollFirst());
    }

    private boolean maybeUpdateOutputStreamOffset(long j) {
        Long lPollFloor = this.streamOffsets.pollFloor(j);
        if (lPollFloor == null || lPollFloor.longValue() == this.outputStreamOffsetUs) {
            return false;
        }
        this.outputStreamOffsetUs = lPollFloor.longValue();
        return true;
    }

    private boolean maybeUpdateVideoSize(long j) {
        VideoSize videoSizePollFloor = this.videoSizeChanges.pollFloor(j);
        if (videoSizePollFloor == null || videoSizePollFloor.equals(VideoSize.UNKNOWN) || videoSizePollFloor.equals(this.reportedVideoSize)) {
            return false;
        }
        this.reportedVideoSize = videoSizePollFloor;
        return true;
    }

    private void renderFrame(boolean z4) {
        long jLongValue = ((Long) Assertions.checkStateNotNull(Long.valueOf(this.presentationTimestampsUs.remove()))).longValue();
        if (maybeUpdateVideoSize(jLongValue)) {
            this.frameRenderer.onVideoSizeChanged(this.reportedVideoSize);
        }
        this.frameRenderer.renderFrame(z4 ? -1L : this.videoFrameReleaseInfo.getReleaseTimeNs(), jLongValue, this.outputStreamOffsetUs, this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame());
    }

    public void flush() {
        this.presentationTimestampsUs.clear();
        this.lastPresentationTimeUs = C.TIME_UNSET;
        if (this.streamOffsets.size() > 0) {
            Long l6 = (Long) getLastAndClear(this.streamOffsets);
            l6.longValue();
            this.streamOffsets.add(0L, l6);
        }
        if (this.pendingOutputVideoSize != null) {
            this.videoSizeChanges.clear();
        } else if (this.videoSizeChanges.size() > 0) {
            this.pendingOutputVideoSize = (VideoSize) getLastAndClear(this.videoSizeChanges);
        }
    }

    public boolean hasReleasedFrame(long j) {
        long j6 = this.lastPresentationTimeUs;
        return j6 != C.TIME_UNSET && j6 >= j;
    }

    public boolean isReady() {
        return this.videoFrameReleaseControl.isReady(true);
    }

    public void onOutputFrameAvailableForRendering(long j) {
        VideoSize videoSize = this.pendingOutputVideoSize;
        if (videoSize != null) {
            this.videoSizeChanges.add(j, videoSize);
            this.pendingOutputVideoSize = null;
        }
        this.presentationTimestampsUs.add(j);
    }

    public void onOutputSizeChanged(int i, int i4) {
        VideoSize videoSize = new VideoSize(i, i4);
        if (Util.areEqual(this.pendingOutputVideoSize, videoSize)) {
            return;
        }
        this.pendingOutputVideoSize = videoSize;
    }

    public void onStreamOffsetChange(long j, long j6) {
        this.streamOffsets.add(j, Long.valueOf(j6));
    }

    public void render(long j, long j6) throws ExoPlaybackException {
        while (!this.presentationTimestampsUs.isEmpty()) {
            long jElement = this.presentationTimestampsUs.element();
            if (maybeUpdateOutputStreamOffset(jElement)) {
                this.videoFrameReleaseControl.onProcessedStreamChange();
            }
            int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(jElement, j, j6, this.outputStreamOffsetUs, false, this.videoFrameReleaseInfo);
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.lastPresentationTimeUs = jElement;
                renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction != 2 && frameReleaseAction != 3 && frameReleaseAction != 4) {
                if (frameReleaseAction != 5) {
                    throw new IllegalStateException(String.valueOf(frameReleaseAction));
                }
                return;
            } else {
                this.lastPresentationTimeUs = jElement;
                dropFrame();
            }
        }
    }

    public void setPlaybackSpeed(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
        Assertions.checkArgument(f > 0.0f);
        this.videoFrameReleaseControl.setPlaybackSpeed(f);
    }
}
