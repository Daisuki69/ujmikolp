package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehx implements zzeef {
    private final Context zza;
    private final Executor zzb;
    private final zzdor zzc;

    public zzehx(Context context, Executor executor, zzdor zzdorVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        try {
            zzfdc zzfdcVar = zzfcuVar.zza.zza;
            if (zzfdcVar.zzp.zza == 3) {
                ((zzfea) zzeecVar.zzb).zzx(this.zza, zzfdcVar.zzd, zzfcjVar.zzv.toString(), (zzbpd) zzeecVar.zzc);
            } else {
                ((zzfea) zzeecVar.zzb).zzv(this.zza, zzfdcVar.zzd, zzfcjVar.zzv.toString(), (zzbpd) zzeecVar.zzc);
            }
        } catch (Exception e) {
            String str = zzeecVar.zza;
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzdon zzdonVarZzf = this.zzc.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdoo(new zzehw(this, zzeecVar, zzfcjVar)));
        zzdonVarZzf.zza().zzq(new zzcly((zzfea) zzeecVar.zzb), this.zzb);
        ((zzefo) zzeecVar.zzc).zzc(zzdonVarZzf.zzm());
        return zzdonVarZzf.zzh();
    }
}
