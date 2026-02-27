package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzchj implements zzhpx {
    private final zzhqg zza;

    private zzchj(zzcgx zzcgxVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzchj zzc(zzcgx zzcgxVar, zzhqg zzhqgVar) {
        return new zzchj(zzcgxVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        return zzfdy.zza(((zzchd) this.zza).zza()).zze();
    }
}
