package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemf implements zzely {
    private final zzfdb zza;
    private final zzcgv zzb;
    private final Context zzc;
    private final zzelv zzd;
    private final zzfie zze;

    @Nullable
    private zzcrh zzf;

    public zzemf(zzcgv zzcgvVar, Context context, zzelv zzelvVar, zzfdb zzfdbVar) {
        this.zzb = zzcgvVar;
        this.zzc = context;
        this.zzd = zzelvVar;
        this.zza = zzfdbVar;
        this.zze = zzcgvVar.zzv();
        zzfdbVar.zzt(zzelvVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelw zzelwVar, zzelx zzelxVar) throws RemoteException {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzL(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeme
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        boolean z4 = zzmVar.zzf;
        zzfdz.zzb(context, z4);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && z4) {
            this.zzb.zzu().zzc(true);
        }
        int i6 = ((zzelz) zzelwVar).zza;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        String strZza = zzdru.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdrw.zza(new Pair(strZza, lValueOf), new Pair(zzdru.DYNAMITE_ENTER.zza(), lValueOf));
        zzfdb zzfdbVar = this.zza;
        zzfdbVar.zza(zzmVar);
        zzfdbVar.zzv(bundleZza);
        zzfdbVar.zzl(i6);
        zzfdc zzfdcVarZzz = zzfdbVar.zzz();
        zzfhr zzfhrVarB = s.b(context, zzfia.zzg(zzfdcVarZzz), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzco zzcoVar = zzfdcVarZzz.zzo;
        if (zzcoVar != null) {
            this.zzd.zzc().zzn(zzcoVar);
        }
        zzcgv zzcgvVar = this.zzb;
        zzdhc zzdhcVarZzm = zzcgvVar.zzm();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(context);
        zzcvaVar.zzb(zzfdcVarZzz);
        zzdhcVarZzm.zzf(zzcvaVar.zze());
        zzdbr zzdbrVar = new zzdbr();
        zzelv zzelvVar = this.zzd;
        zzdbrVar.zze(zzelvVar.zzc(), zzcgvVar.zzb());
        zzdhcVarZzm.zzg(zzdbrVar.zzn());
        zzdhcVarZzm.zze(zzelvVar.zzb());
        zzfib zzfibVarZzc = null;
        zzdhcVarZzm.zzd(new zzcoh(null));
        zzdhd zzdhdVarZza = zzdhcVarZzm.zza();
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzfibVarZzc = zzdhdVarZza.zzc();
            zzfibVarZzc.zzi(8);
            zzfibVarZzc.zzc(zzmVar.zzp);
            zzfibVarZzc.zzd(zzmVar.zzm);
        }
        zzfib zzfibVar = zzfibVarZzc;
        zzcgvVar.zzt().zza(1);
        zzgpd zzgpdVarZzc = zzfgc.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzc = zzcgvVar.zzc();
        zzcrw zzcrwVarZza = zzdhdVarZza.zza();
        zzcrh zzcrhVar = new zzcrh(zzgpdVarZzc, scheduledExecutorServiceZzc, zzcrwVarZza.zzc(zzcrwVarZza.zzb()));
        this.zzf = zzcrhVar;
        zzcrhVar.zza(new zzemc(this, zzelxVar, zzfibVar, zzfhrVarB, zzdhdVarZza));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        zzcrh zzcrhVar = this.zzf;
        return zzcrhVar != null && zzcrhVar.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zze().zzdN(zzfee.zzd(4, null, null));
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zze().zzdN(zzfee.zzd(6, null, null));
    }

    public final /* synthetic */ zzcgv zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzelv zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfie zzg() {
        return this.zze;
    }
}
