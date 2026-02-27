package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MimeTypes;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzst {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    @VisibleForTesting
    public zzst(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z5, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z4;
        this.zze = z9;
        this.zzf = z11;
        this.zzh = z12;
        this.zzi = zzar.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzst zza(java.lang.String r12, java.lang.String r13, java.lang.String r14, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            com.google.android.gms.internal.ads.zzst r0 = new com.google.android.gms.internal.ads.zzst
            r1 = 1
            r2 = 0
            if (r15 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r1
            goto L11
        L10:
            r8 = r2
        L11:
            if (r15 == 0) goto L1d
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L1d
            r9 = r1
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r20 != 0) goto L2a
            if (r15 == 0) goto L2c
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L2c
        L2a:
            r10 = r1
            goto L2d
        L2c:
            r10 = r2
        L2d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L67
            if (r15 == 0) goto L67
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L67
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "OPPO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "realme"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "motorola"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "LENOVO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L73
        L67:
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r2
            r2 = r13
            goto L7e
        L73:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r1
            r1 = r12
        L7e:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zza(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzst");
    }

    private final boolean zzj(zzu zzuVar) {
        String str = this.zzb;
        return str.equals(zzuVar.zzo) || str.equals(zztl.zzg(zzuVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzk(com.google.android.gms.internal.ads.zzu r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zzk(com.google.android.gms.internal.ads.zzu, boolean):boolean");
    }

    private final boolean zzl(zzu zzuVar) {
        return (Objects.equals(zzuVar.zzo, MimeTypes.AUDIO_FLAC) && zzuVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzeo.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 14 + 2 + length + 3 + length2 + 1);
        androidx.media3.datasource.cache.c.A(sb2, "NoSupport [", str, "] [", str4);
        androidx.media3.datasource.cache.c.A(sb2, ", ", str3, "] [", str2);
        sb2.append("]");
        zzds.zza(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.TAG, sb2.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4, double d10) {
        Range<Double> achievableFrameRatesFor;
        Point pointZzo = zzo(videoCapabilities, i, i4);
        int i6 = pointZzo.x;
        int i10 = pointZzo.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i6, i10);
        }
        double dFloor = Math.floor(d10);
        if (videoCapabilities.areSizeAndRateSupported(i6, i10, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i6, i10)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzeo.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i4 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(zzu zzuVar) throws zztd {
        int i;
        if (!zzj(zzuVar) || !zzk(zzuVar, true) || !zzl(zzuVar)) {
            return false;
        }
        if (this.zzi) {
            int i4 = zzuVar.zzv;
            if (i4 <= 0 || (i = zzuVar.zzw) <= 0) {
                return true;
            }
            return zzg(i4, i, zzuVar.zzz);
        }
        int i6 = zzuVar.zzH;
        if (i6 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i6)) {
                zzm(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i6).length() + 20), "sampleRate.support, ", i6));
                return false;
            }
        }
        int i10 = zzuVar.zzG;
        if (i10 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
                int i11 = MimeTypes.AUDIO_AC3.equals(str2) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
                StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.b(String.valueOf(maxInputChannelCount).length() + str.length() + 32 + 4, 1, String.valueOf(i11)));
                sb2.append("AssumedMaxChannelAdjustment: ");
                sb2.append(str);
                sb2.append(", [");
                sb2.append(maxInputChannelCount);
                sb2.append(" to ");
                sb2.append(i11);
                sb2.append("]");
                zzds.zzc(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.TAG, sb2.toString());
                maxInputChannelCount = i11;
            }
            if (maxInputChannelCount < i10) {
                zzm(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i10).length() + 22), "channelCount.support, ", i10));
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzu zzuVar) {
        return zzj(zzuVar) && zzk(zzuVar, false) && zzl(zzuVar);
    }

    public final boolean zze(zzu zzuVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i = zztl.zza;
        Pair pairZze = zzdc.zze(zzuVar);
        return pairZze != null && ((Integer) pairZze.first).intValue() == 42;
    }

    public final zzhs zzf(zzu zzuVar, zzu zzuVar2) {
        zzu zzuVar3;
        zzu zzuVar4;
        int i;
        int i4 = true != Objects.equals(zzuVar.zzo, zzuVar2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzuVar.zzA != zzuVar2.zzA) {
                i4 |= 1024;
            }
            boolean z4 = (zzuVar.zzv == zzuVar2.zzv && zzuVar.zzw == zzuVar2.zzw) ? false : true;
            if (!this.zze && z4) {
                i4 |= 512;
            }
            zzh zzhVar = zzuVar.zzE;
            if ((!zzh.zza(zzhVar) || !zzh.zza(zzuVar2.zzE)) && !Objects.equals(zzhVar, zzuVar2.zzE)) {
                i4 |= 2048;
            }
            String str = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzuVar.zzd(zzuVar2)) {
                i4 |= 2;
            }
            int i6 = zzuVar.zzx;
            if (i6 != -1 && (i = zzuVar.zzy) != -1 && i6 == zzuVar2.zzx && i == zzuVar2.zzy && z4) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new zzhs(str, zzuVar, zzuVar2, true == zzuVar.zzd(zzuVar2) ? 3 : 2, 0);
            }
            zzuVar3 = zzuVar;
            zzuVar4 = zzuVar2;
        } else {
            zzuVar3 = zzuVar;
            zzuVar4 = zzuVar2;
            if (zzuVar3.zzG != zzuVar4.zzG) {
                i4 |= 4096;
            }
            if (zzuVar3.zzH != zzuVar4.zzH) {
                i4 |= 8192;
            }
            if (zzuVar3.zzI != zzuVar4.zzI) {
                i4 |= 16384;
            }
            if (i4 == 0 && MimeTypes.AUDIO_AAC.equals(this.zzb)) {
                int i10 = zztl.zza;
                Pair pairZze = zzdc.zze(zzuVar3);
                Pair pairZze2 = zzdc.zze(zzuVar4);
                if (pairZze != null && pairZze2 != null) {
                    int iIntValue = ((Integer) pairZze.first).intValue();
                    int iIntValue2 = ((Integer) pairZze2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzhs(this.zza, zzuVar3, zzuVar4, 3, 0);
                    }
                }
            }
            if (!zzuVar3.zzd(zzuVar4)) {
                i4 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.zzb)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new zzhs(this.zza, zzuVar3, zzuVar4, 1, 0);
            }
        }
        return new zzhs(this.zza, zzuVar3, zzuVar4, 0, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzg(int r11, int r12, double r13) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zzg(int, int, double):boolean");
    }

    public final float zzh(int i, int i4) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f = this.zzl;
        if (f != -3.4028235E38f && this.zzj == i && this.zzk == i4) {
            return f;
        }
        float f3 = 1024.0f;
        if (!zzg(i, i4, 1024.0d)) {
            float f7 = 0.0f;
            while (true) {
                float f10 = f3 - f7;
                if (Math.abs(f10) <= 5.0f) {
                    break;
                }
                float f11 = (f10 / 2.0f) + f7;
                boolean zZzg = zzg(i, i4, f11);
                if (true == zZzg) {
                    f7 = f11;
                }
                if (true != zZzg) {
                    f3 = f11;
                }
            }
            f3 = f7;
        }
        this.zzl = f3;
        this.zzj = i;
        this.zzk = i4;
        return f3;
    }

    @Nullable
    public final Point zzi(int i, int i4) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i, i4);
    }
}
