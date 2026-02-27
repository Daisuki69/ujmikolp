package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.UnstableApi;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] BITRATE_V1_L1 = {32000, 64000, 96000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] BITRATE_V1_L2 = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final int[] BITRATE_V1_L3 = {32000, MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] BITRATE_V2 = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 144000, 160000};

    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;

        @Nullable
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public Header() {
        }

        public boolean setForHeaderData(int i) {
            int i4;
            int i6;
            int i10;
            int i11;
            if (!MpegAudioUtil.isMagicPresent(i) || (i4 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i4;
            this.mimeType = MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - i6];
            int i12 = MpegAudioUtil.SAMPLING_RATE_V1[i11];
            this.sampleRate = i12;
            if (i4 == 2) {
                this.sampleRate = i12 / 2;
            } else if (i4 == 0) {
                this.sampleRate = i12 / 4;
            }
            int i13 = (i >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.getFrameSizeInSamples(i4, i6);
            if (i6 == 3) {
                int i14 = i4 == 3 ? MpegAudioUtil.BITRATE_V1_L1[i10 - 1] : MpegAudioUtil.BITRATE_V2_L1[i10 - 1];
                this.bitrate = i14;
                this.frameSize = (((i14 * 12) / this.sampleRate) + i13) * 4;
            } else {
                if (i4 == 3) {
                    int i15 = i6 == 2 ? MpegAudioUtil.BITRATE_V1_L2[i10 - 1] : MpegAudioUtil.BITRATE_V1_L3[i10 - 1];
                    this.bitrate = i15;
                    this.frameSize = ((i15 * 144) / this.sampleRate) + i13;
                } else {
                    int i16 = MpegAudioUtil.BITRATE_V2[i10 - 1];
                    this.bitrate = i16;
                    this.frameSize = (((i6 == 1 ? 72 : 144) * i16) / this.sampleRate) + i13;
                }
            }
            this.channels = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public Header(Header header) {
            this.version = header.version;
            this.mimeType = header.mimeType;
            this.frameSize = header.frameSize;
            this.sampleRate = header.sampleRate;
            this.channels = header.channels;
            this.bitrate = header.bitrate;
            this.samplesPerFrame = header.samplesPerFrame;
        }
    }

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int i) {
        int i4;
        int i6;
        int i10;
        int i11;
        if (!isMagicPresent(i) || (i4 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = SAMPLING_RATE_V1[i11];
        if (i4 == 2) {
            i12 /= 2;
        } else if (i4 == 0) {
            i12 /= 4;
        }
        int i13 = (i >>> 9) & 1;
        if (i6 == 3) {
            return ((((i4 == 3 ? BITRATE_V1_L1[i10 - 1] : BITRATE_V2_L1[i10 - 1]) * 12) / i12) + i13) * 4;
        }
        int i14 = i4 == 3 ? i6 == 2 ? BITRATE_V1_L2[i10 - 1] : BITRATE_V1_L3[i10 - 1] : BITRATE_V2[i10 - 1];
        if (i4 == 3) {
            return androidx.camera.core.impl.a.a(i14, 144, i12, i13);
        }
        return androidx.camera.core.impl.a.a(i6 == 1 ? 72 : 144, i14, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i, int i4) {
        if (i4 == 1) {
            if (i == 3) {
                return 1152;
            }
            return SAMPLES_PER_FRAME_L3_V2;
        }
        if (i4 == 2) {
            return 1152;
        }
        if (i4 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i) {
        int i4;
        int i6;
        if (!isMagicPresent(i) || (i4 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = (i >>> 12) & 15;
        int i11 = (i >>> 10) & 3;
        if (i10 == 0 || i10 == 15 || i11 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i4, i6);
    }
}
