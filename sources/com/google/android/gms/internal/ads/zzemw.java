package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemw implements zzeup {
    private final S1.y zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzemw(S1.y yVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = yVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        S1.y yVar = this.zza;
        zzemv zzemvVar = zzemv.zza;
        Executor executor = this.zzb;
        S1.y yVarZzj = zzgot.zzj(yVar, zzemvVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznn)).intValue() > 0) {
            yVarZzj = zzgot.zzi(yVarZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgot.zzh(yVarZzj, Throwable.class, zzemu.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 6;
    }
}
