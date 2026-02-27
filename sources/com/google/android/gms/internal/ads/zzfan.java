package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfan implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzeli zzd;
    private final zzfbn zze;

    @Nullable
    private zzbdd zzf;
    private final zzfie zzg;
    private final zzfdb zzh;
    private S1.y zzi;

    public zzfan(Context context, Executor executor, zzcgv zzcgvVar, zzeli zzeliVar, zzfbn zzfbnVar, zzfdb zzfdbVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zzd = zzeliVar;
        this.zzh = zzfdbVar;
        this.zze = zzfbnVar;
        this.zzg = zzcgvVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelw zzelwVar, zzelx zzelxVar) {
        zzdgh zzdghVarZza;
        zzfib zzfibVarZzc;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfam
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzu().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfag) zzelwVar).zza;
        Bundle bundleZza = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfdb zzfdbVar = this.zzh;
        zzfdbVar.zzg(str);
        zzfdbVar.zzc(zzrVar);
        zzfdbVar.zza(zzmVar);
        zzfdbVar.zzv(bundleZza);
        Context context = this.zza;
        zzfdc zzfdcVarZzz = zzfdbVar.zzz();
        zzfhr zzfhrVarB = s.b(context, zzfia.zzg(zzfdcVarZzz), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziV)).booleanValue()) {
            zzdgg zzdggVarZzk = this.zzc.zzk();
            zzcva zzcvaVar = new zzcva();
            zzcvaVar.zza(context);
            zzcvaVar.zzb(zzfdcVarZzz);
            zzdggVarZzk.zze(zzcvaVar.zze());
            zzdbr zzdbrVar = new zzdbr();
            zzeli zzeliVar = this.zzd;
            Executor executor = this.zzb;
            zzdbrVar.zzm(zzeliVar, executor);
            zzdbrVar.zze(zzeliVar, executor);
            zzdggVarZzk.zzf(zzdbrVar.zzn());
            zzdggVarZzk.zzd(new zzejp(this.zzf));
            zzdghVarZza = zzdggVarZzk.zzh();
        } else {
            zzdbr zzdbrVar2 = new zzdbr();
            zzfbn zzfbnVar = this.zze;
            if (zzfbnVar != null) {
                Executor executor2 = this.zzb;
                zzdbrVar2.zza(zzfbnVar, executor2);
                zzdbrVar2.zzb(zzfbnVar, executor2);
                zzdbrVar2.zzc(zzfbnVar, executor2);
            }
            zzdgg zzdggVarZzk2 = this.zzc.zzk();
            zzcva zzcvaVar2 = new zzcva();
            zzcvaVar2.zza(context);
            zzcvaVar2.zzb(zzfdcVarZzz);
            zzdggVarZzk2.zze(zzcvaVar2.zze());
            zzeli zzeliVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdbrVar2.zzm(zzeliVar2, executor3);
            zzdbrVar2.zza(zzeliVar2, executor3);
            zzdbrVar2.zzb(zzeliVar2, executor3);
            zzdbrVar2.zzc(zzeliVar2, executor3);
            zzdbrVar2.zzf(zzeliVar2, executor3);
            zzdbrVar2.zzg(zzeliVar2, executor3);
            zzdbrVar2.zze(zzeliVar2, executor3);
            zzdbrVar2.zzk(zzeliVar2, executor3);
            zzdbrVar2.zzd(zzeliVar2, executor3);
            zzdggVarZzk2.zzf(zzdbrVar2.zzn());
            zzdggVarZzk2.zzd(new zzejp(this.zzf));
            zzdghVarZza = zzdggVarZzk2.zzh();
        }
        zzdgh zzdghVar = zzdghVarZza;
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzfibVarZzc = zzdghVar.zzc();
            zzfibVarZzc.zzi(4);
            zzfibVarZzc.zzc(zzmVar.zzp);
            zzfibVarZzc.zzd(zzmVar.zzm);
        } else {
            zzfibVarZzc = null;
        }
        zzfib zzfibVar = zzfibVarZzc;
        zzcrw zzcrwVarZzb = zzdghVar.zzb();
        S1.y yVarZzc = zzcrwVarZzb.zzc(zzcrwVarZzb.zzb());
        this.zzi = yVarZzc;
        zzgot.zzq(yVarZzc, new zzfal(this, zzelxVar, zzfibVar, zzfhrVarB, zzdghVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        S1.y yVar = this.zzi;
        return (yVar == null || yVar.isDone()) ? false : true;
    }

    public final void zzc(zzbdd zzbddVar) {
        this.zzf = zzbddVar;
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzeli zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfbn zzg() {
        return this.zze;
    }

    public final /* synthetic */ zzfie zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzi(S1.y yVar) {
        this.zzi = null;
    }
}
