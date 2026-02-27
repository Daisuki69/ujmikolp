package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcoi implements zzhpx {
    private final zzcoh zza;

    private zzcoi(zzcoh zzcohVar) {
        this.zza = zzcohVar;
    }

    public static zzcoi zzc(zzcoh zzcohVar) {
        return new zzcoi(zzcohVar);
    }

    @Nullable
    public final ViewGroup zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
