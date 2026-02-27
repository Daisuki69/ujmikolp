package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzack implements zzadv {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzack(long j, long j6, int i, int i4, boolean z4) {
        long jZze;
        this.zza = j;
        this.zzb = j6;
        this.zzc = i4 == -1 ? 1 : i4;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            jZze = androidx.media3.common.C.TIME_UNSET;
        } else {
            this.zzd = j - j6;
            jZze = zze(j, j6, i);
        }
        this.zzf = jZze;
    }

    private static long zze(long j, long j6, int i) {
        return (Math.max(0L, j - j6) * 8000000) / ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long j6 = this.zzd;
        if (j6 == -1) {
            zzadw zzadwVar = new zzadw(0L, this.zzb);
            return new zzadt(zzadwVar, zzadwVar);
        }
        long j7 = ((long) this.zze) * j;
        long j9 = this.zzc;
        long jMin = ((j7 / 8000000) / j9) * j9;
        if (j6 != -1) {
            jMin = Math.min(jMin, j6 - j9);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzd = zzd(jMax);
        zzadw zzadwVar2 = new zzadw(jZzd, jMax);
        if (j6 != -1 && jZzd < j) {
            long j10 = jMax + j9;
            if (j10 < this.zza) {
                return new zzadt(zzadwVar2, new zzadw(zzd(j10), j10));
            }
        }
        return new zzadt(zzadwVar2, zzadwVar2);
    }

    public final long zzd(long j) {
        return zze(j, this.zzb, this.zze);
    }
}
