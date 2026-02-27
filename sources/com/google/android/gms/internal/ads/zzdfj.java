package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdfj implements zzhpx {
    private final zzdfe zza;

    private zzdfj(zzdfe zzdfeVar) {
        this.zza = zzdfeVar;
    }

    public static zzdfj zzc(zzdfe zzdfeVar) {
        return new zzdfj(zzdfeVar);
    }

    @Nullable
    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
