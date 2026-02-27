package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class Sonic {
    private static final int AMDF_FREQUENCY = 4000;
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int MAXIMUM_PITCH = 400;
    private static final int MINIMUM_PITCH = 65;
    private final int channelCount;
    private final short[] downSampleBuffer;
    private short[] inputBuffer;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private int maxDiff;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private int minDiff;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private short[] outputBuffer;
    private int outputFrameCount;
    private final float pitch;
    private short[] pitchBuffer;
    private int pitchFrameCount;
    private int prevMinDiff;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    public Sonic(int i, int i4, float f, float f3, int i6) {
        this.inputSampleRateHz = i;
        this.channelCount = i4;
        this.speed = f;
        this.pitch = f3;
        this.rate = i / i6;
        this.minPeriod = i / 400;
        int i10 = i / 65;
        this.maxPeriod = i10;
        int i11 = i10 * 2;
        this.maxRequiredFrameCount = i11;
        this.downSampleBuffer = new short[i11];
        this.inputBuffer = new short[i11 * i4];
        this.outputBuffer = new short[i11 * i4];
        this.pitchBuffer = new short[i11 * i4];
    }

    private void adjustRate(float f, int i) {
        int i4;
        int i6;
        if (this.outputFrameCount == i) {
            return;
        }
        int i10 = this.inputSampleRateHz;
        int i11 = (int) (i10 / f);
        while (true) {
            if (i11 <= 16384 && i10 <= 16384) {
                break;
            }
            i11 /= 2;
            i10 /= 2;
        }
        moveNewSamplesToPitchBuffer(i);
        int i12 = 0;
        while (true) {
            int i13 = this.pitchFrameCount;
            if (i12 >= i13 - 1) {
                removePitchFrames(i13 - 1);
                return;
            }
            while (true) {
                i4 = this.oldRatePosition;
                int i14 = (i4 + 1) * i11;
                i6 = this.newRatePosition;
                if (i14 <= i6 * i10) {
                    break;
                }
                this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, 1);
                int i15 = 0;
                while (true) {
                    int i16 = this.channelCount;
                    if (i15 < i16) {
                        this.outputBuffer[(this.outputFrameCount * i16) + i15] = interpolate(this.pitchBuffer, (i16 * i12) + i15, i10, i11);
                        i15++;
                    }
                }
                this.newRatePosition++;
                this.outputFrameCount++;
            }
            int i17 = i4 + 1;
            this.oldRatePosition = i17;
            if (i17 == i10) {
                this.oldRatePosition = 0;
                Assertions.checkState(i6 == i11);
                this.newRatePosition = 0;
            }
            i12++;
        }
    }

    private void changeSpeed(float f) {
        int iInsertPitchPeriod;
        int i = this.inputFrameCount;
        if (i < this.maxRequiredFrameCount) {
            return;
        }
        int iSkipPitchPeriod = 0;
        do {
            if (this.remainingInputToCopyFrameCount > 0) {
                iInsertPitchPeriod = copyInputToOutput(iSkipPitchPeriod);
            } else {
                int iFindPitchPeriod = findPitchPeriod(this.inputBuffer, iSkipPitchPeriod);
                if (f > 1.0d) {
                    iSkipPitchPeriod = iFindPitchPeriod + skipPitchPeriod(this.inputBuffer, iSkipPitchPeriod, f, iFindPitchPeriod) + iSkipPitchPeriod;
                } else {
                    iInsertPitchPeriod = insertPitchPeriod(this.inputBuffer, iSkipPitchPeriod, f, iFindPitchPeriod);
                }
            }
            iSkipPitchPeriod += iInsertPitchPeriod;
        } while (this.maxRequiredFrameCount + iSkipPitchPeriod <= i);
        removeProcessedInputFrames(iSkipPitchPeriod);
    }

    private int copyInputToOutput(int i) {
        int iMin = Math.min(this.maxRequiredFrameCount, this.remainingInputToCopyFrameCount);
        copyToOutput(this.inputBuffer, i, iMin);
        this.remainingInputToCopyFrameCount -= iMin;
        return iMin;
    }

    private void copyToOutput(short[] sArr, int i, int i4) {
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i4);
        this.outputBuffer = sArrEnsureSpaceForAdditionalFrames;
        int i6 = this.channelCount;
        System.arraycopy(sArr, i * i6, sArrEnsureSpaceForAdditionalFrames, this.outputFrameCount * i6, i6 * i4);
        this.outputFrameCount += i4;
    }

    private void downSampleInput(short[] sArr, int i, int i4) {
        int i6 = this.maxRequiredFrameCount / i4;
        int i10 = this.channelCount;
        int i11 = i4 * i10;
        int i12 = i * i10;
        for (int i13 = 0; i13 < i6; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.downSampleBuffer[i13] = (short) (i14 / i11);
        }
    }

    private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i, int i4) {
        int length = sArr.length;
        int i6 = this.channelCount;
        int i10 = length / i6;
        return i + i4 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i4) * i6);
    }

    private int findPitchPeriod(short[] sArr, int i) {
        int iFindPitchPeriodInRange;
        int i4 = this.inputSampleRateHz;
        int i6 = i4 > AMDF_FREQUENCY ? i4 / AMDF_FREQUENCY : 1;
        if (this.channelCount == 1 && i6 == 1) {
            iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i, this.minPeriod, this.maxPeriod);
        } else {
            downSampleInput(sArr, i, i6);
            int iFindPitchPeriodInRange2 = findPitchPeriodInRange(this.downSampleBuffer, 0, this.minPeriod / i6, this.maxPeriod / i6);
            if (i6 != 1) {
                int i10 = iFindPitchPeriodInRange2 * i6;
                int i11 = i6 * 4;
                int i12 = i10 - i11;
                int i13 = i10 + i11;
                int i14 = this.minPeriod;
                if (i12 < i14) {
                    i12 = i14;
                }
                int i15 = this.maxPeriod;
                if (i13 > i15) {
                    i13 = i15;
                }
                if (this.channelCount == 1) {
                    iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i, i12, i13);
                } else {
                    downSampleInput(sArr, i, 1);
                    iFindPitchPeriodInRange = findPitchPeriodInRange(this.downSampleBuffer, 0, i12, i13);
                }
            } else {
                iFindPitchPeriodInRange = iFindPitchPeriodInRange2;
            }
        }
        int i16 = previousPeriodBetter(this.minDiff, this.maxDiff) ? this.prevPeriod : iFindPitchPeriodInRange;
        this.prevMinDiff = this.minDiff;
        this.prevPeriod = iFindPitchPeriodInRange;
        return i16;
    }

    private int findPitchPeriodInRange(short[] sArr, int i, int i4, int i6) {
        int i10 = i * this.channelCount;
        int i11 = 255;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i4 <= i6) {
            int iAbs = 0;
            for (int i15 = 0; i15 < i4; i15++) {
                iAbs += Math.abs(sArr[i10 + i15] - sArr[(i10 + i4) + i15]);
            }
            if (iAbs * i13 < i12 * i4) {
                i13 = i4;
                i12 = iAbs;
            }
            if (iAbs * i11 > i14 * i4) {
                i11 = i4;
                i14 = iAbs;
            }
            i4++;
        }
        this.minDiff = i12 / i13;
        this.maxDiff = i14 / i11;
        return i13;
    }

    private int insertPitchPeriod(short[] sArr, int i, float f, int i4) {
        int i6;
        if (f < 0.5f) {
            i6 = (int) ((i4 * f) / (1.0f - f));
        } else {
            this.remainingInputToCopyFrameCount = (int) ((((2.0f * f) - 1.0f) * i4) / (1.0f - f));
            i6 = i4;
        }
        int i10 = i4 + i6;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i10);
        this.outputBuffer = sArrEnsureSpaceForAdditionalFrames;
        int i11 = this.channelCount;
        System.arraycopy(sArr, i * i11, sArrEnsureSpaceForAdditionalFrames, this.outputFrameCount * i11, i11 * i4);
        overlapAdd(i6, this.channelCount, this.outputBuffer, this.outputFrameCount + i4, sArr, i + i4, sArr, i);
        this.outputFrameCount += i10;
        return i6;
    }

    private short interpolate(short[] sArr, int i, int i4, int i6) {
        short s9 = sArr[i];
        short s10 = sArr[i + this.channelCount];
        int i10 = this.newRatePosition * i4;
        int i11 = this.oldRatePosition;
        int i12 = i11 * i6;
        int i13 = (i11 + 1) * i6;
        int i14 = i13 - i10;
        int i15 = i13 - i12;
        return (short) ((((i15 - i14) * s10) + (s9 * i14)) / i15);
    }

    private void moveNewSamplesToPitchBuffer(int i) {
        int i4 = this.outputFrameCount - i;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.pitchBuffer, this.pitchFrameCount, i4);
        this.pitchBuffer = sArrEnsureSpaceForAdditionalFrames;
        short[] sArr = this.outputBuffer;
        int i6 = this.channelCount;
        System.arraycopy(sArr, i * i6, sArrEnsureSpaceForAdditionalFrames, this.pitchFrameCount * i6, i6 * i4);
        this.outputFrameCount = i;
        this.pitchFrameCount += i4;
    }

    private static void overlapAdd(int i, int i4, short[] sArr, int i6, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i4; i12++) {
            int i13 = (i6 * i4) + i12;
            int i14 = (i11 * i4) + i12;
            int i15 = (i10 * i4) + i12;
            for (int i16 = 0; i16 < i; i16++) {
                sArr[i13] = (short) (((sArr3[i14] * i16) + ((i - i16) * sArr2[i15])) / i);
                i13 += i4;
                i15 += i4;
                i14 += i4;
            }
        }
    }

    private boolean previousPeriodBetter(int i, int i4) {
        return i != 0 && this.prevPeriod != 0 && i4 <= i * 3 && i * 2 > this.prevMinDiff * 3;
    }

    private void processStreamInput() {
        int i = this.outputFrameCount;
        float f = this.speed;
        float f3 = this.pitch;
        float f7 = f / f3;
        float f10 = this.rate * f3;
        double d10 = f7;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            changeSpeed(f7);
        } else {
            copyToOutput(this.inputBuffer, 0, this.inputFrameCount);
            this.inputFrameCount = 0;
        }
        if (f10 != 1.0f) {
            adjustRate(f10, i);
        }
    }

    private void removePitchFrames(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.pitchBuffer;
        int i4 = this.channelCount;
        System.arraycopy(sArr, i * i4, sArr, 0, (this.pitchFrameCount - i) * i4);
        this.pitchFrameCount -= i;
    }

    private void removeProcessedInputFrames(int i) {
        int i4 = this.inputFrameCount - i;
        short[] sArr = this.inputBuffer;
        int i6 = this.channelCount;
        System.arraycopy(sArr, i * i6, sArr, 0, i6 * i4);
        this.inputFrameCount = i4;
    }

    private int skipPitchPeriod(short[] sArr, int i, float f, int i4) {
        int i6;
        if (f >= 2.0f) {
            i6 = (int) (i4 / (f - 1.0f));
        } else {
            this.remainingInputToCopyFrameCount = (int) (((2.0f - f) * i4) / (f - 1.0f));
            i6 = i4;
        }
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i6);
        this.outputBuffer = sArrEnsureSpaceForAdditionalFrames;
        overlapAdd(i6, this.channelCount, sArrEnsureSpaceForAdditionalFrames, this.outputFrameCount, sArr, i, sArr, i + i4);
        this.outputFrameCount += i6;
        return i6;
    }

    public void flush() {
        this.inputFrameCount = 0;
        this.outputFrameCount = 0;
        this.pitchFrameCount = 0;
        this.oldRatePosition = 0;
        this.newRatePosition = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.prevPeriod = 0;
        this.prevMinDiff = 0;
        this.minDiff = 0;
        this.maxDiff = 0;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.channelCount, this.outputFrameCount);
        shortBuffer.put(this.outputBuffer, 0, this.channelCount * iMin);
        int i = this.outputFrameCount - iMin;
        this.outputFrameCount = i;
        short[] sArr = this.outputBuffer;
        int i4 = this.channelCount;
        System.arraycopy(sArr, iMin * i4, sArr, 0, i * i4);
    }

    public int getOutputSize() {
        return this.outputFrameCount * this.channelCount * 2;
    }

    public int getPendingInputBytes() {
        return this.inputFrameCount * this.channelCount * 2;
    }

    public void queueEndOfStream() {
        int i;
        int i4 = this.inputFrameCount;
        float f = this.speed;
        float f3 = this.pitch;
        int i6 = this.outputFrameCount + ((int) ((((i4 / (f / f3)) + this.pitchFrameCount) / (this.rate * f3)) + 0.5f));
        this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, i4, (this.maxRequiredFrameCount * 2) + i4);
        int i10 = 0;
        while (true) {
            i = this.maxRequiredFrameCount;
            int i11 = this.channelCount;
            if (i10 >= i * 2 * i11) {
                break;
            }
            this.inputBuffer[(i11 * i4) + i10] = 0;
            i10++;
        }
        this.inputFrameCount = (i * 2) + this.inputFrameCount;
        processStreamInput();
        if (this.outputFrameCount > i6) {
            this.outputFrameCount = i6;
        }
        this.inputFrameCount = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.pitchFrameCount = 0;
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.channelCount;
        int i4 = iRemaining / i;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.inputBuffer, this.inputFrameCount, i4);
        this.inputBuffer = sArrEnsureSpaceForAdditionalFrames;
        shortBuffer.get(sArrEnsureSpaceForAdditionalFrames, this.inputFrameCount * this.channelCount, ((i * i4) * 2) / 2);
        this.inputFrameCount += i4;
        processStreamInput();
    }
}
