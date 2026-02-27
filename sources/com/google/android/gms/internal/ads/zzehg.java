package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehg extends zzegz {
    private final zzcgv zza;
    private final zzcva zzb;
    private final zzdbs zzc;
    private final zzehk zzd;
    private final zzfcv zze;
    private final zzeee zzf;

    public zzehg(zzcgv zzcgvVar, zzcva zzcvaVar, zzdbs zzdbsVar, zzfcv zzfcvVar, zzehk zzehkVar, zzeee zzeeeVar) {
        this.zza = zzcgvVar;
        this.zzb = zzcvaVar;
        this.zzc = zzdbsVar;
        this.zze = zzfcvVar;
        this.zzd = zzehkVar;
        this.zzf = zzeeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    public final S1.y zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        zzfcv zzfcvVar;
        zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzb(zzfdcVar);
        zzcvaVar.zzc(bundle);
        zzcvaVar.zzd(new zzcut(zzfcuVar, zzfcjVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdY)).booleanValue() && (zzfcvVar = this.zze) != null) {
            zzcvaVar.zzf(zzfcvVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdZ)).booleanValue()) {
            zzcvaVar.zzg(this.zzf);
        }
        zzdoq zzdoqVarZzn = this.zza.zzn();
        zzdoqVarZzn.zzd(zzcvaVar.zze());
        zzdoqVarZzn.zze(this.zzc);
        zzcrw zzcrwVarZza = zzdoqVarZzn.zza().zza();
        return zzcrwVarZza.zzc(zzcrwVarZza.zzb());
    }
}
