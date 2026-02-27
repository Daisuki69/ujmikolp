package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetb implements zzeup {
    private final zzeup zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzetb(zzeup zzeupVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeupVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        S1.y yVarZza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcC)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            yVarZza = zzgot.zzi(yVarZza, j, timeUnit, this.zzc);
        }
        return zzgot.zzh(yVarZza, Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzeta
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzbzh.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return this.zza.zzb();
    }

    public final /* synthetic */ S1.y zzc(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcA)).booleanValue()) {
            zzeup zzeupVar = this.zza;
            zzbyv zzbyvVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
            int iZzb = zzeupVar.zzb();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 22);
            sb2.append("OptionalSignalTimeout:");
            sb2.append(iZzb);
            zzbyvVarZzh.zzg(th2, sb2.toString());
        }
        return zzgot.zza(null);
    }
}
