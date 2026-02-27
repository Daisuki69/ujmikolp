package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdta implements zzhpx {
    private final zzhqg zza;

    private zzdta(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdta zza(zzhqg zzhqgVar) {
        return new zzdta(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsz((Clock) this.zza.zzb());
    }
}
