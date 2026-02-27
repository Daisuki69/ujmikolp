package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeez implements zzedz {
    private final zzcpp zza;
    private final Context zzb;
    private final zzdpi zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final zzggr zzf;
    private final zzdsg zzg;

    public zzeez(zzcpp zzcppVar, Context context, Executor executor, zzdpi zzdpiVar, zzfdc zzfdcVar, zzggr zzggrVar, zzdsg zzdsgVar) {
        this.zzb = context;
        this.zza = zzcppVar;
        this.zze = executor;
        this.zzc = zzdpiVar;
        this.zzd = zzfdcVar;
        this.zzf = zzggrVar;
        this.zzg = zzdsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar = zzfcjVar.zzs;
        return (zzfcoVar == null || zzfcoVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final S1.y zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc(zzfcuVar, zzfcjVar, obj);
            }
        }, this.zze);
    }

    public final /* synthetic */ S1.y zzc(zzfcu zzfcuVar, zzfcj zzfcjVar, Object obj) throws zzcez {
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzg.zze(), zzdru.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVarZza = zzfdi.zza(context, zzfcjVar.zzu);
        final zzcek zzcekVarZza = this.zzc.zza(zzrVarZza, zzfcjVar, zzfcuVar.zzb.zzb);
        zzcekVarZza.zzaw(zzfcjVar.zzW);
        View viewZza = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) ? zzcqe.zza(context, zzcekVarZza.zzE(), zzfcjVar) : new zzdpl(context, zzcekVarZza.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfcjVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzg.zze(), zzdru.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcpp zzcppVar = this.zza;
        final zzcol zzcolVarZzf = zzcppVar.zzf(new zzcri(zzfcuVar, zzfcjVar, null), new zzcor(viewZza, zzcekVarZza, new zzcqq() { // from class: com.google.android.gms.internal.ads.zzeeu
            @Override // com.google.android.gms.internal.ads.zzcqq
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzcekVarZza.zzh();
            }
        }, zzfdi.zzb(zzrVarZza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzg.zze(), zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdph zzdphVarZzj = zzcolVarZzf.zzj();
        zzdsg zzdsgVar = this.zzg;
        zzdphVarZzj.zzi(zzcekVarZza, false, null, zzdsgVar.zze());
        zzcwk zzcwkVarZzd = zzcolVarZzf.zzd();
        zzcwm zzcwmVar = new zzcwm() { // from class: com.google.android.gms.internal.ads.zzeev
            @Override // com.google.android.gms.internal.ads.zzcwm
            public final /* synthetic */ void zzdw() {
                zzcek zzcekVar = zzcekVarZza;
                if (zzcekVar.zzP() != null) {
                    zzcekVar.zzP().zzq();
                }
            }
        };
        zzgpd zzgpdVar = zzbzh.zzg;
        zzcwkVarZzd.zzq(zzcwmVar, zzgpdVar);
        zzfco zzfcoVar = zzfcjVar.zzs;
        String strZza = zzfcoVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && zzcolVarZzf.zzm().zza(true)) {
            strZza = zzcgb.zza(strZza, zzcgb.zzb(zzfcjVar));
        }
        zzcolVarZzf.zzj();
        S1.y yVarZzj = zzdph.zzj(zzcekVarZza, zzfcoVar.zzb, strZza, zzdsgVar.zze(), zzcppVar.zze());
        if (zzfcjVar.zzM) {
            yVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeet
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcekVarZza.zzav();
                }
            }, this.zze);
        }
        yVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeew
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzcekVarZza);
            }
        }, this.zze);
        return zzgot.zzk(yVarZzj, new zzggr() { // from class: com.google.android.gms.internal.ads.zzeex
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcolVarZzf.zzi();
            }
        }, zzgpdVar);
    }

    public final /* synthetic */ void zzd(zzcek zzcekVar) {
        zzcekVar.zzJ();
        zzfdc zzfdcVar = this.zzd;
        zzcfq zzcfqVarZzh = zzcekVar.zzh();
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzfdcVar.zza;
        if (zzgaVar != null && zzcfqVarZzh != null) {
            zzcfqVarZzh.zzc(zzgaVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbw)).booleanValue() || zzcekVar.isAttachedToWindow()) {
            return;
        }
        zzcekVar.onPause();
        zzcekVar.zzaG(true);
    }
}
