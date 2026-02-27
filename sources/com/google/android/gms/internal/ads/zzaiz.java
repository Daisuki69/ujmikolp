package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaiz implements zzajf {
    private final zzadh zza;
    private final zzadg zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzaiz(zzadh zzadhVar, zzadg zzadgVar) {
        this.zza = zzadhVar;
        this.zzb = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final long zza(zzacv zzacvVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zzb(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzeo.zzm(jArr, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final zzadv zzc() {
        zzghc.zzh(this.zzc != -1);
        return new zzadf(this.zza, this.zzc);
    }

    public final void zzd(long j) {
        this.zzc = j;
    }
}
