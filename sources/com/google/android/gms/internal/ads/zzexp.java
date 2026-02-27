package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzexp implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzexq zzd;
    final /* synthetic */ zzext zze;

    public zzexp(zzext zzextVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzexq zzexqVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzexqVar;
        Objects.requireNonNull(zzextVar);
        this.zze = zzextVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        zzfib zzfibVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th2);
        }
        zzext zzextVar = this.zze;
        zzcnu zzcnuVar = (zzcnu) zzextVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcnuVar == null ? zzfee.zzb(th2, null) : zzcnuVar.zza().zzg(th2);
        synchronized (zzextVar) {
            try {
                zzextVar.zzl(null);
                if (zzcnuVar != null) {
                    zzcnuVar.zze().zzdN(zzeVarZzb);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziU)).booleanValue()) {
                        zzextVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexo
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze.zzi().zzdN(zzeVarZzb);
                            }
                        });
                    }
                } else {
                    zzextVar.zzi().zzdN(zzeVarZzb);
                    ((zzcnu) zzextVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
                }
                zzfdz.zza(zzeVarZzb.zza, th2, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                    zzfie zzfieVarZzk = zzextVar.zzk();
                    zzfhr zzfhrVar = this.zzc;
                    zzfhrVar.zzh(zzeVarZzb);
                    zzfhrVar.zzj(th2);
                    zzfhrVar.zzd(false);
                    zzfieVarZzk.zzb(zzfhrVar.zzm());
                } else {
                    zzfibVar.zzf(zzeVarZzb);
                    zzfhr zzfhrVar2 = this.zzc;
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
        zzext zzextVar = this.zze;
        zzcqs zzcqsVar = (zzcqs) obj;
        synchronized (zzextVar) {
            if (zzcqsVar != null) {
                try {
                    zzcqsVar.zzt();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzextVar.zzl(null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziU)).booleanValue()) {
                zzcqsVar.zzq().zzc(zzextVar.zzi());
            }
            this.zza.zzb(zzcqsVar);
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzfieVarZzk = zzextVar.zzk();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzcqsVar.zzr().zzb);
                zzfhrVar.zzi(zzcqsVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzfieVarZzk.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzcqsVar.zzr().zzb);
                zzfibVar.zzg(zzcqsVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
