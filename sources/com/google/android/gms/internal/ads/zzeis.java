package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeis implements zzeef {
    private final Context zza;
    private final Executor zzb;
    private final zzdor zzc;

    public zzeis(Context context, Executor executor, zzdor zzdorVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdorVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        try {
            ((zzfea) zzeecVar.zzb).zzl(zzfcuVar.zza.zza.zzd, zzfcjVar.zzv.toString());
        } catch (Exception e) {
            String str = zzeecVar.zza;
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        if (zzfeaVar.zzn()) {
            zze(zzfcuVar, zzfcjVar, zzeecVar);
            return;
        }
        zzeip zzeipVar = new zzeip(this, zzfcuVar, zzfcjVar, zzeecVar);
        zzcxc zzcxcVar = zzeecVar.zzc;
        ((zzefp) zzcxcVar).zzd(zzeipVar);
        Context context = this.zza;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        String string = zzfcjVar.zzv.toString();
        zzfeaVar.zzk(context, zzfdcVar.zzd, null, (zzbvs) zzcxcVar, string);
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzdon zzdonVarZzf = this.zzc.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdoo(new zzeiq(this, zzeecVar, zzfcjVar)));
        zzdonVarZzf.zza().zzq(new zzcly((zzfea) zzeecVar.zzb), this.zzb);
        zzcwz zzcwzVarZzb = zzdonVarZzf.zzb();
        zzcvq zzcvqVarZzc = zzdonVarZzf.zzc();
        ((zzefp) zzeecVar.zzc).zzc(new zzeir(this, zzdonVarZzf.zzi(), zzcvqVarZzc, zzcwzVarZzb, zzdonVarZzf.zzk()));
        return zzdonVarZzf.zzh();
    }

    public final /* synthetic */ Executor zzc() {
        return this.zzb;
    }
}
