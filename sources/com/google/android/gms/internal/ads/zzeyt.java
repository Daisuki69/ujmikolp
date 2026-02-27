package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzeyt implements zzgoq {
    final /* synthetic */ zzfib zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzcpp zzc;
    final /* synthetic */ zzeyx zzd;

    public zzeyt(zzeyx zzeyxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzcpp zzcppVar) {
        this.zza = zzfibVar;
        this.zzb = zzfhrVar;
        this.zzc = zzcppVar;
        Objects.requireNonNull(zzeyxVar);
        this.zzd = zzeyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        zzfib zzfibVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th2);
        }
        zzeyx zzeyxVar = this.zzd;
        synchronized (zzeyxVar) {
            try {
                zzcpp zzcppVar = this.zzc;
                com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzcppVar.zzc().zzg(th2);
                zzeyxVar.zzs(zzeVarZzg);
                zzcppVar.zzb().zzdN(zzeVarZzg);
                zzfdz.zza(zzeVarZzg.zza, th2, "BannerAdLoader.onFailure");
                if (zzeyxVar.zzr()) {
                    zzeyxVar.zzn();
                    zzeyxVar.zzo().zzd(zzeyxVar.zzq().zzc());
                }
                if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zza) == null) {
                    zzfie zzfieVarZzp = zzeyxVar.zzp();
                    zzfhr zzfhrVar = this.zzb;
                    zzfhrVar.zzh(zzeVarZzg);
                    zzfhrVar.zzj(th2);
                    zzfhrVar.zzd(false);
                    zzfieVarZzp.zzb(zzfhrVar.zzm());
                } else {
                    zzfibVar.zzf(zzeVarZzg);
                    zzfhr zzfhrVar2 = this.zzb;
                    zzfhrVar2.zzj(th2);
                    zzfhrVar2.zzd(false);
                    zzfibVar.zza(zzfhrVar2);
                    zzfibVar.zzh();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfib zzfibVar;
        zzeyx zzeyxVar = this.zzd;
        zzcok zzcokVar = (zzcok) obj;
        synchronized (zzeyxVar) {
            if (zzcokVar != null) {
                try {
                    zzcokVar.zzt();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zzeyxVar.zzr()) {
                zzeyxVar.zzc();
            }
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zza) == null) {
                zzfie zzfieVarZzp = zzeyxVar.zzp();
                zzfhr zzfhrVar = this.zzb;
                zzfhrVar.zzg(zzcokVar.zzr().zzb);
                zzfhrVar.zzi(zzcokVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzfieVarZzp.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzcokVar.zzr().zzb);
                zzfibVar.zzg(zzcokVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzb;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
