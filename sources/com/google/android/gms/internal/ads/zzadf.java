package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadf implements zzadv {
    private final zzadh zza;
    private final long zzb;

    public zzadf(zzadh zzadhVar, long j) {
        this.zza = zzadhVar;
        this.zzb = j;
    }

    private final zzadw zzd(long j, long j6) {
        return new zzadw((j * 1000000) / ((long) this.zza.zze), this.zzb + j6);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzadh zzadhVar = this.zza;
        zzadg zzadgVar = zzadhVar.zzk;
        zzadgVar.getClass();
        long jZzb = zzadhVar.zzb(j);
        long[] jArr = zzadgVar.zza;
        int iZzm = zzeo.zzm(jArr, jZzb, true, false);
        long j6 = iZzm == -1 ? 0L : jArr[iZzm];
        long[] jArr2 = zzadgVar.zzb;
        zzadw zzadwVarZzd = zzd(j6, iZzm != -1 ? jArr2[iZzm] : 0L);
        if (zzadwVarZzd.zzb == j || iZzm == jArr.length - 1) {
            return new zzadt(zzadwVarZzd, zzadwVarZzd);
        }
        int i = iZzm + 1;
        return new zzadt(zzadwVarZzd, zzd(jArr[i], jArr2[i]));
    }
}
