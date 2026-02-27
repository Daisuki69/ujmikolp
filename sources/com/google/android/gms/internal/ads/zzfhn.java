package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfhn implements zzdde, zzcwi, zzddi {
    private final zzfib zza;
    private final zzfhr zzb;

    public zzfhn(Context context, zzfib zzfibVar) {
        this.zza = zzfibVar;
        this.zzb = s.a(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zza() {
        if (((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            zzfib zzfibVar = this.zza;
            zzfhr zzfhrVar = this.zzb;
            zzfhrVar.zzd(true);
            zzfibVar.zza(zzfhrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzh() {
        if (((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            zzfib zzfibVar = this.zza;
            zzfhr zzfhrVar = this.zzb;
            zzfhrVar.zzk(zzeVar.zza().toString());
            zzfhrVar.zzd(false);
            zzfibVar.zza(zzfhrVar);
        }
    }
}
