package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefv implements zzedz {
    private final Context zza;
    private final zzdpi zzb;
    private final zzdgh zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjo zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjH)).booleanValue();
    private final zzecy zzi;
    private final zzdsg zzj;
    private final zzdsm zzk;

    public zzefv(Context context, VersionInfoParcel versionInfoParcel, zzfdc zzfdcVar, Executor executor, zzdgh zzdghVar, zzdpi zzdpiVar, zzbjo zzbjoVar, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzd = zzfdcVar;
        this.zzc = zzdghVar;
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
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc(zzfcjVar, zzfcuVar, zzdpmVar, obj);
            }
        };
        Executor executor = this.zze;
        S1.y yVarZzj = zzgot.zzj(yVarZza, zzgobVar, executor);
        yVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefu
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
        zzdgh zzdghVar = this.zzc;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, null);
        VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z4 = this.zzh;
        zzbjo zzbjoVar = this.zzg;
        final zzdfb zzdfbVarZzd = zzdghVar.zzd(zzcriVar, new zzdfe(new zzeft(context, versionInfoParcel, zzbzmVar, zzfcjVar, zzcekVarZza, zzfdcVar, z4, zzbjoVar, this.zzi, this.zzk), zzcekVarZza));
        zzbzmVar.zzc(zzdfbVarZzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzj.zze(), zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdfbVarZzd.zzd().zzq(new zzcwm() { // from class: com.google.android.gms.internal.ads.zzefq
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && zzdfbVarZzd.zzl().zza(true)) {
            strZza = zzcgb.zza(strZza, zzcgb.zzb(zzfcjVar));
        }
        zzdph zzdphVarZzk = zzdfbVarZzd.zzk();
        zzbjo zzbjoVar2 = true != z4 ? null : zzbjoVar;
        zzdsg zzdsgVar = this.zzj;
        zzdphVarZzk.zzi(zzcekVarZza, true, zzbjoVar2, zzdsgVar.zze());
        zzdfbVarZzd.zzk();
        return zzgot.zzk(zzdph.zzj(zzcekVarZza, zzfcoVar.zzb, strZza, zzdsgVar.zze(), zzdghVar.zzc()), new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcek zzcekVar = zzcekVarZza;
                if (zzfcjVar.zzM) {
                    zzcekVar.zzav();
                }
                zzdfb zzdfbVar = zzdfbVarZzd;
                zzcekVar.zzJ();
                zzcekVar.onPause();
                return zzdfbVar.zzh();
            }
        }, this.zze);
    }
}
