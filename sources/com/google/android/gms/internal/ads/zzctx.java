package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzctx implements zzcyy, zzdel {
    private final Context zza;
    private final zzfdc zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdux zze;
    private final zzfie zzf;
    private final zzdvs zzg;

    public zzctx(Context context, zzfdc zzfdcVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdux zzduxVar, zzfie zzfieVar, zzdvs zzdvsVar) {
        this.zza = context;
        this.zzb = zzfdcVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzduxVar;
        this.zzf = zzfieVar;
        this.zzg = zzdvsVar;
    }

    private final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzew)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfdc zzfdcVar = this.zzb;
            zzfie zzfieVar = this.zzf;
            zzdvs zzdvsVar = this.zzg;
            com.google.android.gms.ads.internal.zzt.zzl().zzb(context, versionInfoParcel, zzfdcVar.zzg, zzgVar.zzi(), zzfieVar, zzdvsVar.zzs());
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzex)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(@Nullable String str) {
    }
}
