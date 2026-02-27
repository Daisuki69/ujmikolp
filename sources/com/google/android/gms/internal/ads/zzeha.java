package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeha extends zzegz {
    private final zzcgv zza;
    private final zzcva zzb;
    private final zzdbs zzc;
    private final zzehk zzd;
    private final zzeee zze;

    public zzeha(zzcgv zzcgvVar, zzcva zzcvaVar, zzdbs zzdbsVar, zzehk zzehkVar, zzeee zzeeeVar) {
        this.zza = zzcgvVar;
        this.zzb = zzcvaVar;
        this.zzc = zzdbsVar;
        this.zzd = zzehkVar;
        this.zze = zzeeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    public final S1.y zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzb(zzfdcVar);
        zzcvaVar.zzc(bundle);
        zzcvaVar.zzd(new zzcut(zzfcuVar, zzfcjVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdZ)).booleanValue()) {
            zzcvaVar.zzg(this.zze);
        }
        zzcnx zzcnxVarZzi = this.zza.zzi();
        zzcnxVarZzi.zzd(zzcvaVar.zze());
        zzcnxVarZzi.zze(this.zzc);
        zzcrw zzcrwVarZza = zzcnxVarZzi.zza().zza();
        return zzcrwVarZza.zzc(zzcrwVarZza.zzb());
    }
}
