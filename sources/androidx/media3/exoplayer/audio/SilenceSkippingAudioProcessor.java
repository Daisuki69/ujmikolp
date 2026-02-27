package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SilenceSkippingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private static final int AVOID_TRUNCATION_FACTOR = 1000;
    public static final long DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US = 2000000;
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 100000;
    public static final int DEFAULT_MIN_VOLUME_TO_KEEP_PERCENTAGE = 10;

    @Deprecated
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final float DEFAULT_SILENCE_RETENTION_RATIO = 0.2f;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int DO_NOT_CHANGE_VOLUME = 3;
    private static final int FADE_IN = 2;
    private static final int FADE_OUT = 0;
    private static final int MUTE = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SHORTENING_SILENCE = 1;
    private int bytesPerFrame;
    private byte[] contiguousOutputBuffer;
    private boolean enabled;
    private final long maxSilenceToKeepDurationUs;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferContentsSize;
    private int maybeSilenceBufferStartIndex;
    private final int minVolumeToKeepPercentageWhenMuting;
    private final long minimumSilenceDurationUs;
    private int outputSilenceFramesSinceNoise;
    private final float silenceRetentionRatio;
    private final short silenceThresholdLevel;
    private long skippedFrames;
    private int state;

    public SilenceSkippingAudioProcessor() {
        this(DEFAULT_MINIMUM_SILENCE_DURATION_US, 0.2f, DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, 10, DEFAULT_SILENCE_THRESHOLD_LEVEL);
    }

    private int alignToBytePerFrameBoundary(int i) {
        int i4 = this.bytesPerFrame;
        return (i / i4) * i4;
    }

    private int calculateFadeInPercentage(int i, int i4) {
        int i6 = this.minVolumeToKeepPercentageWhenMuting;
        return ((((i * 1000) * (100 - i6)) / i4) / 1000) + i6;
    }

    private int calculateFadeOutPercentage(int i, int i4) {
        return ((((i * 1000) / i4) * (this.minVolumeToKeepPercentageWhenMuting - 100)) / 1000) + 100;
    }

    private int calculateShortenedSilenceLength(int i) {
        int iDurationUsToFrames = ((durationUsToFrames(this.maxSilenceToKeepDurationUs) - this.outputSilenceFramesSinceNoise) * this.bytesPerFrame) - (this.maybeSilenceBuffer.length / 2);
        Assertions.checkState(iDurationUsToFrames >= 0);
        return alignToBytePerFrameBoundary(Math.min((i * this.silenceRetentionRatio) + 0.5f, iDurationUsToFrames));
    }

    private int durationUsToFrames(long j) {
        return (int) ((j * ((long) this.inputAudioFormat.sampleRate)) / 1000000);
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (isNoise(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i = this.bytesPerFrame;
                return ((iLimit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (isNoise(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i = this.bytesPerFrame;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    private boolean isNoise(byte b8, byte b10) {
        return Math.abs(twoByteSampleToInt(b8, b10)) > this.silenceThresholdLevel;
    }

    private void modifyVolume(byte[] bArr, int i, int i4) {
        if (i4 == 3) {
            return;
        }
        for (int i6 = 0; i6 < i; i6 += 2) {
            sampleIntToTwoBigEndianBytes(bArr, i6, (twoByteSampleToInt(bArr[i6 + 1], bArr[i6]) * (i4 == 0 ? calculateFadeOutPercentage(i6, i - 1) : i4 == 2 ? calculateFadeInPercentage(i6, i - 1) : this.minVolumeToKeepPercentageWhenMuting)) / 100);
        }
    }

    private void output(ByteBuffer byteBuffer) {
        replaceOutputBuffer(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void outputRange(byte[] bArr, int i, int i4) {
        Assertions.checkArgument(i % this.bytesPerFrame == 0, "byteOutput size is not aligned to frame size " + i);
        modifyVolume(bArr, i, i4);
        replaceOutputBuffer(i).put(bArr, 0, i).flip();
    }

    private void outputShortenedSilenceBuffer(boolean z4) {
        int length;
        int iCalculateShortenedSilenceLength;
        int i = this.maybeSilenceBufferContentsSize;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i == bArr.length || z4) {
            if (this.outputSilenceFramesSinceNoise == 0) {
                if (z4) {
                    outputSilence(i, 3);
                    length = i;
                } else {
                    Assertions.checkState(i >= bArr.length / 2);
                    length = this.maybeSilenceBuffer.length / 2;
                    outputSilence(length, 0);
                }
                iCalculateShortenedSilenceLength = length;
            } else if (z4) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iCalculateShortenedSilenceLength2 = calculateShortenedSilenceLength(length2) + (this.maybeSilenceBuffer.length / 2);
                outputSilence(iCalculateShortenedSilenceLength2, 2);
                iCalculateShortenedSilenceLength = iCalculateShortenedSilenceLength2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iCalculateShortenedSilenceLength = calculateShortenedSilenceLength(length);
                outputSilence(iCalculateShortenedSilenceLength, 1);
            }
            Assertions.checkState(length % this.bytesPerFrame == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            Assertions.checkState(i >= iCalculateShortenedSilenceLength);
            this.maybeSilenceBufferContentsSize -= length;
            int i4 = this.maybeSilenceBufferStartIndex + length;
            this.maybeSilenceBufferStartIndex = i4;
            this.maybeSilenceBufferStartIndex = i4 % this.maybeSilenceBuffer.length;
            int i6 = this.outputSilenceFramesSinceNoise;
            int i10 = this.bytesPerFrame;
            this.outputSilenceFramesSinceNoise = (iCalculateShortenedSilenceLength / i10) + i6;
            this.skippedFrames += (long) ((length - iCalculateShortenedSilenceLength) / i10);
        }
    }

    private void outputSilence(int i, int i4) {
        if (i == 0) {
            return;
        }
        Assertions.checkArgument(this.maybeSilenceBufferContentsSize >= i);
        if (i4 == 2) {
            int i6 = this.maybeSilenceBufferStartIndex;
            int i10 = this.maybeSilenceBufferContentsSize;
            int i11 = i6 + i10;
            byte[] bArr = this.maybeSilenceBuffer;
            if (i11 <= bArr.length) {
                System.arraycopy(bArr, (i6 + i10) - i, this.contiguousOutputBuffer, 0, i);
            } else {
                int length = i10 - (bArr.length - i6);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.contiguousOutputBuffer, 0, i);
                } else {
                    int i12 = i - length;
                    System.arraycopy(bArr, bArr.length - i12, this.contiguousOutputBuffer, 0, i12);
                    System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, i12, length);
                }
            }
        } else {
            int i13 = this.maybeSilenceBufferStartIndex;
            int i14 = i13 + i;
            byte[] bArr2 = this.maybeSilenceBuffer;
            if (i14 <= bArr2.length) {
                System.arraycopy(bArr2, i13, this.contiguousOutputBuffer, 0, i);
            } else {
                int length2 = bArr2.length - i13;
                System.arraycopy(bArr2, i13, this.contiguousOutputBuffer, 0, length2);
                System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, length2, i - length2);
            }
        }
        Assertions.checkArgument(i % this.bytesPerFrame == 0, "sizeToOutput is not aligned to frame size: " + i);
        Assertions.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        outputRange(this.contiguousOutputBuffer, i, i4);
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int iFindNoiseLimit = findNoiseLimit(byteBuffer);
        if (iFindNoiseLimit == byteBuffer.position()) {
            this.state = 1;
        } else {
            byteBuffer.limit(Math.min(iFindNoiseLimit, byteBuffer.capacity()));
            output(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void sampleIntToTwoBigEndianBytes(byte[] bArr, int i, int i4) {
        if (i4 >= 32767) {
            bArr[i] = -1;
            bArr[i + 1] = 127;
        } else if (i4 <= -32768) {
            bArr[i] = 0;
            bArr[i + 1] = -128;
        } else {
            bArr[i] = (byte) (i4 & 255);
            bArr[i + 1] = (byte) (i4 >> 8);
        }
    }

    private void shortenSilenceSilenceUntilNoise(ByteBuffer byteBuffer) {
        int length;
        int i;
        Assertions.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        int iPosition = iFindNoisePosition - byteBuffer.position();
        int i4 = this.maybeSilenceBufferStartIndex;
        int i6 = this.maybeSilenceBufferContentsSize;
        int i10 = i4 + i6;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i10 < bArr.length) {
            length = bArr.length - (i6 + i4);
            i = i4 + i6;
        } else {
            int length2 = i6 - (bArr.length - i4);
            length = i4 - length2;
            i = length2;
        }
        boolean z4 = iFindNoisePosition < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.maybeSilenceBuffer, i, iMin);
        int i11 = this.maybeSilenceBufferContentsSize + iMin;
        this.maybeSilenceBufferContentsSize = i11;
        Assertions.checkState(i11 <= this.maybeSilenceBuffer.length);
        boolean z5 = z4 && iPosition < length;
        outputShortenedSilenceBuffer(z5);
        if (z5) {
            this.state = 0;
            this.outputSilenceFramesSinceNoise = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int twoByteSampleToInt(byte b8, byte b10) {
        return (b8 << 8) | (b10 & 255);
    }

    public long getSkippedFrames() {
        return this.skippedFrames;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return super.isActive() && this.enabled;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            return audioFormat.sampleRate == -1 ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        if (isActive()) {
            this.bytesPerFrame = this.inputAudioFormat.channelCount * 2;
            int iAlignToBytePerFrameBoundary = alignToBytePerFrameBoundary(durationUsToFrames(this.minimumSilenceDurationUs) / 2) * 2;
            if (this.maybeSilenceBuffer.length != iAlignToBytePerFrameBoundary) {
                this.maybeSilenceBuffer = new byte[iAlignToBytePerFrameBoundary];
                this.contiguousOutputBuffer = new byte[iAlignToBytePerFrameBoundary];
            }
        }
        this.state = 0;
        this.skippedFrames = 0L;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.maybeSilenceBufferContentsSize > 0) {
            outputShortenedSilenceBuffer(true);
            this.outputSilenceFramesSinceNoise = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.enabled = false;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !hasPendingOutput()) {
            int i = this.state;
            if (i == 0) {
                processNoisy(byteBuffer);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                shortenSilenceSilenceUntilNoise(byteBuffer);
            }
        }
    }

    public void setEnabled(boolean z4) {
        this.enabled = z4;
    }

    @Deprecated
    public SilenceSkippingAudioProcessor(long j, long j6, short s9) {
        this(j, j6 / j, j, 0, s9);
    }

    private int alignToBytePerFrameBoundary(float f) {
        return alignToBytePerFrameBoundary((int) f);
    }

    public SilenceSkippingAudioProcessor(long j, float f, long j6, int i, short s9) {
        boolean z4 = false;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
        if (f >= 0.0f && f <= 1.0f) {
            z4 = true;
        }
        Assertions.checkArgument(z4);
        this.minimumSilenceDurationUs = j;
        this.silenceRetentionRatio = f;
        this.maxSilenceToKeepDurationUs = j6;
        this.minVolumeToKeepPercentageWhenMuting = i;
        this.silenceThresholdLevel = s9;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }
}
