package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevy implements zzeup {
    private final zzbyv zza;
    private final ScheduledExecutorService zzb;
    private final zzgpd zzc;

    public zzevy(String str, zzbak zzbakVar, zzbyv zzbyvVar, ScheduledExecutorService scheduledExecutorService, zzgpd zzgpdVar) {
        this.zza = zzbyvVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdo)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdt)).booleanValue()) {
                S1.y yVarZza = zzftu.zza(Tasks.forResult(null), null);
                zzgpd zzgpdVar = this.zzc;
                S1.y yVarZzj = zzgot.zzj(yVarZza, zzevx.zza, zzgpdVar);
                if (((Boolean) zzbdv.zza.zze()).booleanValue()) {
                    yVarZzj = zzgot.zzi(yVarZzj, ((Long) zzbdv.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgot.zzg(yVarZzj, Exception.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzevw
                    @Override // com.google.android.gms.internal.ads.zzggr
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzgpdVar);
            }
        }
        return zzgot.zza(new zzevz(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 43;
    }

    public final /* synthetic */ zzevz zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzevz(null, -1);
    }
}
