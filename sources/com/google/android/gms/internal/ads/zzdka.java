package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdka implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdka(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdka zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdka(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjz(((zzdhv) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}
