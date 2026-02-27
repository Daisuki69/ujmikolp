package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqs implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeqs(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeqs zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqs(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb(((zzerv) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzno)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
