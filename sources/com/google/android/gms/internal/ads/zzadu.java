package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzadu implements zzadv {
    private final long zza;
    private final zzadt zzb;

    public zzadu(long j, long j6) {
        this.zza = j;
        zzadw zzadwVar = j6 == 0 ? zzadw.zza : new zzadw(0L, j6);
        this.zzb = new zzadt(zzadwVar, zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        return this.zzb;
    }
}
