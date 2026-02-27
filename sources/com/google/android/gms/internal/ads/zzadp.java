package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.OpusUtil;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadp {
    private static final String[] zza = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] zzb = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] zzc = {32000, 64000, 96000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] zze = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] zzf = {32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] zzg = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 144000, 160000};

    public static int zza(int i) {
        int i4;
        int i6;
        int i10;
        int i11;
        if (!zzl(i) || (i4 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = i10 - 1;
        int i13 = zzb[i11];
        if (i4 == 2) {
            i13 /= 2;
        } else if (i4 == 0) {
            i13 /= 4;
        }
        int i14 = (i >>> 9) & 1;
        if (i6 == 3) {
            return ((((i4 == 3 ? zzc[i12] : zzd[i12]) * 12) / i13) + i14) * 4;
        }
        int i15 = i4 == 3 ? i6 == 2 ? zze[i12] : zzf[i12] : zzg[i12];
        if (i4 == 3) {
            return androidx.camera.core.impl.a.a(i15, 144, i13, i14);
        }
        return androidx.camera.core.impl.a.a(i6 == 1 ? 72 : 144, i15, i13, i14);
    }

    public static int zzb(int i) {
        int i4;
        int i6;
        if (!zzl(i) || (i4 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = i >>> 12;
        int i11 = (i >>> 10) & 3;
        int i12 = i10 & 15;
        if (i12 == 0 || i12 == 15 || i11 == 3) {
            return -1;
        }
        return zzm(i4, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzl(int i) {
        return (i & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzm(int i, int i4) {
        if (i4 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i4 != 2) {
            return RendererCapabilities.DECODER_SUPPORT_MASK;
        }
        return 1152;
    }
}
