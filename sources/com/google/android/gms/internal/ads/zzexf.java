package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzexf implements zzeup {
    private final zzbyv zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgpd zzd;
    private final int zze;
    private final int zzf;

    public zzexf(zzbyv zzbyvVar, boolean z4, zzbyl zzbylVar, zzgpd zzgpdVar, String str, ScheduledExecutorService scheduledExecutorService, int i, int i4) {
        this.zza = zzbyvVar;
        this.zzb = z4;
        this.zzd = zzgpdVar;
        this.zzc = scheduledExecutorService;
        this.zze = i;
        this.zzf = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhu)).booleanValue() && this.zzb) {
            return zzgot.zza(new zzexg(null));
        }
        if (this.zzf == 2) {
            return zzgot.zza(new zzexg(null));
        }
        if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhw)).split(",")).contains(String.valueOf(this.zze))) {
            return zzgot.zza(new zzexg(null));
        }
        S1.y yVarZza = zzgot.zza(null);
        zzgpd zzgpdVar = this.zzd;
        return zzgot.zzg(zzgot.zzi(zzgot.zzk(yVarZza, zzexe.zza, zzgpdVar), ((Long) zzbex.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzexd
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((Exception) obj);
            }
        }, zzgpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 50;
    }

    public final /* synthetic */ zzexg zzc(Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new zzexg(null);
    }
}
