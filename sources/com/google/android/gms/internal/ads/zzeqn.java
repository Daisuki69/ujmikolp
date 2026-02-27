package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqn implements zzhpx {
    private final zzhqg zza;

    private zzeqn(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzeqn zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqn(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgke zzgkeVarZzh;
        zzepf zzepfVarZzc = zzeph.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeB)).booleanValue()) {
            zzgkeVarZzh = zzgke.zzi(new zzetb(zzepfVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeC)).intValue(), scheduledExecutorService));
        } else {
            zzgkeVarZzh = zzgke.zzh();
        }
        zzhqf.zzb(zzgkeVarZzh);
        return zzgkeVarZzh;
    }
}
