package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfal implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzdgh zzd;
    final /* synthetic */ zzfan zze;

    public zzfal(zzfan zzfanVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzdgh zzdghVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzdghVar;
        Objects.requireNonNull(zzfanVar);
        this.zze = zzfanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        zzfib zzfibVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th2);
        }
        zzdgh zzdghVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdghVar.zzb().zzg(th2);
        zzfan zzfanVar = this.zze;
        synchronized (zzfanVar) {
            try {
                zzfanVar.zzi(null);
                zzdghVar.zza().zzdN(zzeVarZzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziV)).booleanValue()) {
                    zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfai
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzdN(zzeVarZzg);
                        }
                    });
                    zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdN(zzeVarZzg);
                        }
                    });
                }
                zzfdz.zza(zzeVarZzg.zza, th2, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                    zzfie zzfieVarZzh = zzfanVar.zzh();
                    zzfhr zzfhrVar = this.zzc;
                    zzfhrVar.zzh(zzeVarZzg);
                    zzfhrVar.zzj(th2);
                    zzfhrVar.zzd(false);
                    zzfieVarZzh.zzb(zzfhrVar.zzm());
                } else {
                    zzfibVar.zzf(zzeVarZzg);
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
        zzfan zzfanVar = this.zze;
        zzdfa zzdfaVar = (zzdfa) obj;
        synchronized (zzfanVar) {
            if (zzdfaVar != null) {
                try {
                    zzdfaVar.zzt();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzfanVar.zzi(null);
            zzbbz zzbbzVar = zzbci.zziV;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                zzczi zzcziVarZzq = zzdfaVar.zzq();
                zzcziVarZzq.zza(zzfanVar.zzf());
                zzcziVarZzq.zzd(zzfanVar.zzg());
            }
            this.zza.zzb(zzdfaVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfak
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzg();
                    }
                });
                zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfah
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzfieVarZzh = zzfanVar.zzh();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzdfaVar.zzr().zzb);
                zzfhrVar.zzi(zzdfaVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzfieVarZzh.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzdfaVar.zzr().zzb);
                zzfibVar.zzg(zzdfaVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
