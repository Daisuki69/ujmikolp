package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
final class zzeft implements zzdgp {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final S1.y zzc;
    private final zzfcj zzd;
    private final zzcek zze;
    private final zzfdc zzf;
    private final zzbjo zzg;
    private final boolean zzh;
    private final zzecy zzi;
    private final zzdsm zzj;

    public zzeft(Context context, VersionInfoParcel versionInfoParcel, S1.y yVar, zzfcj zzfcjVar, zzcek zzcekVar, zzfdc zzfdcVar, boolean z4, zzbjo zzbjoVar, zzecy zzecyVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = yVar;
        this.zzd = zzfcjVar;
        this.zze = zzcekVar;
        this.zzf = zzfdcVar;
        this.zzg = zzbjoVar;
        this.zzh = z4;
        this.zzi = zzecyVar;
        this.zzj = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z4, Context context, zzcwf zzcwfVar) {
        zzdfb zzdfbVar = (zzdfb) zzgot.zzs(this.zzc);
        zzcek zzcekVar = this.zze;
        zzcekVar.zzag(true);
        boolean z5 = this.zzh;
        boolean zZzc = z5 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzM = com.google.android.gms.ads.internal.util.zzs.zzM(this.zza);
        boolean z8 = z5 && this.zzg.zzd();
        float fZze = z5 ? this.zzg.zze() : 0.0f;
        zzfcj zzfcjVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzM, z8, fZze, -1, z4, zzfcjVar.zzO, false);
        if (zzcwfVar != null) {
            zzcwfVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdge zzdgeVarZzj = zzdfbVar.zzj();
        int i = zzfcjVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfcjVar.zzB;
        zzfco zzfcoVar = zzfcjVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, zzdgeVarZzj, null, zzcekVar, i, versionInfoParcel, str, zzlVar, zzfcoVar.zzb, zzfcoVar.zza, this.zzf.zzg, zzcwfVar, zzfcjVar.zzb() ? this.zzi : null, zzcekVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    @Nullable
    public final zzfcj zzb() {
        return this.zzd;
    }
}
