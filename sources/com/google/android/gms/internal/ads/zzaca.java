package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaca implements zzadv {
    private final zzacd zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaca(zzacd zzacdVar, long j, long j6, long j7, long j9, long j10, long j11) {
        this.zza = zzacdVar;
        this.zzb = j;
        this.zzc = j7;
        this.zzd = j9;
        this.zze = j10;
        this.zzf = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzadw zzadwVar = new zzadw(j, zzacc.zza(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzadt(zzadwVar, zzadwVar);
    }

    public final long zzd(long j) {
        return this.zza.zza(j);
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zze;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }
}
