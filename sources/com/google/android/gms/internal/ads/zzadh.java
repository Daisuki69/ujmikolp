package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.OpusUtil;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;

    @Nullable
    public final zzadg zzk;

    @Nullable
    private final zzao zzl;

    @VisibleForTesting
    public zzadh(int i, int i4, int i6, int i10, int i11, int i12, int i13, long j, @Nullable zzadg zzadgVar, @Nullable zzao zzaoVar) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = i6;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = zzf(i11);
        this.zzg = i12;
        this.zzh = i13;
        this.zzi = zzg(i13);
        this.zzj = j;
        this.zzk = zzadgVar;
        this.zzl = zzaoVar;
    }

    private static int zzf(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzg(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long zza() {
        long j = this.zzj;
        return j == 0 ? androidx.media3.common.C.TIME_UNSET : (j * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j) {
        String str = zzeo.zza;
        return Math.max(0L, Math.min((j * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final zzu zzc(byte[] bArr, @Nullable zzao zzaoVar) {
        bArr[4] = -128;
        zzao zzaoVarZzd = zzd(zzaoVar);
        zzs zzsVar = new zzs();
        zzsVar.zzm(MimeTypes.AUDIO_FLAC);
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzsVar.zzn(i);
        zzsVar.zzE(this.zzg);
        zzsVar.zzF(this.zze);
        zzsVar.zzG(zzeo.zzz(this.zzh, ByteOrder.LITTLE_ENDIAN));
        zzsVar.zzp(Collections.singletonList(bArr));
        zzsVar.zzk(zzaoVarZzd);
        return zzsVar.zzM();
    }

    @Nullable
    public final zzao zzd(@Nullable zzao zzaoVar) {
        zzao zzaoVar2 = this.zzl;
        return zzaoVar2 == null ? zzaoVar : zzaoVar2.zzc(zzaoVar);
    }

    public final zzadh zze(@Nullable zzadg zzadgVar) {
        return new zzadh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzadgVar, this.zzl);
    }

    public zzadh(byte[] bArr, int i) {
        zzee zzeeVar = new zzee(bArr, bArr.length);
        zzeeVar.zzf(i * 8);
        this.zza = zzeeVar.zzj(16);
        this.zzb = zzeeVar.zzj(16);
        this.zzc = zzeeVar.zzj(24);
        this.zzd = zzeeVar.zzj(24);
        int iZzj = zzeeVar.zzj(20);
        this.zze = iZzj;
        this.zzf = zzf(iZzj);
        this.zzg = zzeeVar.zzj(3) + 1;
        int iZzj2 = zzeeVar.zzj(5) + 1;
        this.zzh = iZzj2;
        this.zzi = zzg(iZzj2);
        this.zzj = zzeeVar.zzk(36);
        this.zzk = null;
        this.zzl = null;
    }
}
