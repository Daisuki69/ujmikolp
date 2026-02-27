package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
final class zzaoe implements zzadv {
    private final zzaob zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoe(zzaob zzaobVar, int i, long j, long j6) {
        this.zza = zzaobVar;
        this.zzb = i;
        this.zzc = j;
        long j7 = (j6 - j) / ((long) zzaobVar.zzd);
        this.zzd = j7;
        this.zze = zzd(j7);
    }

    private final long zzd(long j) {
        return zzeo.zzt(j * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long j6 = this.zzb;
        zzaob zzaobVar = this.zza;
        long j7 = (((long) zzaobVar.zzc) * j) / (j6 * 1000000);
        String str = zzeo.zza;
        long j9 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j7, j9));
        long j10 = zzaobVar.zzd;
        long jZzd = zzd(jMax);
        long j11 = this.zzc;
        zzadw zzadwVar = new zzadw(jZzd, (jMax * j10) + j11);
        if (jZzd >= j || jMax == j9) {
            return new zzadt(zzadwVar, zzadwVar);
        }
        long j12 = jMax + 1;
        return new zzadt(zzadwVar, new zzadw(zzd(j12), (j10 * j12) + j11));
    }
}
