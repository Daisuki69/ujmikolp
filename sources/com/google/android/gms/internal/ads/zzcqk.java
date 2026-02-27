package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcqk {
    private final zzcyt zza;

    @Nullable
    private final zzday zzb;

    public zzcqk(zzcyt zzcytVar, @Nullable zzday zzdayVar) {
        this.zza = zzcytVar;
        this.zzb = zzdayVar;
    }

    public final zzcyt zza() {
        return this.zza;
    }

    public final zzddr zzb() {
        zzday zzdayVar = this.zzb;
        return zzdayVar != null ? new zzddr(zzdayVar, zzbzh.zzg) : new zzddr(new zzcqj(this), zzbzh.zzg);
    }

    @Nullable
    public final zzday zzc() {
        return this.zzb;
    }
}
