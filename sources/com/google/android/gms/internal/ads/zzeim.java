package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeim implements zzedz {
    private final Context zza;
    private final zzdpi zzb;
    private final zzdor zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjo zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjH)).booleanValue();
    private final zzecy zzi;
    private final zzdsg zzj;
    private final zzdsm zzk;

    public zzeim(Context context, VersionInfoParcel versionInfoParcel, zzfdc zzfdcVar, Executor executor, zzdor zzdorVar, zzdpi zzdpiVar, zzbjo zzbjoVar, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzd = zzfdcVar;
        this.zzc = zzdorVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdpiVar;
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
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzeil
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc(zzfcjVar, zzfcuVar, zzdpmVar, obj);
            }
        };
        Executor executor = this.zze;
        S1.y yVarZzj = zzgot.zzj(yVarZza, zzgobVar, executor);
        yVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeif
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
        zzdpi zzdpiVar = this.zzb;
        zzfdc zzfdcVar = this.zzd;
        final zzcek zzcekVarZza = zzdpiVar.zza(zzfdcVar.zzf, zzfcjVar, zzfcuVar.zzb.zzb);
        zzcekVarZza.zzaw(zzfcjVar.zzW);
        Context context = this.zza;
        zzdpmVar.zza(context, zzcekVarZza.zzE());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzj.zze(), zzdru.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzbzm zzbzmVar = new zzbzm();
        zzdor zzdorVar = this.zzc;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, null);
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbjo zzbjoVar = this.zzg;
        boolean z4 = this.zzh;
        zzecy zzecyVar = this.zzi;
        zzdsg zzdsgVar = this.zzj;
        final zzdon zzdonVarZzf = zzdorVar.zzf(zzcriVar, new zzdoo(new zzeii(context, zzdpiVar, zzfdcVar, versionInfoParcel, zzfcjVar, zzbzmVar, zzcekVarZza, zzbjoVar, z4, zzecyVar, zzdsgVar, this.zzk), zzcekVarZza));
        zzbzmVar.zzc(zzdonVarZzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(zzdsgVar.zze(), zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzbke.zzb(zzcekVarZza, zzdonVarZzf.zzk());
        zzdonVarZzf.zzd().zzq(new zzcwm() { // from class: com.google.android.gms.internal.ads.zzeij
            @Override // com.google.android.gms.internal.ads.zzcwm
            public final /* synthetic */ void zzdw() {
                zzcek zzcekVar = zzcekVarZza;
                if (zzcekVar.zzP() != null) {
                    zzcekVar.zzP().zzq();
                }
            }
        }, zzbzh.zzg);
        zzdph zzdphVarZzl = zzdonVarZzf.zzl();
        if (true != z4) {
            zzbjoVar = null;
        }
        zzdphVarZzl.zzi(zzcekVarZza, true, zzbjoVar, zzdsgVar.zze());
        zzfco zzfcoVar = zzfcjVar.zzs;
        String strZza = zzfcoVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && zzdonVarZzf.zzo().zza(true)) {
            strZza = zzcgb.zza(strZza, zzcgb.zzb(zzfcjVar));
        }
        zzdonVarZzf.zzl();
        return zzgot.zzk(zzdph.zzj(zzcekVarZza, zzfcoVar.zzb, strZza, zzdsgVar.zze(), zzdorVar.zzd()), new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcek zzcekVar = zzcekVarZza;
                if (zzfcjVar.zzM) {
                    zzcekVar.zzav();
                }
                zzdon zzdonVar = zzdonVarZzf;
                zzcekVar.zzJ();
                zzcekVar.onPause();
                return zzdonVar.zzh();
            }
        }, this.zze);
    }
}
