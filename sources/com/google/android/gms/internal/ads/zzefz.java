package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefz implements zzeef {
    private final Context zza;
    private final zzdgh zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzefz(Context context, VersionInfoParcel versionInfoParcel, zzdgh zzdghVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdghVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        String string = zzfcjVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfcjVar.zzs);
        zzfeaVar.zzh(this.zza, zzfdcVar.zzd, string, strZzm, (zzbpd) zzeecVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzdfb zzdfbVarZzd = this.zzb.zzd(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdfe(new zzefy(this, zzeecVar, zzfcjVar), null));
        zzdfbVarZzd.zza().zzq(new zzcly((zzfea) zzeecVar.zzb), this.zzd);
        ((zzefo) zzeecVar.zzc).zzc(zzdfbVarZzd.zzf());
        return zzdfbVarZzd.zzh();
    }

    public final /* synthetic */ VersionInfoParcel zzc() {
        return this.zzc;
    }
}
