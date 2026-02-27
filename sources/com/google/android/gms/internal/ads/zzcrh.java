package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcrh {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final S1.y zzc;
    private volatile boolean zzd = true;

    public zzcrh(Executor executor, ScheduledExecutorService scheduledExecutorService, S1.y yVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = yVar;
    }

    public final void zza(zzgoq zzgoqVar) {
        zzgot.zzq(this.zzc, new zzcrb(this, zzgoqVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ S1.y zzc(zzgoq zzgoqVar, S1.y yVar, zzcqs zzcqsVar) {
        if (zzcqsVar != null) {
            zzgoqVar.zzb(zzcqsVar);
        }
        return zzgot.zzi(yVar, ((Long) zzbew.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final /* synthetic */ void zze(List list, final zzgoq zzgoqVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgoqVar.zza(new zzdwz(3));
                }
            });
            return;
        }
        S1.y yVarZza = zzgot.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final S1.y yVar = (S1.y) it.next();
            zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzcrd
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ S1.y zza(Object obj) {
                    zzgoqVar.zza((Throwable) obj);
                    return zzgot.zza(null);
                }
            };
            Executor executor = this.zza;
            yVarZza = zzgot.zzj(zzgot.zzh(yVarZza, Throwable.class, zzgobVar, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzcre
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ S1.y zza(Object obj) {
                    return this.zza.zzc(zzgoqVar, yVar, (zzcqs) obj);
                }
            }, executor);
        }
        zzgot.zzq(yVarZza, new zzcrc(this, zzgoqVar), this.zza);
    }

    public final /* synthetic */ void zzf() {
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
