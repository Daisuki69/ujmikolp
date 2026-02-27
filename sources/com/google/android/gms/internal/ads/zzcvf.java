package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvf implements zzhpx {
    private final zzcvb zza;

    private zzcvf(zzcvb zzcvbVar) {
        this.zza = zzcvbVar;
    }

    public static zzcvf zzc(zzcvb zzcvbVar) {
        return new zzcvf(zzcvbVar);
    }

    @Nullable
    public final zzcut zza() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zze();
    }
}
