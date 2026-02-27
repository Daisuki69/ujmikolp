package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.OpusUtil;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int DTSHD_BUFFER_MULTIPLICATION_FACTOR = 4;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    public final int dtshdBufferMultiplicationFactor;
    protected final int maxPcmBufferDurationUs;
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;
    protected final int pcmBufferMultiplicationFactor;

    public static class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = 4;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;
        private int dtshdBufferMultiplicationFactor = 4;

        public DefaultAudioTrackBufferSizeProvider build() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }

        public Builder setAc3BufferMultiplicationFactor(int i) {
            this.ac3BufferMultiplicationFactor = i;
            return this;
        }

        public Builder setDtshdBufferMultiplicationFactor(int i) {
            this.dtshdBufferMultiplicationFactor = i;
            return this;
        }

        public Builder setMaxPcmBufferDurationUs(int i) {
            this.maxPcmBufferDurationUs = i;
            return this;
        }

        public Builder setMinPcmBufferDurationUs(int i) {
            this.minPcmBufferDurationUs = i;
            return this;
        }

        public Builder setOffloadBufferDurationUs(int i) {
            this.offloadBufferDurationUs = i;
            return this;
        }

        public Builder setPassthroughBufferDurationUs(int i) {
            this.passthroughBufferDurationUs = i;
            return this;
        }

        public Builder setPcmBufferMultiplicationFactor(int i) {
            this.pcmBufferMultiplicationFactor = i;
            return this;
        }
    }

    public DefaultAudioTrackBufferSizeProvider(Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
        this.dtshdBufferMultiplicationFactor = builder.dtshdBufferMultiplicationFactor;
    }

    public static int durationUsToBytes(int i, int i4, int i6) {
        return AbstractC1955a.e(((((long) i) * ((long) i4)) * ((long) i6)) / 1000000);
    }

    public static int getMaximumEncodedRateBytesPerSecond(int i) {
        if (i == 20) {
            return OpusUtil.MAX_BYTES_PER_SECOND;
        }
        if (i == 30) {
            return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
        }
        switch (i) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
                return 768000;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
                    case 15:
                        return 8000;
                    case 16:
                        return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
                    case 17:
                        return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int get1xBufferSizeInBytes(int i, int i4, int i6, int i10, int i11, int i12) {
        if (i6 == 0) {
            return getPcmBufferSizeInBytes(i, i11, i10);
        }
        if (i6 == 1) {
            return getOffloadBufferSizeInBytes(i4);
        }
        if (i6 == 2) {
            return getPassthroughBufferSizeInBytes(i4, i12);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i, int i4, int i6, int i10, int i11, int i12, double d10) {
        return (((Math.max(i, (int) (((double) get1xBufferSizeInBytes(i, i4, i6, i10, i11, i12)) * d10)) + i10) - 1) / i10) * i10;
    }

    public int getOffloadBufferSizeInBytes(int i) {
        return AbstractC1955a.e((((long) this.offloadBufferDurationUs) * ((long) getMaximumEncodedRateBytesPerSecond(i))) / 1000000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getPassthroughBufferSizeInBytes(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.passthroughBufferDurationUs
            r1 = 5
            r2 = 8
            if (r6 != r1) goto Lb
            int r1 = r5.ac3BufferMultiplicationFactor
        L9:
            int r0 = r0 * r1
            goto L10
        Lb:
            if (r6 != r2) goto L10
            int r1 = r5.dtshdBufferMultiplicationFactor
            goto L9
        L10:
            r1 = -1
            if (r7 == r1) goto L5d
            java.math.RoundingMode r6 = java.math.RoundingMode.CEILING
            r6.getClass()
            int r1 = r7 / 8
            int r3 = r2 * r1
            int r3 = r7 - r3
            if (r3 != 0) goto L21
            goto L61
        L21:
            r7 = r7 ^ r2
            int r7 = r7 >> 31
            r7 = r7 | 1
            int[] r4 = Q1.d.f5201a
            int r6 = r6.ordinal()
            r6 = r4[r6]
            switch(r6) {
                case 1: goto L52;
                case 2: goto L61;
                case 3: goto L4e;
                case 4: goto L50;
                case 5: goto L4b;
                case 6: goto L37;
                case 7: goto L37;
                case 8: goto L37;
                default: goto L31;
            }
        L31:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L37:
            int r6 = java.lang.Math.abs(r3)
            int r2 = java.lang.Math.abs(r2)
            int r2 = r2 - r6
            int r6 = r6 - r2
            if (r6 != 0) goto L48
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            goto L61
        L48:
            if (r6 <= 0) goto L61
            goto L50
        L4b:
            if (r7 <= 0) goto L61
            goto L50
        L4e:
            if (r7 >= 0) goto L61
        L50:
            int r1 = r1 + r7
            goto L61
        L52:
            if (r3 != 0) goto L55
            goto L61
        L55:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            java.lang.String r7 = "mode was UNNECESSARY, but rounding was necessary"
            r6.<init>(r7)
            throw r6
        L5d:
            int r1 = getMaximumEncodedRateBytesPerSecond(r6)
        L61:
            long r6 = (long) r0
            long r0 = (long) r1
            long r6 = r6 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r0
            int r6 = o1.AbstractC1955a.e(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.getPassthroughBufferSizeInBytes(int, int):int");
    }

    public int getPcmBufferSizeInBytes(int i, int i4, int i6) {
        return Util.constrainValue(i * this.pcmBufferMultiplicationFactor, durationUsToBytes(this.minPcmBufferDurationUs, i4, i6), durationUsToBytes(this.maxPcmBufferDurationUs, i4, i6));
    }
}
