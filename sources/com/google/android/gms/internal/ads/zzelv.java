package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelv {
    private final zzdje zza;
    private final zzeli zzb;
    private final zzcvv zzc;

    public zzelv(zzdje zzdjeVar, zzdsm zzdsmVar) {
        this.zza = zzdjeVar;
        final zzeli zzeliVar = new zzeli(zzdsmVar);
        this.zzb = zzeliVar;
        final zzbmf zzbmfVarZze = zzdjeVar.zze();
        this.zzc = new zzcvv() { // from class: com.google.android.gms.internal.ads.zzelu
            @Override // com.google.android.gms.internal.ads.zzcvv
            public final /* synthetic */ void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeliVar.zzdN(zzeVar);
                zzbmf zzbmfVar = zzbmfVarZze;
                if (zzbmfVar != null) {
                    try {
                        zzbmfVar.zzg(zzeVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbmfVar != null) {
                    try {
                        zzbmfVar.zzf(zzeVar.zza);
                    } catch (RemoteException e7) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e7);
                    }
                }
            }
        };
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzb.zzl(zzbkVar);
    }

    public final zzdgy zzb() {
        return new zzdgy(this.zza, this.zzb.zzi());
    }

    public final zzeli zzc() {
        return this.zzb;
    }

    public final zzcxg zzd() {
        return this.zzb;
    }

    public final zzcvv zze() {
        return this.zzc;
    }
}
