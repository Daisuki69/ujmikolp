package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyb {
    private final ScheduledExecutorService zza;
    private final zzgpd zzb;
    private final zzgpd zzc;
    private final zzdyx zzd;
    private final zzhpr zze;

    public zzdyb(ScheduledExecutorService scheduledExecutorService, zzgpd zzgpdVar, zzgpd zzgpdVar2, zzdyx zzdyxVar, zzhpr zzhprVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgpdVar;
        this.zzc = zzgpdVar2;
        this.zzd = zzdyxVar;
        this.zze = zzhprVar;
    }

    public final S1.y zza(final zzbuv zzbuvVar) {
        S1.y yVarZzc;
        String str = zzbuvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzG(str)) {
            yVarZzc = zzgot.zzc(new zzdzk(1));
        } else {
            yVarZzc = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhU)).booleanValue() || ((Boolean) zzbet.zza.zze()).booleanValue()) ? this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxy
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzbuvVar);
                }
            }) : this.zzd.zza(zzbuvVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgol) zzgot.zzh((zzgol) zzgot.zzi(zzgol.zzw(yVarZzc), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdya
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzb(zzbuvVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ S1.y zzb(final zzbuv zzbuvVar, int i, Throwable th2) {
        Bundle bundle;
        if (zzbuvVar != null && (bundle = zzbuvVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgot.zzj(((zzeap) this.zze.zzb()).zzj(zzbuvVar, i), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return zzgot.zza(new zzdzl((InputStream) obj, zzbuvVar));
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzdzl zzc(zzbuv zzbuvVar) {
        return (zzdzl) this.zzd.zza(zzbuvVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS);
    }
}
