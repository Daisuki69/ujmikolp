package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes3.dex */
final class zzahl implements zzahi {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;

    @Nullable
    private final long[] zzg;

    private zzahl(long j, int i, long j6, int i4, long j7, @Nullable long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j6;
        this.zzd = i4;
        this.zze = j7;
        this.zzg = jArr;
        this.zzf = j7 != -1 ? j + j7 : -1L;
    }

    @Nullable
    public static zzahl zzd(zzahk zzahkVar, long j) {
        long jZzb = zzahkVar.zzb();
        if (jZzb == androidx.media3.common.C.TIME_UNSET) {
            return null;
        }
        zzado zzadoVar = zzahkVar.zza;
        return new zzahl(j, zzadoVar.zzc, jZzb, zzadoVar.zzf, zzahkVar.zzc, zzahkVar.zzf);
    }

    private final long zzh(int i) {
        return (this.zzc * ((long) i)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        if (!zzb()) {
            zzadw zzadwVar = new zzadw(0L, this.zza + ((long) this.zzb));
            return new zzadt(zzadwVar, zzadwVar);
        }
        long j6 = this.zzc;
        String str = zzeo.zza;
        long jMax = Math.max(0L, Math.min(j, j6));
        double d10 = (jMax * 100.0d) / j6;
        double d11 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (d10 > AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i = (int) d10;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d12 = jArr[i];
                d11 = (((i == 99 ? 256.0d : jArr[i + 1]) - d12) * (d10 - ((double) i))) + d12;
            }
        }
        long j7 = this.zze;
        zzadw zzadwVar2 = new zzadw(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * j7), j7 - 1)));
        return new zzadt(zzadwVar2, zzadwVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j6 = j - this.zza;
        if (j6 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d10 = (j6 * 256.0d) / this.zze;
        int iZzm = zzeo.zzm(jArr, (long) d10, true, true);
        long jZzh = zzh(iZzm);
        long j7 = jArr[iZzm];
        int i = iZzm + 1;
        long jZzh2 = zzh(i);
        return Math.round((j7 == (iZzm == 99 ? 256L : jArr[i]) ? AudioStats.AUDIO_AMPLITUDE_NONE : (d10 - j7) / (r0 - j7)) * (jZzh2 - jZzh)) + jZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return this.zzd;
    }
}
