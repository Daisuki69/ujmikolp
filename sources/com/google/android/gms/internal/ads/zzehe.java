package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehe extends zzegz {
    private final zzcgv zza;
    private final zzcva zzb;
    private final zzejp zzc;
    private final zzdbs zzd;
    private final zzehk zze;
    private final zzeee zzf;

    public zzehe(zzcgv zzcgvVar, zzcva zzcvaVar, zzejp zzejpVar, zzdbs zzdbsVar, zzehk zzehkVar, zzeee zzeeeVar) {
        this.zza = zzcgvVar;
        this.zzb = zzcvaVar;
        this.zzc = zzejpVar;
        this.zzd = zzdbsVar;
        this.zze = zzehkVar;
        this.zzf = zzeeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    public final S1.y zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzb(zzfdcVar);
        zzcvaVar.zzc(bundle);
        zzcvaVar.zzd(new zzcut(zzfcuVar, zzfcjVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdZ)).booleanValue()) {
            zzcvaVar.zzg(this.zzf);
        }
        zzdgg zzdggVarZzk = this.zza.zzk();
        zzdggVarZzk.zze(zzcvaVar.zze());
        zzdggVarZzk.zzf(this.zzd);
        zzdggVarZzk.zzd(this.zzc);
        zzcrw zzcrwVarZzb = zzdggVarZzk.zza().zzb();
        return zzcrwVarZzb.zzc(zzcrwVarZzb.zzb());
    }
}
