package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdhr implements zzhpx {
    private final zzhqg zza;

    private zzdhr(zzdhq zzdhqVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdhr zza(zzdhq zzdhqVar, zzhqg zzhqgVar) {
        return new zzdhr(zzdhqVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdht) this.zza).zzb().zza();
    }
}
