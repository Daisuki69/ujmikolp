package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpi {
    private final Context zza;
    private final zzauu zzb;
    private final zzbdp zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbbh zzf;
    private final zzcyt zzg;
    private final zzecy zzh;
    private final zzfdg zzi;
    private final zzdsm zzj;
    private final zzcgj zzk;

    public zzdpi(zzcfa zzcfaVar, Context context, zzauu zzauuVar, zzbdp zzbdpVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbh zzbbhVar, zzcyt zzcytVar, zzecy zzecyVar, zzfdg zzfdgVar, zzdsm zzdsmVar, zzcgj zzcgjVar) {
        this.zza = context;
        this.zzb = zzauuVar;
        this.zzc = zzbdpVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbbhVar;
        this.zzg = zzcytVar;
        this.zzh = zzecyVar;
        this.zzi = zzfdgVar;
        this.zzj = zzdsmVar;
        this.zzk = zzcgjVar;
    }

    public final zzcek zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfcj zzfcjVar, zzfcm zzfcmVar) throws zzcez {
        zzcgt zzcgtVarZza = zzcgt.zza(zzrVar);
        String str = zzrVar.zza;
        zzdox zzdoxVar = new zzdox(this);
        zzauu zzauuVar = this.zzb;
        zzecy zzecyVar = this.zzh;
        zzcek zzcekVarZza = zzcfa.zza(this.zza, zzcgtVarZza, str, false, false, zzauuVar, this.zzc, this.zzd, null, zzdoxVar, this.zze, this.zzf, zzfcjVar, zzfcmVar, zzecyVar, this.zzi, this.zzj);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoF)).booleanValue()) {
            this.zzk.zze(zzcekVarZza.zzD());
        }
        return zzcekVarZza;
    }

    public final /* synthetic */ zzcyt zzb() {
        return this.zzg;
    }
}
