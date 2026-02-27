package androidx.media3.common.audio;

import androidx.annotation.GuardedBy;
import androidx.media3.common.C;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SpeedProviderUtil;
import androidx.media3.common.util.TimestampConsumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SpeedChangingAudioProcessor extends BaseAudioProcessor {
    private long bytesRead;

    @GuardedBy("lock")
    private float currentSpeed;
    private boolean endOfStreamQueuedToSonic;

    @GuardedBy("lock")
    private LongArray inputSegmentStartTimesUs;

    @GuardedBy("lock")
    private long lastProcessedInputTimeUs;

    @GuardedBy("lock")
    private long lastSpeedAdjustedInputTimeUs;

    @GuardedBy("lock")
    private long lastSpeedAdjustedOutputTimeUs;
    private final Object lock;

    @GuardedBy("lock")
    private LongArray outputSegmentStartTimesUs;

    @GuardedBy("lock")
    private final LongArrayQueue pendingCallbackInputTimesUs;

    @GuardedBy("lock")
    private final Queue<TimestampConsumer> pendingCallbacks;
    private final SynchronizedSonicAudioProcessor sonicAudioProcessor;

    @GuardedBy("lock")
    private long speedAdjustedTimeAsyncInputTimeUs;
    private final SpeedProvider speedProvider;

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        this.speedProvider = speedProvider;
        Object obj = new Object();
        this.lock = obj;
        this.sonicAudioProcessor = new SynchronizedSonicAudioProcessor(obj);
        this.pendingCallbackInputTimesUs = new LongArrayQueue();
        this.pendingCallbacks = new ArrayDeque();
        this.speedAdjustedTimeAsyncInputTimeUs = C.TIME_UNSET;
        resetState();
    }

    private long calculateSpeedAdjustedTime(long j) {
        long jRound;
        int size = this.inputSegmentStartTimesUs.size() - 1;
        while (size > 0 && this.inputSegmentStartTimesUs.get(size) > j) {
            size--;
        }
        if (size == this.inputSegmentStartTimesUs.size() - 1) {
            if (this.lastSpeedAdjustedInputTimeUs < this.inputSegmentStartTimesUs.get(size)) {
                this.lastSpeedAdjustedInputTimeUs = this.inputSegmentStartTimesUs.get(size);
                this.lastSpeedAdjustedOutputTimeUs = this.outputSegmentStartTimesUs.get(size);
            }
            jRound = getPlayoutDurationUsAtCurrentSpeed(j - this.lastSpeedAdjustedInputTimeUs);
        } else {
            int i = size + 1;
            jRound = Math.round((j - this.lastSpeedAdjustedInputTimeUs) * divide(this.outputSegmentStartTimesUs.get(i) - this.outputSegmentStartTimesUs.get(size), this.inputSegmentStartTimesUs.get(i) - this.inputSegmentStartTimesUs.get(size)));
        }
        this.lastSpeedAdjustedInputTimeUs = j;
        long j6 = this.lastSpeedAdjustedOutputTimeUs + jRound;
        this.lastSpeedAdjustedOutputTimeUs = j6;
        return j6;
    }

    private static double divide(long j, long j6) {
        return j / j6;
    }

    private long getMediaDurationUsAtCurrentSpeed(long j) {
        return isUsingSonic() ? this.sonicAudioProcessor.getMediaDuration(j) : j;
    }

    private long getPlayoutDurationUsAtCurrentSpeed(long j) {
        return isUsingSonic() ? this.sonicAudioProcessor.getPlayoutDuration(j) : j;
    }

    private boolean isUsingSonic() {
        boolean z4;
        synchronized (this.lock) {
            z4 = this.currentSpeed != 1.0f;
        }
        return z4;
    }

    private void processPendingCallbacks() {
        synchronized (this.lock) {
            while (!this.pendingCallbacks.isEmpty() && (this.pendingCallbackInputTimesUs.element() <= this.lastProcessedInputTimeUs || isEnded())) {
                try {
                    this.pendingCallbacks.remove().onTimestamp(calculateSpeedAdjustedTime(this.pendingCallbackInputTimesUs.remove()));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void resetState() {
        synchronized (this.lock) {
            this.inputSegmentStartTimesUs = new LongArray();
            this.outputSegmentStartTimesUs = new LongArray();
            this.inputSegmentStartTimesUs.add(0L);
            this.outputSegmentStartTimesUs.add(0L);
            this.lastProcessedInputTimeUs = 0L;
            this.lastSpeedAdjustedInputTimeUs = 0L;
            this.lastSpeedAdjustedOutputTimeUs = 0L;
            this.currentSpeed = 1.0f;
        }
        this.bytesRead = 0L;
        this.endOfStreamQueuedToSonic = false;
    }

    private void updateLastProcessedInputTime() {
        synchronized (this.lock) {
            try {
                if (isUsingSonic()) {
                    long processedInputBytes = this.sonicAudioProcessor.getProcessedInputBytes();
                    AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
                    this.lastProcessedInputTimeUs = this.inputSegmentStartTimesUs.get(r0.size() - 1) + Util.scaleLargeTimestamp(processedInputBytes, 1000000L, ((long) audioFormat.bytesPerFrame) * ((long) audioFormat.sampleRate));
                } else {
                    long j = this.bytesRead;
                    AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
                    this.lastProcessedInputTimeUs = Util.scaleLargeTimestamp(j, 1000000L, ((long) audioFormat2.bytesPerFrame) * ((long) audioFormat2.sampleRate));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void updateSpeed(float f, long j) {
        synchronized (this.lock) {
            try {
                if (f != this.currentSpeed) {
                    updateSpeedChangeArrays(j);
                    this.currentSpeed = f;
                    if (isUsingSonic()) {
                        this.sonicAudioProcessor.setSpeed(f);
                        this.sonicAudioProcessor.setPitch(f);
                    }
                    this.sonicAudioProcessor.flush();
                    this.endOfStreamQueuedToSonic = false;
                    super.getOutput();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void updateSpeedChangeArrays(long j) {
        long j6 = this.outputSegmentStartTimesUs.get(r0.size() - 1);
        long j7 = j - this.inputSegmentStartTimesUs.get(r2.size() - 1);
        this.inputSegmentStartTimesUs.add(j);
        this.outputSegmentStartTimesUs.add(j6 + getPlayoutDurationUsAtCurrentSpeed(j7));
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j);
    }

    public long getMediaDurationUs(long j) {
        long jRound;
        long j6;
        synchronized (this.lock) {
            try {
                int size = this.outputSegmentStartTimesUs.size() - 1;
                while (size > 0 && this.outputSegmentStartTimesUs.get(size) > j) {
                    size--;
                }
                long j7 = j - this.outputSegmentStartTimesUs.get(size);
                if (size == this.outputSegmentStartTimesUs.size() - 1) {
                    jRound = getMediaDurationUsAtCurrentSpeed(j7);
                } else {
                    int i = size + 1;
                    jRound = Math.round(j7 * divide(this.inputSegmentStartTimesUs.get(i) - this.inputSegmentStartTimesUs.get(size), this.outputSegmentStartTimesUs.get(i) - this.outputSegmentStartTimesUs.get(size)));
                }
                j6 = this.inputSegmentStartTimesUs.get(size) + jRound;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j6;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer output = isUsingSonic() ? this.sonicAudioProcessor.getOutput() : super.getOutput();
        processPendingCallbacks();
        return output;
    }

    public void getSpeedAdjustedTimeAsync(long j, TimestampConsumer timestampConsumer) {
        synchronized (this.lock) {
            try {
                Assertions.checkArgument(this.speedAdjustedTimeAsyncInputTimeUs < j);
                this.speedAdjustedTimeAsyncInputTimeUs = j;
                if (j > this.lastProcessedInputTimeUs || !this.pendingCallbackInputTimesUs.isEmpty()) {
                    if (!isEnded()) {
                        this.pendingCallbackInputTimesUs.add(j);
                        this.pendingCallbacks.add(timestampConsumer);
                        return;
                    }
                }
                timestampConsumer.onTimestamp(calculateSpeedAdjustedTime(j));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.sonicAudioProcessor.isEnded();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        return this.sonicAudioProcessor.configure(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        resetState();
        this.sonicAudioProcessor.flush();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        resetState();
        this.sonicAudioProcessor.reset();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iScaleLargeValue;
        long j = this.bytesRead;
        AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, ((long) audioFormat.sampleRate) * ((long) audioFormat.bytesPerFrame));
        updateSpeed(this.speedProvider.getSpeed(jScaleLargeTimestamp), jScaleLargeTimestamp);
        int iLimit = byteBuffer.limit();
        long nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(jScaleLargeTimestamp);
        if (nextSpeedChangeTimeUs != C.TIME_UNSET) {
            long j6 = nextSpeedChangeTimeUs - jScaleLargeTimestamp;
            AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
            iScaleLargeValue = (int) Util.scaleLargeValue(j6, ((long) audioFormat2.sampleRate) * ((long) audioFormat2.bytesPerFrame), 1000000L, RoundingMode.CEILING);
            int i = this.inputAudioFormat.bytesPerFrame;
            int i4 = i - (iScaleLargeValue % i);
            if (i4 != i) {
                iScaleLargeValue += i4;
            }
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + iScaleLargeValue));
        } else {
            iScaleLargeValue = -1;
        }
        long jPosition = byteBuffer.position();
        if (isUsingSonic()) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
            if (iScaleLargeValue != -1 && ((long) byteBuffer.position()) - jPosition == iScaleLargeValue) {
                this.sonicAudioProcessor.queueEndOfStream();
                this.endOfStreamQueuedToSonic = true;
            }
        } else {
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                byteBufferReplaceOutputBuffer.put(byteBuffer);
            }
            byteBufferReplaceOutputBuffer.flip();
        }
        this.bytesRead = (((long) byteBuffer.position()) - jPosition) + this.bytesRead;
        updateLastProcessedInputTime();
        byteBuffer.limit(iLimit);
    }
}
