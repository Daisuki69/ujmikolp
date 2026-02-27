package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdir {

    @Nullable
    private zzbft zza;

    public zzdir(zzdic zzdicVar) {
        this.zza = zzdicVar;
    }

    @Nullable
    public final synchronized zzbft zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbft zzbftVar) {
        this.zza = zzbftVar;
    }
}
