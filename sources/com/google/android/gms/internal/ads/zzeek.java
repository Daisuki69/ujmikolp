package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeek implements zzedz {
    private final zzcny zza;
    private final Context zzb;
    private final zzdpi zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjo zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjH)).booleanValue();
    private final zzecy zzi;
    private final zzdsg zzj;
    private final zzdsm zzk;

    public zzeek(zzcny zzcnyVar, Context context, Executor executor, zzdpi zzdpiVar, zzfdc zzfdcVar, VersionInfoParcel versionInfoParcel, zzbjo zzbjoVar, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zzb = context;
        this.zza = zzcnyVar;
        this.zze = executor;
        this.zzc = zzdpiVar;
        this.zzd = zzfdcVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbjoVar;
        this.zzi = zzecyVar;
        this.zzj = zzdsgVar;
        this.zzk = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar = zzfcjVar.zzs;
        return (zzfcoVar == null || zzfcoVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final S1.y zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        final zzdpm zzdpmVar = new zzdpm();
        S1.y yVarZza = zzgot.zza(null);
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc(zzfcjVar, zzfcuVar, zzdpmVar, obj);
            }
        };
        Executor executor = this.zze;
        S1.y yVarZzj = zzgot.zzj(yVarZza, zzgobVar, executor);
        yVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdpmVar.zzb();
            }
        }, executor);
        return yVarZzj;
    }

    public final /* synthetic */ S1.y zzc(final zzfcj zzfcjVar, zzfcu zzfcuVar, zzdpm zzdpmVar, Object obj) throws zzcez {
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzj.zze(), zzdru.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdpi zzdpiVar = this.zzc;
        zzfdc zzfdcVar = this.zzd;
        final zzcek zzcekVarZza = zzdpiVar.zza(zzfdcVar.zzf, zzfcjVar, zzfcuVar.zzb.zzb);
        zzcekVarZza.zzaw(zzfcjVar.zzW);
        zzdpmVar.zza(this.zzb, zzcekVarZza.zzE());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzj.zze(), zzdru.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzbzm zzbzmVar = new zzbzm();
        zzcny zzcnyVar = this.zza;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, null);
        VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z4 = this.zzh;
        zzbjo zzbjoVar = this.zzg;
        final zzcnv zzcnvVarZzf = zzcnyVar.zzf(zzcriVar, new zzdfe(new zzeem(versionInfoParcel, zzbzmVar, zzfcjVar, zzcekVarZza, zzfdcVar, z4, zzbjoVar, this.zzi, this.zzk), zzcekVarZza), new zzcnw(zzfcjVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzj.zze(), zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdph zzdphVarZzi = zzcnvVarZzf.zzi();
        zzbjo zzbjoVar2 = true == z4 ? zzbjoVar : null;
        zzdsg zzdsgVar = this.zzj;
        zzdphVarZzi.zzi(zzcekVarZza, false, zzbjoVar2, zzdsgVar.zze());
        zzbzmVar.zzc(zzcnvVarZzf);
        zzcnvVarZzf.zzd().zzq(new zzcwm() { // from class: com.google.android.gms.internal.ads.zzeeg
            @Override // com.google.android.gms.internal.ads.zzcwm
            public final /* synthetic */ void zzdw() {
                zzcek zzcekVar = zzcekVarZza;
                if (zzcekVar.zzP() != null) {
                    zzcekVar.zzP().zzq();
                }
            }
        }, zzbzh.zzg);
        zzfco zzfcoVar = zzfcjVar.zzs;
        String strZza = zzfcoVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && zzcnvVarZzf.zzk().zza(true)) {
            strZza = zzcgb.zza(strZza, zzcgb.zzb(zzfcjVar));
        }
        zzcnvVarZzf.zzi();
        return zzgot.zzk(zzdph.zzj(zzcekVarZza, zzfcoVar.zzb, strZza, zzdsgVar.zze(), zzcnyVar.zzd()), new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzeeh
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcek zzcekVar = zzcekVarZza;
                if (zzfcjVar.zzM) {
                    zzcekVar.zzav();
                }
                zzcnv zzcnvVar = zzcnvVarZzf;
                zzcekVar.zzJ();
                zzcekVar.onPause();
                return zzcnvVar.zzh();
            }
        }, this.zze);
    }
}
