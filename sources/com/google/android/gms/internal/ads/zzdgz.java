package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdgz implements zzhpx {
    private final zzdgy zza;

    private zzdgz(zzdgy zzdgyVar) {
        this.zza = zzdgyVar;
    }

    public static zzdgz zzc(zzdgy zzdgyVar) {
        return new zzdgz(zzdgyVar);
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzbk zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
