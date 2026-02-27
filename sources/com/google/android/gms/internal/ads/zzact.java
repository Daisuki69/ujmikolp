package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.ts.PsExtractor;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzact {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] zzd = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, 64000, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 22050, 44100, 88200, 176400, 352800, 12000, 24000, OpusUtil.SAMPLE_RATE, 96000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static zzu zzb(byte[] bArr, @Nullable String str, @Nullable String str2, int i, String str3, @Nullable zzp zzpVar) {
        zzee zzeeVarZzi = zzi(bArr);
        zzeeVarZzi.zzh(60);
        int i4 = zzb[zzeeVarZzi.zzj(6)];
        int i6 = zzc[zzeeVarZzi.zzj(4)];
        int iZzj = zzeeVarZzi.zzj(5);
        int i10 = iZzj >= 29 ? -1 : (zzd[iZzj] * 1000) / 2;
        zzeeVarZzi.zzh(10);
        int i11 = i4 + (zzeeVarZzi.zzj(2) > 0 ? 1 : 0);
        zzs zzsVar = new zzs();
        zzsVar.zza(str);
        zzsVar.zzl(MimeTypes.VIDEO_MP2T);
        zzsVar.zzm(MimeTypes.AUDIO_DTS);
        zzsVar.zzh(i10);
        zzsVar.zzE(i11);
        zzsVar.zzF(i6);
        zzsVar.zzq(null);
        zzsVar.zze(str2);
        zzsVar.zzg(i);
        return zzsVar.zzM();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzc(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzact.zzc(byte[]):int");
    }

    public static zzacs zzd(byte[] bArr) throws zzas {
        int iZzj;
        int i;
        long jZzt;
        int i4;
        zzee zzeeVarZzi = zzi(bArr);
        zzeeVarZzi.zzh(40);
        int iZzj2 = zzeeVarZzi.zzj(2);
        boolean zZzi = zzeeVarZzi.zzi();
        int i6 = true != zZzi ? 16 : 20;
        zzeeVarZzi.zzh(true != zZzi ? 8 : 12);
        int iZzj3 = zzeeVarZzi.zzj(i6) + 1;
        boolean zZzi2 = zzeeVarZzi.zzi();
        int iZzj4 = -1;
        int i10 = 0;
        if (zZzi2) {
            iZzj = zzeeVarZzi.zzj(2);
            int iZzj5 = zzeeVarZzi.zzj(3) + 1;
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(36);
            }
            int iZzj6 = zzeeVarZzi.zzj(3) + 1;
            int iZzj7 = zzeeVarZzi.zzj(3) + 1;
            if (iZzj6 != 1 || iZzj7 != 1) {
                throw zzas.zzc("Multiple audio presentations or assets not supported");
            }
            int i11 = iZzj2 + 1;
            int iZzj8 = zzeeVarZzi.zzj(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                if (((iZzj8 >> i12) & 1) == 1) {
                    zzeeVarZzi.zzh(8);
                }
            }
            int i13 = iZzj5 * 512;
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(2);
                int iZzj9 = (zzeeVarZzi.zzj(2) + 1) << 2;
                int iZzj10 = zzeeVarZzi.zzj(2) + 1;
                while (i10 < iZzj10) {
                    zzeeVarZzi.zzh(iZzj9);
                    i10++;
                }
            }
            i10 = i13;
        } else {
            iZzj = -1;
        }
        zzeeVarZzi.zzh(i6);
        zzeeVarZzi.zzh(12);
        if (zZzi2) {
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(4);
            }
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(24);
            }
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzo(zzeeVarZzi.zzj(10) + 1);
            }
            zzeeVarZzi.zzh(5);
            i = zze[zzeeVarZzi.zzj(4)];
            iZzj4 = zzeeVarZzi.zzj(8) + 1;
        } else {
            i = androidx.media3.common.C.RATE_UNSET_INT;
        }
        int i14 = i;
        if (zZzi2) {
            if (iZzj == 0) {
                i4 = 32000;
            } else if (iZzj == 1) {
                i4 = 44100;
            } else {
                if (iZzj != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj).length() + 51);
                    sb2.append("Unsupported reference clock code in DTS HD header: ");
                    sb2.append(iZzj);
                    throw zzas.zzb(sb2.toString(), null);
                }
                i4 = OpusUtil.SAMPLE_RATE;
            }
            jZzt = zzeo.zzt(i10, 1000000L, i4, RoundingMode.DOWN);
        } else {
            jZzt = androidx.media3.common.C.TIME_UNSET;
        }
        return new zzacs(MimeTypes.AUDIO_DTS_EXPRESS, iZzj4, i14, iZzj3, jZzt, 0, null);
    }

    public static int zze(byte[] bArr) {
        zzee zzeeVarZzi = zzi(bArr);
        zzeeVarZzi.zzh(42);
        return zzeeVarZzi.zzj(true != zzeeVarZzi.zzi() ? 8 : 12) + 1;
    }

    public static zzacs zzf(byte[] bArr, AtomicInteger atomicInteger) throws zzas {
        long jZzt;
        int iZzj;
        AtomicInteger atomicInteger2;
        int i;
        int i4;
        zzee zzeeVarZzi = zzi(bArr);
        int iZzj2 = zzeeVarZzi.zzj(32);
        int iZzh = zzh(zzeeVarZzi, zzf, true);
        int i6 = iZzh + 1;
        char c = iZzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c == 0) {
            jZzt = androidx.media3.common.C.TIME_UNSET;
            iZzj = androidx.media3.common.C.RATE_UNSET_INT;
        } else {
            if (!zzeeVarZzi.zzi()) {
                throw zzas.zzc("Only supports full channel mask-based audio presentation");
            }
            int i10 = iZzh - 1;
            if (((bArr[iZzh] & 255) | ((char) (bArr[i10] << 8))) != zzeo.zzI(bArr, 0, i10, 65535)) {
                throw zzas.zzb("CRC check failed", null);
            }
            int iZzj3 = zzeeVarZzi.zzj(2);
            if (iZzj3 == 0) {
                i = 512;
            } else if (iZzj3 == 1) {
                i = 480;
            } else {
                if (iZzj3 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length() + 51);
                    sb2.append("Unsupported base duration index in DTS UHD header: ");
                    sb2.append(iZzj3);
                    throw zzas.zzb(sb2.toString(), null);
                }
                i = RendererCapabilities.DECODER_SUPPORT_MASK;
            }
            int iZzj4 = zzeeVarZzi.zzj(3) + 1;
            int iZzj5 = zzeeVarZzi.zzj(2);
            if (iZzj5 == 0) {
                i4 = 32000;
            } else if (iZzj5 == 1) {
                i4 = 44100;
            } else {
                if (iZzj5 != 2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj5).length() + 48);
                    sb3.append("Unsupported clock rate index in DTS UHD header: ");
                    sb3.append(iZzj5);
                    throw zzas.zzb(sb3.toString(), null);
                }
                i4 = OpusUtil.SAMPLE_RATE;
            }
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(36);
            }
            iZzj = (1 << zzeeVarZzi.zzj(2)) * i4;
            jZzt = zzeo.zzt(i * iZzj4, 1000000L, i4, RoundingMode.DOWN);
        }
        int i11 = iZzj;
        long j = jZzt;
        int iZzh2 = 0;
        for (char c10 = 0; c10 < c; c10 = 1) {
            iZzh2 += zzh(zzeeVarZzi, zzg, true);
        }
        for (int i12 = 0; i12 <= 0; i12++) {
            if (c != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzh(zzeeVarZzi, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iZzh2 += atomicInteger2.get() != 0 ? zzh(zzeeVarZzi, zzi, true) : 0;
        }
        return new zzacs(MimeTypes.AUDIO_DTS_X, 2, i11, i6 + iZzh2, j, 0, null);
    }

    public static int zzg(byte[] bArr) {
        zzee zzeeVarZzi = zzi(bArr);
        zzeeVarZzi.zzh(32);
        return zzh(zzeeVarZzi, zzj, true) + 1;
    }

    private static int zzh(zzee zzeeVar, int[] iArr, boolean z4) {
        int i = 0;
        for (int i4 = 0; i4 < 3 && zzeeVar.zzi(); i4++) {
            i++;
        }
        int i6 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i6 += 1 << iArr[i10];
        }
        return zzeeVar.zzj(iArr[i]) + i6;
    }

    private static zzee zzi(byte[] bArr) {
        byte b8 = bArr[0];
        if (b8 == 127 || b8 == 100 || b8 == 64 || b8 == 113) {
            return new zzee(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = bArrCopyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b11 = bArrCopyOf[i];
                int i4 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i4];
                bArrCopyOf[i4] = b11;
            }
        }
        int length = bArrCopyOf.length;
        zzee zzeeVar = new zzee(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzee zzeeVar2 = new zzee(bArrCopyOf, length);
            while (zzeeVar2.zzc() >= 16) {
                zzeeVar2.zzh(2);
                zzeeVar.zzp(zzeeVar2.zzj(14), 14);
            }
        }
        zzeeVar.zzb(bArrCopyOf, bArrCopyOf.length);
        return zzeeVar;
    }
}
