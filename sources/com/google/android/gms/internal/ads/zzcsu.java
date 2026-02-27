package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcsu implements zzdbn, zzcxg {
    private final Clock zza;
    private final zzcsw zzb;
    private final zzfdc zzc;
    private final String zzd;

    public zzcsu(Clock clock, zzcsw zzcswVar, zzfdc zzfdcVar, String str) {
        this.zza = clock;
        this.zzb = zzcswVar;
        this.zzc = zzfdcVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final void zza() {
        this.zzb.zzd(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        Clock clock = this.zza;
        this.zzb.zze(this.zzc.zzg, this.zzd, clock.elapsedRealtime());
    }
}
