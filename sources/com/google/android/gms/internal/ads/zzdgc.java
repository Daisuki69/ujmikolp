package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdgc implements zzhpx {
    private final zzdfe zza;

    private zzdgc(zzdfe zzdfeVar) {
        this.zza = zzdfeVar;
    }

    public static zzdgc zzc(zzdfe zzdfeVar) {
        return new zzdgc(zzdfeVar);
    }

    @Nullable
    public final zzcek zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
