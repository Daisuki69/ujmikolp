package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdcq implements zzhpx {
    private final zzdbs zza;

    private zzdcq(zzdbs zzdbsVar) {
        this.zza = zzdbsVar;
    }

    public static zzdcq zzc(zzdbs zzdbsVar) {
        return new zzdcq(zzdbsVar);
    }

    @Nullable
    public final zzezy zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzo();
    }
}
