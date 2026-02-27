package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AudioMixingUtil {
    private static final float FLOAT_PCM_MAX_VALUE = 1.0f;
    private static final float FLOAT_PCM_MIN_VALUE = -1.0f;

    private AudioMixingUtil() {
    }

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.sampleRate == -1 || audioFormat.channelCount == -1) {
            return false;
        }
        int i = audioFormat.encoding;
        return i == 2 || i == 4;
    }

    private static float floatSampleToInt16Pcm(float f) {
        return Util.constrainValue(f * (f < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
    }

    private static float getPcmSample(ByteBuffer byteBuffer, boolean z4, boolean z5) {
        return z5 ? z4 ? byteBuffer.getShort() : floatSampleToInt16Pcm(byteBuffer.getFloat()) : z4 ? int16SampleToFloatPcm(byteBuffer.getShort()) : byteBuffer.getFloat();
    }

    private static float int16SampleToFloatPcm(short s9) {
        return s9 / (s9 < 0 ? 32768 : 32767);
    }

    public static ByteBuffer mix(ByteBuffer byteBuffer, AudioProcessor.AudioFormat audioFormat, ByteBuffer byteBuffer2, AudioProcessor.AudioFormat audioFormat2, ChannelMixingMatrix channelMixingMatrix, int i, boolean z4, boolean z5) {
        boolean z8 = audioFormat.encoding == 2;
        boolean z9 = audioFormat2.encoding == 2;
        int inputChannelCount = channelMixingMatrix.getInputChannelCount();
        int outputChannelCount = channelMixingMatrix.getOutputChannelCount();
        float[] fArr = new float[inputChannelCount];
        float[] fArr2 = new float[outputChannelCount];
        for (int i4 = 0; i4 < i; i4++) {
            if (z4) {
                int iPosition = byteBuffer2.position();
                for (int i6 = 0; i6 < outputChannelCount; i6++) {
                    fArr2[i6] = getPcmSample(byteBuffer2, z9, z9);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i10 = 0; i10 < inputChannelCount; i10++) {
                fArr[i10] = getPcmSample(byteBuffer, z8, z9);
            }
            for (int i11 = 0; i11 < outputChannelCount; i11++) {
                for (int i12 = 0; i12 < inputChannelCount; i12++) {
                    fArr2[i11] = (channelMixingMatrix.getMixingCoefficient(i12, i11) * fArr[i12]) + fArr2[i11];
                }
                if (z9) {
                    byteBuffer2.putShort((short) Util.constrainValue(fArr2[i11], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z5 ? Util.constrainValue(fArr2[i11], -1.0f, 1.0f) : fArr2[i11]);
                }
                fArr2[i11] = 0.0f;
            }
        }
        return byteBuffer2;
    }

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat, AudioProcessor.AudioFormat audioFormat2) {
        return audioFormat.sampleRate == audioFormat2.sampleRate && canMix(audioFormat) && canMix(audioFormat2);
    }
}
